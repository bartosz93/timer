package timer.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import timer.TimerState;

public class StartButtonActionListener implements ActionListener {
	
	private TimerState timerState;
	
	public StartButtonActionListener(TimerState timerState) {
		this.timerState = timerState;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.timerState.start();
	}
	
}
