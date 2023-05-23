package com.svbabaya.edms;

import com.svbabaya.edms.models.*;
import com.svbabaya.edms.services.DocTemplateService;
import com.svbabaya.edms.services.DocumentService;
import lombok.Builder;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

import static org.modelmapper.config.Configuration.AccessLevel.PRIVATE;

@SpringBootApplication
public class DocSystemApplication {

	private static final Logger log =
			LoggerFactory.getLogger(DocSystemApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DocSystemApplication.class, args);

	}

	@Bean
	ModelMapper modelMapper() {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration()
				.setMatchingStrategy(MatchingStrategies.STRICT)
				.setFieldMatchingEnabled(true)
				.setSkipNullEnabled(true)
				.setFieldAccessLevel(PRIVATE);
		return mapper;
	}

	@Bean
	public CommandLineRunner demo (DocumentService docService) {
		return  (args) -> {

			// ***** Contractor *****

//			Contractor CoolCompany = Contractor.builder()
//					.firstName("Tom").patronymic("Jasper").lastName("Cat").country("US")
//					.phone("000-555-000").email("tom@cat.org").telegram("@tomcat")
//					.documents(Collections.singletonList(null))
//					.build();

			// ***** File *****

			DocFile cFile = DocFile.builder()
					.name("contract_001_cool_company.pdf").store("abc://DocServer/cool_company")
					.size(2566678L).mimetype(Mimetype.PDF).description("Contract 001 with cool_company")
					.build();

			// ***** Fields *****

			DocField fContractHeader = DocField.builder()
					.name("Header").type("Header of contract").defaultValue("Text of header").placeholder("Change if you need")
					.build();

			DocField fContractBody = DocField.builder()
					.name("Body").type("Body of contract").defaultValue("Text of contract").placeholder("Change if you need")
					.build();

			DocField fContractFooter = DocField.builder()
					.name("Footer").type("Footer of contract").defaultValue("Text of footer").placeholder("Change if you need")
					.build();

			// ***** Template *****

			DocTemplate tContract = DocTemplate.builder()
					.title("Template One for contract").version("Version 1.0").docTitle(DocTitle.CONTRACT)
					.build();

			// ***** Document *****

			Document doc = Document.builder()
				.number("230").docTitle(DocTitle.CONTRACT)
					.template(tContract)
					.file(cFile)
					.fields(Arrays.asList(fContractHeader, fContractBody, fContractFooter))
					.contractors(Collections.singletonList(Contractor.builder()
							.firstName("Tom").patronymic("Jasper").lastName("Cat").country("US")
							.phone("000-555-000").email("tom@cat.org").telegram("@tomcat")
							.build()))
					.build();

			docService.create(doc);

		};
	}
}
