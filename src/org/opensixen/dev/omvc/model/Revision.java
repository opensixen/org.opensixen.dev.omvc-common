package org.opensixen.dev.omvc.model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import org.opensixen.dev.omvc.interfaces.IPO;

@Entity
@TableGenerator(name = "Revision_SEQ", pkColumnValue = "revision_ID", table = "ID_SEQUENCE", pkColumnName = "pkcolname", valueColumnName = "value",  initialValue = 1000, allocationSize = 1)
@Table(name="revision", uniqueConstraints = {@UniqueConstraint(columnNames="revision_ID")})
public class Revision implements IPO{

	private int revision_ID;

	private Project project;
	
	private String description;
	
	private Developer developer;

	private ArrayList<Script> scripts;
		
	public Revision() {
		super();
	}

	@Id
	@Column (name = "revision_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "Revision_SEQ")
	public int getRevision_ID() {
		return revision_ID;
	}

	public void setRevision_ID(int revision_ID) {
		this.revision_ID = revision_ID;
	}
	
	@ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="project_ID", insertable=true, nullable=false)
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="developer_ID", insertable=true, nullable=false)
	public Developer getDeveloper() {
		return developer;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	
	
	@Transient
	public ArrayList<Script> getScripts() {
		return scripts;
	}

	public void setScripts(ArrayList<Script> scripts) {
		this.scripts = scripts;
	}	
	
	public void addScript(Script script)	{
		if (scripts == null)	{
			scripts = new ArrayList<Script>();
		}
		scripts.add(script);
	}
}
