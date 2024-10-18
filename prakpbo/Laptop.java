/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts.prakpbo;

/**
 *
 * @author user
 */
public class Laptop extends Komputer {
    
    protected String jnsBaterai;

    public Laptop(String jnsBaterai, String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.jnsBaterai = jnsBaterai;
    }
    
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Jenis Baterai\t\t: " + jnsBaterai);
    }
}
