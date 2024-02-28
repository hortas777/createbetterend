package net.astra.createbe.item;

import net.astra.createbe.CreateBetterEnd;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item OLE = registerItem("ole",
            new Item(new FabricItemSettings()));
    public static final Item TEMPLATE_AETERNIUM_GEAR = registerItem("aetgeartemplate",
            new Item(new FabricItemSettings()));
    public static final Item AETERNIUM_DIVING_HELMET = registerItem("aeternium_diving_helmet",
            new ArmorItem(ModArmorMaterials.AETERNIUMDIVING, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AETERNIUM_BACKTANK = registerItem("aeternium_backtank",
            new ArmorItem(ModArmorMaterials.AETERNIUMDIVING, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AETERNIUM_DIVING_BOOTS = registerItem("aeternium_diving_boots",
            new ArmorItem(ModArmorMaterials.AETERNIUMDIVING, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static void addItemsToCBETab(FabricItemGroupEntries entries) {
        entries.add(OLE);
        entries.add(TEMPLATE_AETERNIUM_GEAR);

        entries.add(AETERNIUM_DIVING_HELMET);
        entries.add(AETERNIUM_BACKTANK);
        entries.add(AETERNIUM_DIVING_BOOTS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateBetterEnd.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CreateBetterEnd.LOGGER.info("Registering mod items for " + CreateBetterEnd.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToCBETab);
    }
}
