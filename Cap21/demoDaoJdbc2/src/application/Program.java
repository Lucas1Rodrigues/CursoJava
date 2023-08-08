package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoImplJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
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
	}

}
