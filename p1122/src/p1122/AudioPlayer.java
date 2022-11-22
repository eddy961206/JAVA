package p1122;

public class AudioPlayer extends Player {

	@Override
	void play(int pos) {
		System.out.println("오디오 재생합니다");
	}

	@Override
	void stop() {
		System.out.println("오디오 멈춥니다");
	}

}
