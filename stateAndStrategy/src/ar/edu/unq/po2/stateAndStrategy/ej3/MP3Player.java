package ar.edu.unq.po2.stateAndStrategy.ej3;

public class MP3Player {
	private State state;
    private Song song;

    public MP3Player(Song song) {
        this.song = song;
        this.state = new SelectingState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }
}
