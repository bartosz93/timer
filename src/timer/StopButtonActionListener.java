package timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopButtonActionListener implements ActionListener {

	private TimerState timerState;

	public StopButtonActionListener(TimerState timerState) {
		this.timerState = timerState;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.timerState.stop();
	}

}
