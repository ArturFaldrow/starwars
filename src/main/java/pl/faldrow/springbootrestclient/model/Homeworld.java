package pl.faldrow.springbootrestclient.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Artur on 10.06.2020.
 */
    @Data
    @Entity
    @Table(name = "homeworlds")

    public class Homeworld {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String idno;
        private String name;
        private String rotationperiod;
        private String orbitalperiod;
        private String diameter;
        private String climate;
        private String gravity;
        private String terrain;
        private String surfacewater;
        private String population;

        @OneToOne
        private Element element;

  /*      public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRotation_period() {
            return rotationperiod;
        }

        public void setRotation_period(String rotation_period) {
            this.rotationperiod = rotation_period;
        }

        public String getOrbital_period() {
            return orbitalperiod;
        }

        public void setOrbital_period(String orbital_period) {
            this.orbitalperiod = orbital_period;
        }

        public String getDiameter() {
            return diameter;
        }

        public void setDiameter(String diameter) {
            this.diameter = diameter;
        }

        public String getClimate() {
            return climate;
        }

        public void setClimate(String climate) {
            this.climate = climate;
        }

        public String getGravity() {
            return gravity;
        }

        public void setGravity(String gravity) {
            this.gravity = gravity;
        }

        public String getTerrain() {
            return terrain;
        }

        public void setTerrain(String terrain) {
            this.terrain = terrain;
        }

        public String getSurface_water() {
            return surfacewater;
        }

        public void setSurface_water(String surface_water) {
            this.surfacewater = surface_water;
        }

        public String getPopulation() {
            return population;
        }

        public void setPopulation(String population) {
            this.population = population;
        }
        */
    }


