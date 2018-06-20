package sfCount;

import sfCount.VisitCount.GVisitCount;
import sfCount.ui.MainForm;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );

        MainForm mainForm=new MainForm();
        GVisitCount gv=new GVisitCount();
        mainForm.setCountText(gv.getCount());

        mainForm.setTitle("安全助手使用次数");
        mainForm.setVisible(true);

        mainForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
