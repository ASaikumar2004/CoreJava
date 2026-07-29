package Interfaces;

public class Oneplus implements Camera, Music {
	@Override
	public void click() {
		System.out.println("Image captured using Oneplus mobile");
	}
	
	@Override //Optional
	public void playmusic() {
		System.out.println("i will play music using oneplus mobile ");
	}

}
