/*******************************************************************************************************************
 * Authors:   SanAndreasP
 * Copyright: SanAndreasP, SilverChiren and CliffracerX
 * License:   Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International
 *                http://creativecommons.org/licenses/by-nc-sa/4.0/
 *******************************************************************************************************************/
package de.sanandrew.mods.claysoldiers.client.render.entity.mount;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.sanandrew.mods.claysoldiers.client.model.mount.ModelGeckoMount;
import de.sanandrew.mods.claysoldiers.entity.mount.EntityGeckoMount;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderGeckoMount
        extends RenderLiving
{
    public RenderGeckoMount() {
        super(new ModelGeckoMount(), 0.2F);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return ((EntityGeckoMount) entity).getGeckoTexture();
    }
}
