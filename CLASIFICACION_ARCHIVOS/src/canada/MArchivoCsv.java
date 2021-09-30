package canada;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MArchivoCsv {
    
    public static boolean leerCsvParaClasificar(String nracsv) {
        
        boolean bandera = true;
        File f1, f2;
        FileReader fr;
        BufferedReader br = null;
        String registro = null;
        String[] partes;
        Producto producto;
        
        FileWriter fw;
        BufferedWriter bw;
        
        try {
         
            f1 = new File(nracsv);//Financial_Canada
            fr = new FileReader(f1);
            br = new BufferedReader(fr);
            
            while((registro = br.readLine()) !=null) {
                partes = registro.split(",");
                producto = new Producto(partes[0].trim(),
                                        partes[2].trim(),
                                        Double.parseDouble(partes[4].trim()),
                                        Double.parseDouble(partes[6].trim()),
                                        partes[12].trim());
                
                f2 = new File("datos/"+producto.getProducto());
                
                if(f2.exists()) {
                fw = new FileWriter(f2, true);//si existe archivo lo abre
                } else {
                fw = new FileWriter(f2);//si no existe archivo lo crea y abre
                }
              
                bw = new BufferedWriter(fw);
                bw.write(registro);
                bw.flush();
            }
            
        } catch (Exception e) {
            
            bandera = false;
        }
        
        return bandera;
    }
}
