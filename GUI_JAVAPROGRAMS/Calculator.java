import java.awt.*;
import java.awt.event.*;
class Calculator implements ActionListener
{
    Frame f = new Frame("CALCULATOR");
    Label l1 = new Label("FIRST NUMBER:-");
    Label l2 = new Label("SECOND NUMBER:-");
    Label l3 = new Label("RESULT:-");
    TextField t1 = new TextField(10);
    TextField t2 = new TextField(10);
    TextField t3 = new TextField(10);
    Button b1 = new Button("+");
    Button b2 = new Button("-");
    Button b3 = new Button("*");
    Button b4 = new Button("/");
    Button b5 = new Button("Cancel");

    Calculator() {
        Font font = new Font("Aril", Font.BOLD, 15);
        b1.setBackground(Color.BLUE);
        b2.setBackground(Color.BLUE);
        b3.setBackground(Color.BLUE);
        b4.setBackground(Color.BLUE);
        b5.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        b3.setForeground(Color.WHITE);
        b4.setForeground(Color.WHITE);
        b5.setForeground(Color.WHITE);
        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);
        b4.setFont(font);
        GridBagLayout gb = new GridBagLayout();
        f.setLayout(gb);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gb.setConstraints(l1, gbc);
        f.add(l1);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gb.setConstraints(t1, gbc);
        f.add(t1);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gb.setConstraints(l2, gbc);
        f.add(l2);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gb.setConstraints(t2, gbc);
        f.add(t2);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gb.setConstraints(l3, gbc);
        f.add(l3);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gb.setConstraints(t3, gbc);
        f.add(t3);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gb.setConstraints(b1, gbc);
        f.add(b1);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gb.setConstraints(b2, gbc);
        f.add(b2);
        gbc.gridx = 2;
        gbc.gridy = 3;
        gb.setConstraints(b3, gbc);
        f.add(b3);
        gbc.gridx = 3;
        gbc.gridy = 3;
        gb.setConstraints(b4, gbc);
        f.add(b4);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gb.setConstraints(b5, gbc);
        f.add(b5);
        f.setSize(400, 300);
        f.setVisible(true);
        t3.setEditable(false);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            Float a = Float.parseFloat(t1.getText());
            Float b = Float.parseFloat(t2.getText());
            t3.setText(String.valueOf(a + b));
        }
        else if (ae.getSource()==b2)
        {
            Float a = Float.parseFloat(t1.getText());
            Float b = Float.parseFloat(t2.getText());
            t3.setText(String.valueOf(a-b));

        }
        else if (ae.getSource()==b3)
        {
            Float a = Float.parseFloat(t1.getText());
            Float b = Float.parseFloat(t2.getText());
            t3.setText(String.valueOf(a*b));

        }
        else if (ae.getSource()==b4)
        {
            Float a = Float.parseFloat(t1.getText());
            Float b = Float.parseFloat(t2.getText());
            t3.setText(String.valueOf(a/b));

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



    public static void main(String[] args)
    {
        new Calculator();
    }
}
