public class Cellphone {
	
	 // attributes
    private String brand;
    private int version;
    private String storage;
    
 // constructors
    Cellphone(){
        
    }


    Cellphone (String brand, int version, String storage) { 
        this.brand = brand;
        this.version = version;
        this.storage = storage;
    }

    // Setter
    protected void setBrand(String brand) {
        this.brand = brand;
    }
    protected void setVersion(int version) {
        this.version = version;
    }

    protected void setStorage(String storage) {
        this.storage = storage;
    }

    // Getter
    protected String getBrand() {
        return this.brand;
    }
    protected int getVersion() {
        return this.version;
    }

    protected String getStorage() {
        return this.storage;
    }
}


