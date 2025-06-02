public class Mobile {
    private String brand;
    private String processor; 
    private int ram;
    private boolean camera;
    private boolean bluetooth;

   
    private Mobile(Builder builder) {
        this.brand = builder.brand;
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.camera = builder.camera;
        this.bluetooth = builder.bluetooth;
    }

    public void showSpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + "GB");
        if (camera) System.out.println("Camera Enabled");
        if (bluetooth) System.out.println("Bluetooth Enabled");
    }

    
    public static class Builder {
        private String brand;
        private String processor; 
        private int ram;
        private boolean camera;   
        private boolean bluetooth;

        public Builder(String brand, String processor, int ram) {
            this.brand = brand;
            this.processor = processor;
            this.ram = ram;
        }

        public Builder enableCamera() {
            this.camera = true;
            return this;
        }

        public Builder enableBluetooth() {
            this.bluetooth = true;
            return this;
        }

        public Mobile build() { 
            return new Mobile(this);
        }
    }
}