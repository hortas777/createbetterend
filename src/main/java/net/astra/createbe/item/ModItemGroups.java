package net.astra.createbe.item;

import net.astra.createbe.CreateBetterEnd;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BETTER_END_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(CreateBetterEnd.MOD_ID, "begroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.begroup"))
                    .icon(() -> new ItemStack(ModItems.OLE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.OLE);
                    }).build());
    public static void registerItemGroups() {
        CreateBetterEnd.LOGGER.info("Registering item groups for " + CreateBetterEnd.MOD_ID + "...");
    }
}
