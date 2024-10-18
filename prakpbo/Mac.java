/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts.prakpbo;

/**
 *
 * @author user
 */
public class Mac extends Laptop {
    
    protected String security;

    public Mac(String security, String jnsBaterai, String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        super(jnsBaterai, merk, kecProcessor, sizeMemory, jnsProcessor);
        this.security = security;
    }
    
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Security\t\t: " + security);
    }
}
