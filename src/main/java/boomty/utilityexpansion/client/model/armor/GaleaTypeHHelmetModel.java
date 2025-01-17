package boomty.utilityexpansion.client.model.armor;

import boomty.utilityexpansion.UtilityExpansion;
import boomty.utilityexpansion.item.ArmorItems.HeadArmor.Galea;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GaleaTypeHHelmetModel extends AnimatedGeoModel<Galea> {
    @Override
    public ResourceLocation getModelLocation(Galea object) {
        return new ResourceLocation(UtilityExpansion.MOD_ID, "geo/galea_type_h_5.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Galea object) {
        return new ResourceLocation(UtilityExpansion.MOD_ID, "textures/item/galea_type_h_texture_3.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Galea animatable) {
        return new ResourceLocation(UtilityExpansion.MOD_ID, "animations/armor_animation.json");
    }
}
