package no.nav.klage.kodeverk.hjemmel

import no.nav.klage.kodeverk.ytelse.Ytelse
import no.nav.klage.kodeverk.hjemmel.Hjemmel.*

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
    FTRL_21_4,
    FTRL_21_7,
    FTRL_21_12,
    FTRL_22_12,
    FTRL_22_13,
    FTRL_22_14,
    FTRL_22_15,
    FTRL_22_17,

    FVL_30,
    FVL_31,
    FVL_32,
    FVL_33,
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

    KRAV_OM_OMGJOERING,
    BEGJAERING_OM_GJENOPPTAK,
)

/**
 * Used for innsending, search and innstillinger
 */

val ytelseToHjemler = mapOf(
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
        BTRL_14,
        BTRL_15,
        BTRL_17,
        BTRL_18,
        FVL_35,
        EOES_AVTALEN,
        NORDISK_KONVENSJON,
        ANDRE_TRYGDEAVTALER,
    ),

    Ytelse.KON_KON to listOf(
        KONTSL_1A,
        KONTSL_2,
        KONTSL_3,
        KONTSL_3A,
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
        KONTSL_17,
        KONTSL_19,
        KONTSL_22,
        FTRL_22_15,
        FVL_28,
        FVL_29,
        FVL_30,
        FVL_31,
        FVL_32,
        FVL_33,
        FVL_34,
        FVL_35,
        FVL_36,
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
        FTRL_22_10,
        FTRL_22_13,
        FTRL_22_15,
        FTRL_22_17,
        FTRL_22_17A,

        ANKENEMNDA,

        KRAV_OM_OMGJOERING,
        BEGJAERING_OM_GJENOPPTAK,
    ),
    Ytelse.SUP_PEN to listOf(
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

        FTRL_21_12,

        FVL_29,
        FVL_30,
        FVL_31,
        FVL_35,

        TRRL_9,
        TRRL_10,
        TRRL_11,
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

        FTRL_21_12,

        FVL_29,
        FVL_30,
        FVL_31,
        FVL_35,

        TRRL_9,
        TRRL_10,
        TRRL_11,
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
        FTRL_14_17,
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
    Ytelse.HJE_HJE to listOf(
        FTRL_10_3,
        FTRL_10_4,
        FTRL_10_5,
        FTRL_10_6,
        FTRL_10_7A,
        FTRL_10_7B,
        FTRL_10_7C,
        FTRL_10_7D,
        FTRL_10_7E,
        FTRL_10_7F,
        FTRL_10_7G,
        FTRL_10_7I_B,
        FTRL_10_7XA,
        FTRL_10_7XB,
        FTRL_10_8,
        FTRL_21_3,
        FTRL_21_7,
        FTRL_21_8,
        FTRL_21_10,
        FTRL_21_12,
        FTRL_22_12,
        FTRL_22_13,
        FTRL_22_14,
        FTRL_22_17,

        FS_AKT_26_2A,
        FS_AKT_26_2B,
        FS_AKT_26_4,
        FS_AKT_26_5,

        FS_HJE_MM_2A,
        FS_HJE_MM_2B,
        FS_HJE_MM_2C,
        FS_HJE_MM_2D,
        FS_HJE_MM_2E,
        FS_HJE_MM_2F,
        FS_HJE_MM_2G,
        FS_HJE_MM_2H,
        FS_HJE_MM_2I,
        FS_HJE_MM_2J,
        FS_HJE_MM_2K,
        FS_HJE_MM_2L,
        FS_HJE_MM_2M,
        FS_HJE_MM_2N,
        FS_HJE_MM_2O,
        FS_HJE_MM_2P,
        FS_HJE_MM_2Q,
        FS_HJE_MM_2R,
        FS_HJE_MM_4,
        FS_HJE_MM_6A,
        FS_HJE_MM_6D,
        FS_HJE_MM_7,

        FS_HA_MM_2A,
        FS_HA_MM_3A,
        FS_HA_MM_4A,
        FS_HA_MM_6A,
        FS_HA_MM_8A,

        FS_SH_2,

        EOES_883_2004_11,
        EOES_883_2004_12,
        EOES_883_2004_13,
        EOES_883_2004_23,
        EOES_883_2004_24,
        EOES_883_2004_25,
        EOES_883_2004_33,
        EOES_883_2004_81,

        GJ_F_FORD_987_2009_11,

        NORDISK_KONVENSJON,

        FVL_11,
        FVL_12,
        FVL_14,
        FVL_16,
        FVL_17,
        FVL_18_19,
        FVL_21,
        FVL_24,
        FVL_25,
        FVL_28,
        FVL_29,
        FVL_30,
        FVL_31,
        FVL_32,
        FVL_33,
        FVL_35,
        FVL_41,
        FVL_42,

        TRRL_2,
        TRRL_9,
        TRRL_10,
        TRRL_11,
        TRRL_12,
        TRRL_14,
    ),

    Ytelse.BIL_BIL to listOf(
        FTRL_10_3,
        FTRL_10_4,
        FTRL_10_5,
        FTRL_10_6,
        FTRL_10_7H,
        FTRL_10_8,
        FTRL_21_3,
        FTRL_21_7,
        FTRL_21_8,
        FTRL_21_10,
        FTRL_21_12,
        FTRL_22_12,
        FTRL_22_13,
        FTRL_22_14,
        FTRL_22_17,

        FS_MOK_2B,
        FS_MOK_2C,
        FS_MOK_2D,
        FS_MOK_3A,
        FS_MOK_5A,
        FS_MOK_6A,
        FS_MOK_7A,
        FS_MOK_8A,
        FS_MOK_9A,
        FS_MOK_11A,
        FS_MOK_11B,
        FS_MOK_12A,
        FS_MOK_13,
        FS_MOK_14,
        FS_MOK_15,

        EOES_883_2004_11,
        EOES_883_2004_12,
        EOES_883_2004_13,
        EOES_883_2004_23,
        EOES_883_2004_24,
        EOES_883_2004_25,
        EOES_883_2004_33,
        EOES_883_2004_81,

        GJ_F_FORD_987_2009_11,

        NORDISK_KONVENSJON,

        FVL_11,
        FVL_12,
        FVL_14,
        FVL_16,
        FVL_17,
        FVL_18_19,
        FVL_21,
        FVL_24,
        FVL_25,
        FVL_28,
        FVL_29,
        FVL_30,
        FVL_31,
        FVL_32,
        FVL_33,
        FVL_35,
        FVL_41,
        FVL_42,

        TRRL_2,
        TRRL_9,
        TRRL_10,
        TRRL_11,
        TRRL_12,
        TRRL_14,
    ),
    Ytelse.HEL_HEL to listOf(
        FTRL_10_3,
        FTRL_10_4,
        FTRL_10_5,
        FTRL_10_6,
        FTRL_10_7I,
        FTRL_10_8,
        FTRL_21_3,
        FTRL_21_7,
        FTRL_21_8,
        FTRL_21_10,
        FTRL_21_12,
        FTRL_22_12,
        FTRL_22_13,
        FTRL_22_14,
        FTRL_22_17,

        FS_ORT_HJE_MM_1A,
        FS_ORT_HJE_MM_1B,
        FS_ORT_HJE_MM_1C,
        FS_ORT_HJE_MM_2F,
        FS_ORT_HJE_MM_3A,
        FS_ORT_HJE_MM_4A,
        FS_ORT_HJE_MM_5A,
        FS_ORT_HJE_MM_6A,
        FS_ORT_HJE_MM_7A,
        FS_ORT_HJE_MM_7A,
        FS_ORT_HJE_MM_8G,
        FS_ORT_HJE_MM_9A,
        FS_ORT_HJE_MM_9AA,
        FS_ORT_HJE_MM_10A,
        FS_ORT_HJE_MM_12A,

        EOES_883_2004_11,
        EOES_883_2004_12,
        EOES_883_2004_13,
        EOES_883_2004_23,
        EOES_883_2004_24,
        EOES_883_2004_25,
        EOES_883_2004_33,
        EOES_883_2004_81,

        GJ_F_FORD_987_2009_11,

        NORDISK_KONVENSJON,

        FVL_11,
        FVL_12,
        FVL_14,
        FVL_16,
        FVL_17,
        FVL_18_19,
        FVL_21,
        FVL_24,
        FVL_25,
        FVL_28,
        FVL_29,
        FVL_30,
        FVL_31,
        FVL_32,
        FVL_33,
        FVL_35,
        FVL_41,
        FVL_42,

        TRRL_2,
        TRRL_9,
        TRRL_10,
        TRRL_11,
        TRRL_12,
        TRRL_14,
    ),

    Ytelse.PEN_AFP to listOf(
        AFP_PRIVAT,
        AFP_62_OFFENTLIG_ETTEROPPGJOER,
        AFP_62_OFFENTLIG_ANNET,
    ),

    Ytelse.PEN_BAR to listOf(
        FTRL_18_2,
        FTRL_18_3,
        FTRL_18_4,
        FTRL_18_5,
        FTRL_18_6,
        FTRL_18_7,
        FTRL_18_8,
        FTRL_18_9,
        FTRL_18_10,
        FTRL_18_11_YRKESSKADE_GAMMEL,

        FTRL_2_1,
        FTRL_2_2,
        FTRL_2_5,
        FTRL_2_13,
        FTRL_2_14,

        FTRL_3_3,
        FTRL_3_5_TRYGDETID,
        FTRL_3_7,
        FTRL_3_23,

        FTRL_21_3,
        FTRL_21_6,
        FTRL_21_7,
        FTRL_21_10,
        FTRL_21_12,

        FTRL_22_7,
        FTRL_22_8,
        FTRL_22_12,
        FTRL_22_13,
        FTRL_22_14,
        FTRL_22_15_1_1,
        FTRL_22_15_1_2,
        FTRL_22_15_2,
        FTRL_22_15_4,
        FTRL_22_15_5,
        FTRL_22_15_6,
        FTRL_22_16,
        FTRL_22_17,
        FTRL_22_17A,

        FVL_21,
        FVL_28,
        FVL_29,
        FVL_30,
        FVL_31,
        FVL_32,
        FVL_33,
        FVL_35,
        FVL_36,
        FVL_42,

        ANDRE_TRYGDEAVTALER,

        EOES_AVTALEN_BEREGNING,

        EOES_AVTALEN_MEDLEMSKAP_TRYGDETID,
    ),

    Ytelse.PEN_EYO to listOf(
        FTRL_17_2,
        FTRL_17_3,
        FTRL_17_4_1,
        FTRL_17_4_2,
        FTRL_17_5_1,
        FTRL_17_5_2,
        FTRL_17_5_3,
        FTRL_17_6_NY,
        FTRL_17_7_NY,
        FTRL_17_8_NY,
        FTRL_17_9_NY,
        FTRL_17_10,
        FTRL_17_11,
        FTRL_17_12,
        FTRL_17_14,
        FTRL_17_15,

        FTRL_1_5,

        FTRL_2_1,
        FTRL_2_2,
        FTRL_2_5,
        FTRL_2_13,
        FTRL_2_14,

        FTRL_3_3,
        FTRL_3_5_TRYGDETID,
        FTRL_3_7,
        FTRL_3_8,
        FTRL_3_9,
        FTRL_3_10,
        FTRL_3_11,
        FTRL_3_12,
        FTRL_3_13,
        FTRL_3_14,
        FTRL_3_15,
        FTRL_3_16,
        FTRL_3_17,
        FTRL_3_18,
        FTRL_3_19,
        FTRL_3_22,
        FTRL_3_23,

        FTRL_17_A_1,
        FTRL_17_A_2,
        FTRL_17_A_3,
        FTRL_17_A_4,
        FTRL_17_A_5,
        FTRL_17_A_6,
        FTRL_17_A_7,
        FTRL_17_A_8,

        FTRL_21_3,
        FTRL_21_4,
        FTRL_21_6,
        FTRL_21_7,
        FTRL_21_10,
        FTRL_21_12,

        FTRL_22_7,
        FTRL_22_8,
        FTRL_22_12,
        FTRL_22_13,
        FTRL_22_14,
        FTRL_22_15_1_1,
        FTRL_22_15_1_2,
        FTRL_22_15_2,
        FTRL_22_15_4,
        FTRL_22_15_5,
        FTRL_22_15_6,
        FTRL_22_16,
        FTRL_22_17,
        FTRL_22_17A,

        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_2,
        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_3,
        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_4,
        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_5,
        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_6,
        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_7,
        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_8,
        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_9,
        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_10,

        FVL_21,
        FVL_28,
        FVL_29,
        FVL_30,
        FVL_31,
        FVL_32,
        FVL_33,
        FVL_35,
        FVL_36,
        FVL_42,

        ANDRE_TRYGDEAVTALER,

        EOES_AVTALEN_BEREGNING,

        EOES_AVTALEN_MEDLEMSKAP_TRYGDETID,
    ),

    Ytelse.PEN_GJE to listOf(
        FTRL_17_2,
        FTRL_17_3,
        FTRL_17_4_1,
        FTRL_17_4_2,
        FTRL_17_4,
        FTRL_17_5_1,
        FTRL_17_5_2,
        FTRL_17_5_3,
        FTRL_17_5,
        FTRL_17_6_NY,
        FTRL_17_6,
        FTRL_17_7_NY,
        FTRL_17_7,
        FTRL_17_8_NY,
        FTRL_17_8,
        FTRL_17_9_NY,
        FTRL_17_9,
        FTRL_17_10,
        FTRL_17_11,
        FTRL_17_12,
        FTRL_17_14,
        FTRL_17_15,

        FTRL_1_5,

        FTRL_2_1,
        FTRL_2_2,
        FTRL_2_5,
        FTRL_2_13,
        FTRL_2_14,

        FTRL_3_3,
        FTRL_3_5_TRYGDETID,
        FTRL_3_7,
        FTRL_3_8,
        FTRL_3_9,
        FTRL_3_10,
        FTRL_3_11,
        FTRL_3_12,
        FTRL_3_13,
        FTRL_3_14,
        FTRL_3_15,
        FTRL_3_16,
        FTRL_3_17,
        FTRL_3_18,
        FTRL_3_19,
        FTRL_3_22,
        FTRL_3_23,

        FTRL_17_A_1,
        FTRL_17_A_2,
        FTRL_17_A_3,
        FTRL_17_A_4,
        FTRL_17_A_5,
        FTRL_17_A_6,
        FTRL_17_A_7,
        FTRL_17_A_8,

        FTRL_21_3,
        FTRL_21_4,
        FTRL_21_6,
        FTRL_21_7,
        FTRL_21_10,
        FTRL_21_12,

        FTRL_22_7,
        FTRL_22_8,
        FTRL_22_12,
        FTRL_22_13,
        FTRL_22_14,
        FTRL_22_15_1_1,
        FTRL_22_15_1_2,
        FTRL_22_15_2,
        FTRL_22_15_4,
        FTRL_22_15_5,
        FTRL_22_15_6,
        FTRL_22_16,
        FTRL_22_17,
        FTRL_22_17A,

        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_2,
        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_3,
        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_4,
        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_5,
        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_6,
        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_7,
        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_8,
        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_9,
        FS_YTELSE_TIL_GJENLEVENDE_EKTEFELLE_OG_TIDLIGERE_FAMILIEPLEIER_10,

        FVL_21,
        FVL_28,
        FVL_29,
        FVL_30,
        FVL_31,
        FVL_32,
        FVL_33,
        FVL_35,
        FVL_36,
        FVL_42,

        ANDRE_TRYGDEAVTALER,

        EOES_AVTALEN_BEREGNING,

        EOES_AVTALEN_MEDLEMSKAP_TRYGDETID,
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
        BEGJAERING_OM_GJENOPPTAK,
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
    ),

    Ytelse.PEN_ALD to listOf(
        FTRL_19_OG_20_UFOERE_TIL_ALDER,
        FTRL_19_OG_20_BEREGNING,
        FTRL_19_2,
        FTRL_19_3,
        FTRL_19_4,
        FTRL_19_5,
        FTRL_19_5_BEREGNING,
        FTRL_19_6,
        FTRL_19_7,
        FTRL_19_8_MINSTE_PENSJONSNIVAA,
        FTRL_19_9,
        FTRL_19_10,
        FTRL_19_11_OG_20_15,
        FTRL_19_12,
        FTRL_19_13_OG_20_17,
        FTRL_19_14,
        FTRL_19_15,
        FTRL_19_16_GJENLEVENDETILLEGG,
        FTRL_19_17,
        FTRL_19_18,
        FTRL_19_19,
        FTRL_19_20_YRKESSKADE,
        FTRL_19_21_INSTITUSJON,
        FTRL_19_22_SONING,

        FTRL_1_5,

        FTRL_2_1_2_2_2_4_2_13_2_14_MEDLEMSKAP,

        FTRL_3_2_INNTEKT,
        FTRL_3_2_SIVILSTAND,
        FTRL_3_3,
        FTRL_3_5_TRYGDETID,
        FTRL_3_7,
        FTRL_3_8,
        FTRL_3_9,
        FTRL_3_10,
        FTRL_3_11,
        FTRL_3_12,
        FTRL_3_13,
        FTRL_3_14_PP,
        FTRL_3_15_PI,
        FTRL_3_16_OMSORGSPOENG,
        FTRL_3_17,
        FTRL_3_18,
        FTRL_3_19,
        FTRL_3_22,
        FTRL_3_23,
        FTRL_3_24_3_26_EKTEFELLETILLEGG,
        FTRL_3_25_3_26_BARNETILLEGG,

        FTRL_20_2,
        FTRL_20_3,
        FTRL_20_4,
        FTRL_20_5,
        FTRL_20_6,
        FTRL_20_7,
        FTRL_20_7_A,
        FTRL_20_8,
        FTRL_20_9,
        FTRL_20_10,
        FTRL_20_11,
        FTRL_20_12,
        FTRL_20_13,
        FTRL_20_14,
        FTRL_20_14_BEREGNING,
        FTRL_20_15,
        FTRL_20_16,
        FTRL_20_17,
        FTRL_20_18,
        FTRL_20_19,
        FTRL_20_20,
        FTRL_20_21,
        FTRL_20_22,
        FTRL_20_23,

        FTRL_21_6,
        FTRL_21_12_KLAGEFRIST,

        FTRL_22_6,
        FTRL_22_8,
        FTRL_22_12_22_13,
        FTRL_22_15_TILBAKEKREVING,
        FTRL_22_15_TILBAKEKREVING_DOEDSBO,
        FTRL_22_16,
        FTRL_22_17,

        FVL_35_C_UGUNST,
        FVL_35_OMGJOERING,

        EOES_883_2004_1,
        EOES_883_2004_2_OMFATTET,
        EOES_883_2004_6_SAMMENLEGGING,
        EOES_883_2004_7,
        EOES_883_2004_10,
        EOES_883_2004_11,
        EOES_883_2004_12,
        EOES_883_2004_13_AKTIVITET_I_FLERE_LAND,
        EOES_883_2004_50,
        EOES_883_2004_51_SAMMENLEGGING,
        EOES_883_2004_52,
        EOES_883_2004_53,
        EOES_883_2004_54,
        EOES_883_2004_55,
        EOES_883_2004_56,
        EOES_883_2004_57,
        EOES_883_2004_58_MINSTEYTELSE,
        EOES_883_2004_59,
        EOES_883_2004_60,
        EOES_883_2004_70,
        EOES_883_2004_87,

        GJ_F_FORD_987_2009_10,
        GJ_F_FORD_987_2009_11,
        GJ_F_FORD_987_2009_12,

        BEGJAERING_OM_GJENOPPTAK,
        ANDRE_TRYGDEAVTALER,
        TRYGDEAVTALE_MED_ENGLAND,
        TRYGDEAVTALE_MED_USA,
        NORDISK_KONVENSJON,
    ),

    Ytelse.UFO_UFO to listOf(
        FTRL_12_2,
        FTRL_12_2_12_8,
        FTRL_12_2_6_57,
        FTRL_12_2_TRYGDEAVTALE,
        FTRL_12_3,
        FTRL_12_3_EOES,
        FTRL_12_3_TRYGDEAVTALE,
        FTRL_12_5,
        FTRL_12_6,
        FTRL_12_7_12_9_12_10,
        FTRL_12_8,
        FTRL_12_8_UNG_UFOER,
        FTRL_12_11_12_12_12_13_BEREGNING,
        FTRL_12_11_12_12_12_13_ART_52,
        FTRL_12_11_12_12_12_13_TRYGDEAVTALE,
        FTRL_12_13_SIVILSTAND,
        FTRL_12_13_UNG_UFOER,
        FTRL_12_14_EO,
        FTRL_12_15,
        FTRL_12_16,
        FTRL_12_17,
        FTRL_12_19,
        FTRL_12_20,

        FTRL_21_12,

        FTRL_22_12_FVL_35_C,
        FTRL_22_12_22_13,
        FTRL_22_15,
        FTRL_22_17,

        FVL_35_C_UGUNST,
        FVL_35_OMGJOERING,

        BEGJAERING_OM_GJENOPPTAK,
    ),

    Ytelse.TSO_TSO to listOf(
        ARBML_13,
        ARBML_17,
        ARBML_22,

        FTRL_11_A_3,
        FTRL_11_A_4,
        FTRL_11_A_4_3,

        FTRL_15_11,

        FTRL_17_10_17_15,

        FTRL_21_12,
        FTRL_22_13,
        FTRL_22_15,
        FTRL_22_17A,

        FS_TILL_ST_1_3_MOBILITET,
        FS_TILL_ST_3_REISE,
        FS_TILL_ST_6_FLYTTING,
        FS_TILL_ST_8_BOLIG,
        FS_TILL_ST_10_TILSYN,
        FS_TILL_ST_12_LAEREMIDLER,
        FS_TILL_ST_15_2,
        FS_TILL_ST_15_3,

        FL_2_3,
        FL_10,

        FVL_11,
        FVL_17,
        FVL_18_19,
        FVL_35,
        FVL_41,
        FVL_42,
    )
)