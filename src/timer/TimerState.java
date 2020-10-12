package timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.Timer;

import timer.eventlistener.TimerStateChangedEvent;

public class TimerState {
	
	private int secondsPassed = 0;
	private List<TimerStateChangedEvent> listeners;
	
	private Timer timer = new Timer(1000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			secondsPassed++;
			runListeners();
		}
		
	});
	
	public TimerState(List<TimerStateChangedEvent> listeners) {
		this.listeners = listeners;
	}
	
	public void start() {
		timer.start();
	}
	
	public void stop() {
		timer.stop();
	}
	
	public void restart() {
		timer.stop();
		secondsPassed = 0;
		this.runListeners();
	}
	
	private void runListeners() {
		for (TimerStateChangedEvent listener : listeners) {
			listener.onTimerStateChanged(secondsPassed);
		}
		
	}
}
