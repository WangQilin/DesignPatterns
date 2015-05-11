package adapter;

public class MP4Player implements AdvancedMediaPlayer {

	@Override
	public void playRMVB(String name) {
	}

	@Override
	public void playMP4(String name) {
		System.out.println("MP4Player playing " + name);
	}

}
