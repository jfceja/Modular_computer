public class HDD implements IHardDrive {
	private int HDDCapacity;
	private String HDDName;
	private String HDDBrand;

	public HDD() {
		replaceHDD(1024, "Green", "Western Digital");
	}

	public HDD(int HDDCapacity, String HDDName, String HDDBrand) {
		replaceHDD(HDDCapacity, HDDName, HDDBrand);
	}

	public void replaceHDD(int HDDCapacity, String HDDName, String HDDBrand) {
		this.HDDCapacity = HDDCapacity;
		this.HDDName = HDDName;
		this.HDDBrand = HDDBrand;
	}

	public void getHDDSpecs() {
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