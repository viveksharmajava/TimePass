package sample.test.problems.string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String [] array = new String []{
				"0713AKANE@I.SOFTBANK.JP","0909MFS@TMD.AC.JP","1027MASA","155504","217777","22532","24","2NOUKOUDAI","3524","4889094","5701","6324","721861","8120003","A.MURATA@OMMC-HP.JP","A000083Y","A0067040","ABEABE1201@GMAIL.COM","AC124806@EDU.OKINAWA-CT.AC.JP","AG123D14@DPC.AGU.AC.JP","AHASHIMO@MED.HOKUDAI.AC.JP","AICHIMURA@MED.TOHOKU.AC.JP","AIHARAH","AIKOAO@GMAIL.COM","AIRI_HARA@MAIL.ZENYAKU.CO.JP","AKAHANE-KEISUKE@KENEKI.GO.JP","AKAMA@LIFE.SHIMANE-U.AC.JP","AKANE.KATO@BO.RD.TAISHO.CO.JP","AKASE@YOKOHAMA-CU.AC.JP","AKASHI-ST-ZENIGATA@EC.HOKUDAI.AC.JP","AKIHIKO_KUBOTA1@HOTMAIL.COM","AKIHITO@MAIL.SAITAMA-U.AC.JP","AKIKO-HIRAO@TSURUOKA-NCT.AC.JP","AKIKOMD","AKINOBU@BIOREG.KYUSHU-U.AC.JP","AKIRA.YOKOFUJI@SNOWSEED.CO.JP","AKITA@AGR.EHIME-U.AC.JP","AKITA@SCI.HOKUDAI.AC.JP","AKOTAM","ARAI.TAKASHI.BN@PREF.SAITAMA.LG.JP","ARAIC","ARAI-TOMOKO@SPU.AC.JP","ARAKI@FISH.KAGOSHIMA-U.AC.JP","ASADBIO","ASAMA","ASANOYASUO","ASASAKI","ATAISHI@MAIL.ECC.U-TOKYO.AC.JP","ATAMAI","ATOMOMU","ATSUSHIIDE","AY","AZAMAY@PREF.OKINAWA.LG.JP","AZMACCI","BANDOU@ONO.CO.JP","BBGLMAA@GMAIL.COM","BIOJETOK@GMAIL.COM","BISEIBUTU","BLACKMANTA","BUSCOPAN","C.STARZYNSKI@OIST.JP","CHENJ1984JP@JICHI.AC.JP","CHIBAUKOGE","CHICHI@ASAHIKAWA-MED.AC.JP","CHIMICCO","CHUAN_ZHAO.WEI@MIKADOKYOWASEED.COM","CHUJO@HOKU-IRYO-U.AC.JP","CIEA4477","COCACOTA@HOTMAIL.CO.JP","CSBARKER","CXU00133","D.YAMAMOTO@PO.RD.TAISHO.CO.JP","D752415","DAICHI241YAKULT@EC.HOKUDAI.AC.JP","DAMEDEZ","DATE","DATELAB","DEGZAN0330@GMAIL.COM","DEREKGOTO@ME.COM","DNASTAR","DRPE059@NDMC.AC.JP","DWONK","E13KTOSHIHIKO@YAHOO.CO.JP","EBINE@BIOL.S.U-TOKYO.AC.JP","EBISAWA","EFUKUDA@HIROSHIMA-U.AC.JP","EISEI2132","ELEMENTL425@YAHOO.CO.JP","EMMA@REHA.KOBEGAKUIN.AC.JP","EMURAKO@YAHOO.CO.JP","ENYA0701","ETSUKO","FITOUR@DNH.TWMU.AC.JP","FNAKATAN@NCC.GO.JP","FUJIOKA","FULLMOON","FUSOFUSO","FUTAMATA","GENYAMA77@YAHOO.CO.JP","GIHUSHIGE","GOOGAWA","GOTOK@MED.TEIKYO-U.AC.JP","GROSSMANN.MARY@GMAIL.COM","H136342@COMB.U-RYUKYU.AC.JP","H-ADACHI@SO.TAISHO.CO.JP","HARACHNOPHOBIA@GMAIL.COM","HARADA-H@CITY.IWAKI.FUKUSHIMA.JP","HARAMOTO","HARRYWESTJPJP@YAHOO.CO.JP","HASHIDA@ANGEL.OCN.NE.JP","HASHIMOT@MED.HOKUDAI.AC.JP","HAYASAKI@FUKSI-KAGK-U.AC.JP","HAZIME-AMANO@CITY.YOKOSUKA.KANAGAWA.JP","HI.YOSHIMURA@PO.RD.TAISHO.CO.JP","HIDEISHI@CC.TUAT.AC.JP","HIKARU.TAIRA@LIFETECH.COM","HINABE@AFFRC.GO.JP","HIRAKI@JICHI.AC.JP","HIRANODNA","HIRAYAMA.DBIO@MRI.TMD.AC.JP","HIROAKI-OCHIIWA@TAIHO.CO.JP","HIROIHIRO","HIROISSAN","HIROKO-NAKAI@HOUSE-WF.CO.JP","HIROSHIMA-KENEKI@KENEKI.GO.JP","HIROSHIOMI","HIROTO@IGM.HOKUDAI.AC.JP","HIROYOSHI","HISASUE@AZABU-U.AC.JP","HITOSHI_MIYASHITA@MAIL.ZENYAKU.CO.JP","HKAGAMI","HKANZAWA@KAHAKU.GO.JP","HKITAJOSAI","HKOBA@AGRI.PREF.IBARAKI.JP","HKOHZAKI","HMANO@VIRUS.KYOTO-U.AC.JP","HMASHIMA","HMINAMI","HNAKATSU","HOKUSHOKU1","HORII@PSC.RIKEN.JP","HOZUMIM","HSS0001947","I8DU4EPD","IBES@KOBAL.CO.JP","IBUKI415@YOKOHAMA-CU.AC.JP","ICHI.IKUYO@OCHA.AC.JP","ICHIMIYA","ICHINOSE@OITA-NHS.AC.JP","IGARASHI@MED.KAGAWA-U.AC.JP","IGARASHI@NIHS.GO.JP","IGEI-HIDETOSHI@KENEKI.GO.JP","IIDABASHI2011@YAHOO.CO.JP","IKEDASH@KAIS.KYOTO-U.AC.JP","IKEMATSU@OKINAWA-CT.AC.JP","IKENAGA-AHFT@PREF.YAMANASHI.LG.JP","IMASAYUKI","IN1329@POH.OSAKA-MED.AC.JP","INAGACCHA","I-NAKAMURA@ACCREDO.CO.JP","IRINA@OIST.JP","ISHIDA-KEIICHI@KENEKI.GO.JP","ISHIHARA-TM@PHA.KEIO.AC.JP","ISHII","ISLET","ITA4003@YAHOO.CO.JP","ITOTAKAKUN77777@GMAIL.COM","ITOU-TETSUYA@ZENNOH.OR.JP","IWAMI@ES.MEISEI-U.AC.JP","IWATSUKI.DBIO@MRI.TMD.AC.JP","IZUMIYA","J111602","J6409063@ED.TUS.AC.JP","JAI.DENTON@OIST.JP","JANUS","JIRO.UCHIDA@LIFETECH.COM","J-NISHI@RIQL.CO.JP","J-SAKAGAMI@SO.TAISHO.CO.JP","JUNKO-YAMAGUTI@CITY.YOKOSUKA.KANAGAWA.JP","JUNMIYATA@HOTMAIL.CO.JP","JUNNOSUKE","KAHTZEN@GMAIL.COM","KAIBOU2","KAKAPOST@LIVE.COM","KAMEI","KAMIIE@AZABU-U.AC.JP","KAMIKAWA-MAI@ZENNOH.OR.JP","KAMINAKA@MUSES.TOTTORI-U.AC.JP","KAMINUMA-OS@IGAKUKEN.OR.JP","KANDA@MED.HOKUDAI.AC.JP","KANEMAKI@AZABU-U.AC.JP","KANIKANI3","KANKYOKENSA@CITY.HIGASHIOSAKA.LG.JP","KARIKARIADO@DOCOMO.NE.JP","KASHIHARA","KASHITOS@SHINSHU-U.AC.JP","KATOTATU7@MSN.COM","KATSUYOSHI.T@H5.DION.NE.JP","KAWA3","KAWADAM@KUHP.KYOTO-U.AC.JP","KAZUHIRO.FUKUMURA@LIFETECH.COM","KAZUK","KAZUMA1203","KAZUSHIRO","KAZUTAKA_ODA@MAIL.ZENYAKU.CO.JP","KEIKOSAN","KEIM@YOKOHAMA-CU.AC.JP","KEISUKE@OIST.JP","KHIRANO@SOKA.AC.JP","KIKIKI","KIKUE@OMMC-HP.JP","KIMURA-SH883@PREF.MIYAGI.JP","KIRYU@OMTRI.OR.JP","KKANKI","KKOUDA@PPMX.COM","KMIYAMO@WAKA.KINDAI.AC.JP","KO-1-RO@A6.KEIO.JP","KOBAYASHI-AMVK@PREF.YAMANASHI.LG.JP","KOGE_EXP@CHIBA-U.JP","KOHARA-MC@IGAKUKEN.OR.JP","KOHARA-SAKAE@SNBL.CO.JP","KOMATSUAKI@OFFICE.CHIBA-U.JP","KOSUKESAITO@AKANE.WASEDA.JP","KOTARO@RIKEN.JP","KSNYM@CHEM.AGR.HOKUDAI.AC.JP","KSUZAWA@YAHOO.CO.JP","K-TSUTA@TAIHO.CO.JP","KUBO-AKIKO@GLICO.CO.JP","KUBOTA@MED.HOKUDAI.AC.JP","KUNAPIPI.PI@GMAIL.COM","K-YAMA@HAMA-MED.AC.JP","KYANHSKO","KYN@AETERNUS.JP","KYO.AZUMA@LIFETECH.COM","KYOKO_SHINOHARA@DEN.HOKUDAI.AC.JP","KYOKO_WADA@MHI.CO.JP","KYOMOE909@YAHOO.CO.JP","KYOSHI@NAGASAKI-U.AC.JP","KZHR.IMAMURA@GMAIL.COM","LISANONAKA","M.KAJITA@IGM.HOKUDAI.AC.JP","M.TERASHIMA@LOWTEM.HOKUDAI.AC.JP","M11702025@GUNMA-U.AC.JP","MA120003@TMD.AC.JP","MADOKA1_ITO@PREF.SHIZUOKA.LG.JP","MAKI.OYAMA@MIKADOKYOWASEED.COM","MAKIKO_USHIMIZU@CITY.SENDAI.JP","MAKOTOKATO","MAKOTOMAKO","MA-MIYOSHI@SO.TAISHO.CO.JP","MANNEN@OITA-U.AC.JP","MARIMO.KASHIMURA@MIKADOKYOWASEED.COM","MAS3086","MASADA@NIHS.GO.JP","MASAKAZU_NAGAMINE@MAIL.ZENYAKU.CO.JP","MASAKO@AZABU-U.AC.JP","MASA-UMI.PSYC@TMD.AC.JP","MASUDA@PHAR.KYUSHU-U.AC.JP","MATSUMOTO@MED.KITASATO-U.AC.JP","MATSUURA@OITA-U.AC.JP","MATSUZAKI","MATSUZAWA.MASAZUMI@GMAIL.COM","MAYU@DOKKYOMED.AC.JP","MD11068@SHIBAURA-IT.AC.JP","MEMURO_YOUDO@ML.AFFRC.GO.JP","MICHY@BASIC.MED.TOKUSHIMA-U.AC.JP","MIKAMIPRM","MINAKATA-KAZUHITO@KENEKI.GO.JP","MINAMI@TSURUOKA-NCT.AC.JP","MINAMI11","MINE@KOCHI-U.AC.JP","MINEGISHI","MINORU.SAWAGUCHI@LIFETECH.COM","MINOUE@MED.AKITA-U.AC.JP","MITSU_S@D6.DION.NE.JP","MITSUAKI@MD.OKAYAMA-U.AC.JP","MIURA-AJF@PREF.YAMANASHI.LG.JP","MIYAHARA@ABIOZ.CO.JP","MIYAINVI","MIYAMURA.DBIO@MRI.TMD.AC.JP","MIYASAN@SAITAMA-MED.AC.JP","MIYATAKE-SI@IGAKUKEN.OR.JP","MIYAUCHI-MASATOSHI@HOTMAIL.CO.JP","MIZUKI_SASAKI@ASAHIKAWA-MED.AC.JP","MKATAOKA","MKAWABE","M-KIHARA@SO.TAISHO.CO.JP","MKNEKO","M-KONO@MED.HOKUDAI.AC.JP","M-MATSUDA@MD.TSUKUBA.AC.JP","MOHKITA@GLY.OUPS.AC.JP","M-OKAMOTO@OIST.JP","MORIMOTO_KOYANO@CITY.NAGASAKI.LG.JP","MORIWAKI-NAOKO@KENEKI.GO.JP","MOWATANABE@S.OKAYAMA-U.AC.JP","MRIOYNG","MSHONO","MSYKTD","MTOMOMURA","MURAZAKI@AGRI.PREF.IBARAKI.JP","MYHIRO","NAGANO@NCNP.GO.JP","NAIKA125-LABO@UMIN.AC.JP","NAKABA@CC.TUAT.AC.JP","NAKAMURA-YUUKI@ZENNOH.OR.JP","NANBARA.PERI@TMD.AC.JP","NAOHIRO1226JP@YAHOO.CO.JP","NAOKAKU","NAOKI.KAMEI@LIFETECH.COM","NAOSAMU","NATSUKI_OTAKI@MAIL.ZENYAKU.CO.JP","NISHIGUTI2","NISHIMOTO-TKY@UMIN.AC.JP","NISHIYAMAYUICHIRO@Z5.KEIO.JP","N-KOBAYASHI.PERI@TMD.AC.JP","NODAIBIKEN","NORI14","NORIHO-FUKUZAWA@AIST.GO.JP","NORITAKE","NORIYASU.KANIE@ASTELLAS.COM","NSOTO714","NUNOMURA.SATOSHI@NIHON-U.AC.JP","OFUJI@MED.NIHON-U.AC.JP","OHHIRA.TAKASHI@JAXA.JP","OHMOMO","OHMORIHIRO","OHTSUN@IGM.HOKUDAI.AC.JP","OISTCMSF","OKAMOTOEMIKO1@YAHOO.CO.JP","OKAMOTOK1@SUN.AC.JP","OKAMU68@GMAIL.COM","OKAYO","OKUBO@NIHS.GO.JP","OKUHIRA","OKUHIROS@COMB.U-RYUKYU.AC.JP","OKUMURA-@ASAHIKAWA-MED.AC.JP","OMMC","OOKAWA.Y04@CITY.FUKUOKA.LG.JP","OOSHIRYH","OOZEKIMIKA@YBB.NE.JP","ORANGE-7-RYO@A6.KEIO.JP","ORGAN","ORIHA@SFC-JS.KEIO.AC.JP","ORITOK","ORTHOYANA","OSHIKAWA","OTANITOMO","OTARUQUA","OTE","PAPAKKY-HIRO@EC.HOKUDAI.AC.JP","POEM22483","POEM24374","POEM28932","POEM29973","POEM30861","POEM32960","POEM35364","POEM35522","POEM35595","POEM35862","POEM36545","POEM37093","POEM37355","POEM38334","POEM40819","POEM41818","POEM42304","POEM43043","POEM43925","POEM44798","POEM45061","POEM45341","POEM45899","POEM46139","POEM46438","POEM46593","POEM46956","POEM48984","POEM49171","POEM49639","POEM50148","POEM50362","POEM50865","POEM51933","POEM51948","PRIMER2INO","R11AKIFUSA@FA.KYU-DENT.AC.JP","RASSHI-A@BML.CO.JP","REI-CHIBA@MAIL.ZENYAKU.CO.JP","RINJI@YAMAGUCHI-U.AC.JP","R-KURAJI@TKY.NDU.AC.JP","RMUROMOTO","RUNRUNRUN","RURUNONUSI","RYOOHTA","RYUTA.YOKOGAWA@GMAIL.COM","S.SEKINE@PO.RD.TAISHO.CO.JP","S10TK011@MAIL.SAITAMA-U.AC.JP","S1306@JICHI.AC.JP","S14MB202@MAIL.SAITAMA-U.AC.JP","S301032K","S36070036B@EC.HOKUDAI.AC.JP","S4005534@GMAIL.COM","SACHIRO","SAEKI@PEGASUS.KOBE-U.AC.JP","SAITOO@FOR.AGR.HOKUDAI.AC.JP","SAITOU.YUUKO@NIHON-U.AC.JP","SAKATANM","SAKIYASAN@GMAIL.COM","SAKURAGI@BIKEN.OSAKA-U.AC.JP","SAN4659","SANGAKU@ABS.AGR.HOKUDAI.AC.JP","SANKAI","SANSYU@ABOX3.SO-NET.NE.JP","SASUGA","SATO@MIKADOKYOWA.COM","SATOMITODA","SA-TOMO@GIPC.AKITA-U.AC.JP","SATOSHI_KONDO_AA@MAIL.TOYOTA.CO.JP","SEIBUTSUYU","SEKIHARA@ABS.AGR.HOKUDAI.AC.JP","SEKITO","SHAGA","SHELIANGWANG@GMAIL.COM","SHIDOJI","SHIGERUA","SHIMBA@BMPE.K.U-TOKYO.AC.JP","SHIN.HANAKO@PREF.HOKKAIDO.LG.JP","SHINJI@BS.S.U-TOKYO.AC.JP","SHINJI-S@TOKYO-MED.AC.JP","SHINRIN0","SHINSAKU.OHTAKI@LIFETECH.COM","SHINTAN392","SHINZATO","SHIRAISHI.YOSHIO.48S@ST.KYOTO-U.AC.JP","SHIRAKI","SHIRAMOTO","SHIROAONO","SHIZUKA_ADACHI@NM.FAMIC.GO.JP","SHOHEI.NAKAMURA@OIST.JP","SHOHEI-YOSHIDA@TAIHO.CO.JP","SHUTIGER5928@GMAIL.COM","SIGHTMAR@U-FUKUI.AC.JP","SNAKAJI@MED.KOBE-U.AC.JP","SOYAKU@FP-PHARM.CO.JP","SOYAKU@FP-THARM.CO.JP","STAKASHI@SHINSHU-U.AC.JP","STATEBE","STOSHI","SUGIMORI.RAB.2014@GMAIL.COM","SUIKENOH","SUIRANKAI@NIFTY.COM","SUKIMA79RUPERT18@GMAIL.COM","SUR108@POH.OSAKA-MED.AC.JP","SURG1","SUZUKIYO@TIMES.HOSP.TSUKUBA.AC.JP","SUZUMAKO","SXJIANG","SYASUDA@MED.HOKUDAI.AC.JP","T.FUJIMURA@NIPPONHAM.CO.JP","T.SEGA.ANDESUMERON@GMAIL.COM","T2-HIHARA@HHC.EISAI.CO.JP","TACCHAN","TAK24","TAKAHASHI-CHIAKI@PREF.AKITA.LG.JP","TAKAHIDE@KANAZAWA-MED.AC.JP","TAKAHIRO_OHASHI@ZENYAKU.CO.JP","TAKASHI.ISHIKURA@LIFETECH.COM","TAKASHI_KURITA@MED.HOKUDAI.AC.JP","TAKASHIS","TAKAYUKI_SHINKAI@MEMBER.METRO.TOKYO.JP","TAKECHIYO","TAKEDA-WZJ@PREF.YAMANASHI.LG.JP","TAKUMII","TAMANO@PHARM.HOKUDAI.AC.JP","TANAKA1982","TANIAYMA","TAROAMANO","TASUGI@ALRC.TOTTORI-U.AC.JP","TD2000","TERADA-TAKASHI@KENEKI.GO.JP","TERASAWAY@AFFRC.GO.JP","TERAS-T@MD.OKAYAMA-U.AC.JP","TETSUO_SASAKI@MAIL.ZENYAKU.CO.JP","TFURU","TFURUICHI","TIGAKU","TK0611","TKOTANI","TMARUMO.NPR@GMAIL.COM","TMNIHS","TMSHINT@IPC.SHIZUOKA.AC.JP","TMU","TOEIHEI@DEM.MED.KYUSHU-U.AC.JP","TOFU717","TOHRUMINA","TOKIWA","TOKOKICK@MED.HOKUDAI.AC.JP","TOMOHARU.INOUE@OIST.JP","TOMOHITO.WAUKE@OIST.JP","TOMOKO.SUNAYAMA@LIFETECH.COM","TOMOKO.YAMAZAKI@OIST.JP","TOMOKOOH","TOSAKI","TOS-HARA@SO.TAISHO.CO.JP","TOSHIFUMI_KOBAYSHI@MAIL.ZENYAKU.CO.JP","TOSHIN","TSATOH@BURNHAM.ORG","T-SAWAMURA@KOBE-TOKIWA.AC.JP","TSUKAHARA@KYOTO-INP.CC","TSUNEJI.SUZUKI@MITSUI-CHEM.CO.JP","TSUSA@MED.TEIKYO-U.AC.JP","TSUYO-OBA@PREF.AKITA.LG.JP","TTAKAHARA@LIFE.SHIMANE-U.AC.JP","TTAMAKI.MFA@TMD.AC.JP","TYKHIROI@OBIHIRO.AC.JP","T-YOSHI@KIUI.AC.JP","UCHIDA22","UCHIDA-AMVN@PREF.YAMANASHI.LG.JP","UCHIO_RYUSEI@HOUSE-WF.CO.JP","UCHIYA@LIFE.BIOLOGY.TOHOKU.AC.JP","UEDA.S.AC@M.TITECH.AC.JP","UEHARA","UEKI-YO529@PREF.MIYAGI.JP","UGAPRIMER","ULANOVA@KOCHI-U.AC.JP","U-MOTO@MED.HOKUDAI.AC.JP","URAKAWA","URMEDGENET","USER462368","V.MESHCHERYAKOV@OIST.JP","WATANABE@IST.HOKUDAI.AC.JP","WEI@MIKADOKYOWA.COM","XRAY","YADAT168","YAKKOU1","YAMAGUTI@DOKKYOMED.AC.JP","YAMAJUN","YAMALAB","YAMAMOTO.YUSUKE.87N@ST.KYOTO-U.AC.JP","YAMAMOTO@JINDAI.AC.JP","YAMAMO-Y@TOKYO-MED.AC.JP","YASAIGATABETAI21@YAHOO.CO.JP","YASAISEI","YASHIRO-YUICHI@TSURUMI-U.AC.JP","YASU0331@BIOREG.KYUSHU-U.AC.JP","YASUKE8499","YHAYASHI@IMS.U-TOKYO.CO.JP","Y-KASAHA@LOWTEM.HOKUDAI.AC.JP","YKJMAX","YKOMIYA@AGR.KYUSHU-U.AC.JP","Y-MIYAZAKI@DENT.MEIKAI.AC.JP","YOHASE@IWT.AKITA-PU.AC.JP","YOHASHI@EC.HOKUDAI.AC.JP","YOKONAGA","YOKS","YONAGATA","YOSHI.TSUKAMOTO@ME.COM","YOSHIHARU.TERAO@MIKADOKYOWASEED.COM","YOSHIMA","YUI1783@YOKOHAMA-CU.AC.JP","YUICHI.NAKAJIMA@OIST.JP","YUICHIRO@AFFRC.GO.JP","YUJI_NAKAJIMA@MHI.CO.JP","YUKATO","YUKI.YASUOKA@OIST.JP","YUKIKO_KATO@KIRIN.CO.JP","YU-KITAI@PHARM.HOKUDAI.AC.JP","YUKO_NAGATA@MAIL.ZENYAKU.CO.JP","YUKUSATO","YUNA.ZAYASU@OIST.JP","YUUSUKE_II@NM.FAMIC.GO.JP","ZACH.HENSEL@OIST.JP","0713AKANE@I.SOFTBANK.JP","0909MFS@TMD.AC.JP","1027MASA","155504","217777","22532","24","2NOUKOUDAI","3524","4889094","5701","6324","721861","8120003","A.MURATA@OMMC-HP.JP","A000083Y","A0067040","ABEABE1201@GMAIL.COM","AC124806@EDU.OKINAWA-CT.AC.JP","AG123D14@DPC.AGU.AC.JP","AHASHIMO@MED.HOKUDAI.AC.JP","AICHIMURA@MED.TOHOKU.AC.JP","AIHARAH","AIKOAO@GMAIL.COM","AIRI_HARA@MAIL.ZENYAKU.CO.JP","AKAHANE-KEISUKE@KENEKI.GO.JP","AKAMA@LIFE.SHIMANE-U.AC.JP","AKANE.KATO@BO.RD.TAISHO.CO.JP","AKASE@YOKOHAMA-CU.AC.JP","AKASHI-ST-ZENIGATA@EC.HOKUDAI.AC.JP","AKIHIKO_KUBOTA1@HOTMAIL.COM","AKIHITO@MAIL.SAITAMA-U.AC.JP","AKIKO-HIRAO@TSURUOKA-NCT.AC.JP","AKIKOMD","AKINOBU@BIOREG.KYUSHU-U.AC.JP","AKIRA.YOKOFUJI@SNOWSEED.CO.JP","AKITA@AGR.EHIME-U.AC.JP","AKITA@SCI.HOKUDAI.AC.JP","AKOTAM","ARAI.TAKASHI.BN@PREF.SAITAMA.LG.JP","ARAIC","ARAI-TOMOKO@SPU.AC.JP","ARAKI@FISH.KAGOSHIMA-U.AC.JP","ASADBIO","ASAMA","ASANOYASUO","ASASAKI","ATAISHI@MAIL.ECC.U-TOKYO.AC.JP","ATAMAI","ATOMOMU","ATSUSHIIDE","AY","AZAMAY@PREF.OKINAWA.LG.JP","AZMACCI","BANDOU@ONO.CO.JP","BBGLMAA@GMAIL.COM","BIOJETOK@GMAIL.COM","BISEIBUTU","BLACKMANTA","BUSCOPAN","C.STARZYNSKI@OIST.JP","CHENJ1984JP@JICHI.AC.JP","CHIBAUKOGE","CHICHI@ASAHIKAWA-MED.AC.JP","CHIMICCO","CHUAN_ZHAO.WEI@MIKADOKYOWASEED.COM","CHUJO@HOKU-IRYO-U.AC.JP","CIEA4477","COCACOTA@HOTMAIL.CO.JP","CSBARKER","CXU00133","D.YAMAMOTO@PO.RD.TAISHO.CO.JP","D752415","DAICHI241YAKULT@EC.HOKUDAI.AC.JP","DAMEDEZ","DATE","DATELAB","DEGZAN0330@GMAIL.COM","DEREKGOTO@ME.COM","DNASTAR","DRPE059@NDMC.AC.JP","DWONK","E13KTOSHIHIKO@YAHOO.CO.JP","EBINE@BIOL.S.U-TOKYO.AC.JP","EBISAWA","EFUKUDA@HIROSHIMA-U.AC.JP","EISEI2132","ELEMENTL425@YAHOO.CO.JP","EMMA@REHA.KOBEGAKUIN.AC.JP","EMURAKO@YAHOO.CO.JP","ENYA0701","ETSUKO","FITOUR@DNH.TWMU.AC.JP","FNAKATAN@NCC.GO.JP","FUJIOKA","FULLMOON","FUSOFUSO","FUTAMATA","GENYAMA77@YAHOO.CO.JP","GIHUSHIGE","GOOGAWA","GOTOK@MED.TEIKYO-U.AC.JP","GROSSMANN.MARY@GMAIL.COM","H136342@COMB.U-RYUKYU.AC.JP","H-ADACHI@SO.TAISHO.CO.JP","HARACHNOPHOBIA@GMAIL.COM","HARADA-H@CITY.IWAKI.FUKUSHIMA.JP","HARAMOTO","HARRYWESTJPJP@YAHOO.CO.JP","HASHIDA@ANGEL.OCN.NE.JP","HASHIMOT@MED.HOKUDAI.AC.JP","HAYASAKI@FUKSI-KAGK-U.AC.JP","HAZIME-AMANO@CITY.YOKOSUKA.KANAGAWA.JP","HI.YOSHIMURA@PO.RD.TAISHO.CO.JP","HIDEISHI@CC.TUAT.AC.JP","HIKARU.TAIRA@LIFETECH.COM","HINABE@AFFRC.GO.JP","HIRAKI@JICHI.AC.JP","HIRANODNA","HIRAYAMA.DBIO@MRI.TMD.AC.JP","HIROAKI-OCHIIWA@TAIHO.CO.JP","HIROIHIRO","HIROISSAN","HIROKO-NAKAI@HOUSE-WF.CO.JP","HIROSHIMA-KENEKI@KENEKI.GO.JP","HIROSHIOMI","HIROTO@IGM.HOKUDAI.AC.JP","HIROYOSHI","HISASUE@AZABU-U.AC.JP","HITOSHI_MIYASHITA@MAIL.ZENYAKU.CO.JP","HKAGAMI","HKANZAWA@KAHAKU.GO.JP","HKITAJOSAI","HKOBA@AGRI.PREF.IBARAKI.JP","HKOHZAKI","HMANO@VIRUS.KYOTO-U.AC.JP","HMASHIMA","HMINAMI","HNAKATSU","HOKUSHOKU1","HORII@PSC.RIKEN.JP","HOZUMIM","HSS0001947","I8DU4EPD","IBES@KOBAL.CO.JP","IBUKI415@YOKOHAMA-CU.AC.JP","ICHI.IKUYO@OCHA.AC.JP","ICHIMIYA","ICHINOSE@OITA-NHS.AC.JP","IGARASHI@MED.KAGAWA-U.AC.JP","IGARASHI@NIHS.GO.JP","IGEI-HIDETOSHI@KENEKI.GO.JP","IIDABASHI2011@YAHOO.CO.JP","IKEDASH@KAIS.KYOTO-U.AC.JP","IKEMATSU@OKINAWA-CT.AC.JP","IKENAGA-AHFT@PREF.YAMANASHI.LG.JP","IMASAYUKI","IN1329@POH.OSAKA-MED.AC.JP","INAGACCHA","I-NAKAMURA@ACCREDO.CO.JP","IRINA@OIST.JP","ISHIDA-KEIICHI@KENEKI.GO.JP","ISHIHARA-TM@PHA.KEIO.AC.JP","ISHII","ISLET","ITA4003@YAHOO.CO.JP","ITOTAKAKUN77777@GMAIL.COM","ITOU-TETSUYA@ZENNOH.OR.JP","IWAMI@ES.MEISEI-U.AC.JP","IWATSUKI.DBIO@MRI.TMD.AC.JP","IZUMIYA","J111602","J6409063@ED.TUS.AC.JP","JAI.DENTON@OIST.JP","JANUS","JIRO.UCHIDA@LIFETECH.COM","J-NISHI@RIQL.CO.JP","J-SAKAGAMI@SO.TAISHO.CO.JP","JUNKO-YAMAGUTI@CITY.YOKOSUKA.KANAGAWA.JP","JUNMIYATA@HOTMAIL.CO.JP","JUNNOSUKE","KAHTZEN@GMAIL.COM","KAIBOU2","KAKAPOST@LIVE.COM","KAMEI","KAMIIE@AZABU-U.AC.JP","KAMIKAWA-MAI@ZENNOH.OR.JP","KAMINAKA@MUSES.TOTTORI-U.AC.JP","KAMINUMA-OS@IGAKUKEN.OR.JP","KANDA@MED.HOKUDAI.AC.JP","KANEMAKI@AZABU-U.AC.JP","KANIKANI3","KANKYOKENSA@CITY.HIGASHIOSAKA.LG.JP","KARIKARIADO@DOCOMO.NE.JP","KASHIHARA","KASHITOS@SHINSHU-U.AC.JP","KATOTATU7@MSN.COM","KATSUYOSHI.T@H5.DION.NE.JP","KAWA3","KAWADAM@KUHP.KYOTO-U.AC.JP","KAZUHIRO.FUKUMURA@LIFETECH.COM","KAZUK","KAZUMA1203","KAZUSHIRO","KAZUTAKA_ODA@MAIL.ZENYAKU.CO.JP","KEIKOSAN","KEIM@YOKOHAMA-CU.AC.JP","KEISUKE@OIST.JP","KHIRANO@SOKA.AC.JP","KIKIKI","KIKUE@OMMC-HP.JP","KIMURA-SH883@PREF.MIYAGI.JP","KIRYU@OMTRI.OR.JP","KKANKI","KKOUDA@PPMX.COM","KMIYAMO@WAKA.KINDAI.AC.JP","KO-1-RO@A6.KEIO.JP","KOBAYASHI-AMVK@PREF.YAMANASHI.LG.JP","KOGE_EXP@CHIBA-U.JP","KOHARA-MC@IGAKUKEN.OR.JP","KOHARA-SAKAE@SNBL.CO.JP","KOMATSUAKI@OFFICE.CHIBA-U.JP","KOSUKESAITO@AKANE.WASEDA.JP","KOTARO@RIKEN.JP","KSNYM@CHEM.AGR.HOKUDAI.AC.JP","KSUZAWA@YAHOO.CO.JP","K-TSUTA@TAIHO.CO.JP","KUBO-AKIKO@GLICO.CO.JP","KUBOTA@MED.HOKUDAI.AC.JP","KUNAPIPI.PI@GMAIL.COM","K-YAMA@HAMA-MED.AC.JP","KYANHSKO","KYN@AETERNUS.JP","KYO.AZUMA@LIFETECH.COM","KYOKO_SHINOHARA@DEN.HOKUDAI.AC.JP","KYOKO_WADA@MHI.CO.JP","KYOMOE909@YAHOO.CO.JP","KYOSHI@NAGASAKI-U.AC.JP","KZHR.IMAMURA@GMAIL.COM","LISANONAKA","M.KAJITA@IGM.HOKUDAI.AC.JP","M.TERASHIMA@LOWTEM.HOKUDAI.AC.JP","M11702025@GUNMA-U.AC.JP","MA120003@TMD.AC.JP","MADOKA1_ITO@PREF.SHIZUOKA.LG.JP","MAKI.OYAMA@MIKADOKYOWASEED.COM","MAKIKO_USHIMIZU@CITY.SENDAI.JP","MAKOTOKATO","MAKOTOMAKO","MA-MIYOSHI@SO.TAISHO.CO.JP","MANNEN@OITA-U.AC.JP","MARIMO.KASHIMURA@MIKADOKYOWASEED.COM","MAS3086","MASADA@NIHS.GO.JP","MASAKAZU_NAGAMINE@MAIL.ZENYAKU.CO.JP","MASAKO@AZABU-U.AC.JP","MASA-UMI.PSYC@TMD.AC.JP","MASUDA@PHAR.KYUSHU-U.AC.JP","MATSUMOTO@MED.KITASATO-U.AC.JP","MATSUURA@OITA-U.AC.JP","MATSUZAKI","MATSUZAWA.MASAZUMI@GMAIL.COM","MAYU@DOKKYOMED.AC.JP","MD11068@SHIBAURA-IT.AC.JP","MEMURO_YOUDO@ML.AFFRC.GO.JP","MICHY@BASIC.MED.TOKUSHIMA-U.AC.JP","MIKAMIPRM","MINAKATA-KAZUHITO@KENEKI.GO.JP","MINAMI@TSURUOKA-NCT.AC.JP","MINAMI11","MINE@KOCHI-U.AC.JP","MINEGISHI","MINORU.SAWAGUCHI@LIFETECH.COM","MINOUE@MED.AKITA-U.AC.JP","MITSU_S@D6.DION.NE.JP","MITSUAKI@MD.OKAYAMA-U.AC.JP","MIURA-AJF@PREF.YAMANASHI.LG.JP","MIYAHARA@ABIOZ.CO.JP","MIYAINVI","MIYAMURA.DBIO@MRI.TMD.AC.JP","MIYASAN@SAITAMA-MED.AC.JP","MIYATAKE-SI@IGAKUKEN.OR.JP","MIYAUCHI-MASATOSHI@HOTMAIL.CO.JP","MIZUKI_SASAKI@ASAHIKAWA-MED.AC.JP","MKATAOKA","MKAWABE","M-KIHARA@SO.TAISHO.CO.JP","MKNEKO","M-KONO@MED.HOKUDAI.AC.JP","M-MATSUDA@MD.TSUKUBA.AC.JP","MOHKITA@GLY.OUPS.AC.JP","M-OKAMOTO@OIST.JP","MORIMOTO_KOYANO@CITY.NAGASAKI.LG.JP","MORIWAKI-NAOKO@KENEKI.GO.JP","MOWATANABE@S.OKAYAMA-U.AC.JP","MRIOYNG","MSHONO","MSYKTD","MTOMOMURA","MURAZAKI@AGRI.PREF.IBARAKI.JP","MYHIRO","NAGANO@NCNP.GO.JP","NAIKA125-LABO@UMIN.AC.JP","NAKABA@CC.TUAT.AC.JP","NAKAMURA-YUUKI@ZENNOH.OR.JP","NANBARA.PERI@TMD.AC.JP","NAOHIRO1226JP@YAHOO.CO.JP","NAOKAKU","NAOKI.KAMEI@LIFETECH.COM","NAOSAMU","NATSUKI_OTAKI@MAIL.ZENYAKU.CO.JP","NISHIGUTI2","NISHIMOTO-TKY@UMIN.AC.JP","NISHIYAMAYUICHIRO@Z5.KEIO.JP","N-KOBAYASHI.PERI@TMD.AC.JP","NODAIBIKEN","NORI14","NORIHO-FUKUZAWA@AIST.GO.JP","NORITAKE","NORIYASU.KANIE@ASTELLAS.COM","NSOTO714","NUNOMURA.SATOSHI@NIHON-U.AC.JP","OFUJI@MED.NIHON-U.AC.JP","OHHIRA.TAKASHI@JAXA.JP","OHMOMO","OHMORIHIRO","OHTSUN@IGM.HOKUDAI.AC.JP","OISTCMSF","OKAMOTOEMIKO1@YAHOO.CO.JP","OKAMOTOK1@SUN.AC.JP","OKAMU68@GMAIL.COM","OKAYO","OKUBO@NIHS.GO.JP","OKUHIRA","OKUHIROS@COMB.U-RYUKYU.AC.JP","OKUMURA-@ASAHIKAWA-MED.AC.JP","OMMC","OOKAWA.Y04@CITY.FUKUOKA.LG.JP","OOSHIRYH","OOZEKIMIKA@YBB.NE.JP","ORANGE-7-RYO@A6.KEIO.JP","ORGAN","ORIHA@SFC-JS.KEIO.AC.JP","ORITOK","ORTHOYANA","OSHIKAWA","OTANITOMO","OTARUQUA","OTE","PAPAKKY-HIRO@EC.HOKUDAI.AC.JP","POEM22483","POEM24374","POEM28932","POEM29973","POEM30861","POEM32960","POEM35364","POEM35522","POEM35595","POEM35862","POEM36545","POEM37093","POEM37355","POEM38334","POEM40819","POEM41818","POEM42304","POEM43043","POEM43925","POEM44798","POEM45061","POEM45341","POEM45899","POEM46139","POEM46438","POEM46593","POEM46956","POEM48984","POEM49171","POEM49639","POEM50148","POEM50362","POEM50865","POEM51933","POEM51948","PRIMER2INO","R11AKIFUSA@FA.KYU-DENT.AC.JP","RASSHI-A@BML.CO.JP","REI-CHIBA@MAIL.ZENYAKU.CO.JP","RINJI@YAMAGUCHI-U.AC.JP","R-KURAJI@TKY.NDU.AC.JP","RMUROMOTO","RUNRUNRUN","RURUNONUSI","RYOOHTA","RYUTA.YOKOGAWA@GMAIL.COM","S.SEKINE@PO.RD.TAISHO.CO.JP","S10TK011@MAIL.SAITAMA-U.AC.JP","S1306@JICHI.AC.JP","S14MB202@MAIL.SAITAMA-U.AC.JP","S301032K","S36070036B@EC.HOKUDAI.AC.JP","S4005534@GMAIL.COM","SACHIRO","SAEKI@PEGASUS.KOBE-U.AC.JP","SAITOO@FOR.AGR.HOKUDAI.AC.JP","SAITOU.YUUKO@NIHON-U.AC.JP","SAKATANM","SAKIYASAN@GMAIL.COM","SAKURAGI@BIKEN.OSAKA-U.AC.JP","SAN4659","SANGAKU@ABS.AGR.HOKUDAI.AC.JP","SANKAI","SANSYU@ABOX3.SO-NET.NE.JP","SASUGA","SATO@MIKADOKYOWA.COM","SATOMITODA","SA-TOMO@GIPC.AKITA-U.AC.JP","SATOSHI_KONDO_AA@MAIL.TOYOTA.CO.JP","SEIBUTSUYU","SEKIHARA@ABS.AGR.HOKUDAI.AC.JP","SEKITO","SHAGA","SHELIANGWANG@GMAIL.COM","SHIDOJI","SHIGERUA","SHIMBA@BMPE.K.U-TOKYO.AC.JP","SHIN.HANAKO@PREF.HOKKAIDO.LG.JP","SHINJI@BS.S.U-TOKYO.AC.JP","SHINJI-S@TOKYO-MED.AC.JP","SHINRIN0","SHINSAKU.OHTAKI@LIFETECH.COM","SHINTAN392","SHINZATO","SHIRAISHI.YOSHIO.48S@ST.KYOTO-U.AC.JP","SHIRAKI","SHIRAMOTO","SHIROAONO","SHIZUKA_ADACHI@NM.FAMIC.GO.JP","SHOHEI.NAKAMURA@OIST.JP","SHOHEI-YOSHIDA@TAIHO.CO.JP","SHUTIGER5928@GMAIL.COM","SIGHTMAR@U-FUKUI.AC.JP","SNAKAJI@MED.KOBE-U.AC.JP","SOYAKU@FP-PHARM.CO.JP","SOYAKU@FP-THARM.CO.JP","STAKASHI@SHINSHU-U.AC.JP","STATEBE","STOSHI","SUGIMORI.RAB.2014@GMAIL.COM","SUIKENOH","SUIRANKAI@NIFTY.COM","SUKIMA79RUPERT18@GMAIL.COM","SUR108@POH.OSAKA-MED.AC.JP","SURG1","SUZUKIYO@TIMES.HOSP.TSUKUBA.AC.JP","SUZUMAKO","SXJIANG","SYASUDA@MED.HOKUDAI.AC.JP","T.FUJIMURA@NIPPONHAM.CO.JP","T.SEGA.ANDESUMERON@GMAIL.COM","T2-HIHARA@HHC.EISAI.CO.JP","TACCHAN","TAK24","TAKAHASHI-CHIAKI@PREF.AKITA.LG.JP","TAKAHIDE@KANAZAWA-MED.AC.JP","TAKAHIRO_OHASHI@ZENYAKU.CO.JP","TAKASHI.ISHIKURA@LIFETECH.COM","TAKASHI_KURITA@MED.HOKUDAI.AC.JP","TAKASHIS","TAKAYUKI_SHINKAI@MEMBER.METRO.TOKYO.JP","TAKECHIYO","TAKEDA-WZJ@PREF.YAMANASHI.LG.JP","TAKUMII","TAMANO@PHARM.HOKUDAI.AC.JP","TANAKA1982","TANIAYMA","TAROAMANO","TASUGI@ALRC.TOTTORI-U.AC.JP","TD2000","TERADA-TAKASHI@KENEKI.GO.JP","TERASAWAY@AFFRC.GO.JP","TERAS-T@MD.OKAYAMA-U.AC.JP","TETSUO_SASAKI@MAIL.ZENYAKU.CO.JP","TFURU","TFURUICHI","TIGAKU","TK0611","TKOTANI","TMARUMO.NPR@GMAIL.COM","TMNIHS","TMSHINT@IPC.SHIZUOKA.AC.JP","TMU","TOEIHEI@DEM.MED.KYUSHU-U.AC.JP","TOFU717","TOHRUMINA","TOKIWA","TOKOKICK@MED.HOKUDAI.AC.JP","TOMOHARU.INOUE@OIST.JP","TOMOHITO.WAUKE@OIST.JP","TOMOKO.SUNAYAMA@LIFETECH.COM","TOMOKO.YAMAZAKI@OIST.JP","TOMOKOOH","TOSAKI","TOS-HARA@SO.TAISHO.CO.JP","TOSHIFUMI_KOBAYSHI@MAIL.ZENYAKU.CO.JP","TOSHIN","TSATOH@BURNHAM.ORG","T-SAWAMURA@KOBE-TOKIWA.AC.JP","TSUKAHARA@KYOTO-INP.CC","TSUNEJI.SUZUKI@MITSUI-CHEM.CO.JP","TSUSA@MED.TEIKYO-U.AC.JP","TSUYO-OBA@PREF.AKITA.LG.JP","TTAKAHARA@LIFE.SHIMANE-U.AC.JP","TTAMAKI.MFA@TMD.AC.JP","TYKHIROI@OBIHIRO.AC.JP","T-YOSHI@KIUI.AC.JP","UCHIDA22","UCHIDA-AMVN@PREF.YAMANASHI.LG.JP","UCHIO_RYUSEI@HOUSE-WF.CO.JP","UCHIYA@LIFE.BIOLOGY.TOHOKU.AC.JP","UEDA.S.AC@M.TITECH.AC.JP","UEHARA","UEKI-YO529@PREF.MIYAGI.JP","UGAPRIMER","ULANOVA@KOCHI-U.AC.JP","U-MOTO@MED.HOKUDAI.AC.JP","URAKAWA","URMEDGENET","USER462368","V.MESHCHERYAKOV@OIST.JP","WATANABE@IST.HOKUDAI.AC.JP","WEI@MIKADOKYOWA.COM","XRAY","YADAT168","YAKKOU1","YAMAGUTI@DOKKYOMED.AC.JP","YAMAJUN","YAMALAB","YAMAMOTO.YUSUKE.87N@ST.KYOTO-U.AC.JP","YAMAMOTO@JINDAI.AC.JP","YAMAMO-Y@TOKYO-MED.AC.JP","YASAIGATABETAI21@YAHOO.CO.JP","YASAISEI","YASHIRO-YUICHI@TSURUMI-U.AC.JP","YASU0331@BIOREG.KYUSHU-U.AC.JP","YASUKE8499","YHAYASHI@IMS.U-TOKYO.CO.JP","Y-KASAHA@LOWTEM.HOKUDAI.AC.JP","YKJMAX","YKOMIYA@AGR.KYUSHU-U.AC.JP","Y-MIYAZAKI@DENT.MEIKAI.AC.JP","YOHASE@IWT.AKITA-PU.AC.JP","YOHASHI@EC.HOKUDAI.AC.JP","YOKONAGA","YOKS","YONAGATA","YOSHI.TSUKAMOTO@ME.COM","YOSHIHARU.TERAO@MIKADOKYOWASEED.COM","YOSHIMA","YUI1783@YOKOHAMA-CU.AC.JP","YUICHI.NAKAJIMA@OIST.JP","YUICHIRO@AFFRC.GO.JP","YUJI_NAKAJIMA@MHI.CO.JP","YUKATO","YUKI.YASUOKA@OIST.JP","YUKIKO_KATO@KIRIN.CO.JP","YU-KITAI@PHARM.HOKUDAI.AC.JP","YUKO_NAGATA@MAIL.ZENYAKU.CO.JP","YUKUSATO","YUNA.ZAYASU@OIST.JP","YUUSUKE_II@NM.FAMIC.GO.JP","ZACH.HENSEL@OIST.JP"
		};
		
		/*System.out.println("array elements="+array.length);*/
		Set <String> set = new HashSet<String>();
		for(int i=0;i<array.length ;i++){
			set.add(array[i]);
		}
		/*System.out.println("set elements ="+set.size());
		System.out.println(set);*/
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println("'"+it.next()+"'");
		}
	}

}
