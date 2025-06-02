public class Mobile implements Cloneable{
    private String brand;
    private String processor; 
    private int ram;
 
  public Mobile(String brand, String processor, int ram) {
            this.brand = brand;
            this.processor = processor;
            this.ram = ram;
        }

    public void showSpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + "GB");
    }
	
	public Mobile clone(){
	try{
		return (Mobile) super.clone();
	}catch(CloneNotSupportedException e){
	    return null;
	}
	}
}