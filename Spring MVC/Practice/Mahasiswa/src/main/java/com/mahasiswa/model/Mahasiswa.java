package com.mahasiswa.model;

public class Mahasiswa {
	private String nim;
	private String nama;
	private String jurusan;
	private String tahun;

	public Mahasiswa() {

	}

	public Mahasiswa(String nim, String nama, String jurusan, String tahun) {
		this(nama, jurusan, tahun);
		this.nim = nim;
	}

	public Mahasiswa(String nama, String jurusan, String tahun) {
		this.nama = nama;
		this.jurusan = jurusan;
		this.tahun = tahun;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getJurusan() {
		return jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

	public String getTahun() {
		return tahun;
	}

	public void setTahun(String tahun) {
		this.tahun = tahun;
	}

	@Override
	public String toString() {
		return "Mahasiswa [nim=" + nim + ", nama=" + nama + ", jurusan=" + jurusan + ", tahun=" + tahun + "]";
	}

}
