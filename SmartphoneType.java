public class SmartphoneType extends cellphone {
    
     private String SmartphoneType;

     SmartphoneType(){

     }
     SmartphoneType(String name,int model,String color, String SmartphoneType){
        super(name,model,color);
        this.SmartphoneType = SmartphoneType;
     }

     void setSmartphoneType(String SmartphoneType){
        this.SmartphoneType = SmartphoneType;
     }

     String getSmartphoneType(){
        return this.SmartphoneType;
     }

}
