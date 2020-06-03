package in.maankibaat.maankibaat.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@Data
@RefreshScope
@ConfigurationProperties("application")
public class ServiceProperties {

    String dbURL;
}
