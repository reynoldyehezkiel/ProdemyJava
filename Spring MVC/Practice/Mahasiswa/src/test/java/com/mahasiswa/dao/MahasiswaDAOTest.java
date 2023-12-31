package com.mahasiswa.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mahasiswa.model.Mahasiswa;

class MahasiswaDAOTest {
	private DriverManagerDataSource dataSource;
	private MahasiswaDAO dao;

	@BeforeEach
	void setupBeforeEach() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/kampus");
		dataSource.setUsername("root");
		dataSource.setPassword("");

		dao = new MahasiswaDAOImplementation(dataSource);
	}

	@Test
	void testSave() {
		Mahasiswa mhs = new Mahasiswa("334455", "John Doe", "Teknik Informatika", "2020");
		int result = dao.save(mhs);

		assertTrue(result > 0);
	}

	@Test
	void testGet() {
		String nim = "112233";
		Mahasiswa mhs = dao.get(nim);

		if (mhs != null) {
			System.out.println(mhs);
		}

		assertNotNull(mhs);
	}

	@Test
	void testList() {
		List<Mahasiswa> listMhs = dao.list();

		for (Mahasiswa mhs : listMhs) {
			System.out.println(mhs);
		}
		
		assertTrue(!listMhs.isEmpty());
	}

}
