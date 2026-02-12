/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemdas2.inheritance;

/**
 *
 * @author WINDOWS 11
 */
public class Lingkaran extends bidangDuaDimensi{
    
    protected int jari;
    
    
    public Lingkaran(String nama,int jari){
        super(nama);
        this.jari = jari;  
    }
    
    @Override
        public void luas(){
            luas=3.14*jari*jari;
            System.out.println("Luas = "+luas);
    }
}
