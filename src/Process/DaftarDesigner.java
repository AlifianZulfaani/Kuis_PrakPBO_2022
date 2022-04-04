/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

/**
 *
 * @author MSI1
 */
public class DaftarDesigner implements SeleksiDesigner{
    String nama;
    public double nilaiDesignPortofolio;
    public double nilaiPrototyping;
    public double nilaiCreativity;

    public DaftarDesigner(String nama, double nilaiDesignPortofolio, double nilaiPrototyping, double nilaiCreativity){
        this.nama = nama;
        this.nilaiDesignPortofolio = nilaiDesignPortofolio;
        this.nilaiPrototyping = nilaiPrototyping;
        this.nilaiCreativity = nilaiCreativity;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getnilaiDesignPortofolio() {
        return nilaiDesignPortofolio;
    }

    public void setnilaiDesignPortofolio(double nilaiDesignPortofolio) {
        this.nilaiDesignPortofolio = nilaiDesignPortofolio;
    }

    public double getnilaiPrototyping() {
        return nilaiPrototyping;
    }

    public void setnilaiPrototyping(double nilaiPrototyping) {
        this.nilaiPrototyping = nilaiPrototyping;
    }

    public double getnilaiCreativity() {
        return nilaiCreativity;
    }

    public void setnilaiCreativity(double nilaiDebugging) {
        this.nilaiCreativity = nilaiDebugging;
    }

    @Override
    public double seleksiDesignPortofolio() {
        return 0;
    }

    @Override
    public double seleksiPrototyping() {
        return 0;
    }

    @Override
    public double seleksiCreativity() {
        return 0;
    }
}
