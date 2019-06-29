/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author ASUS R.O.G
 */
public class Agama {
    public static String getAgama(int index){
        String agama;
        switch (index) {
            case 1:
                agama="Islam";
                break;
            case 2:
                agama="Hindu";
                break;
            case 3:
                agama="Budha";
                break; 
            case 4:
                agama="Kristen";
                break;
            case 5:
                agama="Katolik";
                break;
            default:
                agama="";
                break;
        }
        return agama;
    }
    
    public static int setAgama(String agama){
        int index;
        switch (agama) {
            case "Islam":
                index = 1;
            break;
            case "Hindu":
                index = 2;
            break;
            case "Budha":
                index = 3;
            break;
            case "Kristen":
                index = 4;
            break;
            case "Katolik":
                index = 5;
            break;
            default:
                index = 0;
            break;
        }
        return index;
    }
}
