package com.jbk.jbkproject.Services;

import com.jbk.jbkproject.Dao.DaoRepo;
import com.jbk.jbkproject.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    DaoRepo dao;

         public  String  addproduct(Product product){
             String msg=null;
             Product savedproduct = dao.save(product);

             if(savedproduct != null){
                 msg = "product added successfully";

             }else{
                 msg = "product not added successfully";
             }
             return msg;
         }

}
