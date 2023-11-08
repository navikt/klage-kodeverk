package no.nav.klage.kodeverk

import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

enum class Utfall(override val id: String, override val navn: String, override val beskrivelse: String) : Kode {
    TRUKKET("1", "Trukket", "Trukket"),
    RETUR("2", "Retur", "Retur"),
    OPPHEVET("3", "Opphevet", "Opphevet"),
    MEDHOLD("4", "Medhold", "Medhold"),
    DELVIS_MEDHOLD("5", "Delvis medhold", "Delvis medhold"),
    STADFESTELSE("6", "Stadfestet", "Stadfestet"),
    UGUNST("7", "Ugunst (Ugyldig)", "Ugunst (Ugyldig)"),
    AVVIST("8", "Avvist", "Avvist"),
    INNSTILLING_STADFESTELSE("9", "Innstilling: Stadfestet", "Innstilling: Stadfestet"),
    INNSTILLING_AVVIST("10", "Innstilling: Avvist", "Innstilling: Avvist"),
    HEVET("11", "Hevet", "Hevet"),
    HENVIST("12", "Henvist", "Henvist");


    override fun toString(): String {
        return "Utfall(id=$id, " +
                "navn=$navn)"
    }

    companion object {
        fun of(id: String): Utfall {
            return values().firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No Utfall with id $id exists")
        }
    }
}

@Converter
class UtfallConverter : AttributeConverter<Utfall, String?> {

    override fun convertToDatabaseColumn(entity: Utfall?): String? =
        entity?.id

    override fun convertToEntityAttribute(id: String?): Utfall? =
        id?.let { Utfall.of(it) }
}
