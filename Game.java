
import javax.swing.*;

import Staff.BusBoy;
import Staff.Characters;
import Staff.Chef;
import Staff.Manager;
import Staff.Options;
import Staff.Pizza;
import Staff.RequestItems;
import Staff.waiter;
import Staff.Items.ClipBoard;
import Staff.Items.Pan;
import Staff.Items.Tray;
import Staff.Items.Tub;
import Staff.Items.Weapons;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;
import java.awt.event.*;

public class Game extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener {

	private BufferedImage back;
	private int key, x, y;
	private ArrayList<Characters> CharList;
	private String screen;
	private Characters player;
	private ImageIcon kitchenbackground;
	private ArrayList<Weapons> WeapList;
	private Queue <Customers> customer;  
	private ImageIcon restaurant;
	private long startTime;
    private boolean taskCompleted = false;
	private int RequestItems;
	// private ArrayList <Ranged> rangedWeap;
	private File saveFile; 
	private double time;
	private double ctime;

	public Game() {
		new Thread(this).start();
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		saveFile=new File("save_file2.0.txt");
		key = -1;
		x = 0;
		y = 0;
		CharList = setCharList();
		WeapList = setWeapList(); 
		screen = "start";
		// rangedWeap = new ArrayList <Ranged> ();
		customer = setEs();
		//System.out.println(CharList.get(0).getTasks().getList());
		restaurant=new ImageIcon ("pictures/restaurantbackground.jpg");
		kitchenbackground=new ImageIcon ("pictures/kitchen.jpg");
		RequestItems = 0;
		time=System.currentTimeMillis();
		ctime=0;
	}

