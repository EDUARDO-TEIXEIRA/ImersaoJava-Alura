package br.com.integracao;

import br.com.alura.omnistream.service.json.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class ConsultaAPI {
	public static void getFilmes () throws IOException, InterruptedException
	{
		float estrelas;
		String cor; 
		String estrelaIcon = "";

		String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
		URI endereco = URI.create(url);
		HttpClient client = HttpClient.newHttpClient();
		// Request do client ao servidor e obtendo o endereço
		HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		String body = response.body();
		
		var parser = new JsonParser();

		InterfaceMenu.MenuFilmes();

		List<Map<String, String>> listaFilmes = parser.parse(body);
			for (Map<String, String> filme : listaFilmes) 
			{
				estrelas = Float.valueOf(filme.get("imDbRating"));

				for (int i = 0; i < estrelas; i++) {
					estrelaIcon += "⭐ ";
				}

				if (estrelas < 8.1) {
					cor = "\u001b[31m";
				} else {
					cor = "\u001b[34m";
				}
				
				System.out.println("\u001b[1m" + filme.get("title"));
				System.out.println("Ano: \u001b[0m" +filme.get("year"));
				System.out.println("\u001b[1mAvaliação:\u001b[0m " + cor + estrelas  +"(" + estrelaIcon + ")" ); 

				System.out.println("\u001b[0m----------------------------------------------------------------------------------------");

				System.out.println();
				estrelaIcon = "";
			}
	}
}
