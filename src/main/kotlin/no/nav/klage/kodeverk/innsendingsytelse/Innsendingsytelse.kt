package no.nav.klage.kodeverk.innsendingsytelse

import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter
import no.nav.klage.kodeverk.MinimalCode

enum class Innsendingsytelse(override val id: String, override val nbName: String) : MinimalCode {
    ALDERSPENSJON("ALDERSPENSJON", "Alderspensjon"),
    ARBEID_MED_STOTTE("ARBEID_MED_STOTTE", "Arbeid med støtte"),
    ARBEIDSAVKLARINGSPENGER("ARBEIDSAVKLARINGSPENGER", "Arbeidsavklaringspenger"),
    ARBEIDSFORBEREDENDE_TRENING("ARBEIDSFORBEREDENDE_TRENING", "Arbeidsforberedende trening"),
    ARBEIDSRETTET_REHABILITERING("ARBEIDSRETTET_REHABILITERING", "Arbeidsrettet rehabilitering"),
    ARBEIDSTRENING("ARBEIDSTRENING", "Arbeidstrening"),
    AVKLARING("AVKLARING", "Avklaring"),
    AVTALEFESTET_PENSJON_PRIVAT("AVTALEFESTET_PENSJON_PRIVAT", "Avtalefestet pensjon (AFP) i privat sektor"),
    AVTALEFESTET_PENSJON_SPK("AVTALEFESTET_PENSJON_SPK", "Avtalefestet pensjon (AFP) fra Statens pensjonskasse"),
    BARNEBIDRAG("BARNEBIDRAG", "Barnebidrag"),
    //Deprecated
    BARNEBIDRAG_OG_BIDRAGSFORSKUDD("BARNEBIDRAG_OG_BIDRAGSFORSKUDD", "Barnebidrag og bidragsforskudd"),
    BARNEPENSJON("BARNEPENSJON", "Barnepensjon"),
    BARNETRYGD("BARNETRYGD", "Barnetrygd"),
    BIDRAGSFORSKUDD("BIDRAGSFORSKUDD", "Bidragsforskudd"),
    BIDRAG_TIL_SARLIGE_UTGIFTER("BIDRAG_TIL_SARLIGE_UTGIFTER", "Bidrag til særlige utgifter"),
    BILSTONAD("BILSTONAD", "Stønad til bil og spesialutstyr til kjøretøy"),
    DAGPENGER("DAGPENGER", "Dagpenger"),
    DAGPENGER_TILBAKEBETALING_FORSKUDD(
        "DAGPENGER_TILBAKEBETALING_FORSKUDD",
        "Tilbakebetaling av forskudd på dagpenger"
    ),
    EKTEFELLEBIDRAG("EKTEFELLEBIDRAG", "Ektefellebidrag"),
    ENGANGSSTONAD("ENGANGSSTONAD", "Engangsstønad"),
    //Only used in Mine Klager
    ENSLIG_MOR_ELLER_FAR("ENSLIG_MOR_ELLER_FAR", "Enslig mor eller far"),
    FORELDREPENGER("FORELDREPENGER", "Foreldrepenger"),
    FORHOYET_HJELPESTONAD("FORHOYET_HJELPESTONAD", "Forhøyet hjelpestønad"),
    //Only used in Mine Klager
    FORSIKRING("FORSIKRING", "Forsikring"),
    FORSIKRING_FOR_FRILANSERE("FORSIKRING_FOR_FRILANSERE", "Forsikring for frilansere"),
    FORSIKRING_FOR_JORDBRUKERE_OG_REINDRIFTSUTOVERE(
        "FORSIKRING_FOR_JORDBRUKERE_OG_REINDRIFTSUTOVERE",
        "Forsikring for jordbrukere og reindriftsutøvere"
    ),
    FORSIKRING_FOR_SELVSTENDIG_NARINGSDRIVENDE(
        "FORSIKRING_FOR_SELVSTENDIG_NARINGSDRIVENDE",
        "Forsikring for selvstendig næringsdrivende"
    ),
    FRIVILLIG_MEDLEMSKAP_I_FOLKETRYGDEN_UNDER_OPPHOLD_I_NORGE("FRIVILLIG_MEDLEMSKAP_I_FOLKETRYGDEN_UNDER_OPPHOLD_I_NORGE", "Frivillig medlemskap i folketrygden under oppholdi Norge"),
    FRIVILLIG_YRKESSKADETRYGD("FRIVILLIG_YRKESSKADETRYGD", "Frivillig yrkesskadetrygd"),
    FUNKSJONSASSISTANSE_I_ARBEIDSLIVET("FUNKSJONSASSISTANSE_I_ARBEIDSLIVET", "Funksjonsassistanse i arbeidslivet"),
    FORERHUND("FORERHUND", "Førerhund"),
    GJENLEVENDE("GJENLEVENDE", "Gjenlevendepensjon"),
    GRAVFERDSSTONAD("GRAVFERDSSTONAD", "Gravferdsstønad"),
    GRUNNSTONAD("GRUNNSTONAD", "Grunnstønad"),
    //Deprecated
    GRUNN_OG_HJELPESTONAD("GRUNN_OG_HJELPESTONAD", "Grunnstønad og hjelpestønad"),
    GRONT_ARBEID("GRONT_ARBEID", "Grønt arbeid"),
    HJELPEMIDLER("HJELPEMIDLER", "Hjelpemidler og tilrettelegging ved nedsatt funksjonsevne"),
    //Only used in Mine Klager
    HJELPEMIDLER_ORTOPEDISKE("HJELPEMIDLER_ORTOPEDISKE", "Hjelpemidler - Ortopediske"),
    HJELPESTONAD("HJELPESTONAD", "Hjelpestønad"),
    INKLUDERINGSTILSKUDD("INKLUDERINGSTILSKUDD", "Inkluderingstilskudd"),
    IPS("IPS", "IPS"),
    IPS_UNG("IPS_UNG", "IPS ung"),
    JOBBKLUBB("JOBBKLUBB", "Jobbklubb"),
    JOBBMESTRENDE_OPPFOLGING("JOBBMESTRENDE_OPPFOLGING", "Jobbmestrende oppfølging"),
    JOBBSOKERKURS("JOBBSOKERKURS", "Jobbsøkerkurs"),
    KONTANTSTOTTE("KONTANTSTOTTE", "Kontantstøtte"),
    KRIGSPENSJON("KRIGSPENSJON", "Krigspensjon"),
    LESE_OG_SEKRETARHJELP("LESE_OG_SEKRETARHJELP", "Lese- og sekretærhjelp"),
    LONNSGARANTI("LONNSGARANTI", "Lønnsgaranti ved konkurs hos arbeidsgiver"),
    LONNSKOMPENSASJON("LONNSKOMPENSASJON", "Lønnskompensasjon for permitterte"),
    //Only used in Mine Klager
    MEDLEMSKAP("MEDLEMSKAP", "Medlemskap i folketrygden"),
    MEDLEMSKAP_I_FOLKETRYGDEN_UNDER_OPPHOLD_I_EOS_ELLER_SVEITS(
        "MEDLEMSKAP_I_FOLKETRYGDEN_UNDER_OPPHOLD_I_EOS_ELLER_SVEITS",
        "Medlemskap i folketrygden under opphold i EØS eller Sveits"
    ),
    MEDLEMSKAP_I_FOLKETRYGDEN_UNDER_OPPHOLD_UTENFOR_EOS(
        "MEDLEMSKAP_I_FOLKETRYGDEN_UNDER_OPPHOLD_UTENFOR_EOS",
        "Medlemskap i folketrygden under opphold utenfor EØS"
    ),
    MENERSTATNING_VED_YRKESSKADE_ELLER_YRKESSYKDOM(
        "MENERSTATNING_VED_YRKESSKADE_ELLER_YRKESSYKDOM",
        "Menerstatning ved yrkesskade eller yrkessykdom"
    ),
    MENTOR("MENTOR", "Mentor"),
    MIDLERTIDIG_KOMPENSASJON(
        "MIDLERTIDIG_KOMPENSASJON",
        "Midlertidig kompensasjon for selvstendig næringsdrivende og frilansere"
    ),
    MIDLERTIDIG_LONNSTILSKUDD(
        "MIDLERTIDIG_LONNSTILSKUDD",
        "Midlertidig lønnstilskudd"
    ),
    MINSTEPENSJON_I_ALDERSPENSJONEN("MINSTEPENSJON_I_ALDERSPENSJONEN", "Minstepensjon i alderspensjonen"),

