/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Product
 * Author:   苏晨宇
 * Date:     2020/12/3 19:24
 * Description: 实体类product
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.how2java;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈实体类product〉
 *
 * @author 苏晨宇
 * @create 2020/12/3
 * @since 1.0.0
 */
public class Product {
    int id;
    String name;
    String category;
    float price;
    String place;
    String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Map toMap() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("category", category);
        map.put("code", code);
        map.put("place", place);
        map.put("price", price);
        return map;
    }
}
 
