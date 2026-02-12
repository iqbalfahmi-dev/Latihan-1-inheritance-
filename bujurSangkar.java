/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemdas2.inheritance;

/**
 *
 * @author WINDOWS 11
 */
public class bujurSangkar extends bidangDuaDimensi {
    
    protected int sisi;
    

    public bujurSangkar(String nama,int sisi){
        super(nama);
        this.sisi = sisi;  
     }
    
    @Override
        public void luas(){
            luas=sisi*sisi;
            System.out.println("Luas = "+luas);
    }
}

