package no.nav.klage.kodeverk

import javax.persistence.AttributeConverter
import javax.persistence.Converter

enum class Ytelse(override val id: String, override val navn: String, override val beskrivelse: String) : Kode {
    OMS_OMP("1", "Omsorgspenger", "Omsorgspenger"),
    OMS_OLP("2", "Opplæringspenger", "Opplæringspenger"),
    OMS_PSB("3", "Pleiepenger sykt barn", "Pleiepenger sykt barn"),
    OMS_PLS("4", "Pleiepenger i livets sluttfase", "Pleiepenger i livets sluttfase"),
    SYK_SYK("5", "Sykepenger", "Sykepenger"),
    FOR_FOR("6", "Foreldrepenger", "Foreldrepenger"),
    FOR_ENG("7", "Engangsstønad", "Engangsstønad"),
    FOR_SVA("8", "Svangerskapspenger", "Svangerskapspenger"),
    AAP_AAP("9", "Arbeidsavklaringspenger (AAP)", "Arbeidsavklaringspenger (AAP)"),
    BAR_BAR("10", "Barnetrygd", "Barnetrygd"),
    BID_BAB("11", "Barnebidrag", "Barnebidrag"),
    BID_BIF("12", "Bidragsforskudd", "Bidragsforskudd"),
    BID_OPI("13", "Oppfostringsbidrag", "Oppfostringsbidrag"),
    BID_EKB("14", "Ektefellebidrag", "Ektefellebidrag"),
    BID_BII("15", "Bidragsinnkreving", "Bidragsinnkreving"),
    DAG_DAG("16", "Dagpenger", "Dagpenger"),
    ENF_ENF("17", "Enslig mor eller far", "Enslig mor eller far"),
    GEN_GEN("18", "Lønnsgaranti", "Lønnsgaranti"),
    GRA_GRA("19", "Gravferdsstønad", "Gravferdsstønad"),
    GRU_HJE("20", "Hjelpestønad", "Hjelpestønad"),
    GRU_GRU("21", "Grunnstønad", "Grunnstønad"),
    HJE_HJE("22", "Hjelpemidler", "Hjelpemidler"),
    KON_KON("23", "Kontantstøtte", "Kontantstøtte"),
    MED_MED("24", "Medlemskap", "Medlemskap"),
    PEN_ALD("25", "Alderspensjon", "Alderspensjon"),
    PEN_BAR("26", "Barnepensjon", "Barnepensjon"),
    PEN_AFP("27", "Avtalefestet pensjon (AFP)", "Avtalefestet pensjon (AFP)"),
    PEN_TIF("28", "Tidligere familiepleier", "Tidligere familiepleier"),
    PEN_KRI("29", "Krigspensjon", "Krigspensjon"),
    PEN_GJE("30", "Ytelser til gjenlevende", "Ytelser til gjenlevende"),
    SUP_PEN("31", "Supplerende stønad", "Supplerende stønad"),
    SUP_UFF("32", "Supplerende stønad til uføre flyktninger", "Supplerende stønad til uføre flyktninger"),
    TIL_TIP("33", "Tiltakspenger", "Tiltakspenger"),
    TIL_TIL("34", "Tiltak", "Tiltak"),
    UFO_UFO("35", "Uføretrygd", "Uføretrygd"),
    YRK_YRK("36", "Yrkesskade", "Yrkesskade"),
    YRK_MEN("37", "Menerstatning", "Menerstatning"),
    YRK_YSY("38", "Yrkessykdom", "Yrkessykdom"),
    UFO_TVF("39", "Tvungen forvalting", "Tvungen forvalting"),
    OPP_OPP("40", "NAV-loven §14a", "NAV-loven §14a"),
    AAR_AAR("41", "AA-register", "AA-register"),
    TSR_TSR(
        "42",
        "Arbeid og utdanningsreiser etter arbeidsmarkedsloven",
        "Arbeid og utdanningsreiser etter arbeidsmarkedsloven"
    ),
    FRI_FRI(
        "43",
        "Kompensasjonsytelse for selvstendig næringsdrivende og frilansere",
        "Kompensasjonsytelse for selvstendig næringsdrivende og frilansere"
    ),
    TSO_TSO("44", "Tilleggsstønad", "Tilleggsstønad"),
    FAR_FAR("45", "Far- og morskap", "Far- og morskap"),
    BID_BBF("46", "Barnebortføring", "Barnebortføring"),
    DAG_LKP("47", "Lønnskompensasjon for permitterte", "Lønnskompensasjon for permitterte"),
    DAG_FDP("48", "Forskudd dagpenger", "Forskudd dagpenger"),
    BIL_BIL("49", "Bil", "Bil"),
    HEL_HEL("50", "Helsetjenester og ortopediske hjelpemidler", "Helsetjenester og ortopediske hjelpemidler"),
    ;


