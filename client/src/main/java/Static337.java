import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "Lclient!jd;")
	public static Sprite aClass13_17;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
	public static int anInt6317;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILclient!jc;III)V")
	public static void method5706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2.anInt2894 == -1 && arg2.anIntArray181 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(24) int local24 = client.preferences.areaSoundsVolume * arg2.anInt2906 >> 8;
		if (arg2.anInt2896 < arg4) {
			local16 = arg4 - arg2.anInt2896;
		} else if (arg4 < arg2.anInt2899) {
			local16 = arg2.anInt2899 - arg4;
		}
		if (arg3 > arg2.anInt2904) {
			local16 += arg3 - arg2.anInt2904;
		} else if (arg3 < arg2.anInt2910) {
			local16 += arg2.anInt2910 - arg3;
		}
		if (arg2.anInt2901 == 0 || arg2.anInt2901 < local16 - 64 || client.preferences.areaSoundsVolume == 0 || arg2.anInt2905 != arg1) {
			if (arg2.aClass2_Sub12_Sub4_3 != null) {
				client.soundStream.method2081(arg2.aClass2_Sub12_Sub4_3);
				arg2.aClass2_Sub12_Sub4_3 = null;
			}
			if (arg2.aClass2_Sub12_Sub4_2 != null) {
				client.soundStream.method2081(arg2.aClass2_Sub12_Sub4_2);
				arg2.aClass2_Sub12_Sub4_2 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(140) int local140 = local24 * (arg2.anInt2901 - local16) / arg2.anInt2901;
		if (arg2.aClass2_Sub12_Sub4_3 != null) {
			arg2.aClass2_Sub12_Sub4_3.method4979(local140);
		} else if (arg2.anInt2894 >= 0) {
			@Pc(155) SynthSound local155 = Static409.method6435(client.jsArchive4, arg2.anInt2894, 0);
			if (local155 != null) {
				@Pc(162) PcmSound local162 = local155.toPcmSound().method3179(client.resampler);
				@Pc(167) Class2_Sub12_Sub4 local167 = Static406.method5006(local162, local140);
				local167.method4984(-1);
				client.soundStream.addSubStream(local167);
				arg2.aClass2_Sub12_Sub4_3 = local167;
			}
		}
		if (arg2.aClass2_Sub12_Sub4_2 != null) {
			arg2.aClass2_Sub12_Sub4_2.method4979(local140);
			if (arg2.aClass2_Sub12_Sub4_2.isLinked()) {
				return;
			}
			arg2.aClass2_Sub12_Sub4_2 = null;
		} else if (arg2.anIntArray181 != null && (arg2.anInt2907 -= arg0) <= 0) {
			@Pc(204) int local204 = (int) ((double) arg2.anIntArray181.length * Math.random());
			@Pc(212) SynthSound local212 = Static409.method6435(client.jsArchive4, arg2.anIntArray181[local204], 0);
			if (local212 != null) {
				@Pc(219) PcmSound local219 = local212.toPcmSound().method3179(client.resampler);
				@Pc(224) Class2_Sub12_Sub4 local224 = Static406.method5006(local219, local140);
				local224.method4984(0);
				client.soundStream.addSubStream(local224);
				arg2.anInt2907 = (int) ((double) (arg2.anInt2897 - arg2.anInt2903) * Math.random()) + arg2.anInt2903;
				arg2.aClass2_Sub12_Sub4_2 = local224;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
	public static void method5709() {
		Static371.method6257((long) client.cycle, Rasteriser.instance);
		if (Static139.anInt2595 != -1) {
			Static232.method4028(Static139.anInt2595);
		}
		for (@Pc(19) int local19 = 0; local19 < Static154.anInt2806; local19++) {
			if (Static357.aBooleanArray59[local19]) {
				Static375.aBooleanArray64[local19] = true;
			}
			Static20.aBooleanArray6[local19] = Static357.aBooleanArray59[local19];
			Static357.aBooleanArray59[local19] = false;
		}
		Static132.anInt2468 = client.cycle;
		if (Rasteriser.instance.hasHwAccel()) {
			Static106.aBoolean164 = true;
		}
		if (Static139.anInt2595 != -1) {
			Static154.anInt2806 = 0;
			Static46.method1421();
		}
		Rasteriser.instance.method2898();
		Static307.method5255(Minimap.anInt7263);
		client.sceneDelta = 0;
	}
}
