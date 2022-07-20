
### 🗒️ DESCRIÇÃO
O projeto consiste em acessar uma API coletando o ranking dos top 250 filmes mais vistos do IMDb retornando em uma lista. 

#### ACESSANDO UM ENDPOINT
```java
String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
```
[Classe](https://gist.github.com/alexandreaquiles/cf337d3bcb59dd790ed2b08a0a4db7a3) de conversão para converter o Json em string: 

#### DESAFIOS DA AULA
<table>
<tr>
  <th>Desafio</th>
  <th>Nível de dificuldade</th>
  <th>Realizado?</th>
</tr>
  <tr><td>1. Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.></td>
      <td>⭐</td>
     <td align="center">✅</td>
</tr>
<tr><td>2. Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais!</td>
     <td>⭐⭐</td>
     <td align="center">❌</td>
</tr>
<tr><td>3.  Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente.</td>
     <td>⭐</td>
     <td align="center">❌</td>
 </tr>
<tr><td>4. Mudar o JsonParser para usar uma biblioteca de parsing de JSON como Jackson ou GSON.</td>
     <td>⭐⭐</td>
     <td align="center">❌</td>
 </tr>
<tr><td>5. Desafio supremo: criar alguma maneira para você dar uma avaliação ao filme, puxando de algum arquivo de configuração OU pedindo a avaliação para o usuário digitar no terminal.</td>
     <td>⭐⭐⭐⭐</td>
     <td align="center">❌</td>
 </tr>

</table>
<h4>📖 RESULTADO DOS DESAFIOS</h4>

![Código-Java](https://user-images.githubusercontent.com/34588048/179870714-f85d0ce4-4006-4f8a-8c18-7a721fde137b.png)

![Resposta-JSON](https://user-images.githubusercontent.com/34588048/179870902-1114133b-27e7-46f0-875f-03e9f0c2e0d1.png)

#### DOCUMENTAÇÃO
- Artigo na Alura [“O que é JSON?”](https://www.alura.com.br/artigos/o-que-e-json).
- [Documentação](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html) da classe HttpRequest do pacote java.net.http.
- [Site](https://regex101.com/) que ajuda a entender Expressões Regulares.
