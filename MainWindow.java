//package components;
package guillermoGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/* FrameDemo.java  requires no other files. */
public class MainWindow {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Main Window");
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

        JLabel emptyLabel = new JLabel("Empty");
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
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