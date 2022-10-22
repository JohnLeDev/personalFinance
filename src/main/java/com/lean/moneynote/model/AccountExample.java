package com.lean.moneynote.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	public AccountExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("Id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("Id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("Id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("Id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("Id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("Id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("Id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("Id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("Id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("Id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("Id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("Id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andInitialBalanceIsNull() {
			addCriterion("initial_balance is null");
			return (Criteria) this;
		}

		public Criteria andInitialBalanceIsNotNull() {
			addCriterion("initial_balance is not null");
			return (Criteria) this;
		}

		public Criteria andInitialBalanceEqualTo(Long value) {
			addCriterion("initial_balance =", value, "initialBalance");
			return (Criteria) this;
		}

		public Criteria andInitialBalanceNotEqualTo(Long value) {
			addCriterion("initial_balance <>", value, "initialBalance");
			return (Criteria) this;
		}

		public Criteria andInitialBalanceGreaterThan(Long value) {
			addCriterion("initial_balance >", value, "initialBalance");
			return (Criteria) this;
		}

		public Criteria andInitialBalanceGreaterThanOrEqualTo(Long value) {
			addCriterion("initial_balance >=", value, "initialBalance");
			return (Criteria) this;
		}

		public Criteria andInitialBalanceLessThan(Long value) {
			addCriterion("initial_balance <", value, "initialBalance");
			return (Criteria) this;
		}

		public Criteria andInitialBalanceLessThanOrEqualTo(Long value) {
			addCriterion("initial_balance <=", value, "initialBalance");
			return (Criteria) this;
		}

		public Criteria andInitialBalanceIn(List<Long> values) {
			addCriterion("initial_balance in", values, "initialBalance");
			return (Criteria) this;
		}

		public Criteria andInitialBalanceNotIn(List<Long> values) {
			addCriterion("initial_balance not in", values, "initialBalance");
			return (Criteria) this;
		}

		public Criteria andInitialBalanceBetween(Long value1, Long value2) {
			addCriterion("initial_balance between", value1, value2, "initialBalance");
			return (Criteria) this;
		}

		public Criteria andInitialBalanceNotBetween(Long value1, Long value2) {
			addCriterion("initial_balance not between", value1, value2, "initialBalance");
			return (Criteria) this;
		}

		public Criteria andDobIsNull() {
			addCriterion("dob is null");
			return (Criteria) this;
		}

		public Criteria andDobIsNotNull() {
			addCriterion("dob is not null");
			return (Criteria) this;
		}

		public Criteria andDobEqualTo(Date value) {
			addCriterion("dob =", value, "dob");
			return (Criteria) this;
		}

		public Criteria andDobNotEqualTo(Date value) {
			addCriterion("dob <>", value, "dob");
			return (Criteria) this;
		}

		public Criteria andDobGreaterThan(Date value) {
			addCriterion("dob >", value, "dob");
			return (Criteria) this;
		}

		public Criteria andDobGreaterThanOrEqualTo(Date value) {
			addCriterion("dob >=", value, "dob");
			return (Criteria) this;
		}

		public Criteria andDobLessThan(Date value) {
			addCriterion("dob <", value, "dob");
			return (Criteria) this;
		}

		public Criteria andDobLessThanOrEqualTo(Date value) {
			addCriterion("dob <=", value, "dob");
			return (Criteria) this;
		}

		public Criteria andDobIn(List<Date> values) {
			addCriterion("dob in", values, "dob");
			return (Criteria) this;
		}

		public Criteria andDobNotIn(List<Date> values) {
			addCriterion("dob not in", values, "dob");
			return (Criteria) this;
		}

		public Criteria andDobBetween(Date value1, Date value2) {
			addCriterion("dob between", value1, value2, "dob");
			return (Criteria) this;
		}

		public Criteria andDobNotBetween(Date value1, Date value2) {
			addCriterion("dob not between", value1, value2, "dob");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIsNull() {
			addCriterion("created_at is null");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIsNotNull() {
			addCriterion("created_at is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedAtEqualTo(Date value) {
			addCriterion("created_at =", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotEqualTo(Date value) {
			addCriterion("created_at <>", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtGreaterThan(Date value) {
			addCriterion("created_at >", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
			addCriterion("created_at >=", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtLessThan(Date value) {
			addCriterion("created_at <", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
			addCriterion("created_at <=", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIn(List<Date> values) {
			addCriterion("created_at in", values, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotIn(List<Date> values) {
			addCriterion("created_at not in", values, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtBetween(Date value1, Date value2) {
			addCriterion("created_at between", value1, value2, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
			addCriterion("created_at not between", value1, value2, "createdAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIsNull() {
			addCriterion("updated_at is null");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIsNotNull() {
			addCriterion("updated_at is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtEqualTo(Date value) {
			addCriterion("updated_at =", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotEqualTo(Date value) {
			addCriterion("updated_at <>", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtGreaterThan(Date value) {
			addCriterion("updated_at >", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
			addCriterion("updated_at >=", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtLessThan(Date value) {
			addCriterion("updated_at <", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
			addCriterion("updated_at <=", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIn(List<Date> values) {
			addCriterion("updated_at in", values, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotIn(List<Date> values) {
			addCriterion("updated_at not in", values, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtBetween(Date value1, Date value2) {
			addCriterion("updated_at between", value1, value2, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
			addCriterion("updated_at not between", value1, value2, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andModifiedAtIsNull() {
			addCriterion("modified_at is null");
			return (Criteria) this;
		}

		public Criteria andModifiedAtIsNotNull() {
			addCriterion("modified_at is not null");
			return (Criteria) this;
		}

		public Criteria andModifiedAtEqualTo(Date value) {
			addCriterion("modified_at =", value, "modifiedAt");
			return (Criteria) this;
		}

		public Criteria andModifiedAtNotEqualTo(Date value) {
			addCriterion("modified_at <>", value, "modifiedAt");
			return (Criteria) this;
		}

		public Criteria andModifiedAtGreaterThan(Date value) {
			addCriterion("modified_at >", value, "modifiedAt");
			return (Criteria) this;
		}

		public Criteria andModifiedAtGreaterThanOrEqualTo(Date value) {
			addCriterion("modified_at >=", value, "modifiedAt");
			return (Criteria) this;
		}

		public Criteria andModifiedAtLessThan(Date value) {
			addCriterion("modified_at <", value, "modifiedAt");
			return (Criteria) this;
		}

		public Criteria andModifiedAtLessThanOrEqualTo(Date value) {
			addCriterion("modified_at <=", value, "modifiedAt");
			return (Criteria) this;
		}

		public Criteria andModifiedAtIn(List<Date> values) {
			addCriterion("modified_at in", values, "modifiedAt");
			return (Criteria) this;
		}

		public Criteria andModifiedAtNotIn(List<Date> values) {
			addCriterion("modified_at not in", values, "modifiedAt");
			return (Criteria) this;
		}

		public Criteria andModifiedAtBetween(Date value1, Date value2) {
			addCriterion("modified_at between", value1, value2, "modifiedAt");
			return (Criteria) this;
		}

		public Criteria andModifiedAtNotBetween(Date value1, Date value2) {
			addCriterion("modified_at not between", value1, value2, "modifiedAt");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("password is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("password is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("password =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("password <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("password >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("password >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("password <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("password <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("password like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("password not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("password in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("password not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("password between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("password not between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNull() {
			addCriterion("username is null");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNotNull() {
			addCriterion("username is not null");
			return (Criteria) this;
		}

		public Criteria andUsernameEqualTo(String value) {
			addCriterion("username =", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("username <>", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("username >", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("username >=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThan(String value) {
			addCriterion("username <", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("username <=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLike(String value) {
			addCriterion("username like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotLike(String value) {
			addCriterion("username not like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameIn(List<String> values) {
			addCriterion("username in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotIn(List<String> values) {
			addCriterion("username not in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("username between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("username not between", value1, value2, "username");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table account
	 * @mbg.generated  Fri Oct 21 18:37:19 ICT 2022
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table account
     *
     * @mbg.generated do_not_delete_during_merge Fri Oct 21 18:22:10 ICT 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}