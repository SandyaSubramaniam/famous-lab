package co.grandcircus.famouslab;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.famouslab.model.NameResponse;

/**
 * This ApiService plays the same role for APIs that DAOs play for databases.
 */
@Component // <- identify this as an autowirable Spring bean
public class ApiService {

//	private String API_KEY = "27f1a7a4f4294ffb97c774f67425d6a8";
	private RestTemplate restTemplate;
	// This is an instance initialization block. It runs when a new instance of the
	// class is created--
	// right before the constructor.
	{
		// This configures the restTemplateWithUserAgent to include a User-Agent header
		// with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is
		// required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public NameResponse getList() {

		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		NameResponse response = restTemplate.getForObject(url, NameResponse.class);
		return response;
	}
}
