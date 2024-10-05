/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*/



package com.github.browncoatjustice.brokebroker;

import java.util.ArrayList;

/**
 * Don't let the package name fool you. I am in no way associated with GitHub Inc,
 * except for the remote repository present there. The package name was suggested 
 * by a user in the internet forum for SpigotMC (link: https://www.spigotmc.org/threads/what-should-the-groupid-be-called-if-i-dont-own-a-domain.478762/#post-4030830).
 * 
 * @author habis
 * @version 0.1-INDEV
 */
public class BrokeBroker {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList<Company> companiesList = new ArrayList();
        Company frod = new Vehicular();
        frod.setCompanyNameString("Fraud Motor Company");
        frod.setReliability(0.7f);
        frod.setProducts(1000);
        companiesList.add(frod);
        System.out.println(frod.getCompanyNameString());
        System.out.println(frod.getReliability());
        
    }
}
