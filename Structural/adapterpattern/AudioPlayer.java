package adapterpattern;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;

	@Override
	public void play(String type, String name) {
		if (type.equalsIgnoreCase("MP3")) {
			System.out.println("AudioPlayer playing MP3: " + name);
		} else if (type.equalsIgnoreCase("RMVB")
				|| type.equalsIgnoreCase("MP4")) {
			mediaAdapter = new MediaAdapter(type);
			mediaAdapter.play(type, name);
		} else {
			System.out.println("Incompatible file format");
		}
	}
}
