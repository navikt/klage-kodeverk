package no.nav.klage.kodeverk

import no.nav.klage.kodeverk.hjemmel.Hjemmel
import no.nav.klage.kodeverk.hjemmel.LovKilde
import no.nav.klage.kodeverk.hjemmel.Registreringshjemmel
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KodeverkTest {

    @Test
    fun `LovKilde has no duplicate values`() {
        assertThat(Fagsystem.values().groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Fagsystem.values().groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `Registreringshjemmel has no duplicate values`() {
        assertThat(Registreringshjemmel.values().groupBy {
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

        assertThat(Registreringshjemmel.values().groupBy {
            it.toKey()
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `Fagsystem has no duplicate values`() {
        assertThat(Fagsystem.values().groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Fagsystem.values().groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Fagsystem.values().groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `Hjemmel has no duplicate values`() {
        assertThat(Hjemmel.values().groupBy {
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

        assertThat(Hjemmel.values().groupBy {
            it.toKey()
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `MedunderskriverFlyt has no duplicate values`() {
        assertThat(MedunderskriverFlyt.values().groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(MedunderskriverFlyt.values().groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(MedunderskriverFlyt.values().groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `PartIdType has no duplicate values`() {
        assertThat(PartIdType.values().groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(PartIdType.values().groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(PartIdType.values().groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `Tema has no duplicate values`() {
        assertThat(Tema.values().groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Tema.values().groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Tema.values().groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `Type has no duplicate values`() {
        assertThat(Type.values().groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Type.values().groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Type.values().groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `Utfall has no duplicate values`() {
        assertThat(Utfall.values().groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Utfall.values().groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Utfall.values().groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `Ytelse has no duplicate values`() {
        assertThat(Ytelse.values().groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Ytelse.values().groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Ytelse.values().groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `Enhet has no duplicate values`() {
        assertThat(Enhet.values().groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Enhet.values().groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }

    @Test
    fun `DokumentType has no duplicate values`() {
        assertThat(DokumentType.values().groupBy {
            it.id
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(DokumentType.values().groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(DokumentType.values().groupBy {
            it.beskrivelse
        }.filter {
            it.value.size > 1
        }).isEmpty()
    }
}