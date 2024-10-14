package ar.edu.unq.po2.stateAndStrategy.ej3;

public interface State {
	void play(MP3Player player);
    void pause(MP3Player player);
    void stop(MP3Player player);
	
}
