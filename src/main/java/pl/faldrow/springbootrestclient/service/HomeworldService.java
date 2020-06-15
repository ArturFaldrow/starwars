package pl.faldrow.springbootrestclient.service;


import pl.faldrow.springbootrestclient.dto.HomeworldDto;

import java.util.Set;

/**
 * Created by Artur on 11.06.2020.
 */
public interface HomeworldService {

    Set<Homeworld> getHomeworld();

    Homeworld findById(Long l);

    HomeworldDto saveHomeworldDto(HomeworldDto homeworldDto);
}
