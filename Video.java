package librarysystem.Model;

public class Video extends Item {
	public String videoName;
	public int quantityVideo;
	static int numberOfVideo = 0;
	Video() {
		super(null, 0, false);
		// TODO Auto-generated constructor stub
	}

	Video(String title, String videoName, int quantityVideo){
		super(title, ++numberOfVideo, true);
		this.videoName = videoName;
		this.quantityVideo = quantityVideo;
	}
	
}
