package com.tassiovirginio.wicketstart

import org.apache.wicket.csp.CSPDirective._
import org.apache.wicket.csp.CSPDirectiveSrcValue._
import org.apache.wicket.protocol.http.WebApplication

class WicketApplication extends WebApplication {

  override def getHomePage = classOf[HomePage]

  override def init() = {
    super.init()
    // needed for the styling used by the quickstart
    getCspSettings
      .blocking
      .add(STYLE_SRC, SELF)
      .add(STYLE_SRC, "https://fonts.googleapis.com/css")
      .add(FONT_SRC, "https://fonts.gstatic.com")
  }
}

object Main{
  def main(args: Array[String]): Unit = {
    val usuario = Usuario("Tássio","tassiovirginio@gmail.com")
    println(usuario)
  }
  case class Usuario(nome:String = "", email:String = "")
}

