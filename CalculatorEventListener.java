import java.awt.*;
import java.awt.event.*;

class CalculatorEventListener implements ActionListener
{
	Cal1 c;
	
	CalculatorEventListener(Cal1 c){
		this.c = c;
	}
 
	public void actionPerformed(ActionEvent e){
		
		String num = c.tf.getText();
		System.out.println(e.getActionCommand());
		switch(e.getActionCommand()){
			
			case "1" : if(c.tf.getText() != " ")
					   {
						num = num + c.tf.getText();
						c.tf.setText(num);
					    break;
					   }
			
			case "2" : c.tf.setText("2");
					   break;
				
			case "3" : c.tf.setText("3");
					   break;
					   
				
			case "4" : c.tf.setText("4");
					   break;
					   
			case "5" : c.tf.setText("5");
					   break;
			
			case "6" : c.tf.setText("6");
					   break;
					   
			case "7" : c.tf.setText("7");
					   break;
					   
			case "8" : c.tf.setText("8");
					   break;
					   
			case "9" : c.tf.setText("9");
					   break;
					   
			case "0" : c.tf.setText("0");
					   break;
					   
			case "*" : c.tf.setText("*");
					   break;
					   
			case "=" : c.tf.setText("=");
					   break;
					
			default  : c.tf.setText(" ");
					   


		/*if(num == "1"){
		  c.tf.setText("1");
		  System.out.println("Naveen Vihan");
		}
		else if(num == "2"){
			c.tf.setText("2");
		}else{
			c.tf.setText("Null");
			//c.tf.setText(num);
		} */
		}
	
	}
}