import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Quiz
{
    Frame f=new Frame("Quiz");
    Label l1=new Label("Q.(1) What is the extension of java.");
    CheckboxGroup cg=new CheckboxGroup();
    Checkbox c1=new Checkbox("byte",cg,false);
    Checkbox c2=new Checkbox("java",cg,false);
    Checkbox c3=new Checkbox("Class",cg,false);
    Checkbox c4=new Checkbox("txt",cg,false);
    Button b1=new Button("Check");
    Button b2=new Button("Next");
    Button b3=new Button("Quit");
Quiz()
{
    Font font=new Font("Arial",Font.BOLD,12);
    l1.setFont(font);
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
    gb.setConstraints(c1,gbc);
    f.add(c1);
    gbc.gridx=0;
    gbc.gridy=2;
    gb.setConstraints(c2,gbc);
    f.add(c2);
    gbc.gridx=0;
    gbc.gridy=3;
    gb.setConstraints(c3,gbc);
    f.add(c3);
    gbc.gridx=0;
    gbc.gridy=4;
    gb.setConstraints(c4,gbc);
    f.add(c4);
    gbc.gridx=0;
    gbc.gridy=5;
    gb.setConstraints(b1,gbc);
    f.add(b1);
    gbc.gridx=1;
    gbc.gridy=5;
    gb.setConstraints(b2,gbc);
    f.add(b2);
    gbc.gridx=2;
    gbc.gridy=5;
    gb.setConstraints(b3,gbc);
    f.add(b3);
    f.setSize(400,400);
    f.setVisible(true);
    b1.addActionListener(new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            c2.setState(true);
        }
    });
    b3.addActionListener(new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    });
    b2.addActionListener(new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Frame f=new Frame("Quiz");
            Label l1=new Label("Q.(2) How many types of inheritance in java.");
            CheckboxGroup cg=new CheckboxGroup();
            Checkbox c1=new Checkbox("5",cg,false);
            Checkbox c2=new Checkbox("2",cg,false);
            Checkbox c3=new Checkbox("4",cg,false);
            Checkbox c4=new Checkbox("3",cg,false);
            Button b1=new Button("Check");
            Button b2=new Button("Next");
            Button b3=new Button("Quit");
            Font font=new Font("Arial",Font.BOLD,12);
            l1.setFont(font);
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
            gb.setConstraints(c1,gbc);
            f.add(c1);
            gbc.gridx=0;
            gbc.gridy=2;
            gb.setConstraints(c2,gbc);
            f.add(c2);
            gbc.gridx=0;
            gbc.gridy=3;
            gb.setConstraints(c3,gbc);
            f.add(c3);
            gbc.gridx=0;
            gbc.gridy=4;
            gb.setConstraints(c4,gbc);
            f.add(c4);
            gbc.gridx=0;
            gbc.gridy=5;
            gb.setConstraints(b1,gbc);
            f.add(b1);
            gbc.gridx=1;
            gbc.gridy=5;
            gb.setConstraints(b2,gbc);
            f.add(b2);
            gbc.gridx=2;
            gbc.gridy=5;
            gb.setConstraints(b3,gbc);
            f.add(b3);
            f.setSize(400,400);
            f.setVisible(true);
            b1.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    c4.setState(true);
                }
            });
            b3.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    System.exit(0);
                }
            });
            b2.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    Frame f=new Frame("Quiz");
                    Label l1=new Label("Q.(3) Java language was developed in which year?");
                    CheckboxGroup cg=new CheckboxGroup();
                    Checkbox c1=new Checkbox("1995",cg,false);
                    Checkbox c2=new Checkbox("1979",cg,false);
                    Checkbox c3=new Checkbox("1953",cg,false);
                    Checkbox c4=new Checkbox("None",cg,false);
                    Button b1=new Button("Check");
                    Button b2=new Button("Next");
                    Button b3=new Button("Quit");
                    Font font=new Font("Arial",Font.BOLD,12);
                    l1.setFont(font);
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
                    gb.setConstraints(c1,gbc);
                    f.add(c1);
                    gbc.gridx=0;
                    gbc.gridy=2;
                    gb.setConstraints(c2,gbc);
                    f.add(c2);
                    gbc.gridx=0;
                    gbc.gridy=3;
                    gb.setConstraints(c3,gbc);
                    f.add(c3);
                    gbc.gridx=0;
                    gbc.gridy=4;
                    gb.setConstraints(c4,gbc);
                    f.add(c4);
                    gbc.gridx=0;
                    gbc.gridy=5;
                    gb.setConstraints(b1,gbc);
                    f.add(b1);
                    gbc.gridx=1;
                    gbc.gridy=5;
                    gb.setConstraints(b2,gbc);
                    f.add(b2);
                    gbc.gridx=2;
                    gbc.gridy=5;
                    gb.setConstraints(b3,gbc);
                    f.add(b3);
                    f.setSize(400,400);
                    f.setVisible(true);
                    b1.addActionListener(new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            c1.setState(true);
                        }
                    });
                    b3.addActionListener(new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            System.exit(0);
                        }
                    });
                    b2.addActionListener(new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            Frame f=new Frame("Quiz");
                            Label l1=new Label("Q.(4) Is java Support pointers?");
                            CheckboxGroup cg=new CheckboxGroup();
                            Checkbox c1=new Checkbox("Yes",cg,false);
                            Checkbox c2=new Checkbox("No",cg,false);
                            Button b1=new Button("Check");
                            Button b2=new Button("Next");
                            Button b3=new Button("Quit");
                            Font font=new Font("Arial",Font.BOLD,12);
                                l1.setFont(font);
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
                                gb.setConstraints(c1,gbc);
                                f.add(c1);
                                gbc.gridx=0;
                                gbc.gridy=2;
                                gb.setConstraints(c2,gbc);
                                f.add(c2);
                                gbc.gridx=0;
                                gbc.gridy=5;
                                gb.setConstraints(b1,gbc);
                                f.add(b1);
                                gbc.gridx=1;
                                gbc.gridy=5;
                                gb.setConstraints(b2,gbc);
                                f.add(b2);
                                gbc.gridx=2;
                                gbc.gridy=5;
                                gb.setConstraints(b3,gbc);
                                f.add(b3);
                                f.setSize(400,400);
                                f.setVisible(true);
                                b1.addActionListener(new ActionListener()
                                {
                                    @Override
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        c2.setState(true);
                                    }
                                });
                                b3.addActionListener(new ActionListener()
                                {
                                    @Override
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        System.exit(0);
                                    }
                                });
                                b2.addActionListener(new ActionListener()
                                {
                                    @Override
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        Frame f=new Frame("Quiz");
                                        Label l1=new Label("Q.(5) What is the output of this code?");
                                        Label l2=new Label("class test");
                                        Label l3=new Label("{");
                                        Label l4=new Label("public static void main(String []args)");
                                        Label l5=new Label("{");
                                        Label l6=new Label("int a=25;");
                                        Label l7=new Label("a*=5;");
                                        Label l8=new Label("a+=2;");
                                        Label l9=new Label("System.out.print(a)");
                                        Label l10=new Label("}");
                                        Label l11=new Label("}");
                                        CheckboxGroup cg=new CheckboxGroup();
                                        Checkbox c1=new Checkbox("25",cg,false);
                                        Checkbox c2=new Checkbox("127",cg,false);
                                        Checkbox c3=new Checkbox("125",cg,false);
                                        Checkbox c4=new Checkbox("142",cg,false);
                                        Button b1=new Button("Check");
                                        Button b2=new Button("Next");
                                        Button b3=new Button("Quit");
                                            Font font=new Font("Arial",Font.BOLD,12);
                                            l1.setFont(font);
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
                                            gbc.gridx=0;
                                            gbc.gridy=3;
                                            gb.setConstraints(l4,gbc);
                                            f.add(l4);
                                            gbc.gridx=0;
                                            gbc.gridy=4;
                                            gb.setConstraints(l5,gbc);
                                            f.add(l5);
                                            gbc.gridx=0;
                                            gbc.gridy=5;
                                            gb.setConstraints(l6,gbc);
                                            f.add(l6);
                                            gbc.gridx=0;
                                            gbc.gridy=6;
                                            gb.setConstraints(l7,gbc);
                                            f.add(l7);
                                            gbc.gridx=0;
                                            gbc.gridy=7;
                                            gb.setConstraints(l8,gbc);
                                            f.add(l8);
                                           gbc.gridx=0;
                                           gbc.gridy=8;
                                           gb.setConstraints(l9,gbc);
                                           f.add(l9);
                                        gbc.gridx=0;
                                        gbc.gridy=9;
                                        gb.setConstraints(l10,gbc);
                                        f.add(l10);
                                        gbc.gridx=0;
                                        gbc.gridy=10;
                                        gb.setConstraints(l11,gbc);
                                        f.add(l11);
                                        gbc.gridx=0;
                                        gbc.gridy=11;
                                        gb.setConstraints(c1,gbc);
                                        f.add(c1);
                                        gbc.gridx=0;
                                        gbc.gridy=12;
                                        gb.setConstraints(c2,gbc);
                                        f.add(c2);
                                        gbc.gridx=0;
                                        gbc.gridy=13;
                                        gb.setConstraints(c3,gbc);
                                        f.add(c3);
                                        gbc.gridx=0;
                                        gbc.gridy=14;
                                        gb.setConstraints(c4,gbc);
                                        f.add(c4);
                                        gbc.gridx=0;
                                        gbc.gridy=15;
                                        gb.setConstraints(b1,gbc);
                                        f.add(b1);
                                        gbc.gridx=1;
                                        gbc.gridy=15;
                                        gb.setConstraints(b3,gbc);
                                        f.add(b3);
                                            f.setSize(400,500);
                                            f.setVisible(true);
                                            b1.addActionListener(new ActionListener()
                                            {
                                                @Override
                                                public void actionPerformed(ActionEvent e)
                                                {
                                                    c2.setState(true);
                                                }
                                            });
                                            b3.addActionListener(new ActionListener()
                                            {
                                                @Override
                                                public void actionPerformed(ActionEvent e)
                                                {
                                                    System.exit(0);
                                                }
                                            });


                                        }
                                });
                        }
                    });
                }
            });

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
    new Quiz();
}
}

