package no.nav.klage.kodeverk

val infotrygdKlageutfallToUtfall = mapOf(
    "HENLAGT" to Utfall.TRUKKET,
    "IKKE_BEHANDLET" to Utfall.RETUR,
    "HJEMVIST_FOR_NY_BEHANDLING" to Utfall.OPPHEVET,
    "INNVILGET" to Utfall.MEDHOLD,
    "GODKJENNING" to Utfall.MEDHOLD,
    "IKKE_TILBAKEBETALING" to Utfall.MEDHOLD,
    "DELVIS_INNVILGET" to Utfall.DELVIS_MEDHOLD,
    "DELVIS_GODKJENNING" to Utfall.DELVIS_MEDHOLD,
    "DELVIS_TILBAKEBETALING" to Utfall.DELVIS_MEDHOLD,
    "AVSLAG" to Utfall.STADFESTELSE,
    "AVSLAG_GODKJENNING" to Utfall.STADFESTELSE,
    "TILBAKEBETALING" to Utfall.STADFESTELSE,
    "AVVIST_KLAGE" to Utfall.AVVIST,
)

val ankeutfallToInfotrygdutfall = mapOf(
    Utfall.TRUKKET to "HENLAGT",
    Utfall.OPPHEVET to "HJEMVIST_FOR_NY_BEHANDLING",
    Utfall.MEDHOLD to "INNVILGET",
    Utfall.DELVIS_MEDHOLD to "DELVIS_INNVILGET",
    Utfall.INNSTILLING_STADFESTELSE to "AVSLAG",
    Utfall.INNSTILLING_AVVIST to "AVSLAG",
)