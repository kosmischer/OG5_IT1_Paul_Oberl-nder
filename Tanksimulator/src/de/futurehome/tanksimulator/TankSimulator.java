package de.futurehome.tanksimulator;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

@SuppressWarnings("serial")
public class TankSimulator extends Frame {
	
	public Tank myTank;
	
	private Label lblUeberschrift = new Label("Tank-Simulator");
	public  Label lblFuellstand = new Label("     ");
	public Label lblProzent = new Label("     ");
	
//	lblFuellstand.setPreferredSize(new Dimension(200, 50));
//  lblProzent.setPreferredSize(new Dimension(200, 50));

	
	public Button btnBeenden = new Button("Beenden");
	public Button btnEinfuellen = new Button("Einfüllen");
	public Button btnVerbrauchen = new Button("Verbrauchen");
	public Button btnZuruecksetzen = new Button("Zurücksetzen");
	
	private Panel pnlNorth = new Panel();
	private Panel pnlCenter = new Panel(new GridLayout(0,1));
	private Panel pnlSouth = new Panel(new GridLayout(1, 0));

	private MyActionListener myActionListener = new MyActionListener(this);

	public TankSimulator() {
		super("Tank-Simulator");
		
		myTank = new Tank(0, 200);
		
		this.lblUeberschrift.setFont(new Font("", Font.BOLD, 16));
		this.pnlNorth.add(this.lblUeberschrift);
		this.pnlCenter.add(this.lblFuellstand);
		this.pnlCenter.add(this.lblProzent);
		this.pnlSouth.add(this.btnEinfuellen);
		this.pnlSouth.add(this.btnVerbrauchen);
		this.pnlSouth.add(this.btnZuruecksetzen);
		this.pnlSouth.add(this.btnBeenden);
		this.add(this.pnlNorth, BorderLayout.NORTH);
		this.add(this.pnlCenter, BorderLayout.CENTER);
		this.add(this.pnlSouth, BorderLayout.SOUTH);
		this.pack();
		this.setVisible(true);
		
		// Ereignissteuerung
		this.btnEinfuellen.addActionListener(myActionListener);
		this.btnVerbrauchen.addActionListener(myActionListener);
		this.btnBeenden.addActionListener(myActionListener);
		this.btnZuruecksetzen.addActionListener(myActionListener);
	}

	public static void main(String argv[]) {
		new TankSimulator();
	}
}