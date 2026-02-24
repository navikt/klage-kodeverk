package no.nav.klage.kodeverk

enum class SattPaaVentReason(override val id: String, override val navn: String, override val beskrivelse: String) :
    Kode {
    OVERSENDELSESBREV_PAA_TILSVAR("1", "OVERSENDELSESBREV_PAA_TILSVAR", "Oversendelsesbrev på tilsvar"),
    VENTER_PAA_DOKUMENTASJON("2", "VENTER_PAA_DOKUMENTASJON", "Venter på dokumentasjon"),
    VENTER_PAA_AVKLARING_OM_DOEDSBO("3", "VENTER_PAA_AVKLARING_OM_DOEDSBO", "Venter på avklaring om dødsbo"),
    SATT_I_BERO("4", "SATT_I_BERO", "Satt i bero etter instruks"),
    ANNET("5", "ANNET", "Annet"),
    ANNET_TIL_FORELEGGELSE("6", "ANNET_TIL_FORELEGGELSE", "Annet til foreleggelse"),
    VENTER_PAA_UTFYLLENDE_KLAGE("7", "VENTER_PAA_UTFYLLENDE_KLAGE", "Venter på utfyllende klage"),
    VENTER_PAA_UTFYLLENDE_ANKE("8", "VENTER_PAA_UTFYLLENDE_ANKE", "Venter på utfyllende anke"),
    VENTER_PAA_AVGJOERELSE_OM_SOEKSMAAL_GJENOPPTAKSBEGJAERING(
        "9",
        "VENTER_PAA_AVGJOERELSE_OM_SOEKSMAAL_GJENOPPTAKSBEGJAERING",
        "Venter på avgjørelse om søksmål/gjenopptaksbegjæring"
    ),
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