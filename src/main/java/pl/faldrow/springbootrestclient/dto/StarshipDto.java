package pl.faldrow.springbootrestclient.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class StarshipDto {


    private Long id;
    private String name;
    private String model;
    private String manufacturer;
    private String cost_In_Credits;
    private String length;
    private String max_Atmosphering_Speed;
    private String crew;
    private String passengers;
    private String cargo_Capacity;
    private String consumables;
    private String hyperdrive_Rating;
    private String mGLT;
    private String starship_Class;
    private String url;



}