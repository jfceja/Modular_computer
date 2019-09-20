public interface IComputer{
	void getComputerSpecs();

	void replaceHDD(int HDDCapacity, String HDDName, String HDDBrand);
	void replaceCPU(int CPUSpeed, String CPUName, String CPUBrand);
}