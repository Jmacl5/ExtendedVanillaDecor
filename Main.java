package og.extendedvanilla;

import og.extendedvanilla.tabs.CreativeTabDecorExt;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = Main.modid, name = "Vanilla Decor Extention")
@NetworkMod(clientSideRequired = true)
public class Main {
	
	public static final String modid = "Kloud_DecorExt.";
	public static CreativeTabs tabDecor = new CreativeTabDecorExt(12, "Decor");
}
