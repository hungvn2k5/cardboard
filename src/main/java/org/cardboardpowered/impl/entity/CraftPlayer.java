package org.cardboardpowered.impl.entity;

import net.minecraft.server.level.ServerPlayer;
import org.bukkit.craftbukkit.CraftServer;

/**
 * Compatibility shim - redirects old Cardboard CraftPlayer path
 * to the current implementation at org.bukkit.craftbukkit.entity.CraftPlayer
 */
public class CraftPlayer extends org.bukkit.craftbukkit.entity.CraftPlayer {

    public CraftPlayer(CraftServer server, ServerPlayer entity) {
        super(server, entity);
    }
}
