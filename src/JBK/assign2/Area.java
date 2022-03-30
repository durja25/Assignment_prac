package JBK.assign2;

public class Area {

	private double getArea(double x,double y) {
		// TODO Auto-generated method stub
		return x*y;
	}
	public static void main(String[] args) {
//		double z = getArea() to use this method has to have static
		Area a =new Area();
		System.out.println(a.getArea(10.2,23.4));
		
	}
}
