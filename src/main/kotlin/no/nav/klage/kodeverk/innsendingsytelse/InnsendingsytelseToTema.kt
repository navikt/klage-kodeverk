package no.nav.klage.kodeverk.innsendingsytelse

import no.nav.klage.kodeverk.Tema

val innsendingsytelseToTema: Map<Innsendingsytelse, Tema> = mapOf(
    Innsendingsytelse.AVTALEFESTET_PENSJON_SPK to Tema.PEN,
    Innsendingsytelse.AVTALEFESTET_PENSJON_PRIVAT to Tema.PEN,
    Innsendingsytelse.ALDERSPENSJON to Tema.PEN,
    Innsendingsytelse.ARBEID_MED_STOTTE to Tema.OPP,
    Innsendingsytelse.ARBEIDSAVKLARINGSPENGER to Tema.AAP,
    Innsendingsytelse.ARBEIDSFORBEREDENDE_TRENING to Tema.OPP,
    Innsendingsytelse.ARBEIDSRETTET_REHABILITERING to Tema.OPP,
    Innsendingsytelse.ARBEIDSTRENING to Tema.OPP,
    Innsendingsytelse.AVKLARING to Tema.OPP,
    Innsendingsytelse.BARNEBIDRAG to Tema.BID,
    Innsendingsytelse.BARNEBIDRAG_OG_BIDRAGSFORSKUDD to Tema.BID,
    Innsendingsytelse.BARNEPENSJON to Tema.EYB,
    Innsendingsytelse.BARNETRYGD to Tema.BAR,
    Innsendingsytelse.BIDRAG_TIL_SARLIGE_UTGIFTER to Tema.BID,
    Innsendingsytelse.BIDRAGSFORSKUDD to Tema.BID,
    Innsendingsytelse.BILSTONAD to Tema.BIL,
    Innsendingsytelse.DAGPENGER to Tema.DAG,
    Innsendingsytelse.DAGPENGER_TILBAKEBETALING_FORSKUDD to Tema.DAG,
    Innsendingsytelse.EKTEFELLEBIDRAG to Tema.BID,
    Innsendingsytelse.ENGANGSSTONAD to Tema.FOR,
    Innsendingsytelse.ENSLIG_MOR_ELLER_FAR to Tema.ENF,
    Innsendingsytelse.FORELDREPENGER to Tema.FOR,
    Innsendingsytelse.FORHOYET_HJELPESTONAD to Tema.GRU,
    Innsendingsytelse.FORSIKRING_FOR_FRILANSERE to Tema.SYK,
    Innsendingsytelse.FORSIKRING_FOR_JORDBRUKERE_OG_REINDRIFTSUTOVERE to Tema.SYK,
    Innsendingsytelse.FORSIKRING_FOR_SELVSTENDIG_NARINGSDRIVENDE to Tema.SYK,
    Innsendingsytelse.FRIVILLIG_MEDLEMSKAP_I_FOLKETRYGDEN_UNDER_OPPHOLD_I_NORGE to Tema.MED,
    Innsendingsytelse.FRIVILLIG_YRKESSKADETRYGD to Tema.YRK,
    Innsendingsytelse.FUNKSJONSASSISTANSE_I_ARBEIDSLIVET to Tema.HJE,
    Innsendingsytelse.FORERHUND to Tema.HJE,
    Innsendingsytelse.GJENLEVENDE to Tema.PEN,
    Innsendingsytelse.GRAVFERDSSTONAD to Tema.GRA,
    Innsendingsytelse.GRUNNSTONAD to Tema.GRU,
    Innsendingsytelse.GRUNN_OG_HJELPESTONAD to Tema.GRU,
    Innsendingsytelse.GRONT_ARBEID to Tema.OPP,
    Innsendingsytelse.HJELPEMIDLER to Tema.HJE,
    Innsendingsytelse.HJELPESTONAD to Tema.GRU,
    Innsendingsytelse.INKLUDERINGSTILSKUDD to Tema.OPP,
    Innsendingsytelse.IPS to Tema.OPP,
    Innsendingsytelse.IPS_UNG to Tema.OPP,
    Innsendingsytelse.JOBBKLUBB to Tema.OPP,
    Innsendingsytelse.JOBBMESTRENDE_OPPFOLGING to Tema.TIL,
    Innsendingsytelse.JOBBSOKERKURS to Tema.OPP,
    Innsendingsytelse.KONTANTSTOTTE to Tema.KON,
    Innsendingsytelse.KRIGSPENSJON to Tema.PEN,
    Innsendingsytelse.LESE_OG_SEKRETARHJELP to Tema.HJE,
    Innsendingsytelse.LONNSGARANTI to Tema.GEN,
    Innsendingsytelse.LONNSKOMPENSASJON to Tema.DAG,
    Innsendingsytelse.MEDLEMSKAP_I_FOLKETRYGDEN_UNDER_OPPHOLD_I_EOS_ELLER_SVEITS to Tema.MED,
    Innsendingsytelse.MEDLEMSKAP_I_FOLKETRYGDEN_UNDER_OPPHOLD_UTENFOR_EOS to Tema.MED,
    Innsendingsytelse.MENERSTATNING_VED_YRKESSKADE_ELLER_YRKESSYKDOM to Tema.YRK,
    Innsendingsytelse.MENTOR to Tema.OPP,
    Innsendingsytelse.MIDLERTIDIG_KOMPENSASJON to Tema.GEN,
    Innsendingsytelse.MIDLERTIDIG_LONNSTILSKUDD to Tema.OPP,
    Innsendingsytelse.MINSTEPENSJON_I_ALDERSPENSJONEN to Tema.PEN,
    Innsendingsytelse.NAV_LOVEN_14A to Tema.OPP,
    Innsendingsytelse.OPPFOSTRINGSBIDRAG to Tema.BID,
    Innsendingsytelse.OPPFOLGING to Tema.OPP,
    Innsendingsytelse.OPPLARING to Tema.OPP,
    Innsendingsytelse.OPPLARINGSPENGER to Tema.OMS,
    Innsendingsytelse.OPPHOLD_ELLER_ARBEID_I_NORGE to Tema.MED,
    Innsendingsytelse.OPPHOLD_ELLER_ARBEID_UTENFOR_NORGE to Tema.MED,
    Innsendingsytelse.OMSORGSPENGER_HJEMME_MED_SYKT_BARN_DAGER to Tema.OMS,
    Innsendingsytelse.OMSTILLINGSSTONAD to Tema.EYO,
    Innsendingsytelse.OVERGANGSSTONAD_TIL_ENSLIG_MOR_ELLER_FAR to Tema.ENF,
    Innsendingsytelse.OVERGANGSSTONAD_TIL_GJENLEVENDE to Tema.PEN,
    Innsendingsytelse.PENSJONSOPPTJENING_VED_OMSORG_FOR_BARN to Tema.PEN,
    Innsendingsytelse.PENSJONSOPPTJENING_VED_OMSORG_FOR_SYKE_ELDRE_OG_PERSONER_MED_FUNKSJONSNEDSETTELSER to Tema.PEN,
    Innsendingsytelse.PLEIEPENGER_FOR_EN_UTVIKLINGSHEMMET_PERSON_OVER_18_AR to Tema.OMS,
    Innsendingsytelse.PLEIEPENGER_FOR_SYKT_BARN to Tema.OMS,
    Innsendingsytelse.PLEIEPENGER_I_LIVETS_SLUTTFASE to Tema.OMS,
    Innsendingsytelse.REISEKOSTNADER_VED_SAMVAER to Tema.BID,
    Innsendingsytelse.REISEKOSTNADER_VED_SAMVAR to Tema.BID,
    Innsendingsytelse.REISETILSKUDD to Tema.SYK,
    Innsendingsytelse.REISEUTGIFTER to Tema.HJE,
    Innsendingsytelse.SENTER_FOR_JOBBMESTRING to Tema.OPP,
    Innsendingsytelse.SERVICEHUND to Tema.HJE,
    Innsendingsytelse.STUDIER_MED_STOTTE to Tema.OPP,
    Innsendingsytelse.STONAD_TIL_BARNETILSYN_FOR_ENSLIG_MOR_ELLER_FAR to Tema.ENF,
    Innsendingsytelse.STONAD_TIL_BARNETILSYN_FOR_GJENLEVENDE_EKTEFELLE to Tema.PEN,
    Innsendingsytelse.STONAD_TIL_SKOLEPENGER_FOR_ENSLIG_MOR_ELLER_FAR to Tema.ENF,
    Innsendingsytelse.STONAD_TIL_SKOLEPENGER_FOR_GJENLEVENDE_EKTEFELLE to Tema.PEN,
    Innsendingsytelse.STONAD_TIL_SKOLEPENGER_FOR_TIDLIGERE_FAMILIEPLEIERE to Tema.PEN,
    Innsendingsytelse.STONAD_VED_BARETRANSPORT to Tema.GRA,
    Innsendingsytelse.STOTTE_TIL_ARBEIDS_OG_UTDANNINGSREISER to Tema.HJE,
    Innsendingsytelse.STOTTE_TIL_FOLKEHOYSKOLE to Tema.HJE,
    Innsendingsytelse.SUPPLERENDE_STONAD to Tema.SUP,
    Innsendingsytelse.SUPPLERENDE_STONAD_UFORE_FLYKTNINGER to Tema.SUP,
    Innsendingsytelse.SVANGERSKAPSPENGER to Tema.FOR,
    Innsendingsytelse.SYKDOM_I_FAMILIEN to Tema.OMS,
    Innsendingsytelse.SYKEPENGER to Tema.SYK,
    Innsendingsytelse.TIDLIGERE_FAMILIEPLEIER to Tema.PEN,
    Innsendingsytelse.TILLEGGSSTONADER to Tema.TSO,
    Innsendingsytelse.TILLEGGSSTONADER_TIL_ENSLIG_MOR_ELLER_FAR to Tema.TSO,
    Innsendingsytelse.TILLEGGSSTONADER_TIL_GJENLEVENDE_EKTEFELLE to Tema.TSO,
    Innsendingsytelse.TILLEGGSSTONADER_TIL_TIDLIGERE_FAMILIEPLEIER to Tema.TSO,
    Innsendingsytelse.TILPASNINGSKURS_NEDSATT_SYN_OG_HORSEL to Tema.HJE,
    Innsendingsytelse.TILSKUDD_TIL_APPER_OG_PROGRAMVARE to Tema.HJE,
    Innsendingsytelse.TILSKUDD_TIL_BIL to Tema.BIL,
    Innsendingsytelse.TILSKUDD_TIL_KJOP_AV_PC_ELLER_NETTBRETT to Tema.HJE,
    Innsendingsytelse.TILSKUDD_TIL_OMBYGGING to Tema.HJE,
    Innsendingsytelse.TILSKUDD_TIL_RIMELIGE_HJELPEMIDLER to Tema.HJE,
    Innsendingsytelse.TILSKUDD_TIL_SOMMERJOBB to Tema.OPP,
    Innsendingsytelse.TILTAKSPENGER to Tema.IND,
    Innsendingsytelse.TOLKING_FOR_DOVE_DOVBLINDE_OG_HORSELSHEMMEDE to Tema.HJE,
    Innsendingsytelse.UFORETRYGD to Tema.UFO,
    Innsendingsytelse.UTVIDET_BARNETRYGD to Tema.BAR,
    Innsendingsytelse.VARIG_LONNSTILSKUDD to Tema.OPP,
    Innsendingsytelse.VARIG_TILRETTELAGT_ARBEID to Tema.OPP,
    Innsendingsytelse.YRKESSKADE to Tema.YRK,
    Innsendingsytelse.YTELSER_TIL_TIDLIGERE_FAMILIEPLEIERE to Tema.PEN,
)