package pl.faldrow.springbootrestclient.feign;

import org.springframework.stereotype.Component;

/**
 * Created by Artur on 12.06.2020.
 */
@Component
public class WeatherFallback implements IWeatherClient {

    @Override
    public ResponseEntity



            <map> getWeather() {
        return null;
    }

}
