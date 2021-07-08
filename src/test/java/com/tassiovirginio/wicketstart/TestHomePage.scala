package com.tassiovirginio.wicketstart

import org.apache.wicket.util.tester.WicketTester
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * Simple test using the WicketTester
 */
class TestHomePage {

  var tester:WicketTester = null

  @BeforeEach def setUp() = tester = new WicketTester(new WicketApplication)

  @Test def homepageRendersSuccessfully() = { //start and render the test page
    tester.startPage(classOf[HomePage])
    //assert rendered page class
    tester.assertRenderedPage(classOf[HomePage])
  }
}