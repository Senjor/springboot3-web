/**
 * Copyright (C), 2009-2019, 智游集团
 * FileName: BookServiceImpl
 * Author:   laosun
 * Date:     2019/7/15 5:27 PM
 * Description:
 */
package com.zhiyou.springboot3web.service.impl;

import com.zhiyou.springboot3web.pojo.Book;
import com.zhiyou.springboot3web.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {


    private static Map<Long, Book> BOOK_DB = new HashMap<>();

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(BOOK_DB.values());
    }

    @Override
    public Book insertByBook(Book book) {
        book.setId(BOOK_DB.size() + 1L);
        BOOK_DB.put(book.getId(), book);
        return book;
    }

    @Override
    public Book update(Book book) {
        BOOK_DB.put(book.getId(), book);
        return book;
    }

    @Override
    public Book delete(Long id) {
        return BOOK_DB.remove(id);
    }

    @Override
    public Book findById(Long id) {
        return BOOK_DB.get(id);
    }
}
