public class KendaraanMain{
	public static void main(String[] args){
		Motor motor = new Motor();
		Mobil mobil = new Mobil();
		
		motor.jumping();
		System.out.println("Roda motor : " + motor.roda);
		mobil.mundur();
		System.out.println("Roda mobil : " + mobil.roda);

	}
}