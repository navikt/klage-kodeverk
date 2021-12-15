package no.nav.klage.kodeverk

import no.nav.klage.kodeverk.hjemmel.Registreringshjemmel
import no.nav.klage.kodeverk.hjemmel.ytelseTilRegistreringshjemler

val ytelseToLovKildeToRegistreringshjemmel: Map<Ytelse, List<LovKildeToRegistreringshjemler>> =
    ytelseTilRegistreringshjemler.mapValues { (_, hjemler) ->
        hjemler.groupBy(
            { hjemmel -> hjemmel.lovKilde },
            { hjemmel -> HjemmelDto(hjemmel.id, hjemmel.spesifikasjon) }
        ).map { hjemmel ->
            LovKildeToRegistreringshjemler(
                hjemmel.key.toDto(),
                hjemmel.value
            )
        }
    }

val registreringshjemler: List<KodeDto> =
    Registreringshjemmel.values().map {
        KodeDto(
            id = it.id,
            navn = it.lovKilde.beskrivelse + " - " + it.spesifikasjon,
            beskrivelse = it.lovKilde.navn + " - " + it.spesifikasjon,
        )
    }

val ytelserEnriched: List<YtelseKode> =
    Ytelse.values().map { ytelse ->
        YtelseKode(
            id = ytelse.id,
            navn = ytelse.navn,
            beskrivelse = ytelse.beskrivelse,
            lovKildeToRegistreringshjemler = ytelseToLovKildeToRegistreringshjemmel[ytelse] ?: emptyList(),
            enheter = ytelseTilVedtaksenheter[ytelse]?.map { it.toDto() } ?: emptyList(),
            klageenheter = ytelseTilKlageenheter[ytelse]?.map { it.toDto() } ?: emptyList(),
        )
    }

data class YtelseKode(
    val id: String,
    val navn: String,
    val beskrivelse: String,
    val lovKildeToRegistreringshjemler: List<LovKildeToRegistreringshjemler>,
    val enheter: List<KodeDto>,
    val klageenheter: List<KodeDto>,
)

fun Kode.toDto() = KodeDto(id, navn, beskrivelse)

data class LovKildeToRegistreringshjemler(val lovkilde: KodeDto, val registreringshjemler: List<HjemmelDto>)

data class HjemmelDto(val id: String, val navn: String)

data class KodeDto(val id: String, val navn: String, val beskrivelse: String)