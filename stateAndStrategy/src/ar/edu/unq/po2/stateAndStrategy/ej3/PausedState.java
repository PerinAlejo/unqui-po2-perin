package ar.edu.unq.po2.stateAndStrategy.ej3;

public class PausedState implements State {

	@Override
    public void play(MP3Player player) {
        System.out.println("Resuming song...");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MP3Player player) {
        System.out.println("Error: Song is already paused.");
    }

    @Override
    public void stop(MP3Player player) {
        System.out.println("Stopping song...");
        player.setState(new SelectingState());
    }

}
