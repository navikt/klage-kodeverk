package no.nav.klage.kodeverk.ytelse

val ytelseToDisplayName: Map<Ytelse, DisplayName> =
    mapOf(
        Ytelse.OMS_OMP to
            DisplayName(
                nb = "Omsorgspenger",
                en = "Care benefit",
                nn = "Omsorgspengar",
            ),
        Ytelse.OMS_OLP to
            DisplayName(
                nb = "Opplæringspenger",
                en = "Training allowance",
                nn = "Opplæringspengar",
            ),
        Ytelse.OMS_PSB to
            DisplayName(
                nb = "Pleiepenger sykt barn",
                en = "Attendance allowance for sick children",
                nn = "Pleiepengar for sjukt barn",
            ),
        Ytelse.OMS_PLS to
            DisplayName(
                nb = "Pleiepenger i livets sluttfase",
                en = "Attendance allowance in the final phase of life",
                nn = "Pleiepengar i sluttfasen av livet",
            ),
        Ytelse.SYK_SYK to
            DisplayName(
                nb = "Sykepenger",
                en = "Sickness benefit (Sykepenger)",
                nn = "Sjukepengar",
            ),
        Ytelse.FOR_FOR to
            DisplayName(
                nb = "Foreldrepenger",
                en = "Parental benefit (Foreldrepenger)",
                nn = "Foreldrepengar",
            ),
        Ytelse.FOR_ENG to
            DisplayName(
                nb = "Engangsstønad",
                en = "Lump-sum grant (Engangsstønad)",
                nn = "Eingongsstønad",
            ),
        Ytelse.FOR_SVA to
            DisplayName(
                nb = "Svangerskapspenger",
                en = "Pregnancy benefit (Svangerskapspenger)",
                nn = "Svangerskapspengar",
            ),
        Ytelse.AAP_AAP to
            DisplayName(
                nb = "Arbeidsavklaringspenger (AAP)",
                en = "Work assessment allowance (AAP)",
                nn = "Arbeidsavklaringspengar (AAP)",
            ),
        Ytelse.BAR_BAR to
            DisplayName(
                nb = "Barnetrygd",
                en = "Child benefit (Barnetrygd)",
                nn = "Barnetrygd",
            ),
        Ytelse.BID_BAB to
            DisplayName(
                nb = "Barnebidrag",
                en = "Child support (Barnebidrag)",
                nn = "Barnebidrag",
            ),
        Ytelse.BID_BIF to
            DisplayName(
                nb = "Bidragsforskudd",
                en = "Advance payments of child support (Bidragsforskudd)",
                nn = "Bidragsforskot",
            ),
        Ytelse.BID_OPI to
            DisplayName(
                nb = "Oppfostringsbidrag",
                en = "Upbringing support (Oppfostringsbidrag)",
                nn = "Oppfostringsbidrag",
            ),
        Ytelse.BID_EKB to
            DisplayName(
                nb = "Ektefellebidrag",
                en = "Spousal support (Ektefellebidrag)",
                nn = "Ektefellebidrag",
            ),
        Ytelse.BID_BII to
            DisplayName(
                nb = "Bidragsinnkreving",
                en = "Collection of child support",
                nn = "Bidragsinnkrevjing",
            ),
        Ytelse.DAG_DAG to
            DisplayName(
                nb = "Dagpenger",
                en = "Unemployment benefits (Dagpenger)",
                nn = "Dagpengar",
            ),
        Ytelse.ENF_ENF to
            DisplayName(
                nb = "Enslig mor eller far",
                en = "Single mother or father",
                nn = "Einsleg mor eller far",
            ),
        Ytelse.GEN_GEN to
            DisplayName(
                nb = "Lønnsgaranti",
                en = "Wage guarantee",
                nn = "Lønsgaranti",
            ),
        Ytelse.GRA_GRA to
            DisplayName(
                nb = "Gravferdsstønad",
                en = "Funeral grant (Gravferdsstønad)",
                nn = "Gravferdsstønad",
            ),
        Ytelse.GRU_HJE to
            DisplayName(
                nb = "Hjelpestønad",
                en = "Assistance allowance (Hjelpestønad)",
                nn = "Hjelpestønad",
            ),
        Ytelse.GRU_GRU to
            DisplayName(
                nb = "Grunnstønad",
                en = "Basic benefit (Grunnstønad)",
                nn = "Grunnstønad",
            ),
        Ytelse.HJE_HJE to
            DisplayName(
                nb = "Hjelpemidler - Tekniske",
                en = "Assistive tools - Technical",
                nn = "Hjelpemiddel - Tekniske",
            ),
        Ytelse.KON_KON to
            DisplayName(
                nb = "Kontantstøtte",
                en = "Cash-for-care benefit (Kontantstøtte)",
                nn = "Kontantstønad",
            ),
        Ytelse.MED_MED to
            DisplayName(
                nb = "Medlemskap",
                en = "Membership",
                nn = "Medlemskap",
            ),
        Ytelse.PEN_ALD to
            DisplayName(
                nb = "Alderspensjon",
                en = "Retirement pension",
                nn = "Alderspensjon",
            ),
        Ytelse.PEN_BAR to
            DisplayName(
                nb = "Barnepensjon",
                en = "Children's pension (Barnepensjon)",
                nn = "Barnepensjon",
            ),
        Ytelse.PEN_AFP to
            DisplayName(
                nb = "Avtalefestet pensjon (AFP)",
                en = "Contractual early retirement pension (AFP)",
                nn = "Avtalefesta pensjon (AFP)",
            ),
        Ytelse.PEN_KRI to
            DisplayName(
                nb = "Krigspensjon",
                en = "War pension (Krigspensjon)",
                nn = "Krigspensjon",
            ),
        Ytelse.PEN_GJE to
            DisplayName(
                nb = "Gjenlevendepensjon",
                en = "Survivor's pension",
                nn = "Attlevandepensjon",
            ),
        Ytelse.PEN_EYO to
            DisplayName(
                nb = "Omstillingsstønad",
                en = "Adjustment allowance (Omstillingsstønad)",
                nn = "Omstillingsstønad",
            ),
        Ytelse.SUP_PEN to
            DisplayName(
                nb = "Supplerende stønad",
                en = "Supplementary benefit",
                nn = "Supplerande stønad",
            ),
        Ytelse.SUP_UFF to
            DisplayName(
                nb = "Supplerende stønad til uføre flyktninger",
                en = "Supplementary benefit for disabled refugees",
                nn = "Supplerande stønad til uføre flyktningar",
            ),
        Ytelse.TIL_TIP to
            DisplayName(
                nb = "Tiltakspenger",
                en = "Employment scheme benefits",
                nn = "Tiltakspengar",
            ),
        Ytelse.TIL_TIL to
            DisplayName(
                nb = "Tiltaksplass",
                en = "Participation in labour market schemes",
                nn = "Tiltaksplass",
            ),
        Ytelse.UFO_UFO to
            DisplayName(
                nb = "Uføretrygd",
                en = "Disability benefit (Uføretrygd)",
                nn = "Uføretrygd",
            ),
        Ytelse.YRK_YRK to
            DisplayName(
                nb = "Yrkesskade",
                en = "Occupational injury",
                nn = "Yrkesskade",
            ),
        Ytelse.YRK_MEN to
            DisplayName(
                nb = "Menerstatning",
                en = "Permanent impairment compensation",
                nn = "Meinerstatning",
            ),
        Ytelse.YRK_YSY to
            DisplayName(
                nb = "Yrkessykdom",
                en = "Occupational disease",
                nn = "Yrkessjukdom",
            ),
        Ytelse.UFO_TVF to
            DisplayName(
                nb = "Tvungen forvalting",
                en = "Sanctioned administration",
                nn = "Tvungen forvalting",
            ),
        Ytelse.OPP_OPP to
            DisplayName(
                nb = "NAV-loven §14a",
                en = "Section 14 a of the NAV Act",
                nn = "NAV-lova § 14a",
            ),
        Ytelse.AAR_AAR to
            DisplayName(
                nb = "AA-register",
                en = "AA registry",
                nn = "AA-register",
            ),
        Ytelse.HJE_AUR to
            DisplayName(
                nb = "Støtte til arbeids- og utdanningsreiser",
                en = "Work and education travel grant",
                nn = "Stønad til arbeids- og utdanningsreiser",
            ),
        Ytelse.TSR_ASO to
            DisplayName(
                nb = "Tilleggsstønad arbeidssøkere",
                en = "Supplemental benefit for jobseekers",
                nn = "Tilleggsstønad arbeidssøkjarar",
            ),
        Ytelse.FRI_FRI to
            DisplayName(
                nb = "Kompensasjonsytelse for selvstendig næringsdrivende og frilansere",
                en = "Compensation for self-employed and freelancers",
                nn = "Kompensasjonsyting for sjølvstendig næringsdrivande og frilansarar",
            ),
        Ytelse.TSO_TSO to
            DisplayName(
                nb = "Tilleggsstønad",
                en = "Supplemental benefit",
                nn = "Tilleggsstønad",
            ),
        Ytelse.FAR_FAR to
            DisplayName(
                nb = "Far- og morskap",
                en = "Parenthood",
                nn = "Far- og morskap",
            ),
        Ytelse.BID_BBF to
            DisplayName(
                nb = "Barnebortføring",
                en = "Child abduction",
                nn = "Barnebortføring",
            ),
        Ytelse.DAG_LKP to
            DisplayName(
                nb = "Lønnskompensasjon for permitterte",
                en = "Salary compensation for people who are laid-off",
                nn = "Lønskompensasjon for permitterte",
            ),
        Ytelse.DAG_FDP to
            DisplayName(
                nb = "Forskudd dagpenger",
                en = "Advance payment of unemployment benefits (Forskudd på dagpenger)",
                nn = "Forskot dagpengar",
            ),
        Ytelse.BIL_BIL to
            DisplayName(
                nb = "Hjelpemidler - Bil og motorkjøretøy",
                en = "Assistive tools - Car and motorized vehicles",
                nn = "Hjelpemiddel - Bil og motorkjøyretøy",
            ),
        Ytelse.HEL_HEL to
            DisplayName(
                nb = "Hjelpemidler - Ortopediske",
                en = "Assistive tools - Orthopedical",
                nn = "Hjelpemiddel - Ortopediske",
            ),
        Ytelse.FOS_FOS to
            DisplayName(
                nb = "Forsikring",
                en = "Insurance",
                nn = "Forsikring",
            ),
        Ytelse.PAR_PAR to DisplayName(nb = "Partsinnsyn", en = "Part transparency", nn = "Partsinnsyn"),
        Ytelse.UNG_UNG to
            DisplayName(
                nb = "Ungdomsprogramytelsen",
                en = "Youth Program benefit",
                nn = "Ungdomsprogramytinga",
            ),
        Ytelse.PEN_GYS to
            DisplayName(
                nb = "Gammel yrkesskade",
                en = "Old occupational injury",
                nn = "Gammal yrkesskade",
            ),
    )
