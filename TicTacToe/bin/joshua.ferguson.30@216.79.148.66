/**
 * 
 */

/**
 * @author Joshua Ferguson
 * a tic tac toe program
 * 
 * If you wondering why this looks a little different I'm learning a bit
 * more about eclipse and how I can automate some of the basic parts of structured programming
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TicTacToe extends JFrame implements ActionListener //extends Jframe
{
	private static int[][] winCombinations = new int[][] {
		{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, //horizontal wins
		{0, 3, 6}, {1, 4, 7}, {2, 5, 8}, //vertical wins
		{0, 4, 8}, {2, 4, 6}			 //diagonal wins
};
    private static JButton [] button = new JButton[12];//an array of button objects
    
    private int count = 0;
    boolean win=false;
    private int again=1000;
    private int scoreX=0;
    private int scoreO=0;
    // variables for keeping track of turn, win status, score and whether or not the user wants to play again.
    
	
    public TicTacToe () 
    {           
        super ("Tic-Tac-Toe");
        setSize (300, 300);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLayout (new GridLayout (4, 3));
        init ();
    }

    private void init () {           
        count = 0;
        for (int i = 0; i < 9; ++i) 
        {
            button [i] = new JButton ("");
            button [i].addActionListener (this);
            add(button [i]);
        }//buttons for the board
        String letter = (count+1 % 2 == 1) ? "X" : "O";
        button [9]= new JButton("Player : "+letter);
        add (button [9]);
        button [10] = new JButton("Score");
        add (button [10]);
        button [11] = new JButton("X: "+ scoreX +" O: "+ scoreO);
        add (button [11]);
        setVisible (true);
    }
    public void actionPerformed (ActionEvent a) {    
        String letter = (++count % 2 == 1) ? "X" : "O";
        /*Display X's or O's on the buttons*/
        //count++;
        for (JButton jb : button) 
        if (a.getSource () == jb) {
            jb.setText (letter);
            jb.setEnabled (false);
        }
        redrawButtons();
        for(int i=0; i<=7; i++){ // check for the winning combinations
    		if( button[winCombinations[i][0]].getText().equals(button[winCombinations[i][1]].getText()) && 
    			button[winCombinations[i][1]].getText().equals(button[winCombinations[i][2]].getText()) && 
    			button[winCombinations[i][0]].getText() != ""){//the winning is true
    			win = true;
    		}
    	}
        if(win == true){ // if the game ends let the user know who wins and give option to play again
			again=JOptionPane.showConfirmDialog(null, letter + " wins the game!  Do you want to play again?",letter + "won!",JOptionPane.YES_NO_OPTION);
			if (letter.equalsIgnoreCase("x"))
				scoreX++;
			else
				scoreO++;
		} else if(count == 9 && win == false){//tie game, announce and ask if the user want to play again
			again=JOptionPane.showConfirmDialog(null, "The game was tie!  Do you want to play again?","Tie game!",JOptionPane.YES_NO_OPTION);
			
			win=true;
		}	
		
		if(again==JOptionPane.YES_OPTION && win==true){ // if the user want to play again clear all the button and start over
					
				win=false;
				for(JButton jb : button)
					getContentPane().remove(jb);
				count=0;
	            init ();
		}
		else if(again==JOptionPane.NO_OPTION){
			System.exit(0); // exit game if the user do not want to play again
		}
        }
    public void redrawButtons(){
    	getContentPane().remove(button[9]);
    	
    	String letter =((count+1) % 2 == 1) ? "X" : "O";
    	button [9]= new JButton("Player : "+letter);
    	add (button[9]);
    	getContentPane().remove(button[10]);
    	add (button[10]);
    	getContentPane().remove(button[11]);
    	add (button[10]);
    }// this allows me to change the player turn button.
    
    
    /**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TicTacToe();//launch game

	}
	

}
