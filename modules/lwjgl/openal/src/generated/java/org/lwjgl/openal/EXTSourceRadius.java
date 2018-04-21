/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the {@code AL_EXT_SOURCE_RADIUS} extension.
 * 
 * <p>This extension allows any mono source to be changed to be a "large" source with a radius. The source has a raised cosine shape.</p>
 */
public final class EXTSourceRadius {

    /**
     * Can be used with {@link AL10#alSourcef Sourcef} to set the source radius. Units are consistent with the coordinate system in use. The value must be at least zero. Use
     * a value of zero to reset to a point source.
     */
    public static final int AL_SOURCE_RADIUS = 0x1031;

    private EXTSourceRadius() {}

}