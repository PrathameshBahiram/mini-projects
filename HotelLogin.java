import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.*;


class HotelLogin extends JFrame   implements ActionListener 
{
	JLabel ltitleimg,title,luser,lpass,login;
	JTextField txt1;
	JPasswordField pwd;
	JButton blog,reset,close;
	void validation()
	{
		setTitle("HOTEL MANAGEMENT SYSTEM");
		setSize(520,500);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon img = new  ImageIcon("hotelhero.png");
		ltitleimg = new JLabel(img);
		ltitleimg.setBounds(1,1,500,200);
		add(ltitleimg);

		title = new JLabel("R_O_Y_A_L  H_O_T_E_L_");
		title.setForeground(Color.RED);
		title.setBounds(180,210,300,30);
		add(title);

		login = new JLabel("LOGIN PAGE");
		login.setForeground(Color.BLUE);
		login.setBounds(200,250,70,30);
		add(login);
			
		luser = new JLabel("USERNAME::");
		luser.setBounds(110,292,70,30);
		add(luser);

		txt1 = new JTextField(10);
		txt1.setBounds(250,297,100,20);
		add(txt1);

		lpass = new JLabel("PASSWORD::");
		lpass.setBounds(110,350,90,30);
		add(lpass);

		pwd = new JPasswordField();
		pwd.setBounds(250,357,100,20);
		add(pwd);

		blog = new JButton("LOGIN");
		blog.setBounds(80,400,90,30);
		blog.setForeground(Color.BLUE);
		blog.addActionListener(this);
		add(blog);

		reset = new JButton("RESET");
		reset.setBounds(190,400,90,30);
		reset.setForeground(Color.GREEN);
		reset.addActionListener(this);
		add(reset);

		close = new JButton("CLOSE");
		close.setBounds(300,400,90,30);
		close.setForeground(Color.RED);
		close.addActionListener(this);
		add(close);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==blog)
		{
			String user ,pass;
			user= txt1.getText();
			pass= pwd.getText();

			if(user.equals("Admin") && pass.equals("Admin@123"))
			{
				JOptionPane.showMessageDialog(this,"LOGIN SUCCESSFULL");
				
				 EmployeePage objemp = new EmployeePage();
                                 objemp	.setVisible(true);
				 this.setVisible(false);
			}
			else if(user.equals("") && pass.equals(""))
			{
				JOptionPane.showMessageDialog(this,"PLEASE ENTER USERNAME AND PASSWORD");
			}
			else
			{
				
				JOptionPane.showMessageDialog(this," INCORRECT PASSWORD");
			}
		}
		if(e.getSource()==reset)
		{
			txt1.setText(" ");
			pwd.setText("");
		}
		if(e.getSource()==close)
		{	
			this.dispose();
		}
		
	}


	class EmployeePage extends JFrame  implements ActionListener
	{
		JLabel title,subtitle,empid,name,desig,address,telephn,email;
		JComboBox desg;
		JTextField id,nm,adds,phno,mail;
		JButton adduser,reset,back,housekep;
  		EmployeePage()
		{
		    setLayout(null);
		    setTitle("EMPLOYEES PAGE");
		    setVisible(true);
         	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           	    setSize(520,500);
		
			
		    title = new JLabel("R_O_Y_A_L  H_O_T_E_L_");
		    title.setForeground(Color.RED);
           	    title.setBounds(180,10,150,30);
           	    add(title);
			
	
		    subtitle = new JLabel("EMPLOYESS PAGE");
		    subtitle.setBounds(180,50,150,30);
		    subtitle.setForeground(Color.BLUE);
		    add(subtitle);

		    empid = new JLabel("Employee Id:");
		    empid.setBounds(30,100,100,30);
		    add(empid);

		    adduser = new JButton("ADDUSER");
	            adduser.setForeground(Color.GREEN);
		    adduser.setBounds(300,100,100,30);
		    adduser.addActionListener(this);
		    add(adduser);

		    reset = new JButton("RESET");
		    reset.setBounds(300,160,100,30);
		    reset.setForeground(Color.RED);
		    reset.addActionListener(this);
		    add(reset);

		    back = new JButton("PREVIOUS");
		    back.setForeground(Color.YELLOW);
		    back.setBounds(300,290,100,30);
		    back.addActionListener(this);
		    add(back);

		    housekep = new JButton("HOUSEKEEPING PAGE");
		    housekep.setBounds(300,340,150,30);
	            housekep.setForeground(Color.ORANGE);
		    housekep.addActionListener(this);
		    add(housekep);
			
	
		    id = new JTextField(10);
		    id.setBounds(150,107,100,20);
		    add(id);

		    name = new JLabel("Name:");
		    name.setBounds(30,160,100,30);
		    add(name);

		    nm = new JTextField(10);
		    nm.setBounds(150,167,100,20);
		    add(nm);
			
		    desig = new JLabel("Designation:"); 
		    desig.setBounds(30,230,100,30);
		    add(desig);

		    String str[] ={"Assistant","Clerk","Manager","Event Planner","Porter","waiter","Executive Chef"};
		
		    desg = new JComboBox(str);
		    desg.setBounds(150,237,150,20);
		    add(desg);	

		    address = new JLabel("Address:");
		    address.setBounds(30,290,100,30);
		    add(address);
		
		
		   adds = new JTextField(10);
		   adds.setBounds(150,297,100,20);
		   add(adds);
			
		   telephn = new JLabel("Telephone");
		   telephn.setBounds(30,340,100,30);
		   add(telephn);
			
		   phno = new JTextField(10);
		   phno.setBounds(150,347,100,20);
		   add(phno);	

		  email = new JLabel("Email :");
		  email.setBounds(30,390,100,30);
		  add(email);
		
		  mail = new JTextField(10);
		  mail.setBounds(150,397,100,20);
		  add(mail);		    	    
			
	
       		 }
		 public void actionPerformed(ActionEvent e)
		 {
			if(e.getSource() == back )
			{
				this.dispose();
				this.setVisible(false);
				HotelLogin objhotellogin = new  HotelLogin();
				objhotellogin.validation();
			}
			if(e.getSource()== adduser)
			{
				JOptionPane.showMessageDialog(this," USER ADDED SUCCESSFULLY");
			}
			if(e.getSource()== reset)
			{
				id.setText("");
				nm.setText("");
				adds.setText("");
				phno.setText("");
				mail.setText("");
			}
			if(e.getSource() == housekep )
			{
				HouseKeep  objkeep = new  HouseKeep();
				objkeep.setVisible(true);
				this.setVisible(false);
			}
		 } 
    	}
	
	class HouseKeep extends JFrame implements ActionListener
	{
		JLabel title,subtitle,flno,rmno,status, assign;
		JComboBox  fq,fl;
		JRadioButton  clean ,unclean;
		ButtonGroup b1;
		JTextField  room, assignto;
		JButton update,back,reservation,reset;
		HouseKeep()
		{
		    setLayout(null);
		    setTitle("HOUSEKEEPING PAGE");
		    setVisible(true);
         	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           	    setSize(520,500);
			
		    title = new JLabel("R_O_Y_A_L  H_O_T_E_L_");
		    title.setForeground(Color.RED);
           	    title.setBounds(180,10,150,30);
           	    add(title);
			
	
		    subtitle = new JLabel("HOUSEKEEPING PAGE");
		    subtitle.setBounds(180,50,150,30);
		    subtitle.setForeground(Color.BLUE);
		    add(subtitle);

	            flno = new JLabel("FLOOR NO:");
		    flno.setBounds(30,100,100,30);
		    add(flno);

		    String floor[] = new String[20];
        	    for(int i =0;i<floor.length;i++)
                    {
           		 floor[i] = ""+(int)(i+1);
        	    }
		    
		    fl = new JComboBox(floor);
		    fl.setBounds(150,107,50,20);
		    add(fl);

		    rmno = new JLabel("ROOM NO:");
		    rmno.setBounds(30,160,100,30);
		    add(rmno);

		    room= new JTextField(10);
		    room.setBounds(150,167,100,20);
		    add(room);
			
		    status = new JLabel("STATUS:"); 
		    status.setBounds(30,230,100,30);
		    add(status);		
			
	            clean  = new JRadioButton("CLEANED");
		    clean.setBounds(150,237,150,20);
		    add(clean);

		    unclean  = new JRadioButton("NOT-UNCLEANED");
		    unclean.setBounds(300,237,150,20);
		    add(unclean);

		    b1 = new ButtonGroup();
		    b1.add(clean);
		    b1.add(unclean);
		
     	            assign = new JLabel("Assigned To:");
		    assign.setBounds(30,290,100,30);
		    add(assign);
		
		
		   assignto = new JTextField(10);
		   assignto.setBounds(150,297,100,20);
		   add(assignto);
		
		  update = new JButton("UPDATE STATUS");
		  update.setBounds(10,350,150,30);
		  update.addActionListener(this);
		  update.setForeground(Color.GREEN);
		  add(update);
		
		  back = new JButton("PREVIOUS");
		  back.setBounds(175,350,100,30);
		  back.setForeground(Color.RED);
		  back.addActionListener(this);
		  add(back);
		
		  reservation = new JButton("RESERVATION");
		  reservation.setBounds(288,350,100,30);
		  reservation.addActionListener(this);
		  reservation.setForeground(Color.BLUE);
		  add(reservation);

		  reset = new JButton("RESET");
		  reset.setBounds(395,350,100,30);
		  reset.setForeground(Color.YELLOW);
		  reset.addActionListener(this);
		  add(reset);
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()== update)
			{
				JOptionPane.showMessageDialog(this," STATUS UPDATE SUCCESSFULLY");
			}
			
			if(e.getSource()== back)
			{
				this.dispose();
				this.setVisible(false);
				EmployeePage objemp = new EmployeePage();
			}
			if(e.getSource()==reservation)
			{
				Reservation objreserv =  new Reservation();
				objreserv.setVisible(true);
				this.dispose();
			}
			if(e.getSource()==reset)
			{
				room.setText("");
				assignto.setText("");
				
			}
		}	
	}
	
	 class Reservation extends JFrame implements ActionListener
	{	
		JLabel title,subtitle,lconfirm,rmno,chkdate,chkoutdate;
		JTextField  confm,room,indate,outdate;
		JButton payment,register,reset,back;
		Reservation()
		{
		    setLayout(null);
		    setTitle("RESERVATION PAGE");
		    setVisible(true);
         	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           	    setSize(520,500);

		    title = new JLabel("R_O_Y_A_L  H_O_T_E_L_");
		    title.setForeground(Color.RED);
           	    title.setBounds(180,10,150,30);
           	    add(title);
			
	
		    subtitle = new JLabel("RESERVATION PAGE");
		    subtitle.setBounds(180,50,150,30);
		    subtitle.setForeground(Color.BLUE);
		    add(subtitle);

		    lconfirm = new JLabel("CONFIRMATION ID:");
		    lconfirm.setBounds(30,100,120,30);
		    add(lconfirm);

		    confm = new JTextField(10);
		    confm.setBounds(150,107,100,20);
		    add(confm);

		    rmno = new JLabel("ROOM NO:");
		    rmno.setBounds(30,160,100,30);
		    add(rmno);

		    room= new JTextField(10);
		    room.setBounds(150,167,100,20);
		    add(room);

		    chkdate = new JLabel("CHECK IN DATE:"); 
		    chkdate.setBounds(30,230,100,30);
		    add(chkdate);		
			
	            indate  = new JTextField(10);
		    indate.setBounds(150,237,100,20);
		    add(indate);
		
		    chkoutdate = new JLabel("CHECK OUT DATE:");
		    chkoutdate.setBounds(30,290,130,30);
		    add(chkoutdate);
		
		
		    outdate = new JTextField(10);
		    outdate.setBounds(150,297,100,20);
		    add(outdate);
		
		    payment = new JButton("PAYMENT");
		    payment.setBounds(10,350,150,30);
		    payment.addActionListener(this);
		    payment.setForeground(Color.GREEN);
		    add(payment);
		
		    back = new JButton("PREVIOUS");
		    back.setBounds(175,350,100,30);
		    back.addActionListener(this);
		    back.setForeground(Color.RED);
		    add(back);
		
		    register = new JButton("REGISTER");
		    register.setBounds(288,350,100,30);
		    register.addActionListener(this);
		    register.setForeground(Color.BLUE);
		    add(register);

		    reset = new JButton("RESET");
		    reset.setBounds(395,350,100,30);
		    reset.addActionListener(this);
		    reset.setForeground(Color.YELLOW);
		    add(reset);
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == payment)
			{
				
				Payment  objpay = new Payment();
				objpay.setVisible(true);
				this.dispose();
			}
			if(e.getSource() == back)
			{
				this.dispose();
				HouseKeep  objkeep = new  HouseKeep();
				
			}
			if(e.getSource() == register)
			{
				JOptionPane.showMessageDialog(this," RESERVATION REGISTER SUCCESSFULLY");
			}
			if(e.getSource() == reset)
			{
				confm.setText("");
				room.setText("");
				indate.setText("");
				outdate.setText("");
			}
		}
	}
	class Payment extends JFrame implements ActionListener
	{
		JLabel title,subtitle,rmno,price,daystay;
		JTextField room,rs,days;
		JButton back,finalbill,reset;
		Payment()
		{
		    setLayout(null);
		    setTitle("PAYMENT PAGE");
		    setVisible(true);
         	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           	    setSize(520,500);
		
		    title = new JLabel("R_O_Y_A_L  H_O_T_E_L_");
		    title.setForeground(Color.RED);
           	    title.setBounds(180,10,150,30);
           	    add(title);
			
	
		    subtitle = new JLabel("PAYMENT PAGE");
		    subtitle.setBounds(180,50,150,30);
		    subtitle.setForeground(Color.BLUE);
		    add(subtitle);
		
		    rmno = new JLabel("ROOM NO:");
		    rmno.setBounds(30,100,120,30);
		    add(rmno);

		    room = new JTextField(10);
		    room.setBounds(150,107,100,20);
		    add(room);
			
		    price = new JLabel("PRICE:");
		    price.setBounds(30,160,100,30);
		    add(price);

		    rs = new JTextField(10);
		    rs.setBounds(150,167,100,20);
		    add(rs);

		    daystay = new JLabel("DAYS OF STAY:"); 
		    daystay.setBounds(30,230,100,30);
		    add(daystay);		
			
	            days  = new JTextField(10);
		    days.setBounds(150,237,100,20);
		    add(days);

		    finalbill = new JButton("FINAL BILL");
		    finalbill.setBounds(10,350,150,30);
		    finalbill.addActionListener(this);
		    finalbill.setForeground(Color.GREEN);
		    add(finalbill);
		
		    back = new JButton("PREVIOUS");
		    back.setBounds(175,350,100,30);
		    back.addActionListener(this);
		    back.setForeground(Color.RED);
		    add(back);
		
		    reset = new JButton("RESET");
		    reset.setBounds(288,350,100,30);
		    reset.addActionListener(this);
		    reset.setForeground(Color.BLUE);
		    add(reset);

		}

		
		
		public void actionPerformed(ActionEvent e)
		{
			 SimpleDateFormat formator = new  SimpleDateFormat("dd//MM//yyyy    HH:mm:ss");
		        Date date = new Date();
		        String strdate = formator.format(date);
			int pz=Integer.parseInt(rs.getText());
                        int dey  = Integer.parseInt(days.getText());
			int total = pz * dey;
		
			if(e.getSource()== finalbill)
			{
				
			    JOptionPane.showMessageDialog(this,"---------------------------------------------R_O_Y_A_L  H_O_T_E_L_ ------------------------------------------\n"
			    +"Hotel Bill 								                                                                         Date And Time :"+strdate
			    +"\n----------------------------------------------------------------------------------------------------------------------------\n"
			    +"Room No:"+room.getText()
			    +"\nPrice:"+pz
			    +"\nDays Of Stay :"+dey
			    +"\n----------------------------------------------------------------------------------------------------------------------------\n"
			    +"\nTotal Amount :"+total);                                                                                    
			}
			if(e.getSource()== back)
			{
				this.dispose();
				Reservation objreserv =  new Reservation();
			}
			if(e.getSource()== reset)
			{
				room.setText("");
				rs.setText("");
				days.setText("");
			}
		}
	}
	public static void main(String a[])
	{
		HotelLogin objhotellogin = new  HotelLogin();
		objhotellogin.validation();
	}
}