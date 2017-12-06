
package test;

abstract class Driver       
{
   String name;
   int age;
   boolean english,graduation,chk=false;
   Driver(String D_Name,int D_Age ,boolean D_english ,boolean D_graduation)
   {
       name  = D_Name;
       age = D_Age;
       english = D_english;
       graduation = D_graduation;
   }
   abstract void chkElegiblity();
   void showEligiblity()
   {    
       if (chk == true)
       {
        System.out.println("Congratultion " + name +" You are elgible to be a driver");  
       }
       else
       {
       System.out.println("OOPs Sorry "+name +" You are not elgible to be a driver");  
       }
       
   }
}

