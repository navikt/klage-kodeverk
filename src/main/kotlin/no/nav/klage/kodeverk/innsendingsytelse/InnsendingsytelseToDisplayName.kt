package no.nav.klage.kodeverk.innsendingsytelse

val innsendingsytelseToDisplayName: Map<Innsendingsytelse, DisplayName> =
    mapOf(
        Innsendingsytelse.AVTALEFESTET_PENSJON_SPK to
            DisplayName(
                nb = "Avtalefestet pensjon (AFP) fra Statens pensjonskasse",
                en = "Contractual early retirement pension (AFP) in the public sector",
                nn = "Avtalefesta pensjon (AFP) frå Statens pensjonskasse",
            ),
        Innsendingsytelse.AVTALEFESTET_PENSJON_PRIVAT to
            DisplayName(
                nb = "Avtalefestet pensjon (AFP) i privat sektor",
                en = "Contractual early retirement pension (AFP) in the private sector",
                nn = "Avtalefesta pensjon (AFP) i privat sektor",
            ),
        Innsendingsytelse.ALDERSPENSJON to
            DisplayName(
                nb = "Alderspensjon",
                en = "Retirement pension",
                nn = "Alderspensjon",
            ),
        Innsendingsytelse.ARBEID_MED_STOTTE to
            DisplayName(
                nb = "Arbeid med støtte",
                en = "Employment support scheme",
                nn = "Arbeid med støtte",
            ),
        Innsendingsytelse.ARBEIDSAVKLARINGSPENGER to
            DisplayName(
                nb = "Arbeidsavklaringspenger (AAP)",
                en = "Work assessment allowance (AAP)",
                nn = "Arbeidsavklaringspengar (AAP)",
            ),
        Innsendingsytelse.ARBEIDSFORBEREDENDE_TRENING to
            DisplayName(
                nb = "Arbeidsforberedende trening",
                en = "Employment preparation training",
                nn = "Arbeidsførebuande trening",
            ),
        Innsendingsytelse.ARBEIDSRETTET_REHABILITERING to
            DisplayName(
                nb = "Arbeidsrettet rehabilitering",
                en = "Occupational rehabilitation",
                nn = "Arbeidsretta rehabilitering",
            ),
        Innsendingsytelse.ARBEIDSTRENING to
            DisplayName(
                nb = "Arbeidstrening",
                en = "Work training",
                nn = "Arbeidstrening",
            ),
        Innsendingsytelse.AVKLARING to
            DisplayName(
                nb = "Avklaring",
                en = "Assessment",
                nn = "Avklaring",
            ),
        Innsendingsytelse.BARNEBIDRAG to
            DisplayName(
                nb = "Barnebidrag",
                en = "Child support (Barnebidrag)",
                nn = "Barnebidrag",
            ),
        // Deprecated
        Innsendingsytelse.BARNEBIDRAG_OG_BIDRAGSFORSKUDD to
            DisplayName(
                nb = "Barnebidrag og bidragsforskudd",
                en = "Child support (Barnebidrag) and advance payments of child support (Bidragsforskudd)",
                nn = "Barnebidrag og bidragsforskot",
            ),
        Innsendingsytelse.BARNEPENSJON to
            DisplayName(
                nb = "Barnepensjon",
                en = "Children's pension (Barnepensjon)",
                nn = "Barnepensjon",
            ),
        Innsendingsytelse.BARNETRYGD to
            DisplayName(
                nb = "Barnetrygd",
                en = "Child benefit (Barnetrygd)",
                nn = "Barnetrygd",
            ),
        Innsendingsytelse.BIDRAGSFORSKUDD to
            DisplayName(
                nb = "Bidragsforskudd",
                en = "Advance payments of child support (Bidragsforskudd)",
                nn = "Bidragsforskot",
            ),
        Innsendingsytelse.BIDRAG_TIL_SARLIGE_UTGIFTER to
            DisplayName(
                nb = "Bidrag til særlige utgifter",
                en = "Support for extraordinary expenses",
                nn = "Bidrag til særlege utgifter",
            ),
        Innsendingsytelse.BILSTONAD to
            DisplayName(
                nb = "Bilstønad",
                en = "Car benefit",
                nn = "Bilstønad",
            ),
        Innsendingsytelse.DAGPENGER to
            DisplayName(
                nb = "Dagpenger",
                en = "Unemployment benefits (Dagpenger)",
                nn = "Dagpengar",
            ),
        Innsendingsytelse.DAGPENGER_TILBAKEBETALING_FORSKUDD to
            DisplayName(
                nb = "Tilbakebetaling av forskudd på dagpenger",
                en = "Repayment of advance payment of unemployment benefits (Tilbakebetaling av forskudd på dagpenger)",
                nn = "Tilbakebetaling av forskot på dagpengar",
            ),
        Innsendingsytelse.EKTEFELLEBIDRAG to
            DisplayName(
                nb = "Ektefellebidrag",
                en = "Spousal support (Ektefellebidrag)",
                nn = "Ektefellebidrag",
            ),
        Innsendingsytelse.ENGANGSSTONAD to
            DisplayName(
                nb = "Engangsstønad ved fødsel eller adopsjon",
                en = "Lump sum grant at birth or upon an adoption (Engangsstønad)",
                nn = "Eingongsstønad ved fødsel eller adopsjon",
            ),
        Innsendingsytelse.ENSLIG_MOR_ELLER_FAR to
            DisplayName(
                nb = "Enslig mor eller far",
                en = "Single mother or father",
                nn = "Einsleg mor eller far",
            ),
        Innsendingsytelse.FORELDREPENGER to
            DisplayName(
                nb = "Foreldrepenger",
                en = "Parental benefit (Foreldrepenger)",
                nn = "Foreldrepengar",
            ),
        Innsendingsytelse.FORHOYET_HJELPESTONAD to
            DisplayName(
                nb = "Forhøyet hjelpestønad",
                en = "Higher rate assistance allowance",
                nn = "Auka hjelpestønad",
            ),
        Innsendingsytelse.FORSIKRING to
            DisplayName(
                nb = "Forsikring",
                en = "Insurance",
                nn = "Forsikring",
            ),
        Innsendingsytelse.FORSIKRING_FOR_FRILANSERE to
            DisplayName(
                nb = "Forsikring for frilansere",
                en = "Insurance for freelancers",
                nn = "Forsikring for frilansarar",
            ),
        Innsendingsytelse.FORSIKRING_FOR_JORDBRUKERE_OG_REINDRIFTSUTOVERE to
            DisplayName(
                nb = "Forsikring for jordbrukere og reindriftsutøvere",
                en = "Insurance for farmers and reindeer herders",
                nn = "Forsikring for jordbrukarar og reindriftsutøvarar",
            ),
        Innsendingsytelse.FORSIKRING_FOR_SELVSTENDIG_NARINGSDRIVENDE to
            DisplayName(
                nb = "Forsikring for selvstendig næringsdrivende",
                en = "Insurance for the self-employed",
                nn = "Forsikring for sjølvstendig næringsdrivande",
            ),
        Innsendingsytelse.FRIVILLIG_MEDLEMSKAP_I_FOLKETRYGDEN_UNDER_OPPHOLD_I_NORGE to
            DisplayName(
                nb = "Frivillig medlemskap i folketrygden under opphold i Norge",
                en = "Voluntary membership of the Norwegian National Insurance Scheme during stay in Norway",
                nn = "Frivillig medlemskap i folketrygda under opphald i Noreg",
            ),
        Innsendingsytelse.FRIVILLIG_YRKESSKADETRYGD to
            DisplayName(
                nb = "Frivillig yrkesskadetrygd",
                en = "Voluntary occupational injury benefit",
                nn = "Frivillig yrkesskadetrygd",
            ),
        Innsendingsytelse.FUNKSJONSASSISTANSE_I_ARBEIDSLIVET to
            DisplayName(
                nb = "Funksjonsassistanse i arbeidslivet",
                en = "Functional assistance in the workplace",
                nn = "Funksjonsassistanse i arbeidslivet",
            ),
        Innsendingsytelse.FOLKEHOYSKOLE_ELLER_TILPASNINGSKURS to
            DisplayName(
                nb = "Folkehøyskole eller tilpasningskurs",
                en = "Folk high school or adaptation course",
                nn = "Folkehøgskule eller tilpassingskurs",
            ),
        Innsendingsytelse.FORERHUND to
            DisplayName(
                nb = "Førerhund",
                en = "Guide dog",
                nn = "Førarhund",
            ),
        Innsendingsytelse.GJENLEVENDE to
            DisplayName(
                nb = "Gjenlevendepensjon",
                en = "Survivor's pension",
                nn = "Attlevandepensjon",
            ),
        Innsendingsytelse.GRAVFERDSSTONAD to
            DisplayName(
                nb = "Gravferdsstønad",
                en = "Funeral grant (Gravferdsstønad)",
                nn = "Gravferdsstønad",
            ),
        Innsendingsytelse.GRUNNSTONAD to
            DisplayName(
                nb = "Grunnstønad",
                en = "Basic benefit (Grunnstønad)",
                nn = "Grunnstønad",
            ),
        // Deprecated
        Innsendingsytelse.GRUNN_OG_HJELPESTONAD to
            DisplayName(
                nb = "Grunnstønad og hjelpestønad",
                en = "Basic benefit (Grunnstønad) and attendance benefit (Hjelpestønad)",
                nn = "Grunnstønad og hjelpestønad",
            ),
        Innsendingsytelse.GRONT_ARBEID to
            DisplayName(
                nb = "Grønt arbeid",
                en = "Green work",
                nn = "Grønt arbeid",
            ),
        Innsendingsytelse.HJELPEMIDLER to
            DisplayName(
                nb = "Hjelpemidler og tilrettelegging ved nedsatt funksjonsevne",
                en = "Assistive technology and facilitation for impaired functional ability",
                nn = "Hjelpemiddel og tilrettelegging ved nedsatt funksjonsevne",
            ),
        Innsendingsytelse.HJELPEMIDLER_ORTOPEDISKE to
            DisplayName(
                nb = "Hjelpemidler - Ortopediske",
                en = "Assistive tools - Orthopedical",
                nn = "Hjelpemiddel - Ortopediske",
            ),
        Innsendingsytelse.HJELPESTONAD to
            DisplayName(
                nb = "Hjelpestønad",
                en = "Assistance allowance (Hjelpestønad)",
                nn = "Hjelpestønad",
            ),
        Innsendingsytelse.HOREAPPARAT_ELLER_TINNITUSMASKERER to
            DisplayName(
                nb = "Høreapparat eller tinnitusmaskerer",
                en = "Hearing aid or tinnitus maskers",
                nn = "Høyreapparat eller tinnitusmaskerar",
            ),
        Innsendingsytelse.INKLUDERINGSTILSKUDD to
            DisplayName(
                nb = "Inkluderingstilskudd",
                en = "Inclusion subsidy",
                nn = "Inkluderingstilskot",
            ),
        Innsendingsytelse.IPS to
            DisplayName(
                nb = "IPS",
                en = "IPS",
                nn = "IPS",
            ),
        Innsendingsytelse.IPS_UNG to
            DisplayName(
                nb = "IPS ung",
                en = "IPS Youth",
                nn = "IPS ung",
            ),
        Innsendingsytelse.JOBBKLUBB to
            DisplayName(
                nb = "Jobbklubb",
                en = "Job club",
                nn = "Jobbklubb",
            ),
        Innsendingsytelse.JOBBMESTRENDE_OPPFOLGING to
            DisplayName(
                nb = "Jobbmestrende oppfølging",
                en = "Work proficiency follow-up",
                nn = "Jobbmeistrande oppfølging",
            ),
        Innsendingsytelse.JOBBSOKERKURS to
            DisplayName(
                nb = "Jobbsøkerkurs",
                en = "Job seeker course",
                nn = "Jobbsøkjarkurs",
            ),
        Innsendingsytelse.KONTANTSTOTTE to
            DisplayName(
                nb = "Kontantstøtte",
                en = "Cash-for-care benefit (Kontantstøtte)",
                nn = "Kontantstøtte",
            ),
        Innsendingsytelse.KRIGSPENSJON to
            DisplayName(
                nb = "Krigspensjon",
                en = "War pension (Krigspensjon)",
                nn = "Krigspensjon",
            ),
        Innsendingsytelse.LESE_OG_SEKRETARHJELP to
            DisplayName(
                nb = "Lese- og sekretærhjelp",
                en = "Reading and secretarial assistance",
                nn = "Lese- og sekretærhjelp",
            ),
        Innsendingsytelse.LONNSGARANTI to
            DisplayName(
                nb = "Lønnsgaranti",
                en = "Wage guarantee",
                nn = "Lønsgaranti",
            ),
        Innsendingsytelse.LONNSKOMPENSASJON to
            DisplayName(
                nb = "Lønnskompensasjon for permitterte",
                en = "Salary compensation for persons who are laid-off",
                nn = "Lønskompensasjon for permitterte",
            ),
        Innsendingsytelse.MEDLEMSKAP to
            DisplayName(
                nb = "Medlemskap",
                en = "Membership",
                nn = "Medlemskap",
            ),
        Innsendingsytelse.MEDLEMSKAP_I_FOLKETRYGDEN_UNDER_OPPHOLD_I_EOS_ELLER_SVEITS to
            DisplayName(
                nb = "Medlemskap i folketrygden under opphold i EØS eller Sveits",
                en = "Membership in the national insurance during stay in the EEA or Switzerland",
                nn = "Medlemskap i folketrygda under opphald i EØS eller Sveits",
            ),
        Innsendingsytelse.MEDLEMSKAP_I_FOLKETRYGDEN_UNDER_OPPHOLD_UTENFOR_EOS to
            DisplayName(
                nb = "Medlemskap i folketrygden under opphold utenfor EØS",
                en = "Membership in the Norwegian National Insurance Scheme while staying in a country outside EEA or Switzerland",
                nn = "Medlemskap i folketrygda under opphald utanfor EØS",
            ),
        Innsendingsytelse.MENERSTATNING_VED_YRKESSKADE_ELLER_YRKESSYKDOM to
            DisplayName(
                nb = "Menerstatning ved yrkesskade eller yrkessykdom",
                en = "Permanent impairment compensation in the event of an occupational injury or illness",
                nn = "Meinerstatning ved yrkesskade eller yrkessjukdom",
            ),
        Innsendingsytelse.MENTOR to
            DisplayName(
                nb = "Mentor",
                en = "Mentor",
                nn = "Mentor",
            ),
        // Deprecated
        Innsendingsytelse.MIDLERTIDIG_KOMPENSASJON to
            DisplayName(
                nb = "Midlertidig kompensasjon for selvstendig næringsdrivende og frilansere",
                en = "Temporary compensation for self-employed and freelancers",
                nn = "Midlertidig kompensasjon for sjølvstendig næringsdrivande og frilansarar",
            ),
        Innsendingsytelse.MIDLERTIDIG_LONNSTILSKUDD to
            DisplayName(
                nb = "Midlertidig lønnstilskudd",
                en = "Timelimited wage subsidies",
                nn = "Mellombels lønstilskot",
            ),
        Innsendingsytelse.MINSTEPENSJON_I_ALDERSPENSJONEN to
            DisplayName(
                nb = "Minstepensjon i alderspensjonen",
                en = "Minimum pension: minimum pension level and guaranteed pension",
                nn = "Minstepensjon i alderspensjonen",
            ),
        Innsendingsytelse.NAV_LOVEN_14A to
            DisplayName(
                nb = "Vurdering av behov for bistand etter NAV-loven § 14 a",
                en = "Assessment of need for assistance according to Section 14 a of the NAV Act",
                nn = "Vurdering av behov for bistand etter NAV-lova § 14 a",
            ),
        Innsendingsytelse.OMSORGSPENGER_HJEMME_MED_SYKT_BARN_DAGER to
            DisplayName(
                nb = "Omsorgspenger (hjemme med sykt barn-dager)",
                en = "Care benefit (at home with a sick child days)",
                nn = "Omsorgspengar (heime med sjukt barn-dagar)",
            ),
        Innsendingsytelse.OMSTILLINGSSTONAD to
            DisplayName(
                nb = "Omstillingsstønad",
                en = "Adjustment allowance (Omstillingsstønad)",
                nn = "Omstillingsstønad",
            ),
        Innsendingsytelse.OPPFOSTRINGSBIDRAG to
            DisplayName(
                nb = "Oppfostringsbidrag",
                en = "Upbringing support (Oppfostringsbidrag)",
                nn = "Oppfostringsbidrag",
            ),
        Innsendingsytelse.OPPFOLGING to
            DisplayName(
                nb = "Oppfølging",
                en = "Follow up",
                nn = "Oppfølging",
            ),
        Innsendingsytelse.OPPLARING to
            DisplayName(
                nb = "Opplæring",
                en = "Training",
                nn = "Opplæring",
            ),
        Innsendingsytelse.OPPLARINGSPENGER to
            DisplayName(
                nb = "Opplæringspenger",
                en = "Training allowance",
                nn = "Opplæringspengar",
            ),
        Innsendingsytelse.OPPHOLD_ELLER_ARBEID_I_NORGE to
            DisplayName(
                nb = "Opphold eller arbeid i Norge",
                en = "Residence or work in Norway",
                nn = "Opphald eller arbeid i Noreg",
            ),
        // Deprecated
        Innsendingsytelse.OPPHOLD_ELLER_ARBEID_UTENFOR_NORGE to
            DisplayName(
                nb = "Opphold eller arbeid utenfor Norge",
                en = "Residence or work outside Norway",
                nn = "Opphald eller arbeid utanfor Noreg",
            ),
        Innsendingsytelse.ORTOPEDISKE_HJELPEMIDLER to
            DisplayName(
                nb = "Ortopediske hjelpemidler",
                en = "Orthopedic assistive devices",
                nn = "Ortopediske hjelpemiddel",
            ),
        Innsendingsytelse.OVERGANGSSTONAD_TIL_ENSLIG_MOR_ELLER_FAR to
            DisplayName(
                nb = "Overgangsstønad til enslig mor eller far",
                en = "Transitional benefit for single parents",
                nn = "Overgangsstønad til einslig mor eller far",
            ),
        Innsendingsytelse.OVERGANGSSTONAD_TIL_GJENLEVENDE to
            DisplayName(
                nb = "Overgangsstønad til gjenlevende",
                en = "Transitional benefit for survivors",
                nn = "Overgangsstønad til attlevande",
            ),
        Innsendingsytelse.PENSJONSOPPTJENING_VED_OMSORG_FOR_BARN to
            DisplayName(
                nb = "Pensjonsopptjening ved omsorg for barn",
                en = "Accumulation of pension rights for care work for children",
                nn = "Pensjonsopptening ved omsorg for barn",
            ),
        Innsendingsytelse.PENSJONSOPPTJENING_VED_OMSORG_FOR_SYKE_ELDRE_OG_PERSONER_MED_FUNKSJONSNEDSETTELSER to
            DisplayName(
                nb = "Pensjonsopptjening ved omsorg for syke, eldre og personer med funksjonsnedsettelser",
                en = "Accumulation of pension rights for care work for sick, disabled or elderly people",
                nn = "Pensjonsopptening ved omsorg for sjuke, eldre og personar med nedsett funksjon",
            ),
        Innsendingsytelse.PLEIEPENGER_FOR_EN_UTVIKLINGSHEMMET_PERSON_OVER_18_AR to
            DisplayName(
                nb = "Pleiepenger for en utviklingshemmet person over 18 år",
                en = "Attendance allowance for developmentally disabled person over 18",
                nn = "Pleiepengar for ein utviklingshemma person over 18 år",
            ),
        Innsendingsytelse.PLEIEPENGER_FOR_SYKT_BARN to
            DisplayName(
                nb = "Pleiepenger for sykt barn",
                en = "Attendance allowance for sick children",
                nn = "Pleiepengar for sjukt barn",
            ),
        Innsendingsytelse.PLEIEPENGER_I_LIVETS_SLUTTFASE to
            DisplayName(
                nb = "Pleiepenger i livets sluttfase",
                en = "Attendance allowance in the final phase of life",
                nn = "Pleiepengar i sluttfasen av livet",
            ),
        // Deprecated
        Innsendingsytelse.REISEKOSTNADER_VED_SAMVAER to
            DisplayName(
                nb = "Reisekostnader ved samvær",
                en = "Travel costs for visits",
                nn = "Reisekostnader ved samvær",
            ),
        Innsendingsytelse.REISEKOSTNADER_VED_SAMVAR to
            DisplayName(
                nb = "Reisekostnader ved samvær",
                en = "Travel costs for visits",
                nn = "Reisekostnader ved samvær",
            ),
        Innsendingsytelse.REISETILSKUDD to
            DisplayName(
                nb = "Reisetilskudd",
                en = "Travel allowance",
                nn = "Reisetilskot",
            ),
        Innsendingsytelse.REISEUTGIFTER to
            DisplayName(
                nb = "Reiseutgifter",
                en = "Travel expenses",
                nn = "Reiseutgifter",
            ),
        Innsendingsytelse.SENTER_FOR_JOBBMESTRING to
            DisplayName(
                nb = "Senter for jobbmestring",
                en = "Job coping centre",
                nn = "Senter for jobbmeistring",
            ),
        Innsendingsytelse.SERVICEHUND to
            DisplayName(
                nb = "Servicehund",
                en = "Service dog",
                nn = "Servicehund",
            ),
        Innsendingsytelse.STUDIER_MED_STOTTE to
            DisplayName(
                nb = "Studier med støtte",
                en = "Studies with support (support to finish school)",
                nn = "Studiar med støtte",
            ),
        Innsendingsytelse.STONAD_TIL_BARNETILSYN_FOR_ENSLIG_MOR_ELLER_FAR to
            DisplayName(
                nb = "Stønad til barnetilsyn for enslig mor eller far",
                en = "Child care benefit for single parents",
                nn = "Stønad til barnetilsyn for einsleg mor eller far",
            ),
        Innsendingsytelse.STONAD_TIL_BARNETILSYN_FOR_GJENLEVENDE_EKTEFELLE to
            DisplayName(
                nb = "Stønad til barnetilsyn for gjenlevende ektefelle",
                en = "Child care benefits for surviving spouse",
                nn = "Stønad til barnetilsyn for attlevande ektefelle",
            ),
        Innsendingsytelse.STONAD_TIL_SKOLEPENGER_FOR_ENSLIG_MOR_ELLER_FAR to
            DisplayName(
                nb = "Stønad til skolepenger for enslig mor eller far",
                en = "Allowance to cover tuition and fees for single parents",
                nn = "Stønad til skulepengar for einsleg mor eller far",
            ),
        Innsendingsytelse.STONAD_TIL_SKOLEPENGER_FOR_GJENLEVENDE_EKTEFELLE to
            DisplayName(
                nb = "Stønad til skolepenger for gjenlevende ektefelle",
                en = "Allowance to cover tuition and fees for survivors",
                nn = "Stønad til skulepengar for attlevande ektefelle",
            ),
        Innsendingsytelse.STONAD_TIL_SKOLEPENGER_FOR_TIDLIGERE_FAMILIEPLEIERE to
            DisplayName(
                nb = "Stønad til skolepenger for tidligere familiepleiere",
                en = "Allowance to cover tuition and fees for former family caregivers",
                nn = "Stønad til skulepengar for tidlegare familiepleiarar",
            ),
        Innsendingsytelse.STONAD_VED_BARETRANSPORT to
            DisplayName(
                nb = "Stønad ved båretransport",
                en = "Allowance for transportation of the deceased",
                nn = "Stønad ved båretransport",
            ),
        Innsendingsytelse.STOTTE_TIL_ARBEIDS_OG_UTDANNINGSREISER to
            DisplayName(
                nb = "Støtte til arbeids- og utdanningsreiser",
                en = "Work and education travel grant",
                nn = "Støtte til arbeids- og utdanningsreiser",
            ),
        Innsendingsytelse.STOTTE_TIL_FOLKEHOYSKOLE to
            DisplayName(
                nb = "Støtte til folkehøyskole",
                en = "Folk high school grant",
                nn = "Støtte til folkehøgskule",
            ),
        Innsendingsytelse.SUPPLERENDE_STONAD to
            DisplayName(
                nb = "Supplerende stønad til personer over 67 år med kort botid i Norge",
                en = "Supplementary benefit for persons over 67 who have only lived a short period of time in Norway",
                nn = "Supplerande stønad til personar over 67 år med kort butid i Noreg",
            ),
        Innsendingsytelse.SUPPLERENDE_STONAD_UFORE_FLYKTNINGER to
            DisplayName(
                nb = "Supplerende stønad for uføre flyktninger under 67 år",
                en = "Supplementary benefit for disabled refugees under the age of 67",
                nn = "Supplerande stønad for uføre flyktningar under 67 år",
            ),
        Innsendingsytelse.SVANGERSKAPSPENGER to
            DisplayName(
                nb = "Svangerskapspenger",
                en = "Pregnancy benefit (Svangerskapspenger)",
                nn = "Svangerskapspengar",
            ),
        // Deprecated
        Innsendingsytelse.SYKDOM_I_FAMILIEN to
            DisplayName(
                nb = "Omsorgspenger, opplæringspenger, pleiepenger",
                en = "Care benefit (Omsorgspenger), training allowance (Opplæringspenger), attendance allowance (Pleiepenger)",
                nn = "Omsorgspengar, opplæringspengar, pleiepengar",
            ),
        Innsendingsytelse.SYKEPENGER to
            DisplayName(
                nb = "Sykepenger",
                en = "Sickness benefit (Sykepenger)",
                nn = "Sjukepengar",
            ),
        // Deprecated
        Innsendingsytelse.TIDLIGERE_FAMILIEPLEIER to
            DisplayName(
                nb = "Ytelser til tidligere familiepleier",
                en = "Benefits to former family caregivers",
                nn = "Ytingar til tidlegare familiepleiarar",
            ),
        Innsendingsytelse.TILLEGGSSTONADER to
            DisplayName(
                nb = "Tilleggsstønader",
                en = "Supplemental benefits",
                nn = "Tilleggsstønader",
            ),
        Innsendingsytelse.TILLEGGSSTONADER_TIL_ENSLIG_MOR_ELLER_FAR to
            DisplayName(
                nb = "Tilleggsstønader til enslig mor eller far",
                en = "Supplemental benefit for single parents",
                nn = "Tilleggsstønader til einsleg mor eller far",
            ),
        Innsendingsytelse.TILLEGGSSTONADER_TIL_GJENLEVENDE_EKTEFELLE to
            DisplayName(
                nb = "Tilleggsstønader til gjenlevende ektefelle",
                en = "Supplemental benefit for surviving spouse",
                nn = "Tilleggsstønader til attlevande ektefelle",
            ),
        Innsendingsytelse.TILLEGGSSTONADER_TIL_TIDLIGERE_FAMILIEPLEIER to
            DisplayName(
                nb = "Tilleggsstønader til tidligere familiepleier",
                en = "Supplemental benefit for former family caregivers",
                nn = "Tilleggsstønader til tidlegare familiepleiarar",
            ),
        Innsendingsytelse.TILPASNINGSKURS_NEDSATT_SYN_OG_HORSEL to
            DisplayName(
                nb = "Tilpasningskurs - nedsatt syn og hørsel",
                en = "Adaption course - impaired vision and hearing",
                nn = "Tilpassingskurs - nedsett syn og høyrsel",
            ),
        Innsendingsytelse.TILSKUDD_TIL_APPER_OG_PROGRAMVARE to
            DisplayName(
                nb = "Tilskudd til apper og programvare",
                en = "App and software grants",
                nn = "Tilskot til appar og programvare",
            ),
        Innsendingsytelse.TILSKUDD_TIL_BIL to
            DisplayName(
                nb = "Tilskudd til bil",
                en = "Car grants",
                nn = "Tilskot til bil",
            ),
        Innsendingsytelse.TILSKUDD_TIL_KJOP_AV_PC_ELLER_NETTBRETT to
            DisplayName(
                nb = "Tilskudd til kjøp av PC eller nettbrett ved lese- og skrivevansker",
                en = "Grants for the purchase of a PC or tablet in case of reading and writing difficulties",
                nn = "Tilskot til kjøp av PC eller nettbrett ved lese- og skrivevanskar",
            ),
        Innsendingsytelse.TILSKUDD_TIL_OMBYGGING to
            DisplayName(
                nb = "Tilskudd til ombygging",
                en = "Rebuilding grant",
                nn = "Tilskot til ombygging",
            ),
        Innsendingsytelse.TILSKUDD_TIL_RIMELIGE_HJELPEMIDLER to
            DisplayName(
                nb = "Tilskudd til rimelige hjelpemidler",
                en = "Affordable assistive technology grant",
                nn = "Tilskot til rimelege hjelpemiddel",
            ),
        Innsendingsytelse.TILSKUDD_TIL_SOMMERJOBB to
            DisplayName(
                nb = "Tilskudd til sommerjobb",
                en = "Summer job grants",
                nn = "Tilskot til sommarjobb",
            ),
        Innsendingsytelse.TILTAKSPENGER to
            DisplayName(
                nb = "Tiltakspenger",
                en = "Employment scheme benefits",
                nn = "Tiltakspengar",
            ),
        Innsendingsytelse.TOLKING_FOR_DOVE_DOVBLINDE_OG_HORSELSHEMMEDE to
            DisplayName(
                nb = "Tolking for døve, døvblinde og hørselshemmede",
                en = "Interpretation for deaf, deafblind and individuals with impaired hearing",
                nn = "Tolking for døve, døvblinde og høyrselshemma",
            ),
        Innsendingsytelse.UFORETRYGD to
            DisplayName(
                nb = "Uføretrygd",
                en = "Disability benefit (Uføretrygd)",
                nn = "Uføretrygd",
            ),
        Innsendingsytelse.UNGDOMSPROGRAMMET to
            DisplayName(
                nb = "Ungdomsprogrammet",
                en = "Youth Program",
                nn = "Ungdomsprogrammet",
            ),
        Innsendingsytelse.UTVIDET_BARNETRYGD to
            DisplayName(
                nb = "Utvidet barnetrygd",
                en = "Extended child benefit",
                nn = "Utvida barnetrygd",
            ),
        Innsendingsytelse.VARIG_LONNSTILSKUDD to
            DisplayName(
                nb = "Varig lønnstilskudd",
                en = "Permanent wage subsidy",
                nn = "Varig lønstilskot",
            ),
        Innsendingsytelse.VARIG_TILRETTELAGT_ARBEID to
            DisplayName(
                nb = "Varig tilrettelagt arbeid",
                en = "Permanent adapted work",
                nn = "Varig tilrettelagt arbeid",
            ),
        Innsendingsytelse.YRKESSKADE to
            DisplayName(
                nb = "Yrkesskade eller yrkessykdom",
                en = "Occupational injury or occupational disease",
                nn = "Yrkesskade eller yrkessjukdom",
            ),
        Innsendingsytelse.YTELSER_TIL_TIDLIGERE_FAMILIEPLEIERE to
            DisplayName(
                nb = "Ytelser til tidligere familiepleiere",
                en = "Benefit for former family caregivers",
                nn = "Ytingar til tidlegare familiepleiarar",
            ),
    )
