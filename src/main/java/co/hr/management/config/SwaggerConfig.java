package co.hr.management.config;

import java.util.Set;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.paths.RelativePathProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = Set.of(
            "application/json"
    );
	
	@Value("${server.servlet.context-path}")
	private String basePath;
	
	@Bean
	public Docket api(ServletContext servletContext) {
		return new Docket(DocumentationType.SWAGGER_2)
				.pathProvider(new RelativePathProvider(servletContext) {
                    @Override
                    public String getApplicationBasePath() {
                        return basePath;
                    }
                })
				.produces(DEFAULT_PRODUCES_AND_CONSUMES)
				.consumes(DEFAULT_PRODUCES_AND_CONSUMES)
				.select()
				.apis(RequestHandlerSelectors.basePackage("co.hr.management.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(metaData());
	}
	
	private ApiInfo metaData() {
		Contact contact = new Contact("TestFikri", "https://", "");

		return new ApiInfoBuilder().title("HrManagement API")
				.description("HrManagement API Service")
				.version("1.0.0")
				.license("Apache License Version 2.0")
				.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
				.contact(contact)
				.build();
	}

}
