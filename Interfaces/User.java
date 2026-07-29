package Interfaces;

public class User {
	public static void takephoto(Camera cam) {
		cam.click();
	}

	
	public static void main(String[] args) {
		Camera cam=new Oneplus();     //we cannot create class for interface and abstract because its contains abstract methods
		Music mus=new Samsung();
		takephoto(cam);
		mus.playmusic();
	}

}
