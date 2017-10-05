import java.util.Scanner;

public class Game {
	static Scanner s1= new Scanner(System.in);
	static void boardDraw() {
		boolean isFigure=false;
		for (int i=1; i<=8; i++) {
			System.out.print(i+" ");
			for (int j=1; j<=8; j++) {
				for (int k=0; k<Player.v1.size(); k++) {
					if (Player.v1.get(k).a.x==i && Player.v1.get(k).a.y==j) {
						System.out.print(Player.v1.get(k).toString());
						isFigure=true;
					}
				}
				if (!isFigure){
					System.out.print("|_");	
				}
				isFigure=false;
				
			}
			System.out.println();
		}
	}
	static boolean isEat(int x,int y,Player p) {
		for (int i=0; i<Player.v1.size(); i++) {
			if (Player.v1.get(i).a.x==x && Player.v1.get(i).a.y==y && Player.v1.get(i).side!=p.side) {
					Player.v1.remove(i);	
				return true;
			}
		}
		return false;
	}
	static boolean isFree(int x,int y,Player p) {
		for (int i=0; i<Player.v1.size(); i++) {
			if (Player.v1.get(i).a.x==x && Player.v1.get(i).a.y==y) {
				return false;
				}
			}
		return true;
	}
	static void Move(int x,int y, int x1, int y1, Player p) {
		for (int i=0; i<Player.v1.size(); i++) {
			if (Player.v1.get(i).a.x==x && Player.v1.get(i).a.y==y) {
				Player.v1.get(i).b.x=x1;
				Player.v1.get(i).b.y=y1;
				if (Player.v1.get(i).isLegalMove() && isEat(x1,y1,p) && isFree(x1,y1,p)) {
					Player.v1.get(i).changePos(x1, y1);
				}
				else if (Player.v1.get(i).isLegalMove() && isFree(x1,y1,p)  ) {
					Player.v1.get(i).changePos(x1, y1);
				}
				else {
					System.out.println("Wrong move");
				}
			}
		}
		}
	public static void main(String args[]) {
		boolean isWhite=true;
		Player p1=new Player(Side.WHITE);
		Player p2=new Player(Side.BLACK);
		boardDraw();
		while(true) {
			int x=s1.nextInt();
			int y=s1.nextInt(); 
			int x1=s1.nextInt();
			int y1=s1.nextInt();
			if (isWhite) {
				Move(x,y,x1,y1,p1);
			}
			else {
				Move(x,y,x1,y1,p2);
			}
		
			boardDraw();
			if (isWhite) isWhite=false;
			isWhite=true;
		}
		
	}
	
}
