package com.tutorial.demo.bootstrap;

import com.tutorial.demo.model.Author;
import com.tutorial.demo.model.Book;
import com.tutorial.demo.model.Publisher;
import com.tutorial.demo.repository.AuthorRepository;
import com.tutorial.demo.repository.BookRepository;
import com.tutorial.demo.repository.PublisherRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor()
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        iniData();
    }

    private void iniData(){

        //Author
        Author author = new Author();
        author.setFirstName("Remigio");
        author.setLastName("Fernández");

        //Publisher
        Publisher publisher = new Publisher();
        publisher.setName("Harper Collins");

        //Book
        Book book = new Book();
        book.setTitle("Domain Driven Design");
        book.setIsbn("1234");
        book.setPublisher(publisher);

        author.getBooks().add(book);
        book.getAuthors().add(author);

        publisherRepository.save(publisher);
        authorRepository.save(author);
        bookRepository.save(book);

        //Author2
        Author author2 = new Author();
        author2.setFirstName("Javier");
        author2.setLastName("Monje");

        //Book2
        Book book2 = new Book();
        book2.setTitle("J2EE Development without EJB");
        book2.setIsbn("2344");
        book2.setPublisher(publisher);

        author2.getBooks().add(book2);

        authorRepository.save(author2);
        bookRepository.save(book2);

    }

}
