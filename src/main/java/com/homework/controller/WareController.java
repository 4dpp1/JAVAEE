package com.homework.controller;

import com.homework.pojo.Result;
import com.homework.pojo.Ware;
import com.homework.service.WareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ware")
public class WareController {
    @Autowired
    private WareService wareService;
    //添加货物
    @PostMapping("/add")
    public Result add(@RequestBody @Validated Ware ware){
        wareService.add(ware);
        return Result.success();
    }
    //列出所有货物
    @GetMapping("/list_all")
    public Result list_all(){
        List<Ware> cs = wareService.list_all();
        return Result.success(cs);
    }
    //删除货物
    @DeleteMapping("/delete")
    public Result delete(int id){
        wareService.deleteById(id);
        return Result.success();
    }
    //获取货物
    @GetMapping("/select")
    public Result select(int id){
        Ware ware = wareService.selectById(id);
        return Result.success(ware);
    }
    //修改货物
    @PutMapping("/update")
    public Result update(@RequestBody Ware ware){
        wareService.update(ware);
        return Result.success();
    }
}

