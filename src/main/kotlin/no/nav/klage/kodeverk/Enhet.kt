package no.nav.klage.kodeverk

enum class Enhet(override val id: String, override val navn: String, override val beskrivelse: String) : Kode {
    E4701("1", "4701", "4701 NAV Hjelpemiddelsentral Østfold"),
    E4702("2", "4702", "4702 NAV Hjelpemiddelsentral Akershus"),
    E4703("3", "4703", "4703 NAV Hjelpemiddelsentral Oslo"),
    E4704("4", "4704", "4704 NAV Hjelpemiddelsentral Hedmark"),
    E4705("5", "4705", "4705 NAV Hjelpemiddelsentral Oppland"),
    E4706("6", "4706", "4706 NAV Hjelpemiddelsentral Buskerud"),
    E4707("7", "4707", "4707 NAV Hjelpemiddelsentral Vestfold"),
    E4708("8", "4708", "4708 NAV Hjelpemiddelsentral Telemark"),
    E4709("9", "4709", "4709 NAV Hjelpemiddelsentral Aust-Agder"),
    E4710("10", "4710", "4710 NAV Hjelpemiddelsentral Vest-Agder"),
    E4711("11", "4711", "4711 NAV Hjelpemiddelsentral Rogaland"),
    E4712("12", "4712", "4712 NAV Hjelpemiddelsentral Hordaland"),
    E4714("13", "4714", "4714 NAV Hjelpemiddelsentral Sogn og Fjordane"),
    E4715("14", "4715", "4715 NAV Hjelpemiddelsentral Møre og Romsdal"),
    E4716("15", "4716", "4716 NAV Hjelpemiddelsentral Sør-Trøndelag"),
    E4717("16", "4717", "4717 NAV Hjelpemiddelsentral Nord-Trøndelag"),
    E4718("17", "4718", "4718 NAV Hjelpemiddelsentral Nordland"),
    E4719("18", "4719", "4719 NAV Hjelpemiddelsentral Troms"),
    E4720("19", "4720", "4720 NAV Hjelpemiddelsentral Finnmark"),
    E4408("20", "4408", "4408 NAV Arbeid og ytelser Skien"),
    E4418("21", "4418", "4418 NAV Arbeid og ytelser Fauske"),
    E4432("22", "4432", "4432 NAV Arbeid og ytelser Follo"),
    E4409("23", "4409", "4409 NAV Arbeid og ytelser Arendal"),
    E4450("24", "4450", "4450"),
    E4470("25", "4470", "4470"),
    E4465("26", "4465", "4465"),
    E4455("27", "4455", "4455"),
    E4404("28", "4404", "4404"),
    E4405("29", "4405", "4405"),
    E4411("30", "4411", "4411"),
    E4402("31", "4402", "4402"),
    E4416("32", "4416", "4416"),
    E4407("33", "4407", "4407"),
    E0101("34", "0101", "0101"),
    E0104("35", "0104", "0104"),
    E0105("36", "0105", "0105"),
    E0106("37", "0106", "0106"),
    E0111("38", "0111", "0111"),
    E0119("39", "0119", "0119"),
    E0124("40", "0124", "0124"),
    E0127("41", "0127", "0127"),
    E0128("42", "0128", "0128"),
    E0135("43", "0135", "0135"),
    E1037("44", "1037", "1037"),
    E0211("45", "0211", "0211"),
    E0213("46", "0213", "0213"),
    E0214("47", "0214", "0214"),
    E0215("48", "0215", "0215"),
    E0126("49", "0126", "0126"),
    E0219("50", "0219", "0219"),
    E0220("51", "0220", "0220"),
    E0221("52", "0221", "0221"),
    E0228("53", "0228", "0228"),
    E0229("54", "0229", "0229"),
    E0230("55", "0230", "0230"),
    E0231("56", "0231", "0231"),
    E0233("57", "0233", "0233"),
    E0234("58", "0234", "0234"),
    E0235("59", "0235", "0235"),
    E0236("60", "0236", "0236"),
    E0237("61", "0237", "0237"),
    E0238("62", "0238", "0238"),
    E0239("63", "0239", "0239"),
    E0301("64", "0301", "0301"),
    E0308("65", "0308", "0308"),
    E0311("66", "0311", "0311"),
    E0312("67", "0312", "0312"),
    E0313("68", "0313", "0313"),
    E0314("69", "0314", "0314"),
    E0315("70", "0315", "0315"),
    E0316("71", "0316", "0316"),
    E0318("72", "0318", "0318"),
    E0319("73", "0319", "0319"),
    E0320("74", "0320", "0320"),
    E0321("75", "0321", "0321"),
    E0324("76", "0324", "0324"),
    E0325("77", "0325", "0325"),
    E0326("78", "0326", "0326"),
    E0327("79", "0327", "0327"),
    E0328("80", "0328", "0328"),
    E0330("81", "0330", "0330"),
    E0331("82", "0331", "0331"),
    E0333("83", "0333", "0333"),
    E0334("84", "0334", "0334"),
    E0402("85", "0402", "0402"),
    E0403("86", "0403", "0403"),
    E0412("87", "0412", "0412"),
    E0415("88", "0415", "0415"),
    E0417("89", "0417", "0417"),
    E0418("90", "0418", "0418"),
    E0420("91", "0420", "0420"),
    E0423("92", "0423", "0423"),
    E0425("93", "0425", "0425"),
    E0426("94", "0426", "0426"),
    E0427("95", "0427", "0427"),
    E0428("96", "0428", "0428"),
    E0429("97", "0429", "0429"),
    E0430("98", "0430", "0430"),
    E0434("99", "0434", "0434"),
    E0437("100", "0437", "0437"),
    E0439("101", "0439", "0439"),
    E0450("102", "0450", "0450"),
    E0451("103", "0451", "0451"),
    E0483("104", "0483", "0483"),
    E0501("105", "0501", "0501"),
    E0502("106", "0502", "0502"),
    E0508("107", "0508", "0508"),
    E0511("108", "0511", "0511"),
    E0513("109", "0513", "0513"),
    E0515("110", "0515", "0515"),
    E0516("111", "0516", "0516"),
    E0517("112", "0517", "0517"),
    E0519("113", "0519", "0519"),
    E0521("114", "0521", "0521"),
    E0528("115", "0528", "0528"),
    E0529("116", "0529", "0529"),
    E0532("117", "0532", "0532"),
    E0534("118", "0534", "0534"),
    E0536("119", "0536", "0536"),
    E0538("120", "0538", "0538"),
    E0542("121", "0542", "0542"),
    E0602("122", "0602", "0602"),
    E0604("123", "0604", "0604"),
    E0605("124", "0605", "0605"),
    E0612("125", "0612", "0612"),
    E0617("126", "0617", "0617"),
    E0621("127", "0621", "0621"),
    E0622("128", "0622", "0622"),
    E0623("129", "0623", "0623"),
    E0624("130", "0624", "0624"),
    E0626("131", "0626", "0626"),
    E0632("132", "0632", "0632"),
    E0701("133", "0701", "0701"),
    E0704("134", "0704", "0704"),
    E0710("135", "0710", "0710"),
    E5301("136", "5301", "5301"),
    E5303("137", "5303", "5303"),
    E5302("138", "5302", "5302"),
    E0805("139", "0805", "0805"),
    E0806("140", "0806", "0806"),
    E0811("141", "0811", "0811"),
    E0814("142", "0814", "0814"),
    E0815("143", "0815", "0815"),
    E0817("144", "0817", "0817"),
    E0821("145", "0821", "0821"),
    E0826("146", "0826", "0826"),
    E0833("147", "0833", "0833"),
    E0904("148", "0904", "0904"),
    E0906("149", "0906", "0906"),
    E0901("150", "0901", "0901"),
    E0911("151", "0911", "0911"),
    E0914("152", "0914", "0914"),
    E0919("153", "0919", "0919"),
    E0928("154", "0928", "0928"),
    E0929("155", "0929", "0929"),
    E0937("156", "0937", "0937"),
    E0926("157", "0926", "0926"),
    E1001("158", "1001", "1001"),
    E1002("159", "1002", "1002"),
    E1014("160", "1014", "1014"),
    E1004("161", "1004", "1004"),
    E1032("162", "1032", "1032"),
    E1034("163", "1034", "1034"),
    E1046("164", "1046", "1046"),
    E1101("165", "1101", "1101"),
    E1102("166", "1102", "1102"),
    E1103("167", "1103", "1103"),
    E1106("168", "1106", "1106"),
    E1111("169", "1111", "1111"),
    E1112("170", "1112", "1112"),
    E1119("171", "1119", "1119"),
    E1120("172", "1120", "1120"),
    E1122("173", "1122", "1122"),
    E1124("174", "1124", "1124"),
    E1127("175", "1127", "1127"),
    E1130("176", "1130", "1130"),
    E1133("177", "1133", "1133"),
    E1134("178", "1134", "1134"),
    E1135("179", "1135", "1135"),
    E1146("180", "1146", "1146"),
    E1149("181", "1149", "1149"),
    E1154("182", "1154", "1154"),
    E1159("183", "1159", "1159"),
    E1160("184", "1160", "1160"),
    E1161("185", "1161", "1161"),
    E1162("186", "1162", "1162"),
    E1163("187", "1163", "1163"),
    E1164("188", "1164", "1164"),
    E1165("189", "1165", "1165"),
    E1166("190", "1166", "1166"),
    E1169("191", "1169", "1169"),
    E1179("192", "1179", "1179"),
    E1183("193", "1183", "1183"),
    E1201("194", "1201", "1201"),
    E1202("195", "1202", "1202"),
    E1203("196", "1203", "1203"),
    E1204("197", "1204", "1204"),
    E1205("198", "1205", "1205"),
    E1206("199", "1206", "1206"),
    E1207("200", "1207", "1207"),
    E1208("201", "1208", "1208"),
    E1209("202", "1209", "1209"),
    E1210("203", "1210", "1210"),
    E1211("204", "1211", "1211"),
    E1214("205", "1214", "1214"),
    E1216("206", "1216", "1216"),
    E1219("207", "1219", "1219"),
    E122 ("208", "122 ", "122 "),
    E1221("209", "1221", "1221"),
    E1222("210", "1222", "1222"),
    E1223("211", "1223", "1223"),
    E1224("212", "1224", "1224"),
    E1228("213", "1228", "1228"),
    E1232("214", "1232", "1232"),
    E1233("215", "1233", "1233"),
    E1235("216", "1235", "1235"),
    E1238("217", "1238", "1238"),
    E1242("218", "1242", "1242"),
    E1243("219", "1243", "1243"),
    E1244("220", "1244", "1244"),
    E1246("221", "1246", "1246"),
    E1247("222", "1247", "1247"),
    E1251("223", "1251", "1251"),
    E1253("224", "1253", "1253"),
    E1263("225", "1263", "1263"),
    E1266("226", "1266", "1266"),
    E1283("227", "1283", "1283"),
    E1401("228", "1401", "1401"),
    E1412("229", "1412", "1412"),
    E1413("230", "1413", "1413"),
    E1414("231", "1414", "1414"),
    E1416("232", "1416", "1416"),
    E1417("233", "1417", "1417"),
    E1420("234", "1420", "1420"),
    E1421("235", "1421", "1421"),
    E1422("236", "1422", "1422"),
    E1424("237", "1424", "1424"),
    E1426("238", "1426", "1426"),
    E1428("239", "1428", "1428"),
    E1429("240", "1429", "1429"),
    E1432("241", "1432", "1432"),
    E1438("242", "1438", "1438"),
    E1443("243", "1443", "1443"),
    E1445("244", "1445", "1445"),
    E1449("245", "1449", "1449"),
    E1502("246", "1502", "1502"),
    E1504("247", "1504", "1504"),
    E1505("248", "1505", "1505"),
    E1509("249", "1509", "1509"),
    E1515("250", "1515", "1515"),
    E1517("251", "1517", "1517"),
    E1520("252", "1520", "1520"),
    E1525("253", "1525", "1525"),
    E1528("254", "1528", "1528"),
    E1529("255", "1529", "1529"),
    E1531("256", "1531", "1531"),
    E1532("257", "1532", "1532"),
    E1535("258", "1535", "1535"),
    E1539("259", "1539", "1539"),
    E1547("260", "1547", "1547"),
    E1548("261", "1548", "1548"),
    E1554("262", "1554", "1554"),
    E1557("263", "1557", "1557"),
    E1560("264", "1560", "1560"),
    E1563("265", "1563", "1563"),
    E1566("266", "1566", "1566"),
    E1567("267", "1567", "1567"),
    E1569("268", "1569", "1569"),
    E1572("269", "1572", "1572"),
    E1573("270", "1573", "1573"),
    E1576("271", "1576", "1576"),
    E1583("272", "1583", "1583"),
    E1601("273", "1601", "1601"),
    E1602("274", "1602", "1602"),
    E1606("275", "1606", "1606"),
    E1607("276", "1607", "1607"),
    E1612("277", "1612", "1612"),
    E1620("278", "1620", "1620"),
    E1621("279", "1621", "1621"),
    E1624("280", "1624", "1624"),
    E1627("281", "1627", "1627"),
    E1630("282", "1630", "1630"),
    E1634("283", "1634", "1634"),
    E1638("284", "1638", "1638"),
    E1640("285", "1640", "1640"),
    E1644("286", "1644", "1644"),
    E1648("287", "1648", "1648"),
    E1653("288", "1653", "1653"),
    E1657("289", "1657", "1657"),
    E1663("290", "1663", "1663"),
    E1683("291", "1683", "1683"),
    E1702("292", "1702", "1702"),
    E1703("293", "1703", "1703"),
    E1718("294", "1718", "1718"),
    E1719("295", "1719", "1719"),
    E1721("296", "1721", "1721"),
    E1724("297", "1724", "1724"),
    E1725("298", "1725", "1725"),
    E1729("299", "1729", "1729"),
    E1736("300", "1736", "1736"),
    E1738("301", "1738", "1738"),
    E1739("302", "1739", "1739"),
    E1740("303", "1740", "1740"),
    E1742("304", "1742", "1742"),
    E1743("305", "1743", "1743"),
    E1744("306", "1744", "1744"),
    E1748("307", "1748", "1748"),
    E1749("308", "1749", "1749"),
    E1750("309", "1750", "1750"),
    E1751("310", "1751", "1751"),
    E1755("311", "1755", "1755"),
    E1756("312", "1756", "1756"),
    E1803("313", "1803", "1803"),
    E1804("314", "1804", "1804"),
    E1805("315", "1805", "1805"),
    E1812("316", "1812", "1812"),
    E1813("317", "1813", "1813"),
    E1815("318", "1815", "1815"),
    E1816("319", "1816", "1816"),
    E1818("320", "1818", "1818"),
    E1820("321", "1820", "1820"),
    E1822("322", "1822", "1822"),
    E1824("323", "1824", "1824"),
    E1825("324", "1825", "1825"),
    E1826("325", "1826", "1826"),
    E1827("326", "1827", "1827"),
    E1828("327", "1828", "1828"),
    E1832("328", "1832", "1832"),
    E1833("329", "1833", "1833"),
    E1834("330", "1834", "1834"),
    E1835("331", "1835", "1835"),
    E1836("332", "1836", "1836"),
    E1837("333", "1837", "1837"),
    E1838("334", "1838", "1838"),
    E1839("335", "1839", "1839"),
    E1840("336", "1840", "1840"),
    E1841("337", "1841", "1841"),
    E1842("338", "1842", "1842"),
    E1845("339", "1845", "1845"),
    E1848("340", "1848", "1848"),
    E1849("341", "1849", "1849"),
    E1850("342", "1850", "1850"),
    E1851("343", "1851", "1851"),
    E1852("344", "1852", "1852"),
    E1854("345", "1854", "1854"),
    E1856("346", "1856", "1856"),
    E1857("347", "1857", "1857"),
    E1859("348", "1859", "1859"),
    E1860("349", "1860", "1860"),
    E1865("350", "1865", "1865"),
    E1866("351", "1866", "1866"),
    E1867("352", "1867", "1867"),
    E1868("353", "1868", "1868"),
    E1870("354", "1870", "1870"),
    E1871("355", "1871", "1871"),
    E1874("356", "1874", "1874"),
    E1883("357", "1883", "1883"),
    E1902("358", "1902", "1902"),
    E1903("359", "1903", "1903"),
    E1911("360", "1911", "1911"),
    E1913("361", "1913", "1913"),
    E1917("362", "1917", "1917"),
    E1919("363", "1919", "1919"),
    E1920("364", "1920", "1920"),
    E1922("365", "1922", "1922"),
    E1923("366", "1923", "1923"),
    E1924("367", "1924", "1924"),
    E1925("368", "1925", "1925"),
    E1926("369", "1926", "1926"),
    E1927("370", "1927", "1927"),
    E1928("371", "1928", "1928"),
    E1929("372", "1929", "1929"),
    E1931("373", "1931", "1931"),
    E1933("374", "1933", "1933"),
    E1936("375", "1936", "1936"),
    E1938("376", "1938", "1938"),
    E1939("377", "1939", "1939"),
    E1940("378", "1940", "1940"),
    E1941("379", "1941", "1941"),
    E1942("380", "1942", "1942"),
    E1943("381", "1943", "1943"),
    E1960("382", "1960", "1960"),
    E1983("383", "1983", "1983"),
    E2002("384", "2002", "2002"),
    E2003("385", "2003", "2003"),
    E2004("386", "2004", "2004"),
    E2011("387", "2011", "2011"),
    E2012("388", "2012", "2012"),
    E2014("389", "2014", "2014"),
    E2015("390", "2015", "2015"),
    E2017("391", "2017", "2017"),
    E2018("392", "2018", "2018"),
    E2019("393", "2019", "2019"),
    E2020("394", "2020", "2020"),
    E2021("395", "2021", "2021"),
    E2022("396", "2022", "2022"),
    E2023("397", "2023", "2023"),
    E2024("398", "2024", "2024"),
    E2025("399", "2025", "2025"),
    E2027("400", "2027", "2027"),
    E2028("401", "2028", "2028"),
    E2030("402", "2030", "2030"),
    E2040("403", "2040", "2040"),
    E2053("404", "2053", "2053"),
    E4488("405", "4488", "4488"),
    E4474("406", "4474", "4474"),
    E4803("407", "4803", "4803 NFP OSLO 2"),
    E4849("408", "4849", "4849 NFP TROMSØ"),
    E4403("409", "4403", "4403"),
    E4415("410", "4415", "4415"),
    E4410("411", "4410", "4410"),
    E4833("412", "4833", "4833 NFP OSLO 1"),
    E4842("413", "4842", "4842 NFP STORD"),
    E4806("414", "4806", "4806 NFP DRAMMEN"),
    E4817("415", "4817", "4817 NFP STEINKJER"),
    E4812("416", "4812", "4812 NFP BERGEN"),
    E4401("417", "4401", "4401"),
    E4808("418", "4808", "4808 NFP PORSGRUNN"),
    E0001("419", "0001", "0001 NAV PENSJON UTLAND"),
    E4815("420", "4815", "4815 NFP ÅLESUND"),
    E4862("421", "4862", "4862 NFP UTLAND ÅLESUND"),
    E4820("422", "4820", "4820 NFP VADSØ"),
    E4865("423", "4865", "4865 NFP BIDRAG UTLAND"),
    E0207("424", "0275", "0207"),
    E0307("425", "0307", "0307"),
    E0387("426", "0387", "0387"),
    E0487("427", "0487", "0487"),
    E0587("428", "0587", "0587"),
    E0687("429", "0687", "0687"),
    E1087("430", "1087", "1087"),
    E1187("431", "1187", "1187"),
    E1212("432", "1212", "1212"),
    E1287("433", "1287", "1287"),
    E1987("434", "1987", "1987"),
    E5771("435", "5771", "5771"),
    E0287("436", "0287", "0287"),
    E4525("437", "4525", "4525"),
    E4530("438", "4530", "4530"),
    E4802("439", "4802", "4802 NFP BÆRUM"),
    E0800("440", "0800", "0800"),
    E1500("441", "1500", "1500"),
    E1800("442", "1800", "1800"),
    E4860("443", "4860", "4860 NFP FARSKAP"),
    E4863("444", "4863", "4863"),
    E4475("445", "4475", "4475"),
    E4476("446", "4476", "4476"),
}