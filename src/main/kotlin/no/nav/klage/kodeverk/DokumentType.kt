package no.nav.klage.kodeverk

import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter


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
    KJENNELSE_FRA_TRYGDERETTEN("6", "Kjennelse fra Trygderetten", "Inngående kjennelse fra Trygderetten", "Kjennelse fra Trygderetten.pdf"),
    ANNEN_INNGAAENDE_POST("7", "Annen inngående post", "Annen inngående post", "Annen inngående post.pdf"),
    SVARBREV("8", "Svarbrev", "Svarbrev", "svarbrev.pdf"),
    ;

    override fun toString(): String {
        return "DokumentType(id=$id, " +
                "navn=$navn)"
    }

    companion object {
        fun of(id: String): DokumentType {
            return entries.firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No DokumentType with id $id exists")
        }

        fun fromNavn(navn: String): DokumentType {
            return entries.firstOrNull { it.navn == navn }
                ?: throw IllegalArgumentException("No DokumentType with navn $navn exists")
        }

        fun fromBeskrivelse(beskrivelse: String): DokumentType {
            return entries.firstOrNull { it.beskrivelse == beskrivelse }
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