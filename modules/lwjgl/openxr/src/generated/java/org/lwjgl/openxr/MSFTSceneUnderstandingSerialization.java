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

public class MSFTSceneUnderstandingSerialization {

    public static final int XR_MSFT_scene_understanding_serialization_SPEC_VERSION = 2;

    public static final String XR_MSFT_SCENE_UNDERSTANDING_SERIALIZATION_EXTENSION_NAME = "XR_MSFT_scene_understanding_serialization";

    public static final int
        XR_TYPE_SERIALIZED_SCENE_FRAGMENT_DATA_GET_INFO_MSFT = 1000098000,
        XR_TYPE_SCENE_DESERIALIZE_INFO_MSFT                  = 1000098001;

    public static final int XR_SCENE_COMPUTE_FEATURE_SERIALIZE_SCENE_MSFT = 1000098000;

    public static final int XR_SCENE_COMPONENT_TYPE_SERIALIZED_SCENE_FRAGMENT_MSFT = 1000098000;

    protected MSFTSceneUnderstandingSerialization() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrDeserializeSceneMSFT ] ---

    /** {@code XrResult xrDeserializeSceneMSFT(XrSceneObserverMSFT sceneObserver, XrSceneDeserializeInfoMSFT const * deserializeInfo)} */
    public static int nxrDeserializeSceneMSFT(XrSceneObserverMSFT sceneObserver, long deserializeInfo) {
        long __functionAddress = sceneObserver.getCapabilities().xrDeserializeSceneMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(sceneObserver.address(), deserializeInfo, __functionAddress);
    }

    /** {@code XrResult xrDeserializeSceneMSFT(XrSceneObserverMSFT sceneObserver, XrSceneDeserializeInfoMSFT const * deserializeInfo)} */
    @NativeType("XrResult")
    public static int xrDeserializeSceneMSFT(XrSceneObserverMSFT sceneObserver, @NativeType("XrSceneDeserializeInfoMSFT const *") XrSceneDeserializeInfoMSFT deserializeInfo) {
        return nxrDeserializeSceneMSFT(sceneObserver, deserializeInfo.address());
    }

    // --- [ xrGetSerializedSceneFragmentDataMSFT ] ---

    /** {@code XrResult xrGetSerializedSceneFragmentDataMSFT(XrSceneMSFT scene, XrSerializedSceneFragmentDataGetInfoMSFT const * getInfo, uint32_t countInput, uint32_t * readOutput, uint8_t * buffer)} */
    public static int nxrGetSerializedSceneFragmentDataMSFT(XrSceneMSFT scene, long getInfo, int countInput, long readOutput, long buffer) {
        long __functionAddress = scene.getCapabilities().xrGetSerializedSceneFragmentDataMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(scene.address(), getInfo, countInput, readOutput, buffer, __functionAddress);
    }

    /** {@code XrResult xrGetSerializedSceneFragmentDataMSFT(XrSceneMSFT scene, XrSerializedSceneFragmentDataGetInfoMSFT const * getInfo, uint32_t countInput, uint32_t * readOutput, uint8_t * buffer)} */
    @NativeType("XrResult")
    public static int xrGetSerializedSceneFragmentDataMSFT(XrSceneMSFT scene, @NativeType("XrSerializedSceneFragmentDataGetInfoMSFT const *") XrSerializedSceneFragmentDataGetInfoMSFT getInfo, @NativeType("uint32_t *") IntBuffer readOutput, @NativeType("uint8_t *") @Nullable ByteBuffer buffer) {
        if (CHECKS) {
            check(readOutput, 1);
        }
        return nxrGetSerializedSceneFragmentDataMSFT(scene, getInfo.address(), remainingSafe(buffer), memAddress(readOutput), memAddressSafe(buffer));
    }

}