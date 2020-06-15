package pl.faldrow.springbootrestclient.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by Artur on 12.06.2020.
 */
@FeignClient(name = "data", url = "${feign.client.url}")
public interface IWeatherClient {

    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<Map> getWeather();

}
