import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static378 {

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	public static int anInt7079;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Lclient!gd;")
	public static final LocalizedString ATTACK = new LocalizedString("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Z")
	public static boolean setVerifyId(@OriginalArg(1) int arg0) {
		Static1.verifyIdChanged = true;
		Protocol.verifyId = arg0 + 1 & 0xFFFF;
		return true;
	}
}
