/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemdas2.inheritance;

/**
 *
 * @author WINDOWS 11
 */
public class App {
    public static void main(String[] args) {
        bujurSangkar BujurSangkar = new bujurSangkar("bujur sangkar",3);
        Lingkaran lingkaran = new Lingkaran("lingkaran",5);
        
        BujurSangkar.info();
        BujurSangkar.luas();
        lingkaran.info();
        lingkaran.luas();
    }
}
