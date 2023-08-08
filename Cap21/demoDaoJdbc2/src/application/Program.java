package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoImplJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SellerDao sellerdao = DaoFactory.createSellerDao();
		System.out.println("==== TEST 1: seller findbyId ====\n");
		Seller seller = sellerdao.findById(1);
		
		System.out.println(seller);
		
		System.out.println("==== TEST 2: seller findbyDepartment ====\n");
		Department department = new Department(2,null);
		List<Seller> list = sellerdao.findByDepartment(department);
		for (Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("==== TEST 3: seller findAll ====\n");
		list = sellerdao.findAll();
		for (Seller obj: list) {
			System.out.println(obj);
		}
	
	System.out.println("==== TEST 4: seller Update ====\n");
	Seller newSeller = new Seller(null,"Luan Rodrigues","LuanBarroso@gmail.com",new Date(),3200.0,department);
	sellerdao.insert(newSeller);
	System.out.println("Inserted! new id = " + newSeller.getId());
	
	System.out.println("==== TEST 5: seller update ====\n");
	seller = sellerdao.findById(1);
	seller.setName("Martha waine");
	sellerdao.update(seller);
	System.out.println("Update completed! ");
	System.out.println(seller);
	
	System.out.println("==== TEST 6: seller delete ====\n");
	System.out.println("Enter a id: ");
	int id = sc.nextInt();
	sellerdao.DeleteById(id);
	}
	
}
