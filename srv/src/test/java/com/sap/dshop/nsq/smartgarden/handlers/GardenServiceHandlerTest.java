package com.sap.dshop.nsq.smartgarden.handlers;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

import cds.gen.gardenservice.Devices;

public class GardenServiceHandlerTest {

	private GardenServiceHandler handler = new GardenServiceHandler();
	private Devices device = Devices.create();

	@Before
	public void prepareBook() {
		device.setName("test");
	}
/*
	@Test
	public void testDiscount() {
		book.setStock(500);
		handler.discountBooks(Stream.of(book));
		assertEquals("title (discounted)", book.getTitle());
	}

	@Test
	public void testNoDiscount() {
		book.setStock(100);
		handler.discountBooks(Stream.of(book));
		assertEquals("title", book.getTitle());
	}

	@Test
	public void testNoStockAvailable() {
		handler.discountBooks(Stream.of(book));
		assertEquals("title", book.getTitle());
	}
*/
}
