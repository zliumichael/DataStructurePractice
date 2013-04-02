package Interface;

public class HardDisk implements DiskInterface{

	@Override
	public void write() {
		System.out.println("HardDisk writing");
	}

	@Override
	public void read() {
		System.out.println("HardDisk reading");
	}

}
