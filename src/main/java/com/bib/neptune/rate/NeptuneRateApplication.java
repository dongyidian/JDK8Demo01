package com.bib.neptune.rate;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.net.InetAddress;

@EnableAsync
@EnableDiscoveryClient
@EnableCaching
@EnableScheduling
@SpringBootApplication(scanBasePackages = {
        "com.bib.neptune.*",
})
@Slf4j
public class NeptuneRateApplication {
    @SneakyThrows
    public static void main(String[] args) {

        ConfigurableApplicationContext application = SpringApplication.run(NeptuneRateApplication.class, args);
        Environment env = application.getEnvironment();
        log.info("JDK8Demo01 successStart 启动成功");
        log.info("\n----------------------------------------------------------\n\t" +
                        "Application '{}' is running! Access URL:\n\t" +
                        "Doc: \thttp://{}:{}/doc.html\n" +
                        "----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"));
    }

}
