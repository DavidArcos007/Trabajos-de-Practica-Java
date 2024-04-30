package pruebaparcialvisual;

import javax.swing.DefaultListModel;
import java.awt.*;
import javax.swing.*;

public class JlistMio extends JList {

    DefaultListModel lista;

    public void setVector(int[] vector) {
         lista = new DefaultListModel();
         this.setModel(lista);
         
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]%2 == 0)
              lista.addElement(vector[i]);  
            }
            
        }
        Integer[] numeros = {
            {2,4,6}
        }
    
    }


