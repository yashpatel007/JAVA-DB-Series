/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quickapi.QuickAPI.repositories;

import com.quickapi.QuickAPI.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Yash Patel
 */

@RepositoryRestResource
public interface todoRepository extends  CrudRepository<Todo, Integer>{
    
}
