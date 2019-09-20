/*
	Implementations of interfaces don't have to be complete. If they only
	partially implement the interface then declare the class as abstract.
	You can later extend that class to fully implement the interface and
	instantiate that class later on.
*/

public class CPU implements IComputerPart {
	private int CPUSpeed;
	private String CPUName;
	private String CPUBrand;

	public CPU() {
		replacePart(3500, "Some core i series", "Probably Intel");
	}

	public CPU(int CPUSpeed, String CPUName, String CPUBrand) {
		replacePart(CPUSpeed, CPUName, CPUBrand);
	}

	public void replacePart(int CPUSpeed, String CPUName, String CPUBrand) {
		this.CPUSpeed = CPUSpeed;
		this.CPUName = CPUName;
		this.CPUBrand = CPUBrand;
	}

	public void getSpecs() {
		System.out.println(getCPUBrand() + " " + getCPUName() + " @ " + getCPUSpeed() + " MHZ");
	}

	private String getCPUBrand() {
		return CPUBrand;
	}

	private String getCPUName() {
		return CPUName;
	}

	private int getCPUSpeed () {
		return CPUSpeed;
	}
}	