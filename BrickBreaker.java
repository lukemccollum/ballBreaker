import javax.swing.JFrame;


public class BrickBreaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the frame for the game to run in
		JFrame obj = new JFrame();
		Gameplay gamePlay = new  Gameplay();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Brick Breaker");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
	}

}
