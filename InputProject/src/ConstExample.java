/**
 * Created by Gosiek on 04.05.2017.
 */
class Base {
    Base() {
       // super();
        System.out.println("Step 1");
    }
    Base(Integer a){
        this(); //przywołanie konstruktora Base()
        System.out.println("Step1 "+a);
    }
}
public class ConstExample extends Base {

    ConstExample(Integer a) {
        super(a); //przywołanie konstruktora Base(Integer)
        System.out.println("Step 2");
    }

    public static void main(String[] args) {
        Base base = new ConstExample(1);//odwołuje się do Base()jeżeli nie jest wskazene w konstruktorze ConstExapmle rozszerzenie przez super(Integer)
    }
}
