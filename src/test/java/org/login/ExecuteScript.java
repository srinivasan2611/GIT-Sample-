package org.login;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExecuteScript extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
		browserLaunch("Chrome");
		System.out.println("Before class...");
	}

	@Before
	public void before() {
		Date d = new Date();
		System.out.println("Test starts at..." + d);
	}

	@Test
	public void test1() {
		launchUrl("http://adactinhotelapp.com/");
		LoginPOM1 l = new LoginPOM1();
		fillTheBox(l.getUserName(), "srinivasan26");
		fillTheBox(l.getPassWord(), "123456789");
		toClick(l.getLogin());
		System.out.println("Test 1 OK");
	}

	@Test
	public void test2() {
		SearchHotelPOM2 l = new SearchHotelPOM2();
		selectByValue(l.getLocation(), "Sydney");
		selectByValue(l.getHotels(), "Hotel Creek");
		selectByValue(l.getRoomType(), "Super Deluxe");
		selectByValue(l.getRoomNos(), "1");
		fillTheBox(l.getDatePickIn(), "13/03/2021");
		fillTheBox(l.getDatePickOut(), "14/03/2021");
		selectByValue(l.getAdultRoom(), "1");
		selectByValue(l.getChildRoom(), "0");
		toClick(l.getSubmit());
	}

	@Test
	public void test3() {
		SelectHotelPOM3 l = new SelectHotelPOM3();
		toClick(l.getRadioButton());
		toClick(l.getSubmit());
	}

	@Test
	public void test4() {
		BookAHotelPOm4 l = new BookAHotelPOm4();
		fillTheBox(l.getFirstName(), "Srinivasan");
		fillTheBox(l.getLastName(), "M");
		fillTheBox(l.getAddress(), "No 5, Gandhi street, Chennai");
		fillTheBox(l.getCcNum(), "1234567891236547");
		selectByValue(l.getCcType(), "VISA");
		selectByValue(l.getCcExpMonth(), "11");
		selectByValue(l.getCcExpYear(), "2022");
		fillTheBox(l.getCcCvv(), "548");
		toClick(l.getBookNow());

	}

	@Test
	public void test5() throws Exception {
		BookingConfirmationPOM5 l = new BookingConfirmationPOM5();
		Thread.sleep(5000);
		getText(l.getOrderNo());

	}

	@After
	public void after() {
		Date d = new Date();
		System.out.println("Test ends at..." + d);
	}

	@AfterClass
	public static void afterClass() {
		// quit();
		System.out.println("After class....");
	}

}
