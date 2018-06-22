/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_daniel_trimarchi;

import java.util.ArrayList;

/**
 *
 * @author X
 */
public class empleado {

    private String nombre;
    private String Id_empresa;
    private String contraseña;
    private empleado jefe;
    private String puesto;
    private String salario;
    private ArrayList<empleado> lista_empleados=new ArrayList<>();
    public empleado() {
    }

    public empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public empleado(String nombre, String Id_empresa, String contraseña, empleado jefe, String puesto, String salario) {
        this.nombre = nombre;
        this.Id_empresa = Id_empresa;
        this.contraseña = contraseña;
        this.jefe = jefe;
        this.puesto = puesto;
        this.salario = salario;
    }

    public empleado(String nombre, String Id_empresa, String contraseña, String puesto, String salario) {
        this.nombre = nombre;
        this.Id_empresa = Id_empresa;
        this.contraseña = contraseña;
        this.puesto = puesto;
        this.salario = salario;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId_empresa() {
        return Id_empresa;
    }

    public void setId_empresa(String Id_empresa) {
        this.Id_empresa = Id_empresa;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public empleado getJefe() {
        return jefe;
    }

    public void setJefe(empleado jefe) {
        this.jefe = jefe;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public ArrayList<empleado> getLista_empleados() {
        return lista_empleados;
    }

    public void setLista_empleados(ArrayList<empleado> lista_empleados) {
        this.lista_empleados = lista_empleados;
    }
    

    @Override
    public String toString() {
        return  nombre ;
    }
    
}
