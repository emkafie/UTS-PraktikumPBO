/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts.prakpbo;

/**
 *
 * @author user
 */
public class Windows extends Laptop {
     
    protected String fitur;

    public Windows(String fitur, String jnsBaterai, String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        super(jnsBaterai, merk, kecProcessor, sizeMemory, jnsProcessor);
        this.fitur = fitur;
    }
    
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Fitur\t\t\t: " + fitur);
    }
}
