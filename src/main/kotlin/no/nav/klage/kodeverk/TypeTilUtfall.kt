package no.nav.klage.kodeverk

import no.nav.klage.kodeverk.Utfall.*

val typeTilUtfall = mapOf(
    Type.KLAGE to setOf(
        TRUKKET,
        RETUR,
        OPPHEVET,
        MEDHOLD,
        DELVIS_MEDHOLD,
        STADFESTELSE,
        UGUNST,
        AVVIST,
    ),
    Type.ANKE to setOf(
        TRUKKET,
        RETUR,
        OPPHEVET,
        MEDHOLD,
        DELVIS_MEDHOLD,
        STADFESTELSE,
        UGUNST,
        AVVIST,
    )
)