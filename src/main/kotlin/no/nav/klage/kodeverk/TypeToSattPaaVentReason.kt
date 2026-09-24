package no.nav.klage.kodeverk

import no.nav.klage.kodeverk.SattPaaVentReason.*

val standardSet =
    setOf(
        VENTER_PAA_DOKUMENTASJON,
        VENTER_PAA_AVKLARING_OM_DOEDSBO,
        VENTER_PAA_OVERSETTELSE,
        VENTER_PAA_UTREDNING_AV_EOES_UTENLANDSFORHOLD,
        SATT_I_BERO,
        ANNET_TIL_FORELEGGELSE,
        ANNET,
    )

val trygderettenSet =
    setOf(
        SATT_I_BERO,
        VENTER_PAA_AVGJOERELSE_OM_SOEKSMAAL_GJENOPPTAKSBEGJAERING,
        VENTER_PAA_OVERSETTELSE,
        VENTER_PAA_UTREDNING_AV_EOES_UTENLANDSFORHOLD,
        ANNET,
        UTREDER_FOR_TRYGDERETTEN,
    )

val trygderettenEtter2027Set =
    setOf(
        SATT_I_BERO,
        VENTER_PAA_AVGJOERELSE_OM_SOEKSMAAL_GJENOPPTAKSBEGJAERING,
        ANNET,
        UTREDER_FOR_TRYGDERETTEN,
    )

val ankeEtter2027Set =
    setOf(
        BEDT_TRYGDERETTEN_OM_UTSATT_FRIST,
        VENTER_PAA_DOKUMENTASJON,
        ANNET_TIL_FORELEGGELSE,
        ANNET,
    )

val typeToSattPaaVentReason =
    mapOf(
        Type.KLAGE to standardSet.plus(VENTER_PAA_UTFYLLENDE_KLAGE),
        Type.ANKE_FOER_2027 to standardSet.plus(listOf(OVERSENDELSESBREV_PAA_TILSVAR, VENTER_PAA_UTFYLLENDE_ANKE)),
        Type.ANKE_I_TRYGDERETTEN_FOER_2027 to trygderettenSet,
        Type.BEHANDLING_ETTER_TRYGDERETTEN_OPPHEVET to standardSet,
        Type.OMGJOERINGSKRAV to standardSet,
        Type.BEGJAERING_OM_GJENOPPTAK to standardSet.plus(OVERSENDELSESBREV_PAA_TILSVAR),
        Type.BEGJAERING_OM_GJENOPPTAK_I_TRYGDERETTEN to trygderettenSet,
        Type.ANKE_ETTER_2027 to ankeEtter2027Set,
        Type.ANKE_I_TRYGDERETTEN_ETTER_2027 to trygderettenEtter2027Set,
    )
