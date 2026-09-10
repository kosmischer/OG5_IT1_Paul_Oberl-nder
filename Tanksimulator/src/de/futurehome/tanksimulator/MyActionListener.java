package de.futurehome.tanksimulator;
import java.awt.event.ActionEvent;
import java.time.LocalTime;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;

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
			 if(fuellstand<0) {fuellstand = 0; f.myTank.setFuellstand(0);}
			 if(fuellstand>200) {fuellstand = 200; f.myTank.setFuellstand(200);}

			 f.lblFuellstand.setText("Füllstand: "+fuellstand);
			 f.lblProzent.setText("Füllstand (In %): "+fuellstand/maxFuellstand*100 + "%");
			 f.lblLog.setText(f.lblLog.getText() + "\n Füllstand auf " + fuellstand + " erhöht. (" + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + ")");
			 
		}
		
		if (obj == f.btnVerbrauchen) {
			 double fuellstand = f.myTank.getFuellstand();
			 double maxFuellstand =f.myTank.getmaxFuellstand();
			 fuellstand = fuellstand - 2;
			 f.myTank.setFuellstand(fuellstand);
			 if(fuellstand<0) {fuellstand = 0; f.myTank.setFuellstand(0);}
			 if(fuellstand>200) {fuellstand = 200; f.myTank.setFuellstand(200);}

			 f.lblFuellstand.setText("Füllstand: "+fuellstand);
			 f.lblProzent.setText("Füllstand (In %): "+fuellstand/maxFuellstand*100 + "%");
			 f.lblLog.setText(f.lblLog.getText() + "\n Füllstand auf " + fuellstand + " reduziert. (" + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + ")");
		}
		
		if (obj == f.btnZuruecksetzen) {
			 double fuellstand = f.myTank.getFuellstand();
			 double maxFuellstand =f.myTank.getmaxFuellstand();
			 fuellstand = 0;
			 f.myTank.setFuellstand(fuellstand);
			 if(fuellstand<0) {fuellstand = 0; f.myTank.setFuellstand(0);}
			 if(fuellstand>200) {fuellstand = 200; f.myTank.setFuellstand(200);}

			 f.lblFuellstand.setText("Füllstand: "+fuellstand);
			 f.lblProzent.setText("Füllstand (In %): "+fuellstand/maxFuellstand*100 + "%");
			 f.lblLog.setText(f.lblLog.getText() + "\n Füllstand auf Null gesetzt. (" + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + ")");
		}
		

	}
}