package br.com.integracao;

import br.com.alura.omnistream.service.json.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class Principal {

	public static void main(String[] args) throws Exception {
		String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
		URI endereco = URI.create(url);
		HttpClient client = HttpClient.newHttpClient();
		// Request do client ao servidor e obtendo o endereço
		HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		String body = response.body();
		
		var parser = new JsonParser();
		List<Map<String, String>> listaFilmes = parser.parse(body);
		for (Map<String, String> filme : listaFilmes) {
			System.out.println(filme.get("title"));
			System.out.println(filme.get("image"));
			System.out.println(filme.get("imDbRating"));
			System.out.println();
		}

	}

}
