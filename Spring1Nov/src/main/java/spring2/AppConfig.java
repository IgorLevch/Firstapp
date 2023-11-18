package spring2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@Configuration
public class AppConfig {

    @Bean  // из объекта сделан спринговый Бин, т.е. при старте контекста, все компоненты станут Бинами
    // данный способ используется , если объект не нашего класса. Тогда в конфиг. классе создаем метод и ставим аннотацию Бин
    // если же весь класс наш, то ставим аннотацию Component над классом.
    public FileOutputStream fileOut() throws FileNotFoundException {
        return new FileOutputStream("2.txt");
    }

}
