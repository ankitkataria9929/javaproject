import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
class JavaFont extends Frame implements MouseListener {
    int size=20;
    Label l1;
    Font font;
    int i=0;
    int j=0;
    String fonts[] = 
 GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

    JavaFont()
    {
        System.out.println(fonts.length);
        setSize(500,500);
        setVisible(true);
        font=new Font(fonts[i],Font.BOLD,size);
        l1=new Label("ABHISHEK",Label.CENTER);
        l1.setFont(font);
        add(l1,BorderLayout.NORTH);
        addMouseListener(this);
    }
    public void mousePressed(MouseEvent me)
    {

    }
    public void mouseClicked(MouseEvent me)
    {
        if(i<fonts.length)
        {
        i--;
        size=size+2;
        l1.setText("ABC212");
        font=new Font(fonts[i],Font.BOLD,size);
        l1.setFont(font);
        }
        else
        {
            i=0;
        }

    }
    public void mouseEntered(MouseEvent me)
    {

    }
    public void mouseExited(MouseEvent me)
    {

    }
    public void mouseReleased(MouseEvent me)
    {

    }
    public static void main(String args[])
    {
        new JavaFont();
    }
}