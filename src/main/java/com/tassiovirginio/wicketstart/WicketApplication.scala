package com.tassiovirginio.wicketstart

import org.apache.wicket.csp.CSPDirective
import org.apache.wicket.csp.CSPDirectiveSrcValue
import org.apache.wicket.protocol.http.WebApplication

class WicketApplication extends WebApplication {

  override def getHomePage = classOf[HomePage]

  override def init() = {
    super.init()
    // needed for the styling used by the quickstart
    getCspSettings.blocking.add(CSPDirective.STYLE_SRC, CSPDirectiveSrcValue.SELF).add(CSPDirective.STYLE_SRC, "https://fonts.googleapis.com/css").add(CSPDirective.FONT_SRC, "https://fonts.gstatic.com")
  }
}