package com.seailz.owncommand.utils;

import ChatMessageAPI.ImageChar;
import ChatMessageAPI.ImageMessage;
import org.bukkit.entity.Player;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class HeadMessage {
    public HeadMessage(Player p) throws IOException {
        URL url = new URL("https://mc-heads.net/avatar/" + p.getName());
        BufferedImage imageToSend = ImageIO.read(url);
        new ImageMessage(
                imageToSend, // the bufferedimage to send
                8, // the image height
                ImageChar.MEDIUM_SHADE.getChar() // the character that the image is made of
        ).appendText(
                "",
                "",
                "",
                "ur cute <3",
                "i like your",
                "face"
        ).sendPlayer(p);

    }
}

