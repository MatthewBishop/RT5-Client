import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "Lclient!bc;")
	public static final Class16 aClass16_7 = new Class16("", 17);

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)I")
	public static int method5277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = (local15 * local15 * 15731 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
	public static void method5278() {
		if (Static139.topLevelInterface == -1) {
			return;
		}
		@Pc(20) int local20 = Mouse.instance.method3304();
		@Pc(24) int local24 = Mouse.instance.method3313();
		if (Mouse.clickButton != null) {
			local20 = Mouse.clickButton.getY();
			local24 = Mouse.clickButton.getX();
		}
		Static257.method3927(0, GameShell.canvasHeight, GameShell.canvasWidth, 0, 0, local20, Static139.topLevelInterface, local24, 0);
		if (WorldMap.aClass161_11 != null) {
			Static12.method280(local20, local24);
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
	public static void method5280() {
		Static146.anInt2703 = 0;
		Static312.anInt5844 = -1;
		Static358.anInt6550 = -1;
	}
}
