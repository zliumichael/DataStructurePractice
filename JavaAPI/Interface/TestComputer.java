package Interface;

public class TestComputer {

	public static void main(String[] args) {
		//DiskInterface disk = new FlashDisk();
		DiskInterface disk = new SuperDisk();
		Computer compu = new Computer();
		compu.wirte(disk);
		
		
	}
}
