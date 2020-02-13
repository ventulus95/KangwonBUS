package com.jistol.boilerplate;

import com.jistol.boilerplate.DTO.Response;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void toxext() throws URISyntaxException {
		String key ="JiqMumCy%2FR5DXh9tFOLDg1ftrxMNYXz0hEu%2FtK0PM6k5NVo5iByfwvnymrmBKypnaLl%2B5DVPMAh1BMfeGdPahg%3D%3D";
		String url = "http://openapi.tago.go.kr/openapi/service/ArvlInfoInqireService/getSttnAcctoArvlPrearngeInfoList?serviceKey="+key
                +"&cityCode=32010&nodeId=CCB250001747";
		URI uri = new URI(url); //URI 코드 % -> 25 encoding 방지.
		RestTemplate r = new RestTemplate();
//		r.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8"))); //한글깨짐 방지
		System.out.println(r.getForObject(uri, Response.class).getBody().getItems().get(1).getVehicletp());
//		System.out.println(r.getForEntity(uri, String.class));
	}
}
