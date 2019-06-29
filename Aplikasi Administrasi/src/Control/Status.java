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
public class Status {
    public static String getStatus(int index){
        String status;
        switch (index) {
            case 1:
                status="Menikah";
                break;
            case 2:
                status="Belum Menikah";
                break;
            default:
                status="";
                break;
        }
        return status;
    }
    
    public static int setStatus(String status){
        int index;
        switch(status){
            case "Menikah":
                index = 1;
            break;
            case "Belum Menikah":
                index = 2;
            break;
            default:
                index=0;
            break;
        }
        return index;
    }
}
