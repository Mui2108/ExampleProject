package com.example.demo;

import java.time.LocalDateTime;
import java.util.stream.Stream;

import com.example.demo.Entity.*;
import com.example.demo.Repository.*;


import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ApplicationRunner init(AddressRepository addressRepository,CarRepository carRepository,Category1Repository category1Repository,
	Category2Repository category2Repository,Category3Repository category3Repository,CodeRepository codeRepository,CompanyOrderRepository companyOrderRepository,
	DetailRepository detailRepository,OrderDetailRepository orderDetailRepository,ProductRepository productRepository,ProductGradeRepository productGradeRepository,
	ProductStoreRepository productStoreRepository){
		return args -> {
			Address add = new Address();
			add.setAddress("123/1");
			add.setProvince("นครราชสีมา");
			add.setDistrict("เมืองนครราชสีมา");
			add.setSubdistrict("สุรนารี");
			addressRepository.save(add);

			Address add2 = new Address();
			add2.setAddress("147 หมู่");
			add2.setProvince("นครพนม");
			add2.setDistrict("ศรีสงคราม");
			add2.setSubdistrict("บ้านเอื้อง");
			addressRepository.save(add2);

			Car car = new Car();
			car.setBrand("YAMAHA");
			car.setGeneration("xsr155");
			carRepository.save(car);

			Car car2 = new Car();
			car2.setBrand("BMW");
			car2.setGeneration("320d M");
			carRepository.save(car2);

			ProductStore proS = new ProductStore();
			proS.setLocker("13");
			proS.setZone("A");
			proS.setName("A12");
			productStoreRepository.save(proS);

			ProductStore proS2 = new ProductStore();
			proS2.setLocker("13");
			proS2.setZone("A");
			proS2.setName("A12");
			productStoreRepository.save(proS2);

			ProductGrade proG = new ProductGrade();
			proG.setGrade("แท้");
			productGradeRepository.save(proG);

			ProductGrade proG2 = new ProductGrade();
			proG2.setGrade("เทียบเท่า");
			productGradeRepository.save(proG2);

			ProductGrade proG3 = new ProductGrade();
			proG3.setGrade("ทั่วไป");
			productGradeRepository.save(proG3);

			Category1 c11 = new Category1();
			c11.setName("ใส้กรอง");
			category1Repository.save(c11);
			
			Category1 c12 = new Category1();
			c12.setName("สายพาน");
			category1Repository.save(c12);

			
			Category2 c21 = new Category2();
			Category1 cat21 = category1Repository.findById(1);
			c21.setName("รถยนต์");
			c21.setCategory1(cat21);
			category2Repository.save(c21);

			Category2 c22 = new Category2();
			Category1 cat22 = category1Repository.findById(1);
			c22.setName("จักรยานยนต์");
			c22.setCategory1(cat22);
			category2Repository.save(c22);

			Category2 c23 = new Category2();
			Category1 cat23 = category1Repository.findById(2);
			c23.setName("รถยนต์");
			c23.setCategory1(cat23);
			category2Repository.save(c23);

			Category2 c24 = new Category2();
			Category1 cat24 = category1Repository.findById(2);
			c24.setName("จักรยานยนต์");
			c24.setCategory1(cat24);
			category2Repository.save(c24);

			Category3 c31 = new Category3();
			Category2 cat31 = category2Repository.findById(1);
			c31.setName("เล็ก");
			c31.setCategory2(cat31);
			category3Repository.save(c31);

			Category3 c32 = new Category3();
			Category2 cat32 = category2Repository.findById(1);
			c32.setName("ใหญ่");
			c32.setCategory2(cat32);
			category3Repository.save(c32);

			Category3 c33 = new Category3();
			Category2 cat33 = category2Repository.findById(2);
			c33.setName("เล็ก");
			c33.setCategory2(cat33);
			category3Repository.save(c33);

			Category3 c34 = new Category3();
			Category2 cat34 = category2Repository.findById(2);
			c34.setName("ใหญ่");
			c34.setCategory2(cat34);
			category3Repository.save(c34);

			Category3 c35 = new Category3();
			Category2 cat35 = category2Repository.findById(3);
			c35.setName("สายพานวี");
			c35.setCategory2(cat35);
			category3Repository.save(c35);

			Category3 c36 = new Category3();
			Category2 cat36 = category2Repository.findById(3);
			c36.setName("สายพานไทม์มิ่ง");
			c36.setCategory2(cat36);
			category3Repository.save(c36);

			Category3 c37 = new Category3();
			Category2 cat37 = category2Repository.findById(4);
			c37.setName("สายพานวี");
			c37.setCategory2(cat37);
			category3Repository.save(c37);

			Category3 c38 = new Category3();
			Category2 cat38 = category2Repository.findById(4);
			c38.setName("สายพานไทม์มิ่ง");
			c38.setCategory2(cat36);
			category3Repository.save(c38);

			Detail de1 = new Detail();
			Car carD = carRepository.findById(1);
			Category1 catD = category1Repository.findById(1);
			ProductStore proSD = productStoreRepository.findById(1);
			de1.setNote("ใส่รายละเอียดตามใจชอบเลย");
			de1.setCar(carD);
			de1.setCategory1(catD);
			de1.setProductStore(proSD);
			detailRepository.save(de1);

			Detail de2 = new Detail();
			Car carD2 = carRepository.findById(1);
			Category1 catD2 = category1Repository.findById(1);
			ProductStore proSD2 = productStoreRepository.findById(1);
			de2.setNote("ใส่รายละเอียดตามใจชอบเลย");
			de2.setCar(carD2);
			de2.setCategory1(catD2);
			de2.setProductStore(proSD2);
			detailRepository.save(de2);


			Code co1 = new Code();
			co1.setBarcode("A2345678");
			co1.setQrcode("A2345678");
			codeRepository.save(co1);

			Code co2 = new Code();
			co2.setBarcode("A2345674");
			co2.setQrcode("A2345674");
			codeRepository.save(co2);

			CompanyOrder comOr = new CompanyOrder();
			Address addC = addressRepository.findById(2);
			comOr.setEmail("mooy21mooy@gmail.com");
			comOr.setInitial("MC");
			comOr.setName("MuiCompany");
			comOr.setName_sell("Panupong Inatring");
			comOr.setPhone("0640484796");
			comOr.setTax_number("1234567890");
			comOr.setAddress(addC);
			companyOrderRepository.save(comOr);
			
			Product pro = new Product();
			Code codP = codeRepository.findById(1);
			Detail dt = detailRepository.findById(1);
			ProductGrade pg = productGradeRepository.findById(1);
			pro.setCode_product("G001234");
			pro.setName_product("ใส้กรอง Kubota");
			pro.setPrice_sell(650);
			pro.setUnit("กล่อง");
			pro.setCode(codP);
			pro.setDetail(dt);
			pro.setProductGrade(pg);
			productRepository.save(pro);

			Product pro2 = new Product();
			Code codP2 = codeRepository.findById(2);
			Detail dt2 = detailRepository.findById(1);
			ProductGrade pg2 = productGradeRepository.findById(1);
			pro2.setCode_product("G001235");
			pro2.setName_product("ใส้กรอง honda");
			pro2.setPrice_sell(700);
			pro2.setUnit("กล่อง");
			pro2.setCode(codP2);
			pro2.setDetail(dt2);
			pro2.setProductGrade(pg2);
			productRepository.save(pro2);

			OrderDetail ode = new OrderDetail();
			CompanyOrder cmo = companyOrderRepository.findById(1);
			Product pdo = productRepository.findById(1);
			LocalDateTime rentDate = LocalDateTime.now();
			ode.setDate(rentDate);
			ode.setCompanyOrder(cmo);
			ode.setProduct(pdo);
			ode.setNumber(1);
			orderDetailRepository.save(ode);
	
		};

	}
}

