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
@ToString(exclude = "authors")
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "BOOK")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "PRINT_YEAR", nullable = false)
    private int printYear;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "books")
    private Set<Author> authors;
}
