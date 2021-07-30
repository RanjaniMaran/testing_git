package librarysystem.Model;

public class Audio extends Item{
	public String audioName;
	public int quantityAudio;
	static int numberOfAudio = 0;
	Audio() {
		super(null, 0, false);
		// TODO Auto-generated constructor stub
	}

	Audio(String title, String audioName, int quantityAudio){
		super(title, ++numberOfAudio, true);
		this.audioName = audioName;
		this.quantityAudio = quantityAudio;
	}
	
	

}
  