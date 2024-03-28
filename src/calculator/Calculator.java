package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	JFrame jf;
	JLabel displayLabel;
	JButton sixButton,oneButton,twoButton,threeButton,dotButton,zeroButton,fiveButton,fourButton,eightButton,nineButton,sevenButton,clearButton,multiButton,minusButton,equalButton,divButton,plusButton;
	boolean isoperatorClicked=false;
	String oldValue; 
	String newValue;
	float oldValueF;
	float newValueF;
	float result;
	char operator;
	
	public Calculator(){
	    jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(445,600);
		jf.setLocation(450,100);
		jf.getContentPane().setBackground(Color.blue);
		
		 displayLabel=new JLabel();
		displayLabel.setBounds(30,40,369,60);
		displayLabel.setBackground(Color.black);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("serif",Font.PLAIN,30));
		jf.add(displayLabel);
		
		 sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 70, 70);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,35));
		sevenButton.setBackground(Color.yellow);
		jf.add(sevenButton);
		
		 eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 70, 70);
		eightButton.addActionListener(this);
		eightButton.setFont(new Font("Arial",Font.PLAIN,35));
		eightButton.setBackground(Color.yellow);
		jf.add(eightButton);
		
		 nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 70, 70);
		nineButton.addActionListener(this);
		nineButton.setFont(new Font("Arial",Font.PLAIN,35));
		nineButton.setBackground(Color.yellow);
		jf.add(nineButton);
		
		 fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 70, 70);
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Arial",Font.PLAIN,35));
		fourButton.setBackground(Color.yellow);
		jf.add(fourButton);
		
		 fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 70, 70);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Arial",Font.PLAIN,35));
		fiveButton.setBackground(Color.yellow);
		jf.add(fiveButton);
		
		 sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 70, 70);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Arial",Font.PLAIN,35));
		sixButton.setBackground(Color.yellow);
		jf.add(sixButton);
		
		 oneButton=new JButton("1");
		oneButton.setBounds(30, 330, 70, 70);
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Arial",Font.PLAIN,35));
		oneButton.setBackground(Color.yellow);
		jf.add(oneButton);
		
		 twoButton=new JButton("2");
		twoButton.setBounds(130, 330, 70, 70);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Arial",Font.PLAIN,35));
		twoButton.setBackground(Color.yellow);
		jf.add(twoButton);
		
		 threeButton=new JButton("3");
		threeButton.setBounds(230, 330, 70, 70);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Arial",Font.PLAIN,35));
		threeButton.setBackground(Color.yellow);
		jf.add(threeButton);
		
		 dotButton=new JButton(".");
		dotButton.setBounds(30, 445, 55, 55);
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("Arial",Font.PLAIN,45));
		dotButton.setBackground(Color.yellow);
		jf.add(dotButton);
		
		 zeroButton=new JButton("0");
		zeroButton.setBounds(130, 430, 70, 70);
		zeroButton.addActionListener(this);
		zeroButton.setFont(new Font("Arial",Font.PLAIN,35));
		zeroButton.setBackground(Color.yellow);
		jf.add(zeroButton);
		
		 equalButton=new JButton("=");
		equalButton.setBounds(230, 430, 70, 70);
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Arial",Font.PLAIN,35));
		equalButton.setBackground(Color.yellow);
		jf.add(equalButton);
		
		 divButton=new JButton("/");
		divButton.setBounds(330, 210, 70, 50);
		divButton.addActionListener(this);
		divButton.setFont(new Font("Arial",Font.PLAIN,25));
		divButton.setForeground(Color.black);
		divButton.setBackground(Color.red);
		jf.add(divButton);
		
		 multiButton=new JButton("*");
		multiButton.setBounds(330, 290, 70, 50);
		multiButton.addActionListener(this);
		multiButton.setFont(new Font("Arial",Font.PLAIN,35));
	//	multiButton.setForeground(Color.red);
		multiButton.setBackground(Color.red);
		jf.add(multiButton);
		
		 minusButton=new JButton("-");
		minusButton.setBounds(330, 370, 70, 50);
		minusButton.addActionListener(this);
		minusButton.setFont(new Font("Arial",Font.PLAIN,35));
	//	minusButton.setForeground(Color.red);
		minusButton.setBackground(Color.red);
		jf.add(minusButton);
		
		 plusButton=new JButton("+");
		plusButton.setBounds(330, 450, 70, 50);
		plusButton.addActionListener(this);
		plusButton.setFont(new Font("Arial",Font.PLAIN,35));
	//	plusButton.setForeground(Color.red);
		plusButton.setBackground(Color.red);

		jf.add(plusButton);
		
		  clearButton = new JButton("C");
		clearButton.setBounds(350, 130, 50, 50);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Arial",Font.PLAIN,20));
		clearButton.setBackground(Color.red);

		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	
	public static void main(String[] args) {
		new Calculator ();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==oneButton) {
			if(isoperatorClicked) {
				displayLabel.setText("1");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
			
		    }else if(e.getSource()==twoButton) {
			if(isoperatorClicked){
				displayLabel.setText("2");
				isoperatorClicked=false;
			}else{
				displayLabel.setText(displayLabel.getText()+"2");
			}
			
		    }else if (e.getSource()==threeButton) {
			if(isoperatorClicked){
				displayLabel.setText("3");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
			
		    }else if(e.getSource()==fourButton) {
			if(isoperatorClicked){
				displayLabel.setText("4");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
			
		    }else if(e.getSource()==fiveButton) {
			if(isoperatorClicked){
				displayLabel.setText("5");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
			
	    	}else if(e.getSource()==sixButton) {
			if(isoperatorClicked){
				displayLabel.setText("6");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");	
			}
			
		    }else if(e.getSource()==sevenButton) {
			if(isoperatorClicked){
				displayLabel.setText("7");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
	    	}else if(e.getSource()==eightButton) {
			if(isoperatorClicked){
				displayLabel.setText("8");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
			
	    	}else if (e.getSource()==nineButton) {
			if(isoperatorClicked){
				displayLabel.setText("9");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
			
		    }else if (e.getSource()==zeroButton) {
			if(isoperatorClicked){
				displayLabel.setText("0");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
			
		    }else if (e.getSource()==dotButton) {
			if(isoperatorClicked){
				displayLabel.setText(".");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}
			
		    }else if(e.getSource()==clearButton) {
			displayLabel.setText("");
			
		    }else if(e.getSource()==multiButton) {
			 if (isoperatorClicked=true) {
				  operator='*';
				  oldValue=displayLabel.getText();
			 }
		    }else if(e.getSource()==minusButton) {
			 if(isoperatorClicked=true) {
				  operator='-';
				  oldValue=displayLabel.getText();
			 }
	    	}else if(e.getSource()==plusButton) {
			 if (isoperatorClicked=true) {
				  operator='+';
				  oldValue=displayLabel.getText();
				
			 }
	    	}else if(e.getSource()==divButton) {
			 if (isoperatorClicked=true) {
				  operator='/';
				  oldValue=displayLabel.getText();
			 }
		    }else if(e.getSource()==equalButton) {
			if(isoperatorClicked=true) {
				newValue=displayLabel.getText();
				oldValueF=Float.parseFloat(oldValue);
			    newValueF=Float.parseFloat(newValue);
				  switch(operator) {
				  case'+':
					  result=oldValueF+newValueF;
					  break;
				  case'-':
					  result=oldValueF-newValueF;
					  break;
				  case'*':
			        result=newValueF*oldValueF;
					  break;
				  case'/':
					  result=oldValueF/newValueF;
					  break;
				  }//switch
	    	    displayLabel.setText(result+"");
	    		isoperatorClicked=false;
			}
		}
		
		
	}//ActionListener
}//class
