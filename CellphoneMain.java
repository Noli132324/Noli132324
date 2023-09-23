public class CellphoneMain {
	
//	Bonn Jacob Dela Cerna
//	Noli Casas
//	Rensil Sollano

	public static void main(String[] args) {
		
		Cellphone cell = new Cellphone ();
		Cellphone phone1 = new Cellphone();
        Cellphone phone2 = new Cellphone();
        Cellphone phone3 = new Cellphone();
        
        phone1.setBrand("Iphone");
        phone1.setVersion(14);
        phone1.setStorage("128GB");
 
        phone2.setBrand("Vivo");
        phone2.setVersion(11);
        phone2.setStorage("32GB");

        phone3.setBrand("Samsung");
        phone3.setVersion(4);
        phone3.setStorage("64GB");
        
        String bra = phone1.getBrand();
        System.out.println("Brand: " + bra+" \nVersion: " + phone1.getVersion() + " \nStorage: " + phone1.getStorage()+ "\n");
        System.out.println("Brand: " + phone2.getBrand() + " \nVersion: " +  phone2.getVersion() + " \nStorage: " + phone2.getStorage()+"\n");
        System.out.println("Brand: " + phone3.getBrand()+ "\nVersion: " + phone3.getVersion() + " \nStorage: " + phone3.getStorage()+"\n");

	}
}
