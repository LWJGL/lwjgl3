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

public class MSFTSceneMarker {

    public static final int XR_MSFT_scene_marker_SPEC_VERSION = 1;

    public static final String XR_MSFT_SCENE_MARKER_EXTENSION_NAME = "XR_MSFT_scene_marker";

    public static final int XR_SCENE_COMPUTE_FEATURE_MARKER_MSFT = 1000147000;

    public static final int XR_SCENE_COMPONENT_TYPE_MARKER_MSFT = 1000147000;

    public static final int
        XR_TYPE_SCENE_MARKERS_MSFT            = 1000147000,
        XR_TYPE_SCENE_MARKER_TYPE_FILTER_MSFT = 1000147001,
        XR_TYPE_SCENE_MARKER_QR_CODES_MSFT    = 1000147002;

    public static final int XR_SCENE_MARKER_DATA_NOT_STRING_MSFT = 1000147000;

    public static final int XR_SCENE_MARKER_TYPE_QR_CODE_MSFT = 1;

    public static final int
        XR_SCENE_MARKER_QR_CODE_SYMBOL_TYPE_QR_CODE_MSFT       = 1,
        XR_SCENE_MARKER_QR_CODE_SYMBOL_TYPE_MICRO_QR_CODE_MSFT = 2;

    protected MSFTSceneMarker() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetSceneMarkerRawDataMSFT ] ---

    /** {@code XrResult xrGetSceneMarkerRawDataMSFT(XrSceneMSFT scene, XrUuidMSFT const * markerId, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, uint8_t * buffer)} */
    public static int nxrGetSceneMarkerRawDataMSFT(XrSceneMSFT scene, long markerId, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = scene.getCapabilities().xrGetSceneMarkerRawDataMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(scene.address(), markerId, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /** {@code XrResult xrGetSceneMarkerRawDataMSFT(XrSceneMSFT scene, XrUuidMSFT const * markerId, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, uint8_t * buffer)} */
    @NativeType("XrResult")
    public static int xrGetSceneMarkerRawDataMSFT(XrSceneMSFT scene, @NativeType("XrUuidMSFT const *") XrUuidMSFT markerId, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("uint8_t *") @Nullable ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetSceneMarkerRawDataMSFT(scene, markerId.address(), remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrGetSceneMarkerDecodedStringMSFT ] ---

    /** {@code XrResult xrGetSceneMarkerDecodedStringMSFT(XrSceneMSFT scene, XrUuidMSFT const * markerId, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, char * buffer)} */
    public static int nxrGetSceneMarkerDecodedStringMSFT(XrSceneMSFT scene, long markerId, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = scene.getCapabilities().xrGetSceneMarkerDecodedStringMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(scene.address(), markerId, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /** {@code XrResult xrGetSceneMarkerDecodedStringMSFT(XrSceneMSFT scene, XrUuidMSFT const * markerId, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, char * buffer)} */
    @NativeType("XrResult")
    public static int xrGetSceneMarkerDecodedStringMSFT(XrSceneMSFT scene, @NativeType("XrUuidMSFT const *") XrUuidMSFT markerId, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("char *") @Nullable ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetSceneMarkerDecodedStringMSFT(scene, markerId.address(), remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

}