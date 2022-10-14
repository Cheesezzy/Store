package com.pach.csv;

import com.pach.enums.Category;
import com.pach.models.Product;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class CSVReader {
    List<Product> productList;
    public List<Product> getProductList() {
        return productList;
    }

    public Boolean readCSV() { // initial file reader for week 2 task i left it for reference purposes.
        List<Product> productList = new ArrayList<>();
        String path = "src//main//resources//Store.csv";
        String line = "";
        int count = 0;

        try {
            BufferedReader br =  new BufferedReader(new FileReader(path)); // reading from resources
            while ((line = br.readLine()) != null ){
                String[] lineSplit = line.split(",");
                if(count > 0) {
                     lineSplit = line.split(","); // Array of my products separated by commas
//                System.out.println(lineSplit);
                    productList.add(new Product(lineSplit[0], // product ID
                            valueOf(lineSplit[1]), // product name
                            Category.valueOf(lineSplit[2]), // product category
                            Integer.valueOf(lineSplit[3]), // product quantity
                            Double.valueOf(lineSplit[4]))); // product price
                }
                count++;
            }
            this.productList = productList;
            br.close();
        }catch(Exception e){
            e.printStackTrace(); // returns the error
            return false;
        }
        return true;
    }


    public List<Product> readCSVFile() {
        List<Product> productList = new ArrayList<>();
        String path = "src//main//resources//Store.csv";
        String line = "";
        int count = 0;

        try {
            BufferedReader br =  new BufferedReader(new FileReader(path)); // reading from resources
            while ((line = br.readLine()) != null ){
                String[] lineSplit = line.split(",");
                if(count > 0) {
                    lineSplit = line.split(","); // Array of my products separated by commas
//                System.out.println(lineSplit);
                    productList.add(new Product(lineSplit[0], // product ID
                            valueOf(lineSplit[1]), // product name
                            Category.valueOf(lineSplit[2]), // product category
                            Integer.valueOf(lineSplit[3]), // product quantity
                            Double.valueOf(lineSplit[4]))); // product price
                }
                count++;
            }
            this.productList = productList;
            br.close();
        }catch(Exception e){
            e.printStackTrace(); // returns the error
        }
        return productList;
    }


}
