package com.isyxf.mongodb.dao;

import com.isyxf.mongodb.empty.Book;
import org.springframework.stereotype.Repository;

/**
 * book dao
 */
@Repository
public class BookMongoDbDao extends MongoDbDao<Book> {

    @Override
    protected Class<Book> getEntityClass() {
        return Book.class;
    }
}
