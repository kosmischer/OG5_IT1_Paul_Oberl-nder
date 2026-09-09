package de.futurehome.tanksimulator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
	public TankSimulator f;

	public MyActionListener(TankSimulator f) {
		this.f = f;
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == f.btnBeenden)
			System.exit(0);
		
		if (obj == f.btnEinfuellen) {
			 double fuellstand = f.myTank.getFuellstand();
			 double maxFuellstand =f.myTank.getmaxFuellstand();
			 fuellstand = fuellstand + 5;
			 f.myTank.setFuellstand(fuellstand);

			 f.lblFuellstand.setText(""+fuellstand);
			 f.lblProzent.setText(""+fuellstand/maxFuellstand*100 + "%");
			 
		}
		
		if (obj == f.btnVerbrauchen) {
			 double fuellstand = f.myTank.getFuellstand();
			 double maxFuellstand =f.myTank.getmaxFuellstand();
			 fuellstand = fuellstand - 2;
			 f.myTank.setFuellstand(fuellstand);

			 f.lblFuellstand.setText(""+fuellstand);
			 f.lblProzent.setText(""+fuellstand/maxFuellstand*100 + "%");
		}
		
		if (obj == f.btnZuruecksetzen) {
			 double fuellstand = f.myTank.getFuellstand();
			 double maxFuellstand =f.myTank.getmaxFuellstand();
			 fuellstand = 0;
			 f.myTank.setFuellstand(fuellstand);

			 f.lblFuellstand.setText(""+fuellstand);
			 f.lblProzent.setText(""+fuellstand/maxFuellstand*100 + "%");
		}
		

	}
}