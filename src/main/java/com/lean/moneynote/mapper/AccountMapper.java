package com.lean.moneynote.mapper;

import com.lean.moneynote.model.Account;
import com.lean.moneynote.model.AccountExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	long countByExample(AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	int deleteByExample(AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	int insert(Account row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	int insertSelective(Account row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	List<Account> selectByExample(AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	Account selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	int updateByExampleSelective(@Param("row") Account row, @Param("example") AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	int updateByExample(@Param("row") Account row, @Param("example") AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	int updateByPrimaryKeySelective(Account row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	int updateByPrimaryKey(Account row);
}