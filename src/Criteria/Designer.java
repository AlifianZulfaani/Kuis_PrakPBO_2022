/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Criteria;
import Process.DaftarDesigner;
import Process.SeleksiDesigner;

/**
 *
 * @author MSI1
 */
public class Designer extends DaftarDesigner implements SeleksiDesigner {

    public Designer (String nama, double nilaiDesignPortofolio, double nilaiPrototyping, double nilaiCreativity) {
        super(nama, nilaiDesignPortofolio, nilaiPrototyping, nilaiCreativity);
    }

    
    @Override
    public double seleksiDesignPortofolio() {
        return 0.3 * this.nilaiDesignPortofolio;
    }

    @Override
    public double seleksiPrototyping() {
        return 0.45 * this.nilaiPrototyping;
    }

    @Override
    public double seleksiCreativity() {
        return 0.25 * this.nilaiCreativity;
    }
}
