import io.spring.demo.i18n
import io.spring.demo.include
import io.spring.demo.users

"""


${include("header")}
<p>Locale: <a href="/?locale=fr">FR</a> | <a href="/?locale=en">EN</a></p>
<h1>${i18n("title")}</h1>
${include("users", mapOf(Pair("users", users)))}
${include("footer")}


"""
