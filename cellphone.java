public class cellphone{
  
//attributes 
 private String brand;
 private int version;
 private int storage;
    
    cellphone(){
        
    }
//constractor
cellphone (String brand, int version, int storage){
    this.brand = brand;
 this.version = version;
 this.storage = storage;
}

 //setter 
 void setBrand (String brand) {
   this.brand = brand;
 }
 void setVersion (int version){
  this.version = version;
}
 void setStorage (int storage){
  this.storage = storage;
}
//getter
 String getBrand(){
  return this.brand;
}
 int getVersion(){
  return this.version;
}
 int getStorage(){
  return this.storage;
}

}