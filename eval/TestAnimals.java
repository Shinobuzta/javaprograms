public class TestAnimals
{
	public static void main(String[] args) {
		Cat c = new Cat();
		Chicken ck = new Chicken();
		Dog d = new Dog();
		Shark s = new Shark();

		System.out.println(c.cry()+"\t"+c.move()+"\t"+c.eat());
		System.out.println(ck.cry()+"\t"+ck.move()+"\t"+ck.eat());
		System.out.println(d.cry()+"\t"+d.move()+"\t"+d.eat());
		System.out.println(s.cry()+"\t"+s.move()+"\t"+s.eat());
	}
}