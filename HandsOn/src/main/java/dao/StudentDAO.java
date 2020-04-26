/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import domain.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author Derek Zou
 */
public class StudentDAO {
    private static final Map<String, student> accounts = new TreeMap<>();

	/*
	 * Some dummy data for testing
	 */
	static {
		if (accounts.isEmpty()) {
			accounts.put("test1", new student_account( "test1","Green","Widget","test1-high school","male" ));
                        accounts.put("test2", new student_account( "test2","Yellow","Widgets","test2-high school","female" ));
		}
	}

	/**
	 * Gets all Account
	 *
	 * @return All accounts ordered by ID.
	 */
	public List<student_account> getAll() {
		return new ArrayList<>(accounts.values());
	}

	/**
	 * Adds a account to the accounts.
	 *
	 * @param  The accounts being added.
	 */
	public void create(student_account account) {
		accounts.put(account.getEmail(), account);
	}

	/**
	 * Gets a single accounts that matches the given ID.
	 *
	 * @param id The ID to search for.
	 * @return The accounts matching the given ID, or null if no match found.
	 */
	public student_account getById(String id) {
		return accounts.get(id);
	}

        //testing
        public student_account geyByEmail(String email){
            return null;
        }
        
	/**
	 * Deletes a accounts.
	 *
	 * @param id The ID of the product to delete.
	 */
	public void delete(String id) {
		accounts.remove(id);
	}

	/**
	 * Updates a product (effectively replaces it).
	 *
	 * @param id The ID of the product to replace.
	 * @param updatedProduct The product to replace it with.
	 */
	public void updateItem(String id, student_account updated_account) {
		accounts.put(id, updated_account);
	}

	/**
	 * Checks if a Account exists.
	 *
	 * @param id The ID of the product being checked.
	 * @return <code>true</code> if product exists, <code>false</code> if not.
	 */
	public boolean exists(String id) {
		return accounts.containsKey(id);
	}
}
