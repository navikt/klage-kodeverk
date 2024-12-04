package no.nav.klage.kodeverk

import no.nav.klage.kodeverk.ytelse.Ytelse
import no.nav.klage.kodeverk.ytelse.ytelseToKlageenheter

val klageenhetToYtelser: Map<Enhet, Set<Ytelse>> =
    klageenheter.map { enhet ->
        enhet to ytelseToKlageenheter
        .filter { ytelse -> enhet.navn in ytelse.value.map { it.navn }}
        .map { it.key }
        .toSet()
    }.toMap()