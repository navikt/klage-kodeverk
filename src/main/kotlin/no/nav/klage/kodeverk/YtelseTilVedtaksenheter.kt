package no.nav.klage.kodeverk

import no.nav.klage.kodeverk.Enhet.*

val vedtaksEnheterHJE_HJE = setOf(
    E4701,
    E4702,
    E4703,
    E4704,
    E4705,
    E4706,
    E4707,
    E4708,
    E4709,
    E4710,
    E4711,
    E4712,
    E4714,
    E4715,
    E4716,
    E4717,
    E4718,
    E4719,
    E4720,
    E4408,
    E4418,
    E4483,
    E2103
)

val ytelseTilVedtaksenheter = mapOf(
    Ytelse.HJE_HJE to vedtaksEnheterHJE_HJE,
    Ytelse.BIL_BIL to vedtaksEnheterHJE_HJE,
    Ytelse.HEL_HEL to vedtaksEnheterHJE_HJE,
    Ytelse.OMS_OMP to setOf(
        E4432,
        E4409,
        E4483,
        E2103
    ),
    Ytelse.OMS_OLP to setOf(
        E4432,
        E4409,
        E4483,
        E2103
    ),
    Ytelse.OMS_PLS to setOf(
        E4432,
        E4409,
        E4483,
        E2103
    ),
    Ytelse.OMS_PSB to setOf(
        E4432,
        E4409,
        E4483,
        E2103
    ),
    Ytelse.DAG_DAG to setOf(
        E2103,
        E4151,
        E4401,
        E4403,
        E4405,
        E4408,
        E4416,
        E4418,
        E4483,
        E4525,
    ),
    Ytelse.AAP_AAP to setOf(
        E4404,
        E4405,
        E4411,
        E4402,
        E4416,
        E4407,
        E4483,
        E0101,
        E0104,
        E0105,
        E0106,
        E0111,
        E0119,
        E0124,
        E0127,
        E0128,
        E0135,
        E0137,
        E1037,
        E0211,
        E0213,
        E0214,
        E0215,
        E0216,
        E0219,
        E0220,
        E0221,
        E0228,
        E0229,
        E0230,
        E0231,
        E0233,
        E0234,
        E0235,
        E0236,
        E0237,
        E0238,
        E0239,
        E0283,
        E0312,
        E0313,
        E0314,
        E0315,
        E0316,
        E0318,
        E0319,
        E0321,
        E0326,
        E0327,
        E0328,
        E0330,
        E0331,
        E0334,
        E0335,
        E0383,
        E0393,
        E0402,
        E0403,
        E0412,
        E0415,
        E0417,
        E0418,
        E0420,
        E0423,
        E0425,
        E0426,
        E0427,
        E0428,
        E0429,
        E0430,
        E0434,
        E0437,
        E0439,
        E0476,
        E0450,
        E0483,
        E0491,
        E0501,
        E0502,
        E0511,
        E0513,
        E0515,
        E0516,
        E0517,
        E0519,
        E0521,
        E0528,
        E0529,
        E0532,
        E0534,
        E0536,
        E0538,
        E0542,
        E0602,
        E0604,
        E0605,
        E0612,
        E0617,
        E0621,
        E0622,
        E0623,
        E0624,
        E0626,
        E0632,
        E0683,
        E0701,
        E0704,
        E0710,
        E5301,
        E5303,
        E5302,
        E0805,
        E0806,
        E0807,
        E0811,
        E0814,
        E0815,
        E0817,
        E0821,
        E0826,
        E0833,
        E0883,
        E0904,
        E0906,
        E0901,
        E0911,
        E0914,
        E0919,
        E0928,
        E0929,
        E0937,
        E0926,
        E1001,
        E1002,
        E1014,
        E1037,
        E1004,
        E1032,
        E1034,
        E1046,
        E1083,
        E1101,
        E1102,
        E1106,
        E1111,
        E1112,
        E1119,
        E1120,
        E1122,
        E1124,
        E1127,
        E1130,
        E1133,
        E1134,
        E1135,
        E1146,
        E1149,
        E1160,
        E1161,
        E1162,
        E1164,
        E1165,
        E1169,
        E1183,
        E1202,
        E1203,
        E1204,
        E1205,
        E1206,
        E1208,
        E1209,
        E1210,
        E1211,
        E1216,
        E1219,
        E1221,
        E1222,
        E1223,
        E1224,
        E1228,
        E1232,
        E1233,
        E1235,
        E1238,
        E1242,
        E1243,
        E1244,
        E1246,
        E1247,
        E1251,
        E1253,
        E1263,
        E1266,
        E1283,
        E1401,
        E1412,
        E1413,
        E1416,
        E1417,
        E1420,
        E1421,
        E1422,
        E1424,
        E1426,
        E1428,
        E1429,
        E1432,
        E1438,
        E1443,
        E1445,
        E1449,
        E1502,
        E1504,
        E1505,
        E1515,
        E1517,
        E1520,
        E1525,
        E1528,
        E1529,
        E1531,
        E1532,
        E1535,
        E1539,
        E1547,
        E1548,
        E1554,
        E1557,
        E1560,
        E1563,
        E1566,
        E1567,
        E1572,
        E1573,
        E1576,
        E1583,
        E1607,
        E1612,
        E1620,
        E1621,
        E1624,
        E1627,
        E1630,
        E1634,
        E1638,
        E1640,
        E1644,
        E1648,
        E1653,
        E1657,
        E1663,
        E1683,
        E1702,
        E1703,
        E1718,
        E1719,
        E1721,
        E1724,
        E1725,
        E1729,
        E1736,
        E1738,
        E1739,
        E1740,
        E1742,
        E1743,
        E1744,
        E1748,
        E1749,
        E1750,
        E1751,
        E1755,
        E1756,
        E1804,
        E1805,
        E1812,
        E1813,
        E1815,
        E1816,
        E1818,
        E1820,
        E1822,
        E1824,
        E1825,
        E1826,
        E1827,
        E1828,
        E1832,
        E1833,
        E1834,
        E1835,
        E1836,
        E1837,
        E1838,
        E1839,
        E1840,
        E1841,
        E1845,
        E1848,
        E1849,
        E1850,
        E1851,
        E1852,
        E1854,
        E1856,
        E1857,
        E1859,
        E1860,
        E1865,
        E1866,
        E1867,
        E1868,
        E1870,
        E1871,
        E1874,
        E1883,
        E1902,
        E1903,
        E1911,
        E1913,
        E1917,
        E1919,
        E1920,
        E1922,
        E1923,
        E1924,
        E1925,
        E1926,
        E1927,
        E1928,
        E1929,
        E1931,
        E1933,
        E1936,
        E1938,
        E1939,
        E1940,
        E1941,
        E1942,
        E1943,
        E1983,
        E2002,
        E2003,
        E2004,
        E2011,
        E2012,
        E2014,
        E2015,
        E2017,
        E2018,
        E2019,
        E2020,
        E2021,
        E2022,
        E2023,
        E2024,
        E2025,
        E2027,
        E2028,
        E2030,
        E2103,
        E5701,
        E5702,
        E5703,
    ),
    Ytelse.SYK_SYK to setOf(
        E4401,
        E4402,
        E4403,
        E4405,
        E4407,
        E4410,
        E4418,
        E4473,
        E4474,
        E4411,
        E4415,
        E4416,
        E4483,
        E0101,
        E0104,
        E0105,
        E0106,
        E0111,
        E0119,
        E0124,
        E0127,
        E0128,
        E0135,
        E1037,
        E0211,
        E0213,
        E0214,
        E0215,
        E0219,
        E0220,
        E0221,
        E0228,
        E0229,
        E0230,
        E0231,
        E0233,
        E0234,
        E0235,
        E0236,
        E0237,
        E0238,
        E0239,
        E0283,
        E0312,
        E0313,
        E0314,
        E0315,
        E0316,
        E0318,
        E0319,
        E0321,
        E0326,
        E0327,
        E0328,
        E0330,
        E0331,
        E0334,
        E0383,
        E0402,
        E0403,
        E0412,
        E0415,
        E0417,
        E0418,
        E0420,
        E0423,
        E0425,
        E0426,
        E0427,
        E0428,
        E0429,
        E0430,
        E0434,
        E0437,
        E0439,
        E0450,
        E0483,
        E0501,
        E0502,
        E0511,
        E0513,
        E0515,
        E0516,
        E0517,
        E0519,
        E0521,
        E0528,
        E0529,
        E0532,
        E0534,
        E0536,
        E0538,
        E0542,
        E0602,
        E0604,
        E0605,
        E0612,
        E0617,
        E0621,
        E0622,
        E0623,
        E0624,
        E0626,
        E0632,
        E0683,
        E0701,
        E0704,
        E0710,
        E5301,
        E5303,
        E5302,
        E0805,
        E0806,
        E0811,
        E0814,
        E0815,
        E0817,
        E0821,
        E0826,
        E0833,
        E0883,
        E0904,
        E0906,
        E0901,
        E0911,
        E0914,
        E0919,
        E0928,
        E0929,
        E0937,
        E0926,
        E1001,
        E1002,
        E1014,
        E1037,
        E1004,
        E1032,
        E1034,
        E1046,
        E1083,
        E1101,
        E1102,
        E1106,
        E1111,
        E1112,
        E1119,
        E1120,
        E1122,
        E1124,
        E1127,
        E1130,
        E1133,
        E1134,
        E1135,
        E1146,
        E1149,
        E1160,
        E1161,
        E1162,
        E1164,
        E1165,
        E1169,
        E1183,
        E1202,
        E1203,
        E1204,
        E1205,
        E1206,
        E1208,
        E1209,
        E1210,
        E1211,
        E1216,
        E1219,
        E1221,
        E1222,
        E1223,
        E1224,
        E1228,
        E1232,
        E1233,
        E1235,
        E1238,
        E1242,
        E1243,
        E1244,
        E1246,
        E1247,
        E1251,
        E1253,
        E1263,
        E1266,
        E1283,
        E1401,
        E1412,
        E1413,
        E1416,
        E1417,
        E1420,
        E1421,
        E1422,
        E1424,
        E1426,
        E1428,
        E1429,
        E1432,
        E1438,
        E1443,
        E1445,
        E1449,
        E1502,
        E1504,
        E1505,
        E1515,
        E1517,
        E1520,
        E1525,
        E1528,
        E1529,
        E1531,
        E1532,
        E1535,
        E1539,
        E1547,
        E1548,
        E1554,
        E1557,
        E1560,
        E1563,
        E1566,
        E1567,
        E1572,
        E1573,
        E1576,
        E1583,
        E1607,
        E1612,
        E1620,
        E1621,
        E1624,
        E1627,
        E1630,
        E1634,
        E1638,
        E1640,
        E1644,
        E1648,
        E1653,
        E1657,
        E1663,
        E1683,
        E1702,
        E1703,
        E1718,
        E1719,
        E1721,
        E1724,
        E1725,
        E1729,
        E1736,
        E1738,
        E1739,
        E1740,
        E1742,
        E1743,
        E1744,
        E1748,
        E1749,
        E1750,
        E1751,
        E1755,
        E1756,
        E1804,
        E1805,
        E1812,
        E1813,
        E1815,
        E1816,
        E1818,
        E1820,
        E1822,
        E1824,
        E1825,
        E1826,
        E1827,
        E1828,
        E1832,
        E1833,
        E1834,
        E1835,
        E1836,
        E1837,
        E1838,
        E1839,
        E1840,
        E1841,
        E1845,
        E1848,
        E1849,
        E1850,
        E1851,
        E1852,
        E1854,
        E1856,
        E1857,
        E1859,
        E1860,
        E1865,
        E1866,
        E1867,
        E1868,
        E1870,
        E1871,
        E1874,
        E1883,
        E1902,
        E1903,
        E1911,
        E1913,
        E1917,
        E1919,
        E1920,
        E1922,
        E1923,
        E1924,
        E1925,
        E1926,
        E1927,
        E1928,
        E1929,
        E1931,
        E1933,
        E1936,
        E1938,
        E1939,
        E1940,
        E1941,
        E1942,
        E1943,
        E1983,
        E2002,
        E2003,
        E2004,
        E2011,
        E2012,
        E2014,
        E2015,
        E2017,
        E2018,
        E2019,
        E2020,
        E2021,
        E2022,
        E2023,
        E2024,
        E2025,
        E2027,
        E2028,
        E2030,
        E2103,
        E5702,
    ),
    Ytelse.YRK_YRK to setOf(
        E4803,
        E4833,
        E4849,
        E2103
    ),
    Ytelse.YRK_YSY to setOf(
        E4803,
        E2103
    ),
    Ytelse.YRK_MEN to setOf(
        E4803,
        E4833,
        E4849,
        E2103
    ),
    Ytelse.UFO_UFO to setOf(
        E4405,
        E4411,
        E4403,
        E4415,
        E4402,
        E4410,
        E4416,
        E4407,
        E4476,
        E4475,
        E4483,
        E2103
    ),
    Ytelse.FOR_FOR to setOf(
        E4833,
        E4842,
        E4806,
        E4817,
        E4812,
        E4849,
        E2103
    ),
    Ytelse.GRU_GRU to setOf(
        E4401,
        E4410,
        E4483,
        E2103
    ),
    Ytelse.GRU_HJE to setOf(
        E4401,
        E4410,
        E4483,
        E2103
    ),
    Ytelse.GRA_GRA to setOf(
        E4812,
        E2103
    ),
    Ytelse.PEN_ALD to setOf(
        E4808,
        E4803,
        E0001,
        E4815,
        E4862,
        E4817,
        E2103
    ),
    Ytelse.PEN_TIF to setOf(
        E4808,
        E4817,
        E4815,
        E4862,
        E0001,
        E2103
    ),
    Ytelse.PEN_GJE to setOf(
        E4808,
        E4817,
        E4815,
        E4862,
        E0001,
        E2103
    ),
    Ytelse.PEN_BAR to setOf(
        E4808,
        E4817,
        E4815,
        E4862,
        E0001,
        E2103
    ),
    Ytelse.OPP_OPP to setOf(
        E0101,
        E0104,
        E0105,
        E0106,
        E0111,
        E0119,
        E0124,
        E0127,
        E0128,
        E0135,
        E0137,
        E1037,
        E0211,
        E0213,
        E0214,
        E0215,
        E0219,
        E0220,
        E0221,
        E0228,
        E0229,
        E0230,
        E0231,
        E0233,
        E0234,
        E0235,
        E0236,
        E0237,
        E0238,
        E0239,
        E0283,
        E0312,
        E0313,
        E0314,
        E0315,
        E0316,
        E0318,
        E0319,
        E0321,
        E0326,
        E0327,
        E0328,
        E0330,
        E0331,
        E0334,
        E0383,
        E0402,
        E0403,
        E0412,
        E0415,
        E0417,
        E0418,
        E0420,
        E0423,
        E0425,
        E0426,
        E0427,
        E0428,
        E0429,
        E0430,
        E0434,
        E0437,
        E0439,
        E0450,
        E0476,
        E0483,
        E0501,
        E0502,
        E0511,
        E0513,
        E0515,
        E0516,
        E0517,
        E0519,
        E0521,
        E0528,
        E0529,
        E0532,
        E0534,
        E0536,
        E0538,
        E0542,
        E0600,
        E0602,
        E0604,
        E0605,
        E0612,
        E0617,
        E0621,
        E0622,
        E0623,
        E0624,
        E0626,
        E0632,
        E0683,
        E0701,
        E0704,
        E0710,
        E5301,
        E5303,
        E5302,
        E0805,
        E0806,
        E0811,
        E0814,
        E0815,
        E0817,
        E0821,
        E0826,
        E0833,
        E0883,
        E0904,
        E0906,
        E0901,
        E0911,
        E0914,
        E0919,
        E0928,
        E0929,
        E0937,
        E0926,
        E1001,
        E1002,
        E1014,
        E1037,
        E1004,
        E1032,
        E1034,
        E1046,
        E1083,
        E1101,
        E1102,
        E1106,
        E1111,
        E1112,
        E1119,
        E1120,
        E1122,
        E1124,
        E1127,
        E1130,
        E1133,
        E1134,
        E1135,
        E1146,
        E1149,
        E1160,
        E1161,
        E1162,
        E1164,
        E1165,
        E1169,
        E1183,
        E1202,
        E1203,
        E1204,
        E1205,
        E1206,
        E1208,
        E1209,
        E1210,
        E1211,
        E1216,
        E1219,
        E1221,
        E1222,
        E1223,
        E1224,
        E1228,
        E1232,
        E1233,
        E1235,
        E1238,
        E1242,
        E1243,
        E1244,
        E1246,
        E1247,
        E1251,
        E1253,
        E1263,
        E1266,
        E1283,
        E1401,
        E1412,
        E1413,
        E1416,
        E1417,
        E1420,
        E1421,
        E1422,
        E1424,
        E1426,
        E1428,
        E1429,
        E1432,
        E1438,
        E1443,
        E1445,
        E1449,
        E1502,
        E1504,
        E1505,
        E1515,
        E1517,
        E1520,
        E1525,
        E1528,
        E1529,
        E1531,
        E1532,
        E1535,
        E1539,
        E1547,
        E1548,
        E1554,
        E1557,
        E1560,
        E1563,
        E1566,
        E1567,
        E1572,
        E1573,
        E1576,
        E1583,
        E1607,
        E1612,
        E1620,
        E1621,
        E1624,
        E1627,
        E1630,
        E1634,
        E1638,
        E1640,
        E1644,
        E1648,
        E1653,
        E1657,
        E1663,
        E1683,
        E1702,
        E1703,
        E1718,
        E1719,
        E1721,
        E1724,
        E1725,
        E1729,
        E1736,
        E1738,
        E1739,
        E1740,
        E1742,
        E1743,
        E1744,
        E1748,
        E1749,
        E1750,
        E1751,
        E1755,
        E1756,
        E1783,
        E1804,
        E1805,
        E1812,
        E1813,
        E1815,
        E1816,
        E1818,
        E1820,
        E1822,
        E1824,
        E1825,
        E1826,
        E1827,
        E1828,
        E1832,
        E1833,
        E1834,
        E1835,
        E1836,
        E1837,
        E1838,
        E1839,
        E1840,
        E1841,
        E1845,
        E1848,
        E1849,
        E1850,
        E1851,
        E1852,
        E1854,
        E1856,
        E1857,
        E1859,
        E1860,
        E1865,
        E1866,
        E1867,
        E1868,
        E1870,
        E1871,
        E1874,
        E1883,
        E1902,
        E1903,
        E1911,
        E1913,
        E1917,
        E1919,
        E1920,
        E1922,
        E1923,
        E1924,
        E1925,
        E1926,
        E1927,
        E1928,
        E1929,
        E1931,
        E1933,
        E1936,
        E1938,
        E1939,
        E1940,
        E1941,
        E1942,
        E1943,
        E1983,
        E2002,
        E2003,
        E2004,
        E2011,
        E2012,
        E2014,
        E2015,
        E2017,
        E2018,
        E2019,
        E2020,
        E2021,
        E2022,
        E2023,
        E2024,
        E2025,
        E2027,
        E2028,
        E2030,
        E2103
    ),
    Ytelse.PEN_KRI to setOf(
        E4803,
        E2103
    ),
    Ytelse.BAR_BAR to setOf(
        E4812,
        E4820,
        E4806,
        E4833,
        E4817,
        E4842,
        E2103
    ),
    Ytelse.KON_KON to setOf(
        E4812,
        E4820,
        E4806,
        E4833,
        E4817,
        E4842,
        E2103
    ),
    Ytelse.BID_BAB to setOf(
        E4806,
        E4833,
        E4812,
        E4817,
        E4820,
        E4849,
        E2103
    ),
    Ytelse.BID_BIF to setOf(
        E4806,
        E4833,
        E4812,
        E4817,
        E4820,
        E4849,
        E2103
    ),
    Ytelse.BID_BII to setOf(
        E4806,
        E4833,
        E4812,
        E4817,
        E4820,
        E4849,
        E2103
    ),
    Ytelse.BID_EKB to setOf(
        E4849,
        E2103
    ),
    Ytelse.SUP_PEN to setOf(
        E4815,
        E2103
    ),
    Ytelse.SUP_UFF to setOf(
        E4815,
        E2103
    ),
    Ytelse.FOR_ENG to setOf(
        E4833,
        E4842,
        E4806,
        E4817,
        E4812,
        E4849,
        E2103
    ),
    Ytelse.FOR_SVA to setOf(
        E4833,
        E4842,
        E4806,
        E4817,
        E4812,
        E4849,
        E2103
    ),
    Ytelse.TIL_TIL to setOf(
        E0387,
        E0587,
        E0687,
        E1087,
        E1187,
        E1287,
        E1987,
        E5771,
        E0287,
        E0101,
        E0104,
        E0105,
        E0106,
        E0111,
        E0119,
        E0124,
        E0127,
        E0128,
        E0135,
        E0137,
        E1037,
        E0211,
        E0213,
        E0214,
        E0215,
        E0219,
        E0220,
        E0221,
        E0228,
        E0229,
        E0230,
        E0231,
        E0233,
        E0234,
        E0235,
        E0236,
        E0237,
        E0238,
        E0239,
        E0283,
        E0312,
        E0313,
        E0314,
        E0315,
        E0316,
        E0318,
        E0319,
        E0321,
        E0326,
        E0327,
        E0328,
        E0330,
        E0331,
        E0334,
        E0383,
        E0386,
        E0402,
        E0403,
        E0412,
        E0415,
        E0417,
        E0418,
        E0420,
        E0423,
        E0425,
        E0426,
        E0427,
        E0428,
        E0429,
        E0430,
        E0434,
        E0437,
        E0439,
        E0450,
        E0483,
        E0491,
        E0501,
        E0502,
        E0511,
        E0513,
        E0515,
        E0516,
        E0517,
        E0519,
        E0521,
        E0528,
        E0529,
        E0532,
        E0534,
        E0536,
        E0538,
        E0542,
        E0602,
        E0604,
        E0605,
        E0612,
        E0617,
        E0621,
        E0622,
        E0623,
        E0624,
        E0626,
        E0632,
        E0683,
        E0701,
        E0704,
        E0710,
        E5301,
        E5303,
        E5302,
        E0800,
        E0805,
        E0806,
        E0811,
        E0814,
        E0815,
        E0817,
        E0821,
        E0826,
        E0833,
        E0883,
        E0904,
        E0906,
        E0901,
        E0911,
        E0914,
        E0919,
        E0928,
        E0929,
        E0937,
        E0926,
        E1001,
        E1002,
        E1014,
        E1037,
        E1004,
        E1032,
        E1034,
        E1046,
        E1083,
        E1101,
        E1102,
        E1106,
        E1111,
        E1112,
        E1119,
        E1120,
        E1122,
        E1124,
        E1127,
        E1130,
        E1133,
        E1134,
        E1135,
        E1146,
        E1149,
        E1160,
        E1161,
        E1162,
        E1164,
        E1165,
        E1169,
        E1183,
        E1202,
        E1203,
        E1204,
        E1205,
        E1206,
        E1208,
        E1209,
        E1210,
        E1211,
        E1216,
        E1219,
        E1221,
        E1222,
        E1223,
        E1224,
        E1228,
        E1232,
        E1233,
        E1235,
        E1238,
        E1242,
        E1243,
        E1244,
        E1246,
        E1247,
        E1251,
        E1253,
        E1263,
        E1266,
        E1283,
        E1401,
        E1412,
        E1413,
        E1416,
        E1417,
        E1420,
        E1421,
        E1422,
        E1424,
        E1426,
        E1428,
        E1429,
        E1432,
        E1438,
        E1443,
        E1445,
        E1449,
        E1502,
        E1504,
        E1505,
        E1515,
        E1517,
        E1520,
        E1525,
        E1528,
        E1529,
        E1531,
        E1532,
        E1535,
        E1539,
        E1547,
        E1548,
        E1554,
        E1557,
        E1560,
        E1563,
        E1566,
        E1567,
        E1572,
        E1573,
        E1576,
        E1583,
        E1607,
        E1612,
        E1620,
        E1621,
        E1624,
        E1627,
        E1630,
        E1634,
        E1638,
        E1640,
        E1644,
        E1648,
        E1653,
        E1657,
        E1663,
        E1683,
        E1702,
        E1703,
        E1718,
        E1719,
        E1721,
        E1724,
        E1725,
        E1729,
        E1736,
        E1738,
        E1739,
        E1740,
        E1742,
        E1743,
        E1744,
        E1748,
        E1749,
        E1750,
        E1751,
        E1755,
        E1756,
        E1783,
        E1800,
        E1804,
        E1805,
        E1812,
        E1813,
        E1815,
        E1816,
        E1818,
        E1820,
        E1822,
        E1824,
        E1825,
        E1826,
        E1827,
        E1828,
        E1832,
        E1833,
        E1834,
        E1835,
        E1836,
        E1837,
        E1838,
        E1839,
        E1840,
        E1841,
        E1845,
        E1848,
        E1849,
        E1850,
        E1851,
        E1852,
        E1854,
        E1856,
        E1857,
        E1859,
        E1860,
        E1865,
        E1866,
        E1867,
        E1868,
        E1870,
        E1871,
        E1874,
        E1883,
        E1902,
        E1903,
        E1911,
        E1913,
        E1917,
        E1919,
        E1920,
        E1922,
        E1923,
        E1924,
        E1925,
        E1926,
        E1927,
        E1928,
        E1929,
        E1931,
        E1933,
        E1936,
        E1938,
        E1939,
        E1940,
        E1941,
        E1942,
        E1943,
        E1983,
        E2002,
        E2003,
        E2004,
        E2011,
        E2012,
        E2014,
        E2015,
        E2017,
        E2018,
        E2019,
        E2020,
        E2021,
        E2022,
        E2023,
        E2024,
        E2025,
        E2027,
        E2028,
        E2030,
        E2103,
        E5701,
        E5702,
    ),
    Ytelse.TIL_TIP to setOf(
        E0387,
        E0587,
        E0687,
        E1087,
        E1187,
        E1287,
        E1987,
        E5771,
        E0287,
        E0101,
        E0104,
        E0105,
        E0106,
        E0111,
        E0119,
        E0124,
        E0127,
        E0128,
        E0135,
        E1037,
        E0211,
        E0213,
        E0214,
        E0215,
        E0219,
        E0220,
        E0221,
        E0228,
        E0229,
        E0230,
        E0231,
        E0233,
        E0234,
        E0235,
        E0236,
        E0237,
        E0238,
        E0239,
        E0283,
        E0312,
        E0313,
        E0314,
        E0315,
        E0316,
        E0318,
        E0319,
        E0321,
        E0326,
        E0327,
        E0328,
        E0330,
        E0331,
        E0334,
        E0383,
        E0402,
        E0403,
        E0412,
        E0415,
        E0417,
        E0418,
        E0420,
        E0423,
        E0425,
        E0426,
        E0427,
        E0428,
        E0429,
        E0430,
        E0434,
        E0437,
        E0439,
        E0450,
        E0483,
        E0501,
        E0502,
        E0511,
        E0513,
        E0515,
        E0516,
        E0517,
        E0519,
        E0521,
        E0528,
        E0529,
        E0532,
        E0534,
        E0536,
        E0538,
        E0542,
        E0600,
        E0602,
        E0604,
        E0605,
        E0612,
        E0617,
        E0621,
        E0622,
        E0623,
        E0624,
        E0626,
        E0632,
        E0683,
        E0701,
        E0704,
        E0710,
        E5301,
        E5303,
        E5302,
        E0800,
        E0805,
        E0806,
        E0811,
        E0814,
        E0815,
        E0817,
        E0821,
        E0826,
        E0833,
        E0883,
        E0904,
        E0906,
        E0901,
        E0911,
        E0914,
        E0919,
        E0928,
        E0929,
        E0937,
        E0926,
        E1001,
        E1002,
        E1014,
        E1037,
        E1004,
        E1032,
        E1034,
        E1046,
        E1083,
        E1101,
        E1102,
        E1106,
        E1111,
        E1112,
        E1119,
        E1120,
        E1122,
        E1124,
        E1127,
        E1130,
        E1133,
        E1134,
        E1135,
        E1146,
        E1149,
        E1160,
        E1161,
        E1162,
        E1164,
        E1165,
        E1169,
        E1183,
        E1202,
        E1203,
        E1204,
        E1205,
        E1206,
        E1208,
        E1209,
        E1210,
        E1211,
        E1216,
        E1219,
        E1221,
        E1222,
        E1223,
        E1224,
        E1228,
        E1232,
        E1233,
        E1235,
        E1238,
        E1242,
        E1243,
        E1244,
        E1246,
        E1247,
        E1251,
        E1253,
        E1263,
        E1266,
        E1283,
        E1401,
        E1412,
        E1413,
        E1416,
        E1417,
        E1420,
        E1421,
        E1422,
        E1424,
        E1426,
        E1428,
        E1429,
        E1432,
        E1438,
        E1443,
        E1445,
        E1449,
        E1500,
        E1502,
        E1504,
        E1505,
        E1515,
        E1517,
        E1520,
        E1525,
        E1528,
        E1529,
        E1531,
        E1532,
        E1535,
        E1539,
        E1547,
        E1548,
        E1554,
        E1557,
        E1560,
        E1563,
        E1566,
        E1567,
        E1572,
        E1573,
        E1576,
        E1583,
        E1607,
        E1612,
        E1620,
        E1621,
        E1624,
        E1627,
        E1630,
        E1634,
        E1638,
        E1640,
        E1644,
        E1648,
        E1653,
        E1657,
        E1663,
        E1683,
        E1702,
        E1703,
        E1718,
        E1719,
        E1721,
        E1724,
        E1725,
        E1729,
        E1736,
        E1738,
        E1739,
        E1740,
        E1742,
        E1743,
        E1744,
        E1748,
        E1749,
        E1750,
        E1751,
        E1755,
        E1756,
        E1800,
        E1804,
        E1805,
        E1812,
        E1813,
        E1815,
        E1816,
        E1818,
        E1820,
        E1822,
        E1824,
        E1825,
        E1826,
        E1827,
        E1828,
        E1832,
        E1833,
        E1834,
        E1835,
        E1836,
        E1837,
        E1838,
        E1839,
        E1840,
        E1841,
        E1845,
        E1848,
        E1849,
        E1850,
        E1851,
        E1852,
        E1854,
        E1856,
        E1857,
        E1859,
        E1860,
        E1865,
        E1866,
        E1867,
        E1868,
        E1870,
        E1871,
        E1874,
        E1883,
        E1902,
        E1903,
        E1911,
        E1913,
        E1917,
        E1919,
        E1920,
        E1922,
        E1923,
        E1924,
        E1925,
        E1926,
        E1927,
        E1928,
        E1929,
        E1931,
        E1933,
        E1936,
        E1938,
        E1939,
        E1940,
        E1941,
        E1942,
        E1943,
        E1983,
        E2002,
        E2003,
        E2004,
        E2011,
        E2012,
        E2014,
        E2015,
        E2017,
        E2018,
        E2019,
        E2020,
        E2021,
        E2022,
        E2023,
        E2024,
        E2025,
        E2027,
        E2028,
        E2030,
        E2103
    ),
    Ytelse.GEN_GEN to setOf(
        E4425,
        E4401,
        E4426,
        E4483,
        E2103
    ),
    Ytelse.MED_MED to setOf(
        E4525,
        E4530,
        E2103
    ),
    Ytelse.BID_OPI to setOf(
        E4833,
        E2103
    ),
    Ytelse.OMS_OLP to setOf(
        E4432,
        E4409,
        E4483,
        E2103
    ),
    Ytelse.PEN_AFP to setOf(
        E4808,
        E4803,
        E0001,
        E4815,
        E4862,
        E4817,
        E2103
    ),
    Ytelse.TSO_TSO to setOf(
        E0287,
        E0387,
        E0587,
        E0687,
        E0800,
        E1087,
        E1187,
        E1287,
        E1500,
        E1800,
        E1987,
        E4402,
        E4405,
        E4407,
        E4411,
        E4416,
        E4483,
        E5771,
        E2103
    ),
    Ytelse.FAR_FAR to setOf(
        E4860,
        E4863,
        E2103
    ),
    Ytelse.BID_BBF to setOf(
        E4849,
        E2103
    ),
    Ytelse.ENF_ENF to setOf(
        E4410,
        E4415,
        E4408,
        E4483,
        E2103
    ),
    Ytelse.DAG_FDP to setOf(
        E4153,
        E2103
    ),
    Ytelse.FRI_FRI to setOf(
        E4863,
        E2103
    ),
    Ytelse.DAG_LKP to setOf(
        E4486,
        E4483,
        E2103
    ),
    Ytelse.UFO_TVF to setOf(
        E4407,
        E4483,
        E4808,
        E4803,
        E4815,
        E4817,
        E2103
    ),
    Ytelse.AAR_AAR to setOf(
        E4534,
        E2103
    ),
    Ytelse.TSR_TSR to setOf(
        E0587,
        E2103
    ),
    Ytelse.FOS_FOS to setOf(
        E4411,
        E4488,
        E2103,
    )
)