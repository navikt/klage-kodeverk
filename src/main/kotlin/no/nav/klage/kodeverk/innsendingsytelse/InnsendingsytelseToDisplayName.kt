package no.nav.klage.kodeverk.innsendingsytelse

val innsendingsytelseToDisplayName: Map<Innsendingsytelse, DisplayName> = mapOf(
    Innsendingsytelse.ALDERSPENSJON to DisplayName(
        "Alderspensjon",
        "Retirement pension",
        "Alderspensjon"
    ),
    Innsendingsytelse.ARBEIDSAVKLARINGSPENGER to DisplayName(
        "Arbeidsavklaringspenger (AAP)",
        "Work assessment allowance (AAP)",
        "Arbeidsavklaringspengar (AAP)"
    ),
    Innsendingsytelse.AVTALEFESTET_PENSJON_SPK to DisplayName(
        "Avtalefestet pensjon (AFP) fra Statens pensjonskasse",
        "Contractual early retirement pension (AFP) in the public sector",
        "Avtalefesta pensjon (AFP) frå Statens pensjonskasse"
    ),
    Innsendingsytelse.AVTALEFESTET_PENSJON_PRIVAT to DisplayName(
        "Avtalefestet pensjon (AFP) i privat sektor",
        "Contractual early retirement pension (AFP) in the private sector",
        "Avtalefesta pensjon (AFP) i privat sektor"
    ),
    Innsendingsytelse.BARNEBIDRAG to DisplayName(
        "Barnebidrag",
        "Child support (Barnebidrag)",
        "Barnebidrag"
    ),
    //Deprecated
    Innsendingsytelse.BARNEBIDRAG_OG_BIDRAGSFORSKUDD to DisplayName(
        "Barnebidrag og bidragsforskudd",
        "Child support (Barnebidrag) and advance payments of child support (Bidragsforskudd)",
        "Barnebidrag og bidragsforskot"
    ),
    Innsendingsytelse.BARNEPENSJON to DisplayName(
        "Barnepensjon",
        "Children's pension (Barnepensjon)",
        "Barnepensjon"
    ),
    Innsendingsytelse.BARNETRYGD to DisplayName(
        "Barnetrygd",
        "Child benefit (Barnetrygd)",
        "Barnetrygd"
    ),
    Innsendingsytelse.BIDRAGSFORSKUDD to DisplayName(
        "Bidragsforskudd",
        "Advance payments of child support (Bidragsforskudd)",
        "Bidragsforskot"
    ),
    Innsendingsytelse.BIDRAG_TIL_SARLIGE_UTGIFTER to DisplayName(
        "Bidrag til særlige utgifter",
        "Support for extraordinary expenses",
        "Bidrag til særlege utgifter"
    ),
    Innsendingsytelse.BILSTONAD to DisplayName(
        "Bilstønad",
        "Car benefit",
        "Bilstønad"
    ),
    Innsendingsytelse.DAGPENGER to DisplayName(
        "Dagpenger",
        "Unemployment benefits (Dagpenger)",
        "Dagpengar"
    ),
    Innsendingsytelse.DAGPENGER_TILBAKEBETALING_FORSKUDD to DisplayName(
        "Tilbakebetaling av forskudd på dagpenger",
        "Repayment of advance payment of unemployment benefits (Tilbakebetaling av forskudd på dagpenger)",
        "Tilbakebetaling av forskot på dagpengar"
    ),
    Innsendingsytelse.EKTEFELLEBIDRAG to DisplayName(
        "Ektefellebidrag",
        "Spousal support (Ektefellebidrag)",
        "Ektefellebidrag"
    ),
    Innsendingsytelse.ENGANGSSTONAD to DisplayName(
        "Engangsstønad",
        "Lump-sum grant (Engangsstønad)",
        "Eingongsstønad"
    ),
    Innsendingsytelse.ENSLIG_MOR_ELLER_FAR to DisplayName(
        "Enslig mor eller far",
        "Single mother or father",
        "Einsleg mor eller far"
    ),
    Innsendingsytelse.FORELDREPENGER to DisplayName(
        "Foreldrepenger",
        "Parental benefit (Foreldrepenger)",
        "Foreldrepengar"
    ),
    Innsendingsytelse.FORHOYET_HJELPESTONAD to DisplayName(
        "Forhøyet hjelpestønad",
        "Higher rate assistance allowance",
        "Auka hjelpestønad"
    ),
    Innsendingsytelse.FORSIKRING_FOR_FRILANSERE to DisplayName(
        "Forsikring for frilansere",
        "Insurance for freelancers",
        "Forsikring for frilansarar"
    ),
    Innsendingsytelse.FORSIKRING_FOR_JORDBRUKERE_OG_REINDRIFTSUTOVERE to DisplayName(
        "Forsikring for jordbrukere og reindriftsutøvere",
        "Insurance for farmers and reindeer herders",
        "Forsikring for jordbrukarar og reindriftsutøvarar"
    ),
    Innsendingsytelse.FORSIKRING_FOR_SELVSTENDIG_NARINGSDRIVENDE to DisplayName(
        "Forsikring for selvstendig næringsdrivende",
        "Insurance for the self-employed",
        "Forsikring for sjølvstendig næringsdrivande"
    ),
    Innsendingsytelse.FRIVILLIG_MEDLEMSKAP_I_FOLKETRYGDEN_UNDER_OPPHOLD_I_NORGE to DisplayName(
        "Frivillig medlemskap i folketrygden under opphold i Norge",
        "Voluntary membership of the Norwegian National Insurance Scheme during stay in Norway",
        "Frivillig medlemskap i folketrygda under opphald i Noreg",
    ),
    Innsendingsytelse.FRIVILLIG_YRKESSKADETRYGD to DisplayName(
        "Frivillig yrkesskadetrygd",
        "Voluntary occupational injury benefit",
        "Frivillig yrkesskadetrygd"
    ),
    Innsendingsytelse.FUNKSJONSASSISTANSE_I_ARBEIDSLIVET to DisplayName(
        "Funksjonsassistanse i arbeidslivet",
        "Functional assistance in the workplace",
        "Funksjonsassistanse i arbeidslivet"
    ),
    Innsendingsytelse.FORERHUND to DisplayName(
        "Førerhund",
        "Guide dog",
        "Førarhund"
    ),
    Innsendingsytelse.GJENLEVENDE to DisplayName(
        "Gjenlevendepensjon",
        "Survivor's pension",
        "Attlevandepensjon"
    ),
    Innsendingsytelse.GRAVFERDSSTONAD to DisplayName(
        "Gravferdsstønad",
        "Funeral grant (Gravferdsstønad)",
        "Gravferdsstønad"
    ),
    Innsendingsytelse.GRUNNSTONAD to DisplayName(
        "Grunnstønad",
        "Basic benefit (Grunnstønad)",
        "Grunnstønad"
    ),
    //Deprecated
    Innsendingsytelse.GRUNN_OG_HJELPESTONAD to DisplayName(
        "Grunnstønad og hjelpestønad",
        "Basic benefit (Grunnstønad) and attendance benefit (Hjelpestønad)",
        "Grunnstønad og hjelpestønad"
    ),
    Innsendingsytelse.GRONT_ARBEID to DisplayName(
        "Grønt arbeid",
        "Green work",
        "Grønt arbeid"
    ),
    Innsendingsytelse.HJELPEMIDLER to DisplayName(
        "Hjelpemidler og tilrettelegging ved nedsatt funksjonsevne",
        "Assistive technology and facilitation for impaired functional ability",
        "Hjelpemiddel og tilrettelegging ved nedsatt funksjonsevne"
    ),
    Innsendingsytelse.HJELPESTONAD to DisplayName(
        "Hjelpestønad",
        "Attendance benefit (Hjelpestønad)",
        "Hjelpestønad"
    ),
    Innsendingsytelse.JOBBMESTRENDE_OPPFOLGING to DisplayName(
        "Jobbmestrende oppfølging",
        "Work proficiency follow-up",
        "Jobbmeistrande oppfølging",
    ),
    Innsendingsytelse.KONTANTSTOTTE to DisplayName(
        "Kontantstøtte",
        "Cash-for-care benefit (Kontantstøtte)",
        "Kontantstøtte"
    ),
    Innsendingsytelse.KRIGSPENSJON to DisplayName(
        "Krigspensjon",
        "War pension (Krigspensjon)",
        "Krigspensjon"
    ),
    Innsendingsytelse.LESE_OG_SEKRETARHJELP to DisplayName(
        "Lese- og sekretærhjelp",
        "Reading and secretarial assistance",
        "Lese- og sekretærhjelp"
    ),
    Innsendingsytelse.LONNSGARANTI to DisplayName(
        "Lønnsgaranti",
        "Wage guarantee",
        "Lønsgaranti"
    ),
    Innsendingsytelse.LONNSKOMPENSASJON to DisplayName(
        "Lønnskompensasjon for permitterte",
        "Salary compensation for persons who are laid-off",
        "Lønskompensasjon for permitterte"
    ),
    Innsendingsytelse.MEDLEMSKAP_I_FOLKETRYGDEN_UNDER_OPPHOLD_I_EOS_ELLER_SVEITS to DisplayName(
        "Medlemskap i folketrygden under opphold i EØS eller Sveits",
        "Membership in the national insurance during stay in the EEA or Switzerland",
        "Medlemskap i folketrygda under opphald i EØS eller Sveits"
    ),
    Innsendingsytelse.MEDLEMSKAP_I_FOLKETRYGDEN_UNDER_OPPHOLD_UTENFOR_EOS to DisplayName(
        "Medlemskap i folketrygden under opphold utenfor EØS",
        "Membership in the Norwegian National Insurance Scheme while staying in a country outside EEA or Switzerland",
        "Medlemskap i folketrygda under opphald utanfor EØS"
    ),
    Innsendingsytelse.MENERSTATNING_VED_YRKESSKADE_ELLER_YRKESSYKDOM to DisplayName(
        "Menerstatning ved yrkesskade eller yrkessykdom",
        "Permanent impairment compensation in the event of an occupational injury or illness",
        "Meinerstatning ved yrkesskade eller yrkessjukdom"
    ),
    //Deprecated
    Innsendingsytelse.MIDLERTIDIG_KOMPENSASJON to DisplayName(
        "Midlertidig kompensasjon for selvstendig næringsdrivende og frilansere",
        "Temporary compensation for self-employed and freelancers",
        "Midlertidig kompensasjon for sjølvstendig næringsdrivande og frilansarar"
    ),
    Innsendingsytelse.MINSTEPENSJON_I_ALDERSPENSJONEN to DisplayName(
        "Minstepensjon i alderspensjonen",
        "Minimum pension: minimum pension level and guaranteed pension",
        "Minstepensjon i alderspensjonen"
    ),
    Innsendingsytelse.NAV_LOVEN_14A to DisplayName(
        "Vurdering av behov for bistand etter NAV-loven § 14 a",
        "Assessment of need for assistance according to Section 14 a of the NAV Act",
        "Vurdering av behov for bistand etter NAV-lova § 14 a"
    ),
    Innsendingsytelse.OMSORGSPENGER_HJEMME_MED_SYKT_BARN_DAGER to DisplayName(
        "Omsorgspenger (hjemme med sykt barn-dager)",
        "Care benefit (at home with a sick child days)",
        "Omsorgspengar (heime med sjukt barn-dagar)"
    ),
    Innsendingsytelse.OMSTILLINGSSTONAD to DisplayName(
        "Omstillingsstønad",
        "Adjustment allowance (Omstillingsstønad)",
        "Omstillingsstønad"
    ),
    Innsendingsytelse.OPPFOSTRINGSBIDRAG to DisplayName(
        "Oppfostringsbidrag",
        "Upbringing support (Oppfostringsbidrag)",
        "Oppfostringsbidrag"
    ),
    Innsendingsytelse.OPPFOLGING to DisplayName(
        "Oppfølging",
        "Follow up",
        "Oppfølging"
    ),
    Innsendingsytelse.OPPLARINGSPENGER to DisplayName(
        "Opplæringspenger",
        "Training allowance",
        "Opplæringspengar"
    ),
    Innsendingsytelse.OPPHOLD_ELLER_ARBEID_I_NORGE to DisplayName(
        "Opphold eller arbeid i Norge",
        "Residence or work in Norway",
        "Opphald eller arbeid i Noreg"
    ),
    //Deprecated
    Innsendingsytelse.OPPHOLD_ELLER_ARBEID_UTENFOR_NORGE to DisplayName(
        "Opphold eller arbeid utenfor Norge",
        "Residence or work outside Norway",
        "Opphald eller arbeid utanfor Noreg"
    ),
    Innsendingsytelse.OVERGANGSSTONAD_TIL_ENSLIG_MOR_ELLER_FAR to DisplayName(
        "Overgangsstønad til enslig mor eller far",
        "Transitional benefit for single parents",
        "Overgangsstønad til einslig mor eller far"
    ),
    Innsendingsytelse.OVERGANGSSTONAD_TIL_GJENLEVENDE to DisplayName(
        "Overgangsstønad til gjenlevende",
        "Transitional benefit for survivors",
        "Overgangsstønad til attlevande"
    ),
    Innsendingsytelse.PENSJONSOPPTJENING_VED_OMSORG_FOR_BARN to DisplayName(
        "Pensjonsopptjening ved omsorg for barn",
        "Accumulation of pension rights for care work for children",
        "Pensjonsopptening ved omsorg for barn"
    ),
    Innsendingsytelse.PENSJONSOPPTJENING_VED_OMSORG_FOR_SYKE_ELDRE_OG_PERSONER_MED_FUNKSJONSNEDSETTELSER to DisplayName(
        "Pensjonsopptjening ved omsorg for syke, eldre og personer med funksjonsnedsettelser",
        "Accumulation of pension rights for care work for sick, disabled or elderly people",
        "Pensjonsopptening ved omsorg for sjuke, eldre og personar med nedsett funksjon"
    ),
    Innsendingsytelse.PLEIEPENGER_FOR_EN_UTVIKLINGSHEMMET_PERSON_OVER_18_AR to DisplayName(
        "Pleiepenger for en utviklingshemmet person over 18 år",
        "Attendance allowance for developmentally disabled person over 18",
        "Pleiepengar for ein utviklingshemma person over 18 år"
    ),
    Innsendingsytelse.PLEIEPENGER_FOR_SYKT_BARN to DisplayName(
        "Pleiepenger for sykt barn",
        "Attendance allowance for sick children",
        "Pleiepengar for sjukt barn"
    ),
    Innsendingsytelse.PLEIEPENGER_I_LIVETS_SLUTTFASE to DisplayName(
        "Pleiepenger i livets sluttfase",
        "Attendance allowance in the final phase of life",
        "Pleiepengar i sluttfasen av livet"
    ),
    //Deprecated
    Innsendingsytelse.REISEKOSTNADER_VED_SAMVAER to DisplayName(
        "Reisekostnader ved samvær",
        "Travel costs for visits",
        "Reisekostnader ved samvær"
    ),
    Innsendingsytelse.REISEKOSTNADER_VED_SAMVAR to DisplayName(
        "Reisekostnader ved samvær",
        "Travel costs for visits",
        "Reisekostnader ved samvær"
    ),
    Innsendingsytelse.REISETILSKUDD to DisplayName(
        "Reisetilskudd",
        "Travel allowance",
        "Reisetilskot"
    ),
    Innsendingsytelse.REISEUTGIFTER to DisplayName(
        "Reiseutgifter",
        "Travel expenses",
        "Reiseutgifter"
    ),
    Innsendingsytelse.SERVICEHUND to DisplayName(
        "Servicehund",
        "Service dog",
        "Servicehund"
    ),
    Innsendingsytelse.STUDIER_MED_STOTTE to DisplayName(
        "Studier med støtte",
        "Studies with support (support to finish school)",
        "Studiar med støtte"
    ),
    Innsendingsytelse.STONAD_TIL_BARNETILSYN_FOR_ENSLIG_MOR_ELLER_FAR to DisplayName(
        "Stønad til barnetilsyn for enslig mor eller far",
        "Child care benefit for single parents",
        "Stønad til barnetilsyn for einsleg mor eller far"
    ),
    Innsendingsytelse.STONAD_TIL_BARNETILSYN_FOR_GJENLEVENDE_EKTEFELLE to DisplayName(
        "Stønad til barnetilsyn for gjenlevende ektefelle",
        "Child care benefits for surviving spouse",
        "Stønad til barnetilsyn for attlevande ektefelle"
    ),
    Innsendingsytelse.STONAD_TIL_SKOLEPENGER_FOR_ENSLIG_MOR_ELLER_FAR to DisplayName(
        "Stønad til skolepenger for enslig mor eller far",
        "Allowance to cover tuition and fees for single parents",
        "Stønad til skulepengar for einsleg mor eller far"
    ),
    Innsendingsytelse.STONAD_TIL_SKOLEPENGER_FOR_GJENLEVENDE_EKTEFELLE to DisplayName(
        "Stønad til skolepenger for gjenlevende ektefelle",
        "Allowance to cover tuition and fees for survivors",
        "Stønad til skulepengar for attlevande ektefelle"
    ),
    Innsendingsytelse.STONAD_TIL_SKOLEPENGER_FOR_TIDLIGERE_FAMILIEPLEIERE to DisplayName(
        "Stønad til skolepenger for tidligere familiepleiere",
        "Allowance to cover tuition and fees for former family caregivers",
        "Stønad til skulepengar for tidlegare familiepleiarar"
    ),
    Innsendingsytelse.STONAD_VED_BARETRANSPORT to DisplayName(
        "Stønad ved båretransport",
        "Allowance for transportation of the deceased",
        "Stønad ved båretransport"
    ),
    Innsendingsytelse.STOTTE_TIL_ARBEIDS_OG_UTDANNINGSREISER to DisplayName(
        "Støtte til arbeids- og utdanningsreiser",
        "Work and education travel grant",
        "Støtte til arbeids- og utdanningsreiser",
    ),
    Innsendingsytelse.STOTTE_TIL_FOLKEHOYSKOLE to DisplayName(
        "Støtte til folkehøyskole",
        "Folk high school grant",
        "Støtte til folkehøgskule",
    ),
    Innsendingsytelse.SUPPLERENDE_STONAD to DisplayName(
        "Supplerende stønad til personer over 67 år med kort botid i Norge",
        "Supplementary benefit for persons over 67 who have only lived a short period of time in Norway",
        "Supplerande stønad til personar over 67 år med kort butid i Noreg"
    ),
    Innsendingsytelse.SUPPLERENDE_STONAD_UFORE_FLYKTNINGER to DisplayName(
        "Supplerende stønad for uføre flyktninger under 67 år",
        "Supplementary benefit for disabled refugees under the age of 67",
        "Supplerande stønad for uføre flyktningar under 67 år"
    ),
    Innsendingsytelse.SVANGERSKAPSPENGER to DisplayName(
        "Svangerskapspenger",
        "Pregnancy benefit (Svangerskapspenger)",
        "Svangerskapspengar"
    ),
    //Deprecated
    Innsendingsytelse.SYKDOM_I_FAMILIEN to DisplayName(
        "Omsorgspenger, opplæringspenger, pleiepenger",
        "Care benefit (Omsorgspenger), training allowance (Opplæringspenger), attendance allowance (Pleiepenger)",
        "Omsorgspengar, opplæringspengar, pleiepengar"
    ),
    Innsendingsytelse.SYKEPENGER to DisplayName(
        "Sykepenger",
        "Sickness benefit (Sykepenger)",
        "Sjukepengar"
    ),
    //Deprecated
    Innsendingsytelse.TIDLIGERE_FAMILIEPLEIER to DisplayName(
        "Ytelser til tidligere familiepleier",
        "Benefits to former family caregivers",
        "Ytingar til tidlegare familiepleiarar"
    ),
    Innsendingsytelse.TILLEGGSSTONADER to DisplayName(
        "Tilleggsstønader",
        "Supplemental benefits",
        "Tilleggsstønader"
    ),
    Innsendingsytelse.TILLEGGSSTONADER_TIL_ENSLIG_MOR_ELLER_FAR to DisplayName(
        "Tilleggsstønader til enslig mor eller far",
        "Supplemental benefit for single parents",
        "Tilleggsstønader til einsleg mor eller far"
    ),
    Innsendingsytelse.TILLEGGSSTONADER_TIL_GJENLEVENDE_EKTEFELLE to DisplayName(
        "Tilleggsstønader til gjenlevende ektefelle",
        "Supplemental benefit for surviving spouse",
        "Tilleggsstønader til attlevande ektefelle"
    ),
    Innsendingsytelse.TILLEGGSSTONADER_TIL_TIDLIGERE_FAMILIEPLEIER to DisplayName(
        "Tilleggsstønader til tidligere familiepleier",
        "Supplemental benefit for former family caregivers",
        "Tilleggsstønader til tidlegare familiepleiarar"
    ),
    Innsendingsytelse.TILPASNINGSKURS_NEDSATT_SYN_OG_HORSEL to DisplayName(
        "Tilpasningskurs - nedsatt syn og hørsel",
        "Adaption course - impaired vision and hearing",
        "Tilpassingskurs - nedsett syn og høyrsel"
    ),
    Innsendingsytelse.TILSKUDD_TIL_APPER_OG_PROGRAMVARE to DisplayName(
        "Tilskudd til apper og programvare",
        "App and software grants",
        "Tilskot til appar og programvare"
    ),
    Innsendingsytelse.TILSKUDD_TIL_BIL to DisplayName(
        "Tilskudd til bil",
        "Car grants",
        "Tilskot til bil"
    ),
    Innsendingsytelse.TILSKUDD_TIL_KJOP_AV_PC_ELLER_NETTBRETT to DisplayName(
        "Tilskudd til kjøp av PC eller nettbrett ved lese- og skrivevansker",
        "Grants for the purchase of a PC or tablet in case of reading and writing difficulties",
        "Tilskot til kjøp av PC eller nettbrett ved lese- og skrivevanskar"
    ),
    Innsendingsytelse.TILSKUDD_TIL_OMBYGGING to DisplayName(
        "Tilskudd til ombygging",
        "Rebuilding grant",
        "Tilskot til ombygging"
    ),
    Innsendingsytelse.TILSKUDD_TIL_RIMELIGE_HJELPEMIDLER to DisplayName(
        "Tilskudd til rimelige hjelpemidler",
        "Affordable assistive technology grant",
        "Tilskot til rimelege hjelpemiddel"
    ),
    Innsendingsytelse.TILTAKSPENGER to DisplayName(
        "Tiltakspenger",
        "Employment scheme benefits",
        "Tiltakspengar"
    ),
    Innsendingsytelse.TOLKING_FOR_DOVE_DOVBLINDE_OG_HORSELSHEMMEDE to DisplayName(
        "Tolking for døve, døvblinde og hørselshemmede",
        "Interpretation for deaf, deafblind and individuals with impaired hearing",
        "Tolking for døve, døvblinde og høyrselshemma"
    ),
    Innsendingsytelse.UFORETRYGD to DisplayName(
        "Uføretrygd",
        "Disability benefit (Uføretrygd)",
        "Uføretrygd"
    ),
    Innsendingsytelse.UTVIDET_BARNETRYGD to DisplayName(
        "Utvidet barnetrygd",
        "Extended child benefit",
        "Utvida barnetrygd"
    ),
    Innsendingsytelse.YRKESSKADE to DisplayName(
        "Yrkesskade eller yrkessykdom",
        "Occupational injury or occupational disease",
        "Yrkesskade eller yrkessjukdom"
    ),
    Innsendingsytelse.YTELSER_TIL_TIDLIGERE_FAMILIEPLEIERE to DisplayName(
        "Ytelser til tidligere familiepleiere",
        "Benefit for former family caregivers",
        "Ytingar til tidlegare familiepleiarar"
    )
)