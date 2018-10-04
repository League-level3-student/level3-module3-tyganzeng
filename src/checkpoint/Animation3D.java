package checkpoint;

public class Animation3D extends Animation implements Renderable {

	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.println(":) :)");
	}

	@Override
	public int getFramerate() {
		// TODO Auto-generated method stub
		return 24;
	}

	public static void main(String[] args) {
		Animation3D a = new Animation3D();
		a.render();
	}

}
