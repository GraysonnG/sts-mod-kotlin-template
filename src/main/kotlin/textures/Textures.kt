package textures

import ExampleMod
import com.badlogic.gdx.graphics.Texture

object Textures {
  private fun getString(folder: String, texture: String) = ExampleMod.makePath("$folder/") + texture
  val acts = TextureGetter("acts")
  val cards = TextureGetter("cards")
  val events = TextureGetter("events")
  val monsters = TextureGetter("monsters")
  val powers = TextureGetter("powers")
  val relics = TextureGetter("relics")
  val screen = TextureGetter("screen")
  val ui = TextureGetter("ui")
  val vfx = TextureGetter("vfx")
  val missingTexture by lazy { Texture(missingTexturePath) }
  var missingTexturePath: String = ""
}