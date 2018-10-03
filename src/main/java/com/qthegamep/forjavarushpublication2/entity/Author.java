package com.qthegamep.forjavarushpublication2.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Set;

/**
 * This class is an entity.
 * There is an no args constructor, getters and setters for all fields, override equals, hashcode and toString methods
 * generated by lombok.
 */
@Data
@ToString(exclude = "books")
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "AUTHOR")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "SECOND_NAME", nullable = false)
    private String secondName;

    @ManyToMany
    @JoinTable(name = "HAS",
            joinColumns = @JoinColumn(name = "AUTHOR_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "BOOK_ID", referencedColumnName = "ID")
    )
    private Set<Book> books;
}
