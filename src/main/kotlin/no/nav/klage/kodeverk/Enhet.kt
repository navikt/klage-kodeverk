package no.nav.klage.kodeverk

enum class Enhet(override val id: String, override val navn: String, override val beskrivelse: String) : Kode {
    E4701("1", "4701", "NAV Hjelpemiddelsentral Øst-Viken"),
    E4702("2", "4702", "NAV Hjelpemiddelsentral Akershus"),
    E4703("3", "4703", "NAV Hjelpemiddelsentral Oslo"),
    E4704("4", "4704", "NAV Hjelpemiddelsentral Innlandet-Elverum"),
    E4705("5", "4705", "NAV Hjelpemiddelsentral Innlandet-Gjøvik"),
    E4706("6", "4706", "NAV Hjelpemiddelsentral Vest-Viken"),
    E4707("7", "4707", "NAV Hjelpemiddelsentral Vestfold og Telemark-Sandefjord"),
    E4708("8", "4708", "NAV Hjelpemiddelsentral Vestfold og Telemark-Skien"),
    E4709("9", "4709", "NAV Hjelpemiddelsentral Agder-Arendal"),
    E4710("10", "4710", "NAV Hjelpemiddelsentral Agder"),
    E4711("11", "4711", "NAV Hjelpemiddelsentral Rogaland"),
    E4712("12", "4712", "NAV Hjelpemiddelsentral Vestland-Bergen"),
    E4714("13", "4714", "NAV Hjelpemiddelsentral Vestland-Førde"),
    E4715("14", "4715", "NAV Hjelpemiddelsentral Møre og Romsdal"),
    E4716("15", "4716", "NAV Hjelpemiddelsentral Trøndelag"),
    E4717("16", "4717", "NAV Hjelpemiddelsentral Nord-Trøndelag"),
    E4718("17", "4718", "NAV Hjelpemiddelsentral Nordland"),
    E4719("18", "4719", "NAV Hjelpemiddelsentral Troms og Finnmark-Tromsø"),
    E4720("19", "4720", "NAV Hjelpemiddelsentral Troms og Finnmark-Lakselv"),
    E4408("20", "4408", "NAV Arbeid og ytelser Skien"),
    E4418("21", "4418", "NAV Arbeid og ytelser Fauske"),
    E4432("22", "4432", "NAV Arbeid og ytelser Follo"),
    E4409("23", "4409", "NAV Arbeid og ytelser Arendal"),
    E4450("24", "4450", "Dagpenger Inn"),
    E4470("25", "4470", "Dagpenger-Inn-Utland Eksport/Import"),
    E4465("26", "4465", "Dagpenger - Grensearbeider inn"),
    E4455("27", "4455", "Dagpenger u permittering Inn"),
    E4404("28", "4404", "NAV Arbeid og ytelser Hamar"),
    E4405("29", "4405", "NAV Arbeid og ytelser Innlandet"),
    E4411("30", "4411", "NAV Arbeid og ytelser Karmøy"),
    E4402("31", "4402", "NAV Arbeid og ytelser Romerike"),
    E4416("32", "4416", "NAV Arbeid og ytelser Trondheim"),
    E4407("33", "4407", "NAV Arbeid og ytelser Tønsberg"),
    E4483("549", "4483", "NAV Arbeid og ytelser Egne ansatte"),
    E0101("34", "0101", "NAV Halden-Aremark"),
    E0104("35", "0104", "NAV Moss"),
    E0105("36", "0105", "NAV Sarpsborg"),
    E0106("37", "0106", "NAV Fredrikstad"),
    E0111("38", "0111", "NAV Hvaler"),
    E0119("39", "0119", "NAV Skiptvet Marker"),
    E0124("40", "0124", "NAV Indre Østfold"),
    E0127("41", "0127", "NAV Skiptvet"),
    E0128("42", "0128", "NAV Rakkestad"),
    E0135("43", "0135", "NAV Råde"),
    E0137("534", "0137", "NAV Våler i Viken"),
    E1037("44", "1037", "NAV Lister"),
    E0211("45", "0211", "NAV Vestby"),
    E0213("46", "0213", "NAV Nordre Follo"),
    E0214("47", "0214", "NAV Ås"),
    E0215("48", "0215", "NAV Frogn"),
    E0216("548", "0216", "NAV Nesodden"),
    E0219("50", "0219", "NAV Bærum"),
    E0220("51", "0220", "NAV Asker"),
    E0221("52", "0221", "NAV Aurskog-Høland"),
    E0228("53", "0228", "NAV Rælingen"),
    E0229("54", "0229", "NAV Enebakk"),
    E0230("55", "0230", "NAV Lørenskog"),
    E0231("56", "0231", "NAV Lillestrøm"),
    E0233("57", "0233", "NAV Nittedal"),
    E0234("58", "0234", "NAV Gjerdrum"),
    E0235("59", "0235", "NAV Ullensaker"),
    E0236("60", "0236", "NAV Nes i Akershus"),
    E0237("61", "0237", "NAV Eidsvoll"),
    E0238("62", "0238", "NAV Nannestad Gjerdrum"),
    E0239("63", "0239", "NAV Hurdal"),
    E0283("E0283", "0283", "NAV egne ansatte Øst-Viken"),
    E0312("67", "0312", "NAV Frogner"),
    E0313("68", "0313", "NAV St. Hanshaugen"),
    E0314("69", "0314", "NAV Sagene"),
    E0315("70", "0315", "NAV Grünerløkka"),
    E0316("71", "0316", "NAV Gamle Oslo"),
    E0318("72", "0318", "NAV Nordstrand"),
    E0319("73", "0319", "NAV Søndre Nordstrand"),
    E0321("75", "0321", "NAV Østensjø"),
    E0326("78", "0326", "NAV Alna"),
    E0327("79", "0327", "NAV Stovner"),
    E0328("80", "0328", "NAV Grorud"),
    E0330("81", "0330", "NAV Bjerke"),
    E0331("82", "0331", "NAV Nordre Aker"),
    E0334("84", "0334", "NAV Vestre Aker"),
    E0383("E0383", "0383", "NAV egne ansatte Oslo"),
    E0393("536", "0393", "NAV Utland og fellestjenester Oslo"),
    E0402("85", "0402", "NAV Kongsvinger"),
    E0403("86", "0403", "NAV Hamar"),
    E0412("87", "0412", "NAV Ringsaker"),
    E0415("88", "0415", "NAV Løten"),
    E0417("89", "0417", "NAV Stange"),
    E0418("90", "0418", "NAV Nord-Odal"),
    E0420("91", "0420", "NAV Eidskog"),
    E0423("92", "0423", "NAV Grue"),
    E0425("93", "0425", "NAV Åsnes"),
    E0426("94", "0426", "NAV Våler i Hedmark"),
    E0427("95", "0427", "NAV Elverum"),
    E0428("96", "0428", "NAV Trysil"),
    E0429("97", "0429", "NAV Åmot"),
    E0430("98", "0430", "NAV Stor-Elvdal"),
    E0434("99", "0434", "NAV Engerdal"),
    E0437("100", "0437", "NAV Nord-Østerdal"),
    E0439("101", "0439", "NAV Folldal"),
    E0450("102", "0450", "ENHET FOR ARBEIDSGIVER- OG ARBEIDSTAKERREGISTERET"),
    E0483("104", "0483", "NAV egne ansatte Innlandet"),
    E0491("E0491", "0491", "NAV Arbeidslivssenter Innlandet"),
    E0501("105", "0501", "NAV Lillehammer-Gausdal"),
    E0502("106", "0502", "NAV Gjøvik"),
    E0511("108", "0511", "NAV Lesja - Dovre"),
    E0513("109", "0513", "NAV Lom-Skjåk"),
    E0515("110", "0515", "NAV Vågå"),
    E0516("111", "0516", "NAV Midt-Gudbrandsdal"),
    E0517("112", "0517", "NAV Sel"),
    E0519("113", "0519", "NAV Sør-Fron"),
    E0521("114", "0521", "NAV Øyer"),
    E0528("115", "0528", "NAV Østre Toten"),
    E0529("116", "0529", "NAV Vestre Toten"),
    E0532("117", "0532", "NAV Jevnaker"),
    E0534("118", "0534", "NAV Hadeland"),
    E0536("119", "0536", "NAV Søndre Land"),
    E0538("120", "0538", "NAV Nordre Land"),
    E0542("121", "0542", "NAV Valdres"),
    E0600("E0600", "0600", "NAV Vest-Viken"),
    E0602("122", "0602", "NAV Drammen"),
    E0604("123", "0604", "NAV Kongsberg"),
    E0605("124", "0605", "NAV Ringerike"),
    E0612("125", "0612", "NAV Hole"),
    E0617("126", "0617", "NAV Hallingdal"),
    E0621("127", "0621", "NAV Sigdal"),
    E0622("128", "0622", "NAV Krødsherad"),
    E0623("129", "0623", "NAV Midt-Buskerud"),
    E0624("130", "0624", "NAV Øvre Eiker"),
    E0626("131", "0626", "NAV Lier"),
    E0632("132", "0632", "NAV Numedal"),
    E0683("E0683", "0683", "NAV egne ansatte Vest-Viken"),
    E0701("133", "0701", "NAV Horten"),
    E0704("134", "0704", "NAV Tønsberg"),
    E0710("135", "0710", "NAV Sandefjord"),
    E5301("136", "5301", "NAV Holmestrand"),
    E5303("137", "5303", "NAV Larvik"),
    E5302("138", "5302", "NAV Færder"),
    E0805("139", "0805", "NAV Porsgrunn"),
    E0806("140", "0806", "NAV Skien"),
    E0811("141", "0811", "NAV Siljan"),
    E0814("142", "0814", "NAV Bamble"),
    E0815("143", "0815", "NAV Kragerø"),
    E0817("144", "0817", "NAV Drangedal"),
    E0821("145", "0821", "NAV Midt-Telemark"),
    E0826("146", "0826", "NAV Tinn"),
    E0833("147", "0833", "NAV Vest-Telemark"),
    E0883("E0883", "0883", "NAV egne ansatte Vestfold og Telemark"),
    E0904("148", "0904", "NAV Grimstad"),
    E0906("149", "0906", "NAV Arendal"),
    E0901("150", "0901", "NAV Risør"),
    E0911("151", "0911", "NAV Gjerstad"),
    E0914("152", "0914", "NAV Øst i Agder"),
    E0919("153", "0919", "NAV Froland"),
    E0928("154", "0928", "NAV Birkenes"),
    E0929("155", "0929", "NAV Åmli"),
    E0937("156", "0937", "NAV Evje og Hornnes"),
    E0926("157", "0926", "NAV Lillesand"),
    E1001("158", "1001", "NAV Kristiansand"),
    E1002("159", "1002", "NAV Lindesnes"),
    E1014("160", "1014", "NAV Midt-Agder"),
    E1004("161", "1004", "NAV Flekkefjord"),
    E1032("162", "1032", "NAV Lyngdal"),
    E1034("163", "1034", "NAV Hægebostad"),
    E1046("164", "1046", "NAV Sirdal"),
    E1083("E1083", "1083", "NAV egne ansatte Agder"),
    E1101("165", "1101", "NAV Dalane"),
    E1102("166", "1102", "NAV Sandnes"),
    E1106("168", "1106", "NAV Haugesund-Utsira"),
    E1111("169", "1111", "NAV Sokndal"),
    E1112("170", "1112", "NAV Lund"),
    E1119("171", "1119", "NAV Hå"),
    E1120("172", "1120", "NAV Klepp-Time"),
    E1122("173", "1122", "NAV Gjesdal"),
    E1124("174", "1124", "NAV Sola"),
    E1127("175", "1127", "NAV Randaberg-Kvitsøy"),
    E1130("176", "1130", "NAV Strand"),
    E1133("177", "1133", "NAV Hjelmeland"),
    E1134("178", "1134", "NAV Suldal"),
    E1135("179", "1135", "NAV Sauda"),
    E1146("180", "1146", "NAV Tysvær"),
    E1149("181", "1149", "NAV Karmøy-Bokn"),
    E1160("184", "1160", "NAV Vindafjord-Etne"),
    E1161("185", "1161", "NAV Eiganes og Tasta"),
    E1162("186", "1162", "NAV Hundvåg og Storhaug"),
    E1164("188", "1164", "NAV Hillevåg og Hinna"),
    E1165("189", "1165", "NAV Madla"),
    E1169("191", "1169", "NAV Rennesøy og Finnøy"),
    E1183("193", "1183", "NAV egne ansatte Rogaland"),
    E1202("195", "1202", "NAV Bergen sør"),
    E1203("196", "1203", "NAV Bergen nord"),
    E1204("197", "1204", "NAV Arna"),
    E1205("198", "1205", "NAV Fyllingsdalen"),
    E1206("199", "1206", "NAV Bergen vest"),
    E1208("201", "1208", "NAV Årstad"),
    E1209("202", "1209", "NAV Bergenhus"),
    E1210("203", "1210", "NAV Ytrebygda"),
    E1211("204", "1211", "NAV Etne"),
    E1216("206", "1216", "NAV Sveio"),
    E1219("207", "1219", "NAV Bømlo"),
    E1221("209", "1221", "NAV Stord"),
    E1222("210", "1222", "NAV Fitjar"),
    E1223("211", "1223", "NAV Tysnes"),
    E1224("212", "1224", "NAV Kvinnherad"),
    E1228("213", "1228", "NAV Ullensvang"),
    E1232("214", "1232", "NAV Eidfjord"),
    E1233("215", "1233", "NAV Ulvik"),
    E1235("216", "1235", "NAV Voss"),
    E1238("217", "1238", "NAV Kvam"),
    E1242("218", "1242", "NAV Samnanger"),
    E1243("219", "1243", "NAV Bjørnafjorden"),
    E1244("220", "1244", "NAV Austevoll"),
    E1246("221", "1246", "NAV Øygarden"),
    E1247("222", "1247", "NAV Askøy"),
    E1251("223", "1251", "NAV Vaksdal"),
    E1253("224", "1253", "NAV Osterøy"),
    E1263("225", "1263", "NAV Alver"),
    E1266("226", "1266", "NAV Fensfjorden"),
    E1283("227", "1283", "NAV egne ansatte Vestland"),
    E1401("228", "1401", "NAV Kinn"),
    E1412("229", "1412", "NAV Solund"),
    E1413("230", "1413", "NAV Hyllestad"),
    E1416("232", "1416", "NAV Høyanger"),
    E1417("233", "1417", "NAV Vik"),
    E1420("234", "1420", "NAV Sogndal"),
    E1421("235", "1421", "NAV Aurland"),
    E1422("236", "1422", "NAV Lærdal"),
    E1424("237", "1424", "NAV Årdal"),
    E1426("238", "1426", "NAV Luster"),
    E1428("239", "1428", "NAV Askvoll"),
    E1429("240", "1429", "NAV Fjaler"),
    E1432("241", "1432", "NAV Sunnfjord"),
    E1438("242", "1438", "NAV Bremanger"),
    E1443("243", "1443", "NAV Stad"),
    E1445("244", "1445", "NAV Gloppen"),
    E1449("245", "1449", "NAV Stryn"),
    E1502("246", "1502", "NAV Molde"),
    E1504("247", "1504", "NAV Ålesund"),
    E1505("248", "1505", "NAV Kristiansund"),
    E1515("250", "1515", "NAV Herøy og Vanylven"),
    E1517("251", "1517", "NAV Hareid - Ulstein - Sande"),
    E1520("252", "1520", "NAV Ørsta Volda"),
    E1525("253", "1525", "NAV Stranda"),
    E1528("254", "1528", "NAV Sykkylven - Stranda"),
    E1529("255", "1529", "NAV Fjord"),
    E1531("256", "1531", "NAV Sula"),
    E1532("257", "1532", "NAV Giske"),
    E1535("258", "1535", "NAV Vestnes"),
    E1539("259", "1539", "NAV Rauma"),
    E1547("260", "1547", "NAV Aukra"),
    E1548("261", "1548", "NAV Hustadvika"),
    E1554("262", "1554", "NAV Averøy"),
    E1557("263", "1557", "NAV Gjemnes"),
    E1560("264", "1560", "NAV Tingvoll"),
    E1563("265", "1563", "NAV Indre Nordmøre"),
    E1566("266", "1566", "NAV Surnadal"),
    E1567("267", "1567", "NAV Rindal"),
    E1572("269", "1572", "NAV Tustna"),
    E1573("270", "1573", "NAV Smøla"),
    E1576("271", "1576", "NAV Aure"),
    E1583("272", "1583", "NAV egne ansatte Møre og Romsdal"),
    E1607("276", "1607", "NAV Heimdal"),
    E1612("277", "1612", "NAV Heim"),
    E1620("278", "1620", "NAV Hitra Frøya"),
    E1621("279", "1621", "NAV Ørland"),
    E1624("280", "1624", "NAV Rissa"),
    E1627("281", "1627", "NAV Bjugn"),
    E1630("282", "1630", "NAV Nord-Fosen"),
    E1634("283", "1634", "NAV Oppdal og Rennebu"),
    E1638("284", "1638", "NAV Orkland"),
    E1640("285", "1640", "NAV Røros, Os og Holtålen"),
    E1644("286", "1644", "NAV Holtålen"),
    E1648("287", "1648", "NAV Midtre Gauldal"),
    E1653("288", "1653", "NAV Melhus"),
    E1657("289", "1657", "NAV Skaun"),
    E1663("290", "1663", "NAV Malvik"),
    E1683("291", "1683", "NAV egne ansatte Trøndelag"),
    E1702("292", "1702", "NAV Inn-Trøndelag"),
    E1703("293", "1703", "NAV Midtre Namdal"),
    E1718("294", "1718", "NAV Leksvik"),
    E1719("295", "1719", "NAV Levanger"),
    E1721("296", "1721", "NAV Verdal"),
    E1724("297", "1724", "NAV Verran"),
    E1725("298", "1725", "NAV Namdalseid"),
    E1729("299", "1729", "Avviklet - NAV Inderøy"),
    E1736("300", "1736", "NAV Snåsa"),
    E1738("301", "1738", "NAV Lierne"),
    E1739("302", "1739", "NAV Røyrvik"),
    E1740("303", "1740", "NAV Namsskogan"),
    E1742("304", "1742", "NAV Indre Namdal"),
    E1743("305", "1743", "NAV Høylandet"),
    E1744("306", "1744", "NAV Overhalla"),
    E1748("307", "1748", "NAV Fosnes"),
    E1749("308", "1749", "NAV Flatanger"),
    E1750("309", "1750", "NAV Vikna"),
    E1751("310", "1751", "NAV Nærøysund"),
    E1755("311", "1755", "NAV Leka"),
    E1756("312", "1756", "NAV Inderøy"),
    E1804("314", "1804", "NAV Bodø"),
    E1805("315", "1805", "NAV Narvik"),
    E1812("316", "1812", "NAV Sømna"),
    E1813("317", "1813", "NAV Sør-Helgeland"),
    E1815("318", "1815", "NAV Vega"),
    E1816("319", "1816", "NAV Vevelstad"),
    E1818("320", "1818", "NAV Herøy"),
    E1820("321", "1820", "NAV Ytre Helgeland"),
    E1822("322", "1822", "NAV Leirfjord"),
    E1824("323", "1824", "NAV Vefsna"),
    E1825("324", "1825", "NAV Grane"),
    E1826("325", "1826", "NAV Hattfjelldal"),
    E1827("326", "1827", "NAV Dønna"),
    E1828("327", "1828", "NAV Nesna"),
    E1832("328", "1832", "NAV Hemnes"),
    E1833("329", "1833", "NAV Rana"),
    E1834("330", "1834", "NAV Lurøy"),
    E1835("331", "1835", "NAV Træna"),
    E1836("332", "1836", "NAV Rødøy"),
    E1837("333", "1837", "NAV Meløy"),
    E1838("334", "1838", "NAV Gildeskål"),
    E1839("335", "1839", "NAV Beiarn"),
    E1840("336", "1840", "NAV Saltdal"),
    E1841("337", "1841", "NAV Indre Salten"),
    E1845("339", "1845", "NAV Sørfold"),
    E1848("340", "1848", "NAV Steigen"),
    E1849("341", "1849", "NAV Hamarøy"),
    E1850("342", "1850", "NAV Tysfjord"),
    E1851("343", "1851", "NAV Lødingen"),
    E1852("344", "1852", "NAV Evenes og Tjeldsund"),
    E1854("345", "1854", "NAV Ballangen"),
    E1856("346", "1856", "NAV Røst"),
    E1857("347", "1857", "NAV Værøy"),
    E1859("348", "1859", "NAV Flakstad"),
    E1860("349", "1860", "NAV Lofoten"),
    E1865("350", "1865", "NAV Svolvær"),
    E1866("351", "1866", "NAV Hadsel"),
    E1867("352", "1867", "NAV Bø"),
    E1868("353", "1868", "NAV Øksnes"),
    E1870("354", "1870", "NAV Sortland"),
    E1871("355", "1871", "NAV Andøy"),
    E1874("356", "1874", "NAV Moskenes"),
    E1883("357", "1883", "NAV egne ansatte Nordland"),
    E1902("358", "1902", "NAV Tromsø"),
    E1903("359", "1903", "NAV Sør-Troms"),
    E1911("360", "1911", "NAV Kvæfjord"),
    E1913("361", "1913", "NAV Tjeldsund"),
    E1917("362", "1917", "NAV Ibestad"),
    E1919("363", "1919", "NAV Gratangen"),
    E1920("364", "1920", "NAV Lavangen"),
    E1922("365", "1922", "NAV Bardu"),
    E1923("366", "1923", "NAV Salangen-Lavangen-Dyrøy"),
    E1924("367", "1924", "NAV Målselv-Bardu"),
    E1925("368", "1925", "NAV Sørreisa"),
    E1926("369", "1926", "NAV Dyrøy"),
    E1927("370", "1927", "NAV Tranøy"),
    E1928("371", "1928", "NAV Torsken"),
    E1929("372", "1929", "NAV Berg"),
    E1931("373", "1931", "NAV Senja-Sørreisa"),
    E1933("374", "1933", "NAV Balsfjord-Storfjord"),
    E1936("375", "1936", "NAV Karlsøy"),
    E1938("376", "1938", "NAV Lyngen"),
    E1939("377", "1939", "NAV Storfjord"),
    E1940("378", "1940", "NAV Gáivuotna/Kåfjord"),
    E1941("379", "1941", "NAV Skjervøy"),
    E1942("380", "1942", "NAV Nordreisa"),
    E1943("381", "1943", "NAV Kvænangen"),
    E1983("383", "1983", "NAV egne ansatte Troms og Finnmark"),
    E2002("384", "2002", "NAV Vardø"),
    E2003("385", "2003", "NAV Vadsø"),
    E2004("386", "2004", "NAV Hammerfest-Måsøy"),
    E2011("387", "2011", "NAV Guovdageaidnu/Kautokeino"),
    E2012("388", "2012", "NAV Alta-Kvænangen-Loppa"),
    E2014("389", "2014", "NAV Loppa"),
    E2015("390", "2015", "NAV Hasvik"),
    E2017("391", "2017", "NAV Kvalsund"),
    E2018("392", "2018", "NAV Måsøy"),
    E2019("393", "2019", "NAV Nordkapp"),
    E2020("394", "2020", "NAV Porsanger"),
    E2021("395", "2021", "NAV Karasjohka/Karasjok"),
    E2022("396", "2022", "NAV Lebesby"),
    E2023("397", "2023", "NAV Gamvik"),
    E2024("398", "2024", "NAV Berlevåg"),
    E2025("399", "2025", "NAV Deatnu/Tana"),
    E2027("400", "2027", "NAV Unjárga/Nesseby"),
    E2028("401", "2028", "NAV Båtsfjord"),
    E2030("402", "2030", "NAV Sør-Varanger"),
    E2096("E2096", "2096", "NAV Arbeidsrådgivningskontor  Troms og Finnmark"),
    E4488("405", "4488", "NAV AY Sykepenger"),
    E4489("E4489", "4489", "NAV AY Enslig forsørger"),
    E4474("406", "4474", "Sykepenger Utland"),
    E4800("E4800", "4800", "NAV Familie- og pensjonsytelser styringsenhet"),
    E4803("407", "4803", "NAV Familie- og pensjonsytelser Oslo 2"),
    E4849("408", "4849", "NAV Familie- og pensjonsytelser Tromsø"),
    E4403("409", "4403", "NAV Arbeid og ytelser Kristiania"),
    E4415("410", "4415", "NAV Arbeid og ytelser Molde"),
    E4410("411", "4410", "NAV Arbeid og ytelser Sørlandet"),
    E4833("412", "4833", "NAV Familie- og pensjonsytelser Oslo 1"),
    E4842("413", "4842", "NAV Familie- og pensjonsytelser Stord"),
    E4806("414", "4806", "NAV Familie- og pensjonsytelser Drammen"),
    E4817("415", "4817", "NAV Familie- og pensjonsytelser Steinkjer"),
    E4812("416", "4812", "NAV Familie- og pensjonsytelser Bergen"),
    E4401("417", "4401", "NAV Arbeid og ytelser Sarpsborg"),
    E4808("418", "4808", "NAV Familie- og pensjonsytelser Porsgrunn"),
    E0001("419", "0001", "NAV Pensjon Utland"),
    E4815("420", "4815", "NAV Familie- og pensjonsytelser Ålesund"),
    E4862("421", "4862", "NAV Familie- og pensjonsytelser utland Ålesund"),
    E4820("422", "4820", "NAV Familie- og pensjonsytelser Vadsø"),
    E4865("423", "4865", "NAV Familie- og pensjonsytelser Bidrag utland"),
    E4867("E4867", "4867", "NAV Familie- og pensjonsytelser Foreldrepenger"),
    E4883("E4883", "4883", "NAV Familie- og pensjonsytelser Egne ansatte"),
    E0386("E0386", "0386", "NAV Oslo digital oppfølging"),
    E0387("426", "0387", "NAV Tiltak Oslo"),
    E0587("428", "0587", "NAV Tiltak Innlandet"),
    E0687("429", "0687", "NAV Tiltak Vest-Viken"),
    E1087("430", "1087", "NAV Tiltak Agder"),
    E1187("431", "1187", "NAV Tiltak Rogaland"),
    E1287("433", "1287", "NAV Tiltak Vestland"),
    E1987("434", "1987", "NAV Tiltak Troms og Finnmark"),
    E5771("435", "5771", "NAV Tiltak Trøndelag"),
    E5773("E5773", "5773", "NAV Arbeidsrådgivningstjeneste Trøndelag"),
    E0287("436", "0287", "NAV Tiltak Øst-Viken"),
    E0296("E0296", "0296", "NAV Arbeidsrådgivning Øst-Viken"),
    E4525("437", "4525", "NAV Kontroll Forvaltning"),
    E4530("438", "4530", "NAV Medlemskap og avgift"),
    E4802("439", "4802", "NAV Familie- og pensjonsytelser Bærum"),
    E0800("440", "0800", "NAV Vestfold og Telemark"),
    E1500("441", "1500", "NAV Møre og Romsdal"),
    E1800("442", "1800", "NAV Nordland"),
    E4860("443", "4860", "NAV Familie- og pensjonsytelser Farskap"),
    E4863("444", "4863", "NAV Familie- og pensjonsytelser midlertidig enhet"),
    E4475("445", "4475", "Uføretrygd bosatt utland"),
    E4476("446", "4476", "Uføretrygd med utlandstilsnitt"),
    E4280("500", "4280", "NAV Klageinstans - Tilleggsstønader - Inn"),

