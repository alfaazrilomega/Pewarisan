package pewarisan;

public class PersegiPanjang extends BANGUNDATAR {

    float panjang;
    float lebar;
    
    float luas(){
        float luas = panjang * lebar;
    System.out.println("Luas PersegiPanjang: " + luas);
    return luas;
    }

    float keliling(){
            float K32 = 2*panjang + 2*lebar;
            System.out.println("Keliling Persegi Panjang: " + K32);
            return K32;
    }
    
    
}
