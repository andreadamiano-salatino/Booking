package com.its.exam_monte.models;

import java.time.LocalDateTime;

public class Prenotazione  {
    private String note;
    private LocalDateTime data;
    private int coperti;
    private int idRistorante;
    private int idCliente;



    public Prenotazione(){}

    public Prenotazione(String note, LocalDateTime data, int coperti, int idRistorante, int idCliente) {
        this.note = note;
        this.data = data;
        this.coperti = coperti;
        this.idRistorante = idRistorante;
        this.idCliente = idCliente;
    }


    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getCoperti() {
        return coperti;
    }

    public void setCoperti(int coperti) {
        this.coperti = coperti;
    }

    public int getIdRistorante() {
        return idRistorante;
    }

    public void setIdRistorante(int idRistorante) {
        this.idRistorante = idRistorante;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


}
