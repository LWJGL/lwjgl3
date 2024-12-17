/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class METAVirtualKeyboard {

    public static final int XR_META_virtual_keyboard_SPEC_VERSION = 1;

    public static final String XR_META_VIRTUAL_KEYBOARD_EXTENSION_NAME = "XR_META_virtual_keyboard";

    public static final int XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META = 3992;

    public static final int XR_OBJECT_TYPE_VIRTUAL_KEYBOARD_META = 1000219000;

    public static final int
        XR_TYPE_SYSTEM_VIRTUAL_KEYBOARD_PROPERTIES_META         = 1000219001,
        XR_TYPE_VIRTUAL_KEYBOARD_CREATE_INFO_META               = 1000219002,
        XR_TYPE_VIRTUAL_KEYBOARD_SPACE_CREATE_INFO_META         = 1000219003,
        XR_TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META             = 1000219004,
        XR_TYPE_VIRTUAL_KEYBOARD_MODEL_VISIBILITY_SET_INFO_META = 1000219005,
        XR_TYPE_VIRTUAL_KEYBOARD_ANIMATION_STATE_META           = 1000219006,
        XR_TYPE_VIRTUAL_KEYBOARD_MODEL_ANIMATION_STATES_META    = 1000219007,
        XR_TYPE_VIRTUAL_KEYBOARD_TEXTURE_DATA_META              = 1000219009,
        XR_TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META                = 1000219010,
        XR_TYPE_VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META  = 1000219011,
        XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META    = 1000219014,
        XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META      = 1000219015,
        XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_ENTER_META          = 1000219016,
        XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_SHOWN_META          = 1000219017,
        XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_HIDDEN_META         = 1000219018;

    public static final int
        XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META = 0,
        XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_FAR_META    = 1,
        XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_DIRECT_META = 2;

    public static final int
        XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_LEFT_META         = 1,
        XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_RIGHT_META        = 2,
        XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_LEFT_META               = 3,
        XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_RIGHT_META              = 4,
        XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_LEFT_META      = 5,
        XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_RIGHT_META     = 6,
        XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_LEFT_META  = 7,
        XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_RIGHT_META = 8;

    public static final int XR_VIRTUAL_KEYBOARD_INPUT_STATE_PRESSED_BIT_META = 0x1;

    protected METAVirtualKeyboard() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateVirtualKeyboardMETA ] ---

    /** {@code XrResult xrCreateVirtualKeyboardMETA(XrSession session, XrVirtualKeyboardCreateInfoMETA const * createInfo, XrVirtualKeyboardMETA * keyboard)} */
    public static int nxrCreateVirtualKeyboardMETA(XrSession session, long createInfo, long keyboard) {
        long __functionAddress = session.getCapabilities().xrCreateVirtualKeyboardMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, keyboard, __functionAddress);
    }

    /** {@code XrResult xrCreateVirtualKeyboardMETA(XrSession session, XrVirtualKeyboardCreateInfoMETA const * createInfo, XrVirtualKeyboardMETA * keyboard)} */
    @NativeType("XrResult")
    public static int xrCreateVirtualKeyboardMETA(XrSession session, @NativeType("XrVirtualKeyboardCreateInfoMETA const *") XrVirtualKeyboardCreateInfoMETA createInfo, @NativeType("XrVirtualKeyboardMETA *") PointerBuffer keyboard) {
        if (CHECKS) {
            check(keyboard, 1);
        }
        return nxrCreateVirtualKeyboardMETA(session, createInfo.address(), memAddress(keyboard));
    }

    // --- [ xrDestroyVirtualKeyboardMETA ] ---

    /** {@code XrResult xrDestroyVirtualKeyboardMETA(XrVirtualKeyboardMETA keyboard)} */
    @NativeType("XrResult")
    public static int xrDestroyVirtualKeyboardMETA(XrVirtualKeyboardMETA keyboard) {
        long __functionAddress = keyboard.getCapabilities().xrDestroyVirtualKeyboardMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(keyboard.address(), __functionAddress);
    }

    // --- [ xrCreateVirtualKeyboardSpaceMETA ] ---

    /** {@code XrResult xrCreateVirtualKeyboardSpaceMETA(XrSession session, XrVirtualKeyboardMETA keyboard, XrVirtualKeyboardSpaceCreateInfoMETA const * createInfo, XrSpace * keyboardSpace)} */
    public static int nxrCreateVirtualKeyboardSpaceMETA(XrSession session, XrVirtualKeyboardMETA keyboard, long createInfo, long keyboardSpace) {
        long __functionAddress = session.getCapabilities().xrCreateVirtualKeyboardSpaceMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrVirtualKeyboardSpaceCreateInfoMETA.validate(createInfo);
        }
        return callPPPPI(session.address(), keyboard.address(), createInfo, keyboardSpace, __functionAddress);
    }

    /** {@code XrResult xrCreateVirtualKeyboardSpaceMETA(XrSession session, XrVirtualKeyboardMETA keyboard, XrVirtualKeyboardSpaceCreateInfoMETA const * createInfo, XrSpace * keyboardSpace)} */
    @NativeType("XrResult")
    public static int xrCreateVirtualKeyboardSpaceMETA(XrSession session, XrVirtualKeyboardMETA keyboard, @NativeType("XrVirtualKeyboardSpaceCreateInfoMETA const *") XrVirtualKeyboardSpaceCreateInfoMETA createInfo, @NativeType("XrSpace *") PointerBuffer keyboardSpace) {
        if (CHECKS) {
            check(keyboardSpace, 1);
        }
        return nxrCreateVirtualKeyboardSpaceMETA(session, keyboard, createInfo.address(), memAddress(keyboardSpace));
    }

    // --- [ xrSuggestVirtualKeyboardLocationMETA ] ---

    /** {@code XrResult xrSuggestVirtualKeyboardLocationMETA(XrVirtualKeyboardMETA keyboard, XrVirtualKeyboardLocationInfoMETA const * locationInfo)} */
    public static int nxrSuggestVirtualKeyboardLocationMETA(XrVirtualKeyboardMETA keyboard, long locationInfo) {
        long __functionAddress = keyboard.getCapabilities().xrSuggestVirtualKeyboardLocationMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrVirtualKeyboardLocationInfoMETA.validate(locationInfo);
        }
        return callPPI(keyboard.address(), locationInfo, __functionAddress);
    }

    /** {@code XrResult xrSuggestVirtualKeyboardLocationMETA(XrVirtualKeyboardMETA keyboard, XrVirtualKeyboardLocationInfoMETA const * locationInfo)} */
    @NativeType("XrResult")
    public static int xrSuggestVirtualKeyboardLocationMETA(XrVirtualKeyboardMETA keyboard, @NativeType("XrVirtualKeyboardLocationInfoMETA const *") XrVirtualKeyboardLocationInfoMETA locationInfo) {
        return nxrSuggestVirtualKeyboardLocationMETA(keyboard, locationInfo.address());
    }

    // --- [ xrGetVirtualKeyboardScaleMETA ] ---

    /** {@code XrResult xrGetVirtualKeyboardScaleMETA(XrVirtualKeyboardMETA keyboard, float * scale)} */
    public static int nxrGetVirtualKeyboardScaleMETA(XrVirtualKeyboardMETA keyboard, long scale) {
        long __functionAddress = keyboard.getCapabilities().xrGetVirtualKeyboardScaleMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(keyboard.address(), scale, __functionAddress);
    }

    /** {@code XrResult xrGetVirtualKeyboardScaleMETA(XrVirtualKeyboardMETA keyboard, float * scale)} */
    @NativeType("XrResult")
    public static int xrGetVirtualKeyboardScaleMETA(XrVirtualKeyboardMETA keyboard, @NativeType("float *") FloatBuffer scale) {
        if (CHECKS) {
            check(scale, 1);
        }
        return nxrGetVirtualKeyboardScaleMETA(keyboard, memAddress(scale));
    }

    // --- [ xrSetVirtualKeyboardModelVisibilityMETA ] ---

    /** {@code XrResult xrSetVirtualKeyboardModelVisibilityMETA(XrVirtualKeyboardMETA keyboard, XrVirtualKeyboardModelVisibilitySetInfoMETA const * modelVisibility)} */
    public static int nxrSetVirtualKeyboardModelVisibilityMETA(XrVirtualKeyboardMETA keyboard, long modelVisibility) {
        long __functionAddress = keyboard.getCapabilities().xrSetVirtualKeyboardModelVisibilityMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(keyboard.address(), modelVisibility, __functionAddress);
    }

    /** {@code XrResult xrSetVirtualKeyboardModelVisibilityMETA(XrVirtualKeyboardMETA keyboard, XrVirtualKeyboardModelVisibilitySetInfoMETA const * modelVisibility)} */
    @NativeType("XrResult")
    public static int xrSetVirtualKeyboardModelVisibilityMETA(XrVirtualKeyboardMETA keyboard, @NativeType("XrVirtualKeyboardModelVisibilitySetInfoMETA const *") XrVirtualKeyboardModelVisibilitySetInfoMETA modelVisibility) {
        return nxrSetVirtualKeyboardModelVisibilityMETA(keyboard, modelVisibility.address());
    }

    // --- [ xrGetVirtualKeyboardModelAnimationStatesMETA ] ---

    /** {@code XrResult xrGetVirtualKeyboardModelAnimationStatesMETA(XrVirtualKeyboardMETA keyboard, XrVirtualKeyboardModelAnimationStatesMETA * animationStates)} */
    public static int nxrGetVirtualKeyboardModelAnimationStatesMETA(XrVirtualKeyboardMETA keyboard, long animationStates) {
        long __functionAddress = keyboard.getCapabilities().xrGetVirtualKeyboardModelAnimationStatesMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(keyboard.address(), animationStates, __functionAddress);
    }

    /** {@code XrResult xrGetVirtualKeyboardModelAnimationStatesMETA(XrVirtualKeyboardMETA keyboard, XrVirtualKeyboardModelAnimationStatesMETA * animationStates)} */
    @NativeType("XrResult")
    public static int xrGetVirtualKeyboardModelAnimationStatesMETA(XrVirtualKeyboardMETA keyboard, @NativeType("XrVirtualKeyboardModelAnimationStatesMETA *") XrVirtualKeyboardModelAnimationStatesMETA animationStates) {
        return nxrGetVirtualKeyboardModelAnimationStatesMETA(keyboard, animationStates.address());
    }

    // --- [ xrGetVirtualKeyboardDirtyTexturesMETA ] ---

    /** {@code XrResult xrGetVirtualKeyboardDirtyTexturesMETA(XrVirtualKeyboardMETA keyboard, uint32_t textureIdCapacityInput, uint32_t * textureIdCountOutput, uint64_t * textureIds)} */
    public static int nxrGetVirtualKeyboardDirtyTexturesMETA(XrVirtualKeyboardMETA keyboard, int textureIdCapacityInput, long textureIdCountOutput, long textureIds) {
        long __functionAddress = keyboard.getCapabilities().xrGetVirtualKeyboardDirtyTexturesMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(keyboard.address(), textureIdCapacityInput, textureIdCountOutput, textureIds, __functionAddress);
    }

    /** {@code XrResult xrGetVirtualKeyboardDirtyTexturesMETA(XrVirtualKeyboardMETA keyboard, uint32_t textureIdCapacityInput, uint32_t * textureIdCountOutput, uint64_t * textureIds)} */
    @NativeType("XrResult")
    public static int xrGetVirtualKeyboardDirtyTexturesMETA(XrVirtualKeyboardMETA keyboard, @NativeType("uint32_t *") IntBuffer textureIdCountOutput, @NativeType("uint64_t *") @Nullable LongBuffer textureIds) {
        if (CHECKS) {
            check(textureIdCountOutput, 1);
        }
        return nxrGetVirtualKeyboardDirtyTexturesMETA(keyboard, remainingSafe(textureIds), memAddress(textureIdCountOutput), memAddressSafe(textureIds));
    }

    // --- [ xrGetVirtualKeyboardTextureDataMETA ] ---

    /** {@code XrResult xrGetVirtualKeyboardTextureDataMETA(XrVirtualKeyboardMETA keyboard, uint64_t textureId, XrVirtualKeyboardTextureDataMETA * textureData)} */
    public static int nxrGetVirtualKeyboardTextureDataMETA(XrVirtualKeyboardMETA keyboard, long textureId, long textureData) {
        long __functionAddress = keyboard.getCapabilities().xrGetVirtualKeyboardTextureDataMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(keyboard.address(), textureId, textureData, __functionAddress);
    }

    /** {@code XrResult xrGetVirtualKeyboardTextureDataMETA(XrVirtualKeyboardMETA keyboard, uint64_t textureId, XrVirtualKeyboardTextureDataMETA * textureData)} */
    @NativeType("XrResult")
    public static int xrGetVirtualKeyboardTextureDataMETA(XrVirtualKeyboardMETA keyboard, @NativeType("uint64_t") long textureId, @NativeType("XrVirtualKeyboardTextureDataMETA *") XrVirtualKeyboardTextureDataMETA textureData) {
        return nxrGetVirtualKeyboardTextureDataMETA(keyboard, textureId, textureData.address());
    }

    // --- [ xrSendVirtualKeyboardInputMETA ] ---

    /** {@code XrResult xrSendVirtualKeyboardInputMETA(XrVirtualKeyboardMETA keyboard, XrVirtualKeyboardInputInfoMETA const * info, XrPosef * interactorRootPose)} */
    public static int nxrSendVirtualKeyboardInputMETA(XrVirtualKeyboardMETA keyboard, long info, long interactorRootPose) {
        long __functionAddress = keyboard.getCapabilities().xrSendVirtualKeyboardInputMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(keyboard.address(), info, interactorRootPose, __functionAddress);
    }

    /** {@code XrResult xrSendVirtualKeyboardInputMETA(XrVirtualKeyboardMETA keyboard, XrVirtualKeyboardInputInfoMETA const * info, XrPosef * interactorRootPose)} */
    @NativeType("XrResult")
    public static int xrSendVirtualKeyboardInputMETA(XrVirtualKeyboardMETA keyboard, @NativeType("XrVirtualKeyboardInputInfoMETA const *") XrVirtualKeyboardInputInfoMETA info, @NativeType("XrPosef *") XrPosef interactorRootPose) {
        return nxrSendVirtualKeyboardInputMETA(keyboard, info.address(), interactorRootPose.address());
    }

    // --- [ xrChangeVirtualKeyboardTextContextMETA ] ---

    /** {@code XrResult xrChangeVirtualKeyboardTextContextMETA(XrVirtualKeyboardMETA keyboard, XrVirtualKeyboardTextContextChangeInfoMETA const * changeInfo)} */
    public static int nxrChangeVirtualKeyboardTextContextMETA(XrVirtualKeyboardMETA keyboard, long changeInfo) {
        long __functionAddress = keyboard.getCapabilities().xrChangeVirtualKeyboardTextContextMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrVirtualKeyboardTextContextChangeInfoMETA.validate(changeInfo);
        }
        return callPPI(keyboard.address(), changeInfo, __functionAddress);
    }

    /** {@code XrResult xrChangeVirtualKeyboardTextContextMETA(XrVirtualKeyboardMETA keyboard, XrVirtualKeyboardTextContextChangeInfoMETA const * changeInfo)} */
    @NativeType("XrResult")
    public static int xrChangeVirtualKeyboardTextContextMETA(XrVirtualKeyboardMETA keyboard, @NativeType("XrVirtualKeyboardTextContextChangeInfoMETA const *") XrVirtualKeyboardTextContextChangeInfoMETA changeInfo) {
        return nxrChangeVirtualKeyboardTextContextMETA(keyboard, changeInfo.address());
    }

}