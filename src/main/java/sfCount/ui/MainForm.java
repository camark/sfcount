package sfCount.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class MainForm extends JFrame {

    JLabel count=new JLabel();
    JFrame self=this;
    public MainForm()
    {
        Font font = new Font("Courier", Font.BOLD,60);

        //set font for JLabel
        count.setFont(font);
        count.setText("Hello Jframe");
        count.setHorizontalAlignment(SwingConstants.CENTER);

        JButton btnClose=new JButton();
        btnClose.setText("Close");

        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setSize(300,300);
        setLayout(new BorderLayout());

        add(count,BorderLayout.CENTER);
        add(btnClose,BorderLayout.SOUTH);

        setLocationRelativeTo(null);
    }

    public void setCountText(int iCount){
        count.setText(String.valueOf(iCount));
    }
}
