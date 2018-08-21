package fr.yanaym.mffjam;

import org.apache.logging.log4j.Logger;

import fr.yanaym.mffjam.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MffJamMod.ID, name = MffJamMod.NAME, version = MffJamMod.VERSION, acceptedMinecraftVersions="[1.12.2]")
public class MffJamMod
{
    public static final String ID = "mffjammod";
    public static final String NAME = "MFFJam1 Mod";
    public static final String VERSION = "1.0.0";

    @SidedProxy(clientSide="fr.yanaym.mffjam.client.ClientProxy", serverSide="fr.yanaym.mffjam.common.CommonProxy")
    public static CommonProxy proxy;
    
    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
    }
}
