package pl.faldrow.springbootrestclient.converter;

import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import pl.faldrow.springbootrestclient.dto.ElementDto;
import pl.faldrow.springbootrestclient.model.Element;

/**
 * Created by Artur on 13.06.2020.
 */
@Component
public class ElementDtoToElement implements Converter<ElementDto, Element> {

    private final HomeworldDtoToHomeworld homeworldConverter;
    private final StarshipDtoToStarship starshipConverter;

    public ElementDtoToElement(HomeworldDtoToHomeworld homeworldConverter, StarshipDtoToStarship starshipConverter) {
        this.homeworldConverter = homeworldConverter;
        this.starshipConverter = starshipConverter;
    }

    @Synchronized
    @Nullable
    @Override
    public Element convert(ElementDto source) {

        if (source == null) {
            return null;
        }

        final Element element = new Element();
        element.setIdno(stripNonDigits(source.getUrl()));
        element.setName(source.getName());
        element.setHeight(source.getHeight());
        element.setMass(source.getMass());
        element.setHairColor(source.getHairColor());
        element.setSkinColor(source.getSkinColor());
        element.setEyeColor(source.getEyeColor());
        element.setBirthYear(source.getBirthYear());
        element.setGender(source.getGender());

        element.setHomeworld(homeworldConverter.convert(source.getHomeworld());  // wazne TODO



        //String urlPlanet = source.getHomeworld();


        return element;
    }

    private static String stripNonDigits(final CharSequence input) {
        final StringBuilder sb = new StringBuilder(input.length());
        for (int i = 0; i < input.length(); i++) {
            final char c = input.charAt(i);
            if (c > 47 && c < 58) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
