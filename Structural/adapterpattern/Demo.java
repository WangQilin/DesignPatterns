package adapterpattern;

public class Demo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "you are beautiful");
		audioPlayer.play("mp4", "we are the world");
		audioPlayer.play("rmvb", "interstellar");
		audioPlayer.play("mov", "come on baby don't be shy!");
	}

}
