package pl.faldrow.springbootrestclient.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Artur on 10.06.2020.
 */
@Entity
@Table(name = "pages")
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long pages;

    @OneToMany
    private Set<Element> elementSet;
}
