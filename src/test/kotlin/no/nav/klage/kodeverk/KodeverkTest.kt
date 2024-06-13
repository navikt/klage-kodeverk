package no.nav.klage.kodeverk

import no.nav.klage.kodeverk.hjemmel.Hjemmel
import no.nav.klage.kodeverk.hjemmel.LovKilde
import no.nav.klage.kodeverk.hjemmel.Registreringshjemmel
import no.nav.klage.kodeverk.hjemmel.ytelseTilHjemler
import no.nav.klage.kodeverk.innsendingsytelse.Innsendingsytelse
import no.nav.klage.kodeverk.innsendingsytelse.innsendingsytelseToAnkeEnhet
import no.nav.klage.kodeverk.innsendingsytelse.innsendingsytelseToDisplayName
import no.nav.klage.kodeverk.innsendingsytelse.innsendingsytelseToTema
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KodeverkTest {

    @Test
    fun `Innsendingsytelse has no duplicate values`() {
        assertThat(Innsendingsytelse.entries.groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `InnsendingsytelseToDisplayName contains all Innsendingsytelser`() {
        assertThat(innsendingsytelseToDisplayName.keys).containsAll(Innsendingsytelse.entries)
    }

    @Test
    fun `InnsendingsytelseToTema contains all Innsendingsytelser`() {
        assertThat(innsendingsytelseToTema.keys).containsAll(Innsendingsytelse.entries)
    }

    @Test
    fun `InnsendingsytelseToAnkeEnhet contains all Innsendingsytelser`() {
        assertThat(innsendingsytelseToAnkeEnhet.keys).containsAll(Innsendingsytelse.entries)
    }

    @Test
    fun `LovKilde has no duplicate values`() {
        assertThat(LovKilde.entries.groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(LovKilde.entries.groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(LovKilde.entries.groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `Registreringshjemmel has no duplicate values`() {
        assertThat(Registreringshjemmel.entries.groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        data class Key(val lovKilde: LovKilde, val spesifikasjon: String)

        fun Registreringshjemmel.toKey() =
            Key(
                this.lovKilde,
                this.spesifikasjon
            )

        assertThat(Registreringshjemmel.entries.groupBy {
            it.toKey()
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `Fagsystem has no duplicate values`() {
        assertThat(Fagsystem.entries.groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Fagsystem.entries.groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Fagsystem.entries.groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `Hjemmel has no duplicate values`() {
        assertThat(Hjemmel.entries.groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        data class Key(val lovKilde: LovKilde, val spesifikasjon: String)

        fun Hjemmel.toKey() =
            Key(
                this.lovKilde,
                this.spesifikasjon
            )

        assertThat(Hjemmel.entries.groupBy {
            it.toKey()
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `MedunderskriverFlyt has no duplicate values`() {
        assertThat(MedunderskriverFlyt.entries.groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(MedunderskriverFlyt.entries.groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(MedunderskriverFlyt.entries.groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `PartIdType has no duplicate values`() {
        assertThat(PartIdType.entries.groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(PartIdType.entries.groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(PartIdType.entries.groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `Tema has no duplicate values`() {
        assertThat(Tema.entries.groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Tema.entries.groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Tema.entries.groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `Type has no duplicate values`() {
        assertThat(Type.entries.groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Type.entries.groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Type.entries.groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `Utfall has no duplicate values`() {
        assertThat(Utfall.entries.groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Utfall.entries.groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Utfall.entries.groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `Ytelse has no duplicate values`() {
        assertThat(Ytelse.entries.groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Ytelse.entries.groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Ytelse.entries.groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `Enhet has no duplicate values`() {
        assertThat(Enhet.entries.groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Enhet.entries.groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `DokumentType has no duplicate values`() {
        assertThat(DokumentType.entries.groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(DokumentType.entries.groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(DokumentType.entries.groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Disabled
    @Test
    fun `Print id and spesifikasjon from YtelseTilHjemler`() {
        for (ytelse in Ytelse.entries) {
            if (ytelseTilHjemler[ytelse] != null) {
                println(ytelse.name)
                ytelseTilHjemler[ytelse]!!.forEach {
                    println("${it.id},${it.spesifikasjon}")
                }
            }
        }
    }
}