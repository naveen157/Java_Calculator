import java.awt.*;
import java.awt.event.*;
//import CalculatorEventListener;

public class Cal1 extends Frame
{
	TextField tf;
	Button b1;
	Button b2;
	public Cal1(){
		
		tf = new TextField();
		tf.setBounds(50,90,300,100);
		tf.setText("Hello");
		add(tf);
		
		b1 = new Button("1");
		b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		Button b7 = new Button("7");
		Button b8 = new Button("8");
		Button b9 = new Button("9");
		Button b0 = new Button("0");
		Button b_eq = new Button("=");
		Button b_mul = new Button("*");
		
		b1.setBounds(50,200,70,70);
		add(b1);
		b2.setBounds(200,200,70,70);
		add(b2);
		b3.setBounds(350,200,70,70);
		add(b3);
		
		b4.setBounds(50,350,70,70);
		add(b4);
		b5.setBounds(200,350,70,70);
		add(b5);
		b6.setBounds(350,350,70,70);
		add(b6);
		
		b7.setBounds(50,500,70,70);
		add(b7);
		b8.setBounds(200,500,70,70);
		add(b8);
		b9.setBounds(350,500,70,70);
		add(b9);
		
		
		b0.setBounds(200,650,70,70);
		add(b0);
		b_eq.setBounds(350,650,70,70);
		add(b_eq);
		b_mul.setBounds(50,650,70,70);
		add(b_mul);
		
		setSize(470,770);
		setTitle("Vihan Calculator");
		// no layout manager
		setLayout(null);
		//now frame will be visible, by default it is not visible
		setVisible(true);
		
		CalculatorEventListener cel = new CalculatorEventListener(this);
		b1.addActionListener(cel);
		b2.addActionListener(cel);
		b3.addActionListener(cel);
		b4.addActionListener(cel);
		b5.addActionListener(cel);
		b6.addActionListener(cel);
		b7.addActionListener(cel);
		b8.addActionListener(cel);
		b9.addActionListener(cel);
		b0.addActionListener(cel);
		b_eq.addActionListener(cel);
		b_mul.addActionListener(cel);
	}
	
	public static void main(String args[]){
		Cal1 c1 = new Cal1();
	}
}