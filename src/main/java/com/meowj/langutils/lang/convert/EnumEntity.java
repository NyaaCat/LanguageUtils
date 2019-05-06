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
    DROPPED_ITEM(EntityType.DROPPED_ITEM, "entity.minecraft.item"),
    EXPERIENCE_ORB(EntityType.EXPERIENCE_ORB, "entity.minecraft.experience_orb"),
    AREA_EFFECT_CLOUD(EntityType.AREA_EFFECT_CLOUD, "entity.minecraft.area_effect_cloud"),
    ELDER_GUARDIAN(EntityType.ELDER_GUARDIAN, "entity.minecraft.elder_guardian"),
    WITHER_SKELETON(EntityType.WITHER_SKELETON, "entity.minecraft.wither_skeleton"),
    STRAY(EntityType.STRAY, "entity.minecraft.stray"),
    EGG(EntityType.EGG, "entity.minecraft.egg"),
    LEASH_HITCH(EntityType.LEASH_HITCH, "entity.minecraft.leash_knot"),
    PAINTING(EntityType.PAINTING, "entity.minecraft.painting"),
    ARROW(EntityType.ARROW, "entity.minecraft.arrow"),
    SNOWBALL(EntityType.SNOWBALL, "entity.minecraft.snowball"),
    FIREBALL(EntityType.FIREBALL, "entity.minecraft.fireball"),
    SMALL_FIREBALL(EntityType.SMALL_FIREBALL, "entity.minecraft.small_fireball"),
    ENDER_PEARL(EntityType.ENDER_PEARL, "entity.minecraft.ender_pearl"),
    ENDER_SIGNAL(EntityType.ENDER_SIGNAL, "entity.minecraft.eye_of_ender"),
    SPLASH_POTION(EntityType.SPLASH_POTION, "entity.minecraft.potion"),
    THROWN_EXP_BOTTLE(EntityType.THROWN_EXP_BOTTLE, "entity.minecraft.experience_bottle"),
    ITEM_FRAME(EntityType.ITEM_FRAME, "entity.minecraft.item_frame"),
    WITHER_SKULL(EntityType.WITHER_SKULL, "entity.minecraft.wither_skull"),
    PRIMED_TNT(EntityType.PRIMED_TNT, "entity.minecraft.tnt"),
    FALLING_BLOCK(EntityType.FALLING_BLOCK, "entity.minecraft.falling_block"),
    FIREWORK(EntityType.FIREWORK, "entity.minecraft.firework_rocket"),
    HUSK(EntityType.HUSK, "entity.minecraft.husk"),
    SPECTRAL_ARROW(EntityType.SPECTRAL_ARROW, "entity.minecraft.spectral_arrow"),
    SHULKER_BULLET(EntityType.SHULKER_BULLET, "entity.minecraft.shulker_bullet"),
    DRAGON_FIREBALL(EntityType.DRAGON_FIREBALL, "entity.minecraft.dragon_fireball"),
    ZOMBIE_VILLAGER(EntityType.ZOMBIE_VILLAGER, "entity.minecraft.zombie_villager"),
    SKELETON_HORSE(EntityType.SKELETON_HORSE, "entity.minecraft.skeleton_horse"),
    ZOMBIE_HORSE(EntityType.ZOMBIE_HORSE, "entity.minecraft.zombie_horse"),
    ARMOR_STAND(EntityType.ARMOR_STAND, "entity.minecraft.armor_stand"),
    MULE(EntityType.MULE, "entity.minecraft.mule"),
    EVOKER_FANGS(EntityType.EVOKER_FANGS, "entity.minecraft.evoker_fangs"),
    EVOKER(EntityType.EVOKER, "entity.minecraft.evoker"),
    VEX(EntityType.VEX, "entity.minecraft.vex"),
    VINDICATOR(EntityType.VINDICATOR, "entity.minecraft.vindicator"),
    ILLUSIONER(EntityType.ILLUSIONER, "entity.minecraft.illusioner"),
    MINECART_COMMAND(EntityType.MINECART_COMMAND, "entity.minecraft.command_block_minecart"),
    BOAT(EntityType.BOAT, "entity.minecraft.boat"),
    MINECART(EntityType.MINECART, "entity.minecraft.minecart"),
    MINECART_CHEST(EntityType.MINECART_CHEST, "entity.minecraft.chest_minecart"),
    MINECART_FURNACE(EntityType.MINECART_FURNACE, "entity.minecraft.furnace_minecart"),
    MINECART_TNT(EntityType.MINECART_TNT, "entity.minecraft.tnt_minecart"),
    MINECART_HOPPER(EntityType.MINECART_HOPPER, "entity.minecraft.hopper_minecart"),
    MINECART_MOB_SPAWNER(EntityType.MINECART_MOB_SPAWNER, "entity.minecraft.spawner_minecart"),
    CREEPER(EntityType.CREEPER, "entity.minecraft.creeper"),
    SKELETON(EntityType.SKELETON, "entity.minecraft.skeleton"),
    SPIDER(EntityType.SPIDER, "entity.minecraft.spider"),
    GIANT(EntityType.GIANT, "entity.minecraft.giant"),
    ZOMBIE(EntityType.ZOMBIE, "entity.minecraft.zombie"),
    SLIME(EntityType.SLIME, "entity.minecraft.slime"),
    GHAST(EntityType.GHAST, "entity.minecraft.ghast"),
    PIG_ZOMBIE(EntityType.PIG_ZOMBIE, "entity.minecraft.zombie_pigman"),
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
    WOLF(EntityType.WOLF, "entity.minecraft.wolf"),
    MUSHROOM_COW(EntityType.MUSHROOM_COW, "entity.minecraft.mooshroom"),
    SNOWMAN(EntityType.SNOWMAN, "entity.minecraft.snow_golem"),
    OCELOT(EntityType.OCELOT, "entity.minecraft.ocelot"),
    IRON_GOLEM(EntityType.IRON_GOLEM, "entity.minecraft.iron_golem"),
    HORSE(EntityType.HORSE, "entity.minecraft.horse"),
    RABBIT(EntityType.RABBIT, "entity.minecraft.rabbit"),
    POLAR_BEAR(EntityType.POLAR_BEAR, "entity.minecraft.polar_bear"),
    LLAMA(EntityType.LLAMA, "entity.minecraft.llama"),
    LLAMA_SPIT(EntityType.LLAMA_SPIT, "entity.minecraft.llama_spit"),
    PARROT(EntityType.PARROT, "entity.minecraft.parrot"),
    VILLAGER(EntityType.VILLAGER, "entity.minecraft.villager"),
    ENDER_CRYSTAL(EntityType.ENDER_CRYSTAL, "entity.minecraft.end_crystal"),
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
    PILLAGER(EntityType.PILLAGER, "entity.minecraft.pillager"),
    RAVAGER(EntityType.RAVAGER, "entity.minecraft.ravager"),
    TRADER_LLAMA(EntityType.TRADER_LLAMA, "entity.minecraft.trader_llama"),
    WANDERING_TRADER(EntityType.WANDERING_TRADER, "entity.minecraft.wandering_trader"),
    FOX(EntityType.FOX, "entity.minecraft.fox"),
    FISHING_HOOK(EntityType.FISHING_HOOK, "entity.minecraft.fishing_bobber"),
    LIGHTNING(EntityType.LIGHTNING, "entity.minecraft.lightning_bolt"),
    PLAYER(EntityType.PLAYER, "entity.minecraft.player"),
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
