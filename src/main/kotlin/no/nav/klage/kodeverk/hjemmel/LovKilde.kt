package no.nav.klage.kodeverk.hjemmel

enum class LovKilde(
    val navn: String,
    val kortform: String
) {
    FOLKETRYGDLOVEN("Folketrygdloven", "Ftrl"),
    FORSKRIFT_OM_AKTIVITETSHJELPEMIDLER_TIL_DE_OVER_26_ÅR("Forskrift om aktivitetshjelpemidler til de over 26 år","Forskrift om aktivitetshjelpemidler til de over 26 år"),
    FORSKRIFT_OM_HJELPEMIDLER_MM("Forskrift om hjelpemidler mm.", "Forskrift om hjelpemidler mm."),
    FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM("Forskrift om ortopediske hjelpemidler mm.", "Forskrift om ortopediske hjelpemidler mm."),
    FORSKRIFT_OM_HØREAPPARATER_MM("Forskrift om høreapparater mm.", "Forskrift om høreapparater mm."),
    FORSKRIFT_OM_SERVICEHUND("Forskrift om servicehund", "Forskrift om servicehund"),
    FORSKRIFT_OM_MOTORKJØRETØY("Forskrift om motorkjøretøy", "Forskrift om motorkjøretøy"),
    FORVALTNINGSLOVEN("Forvaltningsloven", "Fvl"),
    TRYGDERETTSLOVEN("Trygderettsloven", "Trrl"),

    UKJENT("Ukjent", "Ukjent")
}