package pl.faldrow.springbootrestclient.converter;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.faldrow.springbootrestclient.dto.ElementDto;
import pl.faldrow.springbootrestclient.dto.HomeworldDto;
import pl.faldrow.springbootrestclient.dto.StarshipDto;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Artur on 09.06.2020.
 */
public class converterToDto {


    public List<StarshipDto> StarShipMapperToDto()
    {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //InputStream fileInputStream = new FileInputStream(Paths.get("starship.json").toFile());
        List<StarshipDto> starshipDtos = null;
        try {
            //File file = Paths.get("c:starship.json").toFile();
            File file = new File(getClass().getClassLoader().getResource("starships.json").getFile());
            starshipDtos = Arrays.asList(objectMapper.readValue(file, StarshipDto[].class));
            starshipDtos.stream().forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            return starshipDtos;
        }
    }

    public List<ElementDto> ElementMapperToDto()
    {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //InputStream fileInputStream = new FileInputStream(Paths.get("starship.json").toFile());
        List<ElementDto> elementDtos = null;
        try {
            //File file = Paths.get("c:starship.json").toFile();
            File file = new File(getClass().getClassLoader().getResource("people.json").getFile());
            elementDtos = Arrays.asList(objectMapper.readValue(file, ElementDto[].class));
            elementDtos.stream().forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            return elementDtos;
        }
    }

    public List<HomeworldDto> HomeworldMapperToDto()
    {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //InputStream fileInputStream = new FileInputStream(Paths.get("starship.json").toFile());
        List<HomeworldDto> homeworldDtos = null;
        try {
            //File file = Paths.get("c:starship.json").toFile();
            File file = new File(getClass().getClassLoader().getResource("planets.json").getFile());
            homeworldDtos = Arrays.asList(objectMapper.readValue(file, HomeworldDto[].class));
            homeworldDtos.stream().forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            return homeworldDtos;
        }
    }


}
