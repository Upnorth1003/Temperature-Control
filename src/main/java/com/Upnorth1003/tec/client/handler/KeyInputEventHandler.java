package com.Upnorth1003.tec.client.handler;

import com.Upnorth1003.tec.client.settings.KeyBindings;
import com.Upnorth1003.tec.reference.Key;
import com.Upnorth1003.tec.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler
{
    private static Key getPressedKeyBinding()
    {
        if (KeyBindings.charge.isPressed())
        {
            return Key.CHARGE;
        }
        else if (KeyBindings.release.isPressed())
        {
            return Key.RELEASE;
        }

        return Key.UNKNOWN;
    }


    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        //LogHelper.info(getPressedKeyBinding());
    }
}
