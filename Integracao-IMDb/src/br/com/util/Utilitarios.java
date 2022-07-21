package br.com.util;

import java.io.IOException;

public class Utilitarios {
    public static void ClearConsole() throws InterruptedException, IOException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
