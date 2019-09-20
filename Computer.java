// Note each public class needs to be in its own file (even if abstract).
// If this depends on a private interface (such that it doesn't need its own file)
// 		then you have to manually commpile that along with main() since it defaults to
// 		look for <dependency>.java

public class Computer implements IComputer {
	private CPU cpu_computer;
	private HDD hdd_computer;

	public Computer() {
		cpu_computer = new CPU();
		hdd_computer = new HDD();
	}
	
	public void getComputerSpecs() {
		cpu_computer.getCPUSpecs();
		hdd_computer.getHDDSpecs();
	}

	public void replaceHDD(int HDDCapacity, String HDDName, String HDDBrand) {
		hdd_computer.replaceHDD(HDDCapacity, HDDName, HDDBrand);
	}

	public void replaceCPU(int CPUSpeed, String CPUName, String CPUBrand) {
		cpu_computer.replaceCPU(CPUSpeed, CPUName, CPUBrand);
	}
}