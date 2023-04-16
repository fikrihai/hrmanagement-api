package co.hr.management.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "resource_data")
@Setter
@Getter
public class ResourceData {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "nomor")
	private String no;

	@Column(name = "branch_name")
	private String branchName;

	@Column(name = "branch_code")
	private String branchCode;

	@Column(name = "branch_detail")
	private String branchDetail;

	@Column(name = "umr")
	private Double umr;

	@Column(name = "tanggal_masuk")
	private Date tanggalMasuk;

	@Column(name = "tanggal_keluar")
	private Date tanggalKeluar;

	@Column(name = "nama_pelaksana")
	private String namaPelaksana;

	@Column(name = "jabatan")
	private String jabatan;

	@Column(name = "nik")
	private String nik;

	@Column(name = "tangal_lahir")
	private Date tanggalLahir;

	@Column(name = "jenis_kelamin")
	private String jenisKelamin;

	@Column(name = "vendor")
	private String vendor;

}
