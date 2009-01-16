package com.blogspot.devenphillips.helpdesk.data;

import javax.persistence.* ;
import org.hibernate.search.annotations.* ;

@Entity
@Table(name="users")
@Indexed
@SequenceGenerator(name="device_seq", sequenceName="devices_id_seq")
public class User implements java.io.Serializable {

	private static final long serialVersionUID = -3946375223199150445L;

	@Id
	@DocumentId
	@GeneratedValue(generator="device_seq",strategy=GenerationType.SEQUENCE)
	private int record = 0 ;

	@Field(index=Index.TOKENIZED, store=Store.NO)
	private String forename = null ;
	@Field(index=Index.TOKENIZED, store=Store.NO)
	private String surname = null ;
	@Field(index=Index.TOKENIZED, store=Store.NO)
	private String notes = null ;
	private String workphone = null ;
	private String mobile = null ;
	private String email = null ;

	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getWorkphone() {
		return workphone;
	}
	public void setWorkphone(String workphone) {
		this.workphone = workphone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRecord() {
		return record;
	}

}
