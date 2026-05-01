package OOP_examples;

public class C08_OOP_CALENDAR_MAIN {

    public static void main(String[] args) {
        
        C07_OOP_CALENDAR takvim = new C07_OOP_CALENDAR(30, 12, 2007);
        
        takvim.tarihGoster();
        takvim.gunEkle();
        takvim.tarihGoster();
    }
    
}
