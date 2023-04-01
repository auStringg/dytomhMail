package com.dytomh.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dytomh.product.entity.BrandEntity;
import com.dytomh.product.entity.ProductAttrValueEntity;
import com.dytomh.product.service.BrandService;
import com.dytomh.product.service.ProductAttrValueService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class ProductApplicationTests {

    @Autowired
    ProductAttrValueService productAttrValueService;
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        List<ProductAttrValueEntity> list = productAttrValueService.list();
        System.out.println(list.size());
    }
    @Test
    void testInsert(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("xiaomi");
        brandService.save(brandEntity);
        log.info("保存成功");
    }
    @Test
    void testUpdate(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("xiaomi2");
        brandEntity.setBrandId(6L);
        brandService.updateById(brandEntity);
        log.info("保存成功");
    }
    @Test
    void testDelete(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("xiaomi");
        System.out.println(brandService.remove(new QueryWrapper<BrandEntity>().eq("name", "xiaomi2")));
        log.info("删除成功");
    }

}
