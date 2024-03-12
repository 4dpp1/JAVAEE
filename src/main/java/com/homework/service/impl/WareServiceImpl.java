package com.homework.service.impl;

import com.homework.mapper.WareMapper;
import com.homework.pojo.Ware;
import com.homework.service.WareService;
import com.homework.utils.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
public class WareServiceImpl implements WareService {
    @Autowired
    private WareMapper wareMapper;
    @Override
    public void add(Ware ware) {
        //补充属性值
        ware.setCreateTime(LocalDateTime.now());
        ware.setUpdateTime(LocalDateTime.now());
        Map<String, Object> map = ThreadLocalUtil.get();
        Integer userId = (Integer) map.get("id");
        ware.setCreateUser(userId);
        wareMapper.add(ware);
    }

    @Override
    public List<Ware> list_all() {
        Map<String, Object> map = ThreadLocalUtil.get();
        Integer userId = (Integer) map.get("id");
        return wareMapper.list_all(userId);
    }


    @Override
    public void deleteById(int id) {
        wareMapper.deleteById(id);
    }

    @Override
    public Ware selectById(int id) {
        Ware ware = wareMapper.selectById(id);
        return ware;
    }

    @Override
    public void update(Ware ware) {
        wareMapper.update(ware);
    }
}
