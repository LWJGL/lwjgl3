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

public class FBRenderModel {

    public static final int XR_FB_render_model_SPEC_VERSION = 4;

    public static final String XR_FB_RENDER_MODEL_EXTENSION_NAME = "XR_FB_render_model";

    public static final int XR_MAX_RENDER_MODEL_NAME_SIZE_FB = 64;

    public static final int
        XR_TYPE_RENDER_MODEL_PATH_INFO_FB            = 1000119000,
        XR_TYPE_RENDER_MODEL_PROPERTIES_FB           = 1000119001,
        XR_TYPE_RENDER_MODEL_BUFFER_FB               = 1000119002,
        XR_TYPE_RENDER_MODEL_LOAD_INFO_FB            = 1000119003,
        XR_TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB    = 1000119004,
        XR_TYPE_RENDER_MODEL_CAPABILITIES_REQUEST_FB = 1000119005;

    public static final int
        XR_RENDER_MODEL_UNAVAILABLE_FB       = 1000119020,
        XR_ERROR_RENDER_MODEL_KEY_INVALID_FB = -1000119000;

    public static final int
        XR_RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_1_BIT_FB = 0x1,
        XR_RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_2_BIT_FB = 0x2;

    public static final long XR_NULL_RENDER_MODEL_KEY_FB = 0x0L;

    protected FBRenderModel() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateRenderModelPathsFB ] ---

    /** {@code XrResult xrEnumerateRenderModelPathsFB(XrSession session, uint32_t pathCapacityInput, uint32_t * pathCountOutput, XrRenderModelPathInfoFB * paths)} */
    public static int nxrEnumerateRenderModelPathsFB(XrSession session, int pathCapacityInput, long pathCountOutput, long paths) {
        long __functionAddress = session.getCapabilities().xrEnumerateRenderModelPathsFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), pathCapacityInput, pathCountOutput, paths, __functionAddress);
    }

    /** {@code XrResult xrEnumerateRenderModelPathsFB(XrSession session, uint32_t pathCapacityInput, uint32_t * pathCountOutput, XrRenderModelPathInfoFB * paths)} */
    @NativeType("XrResult")
    public static int xrEnumerateRenderModelPathsFB(XrSession session, @NativeType("uint32_t *") IntBuffer pathCountOutput, @NativeType("XrRenderModelPathInfoFB *") XrRenderModelPathInfoFB.@Nullable Buffer paths) {
        if (CHECKS) {
            check(pathCountOutput, 1);
        }
        return nxrEnumerateRenderModelPathsFB(session, remainingSafe(paths), memAddress(pathCountOutput), memAddressSafe(paths));
    }

    // --- [ xrGetRenderModelPropertiesFB ] ---

    /** {@code XrResult xrGetRenderModelPropertiesFB(XrSession session, XrPath path, XrRenderModelPropertiesFB * properties)} */
    public static int nxrGetRenderModelPropertiesFB(XrSession session, long path, long properties) {
        long __functionAddress = session.getCapabilities().xrGetRenderModelPropertiesFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), path, properties, __functionAddress);
    }

    /** {@code XrResult xrGetRenderModelPropertiesFB(XrSession session, XrPath path, XrRenderModelPropertiesFB * properties)} */
    @NativeType("XrResult")
    public static int xrGetRenderModelPropertiesFB(XrSession session, @NativeType("XrPath") long path, @NativeType("XrRenderModelPropertiesFB *") XrRenderModelPropertiesFB properties) {
        return nxrGetRenderModelPropertiesFB(session, path, properties.address());
    }

    // --- [ xrLoadRenderModelFB ] ---

    /** {@code XrResult xrLoadRenderModelFB(XrSession session, XrRenderModelLoadInfoFB const * info, XrRenderModelBufferFB * buffer)} */
    public static int nxrLoadRenderModelFB(XrSession session, long info, long buffer) {
        long __functionAddress = session.getCapabilities().xrLoadRenderModelFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), info, buffer, __functionAddress);
    }

    /** {@code XrResult xrLoadRenderModelFB(XrSession session, XrRenderModelLoadInfoFB const * info, XrRenderModelBufferFB * buffer)} */
    @NativeType("XrResult")
    public static int xrLoadRenderModelFB(XrSession session, @NativeType("XrRenderModelLoadInfoFB const *") XrRenderModelLoadInfoFB info, @NativeType("XrRenderModelBufferFB *") XrRenderModelBufferFB buffer) {
        return nxrLoadRenderModelFB(session, info.address(), buffer.address());
    }

}