	public void createFile(){
		try {
			if(saveFile.createNewFile()){
				System.out.println("succesfully cretaed file!");
			}
			else{
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void readFile(){
		Scanner sc;
		try {
			sc = new Scanner(saveFile);
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void writeToFile(){
		FileWriter myWriter;
		try{
	 myWriter = new FileWriter(saveFile);

	//write whatever you want to save 
	if(customer.isEmpty()){
		myWriter.write("win");
	}
	else {
		myWriter.write("you have "+customer.size()+"tasks left left");
	}
	myWriter.close();
	System.out.println("succesfuly wrote to file");
} catch (IOException e){
	// TODO Auto-generated castch block 
	e.printStackTrace();
}
}

	

	public Queue <Customers> setEs(){
		Queue <Customers> temp = new LinkedList <> ();
		temp.add(new Aliki(100, 100));
		temp.add(new Campbell(100,100));
		temp.add(new Caitlyn(100,100));
		return temp;
	}

	public ArrayList<Characters> setCharList() {
		ArrayList<Characters> temp = new ArrayList<>();
		temp.add(new Chef(200, 400));
		temp.add(new waiter(450, 400));
		temp.add(new BusBoy(700, 400));
		temp.add(new Manager(1000, 400));
		temp.add(new Aliki(100, 100));
		temp.add(new Campbell(500,100));
		temp.add(new Caitlyn(900,100));

		return temp;
	}

	public ArrayList<Weapons> setWeapList() {
		ArrayList<Weapons> temp = new ArrayList<>();
		temp.add(new Tray(200, 600));
		temp.add(new Pan(450, 600));
		temp.add(new Tub(700, 600));
		temp.add(new ClipBoard(1000, 600));

		return temp;
	}

	

	

	@SuppressWarnings("static-access")
	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(5);
				repaint();
			}
		} catch (Exception e) {
		}
	}

	public void paint(Graphics g) {

		Graphics2D twoDgraph = (Graphics2D) g;
		if (back == null)
			back = (BufferedImage) ((createImage(getWidth(), getHeight())));

		Graphics g2d = back.createGraphics();

		g2d.clearRect(0, 0, getSize().width, getSize().height);

		drawScreens(g2d);

		twoDgraph.drawImage(back, null, 0, 0);
		
	}



	private void drawScreens(Graphics g2d) {
		switch (screen) {
			case "start":
			g2d.drawImage(restaurant.getImage(),0,0,getWidth(),getHeight(),this);

			for (Characters c : CharList) {
					// System.out.println(c);
					c.drawChar(g2d);
				}

				for (Weapons w : WeapList) {
					w.drawWeap(g2d);
				}
				
			break;

			case "selection":

				drawSelectScreen(g2d);
				
				g2d.fillRect(300,900,200,50);
				g2d.setColor(Color.white);
				g2d.drawString("starts",350,930);
				break;

			case "Locations":
			g2d.setFont(new Font("Courier New", Font.PLAIN, 50));
			double currentTime = System.currentTimeMillis();
			ctime += (currentTime - time) / 1000;
			time = currentTime;
			
			 player.getLocation().drawLocation(g2d);

			 player.getLocation().getOption();
			drawLocationsScreen(g2d);
			g2d.drawString(new DecimalFormat("#0.00").format(ctime),20,30);
			
			
				break;

				
		}
	}

	public void drawSelectScreen(Graphics g2d) {
		player.drawChar(g2d);
		g2d.setFont(new Font("Courier New", Font.PLAIN, 20));
		g2d.drawString("You picked " + player.toString() + ". Your characteristics are " + " health: " + player.getHealth() + " smarts: "
				+ player.getSmarts() + " friendliness: " + player.getFriendliness() + " speed: " + player.getSpeed(),
				200, 700);

		player.drawWeap(g2d);
		//g2d.drawString("Your weapon levels for " + player.toString() + " is" + ". You skill levels are " +  " damage: " + player.getWeap().getdamage() + " duribility: "
		//		+ player.getWeap().getduribility() + " dps: " + player.getWeap().getDps() + " speed: " + player.getSpeed(), 200, 800);

				customer.peek().drawChar(g2d);

	}
	public void drawLocationsScreen(Graphics g2d) {
		player.drawChar(g2d);
		customer.peek().drawChar(g2d);
	
		// Draw items in the current location
		//for (Options option : player.getLocation().getOptionList()) {
			//System.out.println("init list size "+player.getLocation().getOptionList().get(0).getList().size());
		//	System.out.println("init topp "+player.getLocation().getTopp());

		for(int i=0; i<player.getLocation().getTopp(); i++){
			//System.out.println("init topp "+player.getLocation().getOptionList().get(0).getList().get(i));

		
			player.getLocation().getOptionList().element().getList().get(i).drawImage(g2d);
			}
		}
	
	
	

	
	// DO NOT DELETE
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	// DO NOT DELETE
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		key = e.getKeyCode();
		System.out.println(key);
		if (key == 60) {
			screen = "selection";
			player = CharList.get(0);
		}

		if (key == 32){
			screen= "start";
		}

	
	}

	// DO NOT DELETE
	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		x = arg0.getX();
		y = arg0.getY();
		if(screen == "Locations"){
		player.setX(x);
		player.setY(y);
		}
	}

	 @Override
	public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub


	/* for (Option o : PizList) {
			player = o;
			if (o.mouseCol(x, y)) {
			if(screen.equals("Kitchen")) {	
			
			int topp=0;
			for (int i; i<topp;topp++){
				g2d.draw(PizList.get(topp));
			}
		// collistion 
		topp ++;
			}
			//else if 
		}
	} */
		
	 }


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("entered");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("exited");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

		System.out.println("you clicked at" + arg0.getY());
		x = arg0.getX();
		y = arg0.getY();

		if(screen.equals("start")){
			for (Characters c : CharList) {

				if (c.mouseCol(x, y)) {
					screen = "selection";
					System.out.println(c);
				player = c;
				}
			}
		}
		//customer.remove();
		else if(screen.equals("selection") &&  x>300 && x<500 && y>900 && y<950){
			screen="Locations";
		}
		if(screen.equals("Locations"))
		{
			for( RequestItems r: player.getLocation().getOption().getList()){
			if(r.mouseCol(arg0.getX(), arg0.getY())){
				//stuff happens]
				player.getLocation().incTopp();
				break;
			}
		}
	}
	}
	

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
