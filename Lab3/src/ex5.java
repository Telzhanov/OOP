class Position{
	int x;
	int y;
	public Position(int x,int y) {
		this.x= x;
		this.y= y;
	}
	public Position() {
		
	}
}
abstract class Piece{
	Side side;
	Position a=new Position();
	Position b=new Position();
	abstract boolean isLegalMove();
	public Piece(Position a,Position b) {
		this.a=a;
		this.b=b;
	}
	public Piece() {
		
	}
	public Piece(int x, int y,Side side) {
		a=new Position(x,y);
		this.side=side;
	}
	public void changePos(int x , int y)
	{
		a.x=x;
		a.y=y;
	}
}
class Pawn extends Piece{
	public Pawn(Position a,Position b) {
		super(a,b);
	}
	public Pawn() {
		
	}
	public Pawn(int x,int y,Side side) {
		super(x,y,side);
	}
	boolean isLegalMove() {
			if (a.y==b.y && Math.abs(b.x-a.x)<=2)	return true;
			return false;
	}
	public String toString() {
		return "\u2659   ";
	}
}
class King extends Piece{
	public King(Position a, Position b) {
		super(a,b);
	}
	public King() {
		
	}
	public King(int x,int y,Side side) {
		super(x,y,side);
	}
	boolean isLegalMove() {
		if (Math.abs((double)b.x-(double)a.x)<2 && Math.abs((double)b.y-(double)a.y)<2) return true;
		return false;
	}
	public String toString() {
		return "\u2654   ";
	}
}
class Bishop extends Piece{
	public Bishop(Position a,Position b) {
		super(a,b);
	}
	public Bishop() {
		
	}
	public Bishop(int x,int y,Side side) {
		super(x,y,side);
	}
	boolean isLegalMove() {
		if (Math.abs((double)b.x-(double)a.x)==Math.abs((double)b.y-(double)a.y)) return true;
		return false;
	}
	public String toString() {
		return "\u2657   ";
	}
}
class Rook extends Piece{
	public Rook(Position a, Position b) {
		super(a,b);
	}
	public Rook() {
		
	}
	public Rook(int x,int y,Side side) {
		super(x,y,side);
	}
	boolean isLegalMove() {
		if (a.x==b.x || b.y==a.y)return true;
		return false;
	}
	public String toString() {
		return "\u2656   ";
	}
}
class Queen extends Piece{
	public Queen(Position a,Position b) {
		super(a,b);
	}
	public Queen() {
		
	}
	public Queen(int x,int y,Side side) {
		super(x,y,side);
	}
	boolean isLegalMove() {
		if ((a.x==b.x || b.y==a.y) || (Math.abs((double)b.x-(double)a.x)==Math.abs((double)b.y-(double)a.y))) return true;
		return false;
	}
	public String toString() {
		return "\u2655   ";
	}
}
class Knight extends Piece{
	public Knight(Position a, Position b) {
		super(a,b);
	}
	public Knight() {
		
	}
	public Knight(int x,int y,Side side) {
		super(x,y,side);
	}
	boolean isLegalMove() {
		if ((Math.abs((double)(b.x-a.x))==1 ||(Math.abs((double)(b.y-a.y))==1))  && ((Math.abs((double)b.y-a.y)==2) ||(Math.abs((double)b.x-a.x)==2) )) return true;
		return false;
	}
	public String toString() {
		return "\u2658   ";
	}
}



public class ex5 {
	public static void main(String[] args) {
		Piece p1= new Pawn(new Position(1,2),new Position(1,3));
		System.out.println(p1.isLegalMove());
		Piece p2 = new King(new Position(3,3),new Position(3,3));
		System.out.println(p2.isLegalMove());
		Piece p3= new Bishop(new Position(5,5), new Position(7,3));
		System.out.println(p3.isLegalMove());
		Piece p4 = new Rook(new Position(3,3), new Position(1,3));
		System.out.println(p4.isLegalMove());
		Piece p5= new Queen(new Position(3,3), new Position(5,5));
		System.out.println(p5.isLegalMove());
		Piece p6 = new Knight(new Position(3,3), new Position(1,4));
		System.out.println(p6.isLegalMove());
		
	}
}
