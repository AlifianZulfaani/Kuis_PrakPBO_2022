/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

/**
 *
 * @author MSI1
 */
public class DaftarProgrammer implements SeleksiProgrammer {
    String nama;
    public double nilaiProgrammingKnowledge;
    public double nilaiCleanCoding;
    public double nilaiDebugging;

    public DaftarProgrammer(String nama, double NilaiProgrammingKnowledge, double NilaiCleanCoding, double NilaiDebugging){
        this.nama = nama;
        this.nilaiProgrammingKnowledge = nilaiProgrammingKnowledge;
        this.nilaiCleanCoding = nilaiCleanCoding;
        this.nilaiDebugging = nilaiDebugging;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getnilaiProgrammingKnowledge() {
        return nilaiProgrammingKnowledge;
    }

    public void setnilaiProgrammingKnowledge(double nilaiProgrammingKnowledge) {
        this.nilaiProgrammingKnowledge = nilaiProgrammingKnowledge;
    }

    public double getnilaiCleanCoding() {
        return nilaiCleanCoding;
    }

    public void setnilaiCleanCoding(double nilaiCleanCoding) {
        this.nilaiCleanCoding = nilaiCleanCoding;
    }

    public double getnilaiDebugging() {
        return nilaiDebugging;
    }

    public void setnilaiDebugging(double nilaiDebugging) {
        this.nilaiDebugging = nilaiDebugging;
    }

    @Override
    public double seleksiProgrammingKnowledge() {
        return 0;
    }

    @Override
    public double seleksiCleanCoding() {
        return 0;
    }

    @Override
    public double seleksiDebugging() {
        return 0;
    }

    

   
}
