package com.homework.service;

import com.homework.pojo.Ware;

import java.util.List;

public interface WareService {
    //新增文章
    void add(Ware ware);
    List<Ware> list_all();

    void deleteById(int id);

    Ware selectById(int id);

    void update(Ware ware);
}
