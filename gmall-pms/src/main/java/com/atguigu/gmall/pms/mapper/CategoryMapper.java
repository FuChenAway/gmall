package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wxh
 * @email wxh@qq.com
 * @date 2021-06-22 18:20:30
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {
	
}
