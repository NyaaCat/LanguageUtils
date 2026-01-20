package com.meowj.langutils.lang.convert;

import org.bukkit.block.Biome;

import java.util.HashMap;
import java.util.Map;

/**
 * A list of {@link org.bukkit.block.Biome}
 * Updated for 1.18+ where the biome system was overhauled.
 */
public enum EnumBiome {
    // Overworld - Ocean biomes
    OCEAN(Biome.OCEAN, "biome.minecraft.ocean"),
    DEEP_OCEAN(Biome.DEEP_OCEAN, "biome.minecraft.deep_ocean"),
    COLD_OCEAN(Biome.COLD_OCEAN, "biome.minecraft.cold_ocean"),
    DEEP_COLD_OCEAN(Biome.DEEP_COLD_OCEAN, "biome.minecraft.deep_cold_ocean"),
    FROZEN_OCEAN(Biome.FROZEN_OCEAN, "biome.minecraft.frozen_ocean"),
    DEEP_FROZEN_OCEAN(Biome.DEEP_FROZEN_OCEAN, "biome.minecraft.deep_frozen_ocean"),
    LUKEWARM_OCEAN(Biome.LUKEWARM_OCEAN, "biome.minecraft.lukewarm_ocean"),
    DEEP_LUKEWARM_OCEAN(Biome.DEEP_LUKEWARM_OCEAN, "biome.minecraft.deep_lukewarm_ocean"),
    WARM_OCEAN(Biome.WARM_OCEAN, "biome.minecraft.warm_ocean"),

    // Overworld - Plains biomes
    PLAINS(Biome.PLAINS, "biome.minecraft.plains"),
    SUNFLOWER_PLAINS(Biome.SUNFLOWER_PLAINS, "biome.minecraft.sunflower_plains"),
    SNOWY_PLAINS(Biome.SNOWY_PLAINS, "biome.minecraft.snowy_plains"),
    ICE_SPIKES(Biome.ICE_SPIKES, "biome.minecraft.ice_spikes"),

    // Overworld - Desert biome
    DESERT(Biome.DESERT, "biome.minecraft.desert"),

    // Overworld - Forest biomes
    FOREST(Biome.FOREST, "biome.minecraft.forest"),
    FLOWER_FOREST(Biome.FLOWER_FOREST, "biome.minecraft.flower_forest"),
    BIRCH_FOREST(Biome.BIRCH_FOREST, "biome.minecraft.birch_forest"),
    OLD_GROWTH_BIRCH_FOREST(Biome.OLD_GROWTH_BIRCH_FOREST, "biome.minecraft.old_growth_birch_forest"),
    DARK_FOREST(Biome.DARK_FOREST, "biome.minecraft.dark_forest"),

    // Overworld - Taiga biomes
    TAIGA(Biome.TAIGA, "biome.minecraft.taiga"),
    OLD_GROWTH_PINE_TAIGA(Biome.OLD_GROWTH_PINE_TAIGA, "biome.minecraft.old_growth_pine_taiga"),
    OLD_GROWTH_SPRUCE_TAIGA(Biome.OLD_GROWTH_SPRUCE_TAIGA, "biome.minecraft.old_growth_spruce_taiga"),
    SNOWY_TAIGA(Biome.SNOWY_TAIGA, "biome.minecraft.snowy_taiga"),

    // Overworld - Jungle biomes
    JUNGLE(Biome.JUNGLE, "biome.minecraft.jungle"),
    SPARSE_JUNGLE(Biome.SPARSE_JUNGLE, "biome.minecraft.sparse_jungle"),
    BAMBOO_JUNGLE(Biome.BAMBOO_JUNGLE, "biome.minecraft.bamboo_jungle"),

    // Overworld - Badlands biomes
    BADLANDS(Biome.BADLANDS, "biome.minecraft.badlands"),
    ERODED_BADLANDS(Biome.ERODED_BADLANDS, "biome.minecraft.eroded_badlands"),
    WOODED_BADLANDS(Biome.WOODED_BADLANDS, "biome.minecraft.wooded_badlands"),

    // Overworld - Savanna biomes
    SAVANNA(Biome.SAVANNA, "biome.minecraft.savanna"),
    SAVANNA_PLATEAU(Biome.SAVANNA_PLATEAU, "biome.minecraft.savanna_plateau"),
    WINDSWEPT_SAVANNA(Biome.WINDSWEPT_SAVANNA, "biome.minecraft.windswept_savanna"),

