import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!jl", name = "bb", descriptor = "F")
	public static float aFloat38;

	@OriginalMember(owner = "client!jl", name = "W", descriptor = "I")
	public static final int anInt3138 = 0;

	@OriginalMember(owner = "client!jl", name = "X", descriptor = "Lclient!nk;")
	public static Component aClass161_5 = null;

	@OriginalMember(owner = "client!jl", name = "Y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIILclient!ur;Lclient!vi;Lclient!kf;Ljava/lang/String;Lclient!nk;)V")
	public static void method3147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) BitmapFont arg6, @OriginalArg(8) Class239 arg7, @OriginalArg(9) Class78 arg8, @OriginalArg(10) String arg9, @OriginalArg(11) Component arg10) {
		@Pc(15) int local15;
		if (Camera.cameraType == 4) {
			local15 = (int) Camera.yaw & 0x3FFF;
		} else {
			local15 = Static6.anInt158 + (int) Camera.yaw & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg10.width / 2, arg10.height / 2) + 10;
		@Pc(43) int local43 = arg4 * arg4 + arg1 * arg1;
		if (local43 > local34 * local34) {
			return;
		}
		@Pc(53) int local53 = RasteriserBase.anIntArray178[local15];
		@Pc(57) int local57 = RasteriserBase.anIntArray177[local15];
		if (Camera.cameraType != 4) {
			local57 = local57 * 256 / (Static97.anInt2005 + 256);
			local53 = local53 * 256 / (Static97.anInt2005 + 256);
		}
		@Pc(86) int local86 = local57 * arg4 + local53 * arg1 >> 15;
		@Pc(96) int local96 = arg1 * local57 - local53 * arg4 >> 15;
		@Pc(103) int local103 = arg7.getParagraphWidth(null, arg9, 100);
		@Pc(109) int local109 = local86 - local103 / 2;
		@Pc(117) int local117 = arg7.method6121(arg9, null);
		if (-arg10.width <= local109 && arg10.width >= local109 && -arg10.height <= local96 && local96 <= arg10.height) {
			arg6.method5893(arg0, 0, arg10.width / 2 + local109 + arg0, 1, 0, null, arg2, arg8, 50, arg9, 0, arg10.height / 2 + arg2 - local117 - local96 - arg5, null, arg3, local103);
		}
	}

}
