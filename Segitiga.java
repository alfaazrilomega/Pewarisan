package pewarisan;

public class Segitiga extends BANGUNDATAR {
    float alas;
    float tinggi;

    float luas() {
        float luas = 1/2 * (alas * tinggi);
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }   
}
