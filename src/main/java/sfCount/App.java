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
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                InitGUI();
            }
        });

    }

    private static void InitGUI() {
        //System.out.println( "Hello World!" );

        //JFrame.setDefaultLookAndFeelDecorated(true);
        MainForm mainForm=new MainForm();
        GVisitCount gv=new GVisitCount();
        mainForm.setCountText(gv.getCount());

        mainForm.setTitle("安全助手使用次数");
        //mainForm.pack();
        mainForm.setVisible(true);
    }
}
