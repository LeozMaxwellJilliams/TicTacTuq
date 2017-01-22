import java.util.*;
import java.io.*;
import java.math.*;
import javax.sound.sampled.AudioSystem;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.MouseInfo;


public class TicGame extends JFrame implements ActionListener{
	javax.swing.Timer myTimer, gameTimer;   
	GamePanel game;
	
	public TicGame() {
		super("Tic Tac Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,500);

		gameTimer = new javax.swing.Timer(10,this);  

		game = new GamePanel(this);
		add(game);
	
		
		setResizable(false);
		setVisible(true);
    }
	
	public void start(){
		gameTimer.start();
	}
	
	public void actionPerformed(ActionEvent evt){
		Object source = evt.getSource();

		game.repaint();
		game.resetMouse();
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicGame frame = new TicGame();
	}

}

class GamePanel extends JPanel implements KeyListener,MouseListener{
	private TicGame mainFrame;
	private Rectangle r1,r2,r3,r4,r5,r6,r7,r8,r9;
	private boolean[] Xmarks, Omarks;
	private Image Xpic, Opic;
	private int cx,cy;
	private boolean Xturn, Oturn, gameover, tied;
	
	public GamePanel(TicGame m){ //constructor
		setSize(600,500);
		
		Xturn = true;
		Oturn = false;
		gameover= false;
		tied = false;
		
		Xmarks = new boolean[9];
		Omarks = new boolean[9];
		
		for (int i=0;i<9;i++){
    		Xmarks[i] = false;
    		Omarks[i] = false;
    	}
		
		r1 = new Rectangle(150,100,100,100);
		r2 = new Rectangle(250,100,100,100);
		r3 = new Rectangle(350,100,100,100);
		r4 = new Rectangle(150,200,100,100);
		r5 = new Rectangle(250,200,100,100);
		r6 = new Rectangle(350,200,100,100);
		r7 = new Rectangle(150,300,100,100);
		r8 = new Rectangle(250,300,100,100);
		r9 = new Rectangle(350,300,100,100);
		
		Xpic = new ImageIcon("playX.png").getImage();
		Opic = new ImageIcon("playO.png").getImage();
		
		
		mainFrame = m;
		
        addKeyListener(this);
        addMouseListener(this);
	}
	
