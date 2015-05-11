package adapterpattern;

public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter(String type) {
		if (type.equalsIgnoreCase("RMVB")) {
			advancedMediaPlayer = new RMVBPlayer();
		} else if (type.equalsIgnoreCase("MP4")) {
			advancedMediaPlayer = new MP4Player();
		}
	}

	@Override
	public void play(String type, String name) {
		if (type.equalsIgnoreCase("RMVB")) {
			advancedMediaPlayer.playRMVB(name);
		} else if (type.equalsIgnoreCase("MP4")) {
			advancedMediaPlayer.playMP4(name);
		}
	}

}