    //Deprecated
    NAV_LOVEN_14A("NAV_LOVEN_14A", "Vurdering av behov for bistand etter NAV-loven § 14 a"),
    OMSORGSPENGER_HJEMME_MED_SYKT_BARN_DAGER(
        "OMSORGSPENGER_HJEMME_MED_SYKT_BARN_DAGER",
        "Omsorgspenger (hjemme med sykt barn-dager)"
    ),
    OMSTILLINGSSTONAD("OMSTILLINGSSTONAD", "Omstillingsstønad"),
    OPPFOSTRINGSBIDRAG("OPPFOSTRINGSBIDRAG", "Oppfostringsbidrag"),
    OPPFOLGING("OPPFOLGING", "Oppfølging"),
    OPPLARING("OPPLARING", "Opplæring"),
    OPPLARINGSPENGER("OPPLARINGSPENGER", "Opplæringspenger"),

    //Deprecated
    OPPHOLD_ELLER_ARBEID_I_NORGE("OPPHOLD_ELLER_ARBEID_I_NORGE", "Opphold eller arbeid i Norge"),

    //Deprecated
    OPPHOLD_ELLER_ARBEID_UTENFOR_NORGE("OPPHOLD_ELLER_ARBEID_UTENFOR_NORGE", "Opphold eller arbeid utenfor Norge"),
    OVERGANGSSTONAD_TIL_ENSLIG_MOR_ELLER_FAR(
        "OVERGANGSSTONAD_TIL_ENSLIG_MOR_ELLER_FAR",
        "Overgangsstønad til enslig mor eller far"
    ),
    OVERGANGSSTONAD_TIL_GJENLEVENDE("OVERGANGSSTONAD_TIL_GJENLEVENDE", "Overgangsstønad til gjenlevende"),
    PENSJONSOPPTJENING_VED_OMSORG_FOR_BARN(
        "PENSJONSOPPTJENING_VED_OMSORG_FOR_BARN",
        "Pensjonsopptjening ved omsorg for barn"
    ),
    PENSJONSOPPTJENING_VED_OMSORG_FOR_SYKE_ELDRE_OG_PERSONER_MED_FUNKSJONSNEDSETTELSER(
        "PENSJONSOPPTJENING_VED_OMSORG_FOR_SYKE_ELDRE_OG_PERSONER_MED_FUNKSJONSNEDSETTELSER",
        "Pensjonsopptjening ved omsorg for syke, eldre og personer med funksjonsnedsettelser"
    ),
    PLEIEPENGER_FOR_EN_UTVIKLINGSHEMMET_PERSON_OVER_18_AR(
        "PLEIEPENGER_FOR_EN_UTVIKLINGSHEMMET_PERSON_OVER_18_AR",
        "Pleiepenger for en utviklingshemmet person over 18 år"
    ),
    PLEIEPENGER_FOR_SYKT_BARN("PLEIEPENGER_FOR_SYKT_BARN", "Pleiepenger for sykt barn"),
    PLEIEPENGER_I_LIVETS_SLUTTFASE("PLEIEPENGER_I_LIVETS_SLUTTFASE", "Pleiepenger i livets sluttfase"),

