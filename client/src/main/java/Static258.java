import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "S")
	public static short aShort78 = 205;

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "[S")
	public static short[] aShortArray95 = new short[256];

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZIIII)V")
	public static void method4402(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static77.anInt1762 == 0) {
			Static241.method4192(false);
		} else {
			Static33.anInt4462 = Static77.anInt1762;
			Static78.method5701(0);
		}
		Static184.anInt3436 = arg1;
		Static18.anInt519 = arg3;
		Static299.aBoolean399 = arg0;
		Static344.method5518(arg2);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!wm;Lclient!hp;IIIII)V")
	public static void method4403(@OriginalArg(0) Class19 arg0, @OriginalArg(1) BaseEntity arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Scene.anInt1914) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Scene.anInt1684) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Scene.anInt3773 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class67 local62 = Scene.aClass67ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Scene.aClass6Array4[local17].method5719(local23, local32) + Scene.aClass6Array4[local17].method5719(local23 + 1, local32) + Scene.aClass6Array4[local17].method5719(local23, local32 + 1) + Scene.aClass6Array4[local17].method5719(local23 + 1, local32 + 1)) / 4 - (Scene.aClass6Array4[arg2].method5719(arg3, arg4) + Scene.aClass6Array4[arg2].method5719(arg3 + 1, arg4) + Scene.aClass6Array4[arg2].method5719(arg3, arg4 + 1) + Scene.aClass6Array4[arg2].method5719(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class11_Sub1 local143 = local62.aClass11_Sub1_3;
									@Pc(146) Class11_Sub1 local146 = local62.aClass11_Sub1_2;
									if (local143 != null && local143.method6076()) {
										arg1.method6075((local23 - arg3) * Scene.anInt4716 + (1 - arg5) * Scene.anInt4693, (local32 - arg4) * Scene.anInt4716 + (1 - arg6) * Scene.anInt4693, local140, arg0, local1, local143);
									}
									if (local146 != null && local146.method6076()) {
										arg1.method6075((local23 - arg3) * Scene.anInt4716 + (1 - arg5) * Scene.anInt4693, (local32 - arg4) * Scene.anInt4716 + (1 - arg6) * Scene.anInt4693, local140, arg0, local1, local146);
									}
									for (@Pc(219) Class22 local219 = local62.aClass22_2; local219 != null; local219 = local219.aClass22_1) {
										@Pc(223) Entity local223 = local219.aClass11_Sub5_1;
										if (local223 != null && local223.method6076() && (local23 == local223.aShort103 || local23 == local3) && (local32 == local223.aShort101 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort104 + 1 - local223.aShort103;
											@Pc(260) int local260 = local223.aShort102 + 1 - local223.aShort101;
											arg1.method6075((local223.aShort103 - arg3) * Scene.anInt4716 + (local252 - arg5) * Scene.anInt4693, (local223.aShort101 - arg4) * Scene.anInt4716 + (local260 - arg6) * Scene.anInt4693, local140, arg0, local1, local223);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

}
