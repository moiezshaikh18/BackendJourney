//Inheritance 

class Vehicle{
    private int num_of_tyre;
    
    
    public void setNumberOfTyres(int num_of_tyre){
        this.num_of_tyre = num_of_tyre;
    }
    
    public void commute(){
        System.out.printf("I'm going from place A to place B using %d tyres\n", num_of_tyre);
    }
    
    
}

class TwoWheelers extends Vehicle{
   TwoWheelers(){
       setNumberOfTyres(2);
   }
   
   public void balance(){
      System.out.println("I am balancing on two tyres");
   }
   
}

class MotorCycle extends TwoWheelers{
    public double ptrolCapacity;
    
    public void start(){
               System.out.println("Startting....");
    }
}


class InheritanceExample{
     public static void main (String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();

        TwoWheelers twoWheelers = new TwoWheelers();
        twoWheelers.commute();
        twoWheelers.balance();
        
        MotorCycle motorCycle = new MotorCycle();
        motorCycle.commute();
        motorCycle.balance();
        motorCycle.start();
    }
}
