import java.awt.*;  
import java.applet.*;  
import java.util.*;
  
public class DisplayImage extends Applet 
{  
  String s="life";
int r;
  Image picture;  
  
  public void init() { 
r=(int)(Math.random()*((5-0)+1));
s+=r; 
s+=".jpg";
    picture = getImage(getDocumentBase(),s);  
  }  
    
  public void paint(Graphics g) 
  {
    g.drawImage(picture, 670,70, this);  
  }  
      
  }  
/*<applet code="DisplayImage" width=1380 height=768></applet>*/