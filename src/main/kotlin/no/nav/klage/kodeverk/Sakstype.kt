package no.nav.klage.kodeverk

import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

enum class Sakstype(
    override val id: String,
    override val navn: String,
    override val beskrivelse: String,
) : Kode {
    FAGSAK("1", "FAGSAK", "Sak som hører til et system"),
    GENERELL_SAK("2", "GENERELL_SAK", "Hører ikke til et gitt system"),
    ARKIVSAK("3", "ARKIVSAK", "Ikke lenger i bruk"),
    ;

    companion object {
        fun of(id: String): Sakstype =
            entries.firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No Sakstype with id $id exists")

        fun fromNavn(navn: String): Sakstype =
            entries.firstOrNull { it.navn == navn }
                ?: throw IllegalArgumentException("No Sakstype with navn $navn exists")
    }
}

@Converter
class SakstypeConverter : AttributeConverter<Sakstype, String?> {
    override fun convertToDatabaseColumn(entity: Sakstype?): String? = entity?.id

    override fun convertToEntityAttribute(id: String?): Sakstype? = id?.let { Sakstype.of(it) }
}
