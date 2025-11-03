package no.nav.klage.kodeverk.ytelse

val ytelseToDisplayName: Map<Ytelse, DisplayName> = mapOf(
    Ytelse.OMS_OMP to DisplayName(
        "Omsorgspenger", "Care benefit", "Omsorgspengar",
    ),
    Ytelse.OMS_OLP to DisplayName(
        "Opplæringspenger", "Training allowance", "Opplæringspengar",
    ),
    Ytelse.OMS_PSB to DisplayName(
        "Pleiepenger sykt barn",
        "Attendance allowance for sick children",
        "Pleiepengar for sjukt barn",
    ),
    Ytelse.OMS_PLS to DisplayName(
        "Pleiepenger i livets sluttfase",
        "Attendance allowance in the final phase of life",
        "Pleiepengar i sluttfasen av livet",
    ),
    Ytelse.SYK_SYK to DisplayName(
        "Sykepenger", "Sickness benefit (Sykepenger)", "Sjukepengar",
    ),
    Ytelse.FOR_FOR to DisplayName(
        "Foreldrepenger", "Parental benefit (Foreldrepenger)", "Foreldrepengar",
    ),
    Ytelse.FOR_ENG to DisplayName(
        "Engangsstønad", "Lump-sum grant (Engangsstønad)", "Eingongsstønad",
    ),
    Ytelse.FOR_SVA to DisplayName(
        "Svangerskapspenger", "Pregnancy benefit (Svangerskapspenger)", "Svangerskapspengar",
    ),
    Ytelse.AAP_AAP to DisplayName(
        "Arbeidsavklaringspenger (AAP)",
        "Work assessment allowance (AAP)",
        "Arbeidsavklaringspengar (AAP)",
    ),
    Ytelse.BAR_BAR to DisplayName(
        "Barnetrygd", "Child benefit (Barnetrygd)", "Barnetrygd",
    ),
    Ytelse.BID_BAB to DisplayName(
        "Barnebidrag", "Child support (Barnebidrag)", "Barnebidrag",
    ),
    Ytelse.BID_BIF to DisplayName(
        "Bidragsforskudd",
        "Advance payments of child support (Bidragsforskudd)",
        "Bidragsforskot",
    ),
    Ytelse.BID_OPI to DisplayName(
        "Oppfostringsbidrag", "Upbringing support (Oppfostringsbidrag)", "Oppfostringsbidrag",
    ),
    Ytelse.BID_EKB to DisplayName(
        "Ektefellebidrag", "Spousal support (Ektefellebidrag)", "Ektefellebidrag",
    ),
    Ytelse.BID_BII to DisplayName(
        "Bidragsinnkreving", "Collection of child support", "Bidragsinnkrevjing",
    ),
    Ytelse.DAG_DAG to DisplayName(
        "Dagpenger", "Unemployment benefits (Dagpenger)", "Dagpengar",
    ),
    Ytelse.ENF_ENF to DisplayName(
        "Enslig mor eller far", "Single mother or father", "Einsleg mor eller far",
    ),
    Ytelse.GEN_GEN to DisplayName(
        "Lønnsgaranti", "Wage guarantee", "Lønsgaranti",
    ),
    Ytelse.GRA_GRA to DisplayName(
        "Gravferdsstønad", "Funeral grant (Gravferdsstønad)", "Gravferdsstønad",
    ),
    Ytelse.GRU_HJE to DisplayName(
        "Hjelpestønad", "Assistance allowance (Hjelpestønad)", "Hjelpestønad",
    ),
    Ytelse.GRU_GRU to DisplayName(
        "Grunnstønad", "Basic benefit (Grunnstønad)", "Grunnstønad",
    ),
    Ytelse.HJE_HJE to DisplayName(
        "Hjelpemidler - Tekniske", "Assistive tools - Technical", "Hjelpemiddel - Tekniske",
    ),
    Ytelse.KON_KON to DisplayName(
        "Kontantstøtte", "Cash-for-care benefit (Kontantstøtte)", "Kontantstønad",
    ),
    Ytelse.MED_MED to DisplayName(
        "Medlemskap", "Membership", "Medlemskap",
    ),
    Ytelse.PEN_ALD to DisplayName(
        "Alderspensjon", "Retirement pension", "Alderspensjon",
    ),
    Ytelse.PEN_BAR to DisplayName(
        "Barnepensjon", "Children's pension (Barnepensjon)", "Barnepensjon",
    ),
    Ytelse.PEN_AFP to DisplayName(
        "Avtalefestet pensjon (AFP)",
        "Contractual early retirement pension (AFP)",
        "Avtalefesta pensjon (AFP)",
    ),
    Ytelse.PEN_KRI to DisplayName(
        "Krigspensjon", "War pension (Krigspensjon)", "Krigspensjon",
    ),
    Ytelse.PEN_GJE to DisplayName(
        "Gjenlevendepensjon", "Survivor's pension", "Attlevandepensjon",
    ),
    Ytelse.PEN_EYO to DisplayName(
        "Omstillingsstønad", "Adjustment allowance (Omstillingsstønad)", "Omstillingsstønad",
    ),
    Ytelse.SUP_PEN to DisplayName(
        "Supplerende stønad", "Supplementary benefit", "Supplerande stønad",
    ),
    Ytelse.SUP_UFF to DisplayName(
        "Supplerende stønad til uføre flyktninger",
        "Supplementary benefit for disabled refugees",
        "Supplerande stønad til uføre flyktningar",
    ),
    Ytelse.TIL_TIP to DisplayName(
        "Tiltakspenger", "Employment scheme benefits", "Tiltakspengar",
    ),
    Ytelse.TIL_TIL to DisplayName(
        "Tiltaksplass", "Participation in labour market schemes", "Tiltaksplass",
    ),
    Ytelse.UFO_UFO to DisplayName(
        "Uføretrygd", "Disability benefit (Uføretrygd)", "Uføretrygd",
    ),
    Ytelse.YRK_YRK to DisplayName(
        "Yrkesskade", "Occupational injury", "Yrkesskade",
    ),
    Ytelse.YRK_MEN to DisplayName(
        "Menerstatning", "Permanent impairment compensation", "Meinerstatning",
    ),
    Ytelse.YRK_YSY to DisplayName(
        "Yrkessykdom", "Occupational disease", "Yrkessjukdom",
    ),
    Ytelse.UFO_TVF to DisplayName(
        "Tvungen forvalting", "Sanctioned administration", "Tvungen forvalting",
    ),
    Ytelse.OPP_OPP to DisplayName(
        "NAV-loven §14a", "Section 14 a of the NAV Act", "NAV-lova § 14a",
    ),
    Ytelse.AAR_AAR to DisplayName(
        "AA-register", "AA registry", "AA-register",
    ),
    Ytelse.TSR_TSR to DisplayName(
        "Støtte til arbeids- og utdanningsreiser",
        "Work and education travel grant",
        "Stønad til arbeids- og utdanningsreiser",
    ),
    Ytelse.FRI_FRI to DisplayName(
        "Kompensasjonsytelse for selvstendig næringsdrivende og frilansere",
        "Compensation for self-employed and freelancers",
        "Kompensasjonsyting for sjølvstendig næringsdrivande og frilansarar",
    ),
    Ytelse.TSO_TSO to DisplayName(
        "Tilleggsstønad", "Supplemental benefit", "Tilleggsstønad",
    ),
    Ytelse.FAR_FAR to DisplayName(
        "Far- og morskap", "Parenthood", "Far- og morskap",
    ),
    Ytelse.BID_BBF to DisplayName(
        "Barnebortføring", "Child abduction", "Barnebortføring",
    ),
    Ytelse.DAG_LKP to DisplayName(
        "Lønnskompensasjon for permitterte",
        "Salary compensation for people who are laid-off",
        "Lønskompensasjon for permitterte",
    ),
    Ytelse.DAG_FDP to DisplayName(
        "Forskudd dagpenger",
        "Advance payment of unemployment benefits (Forskudd på dagpenger)",
        "Forskot dagpengar",
    ),
    Ytelse.BIL_BIL to DisplayName(
        "Hjelpemidler - Bil og motorkjøretøy",
        "Assistive tools - Car and motorized vehicles",
        "Hjelpemiddel - Bil og motorkjøyretøy",
    ),
    Ytelse.HEL_HEL to DisplayName(
        "Hjelpemidler - Ortopediske",
        "Assistive tools - Orthopedical",
        "Hjelpemiddel - Ortopediske",
    ),
    Ytelse.FOS_FOS to DisplayName("Forsikring", "Insurance", "Forsikring"),
    Ytelse.UNG_UNG to DisplayName(
        "Ungdomsprogramytelsen",
        "Youth Program benefit",
        "Ungdomsprogramytinga"
    ),
    Ytelse.PEN_GYS to DisplayName(
        "Gammel yrkesskade", "Old occupational injury", "Gammal yrkesskade",
    ),
)


