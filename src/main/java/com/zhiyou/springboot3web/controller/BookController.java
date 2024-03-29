/**
 * Copyright (C), 2009-2019, 智游集团
 * FileName: BookController
 * Author:   laosun
 * Date:     2019/7/15 5:29 PM
 * Description:
 */
package com.zhiyou.springboot3web.controller;

import com.zhiyou.springboot3web.pojo.Book;
import com.zhiyou.springboot3web.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class BookController {


    @Autowired
    BookService bookService;

    /**
     * 获取 Book 列表
     * 处理 "/book" 的 GET 请求，用来获取 Book 列表
     */
    @GetMapping
    public List<Book> getBookList() {
        return bookService.findAll();
    }

    /**
     * 获取 Book
     * 处理 "/book/{id}" 的 GET 请求，用来获取 Book 信息
     */
    @GetMapping(value = "/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookService.findById(id);
    }

    /**
     * 创建 Book
     * 处理 "/book/create" 的 POST 请求，用来新建 Book 信息
     * 通过 @RequestBody 绑定实体参数，也通过 @RequestParam 传递参数
     */
    @PostMapping(value = "/create")
    public Book postBook(@RequestBody Book book) {
        return bookService.insertByBook(book);
    }

    /**
     * 更新 Book
     * 处理 "/update" 的 PUT 请求，用来更新 Book 信息
     */
    @PutMapping(value = "/update")
    public Book putBook(@RequestBody Book book) {
        return bookService.update(book);
    }

    /**
     * 删除 Book
     * 处理 "/book/{id}" 的 GET 请求，用来删除 Book 信息
     */
    @DeleteMapping(value = "/delete/{id}")
    public Book deleteBook(@PathVariable Long id) {
        return bookService.delete(id);
    }

}
