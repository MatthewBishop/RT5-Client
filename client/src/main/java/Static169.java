import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] MSG_SECONDARY = new String[100];

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!wm;)V")
	public static void method3212(@OriginalArg(0) RasteriserBase arg0) {
		for (@Pc(1) int local1 = Static66.anInt1624; local1 < Scene.anInt1914; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Scene.anInt1684; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Scene.anInt3773; local7++) {
					@Pc(16) Class67 local16 = Scene.aClass67ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class11_Sub1 local21 = local16.aClass11_Sub1_3;
						@Pc(24) Class11_Sub1 local24 = local16.aClass11_Sub1_2;
						if (local21 != null && local21.method6076()) {
							Static258.method4403(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method6076()) {
								Static258.method4403(arg0, local24, local1, local4, local7, 1, 1);
								local24.method6075(0, 0, 0, arg0, false, local21);
								local24.method6069();
							}
							local21.method6069();
						}
						for (@Pc(70) Class22 local70 = local16.aClass22_2; local70 != null; local70 = local70.aClass22_1) {
							@Pc(74) Entity local74 = local70.aClass11_Sub5_1;
							if (local74 != null && local74.method6076()) {
								Static258.method4403(arg0, local74, local1, local4, local7, local74.aShort104 + 1 - local74.aShort103, local74.aShort102 - local74.aShort101 + 1);
								local74.method6069();
							}
						}
						@Pc(111) Class11_Sub2 local111 = local16.aClass11_Sub2_2;
						if (local111 != null && local111.method6076()) {
							Static32.method990(arg0, local111, local1, local4, local7);
							local111.method6069();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIZIII)V")
	public static void method3213(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class84[] local7 = Static50.aClass84Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(17) Class84 local17 = local7[local9];
			if (local17 != null && local17.anInt2355 == 2) {
				Static121.method2394(local17.anInt2359, arg2 >> 1, local17.anInt2356 + (local17.anInt2364 - Camera.originZ << 7), local17.anInt2362 * 2, arg0 >> 1, (local17.anInt2352 - Camera.originX << 7) + local17.anInt2350);
				if (Static216.anIntArray231[0] > -1 && client.cycle % 20 < 10) {
					Static230.aClass13Array16[local17.anInt2363].method6385(arg1 + Static216.anIntArray231[0] - 12, Static216.anIntArray231[1] + arg3 - 28);
				}
			}
		}
	}
}
