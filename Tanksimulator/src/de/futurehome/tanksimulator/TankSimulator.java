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
import java.awt.Scrollbar;
import java.awt.TextArea;

@SuppressWarnings("serial")
public class TankSimulator extends Frame {
	
	public Tank myTank;
	
	private Label lblUeberschrift = new Label("Tank-Simulator");
	public  Label lblFuellstand = new Label("Füllstand: ");
	public Label lblProzent = new Label("Füllstand (In %): ");
	public TextArea  lblLog = new TextArea("(Log Funktioniert NICHT für die Scrollbar!!)");
	
//	lblFuellstand.setPreferredSize(new Dimension(200, 50));
//  lblProzent.setPreferredSize(new Dimension(200, 50));

	
	public Button btnBeenden = new Button("Beenden");
	public Button btnEinfuellen = new Button("Einfüllen");
	public Button btnVerbrauchen = new Button("Verbrauchen");
	public Button btnZuruecksetzen = new Button("Zurücksetzen");
	
	public Scrollbar slbFuellstand = new Scrollbar(
			Scrollbar.HORIZONTAL, 0, 1, 0, 201
			);
			
	
	private Panel pnlNorth = new Panel();
	private Panel pnlCenter = new Panel(new GridLayout(0,1));
	private Panel pnlSouth = new Panel(new GridLayout(1,0));
	private Panel sndPnlSouth = new Panel(new BorderLayout());

	private MyActionListener myActionListener = new MyActionListener(this);
	private MyAdjustmentListener myAdjustmentListener = new MyAdjustmentListener(this);

	public TankSimulator() {
		super("Tank-Simulator");
		
		myTank = new Tank(0, 200);
		
		this.lblUeberschrift.setFont(new Font("", Font.BOLD, 16));
		this.pnlNorth.add(this.lblUeberschrift);
		this.pnlCenter.add(this.lblFuellstand);
		this.pnlCenter.add(this.lblProzent);
		this.pnlCenter.add(this.lblLog);
		this.pnlSouth.add(this.btnEinfuellen);
		this.pnlSouth.add(this.btnVerbrauchen);
		this.pnlSouth.add(this.btnZuruecksetzen);
		this.pnlSouth.add(this.btnBeenden);
		
		this.sndPnlSouth.add(this.pnlSouth, BorderLayout.NORTH);
		this.sndPnlSouth.add(this.slbFuellstand, BorderLayout.SOUTH);
		
		this.add(this.pnlNorth, BorderLayout.NORTH);
		this.add(this.pnlCenter, BorderLayout.CENTER);
		this.add(this.sndPnlSouth, BorderLayout.SOUTH);
		this.pack();
		this.setVisible(true);
		
		// Ereignissteuerung
		this.btnEinfuellen.addActionListener(myActionListener);
		this.btnVerbrauchen.addActionListener(myActionListener);
		this.btnBeenden.addActionListener(myActionListener);
		this.btnZuruecksetzen.addActionListener(myActionListener);
		this.slbFuellstand.addAdjustmentListener(myAdjustmentListener);
	}

	public static void main(String argv[]) {
		new TankSimulator();
	}
}