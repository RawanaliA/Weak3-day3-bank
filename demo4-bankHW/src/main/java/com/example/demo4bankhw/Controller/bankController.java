package com.example.demo4bankhw.Controller;

import com.example.demo4bankhw.Model.Custemer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/bank")
public class bankController {
    ArrayList<Custemer> custemers = new ArrayList<>();

    @RequestMapping("/add")
    //add
    public String newCustemr(@RequestBody Custemer custemer) {
        custemers.add(custemer);
        return "new custemer added succsufully";
    }

    @GetMapping("/get")
    public ArrayList<Custemer> getCustemer() {
        return custemers;
    }

    //    update-put
    @PutMapping("/update/{index}")

    public String updateCustermer(@PathVariable int index, @RequestBody Custemer custemer) {
        custemers.set(index, custemer);
        return "Custemer Info is update it";
    }

    //delete
    @DeleteMapping("/delete/{index}")
    public String deleteCustermer(@PathVariable int index) {
        custemers.remove(index);
        return "Custermer delete it";
    }

    @PutMapping("/deposite/{index}")
    public int deposite(@PathVariable int index, @RequestBody Custemer custemer) {
        custemers.set(index, custemer);
        return custemer.getBalance()+100;
    }
    @PutMapping ("/withdrwel/{index}")
    public int withdrwel(@PathVariable int index, @RequestBody Custemer custemer){
        custemers.set(index, custemer);
        return custemer.getBalance()-100;
    }
}
