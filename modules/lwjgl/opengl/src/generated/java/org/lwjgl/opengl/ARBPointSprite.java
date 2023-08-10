/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_point_sprite.txt">ARB_point_sprite</a> extension.
 * 
 * <p>Applications such as particle systems have tended to use OpenGL quads rather than points to render their geometry, since they would like to use a
 * custom-drawn texture for each particle, rather than the traditional OpenGL round antialiased points, and each fragment in a point has the same texture
 * coordinates as every other fragment.</p>
 * 
 * <p>Unfortunately, specifying the geometry for these quads can be expensive, since it quadruples the amount of geometry required, and may also require the
 * application to do extra processing to compute the location of each vertex.</p>
 * 
 * <p>The purpose of this extension is to allow such applications to use points rather than quads. When {@link #GL_POINT_SPRITE_ARB POINT_SPRITE_ARB} is enabled, the state of point
 * antialiasing is ignored. For each texture unit, the app can then specify whether to replace the existing texture coordinates with point sprite texture
 * coordinates, which are interpolated across the point.</p>
 * 
 * <p>Promoted to core in {@link GL20 OpenGL 2.0}.</p>
 */
public final class ARBPointSprite {

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev, and by the {@code target} parameter of TexEnvi, TexEnviv, TexEnvf, TexEnvfv, GetTexEnviv, and GetTexEnvfv.
     */
    public static final int GL_POINT_SPRITE_ARB = 0x8861;

    /**
     * When the {@code target} parameter of TexEnvf, TexEnvfv, TexEnvi, TexEnviv, GetTexEnvfv, or GetTexEnviv is POINT_SPRITE_ARB, then the value of
     * {@code pname} may be.
     */
    public static final int GL_COORD_REPLACE_ARB = 0x8862;

    private ARBPointSprite() {}

}