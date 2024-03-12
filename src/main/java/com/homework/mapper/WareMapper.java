package com.homework.mapper;

import com.homework.pojo.Ware;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WareMapper {
    //新增
    @Insert("insert into ware(name, content,cover_img,state,category_id,user,time,update_time) " +
            "values(#{name}, #{content}, #{coverImg}, #{state}, #{categoryId}, #{createUser}, #{createTime}, #{updateTime})")
    void add(Ware ware);

    //展示全部
    @Select("select * from ware where user=#{userId}")
    List<Ware> list_all(Integer userId);

    @Delete("delete from ware where id = ${id}")
    void deleteById(int id);

    @Select("select * from ware where id = ${id}")
    Ware selectById(int id);

    @Update("update ware set name=#{name},content=#{content},cover_img=#{coverImg} where id=#{id}")
    void update(Ware ware);

    //删除
}
