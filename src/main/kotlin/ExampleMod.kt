import basemod.interfaces.EditCardsSubscriber
import basemod.interfaces.PostRenderSubscriber
import basemod.interfaces.PostUpdateSubscriber

abstract class ExampleMod:
  PostUpdateSubscriber,
  PostRenderSubscriber,
  EditCardsSubscriber