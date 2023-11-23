import java.awt.*;
import java.awt.event.*;
class Interest implements ActionListener
{
    Frame f=new Frame("Interest");
    Label l1=new Label("Enter Principal:-");
    Label l2=new Label("Enter Rate:-");
    Label l3=new Label("Enter Time:-");
    Label l4=new Label("Simple Interest:-");
    Label l5=new Label("Compound Interest:-");
    TextField t1=new TextField(10);
    TextField t2=new TextField(10);
    TextField t3=new TextField(10);
    TextField t4=new TextField(10);

    TextField t5=new TextField(10);
    Button b1=new Button("Ok");
    Button b2=new Button("Cancel");
Interest() {
    Font font=new Font("Arial",Font.BOLD,15);
    b1.setBackground(Color.BLUE);
    b2.setBackground(Color.BLUE);
    b1.setForeground(Color.WHITE);
    b2.setForeground(Color.WHITE);
    l1.setFont(font);
    l2.setFont(font);
    l3.setFont(font);
    l4.setFont(font);
    l5.setFont(font);
    b1.setFont(font);
    b2.setFont(font);
    t1.setFont(font);
    t2.setFont(font);
    t3.setFont(font);
    t4.setFont(font);
    t5.setFont(font);
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
    gbc.gridx = 0;
    gbc.gridy = 2;
    gb.setConstraints(l3, gbc);
    f.add(l3);
    gbc.gridx = 0;
    gbc.gridy = 3;
    gb.setConstraints(l4, gbc);
    f.add(l4);
    gbc.gridx = 0;
    gbc.gridy = 4;
    gb.setConstraints(l5, gbc);
    f.add(l5);
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
    gb.setConstraints(t3, gbc);
    f.add(t3);
    gbc.gridx = 1;
    gbc.gridy = 3;
    gb.setConstraints(t4, gbc);
    f.add(t4);
    gbc.gridx = 1;
    gbc.gridy = 4;
    gb.setConstraints(t5, gbc);
    f.add(t5);
    gbc.gridx = 1;
    gbc.gridy = 5;
    gb.setConstraints(b1, gbc);
    f.add(b1);
    gbc.gridx = 0;
    gbc.gridy = 5;
    gb.setConstraints(b2, gbc);
    f.add(b2);
    f.setSize(400, 400);
    f.setVisible(true);
    t4.setEditable(false);
    t5.setEditable(false);
    b1.addActionListener(this);
    b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b1)
    {
        float p=Float.parseFloat(t1.getText());
        float r=Float.parseFloat(t2.getText());
        float t=Float.parseFloat(t3.getText());
        t4.setText(String.valueOf(p*r*t/100));
        t5.setText(String.valueOf(p*Math.pow((1+r/100),t)-p));
    }
    else
    {
        System.exit(0);
    }
}
public static void main(String []args)
{
    new Interest();
}
}
