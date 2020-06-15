package pl.faldrow.springbootrestclient.service;

import pl.faldrow.springbootrestclient.dto.StarshipDto;
import pl.faldrow.springbootrestclient.model.Starship;

/**
 * Created by Artur on 11.06.2020.
 */
public interface StarshipService {

    Starship addHomeworld (StarshipDto starshipDto);
    void update(StarshipDto starshipDto);
}
