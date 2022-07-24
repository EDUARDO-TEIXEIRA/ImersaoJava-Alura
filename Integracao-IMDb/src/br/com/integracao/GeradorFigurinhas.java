package br.com.integracao;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.CyclicBarrier;

import javax.imageio.ImageIO;


public class GeradorFigurinhas {
    public void criar(InputStream inputStream, String nomeArquivo) throws Exception
    {
        // Ler uma imagem
        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        // Dimensões da imagem
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        
        // Carrega a nova dimensionada na memória com transparência 
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT); 
        
        // copiar a image original para nova imagem
        
        // Escrever uma frase na imagem

        
        // Salvar em um diretório
        ImageIO.write(novaImagem, ".png", new File(nomeArquivo) {
            
        });
    }
}
