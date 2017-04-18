import java.awt.*;
import java.awt.event.*;
class encryptinterface2 implements ActionListener
{
Frame f;
Font fo;
Label l1,l2;
Button b1,b2,b3;

encryptinterface2()
{
fo=new Font("Serif",Font.PLAIN,24);
f=new Frame("Encryption System");
l1=new Label("Welcome to Data Encryption System");
l1.setFont(fo);
b1=new Button("Click for encryption through DES");
b1.addActionListener(this);
b2=new Button("Cick for encryption through Blowfish");
b2.addActionListener(this);
b3=new Button("Click for encryption through AES");
b3.addActionListener(this);
f.setLayout(null);
l1.setBounds(150,40,380,150);
b1.setBounds(150,200,300,30);
b2.setBounds(150,250,300,30);
b3.setBounds(150,300,300,30);
f.add(l1);
f.add(b1);
f.add(b2);
f.add(b3);
f.setSize(700,400);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
DES ob=new DES();
}
else if(e.getSource()==b2)
{
Blowfish obj=new Blowfish();
}
else if(e.getSource()==b3)
{
AES o=new AES();
}
}
public static void main(String ar[])
{
encryptinterface2 ob=new encryptinterface2();
}
}
