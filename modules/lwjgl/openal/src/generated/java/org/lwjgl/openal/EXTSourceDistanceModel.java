/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/EXT_source_distance_model.txt">EXT_source_distance_model</a> extension.
 * 
 * <p>This extension allows each source to specify a distance model, instead of being restricted to one distance model for every source in the context. It
 * provides a mechanism for applications to apply different models to each source, without the burden of manually applying the attenuation through the
 * source gain.</p>
 */
public final class EXTSourceDistanceModel {

    /** Accepted by the {@code target} parameter of {@link AL10#alEnable Enable}, {@link AL10#alDisable Disable}, and {@link AL10#alIsEnabled IsEnabled}. */
    public static final int AL_SOURCE_DISTANCE_MODEL = 0x200;

    private EXTSourceDistanceModel() {}

}