/*******************************************************************************************************************
 * Name:      RenderTurtle.java
 * Author:    SanAndreasP
 * Copyright: SanAndreasP and SilverChiren
 * License:   Attribution-NonCommercial-ShareAlike 3.0 Unported (http://creativecommons.org/licenses/by-nc-sa/3.0/)
 *******************************************************************************************************************/

package de.sanandrew.mods.claysoldiers.client.render.entity;
import de.sanandrew.mods.claysoldiers.client.models.ModelTurtleMount;
import de.sanandrew.mods.claysoldiers.entity.mount.EntityTurtleMount;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderTurtleMount
    extends RenderLiving
{
    public RenderTurtleMount() {
        super(new ModelTurtleMount(), 0.3F);
    }

	@Override
	protected void preRenderCallback(EntityLivingBase entityliving, float f) {
		GL11.glScalef(1F, 1F, 1F);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return ((EntityTurtleMount) entity).getTurtleTexture();
    }
}
