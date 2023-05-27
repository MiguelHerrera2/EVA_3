/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_10_escritura_archivos_txt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author invitado
 */
public class EVA3_10_ESCRITURA_ARCHIVOS_TXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "C:\\PRUEBA\\";
        try{
        writeUsingFiles(ruta,"Hola mundo, como estan??");
        writeUsingFilesWriter(ruta,"como andamos gente, aqui aprendiendo a programar");
        writeUsingBufferedWriter(ruta,"HOLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        }catch(IOException ex){
            
        }
    }
    public static void writeUsingFiles(String ruta, String dato) throws IOException{
        //Si el archivo no existe, lo crea
        //Si el archivo existe, lo sobreescribe
        Path path = Paths.get(ruta+"archivoFiles.txt");
        Files.write(path,dato.getBytes());
    }
    
    public static void writeUsingFilesWriter(String ruta, String dato)throws IOException{
        File file = new File(ruta + "archivoFileWriter.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(dato);
        fileWriter.close();
    }
    
    public static void writeUsingBufferedWriter(String ruta, String dato)throws IOException{
        Path path = Paths.get(ruta+"archivoBuffered.txt");
        OutputStream out = Files.newOutputStream(path);
        OutputStreamWriter osWriter = new OutputStreamWriter(out);
        BufferedWriter bufWriter = new BufferedWriter(osWriter);
        for (int i = 0; i < 10; i++) {
            bufWriter.write((i + 1) + " " + dato);
            bufWriter.write("\n");
        }
        bufWriter.close();
        osWriter.close();
    }
}