    //Deprecated
    REISEKOSTNADER_VED_SAMVAER("REISEKOSTNADER_VED_SAMVAER", "Reisekostnader ved samvær"),
    REISEKOSTNADER_VED_SAMVAR("REISEKOSTNADER_VED_SAMVAR", "Reisekostnader ved samvær"),
    REISETILSKUDD("REISETILSKUDD", "Reisetilskudd"),
    REISEUTGIFTER("REISEUTGIFTER", "Reiseutgifter"),
    SENTER_FOR_JOBBMESTRING("SENTER_FOR_JOBBMESTRING", "Senter for jobbmestring"),
    SERVICEHUND("SERVICEHUND", "Servicehund"),
    STUDIER_MED_STOTTE("STUDIER_MED_STOTTE", "Studier med støtte"),
    STONAD_TIL_BARNETILSYN_FOR_ENSLIG_MOR_ELLER_FAR(
        "STONAD_TIL_BARNETILSYN_FOR_ENSLIG_MOR_ELLER_FAR",
        "Stønad til barnetilsyn for enslig mor eller far"
    ),
    STONAD_TIL_BARNETILSYN_FOR_GJENLEVENDE_EKTEFELLE(
        "STONAD_TIL_BARNETILSYN_FOR_GJENLEVENDE_EKTEFELLE",
        "Stønad til barnetilsyn for gjenlevende ektefelle"
    ),
    STONAD_TIL_SKOLEPENGER_FOR_ENSLIG_MOR_ELLER_FAR(
        "STONAD_TIL_SKOLEPENGER_FOR_ENSLIG_MOR_ELLER_FAR",
        "Stønad til skolepenger for enslig mor eller far"
    ),
    STONAD_TIL_SKOLEPENGER_FOR_GJENLEVENDE_EKTEFELLE(
        "STONAD_TIL_SKOLEPENGER_FOR_GJENLEVENDE_EKTEFELLE",
        "Stønad til skolepenger for gjenlevende ektefelle"
    ),
    STONAD_TIL_SKOLEPENGER_FOR_TIDLIGERE_FAMILIEPLEIERE(
        "STONAD_TIL_SKOLEPENGER_FOR_TIDLIGERE_FAMILIEPLEIERE",
        "Stønad til skolepenger for tidligere familiepleiere"
    ),
    STONAD_VED_BARETRANSPORT("STONAD_VED_BARETRANSPORT", "Stønad ved båretransport"),
    STOTTE_TIL_ARBEIDS_OG_UTDANNINGSREISER(
        "STOTTE_TIL_ARBEIDS_OG_UTDANNINGSREISER",
        "Støtte til arbeids- og utdanningsreiser"
    ),
    STOTTE_TIL_FOLKEHOYSKOLE("STOTTE_TIL_FOLKEHOYSKOLE", "Støtte til folkehøyskole"),
    SUPPLERENDE_STONAD("SUPPLERENDE_STONAD", "Supplerende stønad til personer over 67 år med kort botid i Norge"),
    SUPPLERENDE_STONAD_UFORE_FLYKTNINGER(
        "SUPPLERENDE_STONAD_UFORE_FLYKTNINGER",
        "Supplerende stønad for uføre flyktninger under 67 år"
    ),
    SVANGERSKAPSPENGER("SVANGERSKAPSPENGER", "Svangerskapspenger"),

