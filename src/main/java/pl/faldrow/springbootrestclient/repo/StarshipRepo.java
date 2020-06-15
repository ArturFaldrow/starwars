package pl.faldrow.springbootrestclient.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.faldrow.springbootrestclient.model.Starship;

/**
 * Created by Artur on 11.06.2020.
 */
public interface StarshipRepo extends JpaRepository<Starship, Long> {
}
