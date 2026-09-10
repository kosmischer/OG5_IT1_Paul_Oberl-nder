package de.futurehome.tanksimulator;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;


public class MyAdjustmentListener implements AdjustmentListener {
	public TankSimulator f;
	
	
	public MyAdjustmentListener(TankSimulator f) {
		this.f = f;
	}
	

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		Object obj = e.getSource();
		if(obj == f.slbFuellstand) {
			double maxFuellstand =f.myTank.getmaxFuellstand()+1;
			int fuellstand = f.slbFuellstand.getValue();
			f.myTank.setFuellstand(fuellstand);
			
			f.lblFuellstand.setText(""+fuellstand);
			 f.lblProzent.setText(""+fuellstand/(maxFuellstand-1)*100 + "%");
		}
		
	}
}
