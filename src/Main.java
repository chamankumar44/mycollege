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
        String details = rahul.getStudentData("Suman", 5);

        System.out.println("Result is : " + details);
        System.out.println("New Result is : " + d );
    }
}




