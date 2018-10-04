package checkpoint;

public class Animation2D extends Animation implements Drawable {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing");
	}

	public int getFramerate() {
		// TODO Auto-generated method stub
		return 24;
	}

	public static void main(String[] args) {
		Animation2D a = new Animation2D();
		a.draw();
		System.out.println(a.getFramerate());
	}

}
