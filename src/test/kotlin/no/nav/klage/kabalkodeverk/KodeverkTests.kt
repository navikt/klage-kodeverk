package no.nav.klage.kabalkodeverk

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KodeverkTests {
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