package EX01S3;

public class EmployeeCommission extends employee {
    int salesNum;

    int percentage;

    int base_wage;

    float bounse;

    public EmployeeCommission(String name, int base_wage, int percentage, int salesNum) {
        this.name = name;
        this.base_wage = base_wage;
        this.percentage = percentage;
        this.salesNum = salesNum;
        this.bounse =  ((float) salesNum * ((float)percentage / 100));
        this.monthly_wage = base_wage + (int)this.bounse;
        listofemployee.add(this);
    }
}

