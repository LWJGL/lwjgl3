/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The MSFT_controller_model extension. */
public class MSFTControllerModel {

    /** The extension specification version. */
    public static final int XR_MSFT_controller_model_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_MSFT_CONTROLLER_MODEL_EXTENSION_NAME = "XR_MSFT_controller_model";

    /** XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT */
    public static final int XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT = 64;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_CONTROLLER_MODEL_KEY_STATE_MSFT TYPE_CONTROLLER_MODEL_KEY_STATE_MSFT}</li>
     * <li>{@link #XR_TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT}</li>
     * <li>{@link #XR_TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT}</li>
     * <li>{@link #XR_TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT}</li>
     * <li>{@link #XR_TYPE_CONTROLLER_MODEL_STATE_MSFT TYPE_CONTROLLER_MODEL_STATE_MSFT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_CONTROLLER_MODEL_KEY_STATE_MSFT       = 1000055000,
        XR_TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT = 1000055001,
        XR_TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT      = 1000055002,
        XR_TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT      = 1000055003,
        XR_TYPE_CONTROLLER_MODEL_STATE_MSFT           = 1000055004;

    /** Extends {@code XrResult}. */
    public static final int XR_ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT = -1000055000;

    protected MSFTControllerModel() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetControllerModelKeyMSFT ] ---

    public static int nxrGetControllerModelKeyMSFT(XrSession session, long topLevelUserPath, long controllerModelKeyState) {
        long __functionAddress = session.getCapabilities().xrGetControllerModelKeyMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), topLevelUserPath, controllerModelKeyState, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetControllerModelKeyMSFT(XrSession session, @NativeType("XrPath") long topLevelUserPath, @NativeType("XrControllerModelKeyStateMSFT *") XrControllerModelKeyStateMSFT controllerModelKeyState) {
        return nxrGetControllerModelKeyMSFT(session, topLevelUserPath, controllerModelKeyState.address());
    }

    // --- [ xrLoadControllerModelMSFT ] ---

    public static int nxrLoadControllerModelMSFT(XrSession session, long modelKey, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = session.getCapabilities().xrLoadControllerModelMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(session.address(), modelKey, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrLoadControllerModelMSFT(XrSession session, @NativeType("XrControllerModelKeyMSFT") long modelKey, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @Nullable @NativeType("uint8_t *") ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrLoadControllerModelMSFT(session, modelKey, remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrGetControllerModelPropertiesMSFT ] ---

    public static int nxrGetControllerModelPropertiesMSFT(XrSession session, long modelKey, long properties) {
        long __functionAddress = session.getCapabilities().xrGetControllerModelPropertiesMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), modelKey, properties, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetControllerModelPropertiesMSFT(XrSession session, @NativeType("XrControllerModelKeyMSFT") long modelKey, @NativeType("XrControllerModelPropertiesMSFT *") XrControllerModelPropertiesMSFT properties) {
        return nxrGetControllerModelPropertiesMSFT(session, modelKey, properties.address());
    }

    // --- [ xrGetControllerModelStateMSFT ] ---

    public static int nxrGetControllerModelStateMSFT(XrSession session, long modelKey, long state) {
        long __functionAddress = session.getCapabilities().xrGetControllerModelStateMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), modelKey, state, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetControllerModelStateMSFT(XrSession session, @NativeType("XrControllerModelKeyMSFT") long modelKey, @NativeType("XrControllerModelStateMSFT *") XrControllerModelStateMSFT state) {
        return nxrGetControllerModelStateMSFT(session, modelKey, state.address());
    }

    /** Array version of: {@link #xrLoadControllerModelMSFT LoadControllerModelMSFT} */
    @NativeType("XrResult")
    public static int xrLoadControllerModelMSFT(XrSession session, @NativeType("XrControllerModelKeyMSFT") long modelKey, @NativeType("uint32_t *") int[] bufferCountOutput, @Nullable @NativeType("uint8_t *") ByteBuffer buffer) {
        long __functionAddress = session.getCapabilities().xrLoadControllerModelMSFT;
        if (CHECKS) {
            check(__functionAddress);
            check(bufferCountOutput, 1);
        }
        return callPJPPI(session.address(), modelKey, remainingSafe(buffer), bufferCountOutput, memAddressSafe(buffer), __functionAddress);
    }

}