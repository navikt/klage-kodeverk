package no.nav.klage.kodeverk.hjemmel

import no.nav.klage.kodeverk.Ytelse
import no.nav.klage.kodeverk.hjemmel.Hjemmel.*

val hjemlerHJE_HJE = listOf(
    FTRL_10_3,
    FTRL_10_7A,
    FTRL_10_7B,
    FTRL_10_7C,
    FTRL_10_7D,
    FTRL_10_7E,
    FTRL_10_7F,
    FTRL_10_7G,
    FTRL_10_7H,
    FTRL_10_7I,
    FTRL_10_7_3A,
    FTRL_21_12,
    FTRL_22_13,
)

val hjemlerGRU = listOf(
    FTRL_6_2,
    FTRL_6_3,
    FTRL_6_3_A,
    FTRL_6_3_B,
    FTRL_6_3_C,
    FTRL_6_3_F,
    FTRL_6_3_G,
    FTRL_6_3_H,
    FTRL_6_4,
    FTRL_6_5,
    FTRL_6_6,
    FTRL_6_7,
    FTRL_6_8,
    FTRL_22_12,
    FTRL_22_13,
    FTRL_22_15,
)

val hjemlerYRK = listOf(
    FTRL_13_3_1,
    FTRL_13_3_2,
    FTRL_13_3_FS,
    FTRL_13_4,
    FTRL_13_6,
    FTRL_13_8,
    FTRL_13_10,
    FTRL_13_17,
    FTRL_21_12,

    TRRL_9,
)

val hjemler_PEN_GJE_PEN_BAR_common = listOf(
    FTRL_1_3,
    FTRL_1_3_A,
    FTRL_1_3_B,
    FTRL_1_5,

    FTRL_2_1,
    FTRL_2_1_A,
    FTRL_2_2,
    FTRL_2_3,
    FTRL_2_4,
    FTRL_2_5,
    FTRL_2_6,
    FTRL_2_7,
    FTRL_2_7_A,
    FTRL_2_8,
    FTRL_2_9,
    FTRL_2_10,
    FTRL_2_11,
    FTRL_2_12,
    FTRL_2_13,
    FTRL_2_14,
    FTRL_2_15,
    FTRL_2_16,
    FTRL_2_17,

    FTRL_3_1,
    FTRL_3_5_TRYGDETID,
    FTRL_3_7,
    FTRL_3_10,
    FTRL_3_13,
    FTRL_3_14,
    FTRL_3_15,

    FTRL_21_6,
    FTRL_21_7,
    FTRL_21_10,

    FTRL_22_1,
    FTRL_22_1_A,
    FTRL_22_12,
    FTRL_22_13_1,
    FTRL_22_13_3,
    FTRL_22_13_4_C,
    FTRL_22_13_7,
    FTRL_22_14_3,
    FTRL_22_15_1_1,
    FTRL_22_15_1_2,
    FTRL_22_15_2,
    FTRL_22_15_4,
    FTRL_22_15_5,
    FTRL_22_17A,
    FTRL_22_17B,
    FTRL_25_14,

    FVL_31,
    FVL_32,
    FVL_33_2,
    FVL_35_1_C,
    FVL_36,

    ANDRE_TRYGDEAVTALER,
    EOES_AVTALEN_BEREGNING,
    EOES_AVTALEN_MEDLEMSKAP_TRYGDETID,
)

/**
 * Used for innsending, search and innstillinger
 */

