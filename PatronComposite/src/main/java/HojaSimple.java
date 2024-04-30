
public class HojaSimple implements IHojaPlanta{
    
    public HojaSimple() {
    }
    
    @Override
    public void Fotosintesis() {
        System.out.println("Hoja realizando fotosintesis");
    }

    @Override
    public void Respirar() {
        System.out.println("Hoja respirando");
    }
    
}
