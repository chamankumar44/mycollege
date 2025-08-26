package other;

public class Rahul extends Father {

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
