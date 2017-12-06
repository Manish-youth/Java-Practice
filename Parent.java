class Parent

{      Parent ()

        {   System.out. println("parent class constructor");

        }

}

class Child

{         Child()

          {   super ();

               System.out.println("child class contractor");

           }

         public static void main( String [] args)

        {      new Child ();

         }

}