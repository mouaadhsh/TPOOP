package EX01S3;

public class FixedEmploy extends employee{
    public FixedEmploy(String name,int salary){
        this.monthly_wage = salary;
        this.name = name;
        listofemployee.add(this);
    }

}
