package no.nav.klage.kodeverk

enum class SattPaaVentReason(override val id: String, override val navn: String, override val beskrivelse: String) :
    Kode {
    VENTER_PAA_TILSVAR("1", "VENTER_PAA_TILSVAR", "Venter på tilsvar"),
    VENTER_PAA_DOKUMENTASJON("2", "VENTER_PAA_DOKUMENTASJON", "Venter på dokumentasjon"),
    VENTER_PAA_AVKLARING_OM_DOEDSBO("3", "VENTER_PAA_AVKLARING_OM_DOEDSBO", "Venter på avklaring om dødsbo"),
    SATT_I_BERO("4", "SATT_I_BERO", "Satt i bero"),
    ANNET("9", "ANNET", "Annet"),
    ;


    companion object {
        fun of(id: String): SattPaaVentReason {
            return entries.firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No SattPaaVentReason with id $id exists")
        }

        fun fromNavn(navn: String?): SattPaaVentReason {
            return entries.firstOrNull { it.navn == navn }
                ?: throw IllegalArgumentException("No SattPaaVentReason with navn $navn exists")
        }
    }
}