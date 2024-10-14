package ar.edu.unq.po2.stateAndStrategy.ej3;

public class SelectingState implements State {

	@Override
    public void play(MP3Player player) {
        System.out.println("Playing song...");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MP3Player player) {
        System.out.println("Error: No song is playing.");
    }

    @Override
    public void stop(MP3Player player) {
        System.out.println("Already in song selection.");
    }
}
