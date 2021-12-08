package no.nav.klage.kodeverk.hjemmel

import no.nav.klage.kodeverk.Kode

enum class LovKilde(override val id: String, override val navn: String, override val beskrivelse: String) : Kode {
    FOLKETRYGDLOVEN("1","Folketrygdloven", "Ftrl"),
    FORSKRIFT_OM_AKTIVITETSHJELPEMIDLER_TIL_DE_OVER_26_ÅR("2","Forskrift om aktivitetshjelpemidler til de over 26 år","Forskrift om aktivitetshjelpemidler til de over 26 år"),
    FORSKRIFT_OM_HJELPEMIDLER_MM("3", "Forskrift om hjelpemidler mm.", "Forskrift om hjelpemidler mm."),
    FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM("4", "Forskrift om ortopediske hjelpemidler mm.", "Forskrift om ortopediske hjelpemidler mm."),
    FORSKRIFT_OM_HØREAPPARATER_MM("5","Forskrift om høreapparater mm.", "Forskrift om høreapparater mm."),
    FORSKRIFT_OM_SERVICEHUND("6","Forskrift om servicehund", "Forskrift om servicehund"),
    FORSKRIFT_OM_MOTORKJØRETØY("7","Forskrift om motorkjøretøy", "Forskrift om motorkjøretøy"),
    FORVALTNINGSLOVEN("8","Forvaltningsloven", "Fvl"),
    TRYGDERETTSLOVEN("9","Trygderettsloven", "Trrl"),
    FORELDELSESLOVEN("10","Foreldelsesloven", "Fl"),
    EØS_FORORDNING_883_2004("11", "EØS forordning 883/2004", "EØS forordning 883/2004"),

    UKJENT("999","Ukjent", "Ukjent")
}