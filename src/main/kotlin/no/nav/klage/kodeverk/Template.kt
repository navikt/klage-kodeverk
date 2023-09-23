package no.nav.klage.kodeverk

enum class Template(override val id: String, override val navn: String, override val beskrivelse: String) : Kode {

    NOTAT("notat", "notat", "Notat"),
    GENERELT_BREV("generelt_brev", "Generelt brev", "Generelt brev"),
    ANKEVEDTAK("ankevedtak", "ankevedtak", "Ankevedtak"),
    KLAGEVEDTAK("klagevedtak", "klagevedtak", "Klagevedtak"),
    ROL_QUESTIONS("rol-questions", "rol-questions", "ROL questions"),
    ROL_ANSWERS("rol-answers", "rol-answers", "ROL answers"),
    ;

    override fun toString(): String {
        return "Template(id=$id, " +
                "navn=$navn)"
    }

    companion object {
        fun of(id: String): Template {
            return entries.firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No Template with id $id exists")
        }

        fun fromNavn(navn: String): Template {
            return entries.firstOrNull { it.navn == navn }
                ?: throw IllegalArgumentException("No Template with navn $navn exists")
        }
    }
}