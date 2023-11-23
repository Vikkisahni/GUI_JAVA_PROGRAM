import java.awt.*;
import java.awt.event.*;
class price
{

    Frame f=new Frame("Price finder");
    Label l1=new Label("Select Product:-");
    Label l2=new Label("Price:-");
    TextField t1=new TextField(5);
    Choice c=new Choice();
    Button b1=new Button("Cancel");
  price()
    {
        Font font=new Font("Arial",Font.BOLD,15);
        l1.setFont(font);
        l2.setFont(font);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        c.add("PIZZA");
        c.add("BURGER");
        c.add("SAMOSA");
        c.add("SANDWICH");
        c.add("COLD COFFEE");
        c.add("ICE-CREAM");
        c.add("MILK SHAKE");
        GridBagLayout gb=new GridBagLayout();
        f.setLayout(gb);
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=0;
        gb.setConstraints(l1,gbc);
        f.add(l1);
        gbc.gridx=1;
        gbc.gridy=0;
        gb.setConstraints(c,gbc);
        f.add(c);
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
        gb.setConstraints(b1,gbc);
        f.add(b1);
        f.setSize(300,300);
        f.setVisible(true);
        t1.setText("Rs.249/-");
        c.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {

                if(e.getItem().equals("PIZZA"))
                {
                    t1.setText("Rs.249/-");
                }
                else if(e.getItem().equals("BURGER"))
                {
                    t1.setText("Rs.49/-");
                }
                else if(e.getItem().equals("SAMOSA"))
                {
                    t1.setText("Rs.10/-");
                }
                else if(e.getItem().equals("SANDWICH"))
                {
                    t1.setText("Rs.99/-");
                }
                else if(e.getItem().equals("COLD COFFEE"))
                {
                    t1.setText("Rs.149/-");
                }
                else if(e.getItem().equals("ICE-CREAM"))
                {
                    t1.setText("Rs.59/-");
                }
                else
                {
                    t1.setText("Rs.49/-");
                }


            }
        });
        b1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==b1)
                {
                    System.exit(0);
                }
            }
        });
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


    public static void main(String []args)
    {
        new price();


        }
    }
