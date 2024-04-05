package no.nav.klage.kodeverk.hjemmel

import no.nav.klage.kodeverk.Kode

enum class LovKilde(override val id: String, override val navn: String, override val beskrivelse: String) : Kode {
    FOLKETRYGDLOVEN("1","Folketrygdloven", "Ftrl"),
    FORSKRIFT_OM_AKTIVITETSHJELPEMIDLER_TIL_DE_OVER_26_ÅR("2","Forskrift om aktivitetshjelpemidler til de over 26 år","Forskrift om aktivitetshjelpemidler til de over 26 år"),
    FORSKRIFT_OM_HJELPEMIDLER_MM("3", "Forskrift om hjelpemidler mm.", "Forskrift om hjelpemidler mm."),
    FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM("4", "Forskrift om ortopediske hjelpemidler mm.", "Forskrift om ortopediske hjelpemidler mm."),
    FORSKRIFT_OM_HØREAPPARATER_MM("5","Forskrift om høreapparater mm.", "Forskrift om høreapparater mm."),
    FORSKRIFT_OM_SERVICEHUND("6","Forskrift om servicehund", "Forskrift om servicehund"),
    FORSKRIFT_OM_MOTORKJØRETØY("7","Forskrift om motorkjøretøy", "Forskrift om motorkjøretøy"),
    FORVALTNINGSLOVEN("8","Forvaltningsloven", "Fvl"),
    TRYGDERETTSLOVEN("9","Trygderettsloven", "Trrl"),
    FORELDELSESLOVEN("10","Foreldelsesloven", "Fl"),
    EØS_FORORDNING_883_2004("11", "EØS forordning 883/2004", "EØS forordning 883/2004"),
    DAGPENGEFORSKRIFTEN("12", "Dagpengeforskriften", "Dagpengeforskriften"),
    FORSKRIFT_COVID_19("13", "Forskrift Covid-19", "Forskrift Covid-19"),
    PERMITTERINGSLØNNSLOVEN("14", "Permitteringslønnsloven", "Pmll"),
    NORDISK_KONVENSJON("15", "Nordisk konvensjon", "Nordisk konvensjon"),
    GJENNOMFØRINGSFORORDNING_987_2009("16", "Gjennomføringsforordning 987/2009", "Gjennomføringsforordning 987/2009"),
    FORSKRIFT_UFØRETRYGD_FOLKETRYGDEN("17", "Forskrift om uføretrygd fra folketrygden", "Fors uføretr"),
    FORSKRIFT_OM_BEREGNING_AV_UFØRETRYGD_ETTER_EØS_AVTALEN_883_2004("18", "Forskrift om beregning av uføretrygd etter EØS- avtalen 883/2004", "Forskrift om beregning av uføretrygd etter EØS- avtalen 883/2004"),
    GJENNOMFØRINGSFORORDNING_987_2007("19", "Gjennomføringsforordning 987/2007", "Gjennomføringsforordning 987/2007"),
    EØS_FORORDNING_1408_71("20", "Forordning 1408/71", "Forordning 1408/71"),
    ANDRE_TRYGDEAVTALER("21", "Andre trygdeavtaler", "Andre trygdeavtaler"),
    GAMMELT_REGELVERK("22", "Gammelt regelverk", "Gammelt regelverk"),
    TRYGDEAVTALER_MED_ENGLAND("23", "Trygdeavtaler med England", "Trygdeavtaler med England"),
    TRYGDEAVTALER_MED_USA("24", "Trygdeavtaler med USA", "Trygdeavtaler med USA"),
    LOV_OM_KRIGSPENSJON_FOR_MILITÆRPERSONER("25", "Lov om krigspensjon for militærpersoner", "Lov om krigspensjon for militærpersoner"),
    LOV_OM_KRIGSPENSJON_FOR_SIVILE("26", "Lov om krigspensjon for sivile m.v", "Lov om krigspensjon for sivile m.v"),
    TILLEGGSLOV_OM_KRIGSPENSJONERING_AV_1951("27", "Tilleggslov om krigspensjonering av 1951", "Tilleggslov om krigspensjonering av 1951"),
    TILLEGGSLOV_OM_KRIGSPENSJONERING_AV_1968("28", "Tilleggslov om krigspensjonering av 1968", "Tilleggslov om krigspensjonering av 1968"),
    BARNETRYGDLOVEN("29", "Barnetrygdloven", "Btrl"),
    EØS_AVTALEN("30", "EØS-avtalen", "EØS-avtalen"),
    KONTANTSTØTTELOVEN("31", "Kontantstøtteloven", "Kontsl"),
    BARNELOVA("32", "Barnelova", "Bl"),
    FORSKRIFT_OM_FASTSETTELSE_OG_ENDRING_AV_FORSTRINGSTILSKOT("33", "Forskrift om fastsettelse og endring av fostringstilskot", "Fors fasts og end"),
    FORSKRIFT_OM_SÆRTILSKUDD("34", "Forskrift om særtilskudd", "Fors. om sært."),
    FORSKOTTERINGSLOVEN("35", "Forskotteringsloven", "Forskl"),
    BIDRAGSINNKREVINGSLOVEN("36", "Bidragsinnkrevingsloven", "Innkl"),
    EKTESKAPSLOVEN("37", "Ekteskapsloven", "El"),
    BARNEVERNLOVEN("38", "Barnevernloven", "Bvl"),
    LOV_OM_SUPPLERENDE_STØNAD("39", "Lov om supplerende stønad", "Lov om supplerende stønad"),
    ARBEIDSMARKEDSLOVEN("40", "Arbeidsmarkedsloven", "Arbml"),
    FORSKRIFT_OM_TILTAK("41", "Forskrift om tiltak", "Forskrift om tiltak"),
    FORSKRIFT_OM_TILTAKSPENGER("60", "Forskrift om tiltakspenger", "Fors om tiltakspenger"),
    LØNNSGARANTILOVEN("42", "Lønnsgarantiloven", "Lgl"),
    AFP_62_PRIVAT("43", "AFP-62 Privat", "AFP-62 Privat"),
    AFP_62_OFFENTLIG("44", "AFP-62 Offentlig", "AFP-62 Offentlig"),
    FORSKRIFT_OM_ARBEIDS_OG_UTDANNINGSREISER("45", "Forskrift om arbeids- og utdanningsreiser", "Fors om arb- og utd.r."),
    TILLEGGSSTØNADSFORSKRIFTEN("46", "Tilleggsstønadforskriften", "Fors om tilleggsstønad"),
    NAV_LOVEN("47", "NAV-loven", "NAV-L"),
    MIDLERTIDIG_LOV_KOMP_SELVST_OG_FRILANS("48","Midlertidig lov om kompensasjonsytelse for selvstendig næringsdrivende og frilansere", "Midl. komp selv.næ og fril"),
    LØNNSKOMPENSASJON_FOR_PERMITTERTE("49", "Lønnskompensasjon for permitterte", "Lønn.komp perm"),
    MIDLERTIDIG_FORSKR_FORSKUDD_DAGPENGER("50", "Midlertidig forskrift om forskudd på dagpenger for å avhjelpe konsekvensene av covid-19", "Midlertidig forskrift om forskudd på dagpenger for å avhjelpe konsekvensene av covid-19"),
    BARNEBORTFØRINGSLOVEN("51", "Barnebortføringsloven", "Bbfl"),
    KONVENSON_OM_SIVILE_SIDER_VED_BARNEBORTFØRING("52", "Konvensjon om sivile sider ved barnebortføring", "Konvensjon om sivile sider ved barnebortføring"),
    HAAG_KONVENSJONEN("53", "Haag-konvensjonen", "Haag-konvensjonen"),
    FORSK_OPPFLG_NAV_EGEN_REGI("54", "Forskrift om oppfølgingstjenester i Arbeids- og velferdsetatens egen regi", "Forskrift om oppfølgingstjenester i Arbeids- og velferdsetatens egen regi"),
    FORSKRIFT_OM_ETTERGJEVING("55", "Forskrift om ettergjeving", "Forskrift om ettergjeving"),
    FORSKRIFT_OM_OPPFOSTRINGSBIDRAG("56", "Forskrift om fastsetting og endring av oppfostringsbidrag etter lov om barneverntjenester", "Forskrift om oppfostringsbidrag"),
    FORSKRIFT_OM_LØNNSPLIKT_UNDER_PERMITTERING("57", "Forskrift om lønnsplikt under permittering", "Forskrift om lønnsplikt under permittering"),
    HOVEDNUMMER_42_TRYGDEAVTALER("58", "Hovednummer 42 - Trygdeavtaler", "Hnr. 42"),
    DEKNINGSLOVEN("59", "Dekningsloven", "Dekningsloven"),
    BREXITAVTALEN("61", "Brexitavtalen", "Brexitavtalen"),
    SPESIELL_LOVKILDE("62", "Spesiell lovkilde", "Spesiell lovkilde"),
    FORSKRIFT_OM_AA_REGISTERET("63", "Forskrift om AA-registeret", "Forskrift om AA-registeret"),
    FORSKRIFT_OM_BIDRAGSFORSKOTT_BOSTED_OG_OPPHOLD("64", "Forskrift om i hvilke tilfelle vilkåret i forskotteringsloven om bosted og opphold i riket skal anses oppfyllt og om i hvilke tilfelle bidragsforskott kan utbetales i utlandet", "Forskrift om bidragsforskott (bosted og opphold)"),
    FORSKRIFT_OM_BIDRAGSFORSKOTT_VED_DELT_BOSTED("65", "Forskrift om i hvilke tilfelle det kan ytes bidragsforskott til barn som har delt bosted", "Forskrift om bidragsforskott ved delt bosted"),
    FORSKRIFT_OM_BIDRAGSENDRING_FORSKOTTERINGSLOVEN("66", "Forskrift om i hvilke tilfelle bidragsfogden skal fastsette eller endre bidrag av eget tiltak etter forskotteringsloven § 3 annet ledd", "Forskrift om bidragsendring, forskotteringsloven"),
    FORSKRIFT_OM_INNTEKTSPRØVING_AV_FORSKOTT("67", "Forskrift om gjennomføringen av bestemmelsene om inntektsprøving av forskott", "Forskrift om inntektsprøving av forskott"),

    ANNET("68", "Annet", "Annet"),

    FORSKRIFT_OM_YTELSER_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER("69", "Forskrift om ytelser til gjenlevende ektefelle og tidligere familiepleier etter folketrygdloven kapittel 17", "Forskrift om ytelser til gjenlevende ektefelle og tidligere familiepleier etter folketrygdloven kapittel 17"),

    UKJENT("999","Ukjent", "Ukjent")
}