package com.vista.example1.sring5.bootstrap;

import com.vista.example1.sring5.model.Author;
import com.vista.example1.sring5.model.Book;
import com.vista.example1.sring5.model.Publisher;
import com.vista.example1.sring5.repository.AuthorRepo;
import com.vista.example1.sring5.repository.BookRepo;
import com.vista.example1.sring5.repository.PublisherRepo;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private AuthorRepo authorRepo;
    private BookRepo bookRepo;
    private PublisherRepo publisherRepo;

    public DevBootstrap(AuthorRepo authorRepo,
                        BookRepo bookRepo,
                        PublisherRepo publisherRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        //Eric
        Publisher evans = new Publisher("Evans","London");
        publisherRepo.save(evans);
        Author eric = new Author("Eric", "Evans");
        Book  ddd = new Book("Domain Driven Design", "1234",evans);


        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepo.save(eric);
        bookRepo.save(ddd);
        publisherRepo.save(evans);

        //Rod
        Publisher longman = new Publisher("Longman","London");
        publisherRepo.save(longman);
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444" ,longman);

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        authorRepo.save(rod);
        bookRepo.save(noEJB);

    }


}