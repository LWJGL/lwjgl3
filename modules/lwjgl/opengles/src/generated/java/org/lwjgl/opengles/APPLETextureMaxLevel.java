/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/APPLE/APPLE_texture_max_level.txt">APPLE_texture_max_level</a> extension.
 * 
 * <p>This extension allows an application to specify the maximum (coarsest) mipmap level that may be selected for the specified texture. This maximum level
 * is also used to determine which mip levels are considered when determining texture completeness.</p>
 */
public final class APPLETextureMaxLevel {

    /** Accepted by the {@code pname} parameter of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv. */
    public static final int GL_TEXTURE_MAX_LEVEL_APPLE = 0x813D;

    private APPLETextureMaxLevel() {}

}