package pl.faldrow.springbootrestclient.dto;

import lombok.*;

/**
 * Created by Artur on 11.06.2020.
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HomeworldDto {


    private String name;
    private String rotation_period;
    private String orbital_period;
    private String diameter;
    private String climate;
    private String gravity;
    private String terrain;
    private String surface_water;
    private String population;
    private String url;

}
