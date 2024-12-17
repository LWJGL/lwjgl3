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

public class MSFTControllerModel {

    public static final int XR_MSFT_controller_model_SPEC_VERSION = 2;

    public static final String XR_MSFT_CONTROLLER_MODEL_EXTENSION_NAME = "XR_MSFT_controller_model";

    public static final int XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT = 64;

    public static final int
        XR_TYPE_CONTROLLER_MODEL_KEY_STATE_MSFT       = 1000055000,
        XR_TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT = 1000055001,
        XR_TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT      = 1000055002,
        XR_TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT      = 1000055003,
        XR_TYPE_CONTROLLER_MODEL_STATE_MSFT           = 1000055004;

    public static final int XR_ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT = -1000055000;

    public static final long XR_NULL_CONTROLLER_MODEL_KEY_MSFT = 0x0L;

    protected MSFTControllerModel() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetControllerModelKeyMSFT ] ---

    /** {@code XrResult xrGetControllerModelKeyMSFT(XrSession session, XrPath topLevelUserPath, XrControllerModelKeyStateMSFT * controllerModelKeyState)} */
    public static int nxrGetControllerModelKeyMSFT(XrSession session, long topLevelUserPath, long controllerModelKeyState) {
        long __functionAddress = session.getCapabilities().xrGetControllerModelKeyMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), topLevelUserPath, controllerModelKeyState, __functionAddress);
    }

    /** {@code XrResult xrGetControllerModelKeyMSFT(XrSession session, XrPath topLevelUserPath, XrControllerModelKeyStateMSFT * controllerModelKeyState)} */
    @NativeType("XrResult")
    public static int xrGetControllerModelKeyMSFT(XrSession session, @NativeType("XrPath") long topLevelUserPath, @NativeType("XrControllerModelKeyStateMSFT *") XrControllerModelKeyStateMSFT controllerModelKeyState) {
        return nxrGetControllerModelKeyMSFT(session, topLevelUserPath, controllerModelKeyState.address());
    }

    // --- [ xrLoadControllerModelMSFT ] ---

    /** {@code XrResult xrLoadControllerModelMSFT(XrSession session, XrControllerModelKeyMSFT modelKey, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, uint8_t * buffer)} */
    public static int nxrLoadControllerModelMSFT(XrSession session, long modelKey, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = session.getCapabilities().xrLoadControllerModelMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(session.address(), modelKey, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /** {@code XrResult xrLoadControllerModelMSFT(XrSession session, XrControllerModelKeyMSFT modelKey, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, uint8_t * buffer)} */
    @NativeType("XrResult")
    public static int xrLoadControllerModelMSFT(XrSession session, @NativeType("XrControllerModelKeyMSFT") long modelKey, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("uint8_t *") @Nullable ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrLoadControllerModelMSFT(session, modelKey, remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrGetControllerModelPropertiesMSFT ] ---

    /** {@code XrResult xrGetControllerModelPropertiesMSFT(XrSession session, XrControllerModelKeyMSFT modelKey, XrControllerModelPropertiesMSFT * properties)} */
    public static int nxrGetControllerModelPropertiesMSFT(XrSession session, long modelKey, long properties) {
        long __functionAddress = session.getCapabilities().xrGetControllerModelPropertiesMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), modelKey, properties, __functionAddress);
    }

    /** {@code XrResult xrGetControllerModelPropertiesMSFT(XrSession session, XrControllerModelKeyMSFT modelKey, XrControllerModelPropertiesMSFT * properties)} */
    @NativeType("XrResult")
    public static int xrGetControllerModelPropertiesMSFT(XrSession session, @NativeType("XrControllerModelKeyMSFT") long modelKey, @NativeType("XrControllerModelPropertiesMSFT *") XrControllerModelPropertiesMSFT properties) {
        return nxrGetControllerModelPropertiesMSFT(session, modelKey, properties.address());
    }

    // --- [ xrGetControllerModelStateMSFT ] ---

    /** {@code XrResult xrGetControllerModelStateMSFT(XrSession session, XrControllerModelKeyMSFT modelKey, XrControllerModelStateMSFT * state)} */
    public static int nxrGetControllerModelStateMSFT(XrSession session, long modelKey, long state) {
        long __functionAddress = session.getCapabilities().xrGetControllerModelStateMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), modelKey, state, __functionAddress);
    }

    /** {@code XrResult xrGetControllerModelStateMSFT(XrSession session, XrControllerModelKeyMSFT modelKey, XrControllerModelStateMSFT * state)} */
    @NativeType("XrResult")
    public static int xrGetControllerModelStateMSFT(XrSession session, @NativeType("XrControllerModelKeyMSFT") long modelKey, @NativeType("XrControllerModelStateMSFT *") XrControllerModelStateMSFT state) {
        return nxrGetControllerModelStateMSFT(session, modelKey, state.address());
    }

}