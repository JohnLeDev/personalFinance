package com.lean.moneynote.model;

import java.util.Date;

public class Account {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.Id
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.name
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.initial_balance
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	private Long initialBalance;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.dob
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	private Date dob;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.created_at
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.updated_at
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	private Date updatedAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.modified_at
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	private Date modifiedAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.password
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.username
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.email
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	private String email;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.Id
	 * @return  the value of account.Id
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.Id
	 * @param id  the value for account.Id
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.name
	 * @return  the value of account.name
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.name
	 * @param name  the value for account.name
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.initial_balance
	 * @return  the value of account.initial_balance
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public Long getInitialBalance() {
		return initialBalance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.initial_balance
	 * @param initialBalance  the value for account.initial_balance
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public void setInitialBalance(Long initialBalance) {
		this.initialBalance = initialBalance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.dob
	 * @return  the value of account.dob
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.dob
	 * @param dob  the value for account.dob
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.created_at
	 * @return  the value of account.created_at
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.created_at
	 * @param createdAt  the value for account.created_at
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.updated_at
	 * @return  the value of account.updated_at
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.updated_at
	 * @param updatedAt  the value for account.updated_at
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.modified_at
	 * @return  the value of account.modified_at
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public Date getModifiedAt() {
		return modifiedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.modified_at
	 * @param modifiedAt  the value for account.modified_at
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.password
	 * @return  the value of account.password
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.password
	 * @param password  the value for account.password
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.username
	 * @return  the value of account.username
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.username
	 * @param username  the value for account.username
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.email
	 * @return  the value of account.email
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.email
	 * @param email  the value for account.email
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}