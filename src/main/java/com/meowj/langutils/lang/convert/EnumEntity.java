/*
 * Copyright (c) 2015 Jerrell Fang
 *
 * This project is Open Source and distributed under The MIT License (MIT)
 * (http://opensource.org/licenses/MIT)
 *
 * You should have received a copy of the The MIT License along with
 * this project.   If not, see <http://opensource.org/licenses/MIT>.
 */

package com.meowj.langutils.lang.convert;

import org.bukkit.entity.EntityType;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

/**
 * Created by Meow J on 7/7/2015.
 * <p>
 * A list of {@link org.bukkit.entity.EntityType}
 *
 * @author Meow J
 */
public enum EnumEntity {
    // Renamed in 1.20.5+
    ITEM(EntityType.ITEM, "entity.minecraft.item"),
    EXPERIENCE_ORB(EntityType.EXPERIENCE_ORB, "entity.minecraft.experience_orb"),
    AREA_EFFECT_CLOUD(EntityType.AREA_EFFECT_CLOUD, "entity.minecraft.area_effect_cloud"),
    ELDER_GUARDIAN(EntityType.ELDER_GUARDIAN, "entity.minecraft.elder_guardian"),
    WITHER_SKELETON(EntityType.WITHER_SKELETON, "entity.minecraft.wither_skeleton"),
    STRAY(EntityType.STRAY, "entity.minecraft.stray"),
    EGG(EntityType.EGG, "entity.minecraft.egg"),
    LEASH_KNOT(EntityType.LEASH_KNOT, "entity.minecraft.leash_knot"),
    PAINTING(EntityType.PAINTING, "entity.minecraft.painting"),
    ARROW(EntityType.ARROW, "entity.minecraft.arrow"),
    SNOWBALL(EntityType.SNOWBALL, "entity.minecraft.snowball"),
    FIREBALL(EntityType.FIREBALL, "entity.minecraft.fireball"),
    SMALL_FIREBALL(EntityType.SMALL_FIREBALL, "entity.minecraft.small_fireball"),
    ENDER_PEARL(EntityType.ENDER_PEARL, "entity.minecraft.ender_pearl"),
    EYE_OF_ENDER(EntityType.EYE_OF_ENDER, "entity.minecraft.eye_of_ender"),
    SPLASH_POTION(EntityType.SPLASH_POTION, "entity.minecraft.potion"),
    EXPERIENCE_BOTTLE(EntityType.EXPERIENCE_BOTTLE, "entity.minecraft.experience_bottle"),
    ITEM_FRAME(EntityType.ITEM_FRAME, "entity.minecraft.item_frame"),
    GLOW_ITEM_FRAME(EntityType.GLOW_ITEM_FRAME, "entity.minecraft.glow_item_frame"),
    WITHER_SKULL(EntityType.WITHER_SKULL, "entity.minecraft.wither_skull"),
    TNT(EntityType.TNT, "entity.minecraft.tnt"),
    FALLING_BLOCK(EntityType.FALLING_BLOCK, "entity.minecraft.falling_block"),
    FIREWORK_ROCKET(EntityType.FIREWORK_ROCKET, "entity.minecraft.firework_rocket"),
    HUSK(EntityType.HUSK, "entity.minecraft.husk"),
    SPECTRAL_ARROW(EntityType.SPECTRAL_ARROW, "entity.minecraft.spectral_arrow"),
    SHULKER_BULLET(EntityType.SHULKER_BULLET, "entity.minecraft.shulker_bullet"),
    DRAGON_FIREBALL(EntityType.DRAGON_FIREBALL, "entity.minecraft.dragon_fireball"),
    ZOMBIE_VILLAGER(EntityType.ZOMBIE_VILLAGER, "entity.minecraft.zombie_villager"),
    SKELETON_HORSE(EntityType.SKELETON_HORSE, "entity.minecraft.skeleton_horse"),
    ZOMBIE_HORSE(EntityType.ZOMBIE_HORSE, "entity.minecraft.zombie_horse"),
    ARMOR_STAND(EntityType.ARMOR_STAND, "entity.minecraft.armor_stand"),
    DONKEY(EntityType.DONKEY, "entity.minecraft.donkey"),
    MULE(EntityType.MULE, "entity.minecraft.mule"),
    EVOKER_FANGS(EntityType.EVOKER_FANGS, "entity.minecraft.evoker_fangs"),
    EVOKER(EntityType.EVOKER, "entity.minecraft.evoker"),
    VEX(EntityType.VEX, "entity.minecraft.vex"),
    VINDICATOR(EntityType.VINDICATOR, "entity.minecraft.vindicator"),
    ILLUSIONER(EntityType.ILLUSIONER, "entity.minecraft.illusioner"),
    COMMAND_BLOCK_MINECART(EntityType.COMMAND_BLOCK_MINECART, "entity.minecraft.command_block_minecart"),
    MINECART(EntityType.MINECART, "entity.minecraft.minecart"),
    CHEST_MINECART(EntityType.CHEST_MINECART, "entity.minecraft.chest_minecart"),
    FURNACE_MINECART(EntityType.FURNACE_MINECART, "entity.minecraft.furnace_minecart"),
    TNT_MINECART(EntityType.TNT_MINECART, "entity.minecraft.tnt_minecart"),
    HOPPER_MINECART(EntityType.HOPPER_MINECART, "entity.minecraft.hopper_minecart"),
    SPAWNER_MINECART(EntityType.SPAWNER_MINECART, "entity.minecraft.spawner_minecart"),
    CREEPER(EntityType.CREEPER, "entity.minecraft.creeper"),
    SKELETON(EntityType.SKELETON, "entity.minecraft.skeleton"),
    SPIDER(EntityType.SPIDER, "entity.minecraft.spider"),
    GIANT(EntityType.GIANT, "entity.minecraft.giant"),
    ZOMBIE(EntityType.ZOMBIE, "entity.minecraft.zombie"),
    SLIME(EntityType.SLIME, "entity.minecraft.slime"),
    GHAST(EntityType.GHAST, "entity.minecraft.ghast"),
    PIGLIN(EntityType.PIGLIN, "entity.minecraft.piglin"),
    ZOMBIFIED_PIGLIN(EntityType.ZOMBIFIED_PIGLIN, "entity.minecraft.zombified_piglin"),
    HOGLIN(EntityType.HOGLIN, "entity.minecraft.hoglin"),
    STRIDER(EntityType.STRIDER, "entity.minecraft.strider"),
    ZOGLIN(EntityType.ZOGLIN, "entity.minecraft.zoglin"),
    ENDERMAN(EntityType.ENDERMAN, "entity.minecraft.enderman"),
    CAVE_SPIDER(EntityType.CAVE_SPIDER, "entity.minecraft.cave_spider"),
    SILVERFISH(EntityType.SILVERFISH, "entity.minecraft.silverfish"),
    BLAZE(EntityType.BLAZE, "entity.minecraft.blaze"),
    MAGMA_CUBE(EntityType.MAGMA_CUBE, "entity.minecraft.magma_cube"),
    ENDER_DRAGON(EntityType.ENDER_DRAGON, "entity.minecraft.ender_dragon"),
    WITHER(EntityType.WITHER, "entity.minecraft.wither"),
    BAT(EntityType.BAT, "entity.minecraft.bat"),
    WITCH(EntityType.WITCH, "entity.minecraft.witch"),
    ENDERMITE(EntityType.ENDERMITE, "entity.minecraft.endermite"),
    GUARDIAN(EntityType.GUARDIAN, "entity.minecraft.guardian"),
    SHULKER(EntityType.SHULKER, "entity.minecraft.shulker"),
    PIG(EntityType.PIG, "entity.minecraft.pig"),
    SHEEP(EntityType.SHEEP, "entity.minecraft.sheep"),
    COW(EntityType.COW, "entity.minecraft.cow"),
    CHICKEN(EntityType.CHICKEN, "entity.minecraft.chicken"),
    SQUID(EntityType.SQUID, "entity.minecraft.squid"),
    GLOW_SQUID(EntityType.GLOW_SQUID, "entity.minecraft.glow_squid"),
    WOLF(EntityType.WOLF, "entity.minecraft.wolf"),
    MOOSHROOM(EntityType.MOOSHROOM, "entity.minecraft.mooshroom"),
    SNOW_GOLEM(EntityType.SNOW_GOLEM, "entity.minecraft.snow_golem"),
    OCELOT(EntityType.OCELOT, "entity.minecraft.ocelot"),
    IRON_GOLEM(EntityType.IRON_GOLEM, "entity.minecraft.iron_golem"),
    HORSE(EntityType.HORSE, "entity.minecraft.horse"),
    RABBIT(EntityType.RABBIT, "entity.minecraft.rabbit"),
    POLAR_BEAR(EntityType.POLAR_BEAR, "entity.minecraft.polar_bear"),
    LLAMA(EntityType.LLAMA, "entity.minecraft.llama"),
    LLAMA_SPIT(EntityType.LLAMA_SPIT, "entity.minecraft.llama_spit"),
    PARROT(EntityType.PARROT, "entity.minecraft.parrot"),
    VILLAGER(EntityType.VILLAGER, "entity.minecraft.villager"),
    END_CRYSTAL(EntityType.END_CRYSTAL, "entity.minecraft.end_crystal"),
    TURTLE(EntityType.TURTLE, "entity.minecraft.turtle"),
    PHANTOM(EntityType.PHANTOM, "entity.minecraft.phantom"),
    TRIDENT(EntityType.TRIDENT, "entity.minecraft.trident"),
    COD(EntityType.COD, "entity.minecraft.cod"),
    SALMON(EntityType.SALMON, "entity.minecraft.salmon"),
    PUFFERFISH(EntityType.PUFFERFISH, "entity.minecraft.pufferfish"),
    TROPICAL_FISH(EntityType.TROPICAL_FISH, "entity.minecraft.tropical_fish"),
    DROWNED(EntityType.DROWNED, "entity.minecraft.drowned"),
    DOLPHIN(EntityType.DOLPHIN, "entity.minecraft.dolphin"),
    CAT(EntityType.CAT, "entity.minecraft.cat"),
    PANDA(EntityType.PANDA, "entity.minecraft.panda"),
    GOAT(EntityType.GOAT, "entity.minecraft.goat"),
    AXOLOTL(EntityType.AXOLOTL, "entity.minecraft.axolotl"),
    PILLAGER(EntityType.PILLAGER, "entity.minecraft.pillager"),
    RAVAGER(EntityType.RAVAGER, "entity.minecraft.ravager"),
    TRADER_LLAMA(EntityType.TRADER_LLAMA, "entity.minecraft.trader_llama"),
    WANDERING_TRADER(EntityType.WANDERING_TRADER, "entity.minecraft.wandering_trader"),
    FOX(EntityType.FOX, "entity.minecraft.fox"),
    BEE(EntityType.BEE, "entity.minecraft.bee"),
    FISHING_BOBBER(EntityType.FISHING_BOBBER, "entity.minecraft.fishing_bobber"),
    LIGHTNING_BOLT(EntityType.LIGHTNING_BOLT, "entity.minecraft.lightning_bolt"),
    PLAYER(EntityType.PLAYER, "entity.minecraft.player"),
    // 1.19 entities
    ALLAY(EntityType.ALLAY, "entity.minecraft.allay"),
    FROG(EntityType.FROG, "entity.minecraft.frog"),
    TADPOLE(EntityType.TADPOLE, "entity.minecraft.tadpole"),
    WARDEN(EntityType.WARDEN, "entity.minecraft.warden"),
    // 1.20 entities
    CAMEL(EntityType.CAMEL, "entity.minecraft.camel"),
    SNIFFER(EntityType.SNIFFER, "entity.minecraft.sniffer"),
    BLOCK_DISPLAY(EntityType.BLOCK_DISPLAY, "entity.minecraft.block_display"),
    ITEM_DISPLAY(EntityType.ITEM_DISPLAY, "entity.minecraft.item_display"),
    TEXT_DISPLAY(EntityType.TEXT_DISPLAY, "entity.minecraft.text_display"),
    INTERACTION(EntityType.INTERACTION, "entity.minecraft.interaction"),
    // 1.20.3 entities
    BREEZE(EntityType.BREEZE, "entity.minecraft.breeze"),
    WIND_CHARGE(EntityType.WIND_CHARGE, "entity.minecraft.wind_charge"),
    // 1.20.5 entities
    ARMADILLO(EntityType.ARMADILLO, "entity.minecraft.armadillo"),
    BOGGED(EntityType.BOGGED, "entity.minecraft.bogged"),
    BREEZE_WIND_CHARGE(EntityType.BREEZE_WIND_CHARGE, "entity.minecraft.breeze_wind_charge"),
    OMINOUS_ITEM_SPAWNER(EntityType.OMINOUS_ITEM_SPAWNER, "entity.minecraft.ominous_item_spawner"),
    // Boats (separated by wood type in newer versions)
    OAK_BOAT(EntityType.OAK_BOAT, "entity.minecraft.oak_boat"),
    SPRUCE_BOAT(EntityType.SPRUCE_BOAT, "entity.minecraft.spruce_boat"),
    BIRCH_BOAT(EntityType.BIRCH_BOAT, "entity.minecraft.birch_boat"),
    JUNGLE_BOAT(EntityType.JUNGLE_BOAT, "entity.minecraft.jungle_boat"),
    ACACIA_BOAT(EntityType.ACACIA_BOAT, "entity.minecraft.acacia_boat"),
    CHERRY_BOAT(EntityType.CHERRY_BOAT, "entity.minecraft.cherry_boat"),
    DARK_OAK_BOAT(EntityType.DARK_OAK_BOAT, "entity.minecraft.dark_oak_boat"),
    PALE_OAK_BOAT(EntityType.PALE_OAK_BOAT, "entity.minecraft.pale_oak_boat"),
    MANGROVE_BOAT(EntityType.MANGROVE_BOAT, "entity.minecraft.mangrove_boat"),
    BAMBOO_RAFT(EntityType.BAMBOO_RAFT, "entity.minecraft.bamboo_raft"),
    OAK_CHEST_BOAT(EntityType.OAK_CHEST_BOAT, "entity.minecraft.oak_chest_boat"),
    SPRUCE_CHEST_BOAT(EntityType.SPRUCE_CHEST_BOAT, "entity.minecraft.spruce_chest_boat"),
    BIRCH_CHEST_BOAT(EntityType.BIRCH_CHEST_BOAT, "entity.minecraft.birch_chest_boat"),
    JUNGLE_CHEST_BOAT(EntityType.JUNGLE_CHEST_BOAT, "entity.minecraft.jungle_chest_boat"),
    ACACIA_CHEST_BOAT(EntityType.ACACIA_CHEST_BOAT, "entity.minecraft.acacia_chest_boat"),
    CHERRY_CHEST_BOAT(EntityType.CHERRY_CHEST_BOAT, "entity.minecraft.cherry_chest_boat"),
    DARK_OAK_CHEST_BOAT(EntityType.DARK_OAK_CHEST_BOAT, "entity.minecraft.dark_oak_chest_boat"),
    PALE_OAK_CHEST_BOAT(EntityType.PALE_OAK_CHEST_BOAT, "entity.minecraft.pale_oak_chest_boat"),
    MANGROVE_CHEST_BOAT(EntityType.MANGROVE_CHEST_BOAT, "entity.minecraft.mangrove_chest_boat"),
    BAMBOO_CHEST_RAFT(EntityType.BAMBOO_CHEST_RAFT, "entity.minecraft.bamboo_chest_raft"),
    // Marker entity
    MARKER(EntityType.MARKER, "entity.minecraft.marker"),
    // 1.21.2 entities
    CREAKING(EntityType.CREAKING, "entity.minecraft.creaking"),
    // Fallback
    UNKNOWN(EntityType.UNKNOWN, "entity.notFound");

    private static final Map<EntityType, EnumEntity> lookup = new EnumMap<>(EntityType.class);

    static {
        for (EnumEntity entity : EnumSet.allOf(EnumEntity.class))
            lookup.put(entity.getType(), entity);
    }

    private EntityType type;
    private String unlocalizedName;

    EnumEntity(EntityType type, String unlocalizedName) {
        this.type = type;
        this.unlocalizedName = unlocalizedName;
    }

    /**
     * @param entityType The Entity type.
     * @return The index of an entity based on entity type
     */
    public static EnumEntity get(EntityType entityType) {
        return lookup.get(entityType);
    }

    public String getUnlocalizedName() {
        return unlocalizedName;
    }

    public EntityType getType() {
        return type;
    }

}
