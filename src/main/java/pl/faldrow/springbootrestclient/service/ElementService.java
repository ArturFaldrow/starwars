package pl.faldrow.springbootrestclient.service;

import pl.faldrow.springbootrestclient.dto.ElementDto;
import pl.faldrow.springbootrestclient.model.Element;

import java.util.Set;

/**
 * Created by Artur on 11.06.2020.
 */
public interface ElementService {

 Set<Element> getElements();

 Element findById(Long l);

 ElementDto saveElementDto(ElementDto elementDto);
}
