package com.sky.service;


import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;
import io.swagger.models.auth.In;

public interface DishService {

    void insert(DishDTO dishDTO);

    PageResult selectBypage(DishPageQueryDTO dishPageQueryDTO);

    void deleteByID(Long[] ids);

    DishVO selectById(Long id);

    void update(DishDTO dishDTO);

    void updateStatus(Integer status, Long id);
}
