package no.nav.klage.kodeverk

import javax.persistence.AttributeConverter
import javax.persistence.Converter

enum class Type(override val id: String, override val navn: String, override val beskrivelse: String) : Kode {

    KLAGE("1", "Klage", "Klage"),
    ANKE("2", "Anke", "Anke"),
    ANKE_I_TRYGDERETTEN("3", "Anke i trygderetten", "Anke i trygderetten"),
    ;

    override fun toString(): String {
        return "Type(id=$id, " +
                "navn=$navn)"
    }

    companion object {
        fun of(id: String): Type {
            return values().firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No Type with id $id exists")
        }

        fun fromNavn(navn: String): Type {
            return values().firstOrNull { it.navn == navn }
                ?: throw IllegalArgumentException("No Type with navn $navn exists")
        }
    }
}

@Converter
class TypeConverter : AttributeConverter<Type, String?> {

    override fun convertToDatabaseColumn(entity: Type?): String? =
        entity?.id

    override fun convertToEntityAttribute(id: String?): Type? =
        id?.let { Type.of(it) }
}