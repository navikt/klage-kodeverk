package no.nav.klage.kodeverk

enum class FradelingReason(override val id: String, override val navn: String, override val beskrivelse: String) :
    Kode {
    FEIL_HJEMMEL("1", "FEIL_HJEMMEL", "Feil hjemmel"),
    MANGLER_KOMPETANSE("2", "MANGLER_KOMPETANSE", "Mangler kompetanse"),
    INHABIL("3", "INHABIL", "Inhabil"),
    LENGRE_FRAVAER("4", "LENGRE_FRAVAER", "Lengre fravær"),
    ANNET("5", "ANNET", "Annet"),
    LEDER("6", "LEDER", "Leder"),
    ;

    override fun toString(): String {
        return "FradelingReason(id=$id, " +
                "navn=$navn)"
    }

    companion object {
        fun of(id: String): FradelingReason {
            return entries.firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No FradelingReason with id $id exists")
        }

        fun fromNavn(navn: String?): FradelingReason {
            return entries.firstOrNull { it.navn == navn }
                ?: throw IllegalArgumentException("No FradelingReason with navn $navn exists")
        }
    }
}