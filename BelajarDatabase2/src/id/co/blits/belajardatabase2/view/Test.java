/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.belajardatabase2.view;

import id.co.blits.belajardatabase2.util.Koneksi;

/**
 *
 * @author Lintanhg
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koneksi koneksi = new Koneksi();
        koneksi.koneksiDatabase();
    }
    
}
