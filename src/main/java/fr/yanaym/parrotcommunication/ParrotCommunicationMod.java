package fr.yanaym.parrotcommunication;

import org.apache.logging.log4j.Logger;

import fr.yanaym.parrotcommunication.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ParrotCommunicationMod.ID, name = ParrotCommunicationMod.NAME, version = ParrotCommunicationMod.VERSION, acceptedMinecraftVersions="[1.12.2]")
public class ParrotCommunicationMod
{
    public static final String ID = "parrotcommunicationmod";
    public static final String NAME = "ParrotCommunication Mod";
    public static final String VERSION = "1.0.0";

    @SidedProxy(clientSide="fr.yanaym.parrotcommunication.client.ClientProxy", serverSide="fr.yanaym.parrotcommunication.common.CommonProxy")
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
