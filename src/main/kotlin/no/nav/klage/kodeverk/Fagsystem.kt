package no.nav.klage.kodeverk

import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

enum class Fagsystem(
    override val id: String,
    override val navn: String,
    override val beskrivelse: String,
    val modernized: Boolean,
) : Kode {
    FS36("1", "FS36", "Vedtaksløsning Foreldrepenger", true),
    //MERK: FS39 er ikke lenger i bruk, og kan anses som utgått.
    FS39("2", "FS39", "Saksbehandling for Folketrygdloven kapittel 9", false),
    AO01("3", "AO01", "Arena", false),
    AO11("4", "AO11", "Grisen", false),
    BISYS("5", "BISYS", "BISYS", false),
    FS38("6", "FS38", "Melosys", false),
    IT01("7", "IT01", "Infotrygd", false),
    K9("8", "K9", "Sykdom i familien", true),
    OB36("9", "OB36", "Utbetalingsmelding", false),
    OEBS("10", "OEBS", "OEBS", false),
    PP01("11", "PP01", "Pesys", true),
    UFM("12", "UFM", "Unntak fra medlemskap", false),
    BA("13", "BA", "Barnetrygd", false),
    EF("14", "EF", "Enslig forsørger", true),
    KONT("15", "KONT", "Kontantstøtte", false),
    SUPSTONAD("16", "SUPSTONAD", "Supplerende Stønad", true),
    OMSORGSPENGER("17", "OMSORGSPENGER", "Omsorgspenger", false),
    NEESSI("24", "NEESSI", "NEESSI", false),

    //Ikke i bruk i Dokarkiv.
    MANUELL("18", "MANUELL", "Manuell registrering av kvalitetsskjema", false),
    FS22("19", "FS22", "GOSYS", false),
    HJELPEMIDLER("20", "HJELPEMIDLER", "Hjelpemidler", false),
    BARNEBRILLER("21", "BARNEBRILLER", "Barnebriller", false),
    EY("22", "EY", "Etterlatteytelser", true),
    KABAL("23", "KABAL", "Kabal", true),
    TILLEGGSSTONADER("25", "TILLEGGSSTONADER", "Tilleggsstønader", true);

    companion object {
        fun of(id: String): Fagsystem {
            return values().firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No Fagsystem with id $id exists")
        }

        fun fromNavn(navn: String): Fagsystem {
            return values().firstOrNull { it.navn == navn }
                ?: throw IllegalArgumentException("No Fagsystem with navn $navn exists")
        }
    }
}

@Converter
class FagsystemConverter : AttributeConverter<Fagsystem, String?> {

    override fun convertToDatabaseColumn(entity: Fagsystem?): String? =
        entity?.id

    override fun convertToEntityAttribute(id: String?): Fagsystem? =
        id?.let { Fagsystem.of(it) }
}