public class TestPetMo {
	public static void main(String[] args) {
		Petmo pm = new Petmo("dog");

		pm.setPangalan("Boom");
		pm.setEdad(7);
		pm.setIngay("rawr");
		pm.setKasarian("bakla");

		pm.makeNoise();
		pm.tellName();
		pm.tellGender();
		pm.tellAge();
	}
}
