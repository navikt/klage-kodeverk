package no.nav.klage.kodeverk

import com.fasterxml.jackson.annotation.JsonValue

enum class ROLState(override val id: String, override val navn: String, override val beskrivelse: String) :
    Kode {
    OVERSENDT_TIL_ROL("1", "ROL", "Oversendt til ROL"),
    RETURNERT_TIL_SAKSBEHANDLER("2", "RETURNERT_TIL_SAKSBEHANDLER", "Returnert til saksbehandler")
    ;

    @JsonValue
    fun toJson(): String = name

    companion object {
        fun of(id: String): ROLState {
            return entries.firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No ROLState with id $id exists")
        }

        fun fromNavn(navn: String?): ROLState {
            return entries.firstOrNull { it.navn == navn }
                ?: throw IllegalArgumentException("No ROLState with navn $navn exists")
        }
    }

    override fun toString(): String {
        return "ROLState(id='$id', navn='$navn', beskrivelse='$beskrivelse')"
    }

}