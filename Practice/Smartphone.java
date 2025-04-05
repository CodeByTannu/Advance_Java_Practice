package Practice;

public class Smartphone {
	private String brand;
	private String model;
	private int ram;
	private int storage;
	private String color;

	public void playmusic() {
		System.out.println("Playing music");
	}

	public void installapps() {
		System.out.println("intalling process");
	}

	public Smartphone(int age) {

	}
}

class Program {
	public static void main(String[] args) {
		Smartphone s = new Smartphone(13);
		s.playmusic();
		s.installapps();

	}

}
