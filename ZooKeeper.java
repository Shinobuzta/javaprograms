class Mammal {
	String name = "furry ";
	String makeNoise() { return "generic noise"; }
}
class Zebra extends Mammal {
	String name = "stripes ";
	String makeNoise() { return "bray"; }
}
public class ZooKeeper
{
	public static void main(String[] args) { new ZooKeeper().go(); }
	void go() {
	Mammal m = new Zebra();
	Zebra z = (Zebra) m;
	System.out.println(z.name + m.makeNoise());
	}
}