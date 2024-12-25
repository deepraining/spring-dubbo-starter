package dr.sds.user.main;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication(scanBasePackages = {"dr.sds"})
@EnableDubbo
public class App {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(App.class, args);
    String serverPort = context.getEnvironment().getProperty("server.port");
    log.info("App started at http://127.0.0.1:" + serverPort);
  }
}
