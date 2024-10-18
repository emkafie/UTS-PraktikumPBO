/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts.prakpbo;

/**
 *
 * @author user
 */
public class MainKomputer {
    
    public static void main(String[] args) {
        
        Mac mac = new Mac("FileVault", "ABC", "Apple", 2, 16, "Lithium Polymer");
        System.out.println("======= Data Mac =======");
        mac.tampilData();
        System.out.println("========================");
        System.out.println();
        
        Windows windows = new Windows("Copilot-AI", "Alkaline", "Lenowo", 3, 24, "Intel-17");
        System.out.println("===== Data Windows =====");
        windows.tampilData();
        System.out.println("========================");
        System.out.println();
        
        Pc pc = new Pc(27, "Hp", 2, 128, "Intel-19");
        System.out.println("======== Data Pc =======");
        pc.tampilData();
        System.out.println("========================");
    }
}
