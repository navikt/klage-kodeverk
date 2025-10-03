package no.nav.klage.kodeverk

import no.nav.klage.kodeverk.SattPaaVentReason.*

val standardSet = setOf(
    VENTER_PAA_DOKUMENTASJON,
    VENTER_PAA_AVKLARING_OM_DOEDSBO,
    SATT_I_BERO,
    ANNET_TIL_FORELEGGELSE,
    ANNET,
)

val ankeAndGjenopptaksSet = setOf(
    OVERSENDELSESBREV_PAA_TILSVAR,
    VENTER_PAA_DOKUMENTASJON,
    VENTER_PAA_AVKLARING_OM_DOEDSBO,
    SATT_I_BERO,
    ANNET_TIL_FORELEGGELSE,
    ANNET,
)

val typeToSattPaaVentReason = mapOf(
    Type.KLAGE to standardSet,
    Type.ANKE to ankeAndGjenopptaksSet,
    Type.ANKE_I_TRYGDERETTEN to standardSet,
    Type.BEHANDLING_ETTER_TRYGDERETTEN_OPPHEVET to standardSet,
    Type.OMGJOERINGSKRAV to standardSet,
    Type.BEGJAERING_OM_GJENOPPTAK to ankeAndGjenopptaksSet,
    Type.BEGJAERING_OM_GJENOPPTAK_I_TRYGDERETTEN to standardSet,
)
