package Interface;

public class Computer {
	
/*	private FlashDisk fd = new FlashDisk();
	private HardDisk hd = new HardDisk();
	private MobileDisk md = new MobileDisk();
	
	public void wirte(String diskType){
		if(diskType.equals("fd")){
			fd.write();
		}
		if(diskType.equals("hd")){
			fd.write();
		}
		if(diskType.equals("md")){
			fd.write();
		}
		
	}

	public void read(String diskType){
		if(diskType.equals("fd")){
			fd.read();
		}
		if(diskType.equals("hd")){
			fd.read();
		}
		if(diskType.equals("md")){
			fd.read();
		}
	}*/
	
	public void wirte(DiskInterface disk){
		disk.write();
	}
	
	public void read(DiskInterface disk){
		disk.read();
	}
}
