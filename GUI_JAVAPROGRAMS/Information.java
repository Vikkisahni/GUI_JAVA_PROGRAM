import java.awt.*;
class Information
{
    Frame f=new Frame("Employee Information");
    Label l1=new Label("Name:-");
    Label l2=new Label("Age:-");
    Label l3=new Label("Income:-");
    TextField t1=new TextField(20);
    TextField t2=new TextField(20);
    TextField t3=new TextField(20);
    Information()
    {
        f.setBackground(Color.BLUE);
        l1.setForeground(Color.white);
        l2.setForeground(Color.white);
        l3.setForeground(Color.white);
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
        gbc.gridy=0;
        gb.setConstraints(t1,gbc);
        f.add(t1);
        gbc.gridx=1;
        gbc.gridy=1;
        gb.setConstraints(t2,gbc);
        f.add(t2);
        gbc.gridx=1;
        gbc.gridy=2;
        gb.setConstraints(t3,gbc);
        f.add(t3);
        f.setSize(500,300);
        f.setVisible(true);
    }
    public static void main(String []args)
    {
        new Information();
    }
}
