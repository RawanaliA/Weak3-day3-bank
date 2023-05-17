package com.example.demo4task.Controller;

import com.example.demo4task.Model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/task")
public class TaskController {
    ArrayList<Task> tasks=new ArrayList<>();
    //creat
    @GetMapping("/display")
    public ArrayList<Task> display(){
        return tasks;
    }
    //Display
    @PostMapping("/create")
    public String createTask(@RequestBody Task task){
        tasks.add(task);
        return "create is done";
    }
    //update
    @PutMapping("/update/{index}")

    public String updateTask(@PathVariable int index,@RequestBody Task task){
        tasks.set(index,task);
        return "Task update it";
    }
    //delete
    @DeleteMapping("/delete/{index}")
    public String deleteTodo(@PathVariable int index){
        tasks.remove(index);
        return "delet is done!";
    }
    //status Done or Not doneاخذ بس الانديكس واللوجيك اشيك اد
    @PutMapping("/status/{index}")
    public String status(@PathVariable int index){
        tasks.get(index);
        Task task=tasks.get(index);
        task.setStatus("done");
        tasks.set(index,task);
        return "the status changed";
    }
//    Search
    @GetMapping("/search")
    public String search(Task task) {
//    tasks.equals("work");
//    return  "Search is done";
        for (Task element : tasks) {
            if (element.equals("work")) {
                System.out.println(element);
            }
        } return "Search is done";
}}
