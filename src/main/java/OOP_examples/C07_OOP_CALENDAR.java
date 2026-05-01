package OOP_examples;

public class C07_OOP_CALENDAR {

    private int day,month,year;
    
    public C07_OOP_CALENDAR (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void gunEkle(){
        day++;
        if(day>30){
            day = 1;
            month++;
            if(month>12){
                month = 1;
                year++;
            }
        }
    }
    
    public void tarihGoster(){
        System.out.println(day + "/" + month + "/" + year);
    }
}