val ytelseTilHjemler = mapOf(
    Ytelse.ENF_ENF to listOf(
        FTRL_15_2,
        FTRL_15_3,
        FTRL_15_4,
        FTRL_15_5,
        FTRL_15_6,
        FTRL_15_8,
        FTRL_15_9,
        FTRL_15_10,
        FTRL_15_11,
        FTRL_15_12,
        FTRL_15_13,
        FTRL_22_12,
        FTRL_22_13,
        FTRL_22_15,
    ),
    Ytelse.BAR_BAR to listOf(
        BTRL_2,
        BTRL_4,
        BTRL_5,
        BTRL_9,
        BTRL_10,
        BTRL_11,
        BTRL_12,
        BTRL_13,
        BTRL_17,
        BTRL_18,
        EOES_AVTALEN,
        NORDISK_KONVENSJON,
        ANDRE_TRYGDEAVTALER,
    ),

    Ytelse.KON_KON to listOf(
        KONTSL_2,
        KONTSL_3,
        KONTSL_4,
        KONTSL_6,
        KONTSL_7,
        KONTSL_8,
        KONTSL_9,
        KONTSL_10,
        KONTSL_11,
        KONTSL_12,
        KONTSL_13,
        KONTSL_14,
        KONTSL_16,
        EOES_AVTALEN,
        NORDISK_KONVENSJON,
        ANDRE_TRYGDEAVTALER,
    ),

    Ytelse.OMS_OLP to listOf(
        FTRL_9_2,
        FTRL_9_3,
        FTRL_9_5,
        FTRL_9_6,
        FTRL_9_8,
        FTRL_9_9,
        FTRL_9_10,
        FTRL_9_11,
        FTRL_9_13,
        FTRL_9_14,
        FTRL_9_15,
        FTRL_9_16,
        FTRL_22_13,
        FTRL_22_15,
    ),
    Ytelse.OMS_OMP to listOf(
        FTRL_9_2,
        FTRL_9_3,
        FTRL_9_5,
        FTRL_9_6,
        FTRL_9_8,
        FTRL_9_9,
        FTRL_9_10,
        FTRL_9_11,
        FTRL_9_13,
        FTRL_9_14,
        FTRL_9_15,
        FTRL_9_16,
        FTRL_22_13,
        FTRL_22_15,
    ),
    Ytelse.OMS_PLS to listOf(
        FTRL_9_2,
        FTRL_9_3,
        FTRL_9_5,
        FTRL_9_6,
        FTRL_9_8,
        FTRL_9_9,
        FTRL_9_10,
        FTRL_9_11,
        FTRL_9_13,
        FTRL_9_14,
        FTRL_9_15,
        FTRL_9_16,
        FTRL_22_13,
        FTRL_22_15,
    ),
    Ytelse.OMS_PSB to listOf(
        FTRL_9_2,
        FTRL_9_3,
        FTRL_9_5,
        FTRL_9_6,
        FTRL_9_8,
        FTRL_9_9,
        FTRL_9_10,
        FTRL_9_11,
        FTRL_9_13,
        FTRL_9_14,
        FTRL_9_15,
        FTRL_9_16,
        FTRL_22_13,
        FTRL_22_15,
    ),

    Ytelse.SYK_SYK to listOf(
        FTRL_8_1,
        FTRL_8_2,
        FTRL_8_3,
        FTRL_8_4,
        FTRL_8_5,
        FTRL_8_6,
        FTRL_8_7,
        FTRL_8_8,
        FTRL_8_9,
        FTRL_8_10,
        FTRL_8_11,
        FTRL_8_12,
        FTRL_8_13,
        FTRL_8_14,
        FTRL_8_15,
        FTRL_8_16,
        FTRL_8_17,
        FTRL_8_18,
        FTRL_8_19,
        FTRL_8_20,
        FTRL_8_21,
        FTRL_8_22,
        FTRL_8_23,
        FTRL_8_24,
        FTRL_8_25,
        FTRL_8_26,
        FTRL_8_27,
        FTRL_8_28,
        FTRL_8_29,
        FTRL_8_30,
        FTRL_8_31,
        FTRL_8_32,
        FTRL_8_33,
        FTRL_8_34,
        FTRL_8_35,
        FTRL_8_36,
        FTRL_8_37,
        FTRL_8_38,
        FTRL_8_39,
        FTRL_8_40,
        FTRL_8_41,
        FTRL_8_42,
        FTRL_8_43,
        FTRL_8_44,
        FTRL_8_45,
        FTRL_8_46,
        FTRL_8_47,
        FTRL_8_48,
        FTRL_8_49,
        FTRL_8_50,
        FTRL_8_51,
        FTRL_8_52,
        FTRL_8_53,
        FTRL_8_54,
        FTRL_8_55,

        FTRL_21_3,
        FTRL_21_7,
        FTRL_21_12,

        FTRL_22_3,
        FTRL_22_13,
        FTRL_22_15,
        FTRL_22_17,
        FTRL_22_17A,
    ),
    Ytelse.SUP_UFF to listOf(
        SUP_ST_L_3,
        SUP_ST_L_4,
        SUP_ST_L_5,
        SUP_ST_L_6,
        SUP_ST_L_7,
        SUP_ST_L_8,
        SUP_ST_L_9,
        SUP_ST_L_10,
        SUP_ST_L_11,
        SUP_ST_L_12,
        SUP_ST_L_13,
        SUP_ST_L_17,
        SUP_ST_L_18,
        SUP_ST_L_21,
    ),
    Ytelse.FOR_ENG to listOf(
        FTRL_14_2,
        FTRL_14_17,
        FTRL_21_3,
        FTRL_22_13,
        FTRL_22_15,
    ),
    Ytelse.FOR_FOR to listOf(
        FTRL_14_2,
        FTRL_14_5,
        FTRL_14_6,
        FTRL_14_7,
        FTRL_14_9,
        FTRL_14_10,
        FTRL_14_11,
        FTRL_14_12,
        FTRL_14_13,
        FTRL_14_14,
        FTRL_14_15,
        FTRL_14_16,
        FTRL_8_2,
        FTRL_21_3,
        FTRL_22_13,
        FTRL_22_15,
        EOES_883_2004_5,
        EOES_883_2004_6,
    ),
    Ytelse.FOR_SVA to listOf(
        FTRL_14_2,
        FTRL_14_4,
        FTRL_14_6,
        FTRL_14_7,
        FTRL_8_2,
        FTRL_21_3,
        FTRL_22_13,
        FTRL_22_15,
        EOES_883_2004_6,
    ),
    Ytelse.HJE_HJE to hjemlerHJE_HJE,
    Ytelse.BIL_BIL to hjemlerHJE_HJE,
    Ytelse.HEL_HEL to hjemlerHJE_HJE,

    Ytelse.PEN_BAR to hjemler_PEN_GJE_PEN_BAR_common + listOf(
        FTRL_18_1_A,
        FTRL_18_2,
        FTRL_18_3,
        FTRL_18_4,
        FTRL_18_5,
        FTRL_18_6,
        FTRL_18_7,
        FTRL_18_8,
        FTRL_18_9,
        FTRL_18_10,
        FTRL_18_11,
    ),

    Ytelse.PEN_GJE to hjemler_PEN_GJE_PEN_BAR_common + listOf(
        FTRL_17_1_A,
        FTRL_17_2,
        FTRL_17_3,
        FTRL_17_4,
        FTRL_17_5,
        FTRL_17_6,
        FTRL_17_7,
        FTRL_17_8,
        FTRL_17_9,
        FTRL_17_10,
        FTRL_17_11,
        FTRL_17_12,
        FTRL_17_13,
        FTRL_17_14,
        FTRL_17_15,

        FTRL_17_A_1,
        FTRL_17_A_2,
        FTRL_17_A_3,
        FTRL_17_A_4,
        FTRL_17_A_5,
        FTRL_17_A_6,
        FTRL_17_A_7,
        FTRL_17_A_8,
    ),
    Ytelse.GRU_HJE to hjemlerGRU,
    Ytelse.GRU_GRU to hjemlerGRU,

    Ytelse.YRK_MEN to hjemlerYRK,
    Ytelse.YRK_YRK to hjemlerYRK,
    Ytelse.YRK_YSY to hjemlerYRK,

    Ytelse.MED_MED to listOf(
        FTRL_2_1,
        FTRL_2_2,
        FTRL_2_3,
        FTRL_2_4,
        FTRL_2_5,
        FTRL_2_6,
        FTRL_2_7,
        FTRL_2_8,
        FTRL_2_11,
        FTRL_2_12,
        FTRL_2_13,
        FTRL_2_14,
        FTRL_2_15,
        FTRL_2_17,
        FTRL_21_12,
        FTRL_23_3,

        TRRL_9,

        EOES_883_2004,
        ANDRE_TRYGDEAVTALER,
    ),

    Ytelse.GRA_GRA to listOf(
        FTRL_7_2,
        FTRL_7_3,
        FTRL_22_13_2,
        FTRL_22_15,
    ),

    Ytelse.FOS_FOS to listOf(
        FTRL_8_36,
        FTRL_8_37,
        FTRL_8_39,
    )
)