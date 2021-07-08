package com.tassiovirginio.wicketstart

import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.model.Model._
import org.wicketstuff.scala.markup.html.ScalaWebPage
import org.wicketstuff.scala.markup.html.basic.ScalaLabel
import org.wicketstuff.scala._

@SerialVersionUID(1L)
class HomePage extends ScalaWebPage {
  add(new ScalaLabel[String]("version", getApplication.getFrameworkSettings.getVersion))
}

