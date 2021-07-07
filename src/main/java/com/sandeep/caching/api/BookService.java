package com.sandeep.caching.api;

import com.sandeep.caching.dto.Book;

public interface BookService  {
    Book addBook(Book book);

    Book updateBook(Book book);

    Book getBook(long id);

    String deleteBook(long id);
}
