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

public class FBSpatialEntity {

    public static final int XR_FB_spatial_entity_SPEC_VERSION = 3;

    public static final String XR_FB_SPATIAL_ENTITY_EXTENSION_NAME = "XR_FB_spatial_entity";

    public static final int
        XR_TYPE_SPACE_COMPONENT_STATUS_FB                    = 1000113001,
        XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_FB                = 1000113003,
        XR_TYPE_SYSTEM_SPATIAL_ENTITY_PROPERTIES_FB          = 1000113004,
        XR_TYPE_EVENT_DATA_SPATIAL_ANCHOR_CREATE_COMPLETE_FB = 1000113005,
        XR_TYPE_EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB      = 1000113006,
        XR_TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB           = 1000113007;

    public static final int
        XR_ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB      = -1000113000,
        XR_ERROR_SPACE_COMPONENT_NOT_ENABLED_FB        = -1000113001,
        XR_ERROR_SPACE_COMPONENT_STATUS_PENDING_FB     = -1000113002,
        XR_ERROR_SPACE_COMPONENT_STATUS_ALREADY_SET_FB = -1000113003;

    public static final int
        XR_SPACE_COMPONENT_TYPE_LOCATABLE_FB       = 0,
        XR_SPACE_COMPONENT_TYPE_STORABLE_FB        = 1,
        XR_SPACE_COMPONENT_TYPE_SHARABLE_FB        = 2,
        XR_SPACE_COMPONENT_TYPE_BOUNDED_2D_FB      = 3,
        XR_SPACE_COMPONENT_TYPE_BOUNDED_3D_FB      = 4,
        XR_SPACE_COMPONENT_TYPE_SEMANTIC_LABELS_FB = 5,
        XR_SPACE_COMPONENT_TYPE_ROOM_LAYOUT_FB     = 6,
        XR_SPACE_COMPONENT_TYPE_SPACE_CONTAINER_FB = 7;

    protected FBSpatialEntity() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorFB ] ---

    /** {@code XrResult xrCreateSpatialAnchorFB(XrSession session, XrSpatialAnchorCreateInfoFB const * info, XrAsyncRequestIdFB * requestId)} */
    public static int nxrCreateSpatialAnchorFB(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorFB;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorCreateInfoFB.validate(info);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialAnchorFB(XrSession session, XrSpatialAnchorCreateInfoFB const * info, XrAsyncRequestIdFB * requestId)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorFB(XrSession session, @NativeType("XrSpatialAnchorCreateInfoFB const *") XrSpatialAnchorCreateInfoFB info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrCreateSpatialAnchorFB(session, info.address(), memAddress(requestId));
    }

    // --- [ xrGetSpaceUuidFB ] ---

    /** {@code XrResult xrGetSpaceUuidFB(XrSpace space, XrUuidEXT * uuid)} */
    public static int nxrGetSpaceUuidFB(XrSpace space, long uuid) {
        long __functionAddress = space.getCapabilities().xrGetSpaceUuidFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(space.address(), uuid, __functionAddress);
    }

    /** {@code XrResult xrGetSpaceUuidFB(XrSpace space, XrUuidEXT * uuid)} */
    @NativeType("XrResult")
    public static int xrGetSpaceUuidFB(XrSpace space, @NativeType("XrUuidEXT *") XrUuidEXT uuid) {
        return nxrGetSpaceUuidFB(space, uuid.address());
    }

    // --- [ xrEnumerateSpaceSupportedComponentsFB ] ---

    /** {@code XrResult xrEnumerateSpaceSupportedComponentsFB(XrSpace space, uint32_t componentTypeCapacityInput, uint32_t * componentTypeCountOutput, XrSpaceComponentTypeFB * componentTypes)} */
    public static int nxrEnumerateSpaceSupportedComponentsFB(XrSpace space, int componentTypeCapacityInput, long componentTypeCountOutput, long componentTypes) {
        long __functionAddress = space.getCapabilities().xrEnumerateSpaceSupportedComponentsFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(space.address(), componentTypeCapacityInput, componentTypeCountOutput, componentTypes, __functionAddress);
    }

    /** {@code XrResult xrEnumerateSpaceSupportedComponentsFB(XrSpace space, uint32_t componentTypeCapacityInput, uint32_t * componentTypeCountOutput, XrSpaceComponentTypeFB * componentTypes)} */
    @NativeType("XrResult")
    public static int xrEnumerateSpaceSupportedComponentsFB(XrSpace space, @NativeType("uint32_t *") IntBuffer componentTypeCountOutput, @NativeType("XrSpaceComponentTypeFB *") @Nullable IntBuffer componentTypes) {
        if (CHECKS) {
            check(componentTypeCountOutput, 1);
        }
        return nxrEnumerateSpaceSupportedComponentsFB(space, remainingSafe(componentTypes), memAddress(componentTypeCountOutput), memAddressSafe(componentTypes));
    }

    // --- [ xrSetSpaceComponentStatusFB ] ---

    /** {@code XrResult xrSetSpaceComponentStatusFB(XrSpace space, XrSpaceComponentStatusSetInfoFB const * info, XrAsyncRequestIdFB * requestId)} */
    public static int nxrSetSpaceComponentStatusFB(XrSpace space, long info, long requestId) {
        long __functionAddress = space.getCapabilities().xrSetSpaceComponentStatusFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(space.address(), info, requestId, __functionAddress);
    }

    /** {@code XrResult xrSetSpaceComponentStatusFB(XrSpace space, XrSpaceComponentStatusSetInfoFB const * info, XrAsyncRequestIdFB * requestId)} */
    @NativeType("XrResult")
    public static int xrSetSpaceComponentStatusFB(XrSpace space, @NativeType("XrSpaceComponentStatusSetInfoFB const *") XrSpaceComponentStatusSetInfoFB info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrSetSpaceComponentStatusFB(space, info.address(), memAddress(requestId));
    }

    // --- [ xrGetSpaceComponentStatusFB ] ---

    /** {@code XrResult xrGetSpaceComponentStatusFB(XrSpace space, XrSpaceComponentTypeFB componentType, XrSpaceComponentStatusFB * status)} */
    public static int nxrGetSpaceComponentStatusFB(XrSpace space, int componentType, long status) {
        long __functionAddress = space.getCapabilities().xrGetSpaceComponentStatusFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(space.address(), componentType, status, __functionAddress);
    }

    /** {@code XrResult xrGetSpaceComponentStatusFB(XrSpace space, XrSpaceComponentTypeFB componentType, XrSpaceComponentStatusFB * status)} */
    @NativeType("XrResult")
    public static int xrGetSpaceComponentStatusFB(XrSpace space, @NativeType("XrSpaceComponentTypeFB") int componentType, @NativeType("XrSpaceComponentStatusFB *") XrSpaceComponentStatusFB status) {
        return nxrGetSpaceComponentStatusFB(space, componentType, status.address());
    }

}