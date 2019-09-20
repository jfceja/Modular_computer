public class HDD implements IComputerPart {
	private int HDDCapacity;
	private String HDDName;
	private String HDDBrand;

	public HDD() {
		replacePart(1024, "Green", "Western Digital");
	}

	public HDD(int HDDCapacity, String HDDName, String HDDBrand) {
		replacePart(HDDCapacity, HDDName, HDDBrand);
	}

	public void replacePart(int HDDCapacity, String HDDName, String HDDBrand) {
		this.HDDCapacity = HDDCapacity;
		this.HDDName = HDDName;
		this.HDDBrand = HDDBrand;
	}

	public void getSpecs() {
		System.out.println(getHDDBrand() + " " + getHDDName() + " @ " + getHDDCapacity() + " GB");
	}

	private String getHDDBrand() {
		return HDDBrand;
	}

	private String getHDDName() {
		return HDDName;
	}

	private int getHDDCapacity() {
		return HDDCapacity;
	}
}