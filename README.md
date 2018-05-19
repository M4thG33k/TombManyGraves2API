# TombManyGraves2API
The Grave API used by TombManyGraves2 and its plugins

This API is provided to allow mod authors to take control of how Tomb Many Graves 2 interacts with their special inventories.
An example of how to use the API can be found within Tomb Many Graves 2 itself: [Using the API to gather the Vanilla Inventory](https://github.com/M4thG33k/TombManyGraves2/blob/master/src/main/java/com/m4thg33k/tombmanygraves/api/inventory/specialInventoryImplementations/VanillaMinecraftInventory.java)

Mods which use this API need to be initialized *after* both the API and Tomb Many Graves 2 to allow the events to be handled in the correct order. (Failure to do so may cause TMG2 to not realize your special inventory exists!)

In order to add compatiblity, you will need to create a class which extends ISpecialInventory and then (in the Forge Initialization event) post an EventRegisterMySpecialInventory passing in your ISpecialInventory instance. Tomb Many Graves will handle the rest! 

If that seems too complicated, a simpler approach: Create a class that extends AbstractSpecialInventory - its default constructor takes care of sending the EventRegisterMySpecialInventory event for you! All you have to do then is create a new instance of that class during the FMLInitializationEvent! The [plugin I created to add compatibility with Cosmetic Armor Reworked](https://github.com/M4thG33k/TombManyPlugins/blob/master/CosmeticArmor/src/main/java/com/m4thg33k/tombmanyplugins_cosmeticarmorreworked/TombManyPluginsCosmeticArmorReworked.java) is an example of a single-file plugin.

The biggest difference between my plugin classes and code embedded in your project will be what the isOverwritable() method returns - mine return TRUE to allow YOUR code to overwrite my behaviour. Your code should ALWAYS return FALSE for this method!

The methods in ISpecialInventory are (in my opinion) fairly well commented up, so there shouldn't be confusion on what each method does. If you have questions, please don't hesitate to open a ticket or shoot me a direct message. You can also ask questions via Twitter (@M4thG33k) if they're short and need a "quick" response!
