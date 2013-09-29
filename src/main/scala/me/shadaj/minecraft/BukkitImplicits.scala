package me.shadaj.minecraft

import org.bukkit.event.block.BlockPlaceEvent
import org.bukkit.event.Listener
import org.bukkit.event.EventHandler

trait BukkitImplicits {
  implicit def toBlockPlace(handler: BlockPlaceEvent => Unit): Listener = {
    new Listener {
      @EventHandler
      def onBlockPlace(event: BlockPlaceEvent) {
        handler(event)
      }
    }
  }
}