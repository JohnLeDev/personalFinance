package com.lean.moneynote.mapper;

import com.lean.moneynote.model.Ledger;
import com.lean.moneynote.model.LedgerExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LedgerMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ledger
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	long countByExample(LedgerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ledger
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	int deleteByExample(LedgerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ledger
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	int deleteByPrimaryKey(Integer ledgerid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ledger
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	int insert(Ledger row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ledger
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	int insertSelective(Ledger row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ledger
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	List<Ledger> selectByExample(LedgerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ledger
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	Ledger selectByPrimaryKey(Integer ledgerid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ledger
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	int updateByExampleSelective(@Param("row") Ledger row, @Param("example") LedgerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ledger
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	int updateByExample(@Param("row") Ledger row, @Param("example") LedgerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ledger
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	int updateByPrimaryKeySelective(Ledger row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ledger
	 * @mbg.generated  Sat Oct 22 10:38:40 ICT 2022
	 */
	int updateByPrimaryKey(Ledger row);
}