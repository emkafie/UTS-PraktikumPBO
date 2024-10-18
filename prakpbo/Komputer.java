/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uts.prakpbo;

/**
 *
 * @author user
 */
public class Komputer {

    protected String merk;
    protected int kecProcessor;
    protected int sizeMemory;
    protected String jnsProcessor;


    public Komputer(String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        this.merk = merk;
        this.kecProcessor = kecProcessor;
        this.sizeMemory = sizeMemory;
        this.jnsProcessor = jnsProcessor;
    }
    
    public void tampilData() {
        System.out.println("Merek\t\t\t: " + merk);
        System.out.println("Kecepatan Processor\t: " + kecProcessor + " Ghz");
        System.out.println("Kapasitas Memory\t: " + sizeMemory + " GB");
        System.out.println("Jenis Processor\t: " + jnsProcessor);
    }
}
