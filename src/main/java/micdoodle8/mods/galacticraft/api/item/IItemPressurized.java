package micdoodle8.mods.galacticraft.api.item;

import net.minecraft.item.ItemStack;

public interface IItemPressurized
{
	/**
     * The maximal pressure from which this armor can protect you. Should be > 1
     */
    float getMaxPressure();

    /**
     * The minimal pressure from which this armor can protect you (if inabled).
     * Should be 0 <= x <= 1.
     */
    float getMinPressure();

    /**
     * Returns whether the provided itemstack is valid for the armor slot:
     *
     * @param stack
     *  The item to test
     * @param armorSlot
     *  0 - helmet
     *  1 - chestplate
     *  2 - leggings
     *  3 - boots
     *
     * This should be compatible with IItemThermal...
     */
    boolean isValidForSlot(ItemStack stack, int armorSlot);
}
