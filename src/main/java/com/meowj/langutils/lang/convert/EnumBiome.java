package com.meowj.langutils.lang.convert;

import org.bukkit.block.Biome;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

public enum EnumBiome {
	BADLANDS(Biome.BADLANDS, "biome.minecraft.badlands"),
	BAMBOO_JUNGLE(Biome.BAMBOO_JUNGLE, "biome.minecraft.bamboo_jungle"),
	BASALT_DELTAS(Biome.BASALT_DELTAS, "biome.minecraft.basalt_deltas"),
	BEACH(Biome.BEACH, "biome.minecraft.beach"),
	BIRCH_FOREST(Biome.BIRCH_FOREST, "biome.minecraft.birch_forest"),
	COLD_OCEAN(Biome.COLD_OCEAN, "biome.minecraft.cold_ocean"),
	CRIMSON_FOREST(Biome.CRIMSON_FOREST, "biome.minecraft.crimson_forest"),
	DARK_FOREST(Biome.DARK_FOREST, "biome.minecraft.dark_forest"),
	DEEP_COLD_OCEAN(Biome.DEEP_COLD_OCEAN, "biome.minecraft.deep_cold_ocean"),
	DEEP_FROZEN_OCEAN(Biome.DEEP_FROZEN_OCEAN, "biome.minecraft.deep_frozen_ocean"),
	DEEP_LUKEWARM_OCEAN(Biome.DEEP_LUKEWARM_OCEAN, "biome.minecraft.deep_lukewarm_ocean"),
	DEEP_OCEAN(Biome.DEEP_OCEAN, "biome.minecraft.deep_ocean"),
	DESERT(Biome.DESERT, "biome.minecraft.desert"),
	DRIPSTONE_CAVES(Biome.DRIPSTONE_CAVES, "biome.minecraft.dripstone_caves"),
	END_BARRENS(Biome.END_BARRENS, "biome.minecraft.end_barrens"),
	END_HIGHLANDS(Biome.END_HIGHLANDS, "biome.minecraft.end_highlands"),
	END_MIDLANDS(Biome.END_MIDLANDS, "biome.minecraft.end_midlands"),
	ERODED_BADLANDS(Biome.ERODED_BADLANDS, "biome.minecraft.eroded_badlands"),
	FLOWER_FOREST(Biome.FLOWER_FOREST, "biome.minecraft.flower_forest"),
	FOREST(Biome.FOREST, "biome.minecraft.forest"),
	FROZEN_OCEAN(Biome.FROZEN_OCEAN, "biome.minecraft.frozen_ocean"),
	FROZEN_PEAKS(Biome.FROZEN_PEAKS, "biome.minecraft.frozen_peaks"),
	FROZEN_RIVER(Biome.FROZEN_RIVER, "biome.minecraft.frozen_river"),
	GROVE(Biome.GROVE, "biome.minecraft.grove"),
	ICE_SPIKES(Biome.ICE_SPIKES, "biome.minecraft.ice_spikes"),
	JAGGED_PEAKS(Biome.JAGGED_PEAKS, "biome.minecraft.jagged_peaks"),
	JUNGLE(Biome.JUNGLE, "biome.minecraft.jungle"),
	LUKEWARM_OCEAN(Biome.LUKEWARM_OCEAN, "biome.minecraft.lukewarm_ocean"),
	LUSH_CAVES(Biome.LUSH_CAVES, "biome.minecraft.lush_caves"),
	MEADOW(Biome.MEADOW, "biome.minecraft.meadow"),
	MUSHROOM_FIELDS(Biome.MUSHROOM_FIELDS, "biome.minecraft.mushroom_fields"),
	NETHER_WASTES(Biome.NETHER_WASTES, "biome.minecraft.nether_wastes"),
	OCEAN(Biome.OCEAN, "biome.minecraft.ocean"),
	OLD_GROWTH_BIRCH_FOREST(Biome.OLD_GROWTH_BIRCH_FOREST, "biome.minecraft.old_growth_birch_forest"),
	OLD_GROWTH_PINE_TAIGA(Biome.OLD_GROWTH_PINE_TAIGA, "biome.minecraft.old_growth_pine_taiga"),
	OLD_GROWTH_SPRUCE_TAIGA(Biome.OLD_GROWTH_SPRUCE_TAIGA, "biome.minecraft.old_growth_spruce_taiga"),
	PLAINS(Biome.PLAINS, "biome.minecraft.plains"),
	RIVER(Biome.RIVER, "biome.minecraft.river"),
	SAVANNA(Biome.SAVANNA, "biome.minecraft.savanna"),
	SAVANNA_PLATEAU(Biome.SAVANNA_PLATEAU, "biome.minecraft.savanna_plateau"),
	SHATTERED_SAVANNA(Biome.WINDSWEPT_SAVANNA, "biome.minecraft.windswept_savanna"),
	SMALL_END_ISLANDS(Biome.SMALL_END_ISLANDS, "biome.minecraft.small_end_islands"),
	SNOWY_BEACH(Biome.SNOWY_BEACH, "biome.minecraft.snowy_beach"),
	SNOWY_PLAINS(Biome.SNOWY_PLAINS, "biome.minecraft.snowy_plains"),
	SNOWY_SLOPES(Biome.SNOWY_SLOPES, "biome.minecraft.snowy_slopes"),
	SNOWY_TAIGA(Biome.SNOWY_TAIGA, "biome.minecraft.snowy_taiga"),
	SOUL_SAND_VALLEY(Biome.SOUL_SAND_VALLEY, "biome.minecraft.soul_sand_valley"),
	SPARSE_JUNGLE(Biome.SPARSE_JUNGLE, "biome.minecraft.sparse_jungle"),
	STONY_PEAKS(Biome.STONY_PEAKS, "biome.minecraft.stony_peaks"),
	STONY_SHORE(Biome.STONY_SHORE, "biome.minecraft.stony_shore"),
	SUNFLOWER_PLAINS(Biome.SUNFLOWER_PLAINS, "biome.minecraft.sunflower_plains"),
	SWAMP(Biome.SWAMP, "biome.minecraft.swamp"),
	TAIGA(Biome.TAIGA, "biome.minecraft.taiga"),
	THE_END(Biome.THE_END, "biome.minecraft.the_end"),
	THE_VOID(Biome.THE_VOID, "biome.minecraft.the_void"),
	WARM_OCEAN(Biome.WARM_OCEAN, "biome.minecraft.warm_ocean"),
	WARPED_FOREST(Biome.WARPED_FOREST, "biome.minecraft.warped_forest"),
	WINDSWEPT_FOREST(Biome.WINDSWEPT_FOREST, "biome.minecraft.windswept_forest"),
	WINDSWEPT_GRAVELLY_HILLS(Biome.WINDSWEPT_GRAVELLY_HILLS, "biome.minecraft.windswept_gravelly_hills"),
	WINDSWEPT_HILLS(Biome.WINDSWEPT_HILLS, "biome.minecraft.windswept_hills"),
	WOODED_BADLANDS(Biome.WOODED_BADLANDS, "biome.minecraft.wooded_badlands");

    private static final Map<Biome, EnumBiome> lookup = new EnumMap<>(Biome.class);

    static {
        for (EnumBiome biome : EnumSet.allOf(EnumBiome.class))
            lookup.put(biome.getBiome(), biome);
    }

    private final Biome biome;
    private final String unlocalizedName;

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
