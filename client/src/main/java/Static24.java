import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "Lclient!rc;")
	public static Class42 aClass42_2;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!nk;)V")
	public static void method852(@OriginalArg(1) Component arg0) {
		if (arg0.type == 5 && arg0.objId != -1) {
			Static46.method1422(Rasteriser.instance, arg0);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBI)Lclient!dg;")
	public static CollisionMap method853(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) CollisionMap local12 = new CollisionMap();
		local12.anInt1484 = -1;
		local12.anInt1487 = arg0 + 1 + 5;
		local12.anInt1472 = arg1 + 5 + 1;
		local12.anInt1468 = -1;
		local12.anIntArrayArray14 = new int[local12.anInt1472][local12.anInt1487];
		local12.method1626();
		return local12;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < arg4 + arg6 && arg7 + arg3 > arg4) {
			return arg0 + arg2 > arg1 && arg2 < arg1 + arg5;
		} else {
			return false;
		}
	}
}