	public void addNotify() {
        super.addNotify();
        requestFocus();
        mainFrame.start();
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		cx = e.getX();
    	cy = e.getY();
    	
    	
    	if (r1.contains(cx,cy)){
    		if (Xturn && !Omarks[0] && !Xmarks[0]){
    			Xmarks[0]=true;
    			Xturn=false;
    			Oturn=true;
    		}
    		else if (Oturn && !Xmarks[0] && !Omarks[0]){
    			Omarks[0]=true;
    			Oturn=false;
    			Xturn=true;
    		}
    	}
    	if (r2.contains(cx,cy)){
    		if (Xturn && !Omarks[1] && !Xmarks[1]){
    			Xmarks[1]=true;
    			Xturn=false;
    			Oturn=true;
    		}
    		else if (Oturn && !Xmarks[1] && !Omarks[1]){
    			Omarks[1]=true;
    			Oturn=false;
    			Xturn=true;
    		}
    	}
    	if (r3.contains(cx,cy)){
    		if (Xturn && !Omarks[2] && !Xmarks[2]){
    			Xmarks[2]=true;
    			Xturn=false;
    			Oturn=true;
    		}
    		else if (Oturn && !Xmarks[2] && !Omarks[2]){
    			Omarks[2]=true;
    			Oturn=false;
    			Xturn=true;
    		}
    	}
    	if (r4.contains(cx,cy)){
    		if (Xturn && !Omarks[3] && !Xmarks[3]){
    			Xmarks[3]=true;
    			Xturn=false;
    			Oturn=true;
    		}
    		else if (Oturn && !Xmarks[3] && !Omarks[3]){
    			Omarks[3]=true;
    			Oturn=false;
    			Xturn=true;
    		}
    	}
    	if (r5.contains(cx,cy)){
    		if (Xturn && !Omarks[4] && !Xmarks[4]){
    			Xmarks[4]=true;
    			Xturn=false;
    			Oturn=true;
    		}
    		else if (Oturn && !Xmarks[4] && !Omarks[4]){
    			Omarks[4]=true;
    			Oturn=false;
    			Xturn=true;
    		}
    	}
    	if (r6.contains(cx,cy)){
    		if (Xturn && !Omarks[5] && !Xmarks[5]){
    			Xmarks[5]=true;
    			Xturn=false;
    			Oturn=true;
    		}
    		else if (Oturn && !Xmarks[5] && !Omarks[5]){
    			Omarks[5]=true;
    			Oturn=false;
    			Xturn=true;
    		}
    	}
    	if (r7.contains(cx,cy)){
    		if (Xturn && !Omarks[6] && !Xmarks[6]){
    			Xmarks[6]=true;
    			Xturn=false;
    			Oturn=true;
    		}
    		else if (Oturn && !Xmarks[6] && !Omarks[6]){
    			Omarks[6]=true;
    			Oturn=false;
    			Xturn=true;
    		}
    	}
    	if (r8.contains(cx,cy)){
    		if (Xturn && !Omarks[7] && !Xmarks[7]){
    			Xmarks[7]=true;
    			Xturn=false;
    			Oturn=true;
    		}
    		else if (Oturn && !Xmarks[7] && !Omarks[7]){
    			Omarks[7]=true;
    			Oturn=false;
    			Xturn=true;
    		}
    	}
    	if (r9.contains(cx,cy)){
    		if (Xturn && !Omarks[8] && !Xmarks[8]){
    			Xmarks[8]=true;
    			Xturn=false;
    			Oturn=true;
    		}
    		else if (Oturn && !Xmarks[8] && !Omarks[8]){
    			Omarks[8]=true;
    			Oturn=false;
    			Xturn=true;
    		}
    	}
    	if (gameover){
    		for (int i=0;i<9;i++){
        		Xmarks[i] = false;
        		Omarks[i] = false;
        	}
    		Xturn = true;
    		Oturn = false;
    		gameover = false;
    		tied = false;
    	}
    	
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void resetMouse(){
    	cx = cy = 0;
    }
	
	public void paintComponent(Graphics g){ 
		g.setColor(new Color(255,255,255));
		g.fillRect(0,0, 600, 500);
		
		g.setColor(new Color(0,0,0));
		g.fillRect(250, 100, 5, 300);
		g.fillRect(350, 100, 5, 300);
		g.fillRect(150,200,300,5);
		g.fillRect(150,300,300,5);
		
		
		if (Xmarks[0]){
    		g.drawImage(Xpic, 150, 100, null);
    		//System.out.println("1");
    	}
		if (Xmarks[1]){
    		g.drawImage(Xpic, 250, 100, null);
    	}
    	if (Xmarks[2]){
    		g.drawImage(Xpic, 350, 100, null);
    	}
    	if (Xmarks[3]){
    		g.drawImage(Xpic, 150, 200, null);
    	}
    	if (Xmarks[4]){
    		g.drawImage(Xpic, 250, 200, null);
    	}
    	if (Xmarks[5]){
    		g.drawImage(Xpic, 350, 200, null);
    	}
    	if (Xmarks[6]){
    		g.drawImage(Xpic, 150, 300, null);
    	}
    	if (Xmarks[7]){
    		g.drawImage(Xpic, 250, 300, null);
    	}
    	if (Xmarks[8]){
    		g.drawImage(Xpic, 350, 300, null);
    	}
		
		if (Omarks[0]){
    		g.drawImage(Opic, 153, 103, null);
    	}
    	if (Omarks[1]){
    		g.drawImage(Opic, 253, 103, null);
    	}
    	if (Omarks[2]){
    		g.drawImage(Opic, 353, 103, null);
    	}
    	if (Omarks[3]){
    		g.drawImage(Opic, 153, 203, null);
    	}
    	if (Omarks[4]){
    		g.drawImage(Opic, 253, 203, null);
    	}
    	if (Omarks[5]){
    		g.drawImage(Opic, 353, 203, null);
    	}
    	if (Omarks[6]){
    		g.drawImage(Opic, 153, 303, null);
    	}
    	if (Omarks[7]){
    		g.drawImage(Opic, 253, 303, null);
    	}
    	if (Omarks[8]){
    		g.drawImage(Opic, 353, 303, null);
    	}
    	
    	if ((Xmarks[0] && Xmarks[1] && Xmarks [2]) || 
    		(Xmarks[3] && Xmarks[4] && Xmarks [5]) ||
    		(Xmarks[6] && Xmarks[7] && Xmarks [8]) ||
    		(Xmarks[0] && Xmarks[3] && Xmarks [6]) ||
    		(Xmarks[1] && Xmarks[4] && Xmarks [7]) ||
    		(Xmarks[2] && Xmarks[5] && Xmarks [8]) ||
    		(Xmarks[0] && Xmarks[4] && Xmarks [8]) ||
    		(Xmarks[2] && Xmarks[4] && Xmarks [6]) ){
    			g.setFont(new Font("Calibri", Font.BOLD, 18));
    			g.drawString("X wins!", 275, 50);
    			g.drawString("Click anywhere to play again!", 175, 75);
    			gameover = true;
    	}
    	
    	if ((Omarks[0] && Omarks[1] && Omarks [2]) || 
        	(Omarks[3] && Omarks[4] && Omarks [5]) ||
        	(Omarks[6] && Omarks[7] && Omarks [8]) ||
        	(Omarks[0] && Omarks[3] && Omarks [6]) ||
       		(Omarks[1] && Omarks[4] && Omarks [7]) ||
       		(Omarks[2] && Omarks[5] && Omarks [8]) ||
       		(Omarks[0] && Omarks[4] && Omarks [8]) ||
       		(Omarks[2] && Omarks[4] && Omarks [6]) ){
    			g.setFont(new Font("Calibri", Font.BOLD, 18));
    			g.drawString("O wins!", 275, 50);
    			g.drawString("Click anywhere to play again!", 175, 75);
    			gameover= true;
        }
    	
    	if (((Omarks[0]||Xmarks[0]) &&
    		(Omarks[1]||Xmarks[1]) &&
    		(Omarks[2]||Xmarks[2]) &&
    		(Omarks[3]||Xmarks[3]) &&
   			(Omarks[4]||Xmarks[4]) &&
   			(Omarks[5]||Xmarks[5]) &&
   			(Omarks[6]||Xmarks[6]) &&
   			(Omarks[7]||Xmarks[7]) &&
    		(Omarks[8]||Xmarks[8]) &&
    		!gameover)||tied){
    		g.setFont(new Font("Calibri", Font.BOLD, 18));
			g.drawString("Tied!", 275, 50);
			g.drawString("Click anywhere to play again!", 175, 75);
			gameover= true;
			tied= true;
    	}
    	
    	g.setFont(new Font("Calibri", Font.BOLD, 18));
    	if (Xturn && !gameover){
    		g.drawString("X turn", 275, 50);
    	}
    	else if(Oturn && !gameover){
    		g.drawString("O turn", 275, 50);
    	}
    	
    	
    		
		
		
		
		
		
	}
}
