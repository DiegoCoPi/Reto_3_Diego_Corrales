/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dates_Pkg;
import java.text.NumberFormat;

/**
 *
 * @author Diego Corrales
 */
public class InventoryDataClass extends ProductsDataClass {
    
    private int total_price;

    public InventoryDataClass(String product_name, String product_line, String product_section, String product_lenght, int product_price, int product_quantity, int product_code) {
        super(product_name, product_line, product_section, product_lenght, product_price, product_quantity, product_code);
    }
    
    

    public int getTotal_price() {
        
        return total_price;
        
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }
    
    
}
