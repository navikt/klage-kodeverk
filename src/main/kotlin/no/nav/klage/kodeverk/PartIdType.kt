package no.nav.klage.kodeverk

import com.fasterxml.jackson.annotation.JsonValue
import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

enum class PartIdType(override val id: String, override val navn: String, override val beskrivelse: String) : Kode {
    PERSON("PERSON", "Person", "Person"),
    VIRKSOMHET("VIRKSOMHET", "Virksomhet", "Virksomhet");

    override fun toString(): String {
        return "PartIdType(id=$id, " +
                "navn=$navn)"
    }

    @JsonValue
    fun toJson(): String = name

    companion object {
        fun of(id: String): PartIdType {
            return entries.firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No PartIdType with id $id exists")
        }
    }
}

@Converter
class PartIdTypeConverter : AttributeConverter<PartIdType, String?> {

    override fun convertToDatabaseColumn(entity: PartIdType?): String? =
        entity?.id

    override fun convertToEntityAttribute(id: String?): PartIdType? =
        id?.let { PartIdType.of(it) }
}