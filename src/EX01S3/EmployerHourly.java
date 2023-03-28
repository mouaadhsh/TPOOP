package EX01S3;

public class EmployerHourly extends employee{
    int hourly_rate;

    int nb_hours;
    public EmployerHourly(String name,int hourly_rate,int nb_hours){
        this.hourly_rate = hourly_rate;
        this.nb_hours = nb_hours;
        this.monthly_wage = hourly_rate * nb_hours;
        listofemployee.add(this);

    }

}
