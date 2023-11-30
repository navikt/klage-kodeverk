package no.nav.klage.kodeverk.hjemmel

import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

/**
 * Used for innsending, search and innstillinger
 */
enum class Hjemmel(
    val id: String,
    val lovKilde: LovKilde,
    val spesifikasjon: String
) {
    //@formatter:off

    //TODO give more explaining enum-names or improve Swagger-docs.

    FVL_31("FVL_31", LovKilde.FORVALTNINGSLOVEN, "§ 31"),
    FVL_32("FVL_32", LovKilde.FORVALTNINGSLOVEN, "§ 32"),
    FVL_33_2("FVL_33_2", LovKilde.FORVALTNINGSLOVEN, "§ 33, 2. ledd"),
    FVL_35_1_C("FVL_35_1_C", LovKilde.FORVALTNINGSLOVEN, "§ 35, 1. ledd c)"),
    FVL_36("FVL_36", LovKilde.FORVALTNINGSLOVEN, "§ 36"),

    BTRL_2("619", LovKilde.BARNETRYGDLOVEN, "§ 2"),
    BTRL_4("587", LovKilde.BARNETRYGDLOVEN, "§ 4"),
    BTRL_5("588", LovKilde.BARNETRYGDLOVEN, "§ 5"),
    BTRL_9("592", LovKilde.BARNETRYGDLOVEN, "§ 9"),
    BTRL_10("BTRL_10", LovKilde.BARNETRYGDLOVEN, "§ 10"),
    BTRL_11("BTRL_11", LovKilde.BARNETRYGDLOVEN, "§ 11"),
    BTRL_12("BTRL_12", LovKilde.BARNETRYGDLOVEN, "§ 12"),
    BTRL_13("596", LovKilde.BARNETRYGDLOVEN, "§ 13"),
    BTRL_17("BTRL_17", LovKilde.BARNETRYGDLOVEN, "§ 17"),
    BTRL_18("BTRL_18", LovKilde.BARNETRYGDLOVEN, "§ 18"),

    KONTSL_2("606", LovKilde.KONTANTSTØTTELOVEN, "§ 2"),
    KONTSL_3("621", LovKilde.KONTANTSTØTTELOVEN, "§ 3"),
    KONTSL_4("KONTSL_4", LovKilde.KONTANTSTØTTELOVEN, "§ 4"),
    KONTSL_6("609", LovKilde.KONTANTSTØTTELOVEN, "§ 6"),
    KONTSL_7("610", LovKilde.KONTANTSTØTTELOVEN, "§ 7"),
    KONTSL_8("611", LovKilde.KONTANTSTØTTELOVEN, "§ 8"),
    KONTSL_9("612", LovKilde.KONTANTSTØTTELOVEN, "§ 9"),
    KONTSL_10("613", LovKilde.KONTANTSTØTTELOVEN, "§ 10"),
    KONTSL_11("614", LovKilde.KONTANTSTØTTELOVEN, "§ 11"),
    KONTSL_12("615", LovKilde.KONTANTSTØTTELOVEN, "§ 12"),
    KONTSL_13("616", LovKilde.KONTANTSTØTTELOVEN, "§ 13"),
    KONTSL_14("KONTSL_14", LovKilde.KONTANTSTØTTELOVEN, "§ 14"),
    KONTSL_16("618", LovKilde.KONTANTSTØTTELOVEN, "§ 16"),

    SUP_ST_L_3("696", LovKilde.LOV_OM_SUPPLERENDE_STØNAD, "§ 3"),
    SUP_ST_L_4("697", LovKilde.LOV_OM_SUPPLERENDE_STØNAD, "§ 4"),
    SUP_ST_L_5("698", LovKilde.LOV_OM_SUPPLERENDE_STØNAD, "§ 5"),
    SUP_ST_L_6("699", LovKilde.LOV_OM_SUPPLERENDE_STØNAD, "§ 6"),
    SUP_ST_L_7("700", LovKilde.LOV_OM_SUPPLERENDE_STØNAD, "§ 7"),
    SUP_ST_L_8("701", LovKilde.LOV_OM_SUPPLERENDE_STØNAD, "§ 8"),
    SUP_ST_L_9("702", LovKilde.LOV_OM_SUPPLERENDE_STØNAD, "§ 9"),
    SUP_ST_L_10("703", LovKilde.LOV_OM_SUPPLERENDE_STØNAD, "§ 10"),
    SUP_ST_L_11("704", LovKilde.LOV_OM_SUPPLERENDE_STØNAD, "§ 11"),
    SUP_ST_L_12("705", LovKilde.LOV_OM_SUPPLERENDE_STØNAD, "§ 12"),
    SUP_ST_L_13("706", LovKilde.LOV_OM_SUPPLERENDE_STØNAD, "§ 13"),
    SUP_ST_L_17("839", LovKilde.LOV_OM_SUPPLERENDE_STØNAD, "§ 17"),
    SUP_ST_L_18("707", LovKilde.LOV_OM_SUPPLERENDE_STØNAD, "§ 18"),
    SUP_ST_L_21("840", LovKilde.LOV_OM_SUPPLERENDE_STØNAD, "§ 21"),

    FTRL_1_3("FTRL_1_3", LovKilde.FOLKETRYGDLOVEN, "§ 1-3"),
    FTRL_1_3_A("FTRL_1_3_A", LovKilde.FOLKETRYGDLOVEN, "§ 1-3 a"),
    FTRL_1_3_B("FTRL_1_3_B", LovKilde.FOLKETRYGDLOVEN, "§ 1-3 b"),
    FTRL_1_5("FTRL_1_5", LovKilde.FOLKETRYGDLOVEN, "§ 1-5"),

    FTRL_2_1("FTRL_2_1", LovKilde.FOLKETRYGDLOVEN, "§ 2-1"),
    FTRL_2_1_A("FTRL_2_1_A", LovKilde.FOLKETRYGDLOVEN, "§ 2-1 a"),
    FTRL_2_2("FTRL_2_2", LovKilde.FOLKETRYGDLOVEN, "§ 2-2"),
    FTRL_2_3("FTRL_2_3", LovKilde.FOLKETRYGDLOVEN, "§ 2-3"),
    FTRL_2_4("FTRL_2_4", LovKilde.FOLKETRYGDLOVEN, "§ 2-4"),
    FTRL_2_5("FTRL_2_5", LovKilde.FOLKETRYGDLOVEN, "§ 2-5"),
    FTRL_2_6("FTRL_2_6", LovKilde.FOLKETRYGDLOVEN, "§ 2-6"),
    FTRL_2_7("FTRL_2_7", LovKilde.FOLKETRYGDLOVEN, "§ 2-7"),
    FTRL_2_7_A("FTRL_2_7_A", LovKilde.FOLKETRYGDLOVEN, "§ 2-7 a"),
    FTRL_2_8("FTRL_2_8", LovKilde.FOLKETRYGDLOVEN, "§ 2-8"),
    FTRL_2_9("FTRL_2_9", LovKilde.FOLKETRYGDLOVEN, "§ 2-9"),
    FTRL_2_10("FTRL_2_10", LovKilde.FOLKETRYGDLOVEN, "§ 2-10"),
    FTRL_2_11("FTRL_2_11", LovKilde.FOLKETRYGDLOVEN, "§ 2-11"),
    FTRL_2_12("FTRL_2_12", LovKilde.FOLKETRYGDLOVEN, "§ 2-12"),
    FTRL_2_13("FTRL_2_13", LovKilde.FOLKETRYGDLOVEN, "§ 2-13"),
    FTRL_2_14("FTRL_2_14", LovKilde.FOLKETRYGDLOVEN, "§ 2-14"),
    FTRL_2_15("FTRL_2_15", LovKilde.FOLKETRYGDLOVEN, "§ 2-15"),
    FTRL_2_16("FTRL_2_16", LovKilde.FOLKETRYGDLOVEN, "§ 2-16"),
    FTRL_2_17("FTRL_2_17", LovKilde.FOLKETRYGDLOVEN, "§ 2-17"),

    FTRL_3_1("FTRL_3_1", LovKilde.FOLKETRYGDLOVEN, "§ 3-1"),
    FTRL_3_5_TRYGDETID("FTRL_3_5_TRYGDETID", LovKilde.FOLKETRYGDLOVEN, "§ 3-5 (trygdetid)"),
    FTRL_3_7("FTRL_3_7", LovKilde.FOLKETRYGDLOVEN, "§ 3-7"),
    FTRL_3_10("FTRL_3_10", LovKilde.FOLKETRYGDLOVEN, "§ 3-10"),
    FTRL_3_13("FTRL_3_13", LovKilde.FOLKETRYGDLOVEN, "§ 3-13"),
    FTRL_3_14("FTRL_3_14", LovKilde.FOLKETRYGDLOVEN, "§ 3-14"),
    FTRL_3_15("FTRL_3_15", LovKilde.FOLKETRYGDLOVEN, "§ 3-15"),

    FTRL_6_3_A("FTRL_6_3_A", LovKilde.FOLKETRYGDLOVEN, "§ 6-3 a"),
    FTRL_6_3_B("FTRL_6_3_B", LovKilde.FOLKETRYGDLOVEN, "§ 6-3 b"),
    FTRL_6_3_C("FTRL_6_3_C", LovKilde.FOLKETRYGDLOVEN, "§ 6-3 c"),
    FTRL_6_3_F("FTRL_6_3_F", LovKilde.FOLKETRYGDLOVEN, "§ 6-3 f"),
    FTRL_6_3_G("FTRL_6_3_G", LovKilde.FOLKETRYGDLOVEN, "§ 6-3 g"),
    FTRL_6_3_H("FTRL_6_3_H", LovKilde.FOLKETRYGDLOVEN, "§ 6-3 h"),
    FTRL_6_4("FTRL_6_4", LovKilde.FOLKETRYGDLOVEN, "§ 6-4"),
    FTRL_6_5("FTRL_6_5", LovKilde.FOLKETRYGDLOVEN, "§ 6-5"),
    FTRL_6_6("FTRL_6_6", LovKilde.FOLKETRYGDLOVEN, "§ 6-6"),
    FTRL_6_7("FTRL_6_7", LovKilde.FOLKETRYGDLOVEN, "§ 6-7"),
    FTRL_6_8("FTRL_6_8", LovKilde.FOLKETRYGDLOVEN, "§ 6-8"),

    FTRL_8_1("1000.008.001", LovKilde.FOLKETRYGDLOVEN, "§ 8-1"),
    FTRL_8_2("1000.008.002", LovKilde.FOLKETRYGDLOVEN, "§ 8-2"),
    FTRL_8_3("1000.008.003", LovKilde.FOLKETRYGDLOVEN, "§ 8-3"),
    FTRL_8_4("1000.008.004", LovKilde.FOLKETRYGDLOVEN, "§ 8-4"),
    FTRL_8_5("1000.008.005", LovKilde.FOLKETRYGDLOVEN, "§ 8-5"),
    FTRL_8_6("1000.008.006", LovKilde.FOLKETRYGDLOVEN, "§ 8-6"),
    FTRL_8_7("1000.008.007", LovKilde.FOLKETRYGDLOVEN, "§ 8-7"),
    FTRL_8_8("1000.008.008", LovKilde.FOLKETRYGDLOVEN, "§ 8-8"),
    FTRL_8_9("1000.008.009", LovKilde.FOLKETRYGDLOVEN, "§ 8-9"),
    FTRL_8_10("1000.008.010", LovKilde.FOLKETRYGDLOVEN, "§ 8-10"),
    FTRL_8_11("1000.008.011", LovKilde.FOLKETRYGDLOVEN, "§ 8-11"),
    FTRL_8_12("1000.008.012", LovKilde.FOLKETRYGDLOVEN, "§ 8-12"),
    FTRL_8_13("1000.008.013", LovKilde.FOLKETRYGDLOVEN, "§ 8-13"),
    FTRL_8_14("1000.008.014", LovKilde.FOLKETRYGDLOVEN, "§ 8-14"),
    FTRL_8_15("1000.008.015", LovKilde.FOLKETRYGDLOVEN, "§ 8-15"),
    FTRL_8_16("1000.008.016", LovKilde.FOLKETRYGDLOVEN, "§ 8-16"),
    FTRL_8_17("1000.008.017", LovKilde.FOLKETRYGDLOVEN, "§ 8-17"),
    FTRL_8_18("1000.008.018", LovKilde.FOLKETRYGDLOVEN, "§ 8-18"),
    FTRL_8_19("1000.008.019", LovKilde.FOLKETRYGDLOVEN, "§ 8-19"),
    FTRL_8_20("1000.008.020", LovKilde.FOLKETRYGDLOVEN, "§ 8-20"),
    FTRL_8_21("1000.008.021", LovKilde.FOLKETRYGDLOVEN, "§ 8-21"),
    FTRL_8_22("1000.008.022", LovKilde.FOLKETRYGDLOVEN, "§ 8-22"),
    FTRL_8_23("1000.008.023", LovKilde.FOLKETRYGDLOVEN, "§ 8-23"),
    FTRL_8_24("1000.008.024", LovKilde.FOLKETRYGDLOVEN, "§ 8-24"),
    FTRL_8_25("1000.008.025", LovKilde.FOLKETRYGDLOVEN, "§ 8-25"),
    FTRL_8_26("1000.008.026", LovKilde.FOLKETRYGDLOVEN, "§ 8-26"),
    FTRL_8_27("1000.008.027", LovKilde.FOLKETRYGDLOVEN, "§ 8-27"),
    FTRL_8_28("1000.008.028", LovKilde.FOLKETRYGDLOVEN, "§ 8-28"),
    FTRL_8_29("1000.008.029", LovKilde.FOLKETRYGDLOVEN, "§ 8-29"),
    FTRL_8_30("1000.008.030", LovKilde.FOLKETRYGDLOVEN, "§ 8-30"),
    FTRL_8_31("1000.008.031", LovKilde.FOLKETRYGDLOVEN, "§ 8-31"),
    FTRL_8_32("1000.008.032", LovKilde.FOLKETRYGDLOVEN, "§ 8-32"),
    FTRL_8_33("1000.008.033", LovKilde.FOLKETRYGDLOVEN, "§ 8-33"),
    FTRL_8_34("1000.008.034", LovKilde.FOLKETRYGDLOVEN, "§ 8-34"),
    FTRL_8_35("1000.008.035", LovKilde.FOLKETRYGDLOVEN, "§ 8-35"),
    FTRL_8_36("1000.008.036", LovKilde.FOLKETRYGDLOVEN, "§ 8-36"),
    FTRL_8_37("1000.008.037", LovKilde.FOLKETRYGDLOVEN, "§ 8-37"),
    FTRL_8_38("1000.008.038", LovKilde.FOLKETRYGDLOVEN, "§ 8-38"),
    FTRL_8_39("1000.008.039", LovKilde.FOLKETRYGDLOVEN, "§ 8-39"),
    FTRL_8_40("1000.008.040", LovKilde.FOLKETRYGDLOVEN, "§ 8-40"),
    FTRL_8_41("1000.008.041", LovKilde.FOLKETRYGDLOVEN, "§ 8-41"),
    FTRL_8_42("1000.008.042", LovKilde.FOLKETRYGDLOVEN, "§ 8-42"),
    FTRL_8_43("1000.008.043", LovKilde.FOLKETRYGDLOVEN, "§ 8-43"),
    FTRL_8_44("1000.008.044", LovKilde.FOLKETRYGDLOVEN, "§ 8-44"),
    FTRL_8_45("1000.008.045", LovKilde.FOLKETRYGDLOVEN, "§ 8-45"),
    FTRL_8_46("1000.008.046", LovKilde.FOLKETRYGDLOVEN, "§ 8-46"),
    FTRL_8_47("1000.008.047", LovKilde.FOLKETRYGDLOVEN, "§ 8-47"),
    FTRL_8_48("1000.008.048", LovKilde.FOLKETRYGDLOVEN, "§ 8-48"),
    FTRL_8_49("1000.008.049", LovKilde.FOLKETRYGDLOVEN, "§ 8-49"),
    FTRL_8_50("1000.008.050", LovKilde.FOLKETRYGDLOVEN, "§ 8-50"),
    FTRL_8_51("1000.008.051", LovKilde.FOLKETRYGDLOVEN, "§ 8-51"),
    FTRL_8_52("1000.008.052", LovKilde.FOLKETRYGDLOVEN, "§ 8-52"),
    FTRL_8_53("1000.008.053", LovKilde.FOLKETRYGDLOVEN, "§ 8-53"),
    FTRL_8_54("1000.008.054", LovKilde.FOLKETRYGDLOVEN, "§ 8-54"),
    FTRL_8_55("1000.008.055", LovKilde.FOLKETRYGDLOVEN, "§ 8-55"),

    FTRL_9_2("1000.009.002", LovKilde.FOLKETRYGDLOVEN, "§ 9-2"),
    FTRL_9_3("1000.009.003", LovKilde.FOLKETRYGDLOVEN, "§ 9-3"),
    FTRL_9_5("1000.009.005", LovKilde.FOLKETRYGDLOVEN, "§ 9-5"),
    FTRL_9_6("1000.009.006", LovKilde.FOLKETRYGDLOVEN, "§ 9-6"),
    FTRL_9_8("1000.009.008", LovKilde.FOLKETRYGDLOVEN, "§ 9-8"),
    FTRL_9_9("1000.009.009", LovKilde.FOLKETRYGDLOVEN, "§ 9-9"),
    FTRL_9_10("1000.009.010", LovKilde.FOLKETRYGDLOVEN, "§ 9-10"),
    FTRL_9_11("1000.009.011", LovKilde.FOLKETRYGDLOVEN, "§ 9-11"),
    FTRL_9_13("1000.009.013", LovKilde.FOLKETRYGDLOVEN, "§ 9-13"),
    FTRL_9_14("1000.009.014", LovKilde.FOLKETRYGDLOVEN, "§ 9-14"),
    FTRL_9_15("1000.009.015", LovKilde.FOLKETRYGDLOVEN, "§ 9-15"),
    FTRL_9_16("1000.009.016", LovKilde.FOLKETRYGDLOVEN, "§ 9-16"),

    FTRL_10_3("FTRL_10_3", LovKilde.FOLKETRYGDLOVEN, "§ 10-3"),
    FTRL_10_7A("FTRL_10_7A", LovKilde.FOLKETRYGDLOVEN, "§ 10-7a"),
    FTRL_10_7B("FTRL_10_7B", LovKilde.FOLKETRYGDLOVEN, "§ 10-7b"),
    FTRL_10_7C("FTRL_10_7C", LovKilde.FOLKETRYGDLOVEN, "§ 10-7c"),
    FTRL_10_7D("FTRL_10_7D", LovKilde.FOLKETRYGDLOVEN, "§ 10-7d"),
    FTRL_10_7E("FTRL_10_7E", LovKilde.FOLKETRYGDLOVEN, "§ 10-7e"),
    FTRL_10_7F("FTRL_10_7F", LovKilde.FOLKETRYGDLOVEN, "§ 10-7f"),
    FTRL_10_7G("FTRL_10_7G", LovKilde.FOLKETRYGDLOVEN, "§ 10-7g"),
    FTRL_10_7H("FTRL_10_7H", LovKilde.FOLKETRYGDLOVEN, "§ 10-7h"),
    FTRL_10_7I("FTRL_10_7I", LovKilde.FOLKETRYGDLOVEN, "§ 10-7i"),
    FTRL_10_7_3A("FTRL_10_7_3A", LovKilde.FOLKETRYGDLOVEN, "§ 10-7 tredje ledd - folkehøyskole"),

    FTRL_13_3_1("FTRL_13_3_1", LovKilde.FOLKETRYGDLOVEN, "§ 13-3 første ledd"),
    FTRL_13_3_2("FTRL_13_3_2", LovKilde.FOLKETRYGDLOVEN, "§ 13-3 andre ledd"),
    FTRL_13_4("FTRL_13_4", LovKilde.FOLKETRYGDLOVEN, "§ 13-4"),
    FTRL_13_6("FTRL_13_6", LovKilde.FOLKETRYGDLOVEN, "§ 13-6"),
    FTRL_13_8("FTRL_13_8", LovKilde.FOLKETRYGDLOVEN, "§ 13-8"),
    FTRL_13_10("FTRL_13_10", LovKilde.FOLKETRYGDLOVEN, "§ 13-10"),
    FTRL_13_17("FTRL_13_17", LovKilde.FOLKETRYGDLOVEN, "§ 13-17"),

    FTRL_14_2("399", LovKilde.FOLKETRYGDLOVEN, "§ 14-2"),
    FTRL_14_4("430", LovKilde.FOLKETRYGDLOVEN, "§ 14-4"),
    FTRL_14_5("401", LovKilde.FOLKETRYGDLOVEN, "§ 14-5"),
    FTRL_14_6("402", LovKilde.FOLKETRYGDLOVEN, "§ 14-6"),
    FTRL_14_7("403", LovKilde.FOLKETRYGDLOVEN, "§ 14-7"),
    FTRL_14_9("405", LovKilde.FOLKETRYGDLOVEN, "§ 14-9"),
    FTRL_14_10("406", LovKilde.FOLKETRYGDLOVEN, "§ 14-10"),
    FTRL_14_11("407", LovKilde.FOLKETRYGDLOVEN, "§ 14-11"),
    FTRL_14_12("408", LovKilde.FOLKETRYGDLOVEN, "§ 14-12"),
    FTRL_14_13("409", LovKilde.FOLKETRYGDLOVEN, "§ 14-13"),
    FTRL_14_14("410", LovKilde.FOLKETRYGDLOVEN, "§ 14-14"),
    FTRL_14_15("411", LovKilde.FOLKETRYGDLOVEN, "§ 14-15"),
    FTRL_14_16("412", LovKilde.FOLKETRYGDLOVEN, "§ 14-16"),
    FTRL_14_17("429", LovKilde.FOLKETRYGDLOVEN, "§ 14-17"),

    FTRL_15_2("431", LovKilde.FOLKETRYGDLOVEN, "§ 15-2"),
    FTRL_15_3("432", LovKilde.FOLKETRYGDLOVEN, "§ 15-3"),
    FTRL_15_4("433", LovKilde.FOLKETRYGDLOVEN, "§ 15-4"),
    FTRL_15_5("434", LovKilde.FOLKETRYGDLOVEN, "§ 15-5"),
    FTRL_15_6("435", LovKilde.FOLKETRYGDLOVEN, "§ 15-6"),
    FTRL_15_8("437", LovKilde.FOLKETRYGDLOVEN, "§ 15-8"),
    FTRL_15_9("439", LovKilde.FOLKETRYGDLOVEN, "§ 15-9"),
    FTRL_15_10("440", LovKilde.FOLKETRYGDLOVEN, "§ 15-10"),
    FTRL_15_11("441", LovKilde.FOLKETRYGDLOVEN, "§ 15-11"),
    FTRL_15_12("442", LovKilde.FOLKETRYGDLOVEN, "§ 15-12"),
    FTRL_15_13("443", LovKilde.FOLKETRYGDLOVEN, "§ 15-13"),

    FTRL_17_1_A("FTRL_17_1_A", LovKilde.FOLKETRYGDLOVEN, "§ 17-1 a"),
    FTRL_17_2("FTRL_17_2", LovKilde.FOLKETRYGDLOVEN, "§ 17-2"),
    FTRL_17_3("FTRL_17_3", LovKilde.FOLKETRYGDLOVEN, "§ 17-3"),
    FTRL_17_4("FTRL_17_4", LovKilde.FOLKETRYGDLOVEN, "§ 17-4"),
    FTRL_17_5("FTRL_17_5", LovKilde.FOLKETRYGDLOVEN, "§ 17-5"),
    FTRL_17_6("FTRL_17_6", LovKilde.FOLKETRYGDLOVEN, "§ 17-6"),
    FTRL_17_7("FTRL_17_7", LovKilde.FOLKETRYGDLOVEN, "§ 17-7"),
    FTRL_17_8("FTRL_17_8", LovKilde.FOLKETRYGDLOVEN, "§ 17-8"),
    FTRL_17_9("FTRL_17_9", LovKilde.FOLKETRYGDLOVEN, "§ 17-9"),
    FTRL_17_10("FTRL_17_10", LovKilde.FOLKETRYGDLOVEN, "§ 17-10"),
    FTRL_17_11("FTRL_17_11", LovKilde.FOLKETRYGDLOVEN, "§ 17-11"),
    FTRL_17_12("FTRL_17_12", LovKilde.FOLKETRYGDLOVEN, "§ 17-12"),
    FTRL_17_13("FTRL_17_13", LovKilde.FOLKETRYGDLOVEN, "§ 17-13"),
    FTRL_17_14("FTRL_17_14", LovKilde.FOLKETRYGDLOVEN, "§ 17-14"),
    FTRL_17_15("FTRL_17_15", LovKilde.FOLKETRYGDLOVEN, "§ 17-15"),

    FTRL_17_A_1("FTRL_17_A_1", LovKilde.FOLKETRYGDLOVEN, "§ 17 A-1"),
    FTRL_17_A_2("FTRL_17_A_2", LovKilde.FOLKETRYGDLOVEN, "§ 17 A-2"),
    FTRL_17_A_3("FTRL_17_A_3", LovKilde.FOLKETRYGDLOVEN, "§ 17 A-3"),
    FTRL_17_A_4("FTRL_17_A_4", LovKilde.FOLKETRYGDLOVEN, "§ 17 A-4"),
    FTRL_17_A_5("FTRL_17_A_5", LovKilde.FOLKETRYGDLOVEN, "§ 17 A-5"),
    FTRL_17_A_6("FTRL_17_A_6", LovKilde.FOLKETRYGDLOVEN, "§ 17 A-6"),
    FTRL_17_A_7("FTRL_17_A_7", LovKilde.FOLKETRYGDLOVEN, "§ 17 A-7"),
    FTRL_17_A_8("FTRL_17_A_8", LovKilde.FOLKETRYGDLOVEN, "§ 17 A-8"),

    FTRL_18_1_A("FTRL_18_1_A", LovKilde.FOLKETRYGDLOVEN, "§ 18-1 a"),
    FTRL_18_2("FTRL_18_2", LovKilde.FOLKETRYGDLOVEN, "§ 18-2"),
    FTRL_18_3("FTRL_18_3", LovKilde.FOLKETRYGDLOVEN, "§ 18-3"),
    FTRL_18_4("FTRL_18_4", LovKilde.FOLKETRYGDLOVEN, "§ 18-4"),
    FTRL_18_5("FTRL_18_5", LovKilde.FOLKETRYGDLOVEN, "§ 18-5"),
    FTRL_18_6("FTRL_18_6", LovKilde.FOLKETRYGDLOVEN, "§ 18-6"),
    FTRL_18_7("FTRL_18_7", LovKilde.FOLKETRYGDLOVEN, "§ 18-7"),
    FTRL_18_8("FTRL_18_8", LovKilde.FOLKETRYGDLOVEN, "§ 18-8"),
    FTRL_18_9("FTRL_18_9", LovKilde.FOLKETRYGDLOVEN, "§ 18-9"),
    FTRL_18_10("FTRL_18_10", LovKilde.FOLKETRYGDLOVEN, "§ 18-10"),
    FTRL_18_11("FTRL_18_11", LovKilde.FOLKETRYGDLOVEN, "§ 18-11"),

    FTRL_21_3("108", LovKilde.FOLKETRYGDLOVEN, "§ 21-3"),
    FTRL_21_6("FTRL_21_6", LovKilde.FOLKETRYGDLOVEN, "§ 21-6"),
    FTRL_21_7("FTRL_21_7", LovKilde.FOLKETRYGDLOVEN, "§ 21-7"),
    FTRL_21_10("FTRL_21_10", LovKilde.FOLKETRYGDLOVEN, "§ 21-10"),
    FTRL_21_12("FTRL_21_12", LovKilde.FOLKETRYGDLOVEN, "§ 21-12"),

    FTRL_22_1("FTRL_22_1", LovKilde.FOLKETRYGDLOVEN, "§ 22-1"),
    FTRL_22_1_A("FTRL_22_1_A", LovKilde.FOLKETRYGDLOVEN, "§ 22-1 a"),
    FTRL_22_3("1000.022.003", LovKilde.FOLKETRYGDLOVEN, "§ 22-3"),
    FTRL_22_12("1000.022.012", LovKilde.FOLKETRYGDLOVEN, "§ 22-12"),
    FTRL_22_13("1000.022.013", LovKilde.FOLKETRYGDLOVEN, "§ 22-13"),

    FTRL_22_13_1("FTRL_22_13_1", LovKilde.FOLKETRYGDLOVEN, "§ 22-13 1. ledd"),
    FTRL_22_13_3("FTRL_22_13_3", LovKilde.FOLKETRYGDLOVEN, "§ 22-13 3. ledd"),
    FTRL_22_13_4_C("FTRL_22_13_4_C", LovKilde.FOLKETRYGDLOVEN, "§ 22-13 4. ledd c)"),
    FTRL_22_13_7("FTRL_22_13_7", LovKilde.FOLKETRYGDLOVEN, "§ 22-13 7. ledd"),

    FTRL_22_14_3("FTRL_22_14_3", LovKilde.FOLKETRYGDLOVEN, "§ 22-14 3. ledd"),

    FTRL_22_15("1000.022.015", LovKilde.FOLKETRYGDLOVEN, "§ 22-15"),
    FTRL_22_15_1_1("FTRL_22_15_1_1", LovKilde.FOLKETRYGDLOVEN, "§ 22-15 1. ledd 1. pkt."),
    FTRL_22_15_1_2("FTRL_22_15_1_2", LovKilde.FOLKETRYGDLOVEN, "§ 22-15 1. ledd 2. pkt."),
    FTRL_22_15_2("FTRL_22_15_2", LovKilde.FOLKETRYGDLOVEN, "§ 22-15 2. ledd"),
    FTRL_22_15_4("FTRL_22_15_4", LovKilde.FOLKETRYGDLOVEN, "§ 22-15 4. ledd"),
    FTRL_22_15_5("FTRL_22_15_5", LovKilde.FOLKETRYGDLOVEN, "§ 22-15 5. ledd"),

    FTRL_22_17("FTRL_22_17", LovKilde.FOLKETRYGDLOVEN, "§ 22-17"),
    FTRL_22_17A("FTRL_22_17A", LovKilde.FOLKETRYGDLOVEN, "§ 22-17a"),
    FTRL_22_17B("FTRL_22_17B", LovKilde.FOLKETRYGDLOVEN, "§ 22-17b"),

    FTRL_23_3("FTRL_23_3", LovKilde.FOLKETRYGDLOVEN, "§ 23-3"),

    FTRL_25_14("FTRL_25_14", LovKilde.FOLKETRYGDLOVEN, "§ 25-14"),

    EOES_AVTALEN("601", LovKilde.EØS_AVTALEN, "EØS-avtalen"),
    EOES_AVTALEN_BEREGNING("EOES_AVTALEN_BEREGNING", LovKilde.EØS_AVTALEN, "EØS-avtalen - beregning"),
    EOES_AVTALEN_MEDLEMSKAP_TRYGDETID("EOES_AVTALEN_MEDLEMSKAP_TRYGDETID", LovKilde.EØS_AVTALEN, "EØS-avtalen - medlemskap/trygdetid"),
    NORDISK_KONVENSJON("NORDISK_KONVENSJON", LovKilde.NORDISK_KONVENSJON, "Nordisk konvensjon"),
    ANDRE_TRYGDEAVTALER("ANDRE_TRYGDEAVTALER", LovKilde.ANDRE_TRYGDEAVTALER, "Andre trygdeavtaler"),
    EOES_883_2004("EOES_883_2004", LovKilde.EØS_FORORDNING_883_2004, "EØS forordning 883/2004"),
    EOES_883_2004_5("EOES_883_2004_5", LovKilde.EØS_FORORDNING_883_2004, "art. 5"),
    EOES_883_2004_6("228", LovKilde.EØS_FORORDNING_883_2004, "art. 6"),

    //Backwards compatibility in dev with search and innstillinger. Can be removed later?
    FTL("1000", LovKilde.FOLKETRYGDLOVEN, "Folketrygdloven"),
    FTL_9("1000.009", LovKilde.FOLKETRYGDLOVEN, "Folketrygdloven kapittel 9"),
    MANGLER("1002", LovKilde.UKJENT, "Hjemmel mangler"),
    ;

    fun toSearchableString(): String {
        return "${lovKilde.navn}-${spesifikasjon}"
    }

    companion object {
        fun of(id: String): Hjemmel {
            return entries.firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No Hjemmel with id $id exists")
        }
    }

}

@Converter
class HjemmelConverter : AttributeConverter<Hjemmel, String?> {

    override fun convertToDatabaseColumn(entity: Hjemmel?): String? =
        entity?.id

    override fun convertToEntityAttribute(id: String?): Hjemmel? =
        id?.let { Hjemmel.of(it) }
}