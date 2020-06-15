package pl.faldrow.springbootrestclient;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import pl.faldrow.springbootrestclient.dto.StarshipDto;


import java.io.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Artur on 08.06.2020.
 */
@Slf4j
@Component
public class Start {

    public Start()  {


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //InputStream fileInputStream = new FileInputStream(Paths.get("starship.json").toFile());
        List<StarshipDto> starshipDtos = null;
        try {
            //File file = Paths.get("c:starship.json").toFile();
            File file = new File(getClass().getClassLoader().getResource("starships.json").getFile()
            );
            starshipDtos = Arrays.asList(objectMapper.readValue(file, StarshipDto[].class));
            starshipDtos.stream().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //List<StarshipCmd> starshipCmds = objectMapper.readValue(fileInputStream, new TypeReference<List<StarshipCmd>>(){});
        //fileInputStream.close();



        //System.out.println(starshipCmd.getName());
        //System.out.println(starshipCmd.toString());


    }
}





