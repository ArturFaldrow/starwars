package pl.faldrow.springbootrestclient.dto;

import lombok.*;

import java.util.Set;

/**
 * Created by Artur on 10.06.2020.
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ElementDto {


    private String name;
    private String height;
    private String mass;
    private String hairColor;
    private String skinColor;
    private String eyeColor;
    private String birthYear;
    private String gender;

    private String homeworld;
    private Set<String> starshipSet;
    private String url;


}
