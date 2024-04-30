
import java.util.ArrayList;
import java.util.List;


public class DemoComposite {

    public static void main(String[] args) {
        
        //Lista De Plantas
        List<IHojaPlanta> plantas = new ArrayList<>();

        //Rama pequeña
        CompositeRama rama1 = new CompositeRama(new ArrayList<IHojaPlanta>() {
            {
                add(new HojaSimple());
                add(new HojaSimple());
            }
        });

        //Rama grande
        CompositeRama rama2 = new CompositeRama(new ArrayList<IHojaPlanta>() {
            {
                add(new HojaSimple());
                add(new HojaSimple());
                add(new HojaSimple());
                add(new HojaSimple());
            }
        });

        
        
        //Planta con una rama por defecto, agrego 2 más
        plantas.add(new CompositeRama(new ArrayList<IHojaPlanta>() {
            {
                add(rama2);
                add(rama1);
            }
        }
        ));

        System.out.println("---------------------------------------------------------");
        System.out.println("Planta de una rama con dos ramas añadidas");
        for (IHojaPlanta planta : plantas) {
            planta.Fotosintesis();
            planta.Respirar();
        }
        System.out.println("---------------------------------------------------------");

        System.out.println("Añadiendo una hoja a la planta");
        HojaSimple p = new HojaSimple();
        plantas.add(p);
        for (IHojaPlanta planta : plantas) {
            planta.Fotosintesis();
            planta.Respirar();
        }

        System.out.println("-------------------------------------");
        System.out.println("Eliminado una hoja de la planta");
        plantas.remove(p);
        for (IHojaPlanta planta : plantas) {
            planta.Fotosintesis();
            planta.Respirar();
        }
    }
    
    
}
