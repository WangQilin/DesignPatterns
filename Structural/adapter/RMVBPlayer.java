package adapter;

public class RMVBPlayer implements AdvancedMediaPlayer {

	@Override
	public void playRMVB(String name) {
		System.out.println("RMVBPlayer playing " + name);
	}

	@Override
	public void playMP4(String name) {
	}

}