    //Deprecated
    SYKDOM_I_FAMILIEN("SYKDOM_I_FAMILIEN", "Omsorgspenger, opplæringspenger, pleiepenger"),
    SYKEPENGER("SYKEPENGER", "Sykepenger"),

    //Deprecated
    TIDLIGERE_FAMILIEPLEIER("TIDLIGERE_FAMILIEPLEIER", "Ytelser til tidligere familiepleier"),
    TILLEGGSSTONADER("TILLEGGSSTONADER", "Tilleggsstønader"),
    TILLEGGSSTONADER_TIL_ENSLIG_MOR_ELLER_FAR(
        "TILLEGGSSTONADER_TIL_ENSLIG_MOR_ELLER_FAR",
        "Tilleggsstønader til enslig mor eller far"
    ),
    TILLEGGSSTONADER_TIL_GJENLEVENDE_EKTEFELLE(
        "TILLEGGSSTONADER_TIL_GJENLEVENDE_EKTEFELLE",
        "Tilleggsstønader til gjenlevende ektefelle"
    ),
    TILLEGGSSTONADER_TIL_TIDLIGERE_FAMILIEPLEIER(
        "TILLEGGSSTONADER_TIL_TIDLIGERE_FAMILIEPLEIER",
        "Tilleggsstønader til tidligere familiepleier"
    ),
    TILPASNINGSKURS_NEDSATT_SYN_OG_HORSEL(
        "TILPASNINGSKURS_NEDSATT_SYN_OG_HORSEL",
        "Tilpasningskurs - nedsatt syn og hørsel"
    ),
    TILSKUDD_TIL_APPER_OG_PROGRAMVARE("TILSKUDD_TIL_APPER_OG_PROGRAMVARE", "Tilskudd til apper og programvare"),
    TILSKUDD_TIL_BIL("TILSKUDD_TIL_BIL", "Tilskudd til bil"),
    TILSKUDD_TIL_KJOP_AV_PC_ELLER_NETTBRETT(
        "TILSKUDD_TIL_KJOP_AV_PC_ELLER_NETTBRETT",
        "Tilskudd til kjøp av PC eller nettbrett ved lese- og skrivevansker"
    ),
    TILSKUDD_TIL_OMBYGGING("TILSKUDD_TIL_OMBYGGING", "Tilskudd til ombygging"),
    TILSKUDD_TIL_RIMELIGE_HJELPEMIDLER("TILSKUDD_TIL_RIMELIGE_HJELPEMIDLER", "Tilskudd til rimelige hjelpemidler"),
    TILSKUDD_TIL_SOMMERJOBB("TILSKUDD_TIL_SOMMERJOBB", "Tilskudd til sommerjobb"),
    TILTAKSPENGER("TILTAKSPENGER", "Tiltakspenger for arbeidsmarkedstiltak"),
    TOLKING_FOR_DOVE_DOVBLINDE_OG_HORSELSHEMMEDE(
        "TOLKING_FOR_DOVE_DOVBLINDE_OG_HORSELSHEMMEDE",
        "Tolking for døve, døvblinde og hørselshemmede"
    ),
    UFORETRYGD("UFORETRYGD", "Uføretrygd"),
    UTVIDET_BARNETRYGD("UTVIDET_BARNETRYGD", "Utvidet barnetrygd"),
    VARIG_LONNSTILSKUDD("VARIG_LONNSTILSKUDD", "Varig lønnstilskudd"),
    VARIG_TILRETTELAGT_ARBEID("VARIG_TILRETTELAGT_ARBEID", "Varig tilrettelagt arbeid"),
    YRKESSKADE("YRKESSKADE", "Yrkesskade"),
    YTELSER_TIL_TIDLIGERE_FAMILIEPLEIERE(
        "YTELSER_TIL_TIDLIGERE_FAMILIEPLEIERE",
        "Ytelser til tidligere familiepleiere"
    );

    companion object {
        fun of(id: String): Innsendingsytelse {
            return Innsendingsytelse.entries.firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No Innsendingsytelse with id $id exists")
        }

        fun fromNbName(nbName: String): Innsendingsytelse {
            return Innsendingsytelse.entries.firstOrNull { it.nbName == nbName }
                ?: throw IllegalArgumentException("No Innsendingsytelse with nbName $nbName exists")
        }
    }
}

@Converter
class InnsendingsytelseConverter : AttributeConverter<Innsendingsytelse, String?> {

    override fun convertToDatabaseColumn(entity: Innsendingsytelse?): String? =
        entity?.id

    override fun convertToEntityAttribute(id: String?): Innsendingsytelse? =
        id?.let { Innsendingsytelse.of(it) }
}

data class DisplayName(
    val nb: String,
    val en: String,
    val nn: String,
)