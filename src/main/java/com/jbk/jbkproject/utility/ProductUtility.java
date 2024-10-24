package com.jbk.jbkproject.utility;

import com.jbk.jbkproject.Entity.Product;

import java.util.Scanner;

public class ProductUtility {
    public static Product prepareProductData(Scanner sc) {

        System.out.println("Enter product name");
        String productName = sc.next();

        System.out.println("Enter product price");
        double productPrice = sc.nextDouble();

        System.out.println("Enter product quantity");
        Long productQty = sc.nextLong();


        System.out.println("Enter product catagoryId");
        Long categoryId = sc.nextLong();

        System.out.println("Enter product supplierId");
        Long supplierId = sc.nextLong();

           Product  product = new Product(productName,productPrice,productQty,categoryId, supplierId );
        boolean isvalid = validateProduct(product);
             if (isvalid) {
                 return product;
             } else {

                 return null;
             }
    }



    private static boolean validateProduct(Product product) {
        boolean isvalid = true;
        if(product.getProductId()<=0){
               isvalid = false;
               return  isvalid;
        }   if(product.getCategoryId()<=0){
            isvalid = false;
            return  isvalid;
        }
        if(product.getSupplierId()<=0){
            isvalid = false;
            return  isvalid;
        } if (product.getProductName()==null){
            isvalid = false;
            return  isvalid;
        } if (product.getProductPrice()<=0)
          return false;
            return isvalid;
    }
}