package AbstractionAndPolymorphism.polymorphism;

 class Car extends Vehicle{


     Car(){

     }

     Car(int noOfTyres){
         System.out.println(noOfTyres);
     }

     void noOfDoors() {
         System.out.println("4");
     }

     @Override
    public void start() {
         super.getNoOfTyres();
        System.out.println("Car is start...");
    }
}
