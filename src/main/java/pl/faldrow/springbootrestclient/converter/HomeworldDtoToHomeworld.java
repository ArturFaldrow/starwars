package pl.faldrow.springbootrestclient.converter;

import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import pl.faldrow.springbootrestclient.dto.HomeworldDto;
import pl.faldrow.springbootrestclient.model.Homeworld;

/**
 * Created by Artur on 13.06.2020.
 */
public class HomeworldDtoToHomeworld implements Converter<HomeworldDto, Homeworld> {

    @Synchronized
    @Nullable
    @Override
    public Homeworld convert(HomeworldDto source) {

        if (source == null) {
            return null;
        }

        final Homeworld homeworld = new Homeworld();
        homeworld.setName(source.getName());
        homeworld.setRotationperiod(source.getRotation_period());
        homeworld.setOrbitalperiod(source.getOrbital_period());
        homeworld.setDiameter(source.getDiameter());
        homeworld.setClimate(source.getClimate());
        homeworld.setGravity(source.getGravity());
        homeworld.setTerrain(source.getTerrain());
        homeworld.setSurfacewater(source.getSurface_water());
        homeworld.setPopulation(source.getPopulation());

        return homeworld;

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
