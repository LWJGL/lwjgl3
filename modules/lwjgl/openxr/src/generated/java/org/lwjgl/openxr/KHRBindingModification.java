/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_KHR_binding_modification">XR_KHR_binding_modification</a> extension.
 * 
 * <p>This extension adds an optional structure that can be included on the {@link XrInteractionProfileSuggestedBinding}{@code ::next} chain passed to {@link XR10#xrSuggestInteractionProfileBindings SuggestInteractionProfileBindings} to specify additional information to modify default binding behavior.</p>
 * 
 * <p>This extension does not define any actual modification structs, but includes the list of modifications and the {@link XrBindingModificationBaseHeaderKHR} structure to allow other extensions to provide specific modifications.</p>
 */
public final class KHRBindingModification {

    /** The extension specification version. */
    public static final int XR_KHR_binding_modification_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_KHR_BINDING_MODIFICATION_EXTENSION_NAME = "XR_KHR_binding_modification";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_BINDING_MODIFICATIONS_KHR = 1000120000;

    private KHRBindingModification() {}

}