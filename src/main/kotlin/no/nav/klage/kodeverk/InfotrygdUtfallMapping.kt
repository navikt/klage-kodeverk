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
    "HENLAGT_BORTFALT" to Utfall.HEVET,
)

val ankeutfallToInfotrygdutfall = mapOf(
    Utfall.TRUKKET to "HENLAGT",
    Utfall.OPPHEVET to "HJEMVIST_FOR_NY_BEHANDLING",
    Utfall.MEDHOLD to "INNVILGET",
    Utfall.DELVIS_MEDHOLD to "DELVIS_INNVILGET",
    Utfall.INNSTILLING_STADFESTELSE to "AVSLAG",
    Utfall.INNSTILLING_AVVIST to "AVSLAG",
)

val klageutfallToInfotrygdutfall = mapOf(
    Utfall.TRUKKET to "HENLAGT",
    Utfall.OPPHEVET to "HJEMVIST_FOR_NY_BEHANDLING",
    Utfall.MEDHOLD to "INNVILGET",
    Utfall.DELVIS_MEDHOLD to "DELVIS_INNVILGET",
    Utfall.STADFESTELSE to "AVSLAG",
    Utfall.AVVIST to "AVSLAG",
    Utfall.RETUR to "IKKE_BEHANDLET",
    Utfall.HEVET to "HENLAGT_BORTFALT",
    Utfall.UGUNST to "AVSLAG",
)

val klageTilbakebetalingutfallToInfotrygdutfall = mapOf(
    Utfall.TRUKKET to "HENLAGT",
    Utfall.OPPHEVET to "HJEMVIST_FOR_NY_BEHANDLING",
    Utfall.MEDHOLD to "IKKE_TILBAKEBETALING",
    Utfall.DELVIS_MEDHOLD to "DELVIS_TILBAKEBETALING",
    Utfall.STADFESTELSE to "TILBAKEBETALING",
    Utfall.AVVIST to "AVVIST_KLAGE",
    Utfall.RETUR to "IKKE_BEHANDLET",
)