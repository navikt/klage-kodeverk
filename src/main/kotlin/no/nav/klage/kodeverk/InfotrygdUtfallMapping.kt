package no.nav.klage.kodeverk

val infotrygdKlageutfallToUtfall = mapOf(
    "H" to Utfall.TRUKKET,
    "IB" to Utfall.RETUR,
    "NB" to Utfall.OPPHEVET,
    "I" to Utfall.MEDHOLD,
    "DI" to Utfall.DELVIS_MEDHOLD,
    "A" to Utfall.STADFESTELSE,
    "AK" to Utfall.AVVIST,
)

val ankeutfallToInfotrygdutfall = mapOf(
    Utfall.TRUKKET to "H",
    Utfall.OPPHEVET to "NB",
    Utfall.MEDHOLD to "I",
    Utfall.DELVIS_MEDHOLD to "DI",
    Utfall.INNSTILLING_STADFESTELSE to "A",
    Utfall.INNSTILLING_AVVIST to "A",
)