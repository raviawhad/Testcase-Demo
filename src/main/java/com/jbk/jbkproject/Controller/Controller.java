package com.jbk.jbkproject.Controller;

import com.jbk.jbkproject.Entity.Product;
import com.jbk.jbkproject.Services.Service;
import com.jbk.jbkproject.utility.ProductUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
 @RestController
public class Controller {
     ;

     public static void main(String[] args){
         Service service = new Service();

         Scanner sc = new Scanner(System.in);
         int choise;
         char c;
         do {
             System.out.println("press 1 for Product   save");
             System.out.println("press 2 for Add product");

             choise = sc.nextInt();
             switch (choise) {
                 case 1: {
                     Product product = ProductUtility.prepareProductData(sc);
                     String msg = service.addproduct(product);
                     System.out.println(msg);
                     break;
                 }

                 case 2: {
                     System.out.println("2222");
                     break;
                 }

                 default:
                     System.out.println("Invalid choise");
                     break;
             }


             System.out.println("do you  want to continue?(y/n)");
             c = sc.next().charAt(0);

         } while (c == 'y' || c == 'Y');

         System.out.println("terminate opration");

     }

 }

