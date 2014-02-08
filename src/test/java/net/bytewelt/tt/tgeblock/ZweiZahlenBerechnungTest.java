package net.bytewelt.tt.tgeblock;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZweiZahlenBerechnungTest {

	@Test
	public void testAddiereKleineZahlen() {
		int a = 1;
		String rechenZeichen= "+";
		int b = 2;
		int ergebnis = new ZweiZahlenBerechnung().ergebnisVon(a,rechenZeichen,b);
	}

}
