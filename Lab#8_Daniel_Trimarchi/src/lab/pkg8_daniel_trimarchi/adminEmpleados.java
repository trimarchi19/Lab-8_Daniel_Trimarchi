/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_daniel_trimarchi;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author X
 */
public class adminEmpleados {
    private ArrayList<empleado> listaEmpleado=new ArrayList();
    private File archivo=null;

    public adminEmpleados(String path) {
        this.archivo=new File(path);
    }

    public ArrayList<empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(ArrayList<empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaEmpleado=" + listaEmpleado +'}';
    }


    public void setPersona(empleado p){
        listaEmpleado.add(p);
    }
    public void cargarArchivo(){
        try{
            listaEmpleado =new ArrayList();
            empleado temp;
            if(archivo.exists()){
                FileInputStream entrada
                        =new FileInputStream(archivo);
                ObjectInputStream objeto
                        =new ObjectInputStream(entrada);
                try{
                    while( (temp = (empleado)objeto.readObject()) != null ){
                        listaEmpleado.add(temp);
                    }
                }catch(EOFException e){
                    //encontro el final del archivo
                }
            }
            
            
        }catch(Exception ex){
            
        }
    }
    public void escribirArchivo(){
        FileOutputStream fw=null;
        ObjectOutputStream bw=null;
        try{
            fw=new FileOutputStream(archivo);
            bw= new ObjectOutputStream(fw);
            for (empleado t : listaEmpleado) {
                bw.writeObject(t);
                
            }
            bw.flush();
        }catch(Exception ex){
            System.out.println(ex);
        }finally{
            try{
               // fw.close();
                bw.close();
                 fw.close();
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
    }
   
    
    
    
}
