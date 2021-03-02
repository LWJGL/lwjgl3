/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The EXT_debug_utils extension. */
public class EXTDebugUtils {

    /** The extension specification version. */
    public static final int XR_EXT_debug_utils_SPEC_VERSION = 3;

    /** The extension name. */
    public static final String XR_EXT_DEBUG_UTILS_EXTENSION_NAME = "XR_EXT_debug_utils";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT}</li>
     * <li>{@link #XR_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT}</li>
     * <li>{@link #XR_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT}</li>
     * <li>{@link #XR_TYPE_DEBUG_UTILS_LABEL_EXT TYPE_DEBUG_UTILS_LABEL_EXT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT        = 1000019000,
        XR_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT = 1000019001,
        XR_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT   = 1000019002,
        XR_TYPE_DEBUG_UTILS_LABEL_EXT                   = 1000019003;

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT = 1000019000;

    protected EXTDebugUtils() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetDebugUtilsObjectNameEXT ] ---

    public static int nxrSetDebugUtilsObjectNameEXT(XrInstance instance, long nameInfo) {
        long __functionAddress = instance.getCapabilities().xrSetDebugUtilsObjectNameEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(instance.address(), nameInfo, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrSetDebugUtilsObjectNameEXT(XrInstance instance, @NativeType("XrDebugUtilsObjectNameInfoEXT const *") XrDebugUtilsObjectNameInfoEXT nameInfo) {
        return nxrSetDebugUtilsObjectNameEXT(instance, nameInfo.address());
    }

    // --- [ xrCreateDebugUtilsMessengerEXT ] ---

    public static int nxrCreateDebugUtilsMessengerEXT(XrInstance instance, long createInfo, long messenger) {
        long __functionAddress = instance.getCapabilities().xrCreateDebugUtilsMessengerEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrDebugUtilsMessengerCreateInfoEXT.validate(createInfo);
        }
        return callPPPI(instance.address(), createInfo, messenger, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrCreateDebugUtilsMessengerEXT(XrInstance instance, @NativeType("XrDebugUtilsMessengerCreateInfoEXT const *") XrDebugUtilsMessengerCreateInfoEXT createInfo, @NativeType("XrDebugUtilsMessengerEXT *") PointerBuffer messenger) {
        if (CHECKS) {
            check(messenger, 1);
        }
        return nxrCreateDebugUtilsMessengerEXT(instance, createInfo.address(), memAddress(messenger));
    }

    // --- [ xrDestroyDebugUtilsMessengerEXT ] ---

    @NativeType("XrResult")
    public static int xrDestroyDebugUtilsMessengerEXT(XrDebugUtilsMessengerEXT messenger) {
        long __functionAddress = messenger.getCapabilities().xrDestroyDebugUtilsMessengerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(messenger.address(), __functionAddress);
    }

    // --- [ xrSubmitDebugUtilsMessageEXT ] ---

    public static int nxrSubmitDebugUtilsMessageEXT(XrInstance instance, long messageSeverity, long messageTypes, long callbackData) {
        long __functionAddress = instance.getCapabilities().xrSubmitDebugUtilsMessageEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrDebugUtilsMessengerCallbackDataEXT.validate(callbackData);
        }
        return callPJJPI(instance.address(), messageSeverity, messageTypes, callbackData, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrSubmitDebugUtilsMessageEXT(XrInstance instance, @NativeType("XrDebugUtilsMessageSeverityFlagsEXT") long messageSeverity, @NativeType("XrDebugUtilsMessageTypeFlagsEXT") long messageTypes, @NativeType("XrDebugUtilsMessengerCallbackDataEXT const *") XrDebugUtilsMessengerCallbackDataEXT callbackData) {
        return nxrSubmitDebugUtilsMessageEXT(instance, messageSeverity, messageTypes, callbackData.address());
    }

    // --- [ xrSessionBeginDebugUtilsLabelRegionEXT ] ---

    public static int nxrSessionBeginDebugUtilsLabelRegionEXT(XrSession session, long labelInfo) {
        long __functionAddress = session.getCapabilities().xrSessionBeginDebugUtilsLabelRegionEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrDebugUtilsLabelEXT.validate(labelInfo);
        }
        return callPPI(session.address(), labelInfo, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrSessionBeginDebugUtilsLabelRegionEXT(XrSession session, @NativeType("XrDebugUtilsLabelEXT const *") XrDebugUtilsLabelEXT labelInfo) {
        return nxrSessionBeginDebugUtilsLabelRegionEXT(session, labelInfo.address());
    }

    // --- [ xrSessionEndDebugUtilsLabelRegionEXT ] ---

    @NativeType("XrResult")
    public static int xrSessionEndDebugUtilsLabelRegionEXT(XrSession session) {
        long __functionAddress = session.getCapabilities().xrSessionEndDebugUtilsLabelRegionEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), __functionAddress);
    }

    // --- [ xrSessionInsertDebugUtilsLabelEXT ] ---

    public static int nxrSessionInsertDebugUtilsLabelEXT(XrSession session, long labelInfo) {
        long __functionAddress = session.getCapabilities().xrSessionInsertDebugUtilsLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrDebugUtilsLabelEXT.validate(labelInfo);
        }
        return callPPI(session.address(), labelInfo, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrSessionInsertDebugUtilsLabelEXT(XrSession session, @NativeType("XrDebugUtilsLabelEXT const *") XrDebugUtilsLabelEXT labelInfo) {
        return nxrSessionInsertDebugUtilsLabelEXT(session, labelInfo.address());
    }

}