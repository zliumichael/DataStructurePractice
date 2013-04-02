package Interface;

public class SuperDisk implements DiskInterface {

	@Override
	public void write() {
		System.out.println("superdisk writing");

	}

	@Override
	public void read() {
		System.out.println("ddd");

	}

}
