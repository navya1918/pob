package core_spring;

public class Triangle {
	private Point pointa;
	private Point pointb;
	private Point pointc;
	public Point getPointa() {
		return pointa;
	}
	public void setPointa(Point pointa) {
		this.pointa = pointa;
	}
	public Point getPointb() {
		return pointb;
	}
	public void setPointb(Point pointb) {
		this.pointb = pointb;
	}
	public Point getPointc() {
		return pointc;
	}
	public void setPointc(Point pointc) {
		this.pointc = pointc;
	}
	
	public void draw() {
		System.out.println("Point A = (" + getPointa().getX() + "," + getPointa().getY() + ")");
		System.out.println("Point B = (" + getPointb().getX() + "," + getPointb().getY() + ")");
		System.out.println("Point C = (" + getPointc().getX() + "," + getPointc().getY() + ")");
	}
	
	
	

}
