/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yashpatel.plainjava.db.connect;

import javax.print.attribute.standard.RequestingUserName;
import java.util.Base64;  
import javax.swing.BoundedRangeModel;
/**
 *
 * @author Yash Patel
 */
public class PasswordManager {
    
    private static String username = "eWFzaGlkYQ==";
    private static String password = "QXNtYTEyMyE=" ;
    
    private static Base64.Encoder encoder = Base64.getEncoder();
    private static  Base64.Decoder decoder = Base64.getDecoder();  
    
    
    public String getPassword(){
        return new String(decoder.decode(password.getBytes()));
    }
    
    public String getUsername(){
       return new String(decoder.decode(username.getBytes()));
       
    }
    
}
