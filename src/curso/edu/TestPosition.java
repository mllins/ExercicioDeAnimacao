package curso.edu;

public class TestPosition {

	public static void main(String[] args) {
		Position p = new Position();
		p.setPolarPositionInDegrees(120, 0);
		System.out.println(p.getX() + ", " + p.getY());
		for(int i=0; i<72 ; i++) { 
			p.addPolarPositionInDegrees(0, 5);
			System.out.println(p.getX() + ", " + p.getY());
		}
	}
}
