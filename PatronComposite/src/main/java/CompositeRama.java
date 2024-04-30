
import java.util.ArrayList;
import java.util.List;


public class CompositeRama implements IHojaPlanta{
    
    private List<IHojaPlanta> HojasDeRama = new ArrayList<IHojaPlanta>();
        
    public CompositeRama(List<IHojaPlanta> HojasDeRama) {
        this.HojasDeRama = HojasDeRama;
    }

    @Override
    public void Fotosintesis() {
        for (IHojaPlanta HojasDeRama : HojasDeRama) {
            HojasDeRama.Fotosintesis();
        }
    }

    @Override
    public void Respirar() {
        for (IHojaPlanta HojasDeRama : HojasDeRama) {
            HojasDeRama.Respirar();
        }
    }
    
}
