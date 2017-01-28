package io.github.bfox1.SwordArtOnline.init;

import io.github.bfox1.SwordArtOnline.common.blocks.*;
import net.minecraft.block.material.Material;

/**
 * Created by bfox1 on 4/3/2016.
 * Deuteronomy 8:18
 * 1 Peter 4:10
 */
public class BlockInit
{
    public static final SaoBlockVariationAbstract aincradCobbleVariation;
    public static final SaoBlockVariationAbstract aincradGrassVariation;
    public static final SaoBlockVariationAbstract aincradStoneVariation;
    public static final SaoBlockVariationAbstract aincradDirtVariation;


    static
    {
        aincradCobbleVariation =  new AincradCobbleVariation(Material.ROCK, 3).setUnlocalizedName("AincradCobble").setSubTypeFullNameList();
        aincradGrassVariation = new AincradGrassVariation(Material.GRASS, 4).setUnlocalizedName("AincradGrass").setSubTypeFullNameList();
        aincradStoneVariation = new AincradStoneVariation(Material.ROCK, 4).setUnlocalizedName("AincradStone").setSubTypeFullNameList();
        aincradDirtVariation = new AincradDirtVariation(Material.GROUND, 4).setUnlocalizedName("AincradDirt").setSubTypeFullNameList();
    }



}
