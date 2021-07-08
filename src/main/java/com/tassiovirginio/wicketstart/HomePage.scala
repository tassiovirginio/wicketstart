package com.tassiovirginio.wicketstart

import org.apache.wicket.request.mapper.parameter.PageParameters
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.markup.html.WebPage

@SerialVersionUID(1L)
class HomePage(val parameters: PageParameters) extends WebPage(parameters) {
  add(new Label("version", getApplication.getFrameworkSettings.getVersion))
}