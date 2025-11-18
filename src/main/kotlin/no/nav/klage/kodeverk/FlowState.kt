package no.nav.klage.kodeverk

import com.fasterxml.jackson.annotation.JsonValue
import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

enum class FlowState(override val id: String, override val navn: String, override val beskrivelse: String) :
    Kode {
    NOT_SENT("1", "IKKE_SENDT", "Ikke sendt"),
    SENT("2", "OVERSENDT", "Oversendt"),
    RETURNED("3", "RETURNERT_TIL_SAKSBEHANDLER", "Returnert til saksbehandler")
    ;

    override fun toString(): String {
        return "FlowState(id=$id, " +
                "navn=$navn)"
    }

    @JsonValue
    fun toJson(): String = name

    companion object {
        fun of(id: String): FlowState {
            return entries.firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No FlowState with id $id exists")
        }

        fun fromNavn(navn: String?): FlowState {
            return entries.firstOrNull { it.navn == navn }
                ?: throw IllegalArgumentException("No FlowState with navn $navn exists")
        }
    }
}

@Converter
class FlowStateConverter : AttributeConverter<FlowState, String?> {

    override fun convertToDatabaseColumn(entity: FlowState?): String? =
        entity?.id

    override fun convertToEntityAttribute(id: String?): FlowState? =
        id?.let { FlowState.of(it) }
}
