package com.svbabaya.edms;

import com.svbabaya.edms.models.DocTitle;
import com.svbabaya.edms.models.Document;
import com.svbabaya.edms.services.DocumentService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
		mapper.getConfiguration().setSkipNullEnabled(true);
		return mapper;
	}

	@Bean
	public CommandLineRunner demo (DocumentService docService) {
		return  (args) -> {
			Document doc1 = Document.builder()
				.number("230")
				.docTitle(DocTitle.CONTRACT)
				.build();

			Document doc2 = Document.builder()
				.number("240")
				.docTitle(DocTitle.APPLICATION)
				.build();

			Document doc3 = Document.builder()
				.number("250")
				.docTitle(DocTitle.REFERENCE)
				.build();

			docService.create(doc1);
			docService.create(doc2);
			docService.create(doc3);

			System.out.println("-----List of documents-----");

			if (docService.findAll().isEmpty()) {
				System.out.println("Empty");
			} else {
				for (Document doc : docService.findAll()) {
					System.out.println("Document detail: " + doc.toString());
				}
			}
		};
	}
}
