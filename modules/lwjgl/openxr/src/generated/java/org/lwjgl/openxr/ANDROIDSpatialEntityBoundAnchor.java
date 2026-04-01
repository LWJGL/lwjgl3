/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ANDROIDSpatialEntityBoundAnchor {

    public static final int XR_ANDROID_spatial_entity_bound_anchor_SPEC_VERSION = 2;

    public static final String XR_ANDROID_SPATIAL_ENTITY_BOUND_ANCHOR_EXTENSION_NAME = "XR_ANDROID_spatial_entity_bound_anchor";

    public static final int XR_ERROR_SPATIAL_ANCHOR_ATTACHABLE_COMPONENT_NOT_FOUND_ANDROID = -1000790001;

    public static final int XR_TYPE_SPATIAL_ANCHOR_PARENT_ANDROID = 1000790000;

    protected ANDROIDSpatialEntityBoundAnchor() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateSpatialAnchorAttachableComponentsANDROID ] ---

    /** {@code XrResult xrEnumerateSpatialAnchorAttachableComponentsANDROID(XrInstance instance, XrSystemId systemId, uint32_t attachableComponentCapacityInput, uint32_t * attachableComponentCountOutput, XrSpatialComponentTypeEXT * attachableComponents)} */
    public static int nxrEnumerateSpatialAnchorAttachableComponentsANDROID(XrInstance instance, long systemId, int attachableComponentCapacityInput, long attachableComponentCountOutput, long attachableComponents) {
        long __functionAddress = instance.getCapabilities().xrEnumerateSpatialAnchorAttachableComponentsANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, attachableComponentCapacityInput, attachableComponentCountOutput, attachableComponents, __functionAddress);
    }

    /** {@code XrResult xrEnumerateSpatialAnchorAttachableComponentsANDROID(XrInstance instance, XrSystemId systemId, uint32_t attachableComponentCapacityInput, uint32_t * attachableComponentCountOutput, XrSpatialComponentTypeEXT * attachableComponents)} */
    @NativeType("XrResult")
    public static int xrEnumerateSpatialAnchorAttachableComponentsANDROID(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer attachableComponentCountOutput, @NativeType("XrSpatialComponentTypeEXT *") @Nullable IntBuffer attachableComponents) {
        if (CHECKS) {
            check(attachableComponentCountOutput, 1);
        }
        return nxrEnumerateSpatialAnchorAttachableComponentsANDROID(instance, systemId, remainingSafe(attachableComponents), memAddress(attachableComponentCountOutput), memAddressSafe(attachableComponents));
    }

}