    //    E4255("501", "4255", "NAV Klageinstans - Tiltakspenger - Inn"),
//    E4258("502", "4258", "NAV Klageinstans - Tiltak"),
    E4260("503", "4260", "NAV Klageinstans - Arbeidsavklaringspenger - Inn"),
    E4270("504", "4270", "NAV Klageinstans - Dagpenger - Inn"),
    E4295("505", "4295", "NAV Klageinstans nord"),
    E4286("506", "4286", "NAV Klageinstans - Uføretrygd - inn"),

    //    E4279("507", "4279", "NAV Klageinstans Sakskostnader"),
    E4290("E4290", "4290", "IT-avdelingen"),
    E4293("508", "4293", "NAV Klageinstans øst"),

    //    E4207("509", "4207", "Avviklet NAV Klageinstans øst"),
//    E4287("510", "4287", "NAV Klageinstans - erstatning"),
//    E4205("511", "4205", "Avviklet NAV Klageinstans Midt-Norge"),
//    E4214("512", "4214", "Avviklet NAV Klageinstans vest"),
    E4294("513", "4294", "NAV Klageinstans vest"),
    E4292("514", "4292", "NAV Klageinstans Midt-Norge"),
    E4291("515", "4291", "NAV Klageinstans Oslo og Akershus"),

