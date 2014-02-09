package net.bytewelt.tt.tgeblock;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class ZweiZahlenBerechnungTest {

	private static final Random RANDOM = new Random();

	@Test
	public void testAddiereKleineZahlen() {
		ZweiZahlenBerechnung zweiZahlenBerechnung = new ZweiZahlenBerechnung();
		for (int i = 0; i < 10; i++) {
			int a = RANDOM.nextInt(10);
			int b = RANDOM.nextInt(10);
			assertEquals("ergebnis", a+b,
					zweiZahlenBerechnung.ergebnisVon(a, "+", b));

		}
	}

}
