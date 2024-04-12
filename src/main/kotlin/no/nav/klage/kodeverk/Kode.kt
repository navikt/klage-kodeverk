package no.nav.klage.kodeverk

interface Kode {
    val id: String
    val navn: String
    val beskrivelse: String
}

interface MinimalCode{
    val id: String
    val nbName: String
}