package com.leopard.moredb;

import com.leopard.moredb.config.DynamicDataSourceRegister;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import tk.mybatis.spring.annotation.MapperScan;

@Import(DynamicDataSourceRegister.class)
@SpringBootApplication(scanBasePackages = {"com.leopard.moredb"})
@MapperScan(basePackages = {"com.leopard.moredb.dao.mapper"})
@Slf4j
public class SourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SourceApplication.class, args);
    }

}
