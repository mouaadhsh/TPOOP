package EX01S3;

import java.util.ArrayList;


public class employee {
    String name;
    int monthly_wage;

    static ArrayList<employee> listofemployee = new ArrayList<employee>();
    public void displayinfo(){
        System.out.println("employee salary:"+this.monthly_wage);
        System.out.println("employee name"+this.name);
    }
    public int getsalary(){
        return this.monthly_wage;
    }
    public String getname(){
        return this.name;
    }

    static public double average(ArrayList<employee> listofemployee){
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < listofemployee.size(); i++) {
             employee e = new employee();
             e = (employee) listofemployee.get(i);
             System.out.println(e.getsalary());
             sum += e.getsalary();
        }
        avg = sum/listofemployee.size();
        return  avg;
    }
}

