//package components;
package guillermoGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/* FrameDemo.java  requires no other files.  */
public class MainWindow {
    static JFrame frame;
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        frame = new JFrame("Main Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar barraMenu = new JMenuBar();
        frame.setJMenuBar( barraMenu );
        final JMenu fileMenu =new JMenu("Rueda");

        final JMenuItem item1 = new JMenuItem("Item 1");
        JMenuItem item2 = new JMenuItem("Item 2");

        item1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                String a = item1.getText();
                item1.setText(fileMenu.getText());
                fileMenu.setText(a);
            }

        });

        fileMenu.add(item1);
        fileMenu.add(item2);

        barraMenu.add(fileMenu);

        addAllElements();

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    
    private static void addAllElements(){
        JPanel pnlAll = new JPanel();
        JPanel pnlCenter = new JPanel();
        JPanel pnlR1R2S = new JPanel();
        JPanel pnlR1R2_center = new JPanel();
        JPanel pnlR1R2_center_left = new JPanel();
        JPanel pnlR1R2_center_left_top = new JPanel();
        JPanel pnlR1R2_center_left_center = new JPanel();
        JPanel pnlR1R2S_pend = new JPanel();
        JPanel pnlRLRR = new JPanel();
        
        
        
        pnlAll.setBorder(BorderFactory.createEmptyBorder(0,10,10,10)); 
        
        pnlCenter.setLayout(new GridLayout(2,0));
        pnlCenter.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
        
        pnlAll.add(pnlCenter);
        
        pnlR1R2S.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
        pnlR1R2S.setLayout(new BorderLayout());
        
        pnlCenter.add(pnlR1R2S);
        pnlCenter.add(pnlRLRR);
        
        pnlR1R2_center.setLayout(new GridLayout(1,2));
        pnlR1R2_center.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
        //seguir r1r2center
        
        
        
        pnlR1R2_center_left.setLayout(new BorderLayout());
        
        pnlR1R2_center_left_top.setLayout(new BoxLayout(pnlR1R2_center_left_top, BoxLayout.PAGE_AXIS) );
        JLabel lblR1 = new JLabel("R1");
        pnlR1R2_center_left_top.add(lblR1);
        
        
        pnlR1R2_center.add(pnlR1R2_center_left);
        
        
        //////////////////
        
        
        
        pnlR1R2_center_left_center.setLayout( new GridLayout(3,3) );
        
        pnlR1R2_center_left.add(pnlR1R2_center_left_top, BorderLayout.PAGE_START);
        pnlR1R2_center_left.add(pnlR1R2_center_left_center, BorderLayout.CENTER);
        
        JLabel lbltest_1 = new JLabel("1");
        JLabel lbltest_2 = new JLabel("2");
        JLabel lbltest_3 = new JLabel("3");
        JLabel lbltest_4 = new JLabel("4");
        JLabel lbltest_5 = new JLabel("5");
        JLabel lbltest_6 = new JLabel("6");
        JLabel lbltest_7 = new JLabel("7");
        JLabel lbltest_8 = new JLabel("8");
        JLabel lbltest_9 = new JLabel("9");
        
        pnlR1R2_center_left_center.add(lbltest_1);
        pnlR1R2_center_left_center.add(lbltest_2);
        pnlR1R2_center_left_center.add(lbltest_3);
        pnlR1R2_center_left_center.add(lbltest_4);
        pnlR1R2_center_left_center.add(lbltest_5);
        pnlR1R2_center_left_center.add(lbltest_6);
        pnlR1R2_center_left_center.add(lbltest_7);
        pnlR1R2_center_left_center.add(lbltest_8);
        pnlR1R2_center_left_center.add(lbltest_9);
        
        /////////////////////////////////
        
        pnlR1R2S_pend.setLayout(new BoxLayout(pnlR1R2S_pend, BoxLayout.PAGE_AXIS) );
        JButton btnSend = new JButton("Send");
        pnlR1R2S_pend.add(btnSend);
        /////////////////////////////////
        
        pnlRLRR.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
        pnlRLRR.setLayout(new GridLayout(3,4));
        JLabel lbltest1 = new JLabel("empty");
        JLabel lbltest2 = new JLabel("p");
        JLabel lbltest3 = new JLabel("t");
        JLabel lbltest4 = new JLabel("d");
        JLabel lbltest5 = new JLabel("RL");
        JLabel lbltest6 = new JLabel("empty");
        JLabel lbltest7 = new JLabel("empty");
        JLabel lbltest8 = new JLabel("empty");
        JLabel lbltest9 = new JLabel("RR");
        JLabel lbltest10 = new JLabel("empty");
        JLabel lbltest11 = new JLabel("empty");
        JLabel lbltest12 = new JLabel("empty");
        pnlRLRR.add(lbltest1);
        pnlRLRR.add(lbltest2);
        pnlRLRR.add(lbltest3);
        pnlRLRR.add(lbltest4);
        pnlRLRR.add(lbltest5);
        pnlRLRR.add(lbltest6);
        pnlRLRR.add(lbltest7);
        pnlRLRR.add(lbltest8);
        pnlRLRR.add(lbltest9);
        pnlRLRR.add(lbltest10);
        pnlRLRR.add(lbltest11);
        pnlRLRR.add(lbltest12);
        //////////////////////////////////////
        frame.add(pnlAll);
    }
    
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}