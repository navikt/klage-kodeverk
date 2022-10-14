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
        INNSTILLING_STADFESTELSE,
        UGUNST,
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
)

//Testing rules for pushing to main