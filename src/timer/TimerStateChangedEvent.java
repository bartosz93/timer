package timer;

public interface TimerStateChangedEvent {
	
	void onTimerStateChanged(int seconds);
	
}
