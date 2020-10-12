package timer.eventlistener;

public interface TimerStateChangedEvent {
	
	void onTimerStateChanged(int seconds);
	
}
