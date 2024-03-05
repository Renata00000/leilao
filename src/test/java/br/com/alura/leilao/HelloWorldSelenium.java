package br.com.alura.leilao;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium {

    @Test
    public void hello() {
        // passando o caminho do meu driver para o selenium
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        // abrir o navegador chrome
        WebDriver browser = new ChromeDriver();
        // nessa pagina
        browser.navigate().to("http://localhost:8080/leiloes");
        // fechar janela
        browser.quit();

        // COMANDO PARA DEIXAR O DRIVER EXECUTAVEL. APENAS PARA MAC E LINUX (chmod +x chromedriver)
    }

}
