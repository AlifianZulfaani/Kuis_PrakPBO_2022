/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Criteria;
import Process.DaftarProgrammer;
import Process.SeleksiProgrammer;

/**
 *
 * @author MSI1
 */
public class Programmer extends DaftarProgrammer implements SeleksiProgrammer{

    public Programmer (String nama, double nilaiProgrammingKnowledge, double nilaiCleanCoding, double nilaiDebugging) {
        super(nama, nilaiProgrammingKnowledge, nilaiCleanCoding, nilaiDebugging);
    }

    
    @Override
    public double seleksiProgrammingKnowledge() {
        return 0.6 * this.nilaiProgrammingKnowledge;
    }

    @Override
    public double seleksiCleanCoding() {
        return 0.15 * this.nilaiCleanCoding;
    }

    @Override
    public double seleksiDebugging() {
        return 0.25 * this.nilaiDebugging;
    }
}
