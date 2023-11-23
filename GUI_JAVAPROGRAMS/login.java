import java.awt.*;
import java.awt.event.*;
class login implements ActionListener
{
    Frame f=new Frame("Login");
    Label l1=new Label("LOGIN");
    Label l2=new Label("USER NAME:");
    Label l3=new Label("PASSWORD:");
    Label l4=new Label();
    Button b1=new Button("Login");
    Button b2=new Button("Reset");
    TextField t1=new TextField(19);
    TextField t2=new TextField(15);
    login()
    {
        Font font=new Font("Arial",Font.BOLD,15);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        l1.setFont(font);
        t2.setEchoChar('*');
        t2.setFont(font);
        Font font1=new Font("Arial",Font.ITALIC,15);
        l4.setFont(font1);
        GridBagLayout gb=new GridBagLayout();
        f.setLayout(gb);
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=0;
        gb.setConstraints(l1,gbc);
        f.add(l1);
        gbc.gridx=0;
        gbc.gridy=1;
        gb.setConstraints(l2,gbc);
        f.add(l2);
        gbc.gridx=1;
        gbc.gridy=1;
        gb.setConstraints(t1,gbc);
        f.add(t1);
        gbc.gridx=0;
        gbc.gridy=2;
        gb.setConstraints(l3,gbc);
        f.add(l3);
        gbc.gridx=1;
        gbc.gridy=4;
        gb.setConstraints(l4,gbc);
        f.add(l4);
        gbc.gridx=1;
        gbc.gridy=2;
        gb.setConstraints(t2,gbc);
        f.add(t2);
        gbc.gridx=1;
        gbc.gridy=3;
        gb.setConstraints(b1,gbc);
        f.add(b1);
        gbc.gridx=0;
        gbc.gridy=3;
        gb.setConstraints(b2,gbc);
        f.add(b2);
        f.setSize(350,350);
        f.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String s, s1;
            s = t1.getText();
            s1 = t2.getText();
            if (s.equals("VICKY SAHNI") && s1.equals("SHINU THAKUR")) {
                l4.setText("Login Successful!");
            } else {
                l4.setText("Login Failed!");
            }

        } else {
            t1.setText("");
            t2.setText("");
            l4.setText("");
        }
      f.addWindowListener(new WindowAdapter()
      {
          public void windowClosing(WindowEvent e)
          {
              System.exit(0);
          }
      });
    }
    public static void main(String []args)
    {
        new login();
    }


}
