Layout
- arrangment of window controls within a Frame/Panel by using some type  of algorithm 
- Java Layout Manager handles all these tyes of problems
- Component are placed on frame/panel according to layout

Container Layouts

1- BorderLayout
2- FlowLayout
3- GridLayout
4- GridBagLayout
5- CardLayout 

- By default layout of Frame is BorderLayout
- Change Layout to FlowLayout
....................................................................................
BorderLayout 
- Default layout in java Frame

Example : Paste five Buttons according to border layout

import java.awt.*;
  class Test{
 public static void main(String a[]){
  Frame f= new Frame("Msg");
   Button bn= new Button("North");
   Button bs= new Button("South");
   Button be= new Button("EAST");
   Button bw= new Button("West");
   Button bc= new Button("Center");
   f.add(bn,BorderLayout.NORTH);
   f.add(bs,BorderLayout.SOUTH);
   f.add(be,BorderLayout.EAST);
   f.add(bw,BorderLayout.WEST);
   f.add(bc,BorderLayout.CENTER);
   f.setSize(400,400);
   f.setVisible(true);
}
}
..........................................................................
GridLayout
- Divide frame in the form of cols and Rows

   Frame f= new Frame("Msg");
   f.setLayout (new GridLayout(4,5));
.........................................................................
Example 1 : Develop  3x 3 Buttons Grid Layout

import java.awt.*;
class MyFrame{
 MyFrame() {
  Frame f = new Frame("UCP");
  f.setLayout(new GridLayout(3,3));
  Button b[]= new Button[9];
  for (int i=0;i<9;i++){
    b[i]= new Button(""+i);
    f.add(b[i]);
  }     
  f.setSize(300,300);
  f.setBackground(Color.blue);
  f.setVisible(true);
 }
}
class Test{
public static void main(String a[]){
    MyFrame frame= new MyFrame();
  
}
}

..........................................................................
Example 2 : Develop Calculator GUI

import java.awt.*;
class Calculator{
 public static void main(String a[]){
  Frame f= new Frame("Msg");
  f.setSize(400,400);
  Panel pn= new Panel();
  pn.setLayout(new BorderLayout()); 
  Panel spns= new Panel();
  pn.add(spns,BorderLayout.SOUTH);
  Panel pc= new Panel(); 
  pc.setLayout(new GridLayout(3,4,8,8)); 
  Panel pw= new Panel();
  pw.setLayout(new GridLayout(4,1,8,8)); 
  Button b[]= new Button[10];
  for (int i=0;i<b.length;i++){
       b[i]= new Button(""+i);
       pc.add(b[i]);
  }
  TextField tf= new TextField(30);
  pn.add(tf,BorderLayout.NORTH);
  String names[]={"MC","MS","MR","M+"};
  Button aw[]= new Button[4];
  for (int i=0;i<aw.length;i++){
       aw[i]= new Button(names[i]);
       pw.add(aw[i]);
  } 
  String names2[]={"Backspace","CE","C"};
  Button aw1[]= new Button[3];
  for (int i=0;i<aw1.length;i++){
       aw1[i]= new Button(names2[i]);
      spns.add(aw1[i]);
  } 



  f.add(pn,BorderLayout.NORTH); 
  f.add(pc,BorderLayout.CENTER);
  f.add(pw,BorderLayout.WEST);  
  f.setVisible(true);
}
} 
................................................................
Example : A Frame with Five Panels

import java.awt.*;
class MyFrame{
 MyFrame() {
  Frame f = new Frame("UCP");
   Panel pn= new Panel();
   Panel ps= new Panel();
   Panel pw= new Panel();
   Panel pe= new Panel();
   Panel pc= new Panel();
   pn.setBackground(Color.RED);
   ps.setBackground(Color.YELLOW);
   pw.setBackground(Color.PINK);
   pe.setBackground(Color.CYAN);
   pc.setBackground(Color.BLUE1);
   f.add(pn,BorderLayout.NORTH);
   f.add(ps,BorderLayout.SOUTH);
   f.add(pe,BorderLayout.EAST);
   f.add(pw,BorderLayout.WEST);
   f.add(pc,BorderLayout.CENTER);
       
  f.setSize(300,300);
  f.setVisible(true);
 }
}
class Test{
public static void main(String a[]){
    MyFrame frame= new MyFrame();
  
}
}
...............................................









