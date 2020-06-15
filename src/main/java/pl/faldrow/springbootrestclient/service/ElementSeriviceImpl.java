package pl.faldrow.springbootrestclient.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.faldrow.springbootrestclient.dto.ElementDto;
import pl.faldrow.springbootrestclient.model.Element;
import pl.faldrow.springbootrestclient.repo.ElementRepo;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by Artur on 13.06.2020.
 */
@Slf4j
@Service
public class ElementSeriviceImpl implements ElementService{

    private final ElementRepo elementRepo;

    public ElementSeriviceImpl(ElementRepo elementRepo) {
        this.elementRepo = elementRepo;
    }


    @Override
    public Set<Element> getElements() {
        log.debug("I am in service getElements");

        Set<Element> elementSet = new HashSet<>();
        elementRepo.findAll().iterator().forEachRemaining(elementSet::add);
        return elementSet;
    }

    @Override
    public Element findById(Long l) {
        Optional<Element> elementOptional = elementRepo.findById(l);
        if (!elementOptional.isPresent()) {
            throw new RuntimeException("Element Not Found!");
        }

        return elementOptional.get();
    }

    @Override
    public ElementDto saveElementDto(ElementDto elementDto) {

        Element element = ElementDtoToElement.convert(elementDto);
        return null;
    }
}
