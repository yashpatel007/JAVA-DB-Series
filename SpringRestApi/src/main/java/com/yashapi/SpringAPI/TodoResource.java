/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yashapi.SpringAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author Yash Patel
 */

@RestController
public class TodoResource {
    
    
    // wellnot exactly a esource but a controller
    @Autowired
    TodoRepository todoRepo;
    
    
    /*================= GET MAPPINGS =======================================*/
    
    @GetMapping("todo")
    public List<Todo> getTodo(){
        List <Todo> todo = (List <Todo>) todoRepo.findAll();
        
        return todo;
    }
    
    @GetMapping("todo/{id}")
    public Optional<Todo> getById(@PathVariable Integer id){
        Optional<Todo> todo = todoRepo.findById(id);
        return todo;
    }
    
    @GetMapping("todo/title/{title}")
    public List<Todo> getByTitle(@PathVariable String title){
        
        System.out.println(title);
        List <Todo> todo = todoRepo.findByTitle(title);
        return todo;
    }
    
    
    @GetMapping("todo/status/{status}")
    public List<Todo> getByStatus(@PathVariable Integer status){
        
        List <Todo> todo = todoRepo.findByStatus(status);
        return todo;
    }
    
    /*================= PUT MAPPINGS =======================================*/
    
    @PutMapping("todo/{id}")
    public String putTodo(@PathVariable Integer id,@RequestParam("title") String title,
                             @RequestParam("description") String description,
                             @RequestParam("status") Integer status){
        
        Integer stat =   todoRepo.updateToTodo(id,title, description, status);
        if(stat==1){
            return "{sucess}";
        }else{
            return "{Failed to add id:"
                    + id
                    + "{title:"
                    + "description:"
                    + "status:"
                    + "}"
                    + "}";
        }
        
        
    }
    
    /*================= POST MAPPINGS =======================================*/
    
    @PostMapping("todo")
    public String updateTodo(@RequestParam("title") String title,
                             @RequestParam("description") String description,
                             @RequestParam("status") Integer status){
     Integer stat =   todoRepo.addToTodo(title, description, status);
        if(stat==1){
            return "{sucess}";
        }else{
            return "{Failed to add "
                    + "{title:"
                    + "description:"
                    + "status:"
                    + "}"
                    + "}";
        }
    }
    
    
    /*================= Delete MAPPINGS =======================================*/
    @DeleteMapping("todo/{id}")
    public String deleteById(@PathVariable Integer id){
        
       todoRepo.deleteById(id);
       return "{ delete : success, deleted id:"
               + id
               + "}";
    
    }
    
    @DeleteMapping("todo/status/{status}")
    public String deleteByStatus(@PathVariable Integer status){
        
        todoRepo.deleteByStatus(status);
        
        return "{delete: sucess, deleted all with status:"
                + status
                + "}";
    
    }
    
    
}
