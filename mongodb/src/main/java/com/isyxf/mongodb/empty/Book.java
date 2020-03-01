package com.isyxf.mongodb.empty;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description: 图书实体类
 */
@Data
@Document(collection = "yxf_book")
public class Book {
    @Id
    private String id;
    /**
     * 价格
     */
    private Integer price;
    /**
     * 书名
     */
    @JSONField(name = "error_detail")
    private String name;
    /**
     * 简介
     */
    private String info;
    /**
     * 出版社
     */
    private String publish;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 列表
     */
    private List<String> authors = new ArrayList<>();
}
