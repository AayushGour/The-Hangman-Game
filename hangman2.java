package game;
import java.io.*;
import java.util.*;

public class hangman
	{public char linearray[],query[],answer[],in; //linearray for whole line, query for the word, answer for the input of the user, in for character input by the user
	public int random,ran,level,life,co; //random to select a random word, ran to select a random alphabet, level is for level, life is for life, co is a counter
	public String solution,line,question,hint; //solution is for the blanked answer, line is for line, question is for the whole word, hint is for the hint
	public void rand(int val) //to generate a a random number to extract a random line from the database
		{Random r=new Random();
		random=r.nextInt(val);
		if(random>=(val-10) && random<=val)
			random=random+48;
		else
			rand(val);
		}
	public void extract() throws Exception //to extract a line from the database
		{BufferedReader br=new BufferedReader(new FileReader("C:/Users/HOMR/Desktop/Mini/words.txt"));
		while((line=br.readLine())!=null)
			{if(line.charAt(0)==(char)random)
				{linearray=line.toCharArray();
				for(int i=1;i<line.length();i++)
					linearray[i-1]=linearray[i];
				break;}
			}
		}
	
	public void preinput() //to assign blank spaces to answer[]
		{
		query=question.toCharArray();
		answer=question.toCharArray();
		for(int i=0;i<question.length();i++)
			answer[i]='_';
		
		Random r=new Random();
		int x=(int)Math.floor(0.4*(question.length()+1));
		co=question.length()-x;
		for(int i=0;i<x;i++)
			{ran=r.nextInt(question.length());
			answer[ran]=query[ran];
			}
		solution=new String(answer);
		}
	public void cls() throws IOException, InterruptedException //to clear screeen
		{new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();}


	public void input() throws Exception //to get the input from the console
		{cls();
		System.out.println("\t\tWELCOME TO HANGMAN\nLEVEL "+level+"\t\t\t\tLife : "+life);
		/*switch(life)
			{case 1:life1 l1=new life1();break;
			case 2:life2 l2=new life2();break;
			case 3:life3 l3=new life3();break;
			case 4:life4 l4=new life4();break;}*/
		System.out.print("\nGuess the word:");
		for(int i=0;i<question.length();i++)
			System.out.print(" "+answer[i]);
		System.out.println("\n"+hint);	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		in=sc.next().charAt(0);
		in=Character.toUpperCase(in);
		
		compare();}
	
	public void compare() //to compare the users input with the word extracted from the database
		{for(int i=0;i<question.length();i++)
			if(in==query[i])
				{
				if(in==answer[i])
					continue;
				else if(in!=answer[i])
					{answer[i]=in;co--;
					return;
					}
				}
			life--;
		}
			

	public hangman() throws Exception
		{
		level=1;life=5;
		while(level<=5)
			{switch(level)
				{case 1:rand(10);break;
				case 2:rand(20);break;
				case 3:rand(30);break;
				case 4:rand(40);break;
				case 5:rand(50);break;}
			
			extract();
			int c=1;
			for(int i=0;i<line.length()-1;i++)
				{if(linearray[i]!=(char)38)
					c++;
				else
					{c++;break;}
				}
			hint=line.substring(c);//contains the hint of the word
			question=line.substring(1,c-1);//contains the word to be found
			preinput();
			while(level>0 && life>0)
				{input();
				if(co==0)
				break;}
			if(life==0)
				{cls();
				//life0 l0=new life0();
				System.out.println("GAME OVER\nThe word was "+question);
				System.exit(0);}
			else if(level<5)
				{System.out.println("The word is "+question+"\nGOOD JOB\nADVANCE TO NEXT LEVEL");
				level++;
				life=5;
				System.out.println("Press ENTER to continue");
				System.in.read();}
			else if(level==5)
				{System.out.println("CONGRATULATIONS!!!\nYOU'VE WON THE GAME");System.exit(0);}
			}
		}
	}