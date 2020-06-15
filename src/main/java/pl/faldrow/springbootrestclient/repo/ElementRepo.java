package pl.faldrow.springbootrestclient.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.faldrow.springbootrestclient.model.Element;

import java.util.Optional;

/**
 * Created by Artur on 11.06.2020.
 */
public interface ElementRepo extends JpaRepository<Element, Long> {

    Optional<Element> findById(Long id);
}
