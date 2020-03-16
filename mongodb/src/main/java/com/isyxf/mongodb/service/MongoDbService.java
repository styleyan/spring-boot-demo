package com.isyxf.mongodb.service;

import com.isyxf.mongodb.dao.BookMongoDbDao;
import com.isyxf.mongodb.empty.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author styleyan
 * @Description: mongo
 */
@Service
public class MongoDbService {
    private static final Logger logger = LoggerFactory.getLogger(MongoDbService.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private BookMongoDbDao bookMongoDbDao;

    /**
     * 保存对象
     *
     * @param book
     */
    public String saveAobj(Book book) {
        logger.info("------------[MongoDB save start]");
        book.setCreateTime(new Date());
        book.setUpdateTime(new Date());

        bookMongoDbDao.save(book);
        return "添加成功";
    }

    /**
     * 查询所有
     *
     * @return
     */
    public List<Book> findAll() {
        logger.info("----------------->[MongoDB find start]");
        return mongoTemplate.findAll(Book.class);
    }

    /***
     * 根据id查询
     *
     * @param id
     * @return
     */
    public Book getBookById(String id) {
        logger.info("--------------------->[MongoDB find start]");
        Query query = new Query(Criteria.where("_id").is(id));
        return mongoTemplate.findOne(query, Book.class);
    }

    /**
     * 根据名称查询
     *
     * @param name
     * @return
     */
    public Book getBookByName(String name) {
        logger.info("----------------->[MongoDB find start]");
        Query query = new Query(Criteria.where("name").is(name));
        return mongoTemplate.findOne(query, Book.class);
    }

    /**
     * 更新对象
     *
     * @param book
     * @return
     */
    public String updateBook(Book book) {
        logger.info("----------------->[MongoDB find start]");
        Query query = new Query(Criteria.where("_id").is(book.getInfo()));
        Update update = new Update().set("publish", book.getPublish())
                .set("info", book.getInfo())
                .set("updateTime", new Date());

        mongoTemplate.updateFirst(query, update, Book.class);

        return "success";
    }

    /**
     * 删除对象
     *
     * @param book
     * @return
     */
    public String deleteBook(Book book) {
        logger.info("----------------->[MongoDB find start]");
        mongoTemplate.remove(book);

        return "success";
    }

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    public String deleteBookById(String id) {
        logger.info("----------------->[MongoDB find start]");
        // findOne
        Book book = getBookById(id);
        // delete
        deleteBook(book);

        return "success";
    }
}
