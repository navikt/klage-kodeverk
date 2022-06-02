package no.nav.klage.kodeverk

import javax.persistence.AttributeConverter
import javax.persistence.Converter


enum class DokumentType(
    override val id: String,
    override val navn: String,
    override val beskrivelse: String,
    val defaultFilnavn: String
) : Kode {

    BREV("1", "Brev", "Brev fra Klageinstans", "brev.pdf"),
    NOTAT("2", "Notat", "Notat fra Klageinstans", "notat.pdf"),

    //VEDLEGG("3", "Vedlegg", "Vedlegg", "vedlegg.pdf"),
    VEDTAK("4", "Vedtak", "Vedtaksbrev fra Klageinstans", "vedtaksbrev.pdf"),
    BESLUTNING("5", "Beslutning", "Beslutningsbrev fra Klageinstans", "beslutningsbrev.pdf"),
    ;

    override fun toString(): String {
        return "DokumentType(id=$id, " +
                "navn=$navn)"
    }

    companion object {
        fun of(id: String): DokumentType {
            return DokumentType.values().firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No DokumentType with id $id exists")
        }

        fun fromNavn(navn: String): DokumentType {
            return DokumentType.values().firstOrNull { it.navn == navn }
                ?: throw IllegalArgumentException("No DokumentType with navn $navn exists")
        }

        fun fromBeskrivelse(beskrivelse: String): DokumentType {
            return DokumentType.values().firstOrNull { it.beskrivelse == beskrivelse }
                ?: throw IllegalArgumentException("No DokumentType with beskrivelse $beskrivelse exists")
        }
    }
}


@Converter
class DokumentTypeConverter : AttributeConverter<DokumentType, String?> {

    override fun convertToDatabaseColumn(entity: DokumentType?): String? =
        entity?.id

    override fun convertToEntityAttribute(id: String?): DokumentType? =
        id?.let { DokumentType.of(it) }
}