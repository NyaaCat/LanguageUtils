/*
 * Copyright (c) 2015 Hexosse
 *
 * This project is Open Source and distributed under The MIT License (MIT)
 * (http://opensource.org/licenses/MIT)
 *
 * You should have received a copy of the The MIT License along with
 * this project.   If not, see <http://opensource.org/licenses/MIT>.
 */

package com.meowj.langutils.lang.convert;

import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.enchantments.Enchantment;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This file is part of LanguageUtils
 * <p>
 * A list of enchantments.
 * Updated for 1.21+ where enchantments are accessed via Registry.
 *
 * @author <b>hexosse</b> (<a href="https://github.com/hexosse">hexosse on GitHub</a>).
 */
public enum EnumEnchantment {

    // Armor enchantments
    PROTECTION("protection", "enchantment.minecraft.protection"),
    FIRE_PROTECTION("fire_protection", "enchantment.minecraft.fire_protection"),
    FEATHER_FALLING("feather_falling", "enchantment.minecraft.feather_falling"),
    BLAST_PROTECTION("blast_protection", "enchantment.minecraft.blast_protection"),
    PROJECTILE_PROTECTION("projectile_protection", "enchantment.minecraft.projectile_protection"),
    RESPIRATION("respiration", "enchantment.minecraft.respiration"),
    AQUA_AFFINITY("aqua_affinity", "enchantment.minecraft.aqua_affinity"),
    THORNS("thorns", "enchantment.minecraft.thorns"),
    DEPTH_STRIDER("depth_strider", "enchantment.minecraft.depth_strider"),
    FROST_WALKER("frost_walker", "enchantment.minecraft.frost_walker"),
    BINDING_CURSE("binding_curse", "enchantment.minecraft.binding_curse"),
    SOUL_SPEED("soul_speed", "enchantment.minecraft.soul_speed"),
    SWIFT_SNEAK("swift_sneak", "enchantment.minecraft.swift_sneak"),

    // Weapon enchantments
    SHARPNESS("sharpness", "enchantment.minecraft.sharpness"),
    SMITE("smite", "enchantment.minecraft.smite"),
    BANE_OF_ARTHROPODS("bane_of_arthropods", "enchantment.minecraft.bane_of_arthropods"),
    KNOCKBACK("knockback", "enchantment.minecraft.knockback"),
    FIRE_ASPECT("fire_aspect", "enchantment.minecraft.fire_aspect"),
    LOOTING("looting", "enchantment.minecraft.looting"),
    SWEEPING_EDGE("sweeping_edge", "enchantment.minecraft.sweeping"),

    // Tool enchantments
    EFFICIENCY("efficiency", "enchantment.minecraft.efficiency"),
    SILK_TOUCH("silk_touch", "enchantment.minecraft.silk_touch"),
    UNBREAKING("unbreaking", "enchantment.minecraft.unbreaking"),
    FORTUNE("fortune", "enchantment.minecraft.fortune"),

    // Bow enchantments
    POWER("power", "enchantment.minecraft.power"),
    PUNCH("punch", "enchantment.minecraft.punch"),
    FLAME("flame", "enchantment.minecraft.flame"),
    INFINITY("infinity", "enchantment.minecraft.infinity"),

    // Fishing rod enchantments
    LUCK_OF_THE_SEA("luck_of_the_sea", "enchantment.minecraft.luck_of_the_sea"),
    LURE("lure", "enchantment.minecraft.lure"),

    // Trident enchantments
    LOYALTY("loyalty", "enchantment.minecraft.loyalty"),
    IMPALING("impaling", "enchantment.minecraft.impaling"),
    RIPTIDE("riptide", "enchantment.minecraft.riptide"),
    CHANNELING("channeling", "enchantment.minecraft.channeling"),

    // Crossbow enchantments
    MULTISHOT("multishot", "enchantment.minecraft.multishot"),
    QUICK_CHARGE("quick_charge", "enchantment.minecraft.quick_charge"),
    PIERCING("piercing", "enchantment.minecraft.piercing"),

    // Mace enchantments (1.21+)
    DENSITY("density", "enchantment.minecraft.density"),
    BREACH("breach", "enchantment.minecraft.breach"),
    WIND_BURST("wind_burst", "enchantment.minecraft.wind_burst"),

    // Other enchantments
    MENDING("mending", "enchantment.minecraft.mending"),
    VANISHING_CURSE("vanishing_curse", "enchantment.minecraft.vanishing_curse");

    private static final Map<Enchantment, EnumEnchantment> lookup = new HashMap<>();

    static {
        for (EnumEnchantment enumEnch : EnumSet.allOf(EnumEnchantment.class)) {
            Enchantment ench = enumEnch.getEnchantment();
            if (ench != null) {
                lookup.put(ench, enumEnch);
            }
        }
    }

    private final String key;
    private final String unlocalizedName;

    /**
     * Create an index of enchantments.
     */
    EnumEnchantment(String key, String unlocalizedName) {
        this.key = key;
        this.unlocalizedName = unlocalizedName;
    }

    /**
     * Get the index of an enchantment based on {@link EnumEnchantment}.
     *
     * @param enchantment The enchantment.
     * @return The index of the item.
     */
    public static EnumEnchantment get(Enchantment enchantment) {
        return lookup.get(enchantment);
    }

    /**
     * @return The {@link Enchantment} of the enchantment.
     */
    public Enchantment getEnchantment() {
        return Registry.ENCHANTMENT.get(NamespacedKey.minecraft(key));
    }

    /**
     * @return The registry key of the enchantment.
     */
    public String getKey() {
        return key;
    }

    /**
     * @return The unlocalized name of the enchantment.
     */
    public String getUnlocalizedName() {
        return unlocalizedName;
    }
}