    // Overworld - Mountain biomes
    MEADOW(Biome.MEADOW, "biome.minecraft.meadow"),
    GROVE(Biome.GROVE, "biome.minecraft.grove"),
    SNOWY_SLOPES(Biome.SNOWY_SLOPES, "biome.minecraft.snowy_slopes"),
    FROZEN_PEAKS(Biome.FROZEN_PEAKS, "biome.minecraft.frozen_peaks"),
    JAGGED_PEAKS(Biome.JAGGED_PEAKS, "biome.minecraft.jagged_peaks"),
    STONY_PEAKS(Biome.STONY_PEAKS, "biome.minecraft.stony_peaks"),
    WINDSWEPT_HILLS(Biome.WINDSWEPT_HILLS, "biome.minecraft.windswept_hills"),
    WINDSWEPT_GRAVELLY_HILLS(Biome.WINDSWEPT_GRAVELLY_HILLS, "biome.minecraft.windswept_gravelly_hills"),
    WINDSWEPT_FOREST(Biome.WINDSWEPT_FOREST, "biome.minecraft.windswept_forest"),

    // Overworld - Swamp biomes
    SWAMP(Biome.SWAMP, "biome.minecraft.swamp"),
    MANGROVE_SWAMP(Biome.MANGROVE_SWAMP, "biome.minecraft.mangrove_swamp"),

    // Overworld - Beach and shore biomes
    BEACH(Biome.BEACH, "biome.minecraft.beach"),
    SNOWY_BEACH(Biome.SNOWY_BEACH, "biome.minecraft.snowy_beach"),
    STONY_SHORE(Biome.STONY_SHORE, "biome.minecraft.stony_shore"),

    // Overworld - River biomes
    RIVER(Biome.RIVER, "biome.minecraft.river"),
    FROZEN_RIVER(Biome.FROZEN_RIVER, "biome.minecraft.frozen_river"),

    // Overworld - Cave biomes
    DRIPSTONE_CAVES(Biome.DRIPSTONE_CAVES, "biome.minecraft.dripstone_caves"),
    LUSH_CAVES(Biome.LUSH_CAVES, "biome.minecraft.lush_caves"),
    DEEP_DARK(Biome.DEEP_DARK, "biome.minecraft.deep_dark"),

    // Overworld - Mushroom biome
    MUSHROOM_FIELDS(Biome.MUSHROOM_FIELDS, "biome.minecraft.mushroom_fields"),

    // Overworld - Cherry biome (1.20+)
    CHERRY_GROVE(Biome.CHERRY_GROVE, "biome.minecraft.cherry_grove"),

    // Overworld - Pale Garden biome (1.21.4+)
    PALE_GARDEN(Biome.PALE_GARDEN, "biome.minecraft.pale_garden"),

    // Nether biomes
    NETHER_WASTES(Biome.NETHER_WASTES, "biome.minecraft.nether_wastes"),
    SOUL_SAND_VALLEY(Biome.SOUL_SAND_VALLEY, "biome.minecraft.soul_sand_valley"),
    CRIMSON_FOREST(Biome.CRIMSON_FOREST, "biome.minecraft.crimson_forest"),
    WARPED_FOREST(Biome.WARPED_FOREST, "biome.minecraft.warped_forest"),
    BASALT_DELTAS(Biome.BASALT_DELTAS, "biome.minecraft.basalt_deltas"),

    // End biomes
    THE_END(Biome.THE_END, "biome.minecraft.the_end"),
    END_HIGHLANDS(Biome.END_HIGHLANDS, "biome.minecraft.end_highlands"),
    END_MIDLANDS(Biome.END_MIDLANDS, "biome.minecraft.end_midlands"),
    END_BARRENS(Biome.END_BARRENS, "biome.minecraft.end_barrens"),
    SMALL_END_ISLANDS(Biome.SMALL_END_ISLANDS, "biome.minecraft.small_end_islands"),

    // Special biome
    THE_VOID(Biome.THE_VOID, "biome.minecraft.the_void");

    private static final Map<Biome, EnumBiome> lookup = new HashMap<>();

    static {
        for (EnumBiome biome : values())
            lookup.put(biome.getBiome(), biome);
    }

    private Biome biome;
    private String unlocalizedName;

    EnumBiome(Biome biome, String unlocalizedName) {
        this.biome = biome;
        this.unlocalizedName = unlocalizedName;
    }

    /**
     * @param biomeType The Biome type.
     * @return The index of a biome based on biome type
     */
    public static EnumBiome get(Biome biomeType) {
        return lookup.get(biomeType);
    }

    public String getUnlocalizedName() {
        return unlocalizedName;
    }

    public Biome getBiome() {
        return biome;
    }

}
