package nehaSunlight;

 class Vehicle
 {
     double bmw = 700000;
}
 class OwnerVK extends Vehicle
 {
     double bmwaccessories = 15000;
     public static void main(String[] args)
     {
         OwnerVK d1 = new OwnerVK();

         System.out.println("BMW of Vivkrishna cost is £"+ d1.bmw);
         System.out.println("Accessories of Vivkrishna BMW car cost is £"+ d1.bmwaccessories);
     }
 }