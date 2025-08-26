import other.Rahul;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Rahul rahul = new Rahul();
        rahul.doctor();
        rahul.Developer();
        rahul.lawyer();

//        MyHome obj = new MyHome();
//        String feedback =  obj.watchTv ("nice");
//        System.out.println("My Feedback is. " + feedback);

        Swimming swimg= new Swimming();
      String x= swimg.swimg("Ayush");
        System.out.println("The Swimming pool is " +x  );

    }
}




class MyHome {
    public String watchTv (String feedback){
        //Watching TV
        return feedback + "  Very Good ";
    }

}


class Swimming {

    public String swimg (String feedback){
        //swimming
        return feedback +" nice" ;
    }
}

class Gym {
    public int doWorkout (int set){
        //upper body and lowerbody
        return set;
    }
}


