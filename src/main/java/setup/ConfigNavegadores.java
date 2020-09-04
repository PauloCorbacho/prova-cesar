package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.concurrent.TimeUnit;

public class ConfigNavegadores {
    public static WebDriver driver;
    private static ListaDeNavegadores.ListaNavegadores listaNavegadores;
    private static ListaDeSistemasOperacionais.ListaSistemaOperacional listaSistemaOperacional;

    public static WebDriver obterDriver(ListaDeNavegadores.ListaNavegadores navegadores, ListaDeSistemasOperacionais.ListaSistemaOperacional so) throws Exception {
        listaNavegadores = navegadores;
        listaSistemaOperacional = so;
        if (so == ListaDeSistemasOperacionais.ListaSistemaOperacional.WINDOWS) {
            switch (navegadores) {
                case FIREFOX:
                    System.setProperty("webdriver.gecko.driver", "...");
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    break;
                case CHROME:
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/driversWindows/chromedriver.exe");
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    break;

                case IE:
                    System.setProperty("webdriver.ie.driver", "....");
                    driver = new InternetExplorerDriver();
                    break;
                default:
                    System.out.println("browser : " + listaNavegadores + " nevegador não encontrado, usaremos o Firefox para rodar os testes!");
                    driver = new FirefoxDriver();
            }
            return driver;
        }

        if (so == ListaDeSistemasOperacionais.ListaSistemaOperacional.LINUX) {
            switch (navegadores) {
                case FIREFOX:
                    System.setProperty("webdriver.gecko.driver", "....");
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    break;
                case CHROME:
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/driversLinux/chromedriver.exe");
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    break;

                case IE:
                    System.setProperty("webdriver.ie.driver", "...");
                    driver = new InternetExplorerDriver();
                    break;
                default:
                    System.out.println("browser : " + listaNavegadores + " nevegador não encontrado, usaremos o Firefox para rodar os testes!");
                    driver = new FirefoxDriver();
            }
            return driver;
        }
        if (so == ListaDeSistemasOperacionais.ListaSistemaOperacional.MACOS) {
            switch (listaNavegadores) {
                case FIREFOX:
                    System.setProperty("webdriver.gecko.driver", "...");
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    break;
                case CHROME:
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/driversMacOs/chromedriver.exe");
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    break;

                case IE:
                    System.setProperty("webdriver.ie.driver", "...");
                    driver = new InternetExplorerDriver();
                    break;
                default:
                    System.out.println("browser : " + listaNavegadores + " nevegador não encontrado, usaremos o Firefox para rodar os testes!");
                    driver = new FirefoxDriver();
            }
        }
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        return driver;
    }
}
