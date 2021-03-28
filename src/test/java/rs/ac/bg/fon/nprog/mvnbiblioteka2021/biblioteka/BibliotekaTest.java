package rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka.interfejs.*;

class BibliotekaTest extends BibliotekaInterfejsTest {

	@BeforeEach
	void setUp() throws Exception  {
	
		biblioteka = new Biblioteka();
	}
	

	@AfterEach
	void tearDown() throws Exception {
		biblioteka = null;
	}
}
