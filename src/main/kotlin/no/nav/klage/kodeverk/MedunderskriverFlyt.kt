package no.nav.klage.kodeverk

import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

enum class MedunderskriverFlyt(override val id: String, override val navn: String, override val beskrivelse: String) :
    Kode {
    IKKE_SENDT("1", "IKKE_SENDT", "Ikke sendt til medunderskriver"),
    OVERSENDT_TIL_MEDUNDERSKRIVER("2", "OVERSENDT_TIL_MEDUNDERSKRIVER", "Oversendt til medunderskriver"),
    RETURNERT_TIL_SAKSBEHANDLER("3", "RETURNERT_TIL_SAKSBEHANDLER", "Returnert til saksbehandler")
    ;

    override fun toString(): String {
        return "Medunderskriverflyt(id=$id, " +
                "navn=$navn)"
    }

    companion object {
        fun of(id: String): MedunderskriverFlyt {
            return values().firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No Medunderskriverflyt with id $id exists")
        }

        fun fromNavn(navn: String?): MedunderskriverFlyt {
            return values().firstOrNull { it.navn == navn }
                ?: throw IllegalArgumentException("No Medunderskriverflyt with navn $navn exists")
        }
    }
}

@Converter
class MedunderskriverflytConverter : AttributeConverter<MedunderskriverFlyt, String?> {

    override fun convertToDatabaseColumn(entity: MedunderskriverFlyt?): String? =
        entity?.id

    override fun convertToEntityAttribute(id: String?): MedunderskriverFlyt? =
        id?.let { MedunderskriverFlyt.of(it) }
}
