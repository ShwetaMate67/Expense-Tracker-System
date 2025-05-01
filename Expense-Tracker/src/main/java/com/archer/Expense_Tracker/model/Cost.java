package com.archer.Expense_Tracker.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "cost")  // Explicitly set the collection name
public class Cost {
	
	@Id
	private String id;
	@Field("name")
	@Indexed (unique = true)
	private String expenseName;
	@Field("type")
	private ExpenseCategory expenseType;
	@Field("amount")
	private BigDecimal expenseAmount;
	

	public Cost(String id, String expenseName, ExpenseCategory expenseType, BigDecimal expenseAmount) {
		super();
		this.id = id;
		this.expenseName = expenseName;
		this.expenseType = expenseType;
		this.expenseAmount = expenseAmount;
	}
	
	public Cost() {
		super();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getExpenseName() {
		return expenseName;
	}


	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}


	public ExpenseCategory getExpenseType() {
		return expenseType;
	}


	public void setExpenseType(ExpenseCategory expenseType) {
		this.expenseType = expenseType;
	}


	public BigDecimal getExpenseAmount() {
		return expenseAmount;
	}


	public void setExpenseAmount(BigDecimal expenseAmount) {
		this.expenseAmount = expenseAmount;
	}


	@Override
	public String toString() {
		return "Cost [id=" + id + ", expenseName=" + expenseName + ", expenseType=" + expenseType + ", expenseAmount="
				+ expenseAmount + "]";
	}


	
}
