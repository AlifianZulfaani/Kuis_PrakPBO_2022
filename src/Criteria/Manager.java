/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Criteria;
import Process.DaftarManager;
import Process.SeleksiManager;

/**
 *
 * @author MSI1
 */
public class Manager extends DaftarManager implements SeleksiManager {

    public Manager (String nama, double nilaiInnovation, double nilaiDecisionMaking, double nilaiCommunication) {
        super(nama, nilaiInnovation, nilaiDecisionMaking, nilaiCommunication);
    }

    
    @Override
    public double seleksiInnovation() {
        return 0.4 * this.nilaiInnovation;
    }

    @Override
    public double seleksiDecisionMaking() {
        return 0.3 * this.nilaiDecisionMaking;
    }

    @Override
    public double seleksiCommunication() {
        return 0.3 * this.nilaiCommunication;
    }
}
