
package planilla_salarios_ii;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Planilla_Salarios_II {

    public static void main(String[] args) {
      
        int N = 0;
        int [][] Matriz = new int [N][16];
        
        String [] Nombre= new String[N];
        String [] Puesto= new String[N];
        float [] Sueldo_Ordinario= new float[N];
        
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero de Registros: "));
        
        for (int k = 0; k < N; k++) {
            
            Nombre[k] = JOptionPane.showInputDialog("Digite Nombre: ");
            
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    
                    
                }
            }
        }
        
        
        
        
    }
    
}
