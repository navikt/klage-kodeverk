package no.nav.klage.kodeverk

import no.nav.klage.kodeverk.Utfall.*

val typeToUtfall = mapOf(
    Type.KLAGE to setOf(
        TRUKKET,
        RETUR,
        OPPHEVET,
        MEDHOLD,
        DELVIS_MEDHOLD,
        STADFESTELSE,
        AVVIST,
        UGUNST,
    ),
    Type.ANKE to setOf(
        TRUKKET,
        OPPHEVET,
        MEDHOLD,
        DELVIS_MEDHOLD,
        INNSTILLING_STADFESTELSE,
        INNSTILLING_AVVIST,
    ),
    Type.ANKE_I_TRYGDERETTEN to setOf(
        OPPHEVET,
        MEDHOLD,
        DELVIS_MEDHOLD,
        STADFESTELSE,
        AVVIST,
        HEVET,
        HENVIST,
    ),
    Type.BEHANDLING_ETTER_TRYGDERETTEN_OPPHEVET to setOf(
        TRUKKET,
        RETUR,
        OPPHEVET,
        MEDHOLD,
        DELVIS_MEDHOLD,
        STADFESTELSE,
        AVVIST,
    ),
    Type.OMGJOERINGSKRAV to setOf(
        MEDHOLD_ETTER_FVL_35,
        BESLUTNING_IKKE_OMGJOERE,
        STADFESTET_ANNEN_BEGRUNNELSE,
    )
)
