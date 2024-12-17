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

public class EXTDebugUtils {

    public static final int XR_EXT_debug_utils_SPEC_VERSION = 5;

    public static final String XR_EXT_DEBUG_UTILS_EXTENSION_NAME = "XR_EXT_debug_utils";

    public static final int
        XR_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT        = 1000019000,
        XR_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT = 1000019001,
        XR_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT   = 1000019002,
        XR_TYPE_DEBUG_UTILS_LABEL_EXT                   = 1000019003;

    public static final int XR_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT = 1000019000;

    public static final int
        XR_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT = 0x1,
        XR_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT    = 0x10,
        XR_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT = 0x100,
        XR_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT   = 0x1000;

    public static final int
        XR_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT     = 0x1,
        XR_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT  = 0x2,
        XR_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT = 0x4,
        XR_DEBUG_UTILS_MESSAGE_TYPE_CONFORMANCE_BIT_EXT = 0x8;

    protected EXTDebugUtils() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetDebugUtilsObjectNameEXT ] ---

    /** {@code XrResult xrSetDebugUtilsObjectNameEXT(XrInstance instance, XrDebugUtilsObjectNameInfoEXT const * nameInfo)} */
    public static int nxrSetDebugUtilsObjectNameEXT(XrInstance instance, long nameInfo) {
        long __functionAddress = instance.getCapabilities().xrSetDebugUtilsObjectNameEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(instance.address(), nameInfo, __functionAddress);
    }

    /** {@code XrResult xrSetDebugUtilsObjectNameEXT(XrInstance instance, XrDebugUtilsObjectNameInfoEXT const * nameInfo)} */
    @NativeType("XrResult")
    public static int xrSetDebugUtilsObjectNameEXT(XrInstance instance, @NativeType("XrDebugUtilsObjectNameInfoEXT const *") XrDebugUtilsObjectNameInfoEXT nameInfo) {
        return nxrSetDebugUtilsObjectNameEXT(instance, nameInfo.address());
    }

    // --- [ xrCreateDebugUtilsMessengerEXT ] ---

    /** {@code XrResult xrCreateDebugUtilsMessengerEXT(XrInstance instance, XrDebugUtilsMessengerCreateInfoEXT const * createInfo, XrDebugUtilsMessengerEXT * messenger)} */
    public static int nxrCreateDebugUtilsMessengerEXT(XrInstance instance, long createInfo, long messenger) {
        long __functionAddress = instance.getCapabilities().xrCreateDebugUtilsMessengerEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrDebugUtilsMessengerCreateInfoEXT.validate(createInfo);
        }
        return callPPPI(instance.address(), createInfo, messenger, __functionAddress);
    }

    /** {@code XrResult xrCreateDebugUtilsMessengerEXT(XrInstance instance, XrDebugUtilsMessengerCreateInfoEXT const * createInfo, XrDebugUtilsMessengerEXT * messenger)} */
    @NativeType("XrResult")
    public static int xrCreateDebugUtilsMessengerEXT(XrInstance instance, @NativeType("XrDebugUtilsMessengerCreateInfoEXT const *") XrDebugUtilsMessengerCreateInfoEXT createInfo, @NativeType("XrDebugUtilsMessengerEXT *") PointerBuffer messenger) {
        if (CHECKS) {
            check(messenger, 1);
        }
        return nxrCreateDebugUtilsMessengerEXT(instance, createInfo.address(), memAddress(messenger));
    }

    // --- [ xrDestroyDebugUtilsMessengerEXT ] ---

    /** {@code XrResult xrDestroyDebugUtilsMessengerEXT(XrDebugUtilsMessengerEXT messenger)} */
    @NativeType("XrResult")
    public static int xrDestroyDebugUtilsMessengerEXT(XrDebugUtilsMessengerEXT messenger) {
        long __functionAddress = messenger.getCapabilities().xrDestroyDebugUtilsMessengerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(messenger.address(), __functionAddress);
    }

    // --- [ xrSubmitDebugUtilsMessageEXT ] ---

    /** {@code XrResult xrSubmitDebugUtilsMessageEXT(XrInstance instance, XrDebugUtilsMessageSeverityFlagsEXT messageSeverity, XrDebugUtilsMessageTypeFlagsEXT messageTypes, XrDebugUtilsMessengerCallbackDataEXT const * callbackData)} */
    public static int nxrSubmitDebugUtilsMessageEXT(XrInstance instance, long messageSeverity, long messageTypes, long callbackData) {
        long __functionAddress = instance.getCapabilities().xrSubmitDebugUtilsMessageEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrDebugUtilsMessengerCallbackDataEXT.validate(callbackData);
        }
        return callPJJPI(instance.address(), messageSeverity, messageTypes, callbackData, __functionAddress);
    }

    /** {@code XrResult xrSubmitDebugUtilsMessageEXT(XrInstance instance, XrDebugUtilsMessageSeverityFlagsEXT messageSeverity, XrDebugUtilsMessageTypeFlagsEXT messageTypes, XrDebugUtilsMessengerCallbackDataEXT const * callbackData)} */
    @NativeType("XrResult")
    public static int xrSubmitDebugUtilsMessageEXT(XrInstance instance, @NativeType("XrDebugUtilsMessageSeverityFlagsEXT") long messageSeverity, @NativeType("XrDebugUtilsMessageTypeFlagsEXT") long messageTypes, @NativeType("XrDebugUtilsMessengerCallbackDataEXT const *") XrDebugUtilsMessengerCallbackDataEXT callbackData) {
        return nxrSubmitDebugUtilsMessageEXT(instance, messageSeverity, messageTypes, callbackData.address());
    }

    // --- [ xrSessionBeginDebugUtilsLabelRegionEXT ] ---

    /** {@code XrResult xrSessionBeginDebugUtilsLabelRegionEXT(XrSession session, XrDebugUtilsLabelEXT const * labelInfo)} */
    public static int nxrSessionBeginDebugUtilsLabelRegionEXT(XrSession session, long labelInfo) {
        long __functionAddress = session.getCapabilities().xrSessionBeginDebugUtilsLabelRegionEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrDebugUtilsLabelEXT.validate(labelInfo);
        }
        return callPPI(session.address(), labelInfo, __functionAddress);
    }

    /** {@code XrResult xrSessionBeginDebugUtilsLabelRegionEXT(XrSession session, XrDebugUtilsLabelEXT const * labelInfo)} */
    @NativeType("XrResult")
    public static int xrSessionBeginDebugUtilsLabelRegionEXT(XrSession session, @NativeType("XrDebugUtilsLabelEXT const *") XrDebugUtilsLabelEXT labelInfo) {
        return nxrSessionBeginDebugUtilsLabelRegionEXT(session, labelInfo.address());
    }

    // --- [ xrSessionEndDebugUtilsLabelRegionEXT ] ---

    /** {@code XrResult xrSessionEndDebugUtilsLabelRegionEXT(XrSession session)} */
    @NativeType("XrResult")
    public static int xrSessionEndDebugUtilsLabelRegionEXT(XrSession session) {
        long __functionAddress = session.getCapabilities().xrSessionEndDebugUtilsLabelRegionEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), __functionAddress);
    }

    // --- [ xrSessionInsertDebugUtilsLabelEXT ] ---

    /** {@code XrResult xrSessionInsertDebugUtilsLabelEXT(XrSession session, XrDebugUtilsLabelEXT const * labelInfo)} */
    public static int nxrSessionInsertDebugUtilsLabelEXT(XrSession session, long labelInfo) {
        long __functionAddress = session.getCapabilities().xrSessionInsertDebugUtilsLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrDebugUtilsLabelEXT.validate(labelInfo);
        }
        return callPPI(session.address(), labelInfo, __functionAddress);
    }

    /** {@code XrResult xrSessionInsertDebugUtilsLabelEXT(XrSession session, XrDebugUtilsLabelEXT const * labelInfo)} */
    @NativeType("XrResult")
    public static int xrSessionInsertDebugUtilsLabelEXT(XrSession session, @NativeType("XrDebugUtilsLabelEXT const *") XrDebugUtilsLabelEXT labelInfo) {
        return nxrSessionInsertDebugUtilsLabelEXT(session, labelInfo.address());
    }

}