package com.mahasiswa.dao;

import java.util.List;

import com.mahasiswa.model.Mahasiswa;

public interface MahasiswaDAO {
	public int save(Mahasiswa mahasiswa);

	public Mahasiswa get(String nim);

	public List<Mahasiswa> list();
}
