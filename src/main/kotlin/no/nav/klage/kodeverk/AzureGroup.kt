package no.nav.klage.kodeverk

import com.fasterxml.jackson.annotation.JsonValue
import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

enum class AzureGroup(override val id: String, override val navn: String, override val reference: String) :
    CodeWithReference {
    KABAL_OPPGAVESTYRING_ALLE_ENHETER(
        "KABAL_OPPGAVESTYRING_ALLE_ENHETER",
        "Kabal Oppgavestyring Alle Enheter",
        "0000-GA-KLAGE-KABAL_OPPGAVESTYRING_ALLE_ENHETER"
    ),
    KABAL_MALTEKSTREDIGERING(
        "KABAL_MALTEKSTREDIGERING",
        "Kabal Maltekstredigering",
        "0000-GA-KLAGE-KABAL_MALTEKSTREDIGERING"
    ),
    KABAL_SAKSBEHANDLING("KABAL_SAKSBEHANDLING", "Kabal Saksbehandling", "0000-GA-KLAGE-KABAL_SAKSBEHANDLING"),
    KABAL_FAGTEKSTREDIGERING(
        "KABAL_FAGTEKSTREDIGERING",
        "Kabal Fagtekstredigering",
        "0000-GA-KLAGE-KABAL_FAGTEKSTREDIGERING"
    ),
    KABAL_INNSYN_EGEN_ENHET(
        "KABAL_INNSYN_EGEN_ENHET",
        "Kabal Innsyn Egen Enhet",
        "0000-GA-KLAGE-KABAL_INNSYN_EGEN_ENHET"
    ),
    KABAL_TILGANGSSTYRING_EGEN_ENHET(
        "KABAL_TILGANGSSTYRING_EGEN_ENHET",
        "Kabal Tilgangsstyring Egen Enhet",
        "0000-GA-KLAGE-KABAL_TILGANGSSTYRING_EGEN_ENHET"
    ),
    FORTROLIG("FORTROLIG", "Fortrolig", "0000-GA-Fortrolig_Adresse"),
    STRENGT_FORTROLIG("STRENGT_FORTROLIG", "Strengt fortrolig", "0000-GA-Strengt_Fortrolig_Adresse"),
    EGEN_ANSATT("EGEN_ANSATT", "Egen ansatt", "0000-GA-Egne_ansatte"),
    KABAL_ADMIN("KABAL_ADMIN", "Kabal Admin", "0000-GA-KLAGE-TEKNISK_ADMIN"),
    KABAL_ROL("KABAL_ROL", "Kabal ROL", "0000-GA-KLAGE-KABAL_ROL"),
    KABAL_KROL("KABAL_KROL", "Kabal KROL", "0000-GA-KLAGE-KABAL_KROL"),
    KABAL_SVARBREVINNSTILLINGER(
        "KABAL_SVARBREVINNSTILLINGER",
        "Kabal SvarbrevInnstillinger",
        "0000-GA-KLAGE-KABAL_SVARBREVINNSTILLINGER"
    ),
    ALLE_I_NAV_KLAGEINSTANS("ALLE_I_NAV_KLAGEINSTANS", "Alle i Nav klageinstans", "Alle i NAV Klageinstans"),

    KAKA_KVALITETSVURDERING(
        "KAKA_KVALITETSVURDERING",
        "Kaka Kvalitetsvurdering",
        "0000-GA-KLAGE-KAKA_KA_KVALITETSREGISTRERING"
    ),
    KAKA_KVALITETSTILBAKEMELDINGER(
        "KAKA_KVALITETSTILBAKEMELDINGER",
        "Kaka Kvalitetstilbakemeldinger",
        "0000-GA-KLAGE-KAKA_KVALITETSTILBAKEMELDING_FOR_LEDER_I_VEDTAKSIN"
    ),
    KAKA_TOTALSTATISTIKK("KAKA_TOTALSTATISTIKK", "Kaka Totalstatistikk", "0000-GA-KLAGE-KAKA_TOTALSTATISTIKK"),
    KAKA_LEDERSTATISTIKK(
        "KAKA_LEDERSTATISTIKK",
        "Kaka Lederstatistikk",
        "0000-GA-KLAGE-KAKA_KA_LEDERSTATISTIKK_MED_ANSATTFILTER"
    ),
    KAKA_EXCEL_UTTREKK_MED_FRITEKST(
        "KAKA_EXCEL_UTTREKK_MED_FRITEKST",
        "Kaka Excel-uttrekk med fritekst",
        "0000-GA-KLAGE-KAKA_EXCEL_UTTREKK_MED_FRITEKSTFELT"
    ),
    KAKA_EXCEL_UTTREKK_UTEN_FRITEKST(
        "KAKA_EXCEL_UTTREKK_UTEN_FRITEKST",
        "Kaka Excel-uttrekk uten fritekst",
        "0000-GA-KLAGE-KAKA_EXCEL_UTTREKK_UTEN_FRITEKSTFELT"
    );

    @JsonValue
    fun toJson(): String = name
    override fun toString(): String {
        return "AzureGroup(id='$id', navn='$navn', reference='$reference')"
    }

    companion object {
        fun of(id: String): AzureGroup {
            return entries.firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No AzureGroup with id $id exists")
        }

        fun fromNavn(navn: String): AzureGroup {
            return entries.firstOrNull { it.navn == navn }
                ?: throw IllegalArgumentException("No AzureGroup with navn $navn exists")
        }
    }
}

@Converter
class AzureGroupConverter : AttributeConverter<AzureGroup, String?> {

    override fun convertToDatabaseColumn(entity: AzureGroup?): String? =
        entity?.id

    override fun convertToEntityAttribute(id: String?): AzureGroup? =
        id?.let { AzureGroup.of(it) }
}