/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quickapi.QuickAPI.controller;

import com.quickapi.QuickAPI.models.Todo;
import com.quickapi.QuickAPI.repositories.todoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Yash Patel
 */


@RestController
public class TodoController {
    
    
    @Autowired
    private todoRepository myrepository;
    
    
    
    // one can add custom queries lik this 
    
    @RequestMapping("/todos/title/{title}")
    public List<Todo> getByTitle(@PathVariable("title") String title){
        
        return myrepository.findByTitle(title);
    }
    
    
    
    
}
