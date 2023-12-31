package com.workintech.zoo.controller;

import com.workintech.zoo.entity.Kangroo;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/kangroos")
public class KangrooController {

    Map<Long, Kangroo> kangroos;

    @PostConstruct
    public void init(){
        kangroos = new HashMap<>();
        System.out.println("post construct");
    }

    @GetMapping("/")
    public List<Kangroo> findAll(){
        return kangroos.values().stream().toList();
    }

    @GetMapping("/{id}")
    public Kangroo findById(@PathVariable long id){
        return kangroos.get(id);
    }

    @PostMapping("/")
    public Kangroo save(@RequestBody Kangroo kangroo){
        kangroos.put(kangroo.getId(), kangroo);
        return kangroos.get(kangroo.getId());
    }
    @PutMapping("/{id}")
    public Kangroo update(@PathVariable long id, @RequestBody Kangroo kangroo){
        kangroo.setId(id);
        if(kangroos.containsKey(id)){
            kangroos.put(id,kangroo);
            return kangroos.get(id);
        }else{
            return save(kangroo);
        }
    }



    @DeleteMapping("/{id}")
    public Kangroo delete(@PathVariable long id){
        return kangroos.remove(id);

    }




}
