public class BuiltComp {
	public static void main(String[] args) {
		Computer dustCollector = new Computer();
		dustCollector.getComputerSpecs();

		dustCollector.replaceHDD(4096, "V-NAND SSD", "Samsung");
		dustCollector.replaceCPU(4500, "Core i9", "Intel");

		System.out.println(); // just print new line

		dustCollector.getComputerSpecs();
	}
}