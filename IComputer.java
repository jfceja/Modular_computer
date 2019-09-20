public interface IComputer{
	void getComputerSpecs();

	// I don't like the fact that I have to manually type this in instead of it being inherited
	void replaceHDD(int HDDCapacity, String HDDName, String HDDBrand);
	void replaceCPU(int CPUSpeed, String CPUName, String CPUBrand);
}