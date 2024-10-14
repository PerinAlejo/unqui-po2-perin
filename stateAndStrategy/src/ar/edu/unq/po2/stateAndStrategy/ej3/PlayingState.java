package ar.edu.unq.po2.stateAndStrategy.ej3;

public class PlayingState implements State {

	 @Override
	    public void play(MP3Player player) {
	        System.out.println("Error: Song is already playing.");
	    }

	    @Override
	    public void pause(MP3Player player) {
	        System.out.println("Pausing song...");
	        player.setState(new PausedState());
	    }

	    @Override
	    public void stop(MP3Player player) {
	        System.out.println("Stopping song...");
	        player.setState(new SelectingState());
	    }

}
