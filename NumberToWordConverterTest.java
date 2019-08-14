package com.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import com.test.number.to.word.NumberToWordConverter;

public class NumberToWordConverterTest {

	NumberToWordConverter  num = new NumberToWordConverter();
	@SuppressWarnings("static-access")
	@Test
	public void testnumberToWord() {
		assertEquals("zero",num.numberToWord(0));
		assertEquals("minus one",num.numberToWord(-1));
		assertEquals("one",num.numberToWord(1));
		assertEquals("fifteen",num.numberToWord(15));
		assertEquals("twenty-two",num.numberToWord(22));
		
	
		assertEquals("one hundred ",num.numberToWord(100));
		assertEquals("one thousand ",num.numberToWord(1000));
		assertEquals("ten thousand ",num.numberToWord(10000));
		assertEquals("one million ",num.numberToWord(1000000));
		
	}

	@Test
	public void testnumberToWordZero() {
		assertEquals("nine hundred ninety-nine million nine hundred ninety-nine thousand nine hundred ninety-nine",num.numberToWord(999999999));
	}
}
