package no.nav.klage.kodeverk

import no.nav.klage.kodeverk.SattPaaVentReason.*

val standardSet = setOf(
    VENTER_PAA_DOKUMENTASJON,
    VENTER_PAA_AVKLARING_OM_DOEDSBO,
    SATT_I_BERO,
    ANNET_TIL_FORELEGGELSE,
    ANNET,
)

val typeToSattPaaVentReason = mapOf(
    Type.KLAGE to standardSet.plus(VENTER_PAA_UTFYLLENDE_KLAGE),
    Type.ANKE to standardSet.plus(listOf(OVERSENDELSESBREV_PAA_TILSVAR, VENTER_PAA_UTFYLLENDE_ANKE)),
    Type.ANKE_I_TRYGDERETTEN to standardSet,
    Type.BEHANDLING_ETTER_TRYGDERETTEN_OPPHEVET to standardSet,
    Type.OMGJOERINGSKRAV to standardSet,
    Type.BEGJAERING_OM_GJENOPPTAK to standardSet.plus(OVERSENDELSESBREV_PAA_TILSVAR),
    Type.BEGJAERING_OM_GJENOPPTAK_I_TRYGDERETTEN to standardSet,
)
