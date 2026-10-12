package no.nav.klage.kodeverk

enum class Sakstype(
    override val id: String,
    override val navn: String,
    override val beskrivelse: String,
) : Kode {
    FAGSAK("1", "FAGSAK", "Sak som hører til et system"),
    GENERELL_SAK("2", "GENERELL_SAK", "Hører ikke til et gitt system"),
    ARKIVSAK("3", "ARKIVSAK", "Ikke lenger i bruk"),
}
