package other;

public class Rahul extends Father implements Academy1,Academy2 {

   public int a = 7;
   public static int bb = 7;

   public void developer() {

    }

    @Override
    public void Skating() {

    }

    @Override
    public void TrunOnFalshLight() {

    }

    @Override
    public void TrunOffFalshLight() {

    }

    @Override
    public void Doctor() {

    }







//   Integer abc = new Integer(8);
   int abc1 = 8;

   String str = new String("Hello");
   String str1  = "Hello1";

   boolean b = true;
//   Boolean bb = new Boolean(true);



    static  {
        int b = 8 ;
    }




    public void Developer (){
        super.boxer();
    }

    @Override
    public void doctor() {
        super.doctor();

    }

    @Override
    protected void boxer() {
        super.boxer();


    }

    @Override
    protected void bodybuilder() {
        super.bodybuilder();


        getStudentData("Deepak",2);

    }

    // Overloading example

     void getStudentData() {
        // from x table
     }
     void getStudentData(int rollNumber) {
        //from y table
     }
     void getStudentData(int rollNumber,int pincode) {
        //y with diff logic
     }
     void getStudentData(String fatherName) {}
     public String getStudentData(String fatherName,int rollNumber) {

        if(fatherName.equals("Deepak")&&rollNumber ==1){
            return "Deepak ka Ladka";
        }
        else  if(fatherName.equals("Sohan")&&rollNumber ==2){
            return "Sohan ka Ladka";
        }
        else  if(fatherName.equals("Suman")&&rollNumber ==5){
            return "Suman ki Ladki";
        }
        else return "Hume nhi pta kis ka ladka";
     }


}
