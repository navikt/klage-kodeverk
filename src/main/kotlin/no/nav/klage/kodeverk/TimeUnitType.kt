package no.nav.klage.kodeverk

import com.fasterxml.jackson.annotation.JsonValue
import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

enum class TimeUnitType(override val id: String, override val navn: String, override val beskrivelse: String) : Kode {

    WEEKS("1", "WEEKS", "WEEKS"),
    MONTHS("2", "MONTHS", "MONTHS"),
    ;

    override fun toString(): String {
        return "Type(id=$id, " +
                "navn=$navn)"
    }

    @JsonValue
    fun toJson(): String = name

    companion object {
        fun of(id: String): TimeUnitType {
            return entries.firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No TimeUnitType with id $id exists")
        }

        fun fromNavn(navn: String): TimeUnitType {
            return entries.firstOrNull { it.navn == navn }
                ?: throw IllegalArgumentException("No TimeUnitType with navn $navn exists")
        }
    }
}

@Converter
class TimeUnitTypeConverter : AttributeConverter<TimeUnitType, String?> {

    override fun convertToDatabaseColumn(entity: TimeUnitType?): String? =
        entity?.id

    override fun convertToEntityAttribute(id: String?): TimeUnitType? =
        id?.let { TimeUnitType.of(it) }
}