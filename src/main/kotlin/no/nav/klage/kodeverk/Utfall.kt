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
    HENVIST("12", "Henvist", "Henvist"),
    MEDHOLD_ETTER_FVL_35("13", "Medhold etter forvaltningsloven § 35", "Medhold etter forvaltningsloven § 35"),
    BESLUTNING_IKKE_OMGJOERE("14", "Beslutning om ikke å omgjøre", "Beslutning om ikke å omgjøre"),
    STADFESTET_ANNEN_BEGRUNNELSE("15", "Stadfestet med en annen begrunnelse", "Stadfestet med en annen begrunnelse"),
    INNSTILLING_BEGJAERING_TAS_TIL_FOELGE_VEDTAK_OPPHEVES("16", "Innstilling: Begjæringen tas til følge - KAs vedtak oppheves", "Innstilling: Begjæringen tas til følge - KAs vedtak oppheves"),
    INNSTILLING_BEGJAERING_TAS_TIL_FOELGE_VEDTAK_STADFESTES("17", "Innstilling: Begjæringen tas til følge - KAs vedtak stadfestes", "Innstilling: Begjæringen tas til følge - KAs vedtak stadfestes"),
    INNSTILLING_BEGJAERING_TAS_IKKE_TIL_FOELGE("18", "Innstilling: Begjæringen tas ikke til følge", "Innstilling: Begjæringen tas ikke til følge"),
    BEGJAERING_TAS_IKKE_TIL_FOELGE("19", "Begjæringen tas ikke til følge", "Begjæringen tas ikke til følge"),
    BEGJAERING_AVVISES("20", "Begjæringen avvises", "Begjæringen avvises"),
    BEGJAERING_TAS_TIL_FOELGE_VEDTAK_OPPHEVES("21", "Begjæringen tas til følge - KAs vedtak oppheves", "Begjæringen tas til følge - KAs vedtak oppheves"),
    BEGJAERING_TAS_TIL_FOELGE_VEDTAK_STADFESTES("22", "Begjæringen tas til følge - KAs vedtak stadfestes", "Begjæringen tas til følge - KAs vedtak stadfestes"),
    BEGJAERING_TAS_TIL_FOELGE_DELVIS_ELLER_FULLT_MEDHOLD("23", "Begjæringen tas til følge - Delvis eller fullt medhold", "Begjæringen tas til følge - Delvis eller fullt medhold"),
    ;


    override fun toString(): String {
        return "Utfall(id=$id, " +
                "navn=$navn)"
    }

    companion object {
        fun of(id: String): Utfall {
            return entries.firstOrNull { it.id == id }
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
