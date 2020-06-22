package com.example.caveatemptor;

import com.example.caveatemptor.models.*;
import com.example.caveatemptor.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import static com.example.caveatemptor.models.Address.AddressType.home;
import static com.example.caveatemptor.models.Address.AddressType.billing;
import static com.example.caveatemptor.models.Address.AddressType.shipping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class CaveatemptorApplication {

	private static final Logger log = LoggerFactory.getLogger(CaveatemptorApplication.class);

	public enum AddressType {home, billing, shipping}

	public static void main(String[] args) {
		SpringApplication.run(CaveatemptorApplication.class, args);
	}

	/*
	@Bean
	public CommandLineRunner demo(CategoryRepository categoryRepository, ItemsRepository itemsRepository, AddressRepository addressRepository, BankAccountRepository bankAccountRepository, CreditCardRepository creditcardRepository, ImageRepository imageRepository, UsersRepository userRepository) {

		return (args) -> {
			//userRepository.save(new Users("Olka", "Ola", "Róża", Users.UserType.SELLER));
			//Users users = userRepository.findByuserName("Olka");
			//Category categoryKsiazki = categoryRepository.findBynameCategory("Książki");

			//itemsRepository.save(new Items(categoryKsiazki, "Ałbena Grabowska Stulecie Winnych (trylogia)", BigDecimal.valueOf(30.000), Date.valueOf("2020-06-20"), users));
			//itemsRepository.save(new Items(categoryKsiazki, "Austen Jane Duma i uprzedzenie", BigDecimal.valueOf(90.000), Date.valueOf("2020-06-23"), users));
			//itemsRepository.save(new Items(categoryKsiazki, "Platforma Houellebecq Michel", BigDecimal.valueOf(7.000), Date.valueOf("20-06-24"), users));
			//itemsRepository.save(new Items(categoryKsiazki, "Aciman Andre Tamte dni, tamte noce", BigDecimal.valueOf(9.000), Date.valueOf("20-06-25"), users));
			//itemsRepository.save(new Items(categoryKsiazki, "Grynberg Mikołaj Poufne", BigDecimal.valueOf(7.000), Date.valueOf("20-06-24"), users));
			//itemsRepository.save(new Items(categoryKsiazki, "Alcott Louisa May Mali mężczyźni", BigDecimal.valueOf(9.000), Date.valueOf("20-06-25"), users));

			//categoryRepository.save(new Category("Książki"));

			/*log.info("User: ");
			//log.info(users.toString());

			/*creditcardRepository.save(new CreditCard("2526 0000 0003 1485", "25/", "2021", users));
			bankAccountRepository.save(new BankAccount("10 2526 0000 0003 1485 25", "Jbank", " PL 10 2526 0000 0003 1485 25", users));


			addressRepository.save(new Address(users, "ul. Drobnera 12/24", "50-588", "Wrocław", home));
			addressRepository.save(new Address(users, "ul. Sienkiewicza 10/12", "50-568", "Wrocław", billing));
			addressRepository.save(new Address(users, "ul. Ruśka 4/5", "50-511", "Wrocław", shipping));*/


			//categoryRepository.save(new Category("Obrazy"));
			//categoryRepository.save(new Category("Książki"));

			//Category categoryObrazy = categoryRepository.findBynameCategory("Obrazy");
			//Category categoryKsiazki = categoryRepository.findBynameCategory("Książki");

			/*log.info("Category: ");
			log.info(categoryKsiazki.toString());
			log.info(categoryObrazy.toString());

			itemsRepository.save(new Items(categoryObrazy, "Tadeusz Styka LWY. KRÓLEWSKA PARA", BigDecimal.valueOf(30.000), Date.valueOf("2020-06-20"), users));
			itemsRepository.save(new Items(categoryObrazy, "Teodor Axentowicz PANI Z WACHLARZEM", BigDecimal.valueOf(90.000), Date.valueOf("2020-06-23"), users));*/
			/*itemsRepository.save(new Items(categoryObrazy, "Rudolf Kaesbach ŁUCZNIK", BigDecimal.valueOf(7.000), Date.valueOf("20-06-24"), users));
			itemsRepository.save(new Items(categoryObrazy, "Piotr Stachiewicz DZIEWCZYNA W ZAWOJU", BigDecimal.valueOf(9.000), Date.valueOf("20-06-25"), users));*/

				//itemsRepository.save(new Items(categoryKsiazki, "Ałbena Grabowska Stulecie Winnych (trylogia)", BigDecimal.valueOf(30.000), Date.valueOf("2020-06-20"), users));
				/*itemsRepository.save(new Items(categoryKsiazki, "Austen Jane Duma i uprzedzenie", BigDecimal.valueOf(90.000), Date.valueOf("2020-06-23"), users));
				itemsRepository.save(new Items(categoryKsiazki, "Platforma Houellebecq Michel", BigDecimal.valueOf(7.000), Date.valueOf("20-06-24"), users));
				itemsRepository.save(new Items(categoryKsiazki, "Aciman Andre Tamte dni, tamte noce", BigDecimal.valueOf(9.000), Date.valueOf("20-06-25"), users));
				itemsRepository.save(new Items(categoryKsiazki, "Grynberg Mikołaj Poufne", BigDecimal.valueOf(7.000), Date.valueOf("20-06-24"), users));
				itemsRepository.save(new Items(categoryKsiazki, "Alcott Louisa May Mali mężczyźni", BigDecimal.valueOf(9.000), Date.valueOf("20-06-25"), users));*/

			// fetch all customers

			/*
			log.info("User: ");
			log.info(users.toString());

			log.info("\n Items findBy:");
			log.info("-------------------------------");
			for (Items items : itemsRepository.findAll()) {
				log.info(items.toString());
			}
			log.info("");

		};
	}*/
}



