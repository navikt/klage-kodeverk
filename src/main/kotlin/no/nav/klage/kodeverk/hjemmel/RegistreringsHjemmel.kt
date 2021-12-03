package no.nav.klage.kodeverk.hjemmel

enum class RegistreringsHjemmel(
    val id: String,
    val lovKilde: LovKilde,
    val spesifikasjon: String
) {
    FTRL_10_1(
        "1",
        LovKilde.FOLKETRYGDLOVEN,
        "10-5 Sykdom, skade og lyte"
    ),
    FTRL_10_2("2", LovKilde.FOLKETRYGDLOVEN, "10-3"),
    FTRL_10_3("3", LovKilde.FOLKETRYGDLOVEN, "10-4"),
    FTRL_10_4(
        "4",
        LovKilde.FOLKETRYGDLOVEN,
        "10-5 Sykdom, skade og lyte"
    ),
    FTRL_10_5(
        "5",
        LovKilde.FOLKETRYGDLOVEN,
        "10-5 Varig nedsatt inntektsevne"
    ),
    FTRL_10_6(
        "6",
        LovKilde.FOLKETRYGDLOVEN,
        "10-5 Vesentlig innkrenkede arbeidsmuligheter"
    ),
    FTRL_10_7(
        "7",
        LovKilde.FOLKETRYGDLOVEN,
        "10-5 Nødvendig og hensiktsmessig"
    ),
    FTRL_10_8(
        "8",
        LovKilde.FOLKETRYGDLOVEN,
        "10-6 Sykdom, skade og lyte"
    ),
    FTRL_10_9(
        "9",
        LovKilde.FOLKETRYGDLOVEN,
        "10-6 Vesentlig og varig nedsatt funksjonstap"
    ),
    FTRL_10_10(
        "10",
        LovKilde.FOLKETRYGDLOVEN,
        "10-6 Nødvendig og hensiktsmessig"
    ),
    FTRL_10_11(
        "11",
        LovKilde.FOLKETRYGDLOVEN,
        "10-7a Hjelpemidler"
    ),
    FTRL_10_12(
        "12",
        LovKilde.FOLKETRYGDLOVEN,
        "10-7a Skolehjelpemidler"
    ),
    FTRL_10_13(
        "13",
        LovKilde.FOLKETRYGDLOVEN,
        "10-7a Ordinært og vanlig utstyr"
    ),
    FTRL_10_14(
        "14",
        LovKilde.FOLKETRYGDLOVEN,
        "10-7a Hjelpemidler med indirekte avhjelpsfunksjon og behandlingsformål"
    ),
    FTRL_10_15(
        "15",
        LovKilde.FOLKETRYGDLOVEN,
        "10-7b Høreapparat"
    ),
    FTRL_10_16(
        "16",
        LovKilde.FOLKETRYGDLOVEN,
        "10-7c Grunnmønster"
    ),
    FTRL_10_17(
        "17",
        LovKilde.FOLKETRYGDLOVEN,
        "10-7d Førerhund"
    ),
    FTRL_10_18(
        "18",
        LovKilde.FOLKETRYGDLOVEN,
        "10-7e Lese- og sekretærhjelp"
    ),
    FTRL_10_19(
        "19",
        LovKilde.FOLKETRYGDLOVEN,
        "10-7f Tolkehjelp"
    ),
    FTRL_10_20(
        "20",
        LovKilde.FOLKETRYGDLOVEN,
        "10-7g Tolk- og ledsagerhjelp"
    ),
    FTRL_10_21(
        "21",
        LovKilde.FOLKETRYGDLOVEN,
        "10-7h Motorkjøretøy"
    ),
    FTRL_10_22(
        "22",
        LovKilde.FOLKETRYGDLOVEN,
        "10-7i Ortopediske hjelpemidler"
    ),
    FTRL_10_23(
        "23",
        LovKilde.FOLKETRYGDLOVEN,
        "10-7 Ombygging av maskiner"
    ),
    FTRL_10_24(
        "24",
        LovKilde.FOLKETRYGDLOVEN,
        "10-7 Opplæringstiltak"
    ),
    FTRL_10_25(
        "25",
        LovKilde.FOLKETRYGDLOVEN,
        "10-8 Bortfall av rettigheter"
    ),
    FTRL_10_26(
        "26",
        LovKilde.FOLKETRYGDLOVEN,
        "10-8 Opplæringsloven"
    ),
    FTRL_10_27(
        "27",
        LovKilde.FOLKETRYGDLOVEN,
        "10-8 Barnehageloven"
    ),
    FTRL_10_28(
        "28",
        LovKilde.FOLKETRYGDLOVEN,
        "10-8 Spesialisthelsetjenesteloven"
    ),
    FTRL_10_29(
        "29",
        LovKilde.FOLKETRYGDLOVEN,
        "10-8 Helse- og omsorgstjenesteloven"
    ),
    FTRL_10_30(
        "30",
        LovKilde.FOLKETRYGDLOVEN,
        "10-8 Husbankloven"
    ),
    FTRL_10_31(
        "31",
        LovKilde.FOLKETRYGDLOVEN,
        "10-8 Arbeidsmiljøloven"
    ),


    FS_AKT_26_1(
        "32",
        LovKilde.FORSKRIFT_OM_AKTIVITETSHJELPEMIDLER_TIL_DE_OVER_26_ÅR,
        "2 aktivitetshjelpemidler"
    ),
    FS_AKT_26_2(
        "33",
        LovKilde.FORSKRIFT_OM_AKTIVITETSHJELPEMIDLER_TIL_DE_OVER_26_ÅR,
        "2 hjelpemidler for å aktivisere bevegelsesapparatet"
    ),
    FS_AKT_26_3(
        "34",
        LovKilde.FORSKRIFT_OM_AKTIVITETSHJELPEMIDLER_TIL_DE_OVER_26_ÅR,
        "2 ortopediske aktivitetshjelpemidler"
    ),
    FS_AKT_26_4(
        "35",
        LovKilde.FORSKRIFT_OM_AKTIVITETSHJELPEMIDLER_TIL_DE_OVER_26_ÅR,
        "4 egenandel"
    ),
    FS_AKT_26_5(
        "36",
        LovKilde.FORSKRIFT_OM_AKTIVITETSHJELPEMIDLER_TIL_DE_OVER_26_ÅR,
        "5 spesialtilpasning av ordinært utstyr"
    ),

    FS_HJE_MM_1(
        "37",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 trening, aktivisering, stimulering og lek"
    ),
    FS_HJE_MM_2(
        "38",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 datautstyr"
    ),
    FS_HJE_MM_3(
        "39",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 synshjelpemidler"
    ),
    FS_HJE_MM_4(
        "40",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 briller og linser"
    ),
    FS_HJE_MM_5(
        "41",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 behandlingsbriller til barn"
    ),
    FS_HJE_MM_6(
        "42",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 hørselshjelpemidler"
    ),
    FS_HJE_MM_7(
        "43",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 kommunikasjon (ASK)"
    ),
    FS_HJE_MM_8(
        "44",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 boligtilskudd"
    ),
    FS_HJE_MM_9(
        "45",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 heisløsninger"
    ),
    FS_HJE_MM_10(
        "46",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 gå- og forflytningshjelpemidler"
    ),
    FS_HJE_MM_11(
        "47",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 småhjelpemidler"
    ),
    FS_HJE_MM_12(
        "48",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 møbler"
    ),
    FS_HJE_MM_13(
        "49",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 gjeldsoppgjør"
    ),
    FS_HJE_MM_14(
        "50",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 alarm og varsling"
    ),
    FS_HJE_MM_15(
        "51",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 madrasser og puter"
    ),
    FS_HJE_MM_16(
        "52",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 utstyr på arbeidsplass  jordbruk og fiske"
    ),
    FS_HJE_MM_17(
        "53",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 varmehjelpemidler"
    ),
    FS_HJE_MM_18(
        "54",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "2 refusjon isteden for utlån"
    ),
    FS_HJE_MM_19(
        "55",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "6 tilpasningskurs"
    ),
    FS_HJE_MM_20(
        "56",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "6 folkehøgskole 1 år"
    ),
    FS_HJE_MM_21(
        "57",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "6 folkehøgskole 2 år"
    ),
    FS_HJE_MM_22(
        "58",
        LovKilde.FORSKRIFT_OM_HJELPEMIDLER_MM,
        "7 reise"
    ),

    FS_ORT_HJE_MM_1("59", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "1 ortopediske proteser"),
    FS_ORT_HJE_MM_2("60", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "1 ortoser"),
    FS_ORT_HJE_MM_3("61", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "1 fotsenger"),
    FS_ORT_HJE_MM_4("62", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "1 antall fotsenger"),
    FS_ORT_HJE_MM_5("63", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "2 spesialsydde sko"),
    FS_ORT_HJE_MM_6("64", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "2 spesialtilpasning av sko"),
    FS_ORT_HJE_MM_7("65", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "2 spesialsko"),
    FS_ORT_HJE_MM_8("66", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "2 antall sko"),
    FS_ORT_HJE_MM_9("67", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "3 søknad og gyldighetstid"),
    FS_ORT_HJE_MM_10("68", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "5 brystproteser"),
    FS_ORT_HJE_MM_11("69", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "5 spesialbrystholder"),
    FS_ORT_HJE_MM_12("70", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "6 ansiktsdefektprotese"),
    FS_ORT_HJE_MM_13("71", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "7 øyeprotese"),
    FS_ORT_HJE_MM_14("72", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "8 parykk - sykdom og hårtap"),
    FS_ORT_HJE_MM_15("73", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "8 utvidet stønad"),
    FS_ORT_HJE_MM_16("74", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "8 under 30 år"),
    FS_ORT_HJE_MM_17("75", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "8 stell og vedlikehold"),
    FS_ORT_HJE_MM_18("76", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "8 hodeplagg"),
    FS_ORT_HJE_MM_19("77", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "9 alminnelig fottøy"),
    FS_ORT_HJE_MM_20(
        "78",
        LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM,
        "9a overekstremitetsortoser ved revmatisme"
    ),
    FS_ORT_HJE_MM_21("79", LovKilde.FORSKRIFT_OM_ORTOPEDISKE_HJELPEMIDLER_MM, "12 reise"),

    FS_HA_MM_1("80", LovKilde.FORSKRIFT_OM_HØREAPPARATER_MM, "2 høreapparat"),
    FS_HA_MM_2("81", LovKilde.FORSKRIFT_OM_HØREAPPARATER_MM, "2 tilbehør"),
    FS_HA_MM_3("82", LovKilde.FORSKRIFT_OM_HØREAPPARATER_MM, "2 individuelt tilpassede ørepropper"),
    FS_HA_MM_4("83", LovKilde.FORSKRIFT_OM_HØREAPPARATER_MM, "2 batterier"),
    FS_HA_MM_5("84", LovKilde.FORSKRIFT_OM_HØREAPPARATER_MM, "2 reise"),
    FS_HA_MM_6("85", LovKilde.FORSKRIFT_OM_HØREAPPARATER_MM, "2 reparasjon"),
    FS_HA_MM_7("86", LovKilde.FORSKRIFT_OM_HØREAPPARATER_MM, "3 gjenanskaffelse"),
    FS_HA_MM_8("87", LovKilde.FORSKRIFT_OM_HØREAPPARATER_MM, "3 gjenanskaffelse før 6 år - endret hørselstap"),
    FS_HA_MM_9("88", LovKilde.FORSKRIFT_OM_HØREAPPARATER_MM, "3 gjenanskaffelse før 6 år - ny type høreapparat"),
    FS_HA_MM_10("89", LovKilde.FORSKRIFT_OM_HØREAPPARATER_MM, "3 gjenanskaffelse før 6 år - endret funksjonsevne"),
    FS_HA_MM_11("90", LovKilde.FORSKRIFT_OM_HØREAPPARATER_MM, "3 gjenanskaffelse før 6 år - barn under 18 år"),
    FS_HA_MM_12("91", LovKilde.FORSKRIFT_OM_HØREAPPARATER_MM, "4 krav til søknad og produkt"),
    FS_HA_MM_13("92", LovKilde.FORSKRIFT_OM_HØREAPPARATER_MM, "8 stønad og satser"),

    FS_SH_1("93", LovKilde.FORSKRIFT_OM_SERVICEHUND, "2 servicehund"),

    FS_MOK_1("94", LovKilde.FORSKRIFT_OM_MOTORKJØRETØY, "2 definisjon - kjøretøy"),
    FS_MOK_2("95", LovKilde.FORSKRIFT_OM_MOTORKJØRETØY, "2 behov for heise eller rampe"),
    FS_MOK_3("96", LovKilde.FORSKRIFT_OM_MOTORKJØRETØY, "2 sterkt begrenset gangfunksjon"),
    FS_MOK_4("97", LovKilde.FORSKRIFT_OM_MOTORKJØRETØY, "2 utagering"),
    FS_MOK_5("98", LovKilde.FORSKRIFT_OM_MOTORKJØRETØY, "3 transportvilkåret"),
    FS_MOK_6("99", LovKilde.FORSKRIFT_OM_MOTORKJØRETØY, "5 regler valg av kjøretøy"),
    FS_MOK_7("100", LovKilde.FORSKRIFT_OM_MOTORKJØRETØY, "6 rammeavtaler og prisramme"),
    FS_MOK_8("101", LovKilde.FORSKRIFT_OM_MOTORKJØRETØY, "7 krav til registrering og førerkort"),
    FS_MOK_9("102", LovKilde.FORSKRIFT_OM_MOTORKJØRETØY, "8 gjenanskaffelse"),
    FS_MOK_10("103", LovKilde.FORSKRIFT_OM_MOTORKJØRETØY, "9 behovsprøving mot inntekt"),
    FS_MOK_11("104", LovKilde.FORSKRIFT_OM_MOTORKJØRETØY, "11 tilskudd til spesialutstyr"),
    FS_MOK_12("105", LovKilde.FORSKRIFT_OM_MOTORKJØRETØY, "11 tilskudd til firehjulstrekk"),
    FS_MOK_13("106", LovKilde.FORSKRIFT_OM_MOTORKJØRETØY, "12 tilskudd til kjøreopplæring"),
    FS_MOK_14("107", LovKilde.FORSKRIFT_OM_MOTORKJØRETØY, "15 gjeldoppgjør"),

    FTRL_21_3("108", LovKilde.FOLKETRYGDLOVEN, "21-3"),
    FTRL_21_7("109", LovKilde.FOLKETRYGDLOVEN, "21-7"),
    FTRL_21_8("110", LovKilde.FOLKETRYGDLOVEN, "21-8"),
    FTRL_21_10("111", LovKilde.FOLKETRYGDLOVEN, "21-10"),
    FTRL_21_12("112", LovKilde.FOLKETRYGDLOVEN, "21-12"),
    FTRL_22_12("113", LovKilde.FOLKETRYGDLOVEN, "22-12"),
    FTRL_22_13("114", LovKilde.FOLKETRYGDLOVEN, "22-13"),
    FTRL_22_14("115", LovKilde.FOLKETRYGDLOVEN, "22-14"),
    FTRL_22_17("116", LovKilde.FOLKETRYGDLOVEN, "22-17"),

    FVL_11("117", LovKilde.FORVALTNINGSLOVEN, "11"),
    FVL_12("118", LovKilde.FORVALTNINGSLOVEN, "12"),
    FVL_16("119", LovKilde.FORVALTNINGSLOVEN, "16"),
    FVL_17("120", LovKilde.FORVALTNINGSLOVEN, "17"),
    FVL_18_19("121", LovKilde.FORVALTNINGSLOVEN, "18-19"),
    FVL_21("122", LovKilde.FORVALTNINGSLOVEN, "21"),
    FVL_24("123", LovKilde.FORVALTNINGSLOVEN, "24"),
    FVL_25("124", LovKilde.FORVALTNINGSLOVEN, "25"),
    FVL_28("125", LovKilde.FORVALTNINGSLOVEN, "28"),
    FVL_29("126", LovKilde.FORVALTNINGSLOVEN, "29"),
    FVL_30("127", LovKilde.FORVALTNINGSLOVEN, "30"),
    FVL_31("128", LovKilde.FORVALTNINGSLOVEN, "31"),
    FVL_32("129", LovKilde.FORVALTNINGSLOVEN, "32"),
    FVL_33("130", LovKilde.FORVALTNINGSLOVEN, "33"),
    FVL_35("131", LovKilde.FORVALTNINGSLOVEN, "35"),
    FVL_41("132", LovKilde.FORVALTNINGSLOVEN, "41"),
    FVL_42("133", LovKilde.FORVALTNINGSLOVEN, "42"),

    TRRL_2("134", LovKilde.TRYGDERETTSLOVEN, "2"),
    TRRL_9("135", LovKilde.TRYGDERETTSLOVEN, "9"),
    TRRL_10("136", LovKilde.TRYGDERETTSLOVEN, "10"),
    TRRL_11("137", LovKilde.TRYGDERETTSLOVEN, "11"),
    TRRL_12("138", LovKilde.TRYGDERETTSLOVEN, "12"),
    TRRL_14("139", LovKilde.TRYGDERETTSLOVEN, "14"),
}

