/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.browncoatjustice.brokebroker;

/**
 *
 * @author habis
 */
public abstract class Company {

    // general properties
    private static int companyValue;

    private static float reliability;
    private static float products;
    private static float hype;
    private static float assets;

    // type specific properties 
    private static String companyNameString;
    private static byte growthMultiplier;

    /**
     * @return the companyValue
     */
    public int getCompanyValue() {
        return companyValue;
    }

    /**
     * @param companyValue the companyValue to set
     */
    void setCompanyValue(int companyValue) {
        if (companyValue <= 0 | companyValue > 100000000) {
            throw new IllegalArgumentException("The company value must be between 0 and 100000000 RC Loddars!");
        } else {
            this.companyValue = companyValue;
        }
    }

    /**
     * @return the reliability
     */
    public float getReliability() {
        return reliability;
    }

    /**
     * @param reliability The reliability to set. Default and maximum
     * reliability is: 1.
     */
    void setReliability(float reliability) {
        if (reliability < 0 | reliability > 1) {
            throw new IllegalArgumentException("Reliability of a company must be between 0 and 1");
        } else {
            this.reliability = reliability;
        }
    }

    /**
     * @return the products
     */
    public float getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    abstract void setProducts(float products);

    /**
     * @return the hype
     */
    public float getHype() {
        return hype;
    }

    /**
     * @param hype the hype to set
     */
    abstract void setHype(float hype);

    /**
     * @return the assets
     */
    public float getAssets() {
        return assets;
    }

    /**
     * @param assets the assets to set
     */
    abstract void setAssets(float assets);

    /**
     * @return the companyNameString
     */
    public String getCompanyNameString() {
        return companyNameString;
    }

    /**
     * @param companyNameString the companyNameString to set
     */
    abstract void setCompanyNameString(String companyNameString);

    /**
     * @return the growthMultiplier
     */
    public byte getGrowthMultiplier() {
        return growthMultiplier;
    }

    /**
     * @param growthMultiplier the growthMultiplier to set
     */
    abstract void setGrowthMultiplier(byte growthMultiplier);

}
