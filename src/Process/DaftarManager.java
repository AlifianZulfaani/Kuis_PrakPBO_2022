/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

/**
 *
 * @author MSI1
 */
public class DaftarManager implements SeleksiManager {
    String nama;
    public double nilaiInnovation;
    public double nilaiDecisionMaking;
    public double nilaiCommunication;

    public DaftarManager(String nama, double nilaiInnovation, double nilaiPrototyping, double nilaiCreativity){
        this.nama = nama;
        this.nilaiInnovation = nilaiInnovation;
        this.nilaiDecisionMaking = nilaiDecisionMaking;
        this.nilaiCommunication = nilaiCommunication;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getnilaiDesignPortofolio() {
        return nilaiInnovation;
    }

    public void setnilaiInnovation(double nilaiInnovation) {
        this.nilaiInnovation = nilaiInnovation;
    }

    public double getnilaiPrototyping() {
        return nilaiDecisionMaking;
    }

    public void setnilaiDecisionMaking(double nilaiDecisionMaking) {
        this.nilaiDecisionMaking = nilaiDecisionMaking;
    }

    public double getnilaiCommunication() {
        return nilaiCommunication;
    }

    public void setnilaiCommunication(double nilaiDebugging) {
        this.nilaiCommunication = nilaiCommunication;
    }

    @Override
    public double seleksiInnovation() {
        return 0;
    }

    @Override
    public double seleksiDecisionMaking() {
        return 0;
    }

    @Override
    public double seleksiCommunication() {
        return 0;
    }
}

