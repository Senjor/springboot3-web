/**
 * Copyright (C), 2009-2019, 智游集团
 * FileName: BookService
 * Author:   laosun
 * Date:     2019/7/15 5:20 PM
 * Description:
 */
package com.zhiyou.springboot3web.service;

import com.zhiyou.springboot3web.pojo.Book;

import java.util.List;

public interface BookService {


    List<Book> findAll();

    Book insertByBook(Book book);

    Book update(Book book);

    Book delete(Long id);

    Book findById(Long id);
}
