//Magic8BallGUI.java
//Mike Norrito 
//making a GUI out of code I have already prewritten 


import javax.swing.*;
import javax.swing.ImageIcon; //NOT SURE IF NEEDED JUST MAKING SURE 
import java.security.SecureRandom;
import java.awt.*;
import java.awt.event.*;


public class Magic8BallGUI extends JFrame implements ActionListener
{
	JLabel title = new JLabel("Magic 8 Ball");
	JLabel underTitle = new JLabel("Ask The all Powerful Magic 8 Ball a Question");
	JLabel parentasees = new JLabel("(a YES or NO Question Please!)");
	JTextField yesNo = new JTextField(22);
	JLabel echoRes = new JLabel("");

	JLabel answer = new JLabel("");

	JButton button = new JButton("Answer Your Question");

	JButton quit = new JButton("Quit Bitch");//Figure out later

	public Magic8BallGUI()
	{

		super("Magic 8 Ball");
		final int WIDTH = 600;
		final int HEIGHT = 600;
		setSize(WIDTH,HEIGHT);
		setResizable(false);//resize turned off cause I said so thats why
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);//CENTERS THE FRAME

		//ADD IMAGE ICON WHEN YOU HAVE ONE HERE 
		Image icon = Toolkit.getDefaultToolkit().getImage("poke.jpg");
		setIconImage(icon);

		add(title);
		add(underTitle);
		add(parentasees);
		add(yesNo);
		add(answer);
		add(button);
		//add(quit);


		button.addActionListener(this);
		 //quit.addActionListener(setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE));
	}

	@Override
	//basically a button to start the original code 
	public void actionPerformed(ActionEvent e)
	{
		M8Ball();
	}
//mehtod that handles all the special code 
	public void M8Ball()
	{
		//vars and constants
		String[] responses = {"Ask again later", "Are you joking? No stop it, Don't", "Yes go ahead Embarass yourself", "Yes A thoasand times yes!", "Not only was your question dumb... it was so terrible that I need a minute to process it", "Yeah I guess", "Don't do anything stupid now", "Wait... that's a god idea", "Do it", "I'm gonna have to say no"};
		
		String question;
		//final String QUIT = "QUIT";


		
		

			//input phase 
		
		question = yesNo.getText();


//THIS IS WHAT YOU ALWAYS FORGET ABOUT STRINGS 

		int randomNum = (int)(Math.random() * responses.length);



		
		/*if (!question.equalsIgnoreCase(QUIT)) {

			echoRes.setText("you asked " + question);
			
		answer.setText(":" + responses[randomNum]);
		}*/
		/*(!question.equalsIgnoreCase(QUIT));*/

		answer.setText(responses[randomNum]);
	}
	
	}





