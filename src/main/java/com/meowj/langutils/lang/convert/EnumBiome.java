package com.meowj.langutils.lang.convert;

import org.bukkit.block.Biome;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

public enum EnumBiome {
	BADLANDS(Biome.BADLANDS, "biome.minecraft.badlands"),
	BADLANDS_PLATEAU(Biome.BADLANDS_PLATEAU, "biome.minecraft.badlands_plateau"),
	BAMBOO_JUNGLE(Biome.BAMBOO_JUNGLE, "biome.minecraft.bamboo_jungle"),
	BAMBOO_JUNGLE_HILLS(Biome.BAMBOO_JUNGLE_HILLS, "biome.minecraft.bamboo_jungle_hills"),
	BEACH(Biome.BEACH, "biome.minecraft.beach"),
	BIRCH_FOREST(Biome.BIRCH_FOREST, "biome.minecraft.birch_forest"),
	BIRCH_FOREST_HILLS(Biome.BIRCH_FOREST_HILLS, "biome.minecraft.birch_forest_hills"),
	COLD_OCEAN(Biome.COLD_OCEAN, "biome.minecraft.cold_ocean"),
	DARK_FOREST(Biome.DARK_FOREST, "biome.minecraft.dark_forest"),
	DARK_FOREST_HILLS(Biome.DARK_FOREST_HILLS, "biome.minecraft.dark_forest_hills"),
	DEEP_COLD_OCEAN(Biome.DEEP_COLD_OCEAN, "biome.minecraft.deep_cold_ocean"),
	DEEP_FROZEN_OCEAN(Biome.DEEP_FROZEN_OCEAN, "biome.minecraft.deep_frozen_ocean"),
	DEEP_LUKEWARM_OCEAN(Biome.DEEP_LUKEWARM_OCEAN, "biome.minecraft.deep_lukewarm_ocean"),
	DEEP_OCEAN(Biome.DEEP_OCEAN, "biome.minecraft.deep_ocean"),
	DEEP_WARM_OCEAN(Biome.DEEP_WARM_OCEAN, "biome.minecraft.deep_warm_ocean"),
	DESERT(Biome.DESERT, "biome.minecraft.desert"),
	DESERT_HILLS(Biome.DESERT_HILLS, "biome.minecraft.desert_hills"),
	DESERT_LAKES(Biome.DESERT_LAKES, "biome.minecraft.desert_lakes"),
	END_BARRENS(Biome.END_BARRENS, "biome.minecraft.end_barrens"),
	END_HIGHLANDS(Biome.END_HIGHLANDS, "biome.minecraft.end_highlands"),
	END_MIDLANDS(Biome.END_MIDLANDS, "biome.minecraft.end_midlands"),
	ERODED_BADLANDS(Biome.ERODED_BADLANDS, "biome.minecraft.eroded_badlands"),
	FLOWER_FOREST(Biome.FLOWER_FOREST, "biome.minecraft.flower_forest"),
	FOREST(Biome.FOREST, "biome.minecraft.forest"),
	FROZEN_OCEAN(Biome.FROZEN_OCEAN, "biome.minecraft.frozen_ocean"),
	FROZEN_RIVER(Biome.FROZEN_RIVER, "biome.minecraft.frozen_river"),
	GIANT_SPRUCE_TAIGA(Biome.GIANT_SPRUCE_TAIGA, "biome.minecraft.giant_spruce_taiga"),
	GIANT_SPRUCE_TAIGA_HILLS(Biome.GIANT_SPRUCE_TAIGA_HILLS, "biome.minecraft.giant_spruce_taiga_hills"),
	GIANT_TREE_TAIGA(Biome.GIANT_TREE_TAIGA, "biome.minecraft.giant_tree_taiga"),
	GIANT_TREE_TAIGA_HILLS(Biome.GIANT_TREE_TAIGA_HILLS, "biome.minecraft.giant_tree_taiga_hills"),
	GRAVELLY_MOUNTAINS(Biome.GRAVELLY_MOUNTAINS, "biome.minecraft.gravelly_mountains"),
	ICE_SPIKES(Biome.ICE_SPIKES, "biome.minecraft.ice_spikes"),
	JUNGLE(Biome.JUNGLE, "biome.minecraft.jungle"),
	JUNGLE_EDGE(Biome.JUNGLE_EDGE, "biome.minecraft.jungle_edge"),
	JUNGLE_HILLS(Biome.JUNGLE_HILLS, "biome.minecraft.jungle_hills"),
	LUKEWARM_OCEAN(Biome.LUKEWARM_OCEAN, "biome.minecraft.lukewarm_ocean"),
	MODIFIED_BADLANDS_PLATEAU(Biome.MODIFIED_BADLANDS_PLATEAU, "biome.minecraft.modified_badlands_plateau"),
	MODIFIED_GRAVELLY_MOUNTAINS(Biome.MODIFIED_GRAVELLY_MOUNTAINS, "biome.minecraft.modified_gravelly_mountains"),
	MODIFIED_JUNGLE(Biome.MODIFIED_JUNGLE, "biome.minecraft.modified_jungle"),
	MODIFIED_JUNGLE_EDGE(Biome.MODIFIED_JUNGLE_EDGE, "biome.minecraft.modified_jungle_edge"),
	MODIFIED_WOODED_BADLANDS_PLATEAU(Biome.MODIFIED_WOODED_BADLANDS_PLATEAU, "biome.minecraft.modified_wooded_badlands_plateau"),
	MOUNTAIN_EDGE(Biome.MOUNTAIN_EDGE, "biome.minecraft.mountain_edge"),
	MOUNTAINS(Biome.MOUNTAINS, "biome.minecraft.mountains"),
	MUSHROOM_FIELD_SHORE(Biome.MUSHROOM_FIELD_SHORE, "biome.minecraft.mushroom_field_shore"),
	MUSHROOM_FIELDS(Biome.MUSHROOM_FIELDS, "biome.minecraft.mushroom_fields"),
	NETHER_WASTES(Biome.NETHER_WASTES, "biome.minecraft.nether_wastes"),
	SOUL_SAND_VALLEY(Biome.SOUL_SAND_VALLEY, "biome.minecraft.soul_sand_valley"),
	CRIMSON_FOREST(Biome.CRIMSON_FOREST, "biome.minecraft.crimson_forest"),
	WARPED_FOREST(Biome.WARPED_FOREST, "biome.minecraft.warped_forest"),
	BASALT_DELTAS(Biome.BASALT_DELTAS, "biome.minecraft.basalt_deltas"),
	OCEAN(Biome.OCEAN, "biome.minecraft.ocean"),
	PLAINS(Biome.PLAINS, "biome.minecraft.plains"),
	RIVER(Biome.RIVER, "biome.minecraft.river"),
	SAVANNA(Biome.SAVANNA, "biome.minecraft.savanna"),
	SAVANNA_PLATEAU(Biome.SAVANNA_PLATEAU, "biome.minecraft.savanna_plateau"),
	SHATTERED_SAVANNA(Biome.SHATTERED_SAVANNA, "biome.minecraft.shattered_savanna"),
	SHATTERED_SAVANNA_PLATEAU(Biome.SHATTERED_SAVANNA_PLATEAU, "biome.minecraft.shattered_savanna_plateau"),
	SMALL_END_ISLANDS(Biome.SMALL_END_ISLANDS, "biome.minecraft.small_end_islands"),
	SNOWY_BEACH(Biome.SNOWY_BEACH, "biome.minecraft.snowy_beach"),
	SNOWY_MOUNTAINS(Biome.SNOWY_MOUNTAINS, "biome.minecraft.snowy_mountains"),
	SNOWY_TAIGA(Biome.SNOWY_TAIGA, "biome.minecraft.snowy_taiga"),
	SNOWY_TAIGA_HILLS(Biome.SNOWY_TAIGA_HILLS, "biome.minecraft.snowy_taiga_hills"),
	SNOWY_TAIGA_MOUNTAINS(Biome.SNOWY_TAIGA_MOUNTAINS, "biome.minecraft.snowy_taiga_mountains"),
	SNOWY_TUNDRA(Biome.SNOWY_TUNDRA, "biome.minecraft.snowy_tundra"),
	STONE_SHORE(Biome.STONE_SHORE, "biome.minecraft.stone_shore"),
	SUNFLOWER_PLAINS(Biome.SUNFLOWER_PLAINS, "biome.minecraft.sunflower_plains"),
	SWAMP(Biome.SWAMP, "biome.minecraft.swamp"),
	SWAMP_HILLS(Biome.SWAMP_HILLS, "biome.minecraft.swamp_hills"),
	TAIGA(Biome.TAIGA, "biome.minecraft.taiga"),
	TAIGA_HILLS(Biome.TAIGA_HILLS, "biome.minecraft.taiga_hills"),
	TAIGA_MOUNTAINS(Biome.TAIGA_MOUNTAINS, "biome.minecraft.taiga_mountains"),
	TALL_BIRCH_FOREST(Biome.TALL_BIRCH_FOREST, "biome.minecraft.tall_birch_forest"),
	TALL_BIRCH_HILLS(Biome.TALL_BIRCH_HILLS, "biome.minecraft.tall_birch_hills"),
	THE_END(Biome.THE_END, "biome.minecraft.the_end"),
	THE_VOID(Biome.THE_VOID, "biome.minecraft.the_void"),
	WARM_OCEAN(Biome.WARM_OCEAN, "biome.minecraft.warm_ocean"),
	WOODED_BADLANDS_PLATEAU(Biome.WOODED_BADLANDS_PLATEAU, "biome.minecraft.wooded_badlands_plateau"),
	WOODED_HILLS(Biome.WOODED_HILLS, "biome.minecraft.wooded_hills"),
	WOODED_MOUNTAINS(Biome.WOODED_MOUNTAINS, "biome.minecraft.wooded_mountains");

    private static final Map<Biome, EnumBiome> lookup = new EnumMap<>(Biome.class);

    static {
        for (EnumBiome biome : EnumSet.allOf(EnumBiome.class))
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
