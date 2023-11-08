package de.joshi.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;

public class WearableItem extends ArmorItem {
    public WearableItem() {
        super(ArmorMaterials.NETHERITE, Type.HELMET, new FabricItemSettings());
    }
}
