import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import javax.swing.*;

public class MainFrame extends JFrame{
    private Container cp;
    private JTextField jtfr = new JTextField("0");
    private JTextField jtfg = new JTextField("0");
    private JTextField jtfb = new JTextField("0");
    private JPanel jpanl = new JPanel(new GridLayout(1,4,3,3));
    private JButton jbtn = new JButton("run");
    private JLabel jlb = new JLabel("");

    public MainFrame(){
        init();
    }

    private void init(){
        this.setBounds(100,100,600,500);
        jlb.setBounds(0,50,600,500);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(jpanl,BorderLayout.NORTH);
        jpanl.add(jtfr);
        jpanl.add(jtfg);
        jpanl.add(jtfb);
        jpanl.add(jbtn);
        this.add(jlb);
        jlb.setOpaque(true);
    
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        jbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int r = Integer.parseInt(jtfr.getText());
                int g = Integer.parseInt(jtfg.getText());
                int b = Integer.parseInt(jtfb.getText());
                jlb.setBackground(new Color(r,g,b));
            }
        });
    }
}