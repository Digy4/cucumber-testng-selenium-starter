package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

//
//Copyright (c) 2021 Digy4 Inc. and its affiliates. All rights reserved.
//Unauthorized copying of this file, via any medium is strictly prohibited
//Proprietary and confidential
//Any illegal or unauthorised usage or violations will result in immediate legal action.
//

//NOTE: Change 10 to Duration.ofSeconds(10) when running in Selenium v4
public class CommonStepDefinitions {
	/*
	 * Sleep for a minimum of pauseTime milliseconds.
	 * If element is still not clickable, wait until so.
	 * Then find and click that element using driver.
	 */
	public static void clickElement(WebDriver driver, By element, long pauseTime) throws InterruptedException {
		Thread.sleep(pauseTime);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement e = wait.until(ExpectedConditions.elementToBeClickable(element));
		e.click();
	}
	
	/*
	 * Sleep for a minimum of pauseTime milliseconds.
	 * If element is still not clickable, wait until so and return.
	 */
	public static void waitElement(WebDriver driver, By element, long pauseTime) throws InterruptedException {
		Thread.sleep(pauseTime);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/*
	 * Sleep for a minimum of pauseTime milliseconds.
	 * If element is still not clickable, wait until so.
	 * Then click that element.
	 */
	public static void clickWebElement(WebDriver driver, WebElement element, long pauseTime) throws InterruptedException {
		Thread.sleep(pauseTime);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		element.click();
	}
	
	public static void sendKeyElement(WebDriver driver, By element, String keys, long pauseTime) throws InterruptedException {
		Thread.sleep(pauseTime);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement e = wait.until(ExpectedConditions.elementToBeClickable(element));
		e.clear();
		e.sendKeys(keys);
	}
}
