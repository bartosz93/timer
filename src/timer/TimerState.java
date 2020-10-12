package timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.Timer;

public class TimerState {

	private int secondsPassed = 0;
	private List<TimerStateChangedEvent> listeners;

	private Timer timer = new Timer(1000, new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			secondsPassed++;
			
			for (TimerStateChangedEvent listener : listeners) {
				listener.onTimerStateChanged(secondsPassed);
			}
			
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
		timer.restart();
	}
}
