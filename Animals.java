
package test;
interface animals
{
    void eat();
    void speak();   
    void residence();
   
}
 class Domestic
{
    Domestic()
    {
     System.out.println("This animal is domestic and peted by human") ;
    }
}
 class Wild 
{
    Wild()
    {
        System.out.println("This animal is wild and lives in the forest");
    }
}
 class Carnivores 
{
   Carnivores()
   {
       System.out.println("This animal eats only flesh\n");
   }
}
class Herbivores
{
   Herbivores()
   {
       System.out.println("This animal eats only palnts and herbs\n");
   }
}
class Omnivores 
{
   Omnivores()
   {
       System.out.println("This animal eats flesh and herbs/plant both\n");
   }
}
class Horse implements animals 
{
    Domestic d = new Domestic();
    Herbivores h = new Herbivores();
    public void eat()
    {
        System.out.println("Horse like to eat  : Grass   Grains     Nuts");
    }
    public void speak()
    {
        System.out.println("The sound that a horse makes is called a \"neigh\"");
    }  
    public void residence()
    {
        System.out.println("Horse Living Place is called  : Stables");
    }  
}
class Cow implements animals 
{
    Domestic d = new Domestic();
    Herbivores h = new Herbivores();
    public void eat()
    {
        System.out.println("Cow like to eat  : Grass   Grains     Nuts");
    }
    public void speak()
    {
        System.out.println("The sound a cow makes is  \"moo\"");
    }  
    public void residence()
    {
        System.out.println("Cow Living Place is called  : Shed / Shelter");
    }  
}
class Goat implements animals 
{
    Domestic d = new Domestic();
    Herbivores h = new Herbivores();
    public void eat()
    {
        System.out.println("Goat like to eat  : Grass   Grains     Nuts");
    }
    public void speak()
    {
        System.out.println("The sound that a goat makes is called a \"bleat.\"");
    }  
    public void residence()
    {
        System.out.println("Goat Living Place is called  : Shed/pen");
    }  
}
class Dog implements animals 
{
    Domestic d = new Domestic();
    Omnivores o = new Omnivores();
    public void eat()
    {
        System.out.println("Dog usually eat : Roti rice milk flesh ");
    }
    public void speak()
    {
        System.out.println("The sound that a dog makes is called a \"bark\"");
    }  
    public void residence()
    {
        System.out.println("Dog Living Place is called  : kannel");
    }  
}
class Cat implements animals 
{
    Domestic d = new Domestic();
    Omnivores o = new Omnivores();
    public void eat()
    {
        System.out.println("Cat usually eat : Roti rice milk flesh Rat ");
    }
    public void speak()
    {
        System.out.println("The sound that a cat makes is called a \"Meao\"");
    }  
    public void residence()
    {
        System.out.println("Cat Living Place is called  : kannel");
    }  
}
class Lion implements animals 
{
    Wild d = new Wild();
    Carnivores o = new Carnivores();
    public void eat()
    {
        System.out.println("Lion usually eat :  flesh ");
    }
    public void speak()
    {
        System.out.println("The sound that a Lion makes is called a \"Roar\"");
    }  
    public void residence()
    {
        System.out.println("Lion Living Place is called  : Den");
    }  
}
class Deer implements animals 
{
    Wild d = new Wild();
    Herbivores o = new Herbivores();
    public void eat()
    {
        System.out.println("Deer usually eat :  grass, plant-leaf");
    }
    public void speak()
    {
        System.out.println("The sound that a Lion makes is called a \"Roar\"");
    }  
    public void residence()
    {
        System.out.println("Lion Living Place is   : Forest");
    }  
}
