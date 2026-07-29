package Interfaces;

public class Samsung implements Camera, Music{
	@Override
	public void click() {
		System.out.println("image captured using samsung");
	}
	
	@Override
	public void playmusic() {
		System.out.println("Using Samsung i will play music");
	}
}
