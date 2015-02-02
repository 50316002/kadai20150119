package framesystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import Calculation_lib.Tesrcalculation_lib;

public class FrameSystemView extends Frame implements ActionListener,WindowListener{
private TextField text1 = new TextField("",10);
private TextField text2 =new TextField("",10);
private Button button1 =new Button("ë´ÇµéZ");
private TextField text3 =new TextField("",10);
private TextField m1 =new TextField("");
private TextField m2 =new TextField("");
private TextField m3 =new TextField("");
private TextField ms1 =new TextField("");
private TextField ms2 =new TextField("");
private TextField ms3 =new TextField("");
private Button bm =new Button("M/M/1");
private Button bms =new Button("M/M/S");


	public FrameSystemView(FrameSystemController controller) {
		// TODO Auto-generated constructor stub
	addWindowListener(this);
	setTitle("FrameSystem");
	setLayout(new FlowLayout(FlowLayout.CENTER));
	add(text1);
	add(text2);
	add(text3);
	add(new Label("ìöÇ¶"))ÅG
	add(button1);
	add(new Label ("É…"))ÅG
	add(m1);
	add(new Label ("É "));
	add(m2);
	add(bm);
	add(new Label("ïΩãœånì‡êlêî"));
	add(m3);
	add(ms1);
	add(new Label ("É…"))ÅG
	add(ms2);
	add(new Label ("É "))ÅG
	add(bms);
	add(new Label ("ïΩãœånì‡êlêî"));
	add(ms3);
	button1.addActionListener(this);	
	bm.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int val1=Integer.parseInt(text1.getText());
		int val2=Integer.parseInt(text2.getText());
		//text3.setText(String.valueOf(val1+val2));
		Tesrcalculation_lib clib = new Tesrcalculation_lib(val1,val2);
		text3.setText(String.valueOf(clib.getPlus()));
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
