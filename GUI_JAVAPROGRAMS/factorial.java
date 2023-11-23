import java.awt.*;
import java.awt.event.*;
class factorial implements ActionListener
{
    Frame f=new Frame("Find Factorial");
    Label l1=new Label("Enter Number:-");
    Label l2=new Label("Factorial:-");
    TextField t1=new TextField(10);
    TextField t2=new TextField(10);
    Button b1=new Button("Ok");
    Button b2=new Button("Cancel");
    factorial() {
        b1.setBackground(Color.BLUE);
        b2.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        GridBagLayout gb = new GridBagLayout();
        f.setLayout(gb);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gb.setConstraints(l1, gbc);
        f.add(l1);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gb.setConstraints(l2, gbc);
        f.add(l2);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gb.setConstraints(t1, gbc);
        f.add(t1);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gb.setConstraints(t2, gbc);
        f.add(t2);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gb.setConstraints(b1, gbc);
        f.add(b1);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gb.setConstraints(b2, gbc);
        f.add(b2);
        t2.setEditable(false);
        f.setSize(300, 300);
        f.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            int n=Integer.parseInt(t1.getText());
            int f=1,i;
            for(i=1;i<=n;i++)
            {
                f=f*i;

            }
            t2.setText(String.valueOf(f));
        }
        else
        {
            System.exit(0);
        }
        

    }

    public static void main(String []args)
    {
    new factorial();
    }

}