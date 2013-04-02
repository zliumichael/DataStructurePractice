package Interface;

public class FlashDisk implements DiskInterface{

	@Override
	public void write() {
		System.out.println("FlashDisk writing");
	}

	@Override
	public void read() {
		System.out.println("FlashDisk writing");
	}

}
