package org.opensixen.dev.omvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.UniqueConstraint;

import org.opensixen.dev.omvc.interfaces.IPO;

@Entity
@TableGenerator(name = "Developer_SEQ", pkColumnValue = "developer_ID", table = "ID_SEQUENCE", pkColumnName = "pkcolname", valueColumnName = "value", initialValue = 1000, allocationSize = 1)
@Table(name = "developer", uniqueConstraints = { @UniqueConstraint(columnNames = "developer_ID") })
public class Developer implements IPO{

	private int developer_ID;
	private String userName;
	private String password;

	@Id
	@Column (name = "developer_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "Developer_SEQ")
	public int getDeveloper_ID() {
		return developer_ID;
	}

	public void setDeveloper_ID(int developer_ID) {
		this.developer_ID = developer_ID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
