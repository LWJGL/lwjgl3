/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_EXT_dpad_binding">XR_EXT_dpad_binding</a> extension.
 * 
 * <p>This extension allows the application to bind one or more digital actions to a trackpad or thumbstick as though it were a dpad by defining additional component paths to suggest bindings for. The behavior of this dpad-like mapping may be customized using {@link XrInteractionProfileDpadBindingEXT}.</p>
 * 
 * <p>Applications <b>must</b> also enable the {@link KHRBindingModification XR_KHR_binding_modification} extension that this builds on top of.</p>
 */
public final class EXTDpadBinding {

    /** The extension specification version. */
    public static final int XR_EXT_dpad_binding_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_EXT_DPAD_BINDING_EXTENSION_NAME = "XR_EXT_dpad_binding";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_INTERACTION_PROFILE_DPAD_BINDING_EXT = 1000078000;

    private EXTDpadBinding() {}

}