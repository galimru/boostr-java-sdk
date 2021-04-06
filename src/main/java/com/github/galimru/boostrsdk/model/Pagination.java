package com.github.galimru.boostrsdk.model;

public class Pagination {

    private final Integer page;
    private final Integer size;

    public static Pagination of(Integer page, Integer size) {
        return new Pagination(page, size);
    }

    public static Pagination unpaged() {
        return new Pagination(null, null);
    }

    public Pagination(Integer page, Integer size) {
        this.page = page;
        this.size = size;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getSize() {
        return size;
    }
}
