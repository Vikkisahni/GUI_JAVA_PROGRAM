import java.awt.*;
import java.awt.event.*;
class prime implements ActionListener
{
    Frame f=new Frame("Prime List");
    Label l1=new Label("Enter Starting No:-");
    Label l2=new Label("Enter Ending No:-");
    Label l3=new Label("Prime List:-");
    TextField t1=new TextField(10);
    TextField t2=new TextField(10);
    List list=new List();
    Button b1=new Button("Ok");
    Button b2=new Button("Reset");
    Button b3=new Button("Cancel");
    prime()
    {
        Font font=new Font("Arial",Font.BOLD,15);
        l3.setFont(font);
        b1.setBackground(Color.BLUE);
        b2.setBackground(Color.BLUE);
        b3.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        b3.setForeground(Color.WHITE);
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
        gbc.gridx=0;
        gbc.gridy=2;
        gb.setConstraints(l3,gbc);
        f.add(l3);
        gbc.gridx=1;
        gbc.gridy=3;
        gb.setConstraints(b3,gbc);
        f.add(b3);
        gbc.gridx=1;
        gbc.gridy=0;
        gb.setConstraints(t1,gbc);
        f.add(t1);
        gbc.gridx=1;
        gbc.gridy=1;
        gb.setConstraints(t2,gbc);
        f.add(t2);
        gbc.gridx=1;
        gbc.gridy=2;
        gb.setConstraints(list,gbc);
        f.add(list);
        gbc.gridx=0;
        gbc.gridy=3;
        gb.setConstraints(b2,gbc);
        f.add(b2);
        gbc.gridx=2;
        gbc.gridy=3;
        gb.setConstraints(b1,gbc);
        f.add(b1);
        f.setSize(300,300);
        f.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            int n=Integer.parseInt(t1.getText());
            int n1=Integer.parseInt(t2.getText());
            int i,j,c;
            for(i=n;i<=n1;i++)
            {
                c=0;
                for(j=1;j<=i;j++)
                {
                    if(i%j==0)
                    {
                        c++;
                    }
                }
                if(c==2)
                {
                    list.add(String.valueOf(i));
                }
            }

        }
        else if(e.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
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
        new prime();
    }
}
