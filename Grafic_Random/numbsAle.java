/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treinografc;

/**
 *
 * @author lucas
 */
public class numbsAle {
    
    private int anyVal;
    private String anyRowName;

    public int getAnyVal() {
        return anyVal;
    }

    public void setAnyVal(int anyVal) {
        this.anyVal = anyVal;
    }

    public String getAnyRowName() {
        return anyRowName;
    }

    public void setAnyRowName(String anyRowName) {
        this.anyRowName = anyRowName;
    }

    public numbsAle(){}
    
    public void cadAny(int val, String rowName){
        setAnyVal(val);
        setAnyRowName(rowName);
    }
    
    public numbsAle(int anyVal, String anyRowName) {
        this.anyVal = anyVal;
        this.anyRowName = anyRowName;
    }
}
