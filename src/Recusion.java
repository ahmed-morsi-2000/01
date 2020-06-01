public class Recusion {

    // it is a message call herself inside
    // remember in recusion we need a base case

    public static void main(String[] args) {

        sayHallo(5);

    }


    public static void sayHallo(int n){
         if (n==0){
             System.out.println("Done !!");

         }else{
             System.out.println("Hallo in the world of java");
             n--;
             sayHallo(n);
                      }




    }

}


