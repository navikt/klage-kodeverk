package no.nav.klage.kodeverk

import com.fasterxml.jackson.annotation.JsonValue
import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

enum class Type(
    override val id: String,
    override val navn: String,
    override val beskrivelse: String,
) : Kode {
    KLAGE("1", "Klage", "Klage"),
    ANKE_FOER_2027("2", "Anke", "Anke"),
    ANKE_I_TRYGDERETTEN_FOER_2027("3", "Anke i Trygderetten", "Anke i Trygderetten"),
    BEHANDLING_ETTER_TRYGDERETTEN_OPPHEVET("4", "Behandling etter Trygderetten opphevet", "Behandling etter Trygderetten opphevet"),
    OMGJOERINGSKRAV("5", "Omgjøringskrav", "Omgjøringskrav"),
    BEGJAERING_OM_GJENOPPTAK("6", "Begjæring om gjenopptak", "Begjæring om gjenopptak"),
    BEGJAERING_OM_GJENOPPTAK_I_TRYGDERETTEN("7", "Begjæring om gjenopptak i Trygderetten", "Begjæring om gjenopptak i Trygderetten"),
    ANKE_ETTER_2027("8", "Anke etter 1.1.2027", "Anke etter 1.1.2027"),
    ANKE_I_TRYGDERETTEN_ETTER_2027("9", "Anke i Trygderetten etter 1.1.2027", "Anke i Trygderetten etter 1.1.2027"),
    ;

    override fun toString(): String =
        "Type(id=$id, " +
            "navn=$navn)"

    @JsonValue
    fun toJson(): String = name

    companion object {
        fun of(id: String): Type =
            entries.firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No Type with id $id exists")

        fun fromNavn(navn: String): Type =
            entries.firstOrNull { it.navn == navn }
                ?: throw IllegalArgumentException("No Type with navn $navn exists")
    }
}

@Converter
class TypeConverter : AttributeConverter<Type, String?> {
    override fun convertToDatabaseColumn(entity: Type?): String? = entity?.id

    override fun convertToEntityAttribute(id: String?): Type? = id?.let { Type.of(it) }
}
