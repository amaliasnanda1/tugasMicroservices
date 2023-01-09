package com.springbootproject.springbootproject.model;

public class Antrian {
    private int id;
    private int antrian;
    private String namaNasabah ;
    private int nik;
    private Boolean isNowCalled;
    public Antrian() {
    }

    public Antrian(int id, int antrian, String namaNasabah, int nik, Boolean isNowCalled) {
        this.antrian = antrian;
        this.id = id;
        this.namaNasabah = namaNasabah;
        this.nik = nik;
        this.isNowCalled = isNowCalled;
    }

    public int getAntrian() {
        return antrian;
    }

    public void setAntrian(int antrian) {
        this.antrian = antrian;
    }

    public Boolean getNowCalled() {
        return isNowCalled;
    }

    public void setNowCalled(Boolean nowCalled) {
        isNowCalled = nowCalled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }
}
