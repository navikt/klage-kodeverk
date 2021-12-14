package no.nav.klage.kodeverk

val klageenhetTilYtelser: Map<Enhet, Set<Ytelse>> =
    klageenheter.map { enhet ->
        enhet to ytelseTilKlageenheter
        .filter { ytelse -> enhet.navn in ytelse.value.map { it.navn }}
        .map { it.key }
        .toSet()
    }.toMap()