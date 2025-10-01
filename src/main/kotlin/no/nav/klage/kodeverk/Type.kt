package no.nav.klage.kodeverk

import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

enum class Type(override val id: String, override val navn: String, override val beskrivelse: String) : Kode {

    KLAGE("1", "Klage", "Klage"),
    ANKE("2", "Anke", "Anke"),
    ANKE_I_TRYGDERETTEN("3", "Anke i Trygderetten", "Anke i Trygderetten"),
    BEHANDLING_ETTER_TRYGDERETTEN_OPPHEVET("4", "Behandling etter Trygderetten opphevet", "Behandling etter Trygderetten opphevet"),
    OMGJOERINGSKRAV("5", "Omgjøringskrav", "Omgjøringskrav"),
    BEGJAERING_OM_GJENOPPTAK("6", "Begjæring om gjenopptak", "Begjæring om gjenopptak"),
    BEGJAERING_OM_GJENOPPTAK_I_TRYGDERETTEN("7", "Begjæring om gjenopptak i Trygderetten", "Begjæring om gjenopptak i Trygderetten"),
    ;

    override fun toString(): String {
        return "Type(id=$id, " +
                "navn=$navn)"
    }

    companion object {
        fun of(id: String): Type {
            return entries.firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No Type with id $id exists")
        }

        fun fromNavn(navn: String): Type {
            return entries.firstOrNull { it.navn == navn }
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