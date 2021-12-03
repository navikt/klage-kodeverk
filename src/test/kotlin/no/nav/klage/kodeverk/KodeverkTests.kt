package no.nav.klage.kodeverk

import no.nav.klage.kodeverk.hjemmel.Hjemmel
import no.nav.klage.kodeverk.hjemmel.LovKilde
import no.nav.klage.kodeverk.hjemmel.RegistreringsHjemmel
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KodeverkTests {

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
    fun `RegistreringsHjemmel has no duplicate values`() {
        assertThat(RegistreringsHjemmel.values().groupBy {
            it.id
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

        assertThat(Hjemmel.values().groupBy {
            it.navn
        }.filter {
            it.value.size > 1
        }).isEmpty()

        assertThat(Hjemmel.values().groupBy {
            it.beskrivelse
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
}