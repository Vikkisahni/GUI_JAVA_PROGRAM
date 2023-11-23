import java.awt.*;
import java.awt.event.*;
class bill
{
    Frame f=new Frame("BILL CREATOR");
    Checkbox c1=new Checkbox("Dairy Milk-Rs.40");
    Checkbox c2=new Checkbox("Pizza-Rs.175     ");
    Checkbox c3=new Checkbox("Tea-Rs.30         ");
    Checkbox c4=new Checkbox("Samosa-Rs.12   ");
    Checkbox c5=new Checkbox("Sandwich-Rs.50");
    Label l1=new Label("Your Bill:-");
    TextField t1=new TextField(5);
    bill()
    {

        Font font=new Font("Arial",Font.BOLD,13);
        c1.setFont(font);
        c2.setFont(font);
        c3.setFont(font);
        c4.setFont(font);
        c5.setFont(font);
        l1.setFont(font);
        GridBagLayout gb=new GridBagLayout();
        f.setLayout(gb);
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=0;
        gb.setConstraints(c1,gbc);
        f.add(c1);
        gbc.gridx=0;
        gbc.gridy=1;
        gb.setConstraints(c2,gbc);
        f.add(c2);
        gbc.gridx=0;
        gbc.gridy=2;
        gb.setConstraints(c3,gbc);
        f.add(c3);
        gbc.gridx=0;
        gbc.gridy=3;
        gb.setConstraints(c4,gbc);
        f.add(c4);
        gbc.gridx=0;
        gbc.gridy=4;
        gb.setConstraints(c5,gbc);
        f.add(c5);
        gbc.gridx=1;
        gbc.gridy=6;
        gb.setConstraints(l1,gbc);
        f.add(l1);
        gbc.gridx=2;
        gbc.gridy=6;
        gb.setConstraints(t1,gbc);
        f.add(t1);
        t1.setText(String.valueOf(0));
        f.setSize(400,300);
        f.setVisible(true);

        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e)
            {

                boolean a=c1.getState();
                if(a)
                {
                    int p=Integer.parseInt(t1.getText());
                    p=p+40;

                    t1.setText(String.valueOf(p));
                }
                else
                {
                    int x=Integer.parseInt(t1.getText());
                    x=x-40;
                    t1.setText(String.valueOf(x));
                }


            }
        });
        c2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                boolean a=c2.getState();
                if(a)
                {
                   int x=Integer.parseInt(t1.getText());
                   x=x+175;
                   t1.setText(String.valueOf(x));
                }
                else
                {
                    int x=Integer.parseInt(t1.getText());
                    x=x-175;
                    t1.setText(String.valueOf(x));
                }

            }
        });
        c3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                boolean a=c3.getState();
                if(a)
                {
                    int x=Integer.parseInt(t1.getText());
                    x=x+30;
                    t1.setText(String.valueOf(x));
                }
                else
                {
                    int x=Integer.parseInt(t1.getText());
                    x=x-30;
                    t1.setText(String.valueOf(x));
                }

            }
        });
        c4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                boolean a=c4.getState();
                if(a)
                {
                    int x=Integer.parseInt(t1.getText());
                    x=x+12;
                    t1.setText(String.valueOf(x));
                }
                else
                {
                    int x=Integer.parseInt(t1.getText());
                    x=x-12;
                    t1.setText(String.valueOf(x));
                }
            }
        });
        c5.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                boolean a=c5.getState();
                if(a)
                {
                    int x=Integer.parseInt(t1.getText());
                    x=x+50;
                    t1.setText(String.valueOf(x));
                }
                else
                {
                    int x=Integer.parseInt(t1.getText());
                    x=x-50;
                    t1.setText(String.valueOf(x));
                }
            }
        });
        f.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

    }
    public static void main(String []args)
    {
        new bill();
    }
}
