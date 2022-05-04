package no.nav.klage.kodeverk


import javax.persistence.AttributeConverter
import javax.persistence.Converter

enum class Brevmottakertype(override val id: String, override val navn: String, override val beskrivelse: String) :
    Kode {
    KLAGER("1", "Klager", "Klager"),
    SAKEN_GJELDER("2", "Saken gjelder", "Saken gjelder"),
    PROSESSFULLMEKTIG("3", "Prosessfullmektig", "Prosessfullmektig")
    ;

    override fun toString(): String {
        return "Brevmottakertype(id=$id, " +
                "navn=$navn)"
    }

    companion object {
        fun of(id: String): Brevmottakertype {
            return values().firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No Bremottakertype with $id exists")
        }

        fun fromNavn(navn: String): Brevmottakertype {
            return values().firstOrNull { it.navn == navn }
                ?: throw IllegalArgumentException("No Bremottakertype with $navn exists")
        }
    }
}

@Converter
class BrevmottakertypeConverter : AttributeConverter<Brevmottakertype, String?> {

    override fun convertToDatabaseColumn(entity: Brevmottakertype?): String? =
        entity?.id

    override fun convertToEntityAttribute(id: String?): Brevmottakertype? =
        id?.let { Brevmottakertype.of(it) }
}