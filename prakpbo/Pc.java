/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts.prakpbo;

/**
 *
 * @author user
 */
public class Pc extends Komputer {
    
    protected int ukuranMonitor;

    public Pc(int ukuranMonitor, String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Ukuran Monitor\t\t: " + ukuranMonitor);
    }
}
