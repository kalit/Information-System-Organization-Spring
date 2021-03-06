package com.sibem.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="strukturorganisasibem")
public class StrukturOrganisasiBEM {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	
	@Column(unique = true, nullable = false)
	private String idStrukturOrganisasiBEM;
	
	private String namaStruktur;
	
	private String deskripsi;
	
	private Date tanggalDibentuk;
	

	
	
}
