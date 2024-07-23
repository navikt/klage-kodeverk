package no.nav.klage.kodeverk

import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

enum class Source(override val id: String, override val navn: String, override val beskrivelse: String) : Kode {
    KAKA("1", "KAKA", "KAKA"),
    KABAL("2", "KABAL", "KABAL");

    companion object {
        fun of(id: String): Source {
            return entries.firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No Source with id $id exists")
        }
    }
}

@Converter
class SourceConverter : AttributeConverter<Source, String?> {

    override fun convertToDatabaseColumn(entity: Source?): String? =
        entity?.id

    override fun convertToEntityAttribute(id: String?): Source? =
        id?.let { Source.of(it) }
}