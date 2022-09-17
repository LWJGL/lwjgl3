/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_KHR_composition_layer_cube">XR_KHR_composition_layer_cube</a> extension.
 * 
 * <p>This extension adds an additional layer type that enables direct sampling from cubemaps.</p>
 * 
 * <p>The cube layer is the natural layer type for hardware accelerated environment maps. Without updating the image source, the user can look all around, and the compositor can display what they are looking at without intervention from the application.</p>
 */
public final class KHRCompositionLayerCube {

    /** The extension specification version. */
    public static final int XR_KHR_composition_layer_cube_SPEC_VERSION = 8;

    /** The extension name. */
    public static final String XR_KHR_COMPOSITION_LAYER_CUBE_EXTENSION_NAME = "XR_KHR_composition_layer_cube";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_COMPOSITION_LAYER_CUBE_KHR = 1000006000;

    private KHRCompositionLayerCube() {}

}