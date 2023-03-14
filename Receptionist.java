/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan;

/**
 *
 * @author G a r a
 */
public class Receptionist extends Karyawan {
    
    Receptionist() {
        gaji += 1000000;
        setbonus(300000);
    }

    void naikgaji() {
        gaji += 1000000;
    }
}