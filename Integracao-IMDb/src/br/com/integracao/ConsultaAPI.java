package br.com.integracao;

import br.com.alura.omnistream.service.json.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;
import java.io.InputStream;


public class ConsultaAPI {
	public static void getFilmes () throws Exception
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
				GeradorFigurinhas figurinha = new GeradorFigurinhas();
				estrelas = Float.valueOf(filme.get("imDbRating"));
				String urlImagem = filme.get("image"); 
				String titulo = filme.get("title");

				InputStream inputStream = new URL(urlImagem).openStream();
            	
				//String nomeArquivo = titulo + ".png";
            	String nomeArquivo = titulo.replace(":","-") + ".png";

				figurinha.criar(inputStream, nomeArquivo);

				for (int i = 0; i < estrelas; i++) {
					estrelaIcon += "⭐ ";
				}

				if (estrelas < 8.1) {
					cor = "\u001b[31m";
				} else {
					cor = "\u001b[34m";
				}
				
				System.out.println("\u001b[44;1m" + filme.get("title")+ "\u001b[0m");
				System.out.println("\u001b[1mAno: \u001b[0m" +filme.get("year") );
				System.out.println("\u001b[1mAvaliação:\u001b[0m " + cor + estrelas  +"(" + estrelaIcon + ")" ); 
				//System.out.println("\u001b[0mCapa: " + filme.get("image"));
				System.out.println("----------------------------------------------------------------------------------------");

				System.out.println();
				estrelaIcon = "";
			}
	}
}
