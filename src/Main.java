import other.Rahul;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 3;
        int b = 4;
        int c = 5;
        int d =  a+b+c ;

        Rahul rahul = new Rahul();
        rahul.doctor();
        rahul.Developer();
        rahul.lawyer();
        rahul.Skating();
        rahul.TrunOnFalshLight();
        rahul.TrunOffFalshLight();

        String details = rahul.getStudentData("Suman", 5);

        int a1 = rahul.a;
        int bb = Rahul.bb;

        System.out.println("Result is : " + details);
        System.out.println("New Result is : " + d );
    }
}




