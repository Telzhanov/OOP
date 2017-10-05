import java.util.Vector;
public class Player {
	Side side;
	static Vector <Piece> v1=new Vector<Piece>();
	public Player(Side side) {
		this.side=side;
		if (this.side==Side.WHITE) {
				Piece w1= new Pawn(2,1,this.side);
				v1.add(w1);
				Piece w2= new Pawn(2,2,this.side);
				v1.add(w2);
				Piece w3= new Pawn(2,3,this.side);
				v1.add(w3);
				Piece w4 =new Pawn(2,4,this.side);
				v1.add(w4);
				Piece w5= new Pawn(2,5,this.side);
				v1.add(w5);
				Piece w6= new Pawn(2,6,this.side);
				v1.add(w6);
				Piece w7= new Pawn(2,7,this.side);
				v1.add(w7);
				Piece w8= new Pawn(2,8,this.side);
				v1.add(w8);
				Piece w9= new Rook(1,1,this.side);
				v1.add(w9);
				Piece w10= new Knight(1,2,this.side);
				v1.add(w10);
				Piece w11= new Bishop(1,3,this.side);
				v1.add(w11);
				Piece w12= new King(1,4,this.side);
				v1.add(w12);
				Piece w13= new Queen(1,5,this.side);
				v1.add(w13);
				Piece w14= new Bishop(1,6,this.side);
				v1.add(w14);
				Piece w15= new Knight(1,7,this.side);
				v1.add(w15);
				Piece w16= new Rook(1,8,this.side);
				v1.add(w16);
		}
		else {
			this.side=Side.BLACK;
			Piece b1= new Pawn(7,1,this.side);
			v1.add(b1);
			Piece b2= new Pawn(7,2,this.side);
			v1.add(b2);
			Piece b3= new Pawn(7,3,this.side);
			v1.add(b3);
			Piece b4 =new Pawn(7,4,this.side);
			v1.add(b4);
			Piece b5= new Pawn(7,5,this.side);
			v1.add(b5);
			Piece b6= new Pawn(7,6,this.side);
			v1.add(b6);
			Piece b7= new Pawn(7,7,this.side);
			v1.add(b7);
			Piece b8= new Pawn(7,8,this.side);
			v1.add(b8);
			Piece b9= new Rook(8,1,this.side);
			v1.add(b9);
			Piece b10= new Knight(8,2,this.side);
			v1.add(b10);
			Piece b11= new Bishop(8,3,this.side);
			v1.add(b11);
			Piece b12= new King(8,4,this.side);
			v1.add(b12);
			Piece b13= new Queen(8,5,this.side);
			v1.add(b13);
			Piece b14= new Bishop(8,6,this.side);
			v1.add(b14);
			Piece b15= new Knight(8,7,this.side);
			v1.add(b15);
			Piece b16= new Rook(8,8,this.side);
			v1.add(b16);
		}
	}
}
