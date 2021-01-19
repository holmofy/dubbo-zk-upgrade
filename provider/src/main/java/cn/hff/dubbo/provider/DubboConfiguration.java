package cn.hff.dubbo.provider;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfiguration {

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-provider");
        applicationConfig.setOrganization("darcytech");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig oldRegistryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://localhost:12181");
        // dubbo支持zkclient和curator两个客户端，zkclient就类似mybatis，curator类似hibernate
        registryConfig.setClient("zkclient");
        return registryConfig;
    }

    @Bean
    public RegistryConfig newRegistryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://localhost:22181");
        // dubbo支持zkclient和curator两个客户端，zkclient就类似mybatis，curator类似hibernate
        registryConfig.setClient("zkclient");
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;
    }

}
