package org.opensixen.dev.omvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.UniqueConstraint;

import org.opensixen.dev.omvc.interfaces.IPO;
import org.opensixen.dev.omvc.interfaces.IRemoteConsole;

@Entity
@TableGenerator(name = "Project_SEQ", pkColumnValue = "project_ID", table = "ID_SEQUENCE", pkColumnName = "pkcolname", valueColumnName = "value",  initialValue = 1000, allocationSize = 1)
@Table(name="project", uniqueConstraints = {@UniqueConstraint(columnNames="project_ID")})
public class Project implements IPO {

	private static final long serialVersionUID = 1L;

	private int project_ID;
	
	private String name;

	@Id
	@Column (name = "project_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "Project_SEQ")
	public int getProject_ID() {
		return project_ID;
	}

	public void setProject_ID(int project_ID) {
		this.project_ID = project_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
