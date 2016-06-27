package me.savikin.kris.common.helper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.util.text.ITextComponent;

/**
 * Created by Mark on 27/06/2016.
 */

public class ChatHelper
{
    public static int counter = 0;

    public static void printChatMessage(ITextComponent message) {
        GuiNewChat chat = Minecraft.getMinecraft().ingameGUI.getChatGUI();
        chat.printChatMessageWithOptionalDeletion(message, counter);
        counter++;
        System.out.println(counter);

        if(counter % 2 == 0)
        {
            chat.deleteChatLine(counter);
        }
    }
}
