package com.example.mavendemo01.HuanJinQieHuan;

import com.example.mavendemo01.HuanJinQieHuan.DBConnector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration//标识当前类是自定义配置类
@Profile("dev")
public class DevDBConnector implements DBConnector {

    @Override
    public String config() {
        return "这个是开发环境";
    }
}
