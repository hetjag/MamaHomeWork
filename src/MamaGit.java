public class MamaGit {

    int j = 30;  // instance variable
    static int b = 40;  // declared inside the class and outside the methods - with static keyword--> class/static variable
    static int d = 20;

    //No return type - No parameters INSTANCE method
    public void m1() {
        System.out.println(j);
        System.out.println(b);
    }

    public static void addition(int b, int c){
        System.out.println("Addition of "+b+ " and "+c+ " = "+(b+c));


    }


//tujygkihkikdyfkjb



    // No return type - with parameters STATIC \method
    public static void subtraction(int l, int m) {
        System.out.print("subtraction of " + l + " and " + m + " = ");
        System.out.println(l - m);
        System.out.println("subtraction of " + b + " and " + d + " = " + (b - d));
    }

    //main method
    public static void main(String[] args) {
        String company = "TFL"; //local variable - declared inside the method
        System.out.println(company);
        subtraction(20, 10);
        subtraction(100, 300);
        addition(10, 40);
        subtraction(100, 60);
    }
}