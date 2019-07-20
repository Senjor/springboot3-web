/**
 * Copyright (C), 2009-2019, 智游集团
 * FileName: Book
 * Author:   laosun
 * Date:     2019/7/15 5:16 PM
 * Description:
 */
package com.zhiyou.springboot3web.pojo;

public class Book {


//  properties
    private Long id;

    private String name;

    private String writer;

    private String introduction;


    public Long getId() {
        return id;
    }

//   setters and getters 当然可以使用lombok,省略掉下面的代码
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

}
