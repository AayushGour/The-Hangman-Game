import java.io.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;


public class Hangman extends Applet implements ActionListener
	{String line, question, answer, hint;
	Font f1;JLabel label;
	
	char hintarr[],answerarr[],questionarr[];char in;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26;
	String s1,s2;
	Image img,logo;
	static Dialog d,end; 
	int random,ran,life,level=0,pass=0,co=0;

	
	void rand(int val)
		{
		Random r=new Random();
		random=r.nextInt(val);
		if(random>=0 && random<val)
			random=random+48;
		
		}

	
	
	public Hangman() throws Exception
		{
		
		Frame f= new Frame();
		d = new Dialog(f,"Welcome To Hangman", true);  
        		d.setLayout(new FlowLayout());  
        		Button b = new Button ("Start Game"); 
		b.addActionListener ( new ActionListener()  
        		{               		
            		public void actionPerformed( ActionEvent e )  
            			{
				Hangman.d.setVisible(false);}
			
        		});
		setForeground(Color.RED);
		UIManager.put("OptionPane.messageFont", new Font("Chiller", Font.BOLD, 35));
		UIManager.put("OptionPane.okButtonText","PLAY");

		JOptionPane.showMessageDialog(null,"","The Hangman Game",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("background.gif"));
		setVisible(false);
	
		setForeground(Color.RED);
		f1 = new Font("Chiller",Font.BOLD,35); 
		
  
		}


	public void init()
		{setBackground(Color.BLACK);
		s2="life1.jpg";
		
		String misc;
		life=5; 
		++level;
		String leveldatabase="F:/Project/The Hangman Game/files/database"+Integer.toString(level)+".txt";
		try{
		rand(19);
		BufferedReader br=new BufferedReader(new FileReader(leveldatabase));
		while((line=br.readLine())!=null)
			{if(line.charAt(0)==(char)random)
				{StringTokenizer st=new StringTokenizer(line,"&");
				
				while(st.hasMoreTokens())
					{misc=st.nextToken();
					question=st.nextToken();
					hint=st.nextToken();
					}
				}
			}
                    }
		catch(Exception e){}
		
		
		answerarr=question.toCharArray();
		questionarr=question.toCharArray(); 
		for(int i=0;i<question.length();i++)
			answerarr[i]='_';
		Random rn=new Random();
		int x=(int)Math.floor(0.6*(question.length()+1));
		co=question.length()-x;
		for(int i=0;i<x;i++)
			{ran=rn.nextInt(question.length());
			answerarr[ran]=questionarr[ran];
			}

		if(level>5)
			{destroy();setVisible(false);
			label=new JLabel("CONGRATULATIONS!!! YOU WON.");
			label.setForeground(Color.RED);
			label.setFont(f1);
			JOptionPane.showMessageDialog(null,label);System.exit(0); }
		Random r=new Random();
		random=r.nextInt(19);

		
  		for(int i=0;i<question.length();i++)
			{if(answerarr[i]=='_')
				co++;
			}
		
		
		setLayout(null);

		b1=new Button("A");
		b2=new Button("B");
		b3=new Button("C");
		b4=new Button("D");
		b5=new Button("E");
		b6=new Button("F");
		b7=new Button("G");
		b8=new Button("H");
		b9=new Button("I");
		b10=new Button("J");
		b11=new Button("K");
		b12=new Button("L");
		b13=new Button("M");
		b14=new Button("N");
		b15=new Button("O");
		b16=new Button("P");
		b17=new Button("Q");
		b18=new Button("R");
		b19=new Button("S");
		b20=new Button("T");
		b21=new Button("U");
		b22=new Button("V");
		b23=new Button("W");
		b24=new Button("X");
		b25=new Button("Y");
		b26=new Button("Z");
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		b4.setFont(f1);
		b5.setFont(f1);
		b6.setFont(f1);
		b7.setFont(f1);
		b8.setFont(f1);
		b9.setFont(f1);
		b10.setFont(f1);
		b11.setFont(f1);
		b12.setFont(f1);
		b13.setFont(f1);
		b14.setFont(f1);
		b15.setFont(f1);
		b16.setFont(f1);
		b17.setFont(f1);
		b18.setFont(f1);
		b19.setFont(f1);
		b20.setFont(f1);
		b21.setFont(f1);
		b22.setFont(f1);
		b23.setFont(f1);
		b24.setFont(f1);
		b25.setFont(f1);
		b26.setFont(f1);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		b24.addActionListener(this);
		b25.addActionListener(this);
		b26.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b17);
		add(b18);
		add(b19);
		add(b20);
		add(b21);
		add(b22);
		add(b23);
		add(b24);
		add(b25);
		add(b26);

		b1.setBounds(5,500,40,40);
		b2.setBounds(50,500,40,40);
		b3.setBounds(95,500,40,40);
		b4.setBounds(140,500,40,40);
		b5.setBounds(185,500,40,40);
		b6.setBounds(230,500,40,40);
		b7.setBounds(275,500,40,40);
		b8.setBounds(320,500,40,40);
		b9.setBounds(365,500,40,40);
		b10.setBounds(410,500,40,40);
		b11.setBounds(455,500,40,40);
		b12.setBounds(500,500,40,40);
		b13.setBounds(545,500,40,40);
		b14.setBounds(5,545,40,40);
		b15.setBounds(50,545,40,40);
		b16.setBounds(95,545,40,40);
		b17.setBounds(140,545,40,40);
		b18.setBounds(185,545,40,40);
		b19.setBounds(230,545,40,40);
		b20.setBounds(275,545,40,40);
		b21.setBounds(320,545,40,40);
		b22.setBounds(365,545,40,40);
		b23.setBounds(410,545,40,40);
		b24.setBounds(455,545,40,40);
		b25.setBounds(500,545,40,40);
		b26.setBounds(545,545,40,40);
		repaint();
		label=new JLabel("Level "+level);
		label.setForeground(Color.RED);
		label.setFont(f1);
		JOptionPane.showMessageDialog(null,label);
		}
	public void compare()
		{
		for(int i=0;i<question.length();i++)
			if(in==questionarr[i])
				{
				if(in==answerarr[i])
					{repaint();
					}
				else if(in!=answerarr[i])
					{repaint();answerarr[i]=in;--co;
					return;
					}
				}
			
			--life;
			
		
		
		if(life==0)
			{
			ImageIcon icon=new ImageIcon("lost.gif");
			label=new JLabel("The word was "+question);
			label.setForeground(Color.RED);
			label.setFont(f1);
			UIManager.put("OptionPane.okButtonText","OKAY");

			JOptionPane.showMessageDialog(null,"","The Hangman Game",JOptionPane.INFORMATION_MESSAGE,icon);
			JOptionPane.showMessageDialog(null,label);
			setVisible(false);}
		
		if(co==0)
			init();
			
		
		

		return;
		}
	public void actionPerformed(ActionEvent e)
		{
		String s1=e.getActionCommand();
		in=s1.charAt(0);

		
		compare();
		
		int count=0;
		for(int i=0;i<question.length();i++)
			{if(answerarr[i]!='_')
				count++;
			if(count==question.length())
				{init();}
			}
		
		repaint();
		
		
		}
	public void paint(Graphics g)
		{
		g.setFont(f1);		 
		logo=getImage(getDocumentBase(),"logo.png");
		s2="life"+(6-life)+".jpg";
		img=getImage(getDocumentBase(),s2);
		
		g.drawImage(img,0,0,this);
		g.drawImage(logo,420,5,this);
		g.drawString("Level = "+Integer.toString(level),5,130);
		g.drawString("Life = "+Integer.toString(life),150, 130);
		
		g.drawString("Guess the word: "+String.valueOf(answerarr),5,190);
		g.drawString("Hint: "+hint,5,225);
		}
	}

/*<applet code="Hangman.class" width =1366 height=750></applet>*/