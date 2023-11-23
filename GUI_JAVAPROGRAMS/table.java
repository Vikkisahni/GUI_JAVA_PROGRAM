import java.awt.*;
import java.awt.event.*;
 class table implements ActionListener
 {
     Frame f=new Frame("Multiplication Table");
     Label l1=new Label("ENTER NUMBER:");
     Label l2=new Label("RESULT:");
     TextField t1=new TextField(10);
     Button b1=new Button("OK");
     Button b2=new Button("Cancel");
     Button b3=new Button("Reset");
     List list=new List();
    table()
    {
        GridBagLayout gb=new GridBagLayout();
        f.setLayout(gb);
        GridBagConstraints gbc=new GridBagConstraints();
        b1.setBackground(Color.BLUE);
        b2.setBackground(Color.BLUE);
        b3.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        b3.setForeground(Color.WHITE);
        gbc.gridx=0;
        gbc.gridy=0;
        gb.setConstraints(l1,gbc);
        f.add(l1);
        gbc.gridx=0;
        gbc.gridy=1;
        gb.setConstraints(l2,gbc);
        f.add(l2);
        gbc.gridx=1;
        gbc.gridy=0;
        gb.setConstraints(t1,gbc);
        f.add(t1);
        gbc.gridx=1;
        gbc.gridy=1;
        gb.setConstraints(list,gbc);
        f.add(list);
        gbc.gridx=0;
        gbc.gridy=2;
        gb.setConstraints(b3,gbc);
        f.add(b3);
        gbc.gridx=1;
        gbc.gridy=2;
        gb.setConstraints(b2,gbc);
        f.add(b2);
        gbc.gridx=2;
        gbc.gridy=2;
        gb.setConstraints(b1,gbc);
        f.add(b1);
        f.setSize(300,300);
        f.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            int n=Integer.parseInt(t1.getText());
            int i;
            for(i=1;i<=10;i++)
            {
                list.add(String.valueOf(n*i));
            }
        }
        else if(ae.getSource()==b3)
        {
            t1.setText("");
            list.clear();
        }
        else
        {
            System.exit(0);
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
        new table();
    }
}
