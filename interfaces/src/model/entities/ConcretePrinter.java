package model.entities;

public class ConcretePrinter extends Device implements Printer{//pode extender e implementar ao mesmo tempo

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}
	
	@Override
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}

}
