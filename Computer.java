// Note each public class needs to be in its own file (even if abstract).
// If this depends on a private interface (such that it doesn't need its own file)
// 		then you have to manually commpile that along with main() since it defaults to
// 		look for <dependency>.java

public class Computer implements IComputer{
	private IComputerPart cpu_computer;
	private IComputerPart hdd_computer;

	public Computer() {
		cpu_computer = new CPU();
		hdd_computer = new HDD();
	}

	public void getComputerSpecs() {
		cpu_computer.getSpecs();
		hdd_computer.getSpecs();
	}

	public void replaceHDD(int HDDCapacity, String HDDName, String HDDBrand) {
		hdd_computer.replacePart(HDDCapacity, HDDName, HDDBrand);
	}

	public void replaceCPU(int CPUSpeed, String CPUName, String CPUBrand) {
		cpu_computer.replacePart(CPUSpeed, CPUName, CPUBrand);
	}
}