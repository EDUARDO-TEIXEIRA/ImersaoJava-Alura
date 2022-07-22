![image](https://user-images.githubusercontent.com/34588048/180493021-80b45e04-29c3-4928-9f48-809deecd4c59.png)


<div align="center">
<h1>PROJETO ALURA STICKERS 😉</h1>
<h4>DESENVOLVIDO POR EDUARDO TEIXEIRA</h4> <br/>
</div>

A **imersão java** aconteceu entre os dias <span style="color:#ffae00">18/07 a 22/07</span> gratuito pelo Youtube, além disto a Alura disponibilizou uma comunidade via discord para os participantes do evento e isto ajudou muito no apoio as dúvidas. Veja este e outros repositórios através do grupo. Agradeço aos instrutores que foram por esta oportunidade em aprender cada vez a utilizar o **#Java** 

<hr/>

<img src="https://user-images.githubusercontent.com/34588048/180492701-baaf033c-76b2-467d-95dd-7b8ee44e79d7.png"/>

 


📒 O detalhamento de todas as aulas estão separadas por pastas neste diretório.  
 <div align="center">
<table>
    <tr><th colspan="2">📚 Conteúdos</th></tr>
<tr>
    <th>Aula</th>
    <th>Descrição</th>
</tr>
<tr>
  <td><a href="https://github.com/EDUARDO-TEIXEIRA/ImersaoJava-Alura/tree/main/Aula%2001">01</a></td>
  <td>Consumir uma API que retorna uma ranking de lista de filmes do IMDb</td>
</tr>
<tr> 
  <td><a href="https://github.com/EDUARDO-TEIXEIRA/ImersaoJava-Alura/tree/main/Aula02">02</a></td>
  <td>Gerando figurinhas para WhatsApp</td>
</tr>
<tr>
  <td>03</td>
  <td>Ligando as pontas, refatoração e orientação a objetos</td>
</tr>
<tr>
  <td>04</td>
  <td>Criando nossa própria API com Spring</td>
</tr>
<tr>
  <td>05</td>
  <td>Publicando nossa API no Cloud</td>
</tr>
</table>

</div>


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
     <td align="center">✅</td>
</tr>
<tr><td>3.  Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente.</td>
     <td>⭐</td>
     <td align="center">✅</td>
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

![image](https://user-images.githubusercontent.com/34588048/180119733-cc4633d0-06ed-45c0-a186-a56e9576be1c.png)

![Código-Java](https://user-images.githubusercontent.com/34588048/179870714-f85d0ce4-4006-4f8a-8c18-7a721fde137b.png)

![Resposta-JSON](https://user-images.githubusercontent.com/34588048/179870902-1114133b-27e7-46f0-875f-03e9f0c2e0d1.png)

####  :green_book: DOCUMENTAÇÃO
- Artigo na Alura [“O que é JSON?”](https://www.alura.com.br/artigos/o-que-e-json).
- [Documentação](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html) da classe HttpRequest do pacote java.net.http.
- [Site](https://regex101.com/) que ajuda a entender Expressões Regulares.

#### :mag_right: REFERÊNCIAS 


### 🗒️ INTRODUÇÃO 
Exportar as imagens contidas na API para um diretório externos e com isto customizar as figurinhas para o WhatsApp
<table>
<tr>
  <th>Desafio</th>
  <th>Nível de dificuldade</th>
  <th>Realizado?</th>
</tr>
  <tr><td>1. Ler a documentação da classe abstrata InputStream.></td>
      <td>⭐</td>
     <td align="center">✅</td>
</tr>
<tr><td>2. Centralizar o texto na figurinha.</td>
     <td>⭐⭐</td>
     <td align="center">❌</td>
</tr>
<tr><td>3. Fazer um pacote no Whatsapp e/ou Telegram com as suas próprias figurinhas!</td>
     <td>⭐⭐⭐</td>
     <td align="center">❌</td>
 </tr>
<tr><td>4. Criar diretório de saída das imagens, se ainda não existir.</td>
     <td>⭐</td>
     <td align="center">❌</td>
 </tr>
<tr><td>5. Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes.</td>
     <td>⭐</td>
     <td align="center">❌</td>
 </tr>
<tr><td>6. Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha!</td>
     <td>⭐</td>
     <td align="center">❌</td>
 </tr>
<tr><td>7. Colocar contorno (outline) no texto da imagem.</td>
     <td>⭐</td>
     <td align="center">❌</td>
 </tr>
<tr><td>8. Tratar as imagens retornadas pela API do IMDB para pegar uma imagem maior ao invés dos thumbnails. Opções: pegar a URL da imagem e remover o trecho mostrado durante a 9. aula ou consumir o endpoint de posters da API do IMDB (mais trabalhoso), tratando o JSON retornado.</td>
     <td>⭐</td>
     <td align="center">❌</td>
 </tr>
<tr><td>10. Fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.</td>
     <td>⭐⭐</td>
     <td align="center">❌</td>
 </tr>
<tr><td>11. Desafio supremo: usar alguma biblioteca de manipulação de imagens como OpenCV pra extrair imagem principal e contorná-la.</td>
     <td>⭐⭐⭐⭐</td>
     <td align="center">❌</td>
 </tr>

</table>

#### 📖 RESULTADOS DOS DESAFIOS
```java
System.out.printLn("Hello World");
```

<!--
<div align="center">
    <p>Baixar aulas</p><a href="https://t.me/ImersaoJavaAlura" target="_blank"><img alt="aulas-gravadas" src="https://badgen.net/badge/icon/telegram?icon=telegram&label"></a>
</div>
-->
