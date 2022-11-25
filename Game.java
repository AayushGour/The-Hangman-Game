import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class Game extends JApplet implements ActionListener
	{char play='n';JButton play_button;Image play_;

	public Game() throws Exception
		{setLayout(null);
		setBackground(Color.BLACK);
		play_button = new JButton(new ImageIcon("D:/AG/Pendrive/Mini 2/play.png"));
		play_button.addActionListener(this);
		play_button.setBounds(150,460,139,64);
		add(play_button);
		
		
		
		}
	public void init()
		{
		}
	public void actionPerformed(ActionEvent e)
		{play='y';repaint();}
	public void paint(Graphics g)
		{
		}
	}

/*<applet code="Game.class" width=1360 height =650></applet>*/