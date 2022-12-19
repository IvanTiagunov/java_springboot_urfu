package org.example.app.services;

import org.apache.log4j.Logger;
import org.example.web.dto.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookRepository implements ProjectRepository<Book> {

    private final Logger logger = Logger.getLogger(BookRepository.class);
    private final List<Book> repo = new ArrayList<>();

    @Override
    public List<Book> retreiveAll() {
        return new ArrayList<>(repo);
    }

    @Override
    public void store(Book book) {
        //TODO задание 2
        if (!String.valueOf(book.getId()).isEmpty() && !book.getAuthor().isEmpty() && !book.getSize().toString().isEmpty()){
            book.setId(book.hashCode());
            logger.info("store new book: " + book);
            repo.add(book);
        }

    }

    @Override
    public boolean removeItemById(Integer bookIdToRemove) {
        for (Book book : retreiveAll()) {
            if (book.getId().equals(bookIdToRemove)) {
                logger.info("remove book completed: " + book);
                return repo.remove(book);
            }
        }
        return false;
    }


    @Override
    public boolean removeItemByRegex(String query){
        //TODO задание 3
        boolean flag = false;
        for (Book book : retreiveAll()) {
            if (book.getAuthor().equals(query) || book.getTitle().equals(query) ||
                    book.getSize().toString().equals(query)) {
                flag = true;
                removeItemById(book.getId());
            }
        }
        return flag;
    }
}
