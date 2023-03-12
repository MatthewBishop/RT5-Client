import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends GameShell {

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "Lclient!rt;")
	public static final Class209 MODE_ENV_LIVE = new Class209("LIVE", 0);
	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!rt;")
	public static final Class209 MODE_ENV_RC = new Class209("RC", 1);
	@OriginalMember(owner = "client!us", name = "T", descriptor = "Lclient!rt;")
	public static final Class209 MODE_ENV_WIP = new Class209("WIP", 2);
	@OriginalMember(owner = "client!of", name = "u", descriptor = "Lclient!dn;")
	public static final Class50 GAME_RS = new Class50("runescape", 0);
	@OriginalMember(owner = "client!fu", name = "P", descriptor = "Lclient!dn;")
	public static final Class50 GAME_SD = new Class50("stellardawn", 1);
	@OriginalMember(owner = "client!nf", name = "q", descriptor = "Lclient!kk;")
	public static final Class127 MODE_WHERE_LOCAL = new Class127("LOCAL", 4);
	@OriginalMember(owner = "client!ks", name = "b", descriptor = "Lclient!kk;")
	public static final Class127 MODE_WHERE_LIVE = new Class127("LIVE", 0);
	@OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
	public static int worldListWorldId = 1;
	@OriginalMember(owner = "client!lq", name = "I", descriptor = "Lclient!rt;")
	public static Class209 modeWhat;
	@OriginalMember(owner = "client!r", name = "M", descriptor = "I")
	public static int language = 0;
	@OriginalMember(owner = "client!ts", name = "r", descriptor = "Lclient!dn;")
	public static Class50 game = null;
	@OriginalMember(owner = "client!ie", name = "q", descriptor = "Lclient!client;")
	public static client instance;
	@OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
	public static int affiliate = 0;
	@OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
	public static int worldId = -1;
	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Ljava/lang/String;")
	public static String hostname;
	@OriginalMember(owner = "client!gu", name = "y", descriptor = "Lclient!kk;")
	public static Class127 modeWhere;
	@OriginalMember(owner = "client!as", name = "d", descriptor = "I")
	public static int alternatePort;
	@OriginalMember(owner = "client!td", name = "O", descriptor = "I")
	public static int defaultPort;
	@OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
	public static int port;
	@OriginalMember(owner = "client!dj", name = "cb", descriptor = "Ljava/lang/String;")
	public static String worldListHostname;
	@OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
	public static int worldListPort;
	@OriginalMember(owner = "client!rm", name = "n", descriptor = "Lclient!tg;")
	public static Class221 musicChannel;
	@OriginalMember(owner = "client!kt", name = "Z", descriptor = "Lclient!tg;")
	public static Class221 soundChannel;
	@OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
	public static int worldListDefaultPort;
	@OriginalMember(owner = "client!bu", name = "J", descriptor = "I")
	public static int worldListAlternatePort;
	@OriginalMember(owner = "client!tr", name = "h", descriptor = "Lclient!r;")
	public static Class197 jsArchive0;
	@OriginalMember(owner = "client!bt", name = "F", descriptor = "Lclient!r;")
	public static Class197 jsArchive1;
	@OriginalMember(owner = "client!qo", name = "b", descriptor = "Lclient!r;")
	public static Class197 jsArchive2;
	@OriginalMember(owner = "client!un", name = "H", descriptor = "Lclient!r;")
	public static Class197 jsArchive3;
	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Lclient!r;")
	public static Class197 jsArchive4;
	@OriginalMember(owner = "client!qm", name = "Q", descriptor = "Lclient!r;")
	public static Class197 jsArchive5;
	@OriginalMember(owner = "client!fo", name = "h", descriptor = "Lclient!r;")
	public static Class197 jsArchive6;
	@OriginalMember(owner = "client!nl", name = "i", descriptor = "Lclient!r;")
	public static Class197 jsArchive7;
	@OriginalMember(owner = "client!bo", name = "e", descriptor = "Lclient!r;")
	public static Class197 jsArchive8;
	@OriginalMember(owner = "client!sq", name = "r", descriptor = "Lclient!r;")
	public static Class197 jsArchive9;
	@OriginalMember(owner = "client!ef", name = "A", descriptor = "Lclient!r;")
	public static Class197 jsArchive10;
	@OriginalMember(owner = "client!mm", name = "j", descriptor = "Lclient!r;")
	public static Class197 jsArchive11;
	@OriginalMember(owner = "client!lg", name = "c", descriptor = "Lclient!r;")
	public static Class197 jsArchive12;
	@OriginalMember(owner = "client!ol", name = "e", descriptor = "Lclient!r;")
	public static Class197 jsArchive13;
	@OriginalMember(owner = "client!hl", name = "D", descriptor = "Lclient!r;")
	public static Class197 jsArchive14;
	@OriginalMember(owner = "client!gs", name = "n", descriptor = "Lclient!r;")
	public static Class197 jsArchive15;
	@OriginalMember(owner = "client!wq", name = "m", descriptor = "Lclient!r;")
	public static Class197 jsArchive16;
	@OriginalMember(owner = "client!na", name = "U", descriptor = "Lclient!r;")
	public static Class197 jsArchive17;
	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Lclient!r;")
	public static Class197 jsArchive18;
	@OriginalMember(owner = "client!dj", name = "eb", descriptor = "Lclient!r;")
	public static Class197 jsArchive19;
	@OriginalMember(owner = "client!hs", name = "y", descriptor = "Lclient!r;")
	public static Class197 jsArchive20;
	@OriginalMember(owner = "client!k", name = "G", descriptor = "Lclient!r;")
	public static Class197 jsArchive21;
	@OriginalMember(owner = "client!qt", name = "v", descriptor = "Lclient!r;")
	public static Class197 jsArchive22;
	@OriginalMember(owner = "client!wo", name = "M", descriptor = "Lclient!r;")
	public static Class197 jsArchive23;
	@OriginalMember(owner = "client!wi", name = "z", descriptor = "Lclient!r;")
	public static Class197 jsArchive24;
	@OriginalMember(owner = "client!hs", name = "w", descriptor = "Lclient!r;")
	public static Class197 jsArchive25;
	@OriginalMember(owner = "client!nj", name = "i", descriptor = "Lclient!r;")
	public static Class197 jsArchive26;
	@OriginalMember(owner = "client!dj", name = "db", descriptor = "Lclient!r;")
	public static Class197 jsArchive27;
	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!r;")
	public static Class197 jsArchive28;
	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljava/lang/String;")
	public static String settings = null;
	@OriginalMember(owner = "client!mo", name = "c", descriptor = "Lclient!pe;")
	public static Class177_Sub1 preferences;
	@OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
	public static int cycle = 0;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] args) {
		try {
			if (args.length == 4) {
				worldListWorldId = Integer.parseInt(args[0]);

				if (args[1].equals("live")) {
					modeWhat = MODE_ENV_LIVE;
				} else if (args[1].equals("rc")) {
					modeWhat = MODE_ENV_RC;
				} else if (args[1].equals("wip")) {
					modeWhat = MODE_ENV_WIP;
				} else {
					printUsage("modewhat");
				}

				language = Static25.method860(args[2]);
				if (language == -1) {
					if (args[2].equals("english")) {
						language = 0;
					} else if (args[2].equals("german")) {
						language = 1;
					} else {
						printUsage("language");
					}
				}

				if (args[3].equals("game0")) {
					game = GAME_RS;
				} else if (args[3].equals("game1")) {
					game = GAME_SD;
				} else {
					printUsage("game");
				}
			} else {
				// default arguments "1 live english game0"
				worldListWorldId = 1;
				modeWhat = MODE_ENV_LIVE;
				language = 0;
				game = GAME_RS;
			}

			modeWhere = MODE_WHERE_LOCAL;
			Static237.objectTag = false;
			Static276.javaScript = false;
			Static320.anInt6007 = 0;
			Static31.aBoolean68 = true;
			MouseRecorder.enabled = true;
			settings = "";
			affiliate = 0;
			Static64.anInt1555 = game.anInt1553;

			@Pc(131) client c = new client();
			instance = c;
			c.startApplication(game.aString15, modeWhat.method5282() + 32);
			GameShell.frame.setLocation(40, 40);
		} catch (@Pc(154) Exception ex) {
			Static262.report(ex, null);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void printUsage(@OriginalArg(0) String thing) {
		System.out.println("Bad " + thing + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!bt;B)V")
	public static void writeUid(@OriginalArg(0) Buffer arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static317.aClass205_6 != null) {
			@Pc(20) int local20;
			try {
				Static317.aClass205_6.method5214(0L);
				Static317.aClass205_6.method5220(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.pdata(local8, 24);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
	public static void reset() {
		jsArchive2.anInt5558 = 1;
		instance.method1382();
		Static242.aBoolean306 = true;
		Static343.aBoolean431 = true;
		Static4.method77();
		Protocol.outboundBuffer.pos = 0;
		Static86.anInt1870 = 0;
		Protocol.packet = null;
		Protocol.packet1 = null;
		Protocol.packet3 = null;
		Protocol.anInt4955 = 0;
		Protocol.inboundBuffer.pos = 0;
		Static151.anInt2773 = 0;
		Protocol.packet2 = null;
		for (@Pc(4365) int local4365 = 0; local4365 < Static50.aClass84Array1.length; local4365++) {
			Static50.aClass84Array1[local4365] = null;
		}
		for (@Pc(4383) int local4383 = 0; local4383 < 100; local4383++) {
			Static88.aStringArray13[local4383] = null;
		}
		Static14.anInt327 = (int) (Math.random() * 110.0D) - 55;
		Static97.anInt2005 = (int) (Math.random() * 30.0D) - 20;
		Static243.anInt4503 = 0;
		Static330.aBoolean419 = false;
		Static277.aFloat67 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static24.anInt642 = (int) (Math.random() * 100.0D) - 50;
		Static226.anInt4016 = 0;
		Static6.anInt158 = (int) (Math.random() * 120.0D) - 60;
		Static53.anInt3966 = (int) (Math.random() * 80.0D) - 40;
		Static254.method4372();
		for (@Pc(4448) int local4448 = 0; local4448 < 2048; local4448++) {
			Static12.aClass11_Sub5_Sub2_Sub1Array1[local4448] = null;
		}
		NpcList.size = 0;
		for (@Pc(4464) int local4464 = 0; local4464 < 32768; local4464++) {
			NpcList.npcs[local4464] = null;
		}
		Static332.aClass135_38.method3544();
		Static129.aClass135_20.method3544();
		Static284.aClass36_7.method1416();
		Static120.aClass4_49.method81();
		Static207.aClass135_26 = new Class135();
		Static235.anInt3363 = 0;
		Static384.anInt7178 = 0;
		Static214.aClass226_1.method5781();
		Static252.method4363();
		Static236.anInt4309 = 0;
		Static254.anInt4698 = 0;
		Static123.anInt2420 = 0;
		Static359.anInt6702 = 0;
		Static348.anInt6446 = 0;
		Static311.anInt5810 = 0;
		Static57.anInt1464 = 0;
		Static19.anInt535 = 0;
		Static180.anInt3404 = 0;
		Static33.anInt4463 = 0;
		for (@Pc(4521) int local4521 = 0; local4521 < Static75.anIntArray117.length; local4521++) {
			if (!Static89.aBooleanArray18[local4521]) {
				Static75.anIntArray117[local4521] = -1;
			}
		}
		if (Static139.anInt2595 != -1) {
			Static162.method2979(Static139.anInt2595);
		}
		for (@Pc(4552) Class2_Sub7 local4552 = (Class2_Sub7) Static329.aClass4_130.method80(); local4552 != null; local4552 = (Class2_Sub7) Static329.aClass4_130.method79()) {
			if (!local4552.method6462()) {
				local4552 = (Class2_Sub7) Static329.aClass4_130.method80();
				if (local4552 == null) {
					break;
				}
			}
			Static276.method4655(false, local4552, true);
		}
		Static139.anInt2595 = -1;
		Static329.aClass4_130 = new Class4(8);
		Static210.method3720();
		Static192.aClass161_8 = null;
		for (@Pc(4594) int local4594 = 0; local4594 < 8; local4594++) {
			Static243.aStringArray44[local4594] = null;
			Static44.aBooleanArray11[local4594] = false;
			Static207.anIntArray225[local4594] = -1;
		}
		Static302.method1458();
		Static17.aBoolean308 = true;
		for (@Pc(4618) int local4618 = 0; local4618 < 100; local4618++) {
			Static357.aBooleanArray59[local4618] = true;
		}
		Static186.anInt3730 = 0;
		Static389.aString53 = null;
		Static47.aClass214Array1 = null;
		for (@Pc(4636) int local4636 = 0; local4636 < 6; local4636++) {
			Static290.aClass187Array1[local4636] = new Class187();
		}
		for (@Pc(4650) int local4650 = 0; local4650 < 25; local4650++) {
			Static268.anIntArray338[local4650] = 0;
			Static325.anIntArray414[local4650] = 0;
			Static80.anIntArray464[local4650] = 0;
		}
		Static348.method5828();
		Static257.aShortArray79 = Static223.aShortArray78 = Static258.aShortArray95 = Static147.aShortArray54 = new short[256];
		Static100.aBoolean156 = true;
		Static330.aString62 = Static66.aClass79_34.method2267(language);
		Protocol.verifyId = 0;
		preferences.aBoolean365 = false;
		preferences.aBoolean366 = false;
		Static160.method2956();
		Static93.method2002();
		Static375.aLong222 = 0L;
		Static385.aClass2_Sub16_2 = null;
		jsArchive2.anInt5558 = 2;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void setJs5Response(@OriginalArg(0) int response) {
		Static287.js5NetQueue.response = response;
		Static211.js5SocketRequest = null;
		Static103.js5Socket = null;
		Static309.js5ConnectState = 0;
		Static287.js5NetQueue.errors++;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void mainLoop() {
		if (LoginManager.reconnecting == 1000) {
			return;
		}
		@Pc(18) long local18 = Static307.method5257() / 1000000L - Static154.aLong89;
		Static154.aLong89 = Static307.method5257() / 1000000L;
		@Pc(31) boolean local31 = Static196.method3310();
		if (local31 && Static393.aBoolean486 && musicChannel != null) {
			musicChannel.method6317();
		}
		if (LoginManager.reconnecting == 30 || LoginManager.reconnecting == 10) {
			if (Static338.aLong214 != 0L && Static338.aLong214 < MonotonicClock.currentTimeMillis()) {
				Static143.method2677(preferences.anInt4893, Static144.getWindowMode(), false, preferences.anInt4884);
			} else if (Static190.aClass19_8.method2859() && Static122.aBoolean176) {
				Static353.method5883();
			}
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (Static363.frame == null) {
			@Pc(84) Container local84;
			if (GameShell.frame == null) {
				local84 = GameShell.signlink.applet;
			} else {
				local84 = GameShell.frame;
			}
			local92 = local84.getSize().width;
			local96 = local84.getSize().height;
			if (local84 == GameShell.frame) {
				@Pc(102) Insets local102 = GameShell.frame.getInsets();
				local92 -= local102.right + local102.left;
				local96 -= local102.top + local102.bottom;
			}
			if (Static142.anInt2663 != local92 || local96 != Static178.anInt2319) {
				if (Static190.aClass19_8 == null || Static190.aClass19_8.method2840()) {
					Static352.method5877();
				} else {
					Static142.anInt2663 = local92;
					Static178.anInt2319 = local96;
				}
				Static338.aLong214 = MonotonicClock.currentTimeMillis() + 500L;
			}
		}
		if (Static363.frame != null && !Static242.aBoolean306 && (LoginManager.reconnecting == 30 || LoginManager.reconnecting == 10)) {
			Static143.method2677(-1, preferences.anInt4894, false, -1);
		}
		@Pc(169) boolean local169 = false;
		if (Static328.aBoolean412) {
			Static328.aBoolean412 = false;
			local169 = true;
		}
		if (local169) {
			Static372.method6260();
		}
		if (Static190.aClass19_8 != null && Static190.aClass19_8.method2812() || Static144.getWindowMode() != 1) {
			Static98.method2107();
		}
		if (LoginManager.reconnecting == 0) {
			Static172.method3290(Static291.aColorArray4[Static64.anInt1555], local169, Static141.anInt2650, Static56.aString13, Static286.aColorArray3[Static64.anInt1555], Static174.aColorArray2[Static64.anInt1555]);
		} else if (LoginManager.reconnecting == 5) {
			Static193.method3512(Static286.aColorArray3[Static64.anInt1555].getRGB(), Static190.aClass19_8, Static52.aClass130_1, Static190.aClass19_8.method2812() | local169, Static291.aColorArray4[Static64.anInt1555].getRGB(), Static174.aColorArray2[Static64.anInt1555].getRGB());
		} else if (LoginManager.reconnecting == 10) {
			Static337.method5709();
		} else if (LoginManager.reconnecting == 25 || LoginManager.reconnecting == 28) {
			if (Static246.anInt4505 == 1) {
				if (Static65.anInt1588 < Static144.anInt2694) {
					Static65.anInt1588 = Static144.anInt2694;
				}
				local92 = (Static65.anInt1588 - Static144.anInt2694) * 50 / Static65.anInt1588;
				Static351.method5857(Static276.aClass130_4, true, Static256.aClass79_102.method2267(language) + "<br>(" + local92 + "%)");
			} else if (Static246.anInt4505 == 2) {
				if (Static190.anInt3541 < Static305.anInt5742) {
					Static190.anInt3541 = Static305.anInt5742;
				}
				local92 = (Static190.anInt3541 - Static305.anInt5742) * 50 / Static190.anInt3541 + 50;
				Static351.method5857(Static276.aClass130_4, true, Static256.aClass79_102.method2267(language) + "<br>(" + local92 + "%)");
			} else {
				Static351.method5857(Static276.aClass130_4, true, Static256.aClass79_102.method2267(language));
			}
		} else if (LoginManager.reconnecting == 30) {
			Static133.method2503(local18);
		} else if (LoginManager.reconnecting == 40) {
			Static351.method5857(Static276.aClass130_4, true, Static357.aClass79_137.method2267(language) + "<br>" + Static84.aClass79_40.method2267(language));
		}
		if (Static154.anInt2807 == 3) {
			for (local92 = 0; local92 < Static154.anInt2806; local92++) {
				@Pc(398) Rectangle local398 = Class55.aRectangleArray1[local92];
				if (Static20.aBooleanArray6[local92]) {
					Static190.aClass19_8.method2868(local398.height, local398.x, local398.y, -1996553985, local398.width);
				} else if (Static375.aBooleanArray64[local92]) {
					Static190.aClass19_8.method2868(local398.height, local398.x, local398.y, -1996554240, local398.width);
				}
			}
		}
		if (Static333.method6318()) {
			Static279.method4725(Static190.aClass19_8);
		}
		if ((LoginManager.reconnecting == 30 || LoginManager.reconnecting == 10) && Static154.anInt2807 == 0 && Static144.getWindowMode() == 1 && !local169 && Signlink.javaVersion.equals("1.1")) {
			local92 = 0;
			for (local96 = 0; local96 < Static154.anInt2806; local96++) {
				if (Static375.aBooleanArray64[local96]) {
					Static375.aBooleanArray64[local96] = false;
					Static281.aRectangleArray2[local92++] = Class55.aRectangleArray1[local96];
				}
			}
			Static190.aClass19_8.method2842(Static281.aRectangleArray2, local92);
		} else if (LoginManager.reconnecting != 0) {
			Static190.aClass19_8.method2883();
			for (local92 = 0; local92 < Static154.anInt2806; local92++) {
				Static375.aBooleanArray64[local92] = false;
			}
		}
		if (preferences.anInt4881 == 0) {
			Static231.method4023(15L);
		} else if (preferences.anInt4881 == 1) {
			Static231.method4023(10L);
		} else if (preferences.anInt4881 == 2) {
			Static231.method4023(5L);
		} else if (preferences.anInt4881 == 3) {
			Static231.method4023(2L);
		}
		if (Static352.aBoolean446) {
			Static2.method29();
		}
		if (preferences.aBoolean362 && LoginManager.reconnecting == 10 && Static139.anInt2595 != -1) {
			preferences.aBoolean362 = false;
			preferences.method4497(GameShell.signlink);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1388()) {
			return;
		}
		worldListWorldId = Integer.parseInt(this.getParameter("worldid"));
		modeWhere = Static238.method4120(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static274.method4638(modeWhere) && MODE_WHERE_LIVE != modeWhere) {
			modeWhere = MODE_WHERE_LIVE;
		}
		modeWhat = Static132.method2484(Integer.parseInt(this.getParameter("modewhat")));
		if (MODE_ENV_WIP != modeWhat && MODE_ENV_RC != modeWhat && MODE_ENV_LIVE != modeWhat) {
			modeWhat = MODE_ENV_LIVE;
		}
		try {
			language = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			language = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static237.objectTag = true;
		} else {
			Static237.objectTag = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static276.javaScript = true;
		} else {
			Static276.javaScript = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static132.aBoolean180 = true;
		} else {
			Static132.aBoolean180 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			game = GAME_SD;
		} else {
			game = GAME_RS;
		}
		try {
			affiliate = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			affiliate = 0;
		}
		Static307.aString57 = this.getParameter("quiturl");
		settings = this.getParameter("settings");
		if (settings == null) {
			settings = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static320.anInt6007 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static320.anInt6007 = 0;
			}
		}
		Static64.anInt1555 = Integer.parseInt(this.getParameter("colourid"));
		if (Static64.anInt1555 < 0 || Static64.anInt1555 >= Static174.aColorArray2.length) {
			Static64.anInt1555 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static31.aBoolean68 = true;
			MouseRecorder.enabled = true;
		}
		instance = this;
		if (game == GAME_RS) {
			Static263.anInt4834 = 503;
			Static254.anInt4701 = 765;
		} else if (game == GAME_SD) {
			Static263.anInt4834 = 480;
			Static254.anInt4701 = 640;
		}
		this.method1394(Static254.anInt4701, modeWhat.method5282() + 32, Static263.anInt4834);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1384() {
		if (LoginManager.reconnecting == 1000) {
			return;
		}
		cycle++;
		if (cycle % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static283.anInt5352 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static61.aRandom1.setSeed((long) Static283.anInt5352);
		}
		if (cycle % 50 == 0) {
			Static207.anInt3746 = Static175.anInt3348;
			Static298.anInt2437 = Protocol.totalRead;
			Static175.anInt3348 = 0;
			Protocol.totalRead = 0;
		}
		this.method1412();
		if (Static54.aClass154_1 != null) {
			Static54.aClass154_1.method3877();
		}
		Static388.method6438();
		Static37.method1135();
		Static174.aClass123_2.method3337();
		Static226.aClass119_1.method3307();
		if (Static337.aClass131_1 != null) {
			@Pc(81) int local81 = Static337.aClass131_1.method3693();
			Static323.anInt6063 = local81;
		}
		if (Static190.aClass19_8 != null) {
			Static190.aClass19_8.method2848((int) MonotonicClock.currentTimeMillis());
		}
		Static56.method1614();
		Static6.anInt159 = 0;
		for (@Pc(103) Class37 local103 = Static174.aClass123_2.method3342(); local103 != null && Static6.anInt159 < 128; local103 = Static174.aClass123_2.method3342()) {
			if (local103.method1460() != 1) {
				@Pc(114) char local114 = local103.method1456();
				if (!Static355.method5934() || local114 != '`' && local114 != '§') {
					Static156.aClass37Array1[Static6.anInt159] = local103;
					Static6.anInt159++;
				} else if (Static333.method6318()) {
					Static321.method5478();
				} else {
					Static129.method2440();
				}
			}
		}
		Static370.aClass2_Sub24_1 = null;
		for (@Pc(163) Class2_Sub24 local163 = Static226.aClass119_1.method3308(); local163 != null; local163 = Static226.aClass119_1.method3308()) {
			@Pc(169) int local169 = local163.method5247();
			if (local169 == -1) {
				Static277.aClass135_31.method3540(local163);
			} else if (Static330.method5654(local169)) {
				Static370.aClass2_Sub24_1 = local163;
			}
		}
		if (Static333.method6318()) {
			Static105.method2209();
		}
		if (LoginManager.reconnecting == 0) {
			this.method1411();
			Static142.method2662();
		} else if (LoginManager.reconnecting == 5) {
			this.method1411();
			Static142.method2662();
		} else if (LoginManager.reconnecting == 25 || LoginManager.reconnecting == 28) {
			Static322.method5483();
		}
		if (LoginManager.reconnecting == 10) {
			this.method1405();
			CreateManager.loop();
			Static164.method3148();
			LoginManager.loop();
		} else if (LoginManager.reconnecting == 30) {
			Static137.method2549();
		} else if (LoginManager.reconnecting == 40) {
			LoginManager.loop();
			if (LoginManager.reply != -3 && LoginManager.reply != 2 && LoginManager.reply != 15) {
				Static99.logout();
			}
		}
		Static318.method5429(Static190.aClass19_8);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1389() {
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1402() {
		if (Static284.anInt5362 < Static287.js5NetQueue.errors) {
			Static311.anInt5811 = 5 * 50 * (Static287.js5NetQueue.errors - 1);
			if (port == alternatePort) {
				port = defaultPort;
			} else {
				port = alternatePort;
			}
			if (Static311.anInt5811 > 3000) {
				Static311.anInt5811 = 3000;
			}
			if (Static287.js5NetQueue.errors >= 2 && Static287.js5NetQueue.response == 6) {
				this.method1392("js5connect_outofdate");
				LoginManager.reconnecting = 1000;
				return;
			}
			if (Static287.js5NetQueue.errors >= 4 && Static287.js5NetQueue.response == -1) {
				this.method1392("js5crc");
				LoginManager.reconnecting = 1000;
				return;
			}
			if (Static287.js5NetQueue.errors >= 4 && (LoginManager.reconnecting == 0 || LoginManager.reconnecting == 5)) {
				if (Static287.js5NetQueue.response == 7 || Static287.js5NetQueue.response == 9) {
					this.method1392("js5connect_full");
				} else if (Static287.js5NetQueue.response > 0) {
					this.method1392("js5connect");
				} else {
					this.method1392("js5io");
				}
				LoginManager.reconnecting = 1000;
				return;
			}
		}
		Static284.anInt5362 = Static287.js5NetQueue.errors;
		if (Static311.anInt5811 > 0) {
			Static311.anInt5811--;
			return;
		}
		try {
			if (Static309.js5ConnectState == 0) {
				Static211.js5SocketRequest = GameShell.signlink.openSocket(hostname, port);
				Static309.js5ConnectState++;
			}
			if (Static309.js5ConnectState == 1) {
				if (Static211.js5SocketRequest.status == 2) {
					this.setJs5Response(1000);
					return;
				}
				if (Static211.js5SocketRequest.status == 1) {
					Static309.js5ConnectState++;
				}
			}
			if (Static309.js5ConnectState == 2) {
				Static103.js5Socket = new Class111((Socket) Static211.js5SocketRequest.result, GameShell.signlink);
				@Pc(186) Buffer local186 = new Buffer(5);
				local186.p1(Static43.JS5.opcode);
				local186.p4(578);
				Static103.js5Socket.write(5, local186.data);
				Static309.js5ConnectState++;
				Static371.aLong220 = MonotonicClock.currentTimeMillis();
			}
			if (Static309.js5ConnectState == 3) {
				if (LoginManager.reconnecting == 0 || LoginManager.reconnecting == 5 || Static103.js5Socket.available() > 0) {
					@Pc(245) int local245 = Static103.js5Socket.read();
					if (local245 != 0) {
						this.setJs5Response(local245);
						return;
					}
					Static309.js5ConnectState++;
				} else if (MonotonicClock.currentTimeMillis() - Static371.aLong220 > 30000L) {
					this.setJs5Response(1001);
					return;
				}
			}
			if (Static309.js5ConnectState == 4) {
				@Pc(278) boolean local278 = LoginManager.reconnecting == 5 || LoginManager.reconnecting == 10 || LoginManager.reconnecting == 28;
				Static287.js5NetQueue.method4639(Static103.js5Socket, !local278);
				Static211.js5SocketRequest = null;
				Static309.js5ConnectState = 0;
				Static103.js5Socket = null;
			}
		} catch (@Pc(295) IOException local295) {
			this.setJs5Response(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1405() {
		Static165.anInt3148++;
		Static374.method6274(-1, null, -1);
		Static65.method1735(-1, null, -1);
		Static309.method5278();
		Static88.anInt1876++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Npc local33 = NpcList.npcs[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.type.aByte16;
				if ((local39 & 0x1) != 0) {
					@Pc(50) int local50 = local33.method4328();
					@Pc(74) int local74;
					if ((local39 & 0x2) != 0 && local33.anInt4643 == 0 && Math.random() * 1000.0D < 10.0D) {
						local74 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(82) int local82 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local74 != 0 || local82 != 0) {
							@Pc(96) int local96 = local74 + local33.anIntArray316[0];
							if (local96 < 0) {
								local96 = 0;
							} else if (Static373.anInt7033 - local50 - 1 < local96) {
								local96 = Static373.anInt7033 - local50 - 1;
							}
							@Pc(128) int local128 = local33.anIntArray317[0] + local82;
							if (local128 < 0) {
								local128 = 0;
							} else if (Static242.anInt4449 - local50 - 1 < local128) {
								local128 = Static242.anInt4449 - local50 - 1;
							}
							@Pc(179) int local179 = Static141.method2654(true, Static52.anIntArray99, local50, -1, 0, 0, Static171.aClass46Array1[local33.aByte78], local33.anIntArray316[0], local50, local96, Static59.anIntArray105, local50, local128, local33.anIntArray317[0]);
							if (local179 > 0) {
								if (local179 > 9) {
									local179 = 9;
								}
								for (@Pc(190) int local190 = 0; local190 < local179; local190++) {
									local33.anIntArray316[local190] = Static52.anIntArray99[local179 - local190 - 1];
									local33.anIntArray317[local190] = Static59.anIntArray105[local179 - local190 - 1];
									local33.aByteArray51[local190] = 1;
								}
								local33.anInt4643 = local179;
							}
						}
					}
					Static317.method5548(local33, true);
					local74 = Static71.method6019(local33);
					Static100.method2160(local74, Static16.anInt4756, Static170.anInt3229, local33);
					Static173.method3315(local33);
				}
			}
		}
		if (LoginManager.step == 0 && CreateManager.step == 0) {
			if (Static314.anInt5911 == 2) {
				Static222.method3917();
			} else {
				Static199.method5249();
			}
			if (Static136.anInt6778 >> 7 < 14 || Static136.anInt6778 >> 7 >= Static373.anInt7033 - 14 || Static211.anInt3777 >> 7 < 14 || Static211.anInt3777 >> 7 >= Static242.anInt4449 - 14) {
				Static262.method6254();
			}
		}
		while (true) {
			@Pc(298) Class2_Sub13 local298;
			@Pc(303) Class161 local303;
			@Pc(311) Class161 local311;
			do {
				local298 = (Class2_Sub13) Static378.aClass135_43.method3549();
				if (local298 == null) {
					while (true) {
						do {
							local298 = (Class2_Sub13) Static207.aClass135_25.method3549();
							if (local298 == null) {
								while (true) {
									do {
										local298 = (Class2_Sub13) Static274.aClass135_30.method3549();
										if (local298 == null) {
											if (Static375.aClass161_14 != null) {
												Static122.method2398();
											}
											if (cycle % 1500 == 0) {
												Static322.method5485();
											}
											WorldList.pingAll();
											if (Static273.aBoolean374 && Static375.aLong221 < MonotonicClock.currentTimeMillis() - 60000L) {
												Static340.method5765();
												return;
											}
											return;
										}
										local303 = local298.aClass161_3;
										if (local303.anInt4297 < 0) {
											break;
										}
										local311 = Static6.method140(local303.anInt4275);
									} while (local311 == null || local311.aClass161Array2 == null || local303.anInt4297 >= local311.aClass161Array2.length || local303 != local311.aClass161Array2[local303.anInt4297]);
									Static198.method3591(local298);
								}
							}
							local303 = local298.aClass161_3;
							if (local303.anInt4297 < 0) {
								break;
							}
							local311 = Static6.method140(local303.anInt4275);
						} while (local311 == null || local311.aClass161Array2 == null || local303.anInt4297 >= local311.aClass161Array2.length || local311.aClass161Array2[local303.anInt4297] != local303);
						Static198.method3591(local298);
					}
				}
				local303 = local298.aClass161_3;
				if (local303.anInt4297 < 0) {
					break;
				}
				local311 = Static6.method140(local303.anInt4275);
			} while (local311 == null || local311.aClass161Array2 == null || local303.anInt4297 >= local311.aClass161Array2.length || local311.aClass161Array2[local303.anInt4297] != local303);
			Static198.method3591(local298);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
	private void method1406(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Buffer local14 = new Buffer(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(18) int local18 = local14.g1();
					if (local18 == 0) {
						return;
					}
					if (local18 == 1) {
						@Pc(109) int[] local109 = Static209.anIntArray228 = new int[6];
						local109[0] = local14.g2();
						local109[1] = local14.g2();
						local109[2] = local14.g2();
						local109[3] = local14.g2();
						local109[4] = local14.g2();
						local109[5] = local14.g2();
					} else {
						@Pc(38) int local38;
						@Pc(33) int local33;
						if (local18 == 4) {
							local33 = local14.g1();
							Static117.anIntArray150 = new int[local33];
							for (local38 = 0; local38 < local33; local38++) {
								Static117.anIntArray150[local38] = local14.g2();
								if (Static117.anIntArray150[local38] == 65535) {
									Static117.anIntArray150[local38] = -1;
								}
							}
						} else if (local18 == 5) {
							local33 = local14.g1();
							Static324.anIntArray412 = new int[local33];
							for (local38 = 0; local38 < local33; local38++) {
								Static324.anIntArray412[local38] = local14.g2();
								if (Static324.anIntArray412[local38] == 65535) {
									Static324.anIntArray412[local38] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1387() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static352.method5877();
		Static1.aClass206_1 = new Class206(GameShell.signlink);
		Static287.js5NetQueue = new Class183();
		if (modeWhere != MODE_WHERE_LIVE) {
			Static26.aByteArrayArray3 = new byte[50][];
		}
		preferences = new Class177_Sub1(GameShell.signlink);
		if (modeWhere == MODE_WHERE_LIVE) {
			worldListHostname = this.getCodeBase().getHost();
			worldListDefaultPort = 43594;
			worldListAlternatePort = 443;
		} else if (Static274.method4638(modeWhere)) {
			worldListHostname = this.getCodeBase().getHost();
			worldListDefaultPort = worldListWorldId + 40000;
			worldListAlternatePort = worldListWorldId + 50000;
		} else if (MODE_WHERE_LOCAL == modeWhere) {
			worldListDefaultPort = worldListWorldId + 40000;
			worldListAlternatePort = worldListWorldId + 50000;
			worldListHostname = "127.0.0.1";
		}
		alternatePort = worldListDefaultPort;
		hostname = worldListHostname;
		worldListPort = worldListDefaultPort;
		defaultPort = worldListAlternatePort;
		Static257.aShortArray79 = Static223.aShortArray78 = Static258.aShortArray95 = Static147.aShortArray54 = new short[256];
		port = worldListPort;
		if (Static215.anInt3795 == 3) {
			worldId = worldListWorldId;
		}
		if (game == GAME_SD) {
			Static186.aShortArrayArray6 = Static30.aShortArrayArray3;
			Static28.anInt686 = 16777215;
			Static148.aBoolean192 = true;
			Static43.aShortArray20 = Static113.aShortArray46;
			Static279.anInt5161 = 0;
			Static10.aShortArray1 = Static25.aShortArray4;
			Static353.aShortArrayArray7 = Static201.aShortArrayArray5;
		} else {
			Static43.aShortArray20 = Static131.aShortArray65;
			Static10.aShortArray1 = Static78.aShortArray123;
			Static353.aShortArrayArray7 = Static25.aShortArrayArray2;
			Static186.aShortArrayArray6 = Static386.aShortArrayArray9;
		}
		Static174.aClass123_2 = Static18.method556(Static21.aCanvas1);
		Static226.aClass119_1 = Static31.method948(Static21.aCanvas1);
		Static337.aClass131_1 = Static63.method1702();
		if (Static337.aClass131_1 != null) {
			Static337.aClass131_1.method3692(Static21.aCanvas1);
		}
		Static367.anInt6878 = Static215.anInt3795;
		try {
			if (GameShell.signlink.cacheData != null) {
				Static110.aClass205_1 = new Class205(GameShell.signlink.cacheData, 5200, 0);
				for (@Pc(171) int local171 = 0; local171 < 29; local171++) {
					Static185.aClass205Array1[local171] = new Class205(GameShell.signlink.cacheIndexes[local171], 6000, 0);
				}
				Static150.aClass205_2 = new Class205(GameShell.signlink.cacheMasterIndex, 6000, 0);
				Static18.aClass207_1 = new Class207(255, Static110.aClass205_1, Static150.aClass205_2, 500000);
				Static317.aClass205_6 = new Class205(GameShell.signlink.uid, 24, 0);
				GameShell.signlink.uid = null;
				GameShell.signlink.cacheMasterIndex = null;
				GameShell.signlink.cacheIndexes = null;
				GameShell.signlink.cacheData = null;
			}
		} catch (@Pc(227) IOException local227) {
			Static150.aClass205_2 = null;
			Static110.aClass205_1 = null;
			Static317.aClass205_6 = null;
			Static18.aClass207_1 = null;
		}
		if (MODE_WHERE_LIVE != modeWhere) {
			Static356.aBoolean456 = true;
		}
		Static290.aString56 = (GAME_RS == game ? Static221.aClass79_99 : Static221.aClass79_98).method2267(language);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1411() {
		@Pc(6) int local6;
		if (!preferences.aBoolean362) {
			for (local6 = 0; local6 < Static6.anInt159; local6++) {
				if (Static156.aClass37Array1[local6].method1456() == 's' || Static156.aClass37Array1[local6].method1456() == 'S') {
					preferences.aBoolean362 = true;
					break;
				}
			}
		}
		@Pc(55) int local55;
		if (Static309.anInt5801 == 0) {
			@Pc(45) Runtime local45 = Runtime.getRuntime();
			local55 = (int) ((local45.totalMemory() - local45.freeMemory()) / 1024L);
			@Pc(60) long local60 = MonotonicClock.currentTimeMillis();
			if (Static5.aLong11 == 0L) {
				Static5.aLong11 = local60;
			}
			if (local55 > 16384 && local60 - Static5.aLong11 < 5000L) {
				if (local60 - Static29.aLong22 > 1000L) {
					System.gc();
					Static29.aLong22 = local60;
				}
				Static56.aString13 = Static311.aClass79_122.method2267(language);
				Static141.anInt2650 = 5;
			} else {
				Static56.aString13 = Static146.aClass79_63.method2267(language);
				Static141.anInt2650 = 5;
				Static309.anInt5801 = 10;
			}
		} else if (Static309.anInt5801 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static171.aClass46Array1[local6] = Static24.method853(Static242.anInt4449, Static373.anInt7033);
			}
			Static56.aString13 = Static109.aClass79_46.method2267(language);
			Static309.anInt5801 = 20;
			Static141.anInt2650 = 10;
		} else if (Static309.anInt5801 == 20) {
			if (Static54.aClass154_1 == null) {
				Static54.aClass154_1 = new Class154(Static287.js5NetQueue, Static1.aClass206_1);
			}
			if (Static54.aClass154_1.method3872()) {
				jsArchive0 = Static163.method3101(true, 0, false);
				jsArchive1 = Static163.method3101(true, 1, false);
				jsArchive2 = Static163.method3101(true, 2, false);
				jsArchive3 = Static163.method3101(true, 3, false);
				jsArchive4 = Static163.method3101(true, 4, false);
				jsArchive5 = Static163.method3101(true, 5, true);
				jsArchive6 = Static163.method3101(false, 6, true);
				jsArchive7 = Static163.method3101(true, 7, false);
				jsArchive8 = Static163.method3101(true, 8, false);
				jsArchive9 = Static163.method3101(true, 9, false);
				jsArchive10 = Static163.method3101(true, 10, false);
				jsArchive11 = Static163.method3101(true, 11, false);
				jsArchive12 = Static163.method3101(true, 12, false);
				jsArchive13 = Static163.method3101(true, 13, false);
				jsArchive14 = Static163.method3101(false, 14, false);
				jsArchive15 = Static163.method3101(true, 15, false);
				jsArchive16 = Static163.method3101(true, 16, false);
				jsArchive17 = Static163.method3101(true, 17, false);
				jsArchive18 = Static163.method3101(true, 18, false);
				jsArchive19 = Static163.method3101(true, 19, false);
				jsArchive20 = Static163.method3101(true, 20, false);
				jsArchive21 = Static163.method3101(true, 21, false);
				jsArchive22 = Static163.method3101(true, 22, false);
				jsArchive23 = Static163.method3101(true, 23, true);
				jsArchive24 = Static163.method3101(true, 24, false);
				jsArchive25 = Static163.method3101(true, 25, false);
				jsArchive26 = Static163.method3101(true, 26, true);
				jsArchive27 = Static163.method3101(true, 27, false);
				jsArchive28 = Static163.method3101(true, 28, true);
				Static56.aString13 = Static118.aClass79_76.method2267(language);
				Static309.anInt5801 = 30;
				Static141.anInt2650 = 15;
			} else {
				Static56.aString13 = Static193.aClass79_78.method2267(language);
				Static141.anInt2650 = 12;
			}
		} else if (Static309.anInt5801 == 30) {
			local6 = 0;
			for (local55 = 0; local55 < 29; local55++) {
				local6 += Static374.aClass25_Sub1Array2[local55].method896() * Static278.anIntArray362[local55] / 100;
			}
			if (local6 == 100) {
				Static56.aString13 = Static226.aClass79_89.method2267(language);
				Static141.anInt2650 = 20;
				Static62.method2390(jsArchive8);
				Static44.method1359(jsArchive8);
				Static309.anInt5801 = 40;
			} else {
				if (local6 != 0) {
					Static56.aString13 = Static117.aClass79_47.method2267(language) + local6 + "%";
				}
				Static141.anInt2650 = 20;
			}
		} else if (Static309.anInt5801 == 40) {
			if (jsArchive28.method5073()) {
				this.method1406(jsArchive28.method5082(1));
				Static56.aString13 = Static117.aClass79_48.method2267(language);
				Static141.anInt2650 = 25;
				Static309.anInt5801 = 50;
			} else {
				Static56.aString13 = Static26.aClass79_18.method2267(language) + jsArchive28.method5091() + "%";
				Static141.anInt2650 = 25;
			}
		} else if (Static309.anInt5801 == 50) {
			Static84.method1909(preferences.aBoolean352);
			Static385.aClass2_Sub12_Sub3_3 = new Class2_Sub12_Sub3();
			Static385.aClass2_Sub12_Sub3_3.method4296();
			musicChannel = Static381.method6347(0, GameShell.signlink, Static21.aCanvas1, 22050);
			musicChannel.method6330(Static385.aClass2_Sub12_Sub3_3);
			Static180.method3369(jsArchive14, jsArchive15, jsArchive4, Static385.aClass2_Sub12_Sub3_3);
			soundChannel = Static381.method6347(1, GameShell.signlink, Static21.aCanvas1, 2048);
			Static227.aClass2_Sub12_Sub2_2 = new Class2_Sub12_Sub2();
			soundChannel.method6330(Static227.aClass2_Sub12_Sub2_2);
			Static300.aClass249_1 = new Class249(22050, Static356.anInt6643);
			Static97.anInt2049 = jsArchive6.getGroupId("scape main");
			Static56.aString13 = Static369.aClass79_144.method2267(language);
			Static141.anInt2650 = 30;
			Static309.anInt5801 = 60;
		} else if (Static309.anInt5801 == 60) {
			local6 = Static64.method1707(jsArchive13, jsArchive8);
			local55 = Static218.method1090();
			if (local55 > local6) {
				Static56.aString13 = Static276.aClass79_109.method2267(language) + local6 * 100 / local55 + "%";
				Static141.anInt2650 = 35;
			} else {
				Static56.aString13 = Static121.aClass79_53.method2267(language);
				Static309.anInt5801 = 70;
				Static141.anInt2650 = 35;
			}
		} else if (Static309.anInt5801 == 70) {
			local6 = Static333.method6333(jsArchive8);
			local55 = Static32.method991();
			if (local6 < local55) {
				Static56.aString13 = Static279.aClass79_111.method2267(language) + local6 * 100 / local55 + "%";
				Static141.anInt2650 = 40;
			} else {
				Static56.aString13 = Static201.aClass79_80.method2267(language);
				Static309.anInt5801 = 80;
				Static141.anInt2650 = 40;
			}
		} else if (Static309.anInt5801 == 80) {
			if (jsArchive26.method5073()) {
				Static128.anInterface2_4 = new Class99(jsArchive26, jsArchive9, jsArchive8);
				Static56.aString13 = Static312.aClass79_123.method2267(language);
				Static141.anInt2650 = 45;
				Static309.anInt5801 = 90;
			} else {
				Static56.aString13 = Static118.aClass79_77.method2267(language) + jsArchive26.method5091() + "%";
				Static141.anInt2650 = 45;
			}
		} else if (Static309.anInt5801 == 90) {
			Static56.aString13 = Static252.aClass79_100.method2267(language);
			Static309.anInt5801 = 95;
			Static141.anInt2650 = 50;
		} else if (Static309.anInt5801 == 95) {
			if (preferences.aBoolean362) {
				preferences.anInt4894 = 1;
				preferences.anInt4878 = 0;
				preferences.anInt4885 = 0;
				preferences.anInt4883 = 0;
				preferences.anInt4891 = 0;
			}
			preferences.aBoolean362 = true;
			preferences.method4497(GameShell.signlink);
			Static252.method4365(false, preferences.anInt4878);
			Static56.aString13 = Static357.aClass79_138.method2267(language);
			Static141.anInt2650 = 55;
			Static309.anInt5801 = 100;
		} else if (Static309.anInt5801 == 100) {
			Static236.method4102(jsArchive8, jsArchive13, Static190.aClass19_8);
			Static56.aString13 = Static179.aClass79_73.method2267(language);
			Static141.anInt2650 = 60;
			Static336.method5705(5);
			Static309.anInt5801 = 110;
		} else if (Static309.anInt5801 == 110) {
			jsArchive2.method5073();
			local6 = jsArchive2.method5091();
			jsArchive16.method5073();
			local6 += jsArchive16.method5091();
			jsArchive17.method5073();
			local6 += jsArchive17.method5091();
			jsArchive18.method5073();
			local6 += jsArchive18.method5091();
			jsArchive19.method5073();
			local6 += jsArchive19.method5091();
			jsArchive20.method5073();
			local6 += jsArchive20.method5091();
			jsArchive21.method5073();
			local6 += jsArchive21.method5091();
			jsArchive22.method5073();
			local6 += jsArchive22.method5091();
			jsArchive24.method5073();
			local6 += jsArchive24.method5091();
			jsArchive25.method5073();
			local6 += jsArchive25.method5091();
			jsArchive27.method5073();
			local6 += jsArchive27.method5091();
			if (local6 < 1100) {
				Static56.aString13 = Static36.aClass79_22.method2267(language) + local6 / 11 + "%";
				Static141.anInt2650 = 65;
			} else {
				Static363.aClass18_2 = new Class18(game, language, jsArchive2);
				Static59.aClass7_1 = new Class7(game, language, jsArchive2);
				Static221.aClass150_3 = new Class150(game, language, jsArchive2, jsArchive8);
				Static140.aClass109_1 = new Class109(game, language, jsArchive17);
				Static39.aClass72_3 = new Class72(game, language, jsArchive2);
				Static336.aClass241_5 = new Class241(game, language, jsArchive2);
				Static21.aClass55_1 = new Class55(game, language, jsArchive2, jsArchive7);
				Static178.aClass51_3 = new Class51(game, language, jsArchive2);
				Static90.aClass190_3 = new Class190(game, language, jsArchive2);
				Static359.LocTypeList = new Class202(game, language, true, jsArchive16, jsArchive7);
				Static236.aClass125_1 = new Class125(game, language, jsArchive2, jsArchive8);
				Static320.aClass104_2 = new Class104(game, language, jsArchive2, jsArchive8);
				Static6.NpcTypeList = new Class219(game, language, true, jsArchive18, jsArchive7);
				Static313.ObjTypeList = new Class107(game, language, true, Static363.aClass18_2, jsArchive19, jsArchive7);
				Static287.aClass233_1 = new Class233(game, language, jsArchive2);
				Static39.aClass85_1 = new Class85(game, language, jsArchive20, jsArchive0, jsArchive1);
				Static9.aClass213_1 = new Class213(game, language, jsArchive2);
				Static278.aClass160_1 = new Class160(game, language, jsArchive2);
				Static322.aClass211_2 = new Class211(game, language, jsArchive21, jsArchive7);
				Static367.aClass132_1 = new Class132(game, language, jsArchive2);
				Static183.aClass193_2 = new Class193(game, language, jsArchive2);
				Static162.aClass45_1 = new Class45(game, language, jsArchive2);
				Static322.aClass128_1 = new Class128(game, language, jsArchive22);
				Static56.aClass199_1 = new Class199(game, language, jsArchive2);
				Static126.method5702(jsArchive13, jsArchive7, jsArchive3, jsArchive8);
				Static325.method5544(new Class83(), jsArchive24, jsArchive25);
				Static117.method2366(jsArchive24, jsArchive25);
				Static56.aString13 = Static336.aClass79_130.method2267(language);
				Static141.anInt2650 = 65;
				Static156.method2798();
				Static359.LocTypeList.method5160(!preferences.method4495(Static77.anInt1762));
				Static214.aClass226_1 = new Class226();
				Static174.method1506();
				Static382.method6362(jsArchive27);
				Static292.method5037(Static128.anInterface2_4, jsArchive7);
				Static309.anInt5801 = 120;
			}
		} else if (Static309.anInt5801 == 120) {
			local6 = Static134.method2509(jsArchive8);
			local55 = Static254.method4375();
			if (local55 > local6) {
				Static56.aString13 = Static117.aClass79_49.method2267(language) + local6 * 100 / local55 + "%";
				Static141.anInt2650 = 70;
			} else {
				Static44.method1358(Static190.aClass19_8, jsArchive8);
				Static144.method2691(Static124.aClass13Array27);
				Static56.aString13 = Static235.aClass79_72.method2267(language);
				Static309.anInt5801 = 130;
				Static141.anInt2650 = 70;
			}
		} else if (Static309.anInt5801 == 130) {
			if (jsArchive10.method5098("huffman", "")) {
				@Pc(1242) Class140 local1242 = new Class140(jsArchive10.method5084("huffman", ""));
				Static334.method5687(local1242);
				Static56.aString13 = Static134.aClass79_59.method2267(language);
				Static309.anInt5801 = 140;
				Static141.anInt2650 = 75;
			} else {
				Static56.aString13 = Static307.aClass79_121.method2267(language) + "0%";
				Static141.anInt2650 = 75;
			}
		} else if (Static309.anInt5801 == 140) {
			if (jsArchive3.method5073()) {
				Static56.aString13 = Static78.aClass79_128.method2267(language);
				Static309.anInt5801 = 150;
				Static141.anInt2650 = 80;
			} else {
				Static56.aString13 = Static227.aClass79_90.method2267(language) + jsArchive3.method5091() + "%";
				Static141.anInt2650 = 80;
			}
		} else if (Static309.anInt5801 == 150) {
			if (jsArchive12.method5073()) {
				Static56.aString13 = Static347.aClass79_134.method2267(language);
				Static141.anInt2650 = 82;
				Static309.anInt5801 = 160;
			} else {
				Static56.aString13 = Static67.aClass79_35.method2267(language) + jsArchive12.method5091() + "%";
				Static141.anInt2650 = 82;
			}
		} else if (Static309.anInt5801 == 160) {
			if (jsArchive13.method5073()) {
				Static56.aString13 = Static325.aClass79_126.method2267(language);
				Static141.anInt2650 = 85;
				Static309.anInt5801 = 170;
			} else {
				Static56.aString13 = Static325.aClass79_126.method2267(language) + jsArchive13.method5091() + "%";
				Static141.anInt2650 = 85;
			}
		} else if (Static309.anInt5801 == 170) {
			if (jsArchive23.method5072("details")) {
				Static344.method5512(jsArchive23, Static39.aClass72_3, Static336.aClass241_5, Static359.LocTypeList, Static236.aClass125_1, Static320.aClass104_2, Static214.aClass226_1);
				Static56.aString13 = Static300.aClass79_118.method2267(language);
				Static309.anInt5801 = 180;
				Static141.anInt2650 = 89;
			} else {
				Static56.aString13 = Static163.aClass79_68.method2267(language) + jsArchive23.method5085("details") + "%";
				Static141.anInt2650 = 87;
			}
		} else if (Static309.anInt5801 == 180) {
			local6 = WorldList.fetch();
			if (local6 == -1) {
				Static56.aString13 = Static294.aClass79_117.method2267(language);
				Static141.anInt2650 = 90;
			} else if (local6 == 7 || local6 == 9) {
				this.method1392("worldlistfull");
				Static336.method5705(1000);
			} else if (WorldList.loaded) {
				Static56.aString13 = Static340.aClass79_133.method2267(language);
				Static141.anInt2650 = 90;
				Static309.anInt5801 = 190;
			} else {
				this.method1392("worldlistio_" + local6);
				Static336.method5705(1000);
			}
		} else if (Static309.anInt5801 == 190) {
			Static89.aBooleanArray18 = new boolean[Static162.aClass45_1.anInt1466];
			Static75.aStringArray11 = new String[Static183.aClass193_2.anInt5494];
			Static75.anIntArray117 = new int[Static162.aClass45_1.anInt1466];
			for (local6 = 0; local6 < Static162.aClass45_1.anInt1466; local6++) {
				if (Static162.aClass45_1.method1623(local6).anInt1258 == 0) {
					Static89.aBooleanArray18[local6] = true;
					Static112.anInt2294++;
				}
				Static75.anIntArray117[local6] = -1;
			}
			Static318.method5425();
			Static391.anInt7216 = jsArchive3.getGroupId("loginscreen");
			jsArchive5.method5070(false);
			jsArchive6.method5070(true);
			jsArchive8.method5070(true);
			jsArchive13.method5070(true);
			jsArchive10.method5070(true);
			jsArchive3.method5070(true);
			Static352.aBoolean446 = true;
			jsArchive2.anInt5558 = 2;
			jsArchive17.anInt5558 = 2;
			jsArchive16.anInt5558 = 2;
			jsArchive18.anInt5558 = 2;
			jsArchive19.anInt5558 = 2;
			jsArchive20.anInt5558 = 2;
			jsArchive21.anInt5558 = 2;
			Static143.method2677(-1, preferences.anInt4894, false, -1);
			Static56.aString13 = Static70.aClass79_36.method2267(language);
			Static309.anInt5801 = 200;
			Static141.anInt2650 = 95;
		} else if (Static309.anInt5801 == 200) {
			Static50.method1525(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method1412() {
		@Pc(21) boolean local21 = Static287.js5NetQueue.method4640();
		if (!local21) {
			this.method1402();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1386() {
		if (Static273.aBoolean374) {
			Static340.method5765();
		}
		if (Static190.aClass19_8 != null) {
			Static190.aClass19_8.method2825();
		}
		if (Static363.frame != null) {
			Static17.method4215(Static363.frame, GameShell.signlink);
			Static363.frame = null;
		}
		if (Protocol.socket != null) {
			Protocol.socket.close();
			Protocol.socket = null;
		}
		if (Static337.aClass131_1 != null) {
			Static337.aClass131_1.method3691(Static21.aCanvas1);
		}
		Static337.aClass131_1 = null;
		if (musicChannel != null) {
			musicChannel.method6326();
		}
		if (soundChannel != null) {
			soundChannel.method6326();
		}
		Static287.js5NetQueue.method4645();
		Static1.aClass206_1.method5228();
		if (Static4.aClass162_1 != null) {
			Static4.aClass162_1.method4115();
			Static4.aClass162_1 = null;
		}
	}
}
