package com.ourfirstapp.first_spring_app;

import com.ourfirstapp.first_spring_app.model.Address;
import com.ourfirstapp.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("Hello Dev");

		//Tight coupling
//		Employee e = new Employee();
//		e.id=123;
//		e.Name="Dev";
//		e.Email="dev@";
//
//		Address a = new Address();
//		a.city="Guntur";
//		a.place="Ap";
//		a.pincode=522661;
//
//		e.address=a;
//		System.out.println(e);
//		System.out.println(a);


		//Loose Coupling

		Employee e = new Employee();
		e.setName("Raj");
		e.setId(123);
		e.setEmail("set@");


		Address a = new Address();
		a.setCity("gnt");
		a.setPlace("Ap");
		a.setPincode(522661);

		e.setAddress(a);

		System.out.println(e);
		System.out.println(a);

		//Changing address through employee

		e.getAddress().setCity("Hyd");
		e.getAddress().setPincode(520001);
		e.getAddress().setPlace("Telg");

		System.out.println(e);

		Address a1 = new Address("gnt","Ap",522661);
		Employee e1 = new Employee(124,"revi","rak@",a1);
		System.out.println(e1);

	}

}
