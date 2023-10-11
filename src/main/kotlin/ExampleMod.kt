import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer
import java.io.IOException
import java.util.*

@SpireInitializer
object ExampleMod {
  var name: String = ""
  private var version: String = ""
  var modid: String = ""
  var author: String = ""
  var description: String = ""

  @JvmStatic
  fun initialize() {
    loadProjectProperties()
    // subscribe to basemod
  }

  fun makeId(value: String): String {
    return "$modid:$value"
  }

  fun makePath(value: String): String {
    return "$modid/images/$value"
  }

  private fun loadProjectProperties() {
    try {
      with(Properties()) {
        load(ExampleMod::class.java.getResourceAsStream("/META-INF/data.prop"))
        name = getProperty("name")
        version = getProperty("version")
        modid = getProperty("modid")
        author = getProperty("author")
        description = getProperty("description")
      }
    } catch (e: IOException) {
      e.printStackTrace()
    }
  }
}