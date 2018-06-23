/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_daniel_trimarchi;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author X
 */
public class Mensaje implements Serializable{
    private String mens;
    private ArrayList<empleado>destinatarios=new ArrayList();
    private String sender;

    public Mensaje() {
    }

    public Mensaje(String mens, String sender) {
        this.mens = mens;
        this.sender = sender;
    }

    public String getMens() {
        return mens;
    }

    public void setMens(String mens) {
        this.mens = mens;
    }

    public ArrayList<empleado> getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(ArrayList<empleado> destinatarios) {
        this.destinatarios = destinatarios;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return mens;
    }
    
}
