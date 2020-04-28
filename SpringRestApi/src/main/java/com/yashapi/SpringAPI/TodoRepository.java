/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yashapi.SpringAPI;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Yash Patel
 */

@Repository
public interface TodoRepository  extends CrudRepository<Todo, Integer>{
    
    public List<Todo> findByTitle(String title);
    public List<Todo> findByStatus(Integer status);
    
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "DELETE FROM todo Where status=:status",nativeQuery = true)
    public Integer deleteByStatus(Integer status);
    
    
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "INSERT INTO todo (title,description,status) VALUES (:title,:description,:status)",nativeQuery = true)
    public Integer addToTodo(String title,String description,Integer status);
    
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE todo SET title=:title,description=:description,status=:status WHERE id=:id",nativeQuery = true)
    public Integer updateToTodo(Integer id,String title,String description,Integer status);
    
}
