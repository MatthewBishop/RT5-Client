import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
	public static int anInt6832 = 0;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)I")
	public static int method6117() {
		@Pc(5) LruHashTable local5 = Static92.aClass98_9;
		synchronized (Static92.aClass98_9) {
			return Static92.aClass98_9.method2613();
		}
	}
}
