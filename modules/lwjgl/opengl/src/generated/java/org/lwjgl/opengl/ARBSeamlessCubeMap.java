/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_seamless_cube_map.txt">ARB_seamless_cube_map</a> extension.
 * 
 * <p>When sampling from cube map textures, a three-dimensional texture coordinate is used to select one of the cube map faces and generate a two dimensional
 * texture coordinate ( s t ), at which a texel is sampled from the determined face of the cube map texture. Each face of the texture is treated as an
 * independent two-dimensional texture, and the generated ( s t ) coordinate is subjected to the same clamping and wrapping rules as for any other two
 * dimensional texture fetch.</p>
 * 
 * <p>Although it is unlikely that the generated ( s t ) coordinate lies significantly outside the determined cube map face, it is often the case that the
 * locations of the individual elements required during a linear sampling do not lie within the determined face, and their coordinates will therefore be
 * modified by the selected clamping and wrapping rules. This often has the effect of producing seams or other discontinuities in the sampled texture.</p>
 * 
 * <p>This extension allows implementations to take samples from adjacent cube map faces, providing the ability to create seamless cube maps.</p>
 * 
 * <p>Promoted to core in {@link GL32 OpenGL 3.2}.</p>
 */
public final class ARBSeamlessCubeMap {

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and
     * GetDoublev.
     */
    public static final int GL_TEXTURE_CUBE_MAP_SEAMLESS = 0x884F;

    private ARBSeamlessCubeMap() {}

}