package no.nav.klage.kodeverk.hjemmel

import no.nav.klage.kodeverk.Tema
import no.nav.klage.kodeverk.Ytelse
import javax.persistence.AttributeConverter
import javax.persistence.Converter

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

    FTRL_22_3("1000.022.003", LovKilde.FOLKETRYGDLOVEN, "§ 22-3"),
    FTRL_22_12("1000.022.012", LovKilde.FOLKETRYGDLOVEN, "§ 22-12"),
    FTRL_22_13("1000.022.013", LovKilde.FOLKETRYGDLOVEN, "§ 22-13"),
    FTRL_22_15("1000.022.015", LovKilde.FOLKETRYGDLOVEN, "§ 22-15"),

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

    //Backwards compatibility in dev with search and innstillinger. Can be removed later?
    FTL("1000", LovKilde.FOLKETRYGDLOVEN, "Folketrygdloven"),
    FTL_9("1000.009", LovKilde.FOLKETRYGDLOVEN, "Folketrygdloven kapittel 9"),
    MANGLER("1002", LovKilde.UKJENT, "Hjemmel mangler"),

    //Backwards compatibility in dev since most of our test data is Sykepenger
    FTRL_8_2("1000.008.002", LovKilde.FOLKETRYGDLOVEN, "§ 8-2"),
    FTRL_8_3("1000.008.003", LovKilde.FOLKETRYGDLOVEN, "§ 8-3"),
    FTRL_8_4("1000.008.004", LovKilde.FOLKETRYGDLOVEN, "§ 8-4"),
    FTRL_8_7("1000.008.007", LovKilde.FOLKETRYGDLOVEN, "§ 8-7"),
    FTRL_8_8("1000.008.008", LovKilde.FOLKETRYGDLOVEN, "§ 8-8"),
    FTRL_8_13("1000.008.013", LovKilde.FOLKETRYGDLOVEN, "§ 8-13"),
    FTRL_8_15("1000.008.015", LovKilde.FOLKETRYGDLOVEN, "§ 8-15"),
    FTRL_8_20("1000.008.020", LovKilde.FOLKETRYGDLOVEN, "§ 8-20"),
    FTRL_8_28("1000.008.028", LovKilde.FOLKETRYGDLOVEN, "§ 8-28"),
    FTRL_8_29("1000.008.029", LovKilde.FOLKETRYGDLOVEN, "§ 8-29"),
    FTRL_8_12("1000.008.012", LovKilde.FOLKETRYGDLOVEN, "§ 8-12"),
    FTRL_8_30("1000.008.030", LovKilde.FOLKETRYGDLOVEN, "§ 8-30"),
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
    FTRL_8_47("1000.008.047", LovKilde.FOLKETRYGDLOVEN, "§ 8-47"),
    FTRL_8_49("1000.008.049", LovKilde.FOLKETRYGDLOVEN, "§ 8-49"),
    ;

    fun toSearchableString(): String {
        return "${lovKilde.navn}-${spesifikasjon}"
    }

    companion object {
        fun of(id: String): Hjemmel {
            return values().firstOrNull { it.id == id }
                ?: throw IllegalArgumentException("No Hjemmel with $id exists")
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