    //    E4203("516", "4203", "Avviklet NAV Klageinstans Oslo og Akershus"),
//    E4200("517", "4200", "NAV Klageinstans styringsenhet"),
//    E4219("518", "4219", "Avviklet NAV Klageinstans nord"),
    E4250("519", "4250", "NAV Klageinstans sør"),
    E4251("E4251", "4251", "NAV Klageinstans - Bidrag - INN"),
    E4255("E4255", "4255", "NAV Klageinstans - Tiltakspenger - Inn"),
    E4258("E4258", "4258", "NAV Klageinstans - Tiltak"),
    E4259("E4259", "4259", "NAV Klageinstans - Sykepenger - INN"),
    E4153("520", "4153", "NAV Økonomi Stønad"),
    E4154("E4154", "4154", "Nasjonal oppfølgingsenhet"),
    E4480("E4480", "4480", "NAV Arbeid og ytelser rådgivende legetjeneste"),
    E4486("521", "4486", "NAV Arbeid og ytelse lønnskompensasjon"),
    E4534("522", "4534", "NAV Registerforvaltning"),
    E2103("523", "2103", "NAV Vikafossen"),
    E2970("524", "2970", "IT-avdelingen"),
    E4473("525", "4473", "NAV AY Inntektskompensasjon"),
    E0807("526", "0807", "NAV Notodden"),
    E4200("527", "4200", "NAV Klageinstans styringsenhet"),
    E4487("528", "4487", "NAV AY sykdom i familien"),
    E2990("529", "2990", "IT-avdelingen"),
    E4425("530", "4425", "NAV Arbeid og ytelser lønnsgaranti"),
    E4426("531", "4426", "NAV Arbeid og ytelser lønnsgaranti Vardø"),
    E1783("532", "1783", "NAV Værnes"),
    E2830("533", "2830", "DIR Ytelsesavdelingen"),
    E4151("535", "4151", "NAV Økonomi Stønad"),
    E5702("537", "5702", "NAV Lerkendal"),
    E5701("538", "5701", "NAV Falkenborg"),
    E4400("539", "4400", "NAV Arbeid og ytelser styringsenhet"),
    E0335("540", "0335", "NAV Ullern"),
    E4819("541", "4819", "NAV Økonomi Pensjon"),
    E0476("542", "0476", "NAV Sykefraværssenter Hamarregionen"),
    E4700("543", "4700", "NAV Styringsenhet Hjelpemiddelsentr./spes.enheter"),
    E2811("544", "2811", "NAV Internrevisjon"),
    E5703("545", "5703", "NAV Indre Fosen"),
    E0300("546", "0300", "NAV Oslo"),
    E1200("547", "1200", "NAV Vestland"),
}

val klageenheter = setOf(Enhet.E4295, Enhet.E4293, Enhet.E4250, Enhet.E4294, Enhet.E4292, Enhet.E4291, Enhet.E2103)

val klageenheterForAnkeinnsending = setOf(
    Enhet.E4295,
    Enhet.E4293,
    Enhet.E4250,
    Enhet.E4294,
    Enhet.E4292,
    Enhet.E4291,
    Enhet.E4260,
    Enhet.E4270,
    Enhet.E4280,
    Enhet.E4286,
    Enhet.E2103
)

val styringsenheter = setOf(Enhet.E4200, Enhet.E4400, Enhet.E4700)