package canada;

public class Main {
    
        public static void main(String[] args) {
            
            //esta ruta viene de la pestaña "Files" del IDE NetBeans
            //creando una carpeta datos en el proyecto LEER_ARCHIVO_CANADA
            String nombreRutaArchivoCsv = "datos/Financial_Canada.csv";
            
            if(MArchivoCsv.leerCsvParaClasificar(nombreRutaArchivoCsv)) {
                System.out.println("OK, CLASIFICACION CORRECTA");
            } else {
                System.out.println("CLASIFICACION INCORRECTA");
            }
        }
}
