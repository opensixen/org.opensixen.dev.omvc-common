package org.opensixen.dev.omvc.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import org.opensixen.dev.omvc.interfaces.IPO;

@Entity
@TableGenerator(name = "Script_SEQ", pkColumnValue = "script_ID", table = "ID_SEQUENCE", pkColumnName = "pkcolname", valueColumnName = "value",  initialValue = 1000, allocationSize = 1)
@Table(name="script", uniqueConstraints = {@UniqueConstraint(columnNames="script_ID")})
public class Script implements IPO{
	
	public static final String ENGINE_POSTGRESQL = "postgres";
	public static final String ENGINE_ORACLE = "oracle";

	private int script_ID;
	private Revision revision;
	private String engine;
	private String script;
	
	public Script() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column (name = "script_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "Script_SEQ")
	public int getScript_ID() {
		return script_ID;
	}

	public void setScript_ID(int script_ID) {
		this.script_ID = script_ID;
	}

	@ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="revision_ID", insertable=true, nullable=false)
	public Revision getRevision() {
		return revision;
	}

	public void setRevision(Revision revision) {
		this.revision = revision;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	@Lob
	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}
	
	@Transient
	public boolean loadFile(String filePath) {
		try {
			StringBuffer fileData = new StringBuffer(1000);
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			char[] buf = new char[1024];
			int numRead = 0;
			while ((numRead = reader.read(buf)) != -1) {
				String readData = String.valueOf(buf, 0, numRead);
				fileData.append(readData);
				buf = new char[1024];
			}
			reader.close();
			setScript(fileData.toString());
			return true;
		} catch (IOException e) {
			return false;
		}
	}

}