    companion object {
        fun of(id: String): Ytelse {
            return values().firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No Ytelse with id $id exists")
        }
    }

    fun toTema(): Tema {
        return when (this) {
            OMS_OMP, OMS_OLP, OMS_PSB, OMS_PLS -> Tema.OMS
            SYK_SYK -> Tema.SYK
            FOR_FOR, FOR_ENG, FOR_SVA -> Tema.FOR
            AAP_AAP -> Tema.AAP
            BAR_BAR -> Tema.BAR
            BID_BAB, BID_BIF, BID_OPI, BID_EKB, BID_BBF, BID_BII -> Tema.BID
            DAG_DAG, DAG_FDP, DAG_LKP -> Tema.DAG
            ENF_ENF -> Tema.ENF
            GEN_GEN -> Tema.GEN
            GRA_GRA -> Tema.GRA
            GRU_HJE, GRU_GRU -> Tema.GRU
            HJE_HJE -> Tema.HJE
            KON_KON -> Tema.KON
            MED_MED -> Tema.MED
            PEN_ALD, PEN_BAR, PEN_AFP, PEN_TIF, PEN_KRI, PEN_GJE -> Tema.PEN
            SUP_PEN, SUP_UFF -> Tema.SUP
            TIL_TIP, TIL_TIL -> Tema.TIL
            UFO_UFO, UFO_TVF -> Tema.UFO
            YRK_YRK, YRK_MEN, YRK_YSY -> Tema.YRK
            OPP_OPP -> Tema.OPP
            AAR_AAR -> Tema.AAR
            TSR_TSR -> Tema.TSR
            FRI_FRI -> Tema.FRI
            TSO_TSO -> Tema.TSO
            FAR_FAR -> Tema.FAR
            BIL_BIL -> Tema.BIL
            HEL_HEL -> Tema.HEL
        }
    }
}

@Converter
class YtelseConverter : AttributeConverter<Ytelse, String?> {

    override fun convertToDatabaseColumn(entity: Ytelse?): String? =
        entity?.id

    override fun convertToEntityAttribute(id: String?): Ytelse? =
        id?.let { Ytelse.of(it) }
}

val ytelserPerEnhet = mapOf(
    "4291" to listOf(Ytelse.SYK_SYK),
    "4292" to listOf(Ytelse.FOR_FOR, Ytelse.FOR_ENG, Ytelse.FOR_SVA, Ytelse.SYK_SYK),
    "4293" to listOf(),
    "4294" to listOf(Ytelse.SYK_SYK),
    "4295" to listOf(Ytelse.OMS_OMP, Ytelse.OMS_PLS, Ytelse.OMS_PSB, Ytelse.OMS_OLP),
    "4250" to listOf(),
)

val enheterPerYtelse = mapOf(
    Ytelse.SYK_SYK to listOf("4291", "4292", "4294"),
    Ytelse.FOR_SVA to listOf("4292"),
    Ytelse.FOR_ENG to listOf("4292"),
    Ytelse.FOR_FOR to listOf("4292"),
    Ytelse.OMS_OMP to listOf("4295"),
    Ytelse.OMS_PLS to listOf("4295"),
    Ytelse.OMS_PSB to listOf("4295"),
    Ytelse.OMS_OLP to listOf("4295"),
)