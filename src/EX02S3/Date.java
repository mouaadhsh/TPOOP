package EX02S3;

public class Date {
    int month;

    int day;
    public Date(int day ,int month) throws DException{
    if( (day > 30 || day <1) || (month > 12 || month <1)){
       throw  new DException("this Date is invalid");
    }
    this.month = month;
    this.day = day;
    }
}
