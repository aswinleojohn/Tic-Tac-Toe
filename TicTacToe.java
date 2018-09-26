
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;  
  
public class TicTacToe{  
JFrame f;
int xo=0;
String winner=null;
int b1count=0,b2count=0,b3count=0,b4count=0,b5count=0,b6count=0,b7count=0,b8count=0,b9count=0;
TicTacToe(){  
    f=new JFrame();  
      
    JButton b1=new JButton();  
    JButton b2=new JButton();  
    JButton b3=new JButton();  
    JButton b4=new JButton();  
    JButton b5=new JButton();  
        JButton b6=new JButton();  
        JButton b7=new JButton();  
    JButton b8=new JButton();  
        JButton b9=new JButton();  
        JButton b10=new JButton("Restart"); 
        JButton b11=new JButton(); 
        JButton b12=new JButton("Close"); 
    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);  
    f.add(b6);f.add(b7);f.add(b8);f.add(b9); f.add(b10); f.add(b11); f.add(b12);  
  
    f.setLayout(new GridLayout(4,3));  
    //setting grid layout of 3 rows and 3 columns  
  
    f.setSize(300,300);  
    f.setVisible(true);  
    b1.addActionListener(new ActionListener() { 
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			b1count+=1;
			if(b1count==1) {
			if(xo%2==0) {
				b1.setText("X");
			}
			else {
				b1.setText("O");
			}
			winner=winnercheck(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			if(!(winner.equals(""))) {
				System.out.println("The winner is"+winner);
			JOptionPane.showMessageDialog(null, "The Winner is "+winner);
			reset();
			}
			xo+=1;
		} 
		else {
			b1.removeActionListener(this);
		}
		}
    	} );
    b2.addActionListener(new ActionListener() { 
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			b2count+=1;
			if(b2count==1) {
			if(xo%2==0) {
				b2.setText("X");
			}
			else {
				b2.setText("O");
			}
			winner=winnercheck(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			if(!(winner.equals(""))) {
				System.out.println("The winner is"+winner);
			JOptionPane.showMessageDialog(null, "The Winner is "+winner);
			reset();
			}
			xo+=1;
		} 
		else {
			b2.removeActionListener(this);
		}
		}
    	} );
    b3.addActionListener(new ActionListener() { 
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			b3count+=1;
			if(b3count==1) {
			if(xo%2==0) {
				b3.setText("X");
			}
			else {
				b3.setText("O");
			}
			winner=winnercheck(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			if(!(winner.equals(""))) {
				System.out.println("The winner is"+winner);
			JOptionPane.showMessageDialog(null, "The Winner is "+winner);
			reset();
			}
			xo+=1;
		} 
		else {
			b3.removeActionListener(this);
		}
		}
    	} );
    b4.addActionListener(new ActionListener() { 
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			b4count+=1;
			if(b4count==1) {
			if(xo%2==0) {
				b4.setText("X");
			}
			else {
				b4.setText("O");
			}
			winner=winnercheck(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			if(!(winner.equals(""))) {
				System.out.println("The winner is"+winner);
			JOptionPane.showMessageDialog(null, "The Winner is "+winner);
			reset();
			}
			xo+=1;
		} 
		else {
			b4.removeActionListener(this);
		}
		}
    	} );
    b5.addActionListener(new ActionListener() { 
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			b5count+=1;
			if(b5count==1) {
			if(xo%2==0) {
				b5.setText("X");
			}
			else {
				b5.setText("O");
			}
			winner=winnercheck(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			if(!(winner.equals(""))) {
				System.out.println("The winner is"+winner);
			JOptionPane.showMessageDialog(null, "The Winner is "+winner);
			reset();
			}
			xo+=1;
		} 
		else {
			b5.removeActionListener(this);
		}
		}
    	} );
    b6.addActionListener(new ActionListener() { 
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			b6count+=1;
			if(b6count==1) {
			if(xo%2==0) {
				b6.setText("X");
			}
			else {
				b6.setText("O");
			}
			winner=winnercheck(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			if(!(winner.equals(""))) {
				System.out.println("The winner is"+winner);
			JOptionPane.showMessageDialog(null, "The Winner is "+winner);
			reset();
			}
			xo+=1;
		} 
		else {
			b6.removeActionListener(this);
		}
		}
    	} );
    b7.addActionListener(new ActionListener() { 
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			b7count+=1;
			if(b7count==1) {
			if(xo%2==0) {
				b7.setText("X");
			}
			else {
				b7.setText("O");
			}
			winner=winnercheck(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			if(!(winner.equals(""))) {
				System.out.println("The winner is"+winner);
			JOptionPane.showMessageDialog(null, "The Winner is "+winner);
			reset();
			}
			xo+=1;
		} 
		else {
			b7.removeActionListener(this);
		}
		}
    	} );
    b8.addActionListener(new ActionListener() { 
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			b8count+=1;
			if(b8count==1) {
			if(xo%2==0) {
				b8.setText("X");
			}
			else {
				b8.setText("O");
			}
			winner=winnercheck(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			if(!(winner.equals(""))) {
				System.out.println("The winner is"+winner);
			JOptionPane.showMessageDialog(null, "The Winner is "+winner);
			reset();
			}
			xo+=1;
		} 
		else {
			b8.removeActionListener(this);
		}
		}
    	} );
    b9.addActionListener(new ActionListener() { 
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			b9count+=1;
			if(b9count==1) {
			if(xo%2==0) {
				b9.setText("X");
			}
			else {
				b9.setText("O");
			}
			winner=winnercheck(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			if(!(winner.equals(""))) {
				System.out.println("The winner is"+winner);
			JOptionPane.showMessageDialog(null, "The Winner is "+winner);
			reset();
			}
			xo+=1;
		} 
		else {
			b9.removeActionListener(this);
		}
		}
    	} );
    b10.addActionListener(new ActionListener() { 
		@Override
		public void actionPerformed(ActionEvent arg0) {
			reset();
		}
    });
    b12.addActionListener(new ActionListener() { 
		@Override
		public void actionPerformed(ActionEvent arg0) {
			f.dispose();
		}
    });
    
}
String winnercheck(JButton b1,JButton b2,JButton b3,JButton b4,JButton b5,JButton b6,JButton b7,JButton b8,JButton b9) {
	if(b1.getText()==b2.getText() && b2.getText()==b3.getText() && b1.getText()!=null && b2.getText()!=null && b3.getText()!=null) {
		return b1.getText();
	}
	else if(b4.getText()==b5.getText() && b5.getText()==b6.getText() && b4.getText()!=null && b5.getText()!=null && b6.getText()!=null) {
		return b4.getText();
	}
	else if(b7.getText()==b8.getText() && b8.getText()==b9.getText() && b7.getText()!=null && b8.getText()!=null && b9.getText()!=null) {
		return b7.getText();
	}
	else if(b1.getText()==b4.getText() && b4.getText()==b7.getText() && b1.getText()!=null && b4.getText()!=null && b7.getText()!=null) {
		return b1.getText();
	}
	else if(b2.getText()==b5.getText() && b5.getText()==b8.getText() && b2.getText()!=null && b5.getText()!=null && b8.getText()!=null) {
		return b2.getText();
	}
	else if(b3.getText()==b6.getText() && b6.getText()==b9.getText() && b3.getText()!=null && b6.getText()!=null && b9.getText()!=null) {
		return b3.getText();
	}
	else if(b1.getText()==b5.getText() && b5.getText()==b9.getText() && b1.getText()!=null && b5.getText()!=null && b9.getText()!=null) {
		return b1.getText();
	}
	else if(b3.getText()==b5.getText() && b5.getText()==b7.getText() && b3.getText()!=null && b5.getText()!=null && b7.getText()!=null) {
		return b3.getText();
	}
	return "";
	
}
void reset() {
	f.dispose();
	new TicTacToe();
}
public static void main(String[] args) {  
    new TicTacToe();  
    
}  
}  
