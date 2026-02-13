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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class XR10 {

    public static final int
        XR_SUCCESS                                   = 0,
        XR_TIMEOUT_EXPIRED                           = 1,
        XR_SESSION_LOSS_PENDING                      = 3,
        XR_EVENT_UNAVAILABLE                         = 4,
        XR_SPACE_BOUNDS_UNAVAILABLE                  = 7,
        XR_SESSION_NOT_FOCUSED                       = 8,
        XR_FRAME_DISCARDED                           = 9,
        XR_ERROR_VALIDATION_FAILURE                  = -1,
        XR_ERROR_RUNTIME_FAILURE                     = -2,
        XR_ERROR_OUT_OF_MEMORY                       = -3,
        XR_ERROR_API_VERSION_UNSUPPORTED             = -4,
        XR_ERROR_INITIALIZATION_FAILED               = -6,
        XR_ERROR_FUNCTION_UNSUPPORTED                = -7,
        XR_ERROR_FEATURE_UNSUPPORTED                 = -8,
        XR_ERROR_EXTENSION_NOT_PRESENT               = -9,
        XR_ERROR_LIMIT_REACHED                       = -10,
        XR_ERROR_SIZE_INSUFFICIENT                   = -11,
        XR_ERROR_HANDLE_INVALID                      = -12,
        XR_ERROR_INSTANCE_LOST                       = -13,
        XR_ERROR_SESSION_RUNNING                     = -14,
        XR_ERROR_SESSION_NOT_RUNNING                 = -16,
        XR_ERROR_SESSION_LOST                        = -17,
        XR_ERROR_SYSTEM_INVALID                      = -18,
        XR_ERROR_PATH_INVALID                        = -19,
        XR_ERROR_PATH_COUNT_EXCEEDED                 = -20,
        XR_ERROR_PATH_FORMAT_INVALID                 = -21,
        XR_ERROR_PATH_UNSUPPORTED                    = -22,
        XR_ERROR_LAYER_INVALID                       = -23,
        XR_ERROR_LAYER_LIMIT_EXCEEDED                = -24,
        XR_ERROR_SWAPCHAIN_RECT_INVALID              = -25,
        XR_ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED        = -26,
        XR_ERROR_ACTION_TYPE_MISMATCH                = -27,
        XR_ERROR_SESSION_NOT_READY                   = -28,
        XR_ERROR_SESSION_NOT_STOPPING                = -29,
        XR_ERROR_TIME_INVALID                        = -30,
        XR_ERROR_REFERENCE_SPACE_UNSUPPORTED         = -31,
        XR_ERROR_FILE_ACCESS_ERROR                   = -32,
        XR_ERROR_FILE_CONTENTS_INVALID               = -33,
        XR_ERROR_FORM_FACTOR_UNSUPPORTED             = -34,
        XR_ERROR_FORM_FACTOR_UNAVAILABLE             = -35,
        XR_ERROR_API_LAYER_NOT_PRESENT               = -36,
        XR_ERROR_CALL_ORDER_INVALID                  = -37,
        XR_ERROR_GRAPHICS_DEVICE_INVALID             = -38,
        XR_ERROR_POSE_INVALID                        = -39,
        XR_ERROR_INDEX_OUT_OF_RANGE                  = -40,
        XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED = -41,
        XR_ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED  = -42,
        XR_ERROR_NAME_DUPLICATED                     = -44,
        XR_ERROR_NAME_INVALID                        = -45,
        XR_ERROR_ACTIONSET_NOT_ATTACHED              = -46,
        XR_ERROR_ACTIONSETS_ALREADY_ATTACHED         = -47,
        XR_ERROR_LOCALIZED_NAME_DUPLICATED           = -48,
        XR_ERROR_LOCALIZED_NAME_INVALID              = -49,
        XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING  = -50,
        XR_ERROR_RUNTIME_UNAVAILABLE                 = -51;

    public static final int
        XR_TYPE_UNKNOWN                                   = 0,
        XR_TYPE_API_LAYER_PROPERTIES                      = 1,
        XR_TYPE_EXTENSION_PROPERTIES                      = 2,
        XR_TYPE_INSTANCE_CREATE_INFO                      = 3,
        XR_TYPE_SYSTEM_GET_INFO                           = 4,
        XR_TYPE_SYSTEM_PROPERTIES                         = 5,
        XR_TYPE_VIEW_LOCATE_INFO                          = 6,
        XR_TYPE_VIEW                                      = 7,
        XR_TYPE_SESSION_CREATE_INFO                       = 8,
        XR_TYPE_SWAPCHAIN_CREATE_INFO                     = 9,
        XR_TYPE_SESSION_BEGIN_INFO                        = 10,
        XR_TYPE_VIEW_STATE                                = 11,
        XR_TYPE_FRAME_END_INFO                            = 12,
        XR_TYPE_HAPTIC_VIBRATION                          = 13,
        XR_TYPE_EVENT_DATA_BUFFER                         = 16,
        XR_TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING          = 17,
        XR_TYPE_EVENT_DATA_SESSION_STATE_CHANGED          = 18,
        XR_TYPE_ACTION_STATE_BOOLEAN                      = 23,
        XR_TYPE_ACTION_STATE_FLOAT                        = 24,
        XR_TYPE_ACTION_STATE_VECTOR2F                     = 25,
        XR_TYPE_ACTION_STATE_POSE                         = 27,
        XR_TYPE_ACTION_SET_CREATE_INFO                    = 28,
        XR_TYPE_ACTION_CREATE_INFO                        = 29,
        XR_TYPE_INSTANCE_PROPERTIES                       = 32,
        XR_TYPE_FRAME_WAIT_INFO                           = 33,
        XR_TYPE_COMPOSITION_LAYER_PROJECTION              = 35,
        XR_TYPE_COMPOSITION_LAYER_QUAD                    = 36,
        XR_TYPE_REFERENCE_SPACE_CREATE_INFO               = 37,
        XR_TYPE_ACTION_SPACE_CREATE_INFO                  = 38,
        XR_TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING = 40,
        XR_TYPE_VIEW_CONFIGURATION_VIEW                   = 41,
        XR_TYPE_SPACE_LOCATION                            = 42,
        XR_TYPE_SPACE_VELOCITY                            = 43,
        XR_TYPE_FRAME_STATE                               = 44,
        XR_TYPE_VIEW_CONFIGURATION_PROPERTIES             = 45,
        XR_TYPE_FRAME_BEGIN_INFO                          = 46,
        XR_TYPE_COMPOSITION_LAYER_PROJECTION_VIEW         = 48,
        XR_TYPE_EVENT_DATA_EVENTS_LOST                    = 49,
        XR_TYPE_INTERACTION_PROFILE_SUGGESTED_BINDING     = 51,
        XR_TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED    = 52,
        XR_TYPE_INTERACTION_PROFILE_STATE                 = 53,
        XR_TYPE_SWAPCHAIN_IMAGE_ACQUIRE_INFO              = 55,
        XR_TYPE_SWAPCHAIN_IMAGE_WAIT_INFO                 = 56,
        XR_TYPE_SWAPCHAIN_IMAGE_RELEASE_INFO              = 57,
        XR_TYPE_ACTION_STATE_GET_INFO                     = 58,
        XR_TYPE_HAPTIC_ACTION_INFO                        = 59,
        XR_TYPE_SESSION_ACTION_SETS_ATTACH_INFO           = 60,
        XR_TYPE_ACTIONS_SYNC_INFO                         = 61,
        XR_TYPE_BOUND_SOURCES_FOR_ACTION_ENUMERATE_INFO   = 62,
        XR_TYPE_INPUT_SOURCE_LOCALIZED_NAME_GET_INFO      = 63;

    public static final int
        XR_FORM_FACTOR_HEAD_MOUNTED_DISPLAY = 1,
        XR_FORM_FACTOR_HANDHELD_DISPLAY     = 2;

    public static final int
        XR_VIEW_CONFIGURATION_TYPE_PRIMARY_MONO   = 1,
        XR_VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO = 2;

    public static final int
        XR_ENVIRONMENT_BLEND_MODE_OPAQUE      = 1,
        XR_ENVIRONMENT_BLEND_MODE_ADDITIVE    = 2,
        XR_ENVIRONMENT_BLEND_MODE_ALPHA_BLEND = 3;

    public static final int
        XR_SPACE_VELOCITY_LINEAR_VALID_BIT  = 0x1,
        XR_SPACE_VELOCITY_ANGULAR_VALID_BIT = 0x2;

    public static final int
        XR_REFERENCE_SPACE_TYPE_VIEW  = 1,
        XR_REFERENCE_SPACE_TYPE_LOCAL = 2,
        XR_REFERENCE_SPACE_TYPE_STAGE = 3;

    public static final int
        XR_SPACE_LOCATION_ORIENTATION_VALID_BIT   = 0x1,
        XR_SPACE_LOCATION_POSITION_VALID_BIT      = 0x2,
        XR_SPACE_LOCATION_ORIENTATION_TRACKED_BIT = 0x4,
        XR_SPACE_LOCATION_POSITION_TRACKED_BIT    = 0x8;

    public static final int
        XR_SWAPCHAIN_CREATE_PROTECTED_CONTENT_BIT = 0x1,
        XR_SWAPCHAIN_CREATE_STATIC_IMAGE_BIT      = 0x2;

    public static final int
        XR_SWAPCHAIN_USAGE_COLOR_ATTACHMENT_BIT         = 0x1,
        XR_SWAPCHAIN_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x2,
        XR_SWAPCHAIN_USAGE_UNORDERED_ACCESS_BIT         = 0x4,
        XR_SWAPCHAIN_USAGE_TRANSFER_SRC_BIT             = 0x8,
        XR_SWAPCHAIN_USAGE_TRANSFER_DST_BIT             = 0x10,
        XR_SWAPCHAIN_USAGE_SAMPLED_BIT                  = 0x20,
        XR_SWAPCHAIN_USAGE_MUTABLE_FORMAT_BIT           = 0x40;

    public static final int
        XR_COMPOSITION_LAYER_CORRECT_CHROMATIC_ABERRATION_BIT = 0x1,
        XR_COMPOSITION_LAYER_BLEND_TEXTURE_SOURCE_ALPHA_BIT   = 0x2,
        XR_COMPOSITION_LAYER_UNPREMULTIPLIED_ALPHA_BIT        = 0x4;

    public static final int
        XR_VIEW_STATE_ORIENTATION_VALID_BIT   = 0x1,
        XR_VIEW_STATE_POSITION_VALID_BIT      = 0x2,
        XR_VIEW_STATE_ORIENTATION_TRACKED_BIT = 0x4,
        XR_VIEW_STATE_POSITION_TRACKED_BIT    = 0x8;

    public static final int
        XR_ACTION_TYPE_BOOLEAN_INPUT    = 1,
        XR_ACTION_TYPE_FLOAT_INPUT      = 2,
        XR_ACTION_TYPE_VECTOR2F_INPUT   = 3,
        XR_ACTION_TYPE_POSE_INPUT       = 4,
        XR_ACTION_TYPE_VIBRATION_OUTPUT = 100;

    public static final int
        XR_INPUT_SOURCE_LOCALIZED_NAME_USER_PATH_BIT           = 0x1,
        XR_INPUT_SOURCE_LOCALIZED_NAME_INTERACTION_PROFILE_BIT = 0x2,
        XR_INPUT_SOURCE_LOCALIZED_NAME_COMPONENT_BIT           = 0x4;

    public static final int
        XR_EYE_VISIBILITY_BOTH  = 0,
        XR_EYE_VISIBILITY_LEFT  = 1,
        XR_EYE_VISIBILITY_RIGHT = 2;

    public static final int
        XR_SESSION_STATE_UNKNOWN      = 0,
        XR_SESSION_STATE_IDLE         = 1,
        XR_SESSION_STATE_READY        = 2,
        XR_SESSION_STATE_SYNCHRONIZED = 3,
        XR_SESSION_STATE_VISIBLE      = 4,
        XR_SESSION_STATE_FOCUSED      = 5,
        XR_SESSION_STATE_STOPPING     = 6,
        XR_SESSION_STATE_LOSS_PENDING = 7,
        XR_SESSION_STATE_EXITING      = 8;

    public static final int
        XR_OBJECT_TYPE_UNKNOWN    = 0,
        XR_OBJECT_TYPE_INSTANCE   = 1,
        XR_OBJECT_TYPE_SESSION    = 2,
        XR_OBJECT_TYPE_SWAPCHAIN  = 3,
        XR_OBJECT_TYPE_SPACE      = 4,
        XR_OBJECT_TYPE_ACTION_SET = 5,
        XR_OBJECT_TYPE_ACTION     = 6;

    public static final long XR_CURRENT_API_VERSION = XR_MAKE_VERSION(1, 1, 57);

    public static final long XR_API_VERSION_1_0 = XR_MAKE_VERSION(1, 0, XR_VERSION_PATCH(XR_CURRENT_API_VERSION));

    public static final int
        XR_USE_GRAPHICS_API_OPENGL    = 0,
        XR_USE_GRAPHICS_API_OPENGL_ES = 0,
        XR_USE_GRAPHICS_API_VULKAN    = 0,
        XR_USE_PLATFORM_EGL           = 0,
        XR_USE_PLATFORM_WIN32         = 0,
        XR_USE_PLATFORM_XLIB          = 0,
        XR_USE_PLATFORM_XCB           = 0,
        XR_USE_PLATFORM_WAYLAND       = 0;

    public static final long
        XR_NULL_HANDLE         = 0x0L,
        XR_NULL_PATH           = 0x0L,
        XR_NULL_SYSTEM_ID      = 0x0L,
        XR_NO_DURATION         = 0x0L,
        XR_INFINITE_DURATION   = 0x7FFF_FFFF_FFFF_FFFFL,
        XR_MIN_HAPTIC_DURATION = 0xFFFFFFFFFFFFFFFFL,
        XR_MAX_EVENT_DATA_SIZE = XrEventDataBuffer.SIZEOF;

    public static final float XR_FREQUENCY_UNSPECIFIED = 0f;

    public static final int
        XR_TRUE                               = 1,
        XR_FALSE                              = 0,
        XR_MAX_EXTENSION_NAME_SIZE            = 128,
        XR_MAX_API_LAYER_NAME_SIZE            = 256,
        XR_MAX_API_LAYER_DESCRIPTION_SIZE     = 256,
        XR_MAX_SYSTEM_NAME_SIZE               = 256,
        XR_MAX_APPLICATION_NAME_SIZE          = 128,
        XR_MAX_ENGINE_NAME_SIZE               = 128,
        XR_MAX_RUNTIME_NAME_SIZE              = 128,
        XR_MAX_PATH_LENGTH                    = 256,
        XR_MAX_STRUCTURE_NAME_SIZE            = 64,
        XR_MAX_RESULT_STRING_SIZE             = 64,
        XR_MAX_GRAPHICS_APIS_SUPPORTED        = 32,
        XR_MAX_ACTION_SET_NAME_SIZE           = 64,
        XR_MAX_ACTION_NAME_SIZE               = 64,
        XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE = 128,
        XR_MAX_LOCALIZED_ACTION_NAME_SIZE     = 128,
        XR_MIN_COMPOSITION_LAYERS_SUPPORTED   = 16;

    protected XR10() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetInstanceProcAddr ] ---

    /** {@code XrResult xrGetInstanceProcAddr(XrInstance instance, char const * name, PFN_xrVoidFunction * function)} */
    public static int nxrGetInstanceProcAddr(long instance, long name, long function) {
        long __functionAddress = XR.getGlobalCommands().xrGetInstanceProcAddr;
        return callPPPI(instance, name, function, __functionAddress);
    }

    /** {@code XrResult xrGetInstanceProcAddr(XrInstance instance, char const * name, PFN_xrVoidFunction * function)} */
    @NativeType("XrResult")
    public static int xrGetInstanceProcAddr(@NativeType("XrInstance") @Nullable XrInstance instance, @NativeType("char const *") ByteBuffer name, @NativeType("PFN_xrVoidFunction *") PointerBuffer function) {
        if (CHECKS) {
            checkNT1(name);
            check(function, 1);
        }
        return nxrGetInstanceProcAddr(memAddressSafe(instance), memAddress(name), memAddress(function));
    }

    /** {@code XrResult xrGetInstanceProcAddr(XrInstance instance, char const * name, PFN_xrVoidFunction * function)} */
    @NativeType("XrResult")
    public static int xrGetInstanceProcAddr(@NativeType("XrInstance") @Nullable XrInstance instance, @NativeType("char const *") CharSequence name, @NativeType("PFN_xrVoidFunction *") PointerBuffer function) {
        if (CHECKS) {
            check(function, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nxrGetInstanceProcAddr(memAddressSafe(instance), nameEncoded, memAddress(function));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ xrEnumerateApiLayerProperties ] ---

    /** {@code XrResult xrEnumerateApiLayerProperties(uint32_t propertyCapacityInput, uint32_t * propertyCountOutput, XrApiLayerProperties * properties)} */
    public static int nxrEnumerateApiLayerProperties(int propertyCapacityInput, long propertyCountOutput, long properties) {
        long __functionAddress = XR.getGlobalCommands().xrEnumerateApiLayerProperties;
        return callPPI(propertyCapacityInput, propertyCountOutput, properties, __functionAddress);
    }

    /** {@code XrResult xrEnumerateApiLayerProperties(uint32_t propertyCapacityInput, uint32_t * propertyCountOutput, XrApiLayerProperties * properties)} */
    @NativeType("XrResult")
    public static int xrEnumerateApiLayerProperties(@NativeType("uint32_t *") IntBuffer propertyCountOutput, @NativeType("XrApiLayerProperties *") XrApiLayerProperties.@Nullable Buffer properties) {
        if (CHECKS) {
            check(propertyCountOutput, 1);
        }
        return nxrEnumerateApiLayerProperties(remainingSafe(properties), memAddress(propertyCountOutput), memAddressSafe(properties));
    }

    // --- [ xrEnumerateInstanceExtensionProperties ] ---

    /** {@code XrResult xrEnumerateInstanceExtensionProperties(char const * layerName, uint32_t propertyCapacityInput, uint32_t * propertyCountOutput, XrExtensionProperties * properties)} */
    public static int nxrEnumerateInstanceExtensionProperties(long layerName, int propertyCapacityInput, long propertyCountOutput, long properties) {
        long __functionAddress = XR.getGlobalCommands().xrEnumerateInstanceExtensionProperties;
        return callPPPI(layerName, propertyCapacityInput, propertyCountOutput, properties, __functionAddress);
    }

    /** {@code XrResult xrEnumerateInstanceExtensionProperties(char const * layerName, uint32_t propertyCapacityInput, uint32_t * propertyCountOutput, XrExtensionProperties * properties)} */
    @NativeType("XrResult")
    public static int xrEnumerateInstanceExtensionProperties(@NativeType("char const *") @Nullable ByteBuffer layerName, @NativeType("uint32_t *") IntBuffer propertyCountOutput, @NativeType("XrExtensionProperties *") XrExtensionProperties.@Nullable Buffer properties) {
        if (CHECKS) {
            checkNT1Safe(layerName);
            check(propertyCountOutput, 1);
        }
        return nxrEnumerateInstanceExtensionProperties(memAddressSafe(layerName), remainingSafe(properties), memAddress(propertyCountOutput), memAddressSafe(properties));
    }

    /** {@code XrResult xrEnumerateInstanceExtensionProperties(char const * layerName, uint32_t propertyCapacityInput, uint32_t * propertyCountOutput, XrExtensionProperties * properties)} */
    @NativeType("XrResult")
    public static int xrEnumerateInstanceExtensionProperties(@NativeType("char const *") @Nullable CharSequence layerName, @NativeType("uint32_t *") IntBuffer propertyCountOutput, @NativeType("XrExtensionProperties *") XrExtensionProperties.@Nullable Buffer properties) {
        if (CHECKS) {
            check(propertyCountOutput, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(layerName, true);
            long layerNameEncoded = layerName == null ? NULL : stack.getPointerAddress();
            return nxrEnumerateInstanceExtensionProperties(layerNameEncoded, remainingSafe(properties), memAddress(propertyCountOutput), memAddressSafe(properties));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ xrCreateInstance ] ---

    /** {@code XrResult xrCreateInstance(XrInstanceCreateInfo const * createInfo, XrInstance * instance)} */
    public static int nxrCreateInstance(long createInfo, long instance) {
        long __functionAddress = XR.getGlobalCommands().xrCreateInstance;
        if (CHECKS) {
            XrInstanceCreateInfo.validate(createInfo);
        }
        return callPPI(createInfo, instance, __functionAddress);
    }

    /** {@code XrResult xrCreateInstance(XrInstanceCreateInfo const * createInfo, XrInstance * instance)} */
    @NativeType("XrResult")
    public static int xrCreateInstance(@NativeType("XrInstanceCreateInfo const *") XrInstanceCreateInfo createInfo, @NativeType("XrInstance *") PointerBuffer instance) {
        if (CHECKS) {
            check(instance, 1);
        }
        return nxrCreateInstance(createInfo.address(), memAddress(instance));
    }

    // --- [ xrDestroyInstance ] ---

    /** {@code XrResult xrDestroyInstance(XrInstance instance)} */
    @NativeType("XrResult")
    public static int xrDestroyInstance(XrInstance instance) {
        long __functionAddress = instance.getCapabilities().xrDestroyInstance;
        return callPI(instance.address(), __functionAddress);
    }

    // --- [ xrGetInstanceProperties ] ---

    /** {@code XrResult xrGetInstanceProperties(XrInstance instance, XrInstanceProperties * instanceProperties)} */
    public static int nxrGetInstanceProperties(XrInstance instance, long instanceProperties) {
        long __functionAddress = instance.getCapabilities().xrGetInstanceProperties;
        return callPPI(instance.address(), instanceProperties, __functionAddress);
    }

    /** {@code XrResult xrGetInstanceProperties(XrInstance instance, XrInstanceProperties * instanceProperties)} */
    @NativeType("XrResult")
    public static int xrGetInstanceProperties(XrInstance instance, @NativeType("XrInstanceProperties *") XrInstanceProperties instanceProperties) {
        return nxrGetInstanceProperties(instance, instanceProperties.address());
    }

    // --- [ xrPollEvent ] ---

    /** {@code XrResult xrPollEvent(XrInstance instance, XrEventDataBuffer * eventData)} */
    public static int nxrPollEvent(XrInstance instance, long eventData) {
        long __functionAddress = instance.getCapabilities().xrPollEvent;
        return callPPI(instance.address(), eventData, __functionAddress);
    }

    /** {@code XrResult xrPollEvent(XrInstance instance, XrEventDataBuffer * eventData)} */
    @NativeType("XrResult")
    public static int xrPollEvent(XrInstance instance, @NativeType("XrEventDataBuffer *") XrEventDataBuffer eventData) {
        return nxrPollEvent(instance, eventData.address());
    }

    // --- [ xrResultToString ] ---

    /** {@code XrResult xrResultToString(XrInstance instance, XrResult value, char * buffer)} */
    public static int nxrResultToString(XrInstance instance, int value, long buffer) {
        long __functionAddress = instance.getCapabilities().xrResultToString;
        return callPPI(instance.address(), value, buffer, __functionAddress);
    }

    /** {@code XrResult xrResultToString(XrInstance instance, XrResult value, char * buffer)} */
    @NativeType("XrResult")
    public static int xrResultToString(XrInstance instance, @NativeType("XrResult") int value, @NativeType("char *") ByteBuffer buffer) {
        if (CHECKS) {
            check(buffer, XR_MAX_RESULT_STRING_SIZE);
        }
        return nxrResultToString(instance, value, memAddress(buffer));
    }

    // --- [ xrStructureTypeToString ] ---

    /** {@code XrResult xrStructureTypeToString(XrInstance instance, XrStructureType value, char * buffer)} */
    public static int nxrStructureTypeToString(XrInstance instance, int value, long buffer) {
        long __functionAddress = instance.getCapabilities().xrStructureTypeToString;
        return callPPI(instance.address(), value, buffer, __functionAddress);
    }

    /** {@code XrResult xrStructureTypeToString(XrInstance instance, XrStructureType value, char * buffer)} */
    @NativeType("XrResult")
    public static int xrStructureTypeToString(XrInstance instance, @NativeType("XrStructureType") int value, @NativeType("char *") ByteBuffer buffer) {
        if (CHECKS) {
            check(buffer, XR_MAX_STRUCTURE_NAME_SIZE);
        }
        return nxrStructureTypeToString(instance, value, memAddress(buffer));
    }

    // --- [ xrGetSystem ] ---

    /** {@code XrResult xrGetSystem(XrInstance instance, XrSystemGetInfo const * getInfo, XrSystemId * systemId)} */
    public static int nxrGetSystem(XrInstance instance, long getInfo, long systemId) {
        long __functionAddress = instance.getCapabilities().xrGetSystem;
        return callPPPI(instance.address(), getInfo, systemId, __functionAddress);
    }

    /** {@code XrResult xrGetSystem(XrInstance instance, XrSystemGetInfo const * getInfo, XrSystemId * systemId)} */
    @NativeType("XrResult")
    public static int xrGetSystem(XrInstance instance, @NativeType("XrSystemGetInfo const *") XrSystemGetInfo getInfo, @NativeType("XrSystemId *") LongBuffer systemId) {
        if (CHECKS) {
            check(systemId, 1);
        }
        return nxrGetSystem(instance, getInfo.address(), memAddress(systemId));
    }

    // --- [ xrGetSystemProperties ] ---

    /** {@code XrResult xrGetSystemProperties(XrInstance instance, XrSystemId systemId, XrSystemProperties * properties)} */
    public static int nxrGetSystemProperties(XrInstance instance, long systemId, long properties) {
        long __functionAddress = instance.getCapabilities().xrGetSystemProperties;
        return callPJPI(instance.address(), systemId, properties, __functionAddress);
    }

    /** {@code XrResult xrGetSystemProperties(XrInstance instance, XrSystemId systemId, XrSystemProperties * properties)} */
    @NativeType("XrResult")
    public static int xrGetSystemProperties(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrSystemProperties *") XrSystemProperties properties) {
        return nxrGetSystemProperties(instance, systemId, properties.address());
    }

    // --- [ xrEnumerateEnvironmentBlendModes ] ---

    /** {@code XrResult xrEnumerateEnvironmentBlendModes(XrInstance instance, XrSystemId systemId, XrViewConfigurationType viewConfigurationType, uint32_t environmentBlendModeCapacityInput, uint32_t * environmentBlendModeCountOutput, XrEnvironmentBlendMode * environmentBlendModes)} */
    public static int nxrEnumerateEnvironmentBlendModes(XrInstance instance, long systemId, int viewConfigurationType, int environmentBlendModeCapacityInput, long environmentBlendModeCountOutput, long environmentBlendModes) {
        long __functionAddress = instance.getCapabilities().xrEnumerateEnvironmentBlendModes;
        return callPJPPI(instance.address(), systemId, viewConfigurationType, environmentBlendModeCapacityInput, environmentBlendModeCountOutput, environmentBlendModes, __functionAddress);
    }

    /** {@code XrResult xrEnumerateEnvironmentBlendModes(XrInstance instance, XrSystemId systemId, XrViewConfigurationType viewConfigurationType, uint32_t environmentBlendModeCapacityInput, uint32_t * environmentBlendModeCountOutput, XrEnvironmentBlendMode * environmentBlendModes)} */
    @NativeType("XrResult")
    public static int xrEnumerateEnvironmentBlendModes(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrViewConfigurationType") int viewConfigurationType, @NativeType("uint32_t *") IntBuffer environmentBlendModeCountOutput, @NativeType("XrEnvironmentBlendMode *") @Nullable IntBuffer environmentBlendModes) {
        if (CHECKS) {
            check(environmentBlendModeCountOutput, 1);
        }
        return nxrEnumerateEnvironmentBlendModes(instance, systemId, viewConfigurationType, remainingSafe(environmentBlendModes), memAddress(environmentBlendModeCountOutput), memAddressSafe(environmentBlendModes));
    }

    // --- [ xrCreateSession ] ---

    /** {@code XrResult xrCreateSession(XrInstance instance, XrSessionCreateInfo const * createInfo, XrSession * session)} */
    public static int nxrCreateSession(XrInstance instance, long createInfo, long session) {
        long __functionAddress = instance.getCapabilities().xrCreateSession;
        return callPPPI(instance.address(), createInfo, session, __functionAddress);
    }

    /** {@code XrResult xrCreateSession(XrInstance instance, XrSessionCreateInfo const * createInfo, XrSession * session)} */
    @NativeType("XrResult")
    public static int xrCreateSession(XrInstance instance, @NativeType("XrSessionCreateInfo const *") XrSessionCreateInfo createInfo, @NativeType("XrSession *") PointerBuffer session) {
        if (CHECKS) {
            check(session, 1);
        }
        return nxrCreateSession(instance, createInfo.address(), memAddress(session));
    }

    // --- [ xrDestroySession ] ---

    /** {@code XrResult xrDestroySession(XrSession session)} */
    @NativeType("XrResult")
    public static int xrDestroySession(XrSession session) {
        long __functionAddress = session.getCapabilities().xrDestroySession;
        return callPI(session.address(), __functionAddress);
    }

    // --- [ xrEnumerateReferenceSpaces ] ---

    /** {@code XrResult xrEnumerateReferenceSpaces(XrSession session, uint32_t spaceCapacityInput, uint32_t * spaceCountOutput, XrReferenceSpaceType * spaces)} */
    public static int nxrEnumerateReferenceSpaces(XrSession session, int spaceCapacityInput, long spaceCountOutput, long spaces) {
        long __functionAddress = session.getCapabilities().xrEnumerateReferenceSpaces;
        return callPPPI(session.address(), spaceCapacityInput, spaceCountOutput, spaces, __functionAddress);
    }

    /** {@code XrResult xrEnumerateReferenceSpaces(XrSession session, uint32_t spaceCapacityInput, uint32_t * spaceCountOutput, XrReferenceSpaceType * spaces)} */
    @NativeType("XrResult")
    public static int xrEnumerateReferenceSpaces(XrSession session, @NativeType("uint32_t *") IntBuffer spaceCountOutput, @NativeType("XrReferenceSpaceType *") @Nullable IntBuffer spaces) {
        if (CHECKS) {
            check(spaceCountOutput, 1);
        }
        return nxrEnumerateReferenceSpaces(session, remainingSafe(spaces), memAddress(spaceCountOutput), memAddressSafe(spaces));
    }

    // --- [ xrCreateReferenceSpace ] ---

    /** {@code XrResult xrCreateReferenceSpace(XrSession session, XrReferenceSpaceCreateInfo const * createInfo, XrSpace * space)} */
    public static int nxrCreateReferenceSpace(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateReferenceSpace;
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    /** {@code XrResult xrCreateReferenceSpace(XrSession session, XrReferenceSpaceCreateInfo const * createInfo, XrSpace * space)} */
    @NativeType("XrResult")
    public static int xrCreateReferenceSpace(XrSession session, @NativeType("XrReferenceSpaceCreateInfo const *") XrReferenceSpaceCreateInfo createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateReferenceSpace(session, createInfo.address(), memAddress(space));
    }

    // --- [ xrGetReferenceSpaceBoundsRect ] ---

    /** {@code XrResult xrGetReferenceSpaceBoundsRect(XrSession session, XrReferenceSpaceType referenceSpaceType, XrExtent2Df * bounds)} */
    public static int nxrGetReferenceSpaceBoundsRect(XrSession session, int referenceSpaceType, long bounds) {
        long __functionAddress = session.getCapabilities().xrGetReferenceSpaceBoundsRect;
        return callPPI(session.address(), referenceSpaceType, bounds, __functionAddress);
    }

    /** {@code XrResult xrGetReferenceSpaceBoundsRect(XrSession session, XrReferenceSpaceType referenceSpaceType, XrExtent2Df * bounds)} */
    @NativeType("XrResult")
    public static int xrGetReferenceSpaceBoundsRect(XrSession session, @NativeType("XrReferenceSpaceType") int referenceSpaceType, @NativeType("XrExtent2Df *") XrExtent2Df bounds) {
        return nxrGetReferenceSpaceBoundsRect(session, referenceSpaceType, bounds.address());
    }

    // --- [ xrCreateActionSpace ] ---

    /** {@code XrResult xrCreateActionSpace(XrSession session, XrActionSpaceCreateInfo const * createInfo, XrSpace * space)} */
    public static int nxrCreateActionSpace(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateActionSpace;
        if (CHECKS) {
            XrActionSpaceCreateInfo.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    /** {@code XrResult xrCreateActionSpace(XrSession session, XrActionSpaceCreateInfo const * createInfo, XrSpace * space)} */
    @NativeType("XrResult")
    public static int xrCreateActionSpace(XrSession session, @NativeType("XrActionSpaceCreateInfo const *") XrActionSpaceCreateInfo createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateActionSpace(session, createInfo.address(), memAddress(space));
    }

    // --- [ xrLocateSpace ] ---

    /** {@code XrResult xrLocateSpace(XrSpace space, XrSpace baseSpace, XrTime time, XrSpaceLocation * location)} */
    public static int nxrLocateSpace(XrSpace space, XrSpace baseSpace, long time, long location) {
        long __functionAddress = space.getCapabilities().xrLocateSpace;
        return callPPJPI(space.address(), baseSpace.address(), time, location, __functionAddress);
    }

    /** {@code XrResult xrLocateSpace(XrSpace space, XrSpace baseSpace, XrTime time, XrSpaceLocation * location)} */
    @NativeType("XrResult")
    public static int xrLocateSpace(XrSpace space, XrSpace baseSpace, @NativeType("XrTime") long time, @NativeType("XrSpaceLocation *") XrSpaceLocation location) {
        return nxrLocateSpace(space, baseSpace, time, location.address());
    }

    // --- [ xrDestroySpace ] ---

    /** {@code XrResult xrDestroySpace(XrSpace space)} */
    @NativeType("XrResult")
    public static int xrDestroySpace(XrSpace space) {
        long __functionAddress = space.getCapabilities().xrDestroySpace;
        return callPI(space.address(), __functionAddress);
    }

    // --- [ xrEnumerateViewConfigurations ] ---

    /** {@code XrResult xrEnumerateViewConfigurations(XrInstance instance, XrSystemId systemId, uint32_t viewConfigurationTypeCapacityInput, uint32_t * viewConfigurationTypeCountOutput, XrViewConfigurationType * viewConfigurationTypes)} */
    public static int nxrEnumerateViewConfigurations(XrInstance instance, long systemId, int viewConfigurationTypeCapacityInput, long viewConfigurationTypeCountOutput, long viewConfigurationTypes) {
        long __functionAddress = instance.getCapabilities().xrEnumerateViewConfigurations;
        return callPJPPI(instance.address(), systemId, viewConfigurationTypeCapacityInput, viewConfigurationTypeCountOutput, viewConfigurationTypes, __functionAddress);
    }

    /** {@code XrResult xrEnumerateViewConfigurations(XrInstance instance, XrSystemId systemId, uint32_t viewConfigurationTypeCapacityInput, uint32_t * viewConfigurationTypeCountOutput, XrViewConfigurationType * viewConfigurationTypes)} */
    @NativeType("XrResult")
    public static int xrEnumerateViewConfigurations(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer viewConfigurationTypeCountOutput, @NativeType("XrViewConfigurationType *") @Nullable IntBuffer viewConfigurationTypes) {
        if (CHECKS) {
            check(viewConfigurationTypeCountOutput, 1);
        }
        return nxrEnumerateViewConfigurations(instance, systemId, remainingSafe(viewConfigurationTypes), memAddress(viewConfigurationTypeCountOutput), memAddressSafe(viewConfigurationTypes));
    }

    // --- [ xrGetViewConfigurationProperties ] ---

    /** {@code XrResult xrGetViewConfigurationProperties(XrInstance instance, XrSystemId systemId, XrViewConfigurationType viewConfigurationType, XrViewConfigurationProperties * configurationProperties)} */
    public static int nxrGetViewConfigurationProperties(XrInstance instance, long systemId, int viewConfigurationType, long configurationProperties) {
        long __functionAddress = instance.getCapabilities().xrGetViewConfigurationProperties;
        return callPJPI(instance.address(), systemId, viewConfigurationType, configurationProperties, __functionAddress);
    }

    /** {@code XrResult xrGetViewConfigurationProperties(XrInstance instance, XrSystemId systemId, XrViewConfigurationType viewConfigurationType, XrViewConfigurationProperties * configurationProperties)} */
    @NativeType("XrResult")
    public static int xrGetViewConfigurationProperties(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrViewConfigurationType") int viewConfigurationType, @NativeType("XrViewConfigurationProperties *") XrViewConfigurationProperties configurationProperties) {
        return nxrGetViewConfigurationProperties(instance, systemId, viewConfigurationType, configurationProperties.address());
    }

    // --- [ xrEnumerateViewConfigurationViews ] ---

    /** {@code XrResult xrEnumerateViewConfigurationViews(XrInstance instance, XrSystemId systemId, XrViewConfigurationType viewConfigurationType, uint32_t viewCapacityInput, uint32_t * viewCountOutput, XrViewConfigurationView * views)} */
    public static int nxrEnumerateViewConfigurationViews(XrInstance instance, long systemId, int viewConfigurationType, int viewCapacityInput, long viewCountOutput, long views) {
        long __functionAddress = instance.getCapabilities().xrEnumerateViewConfigurationViews;
        return callPJPPI(instance.address(), systemId, viewConfigurationType, viewCapacityInput, viewCountOutput, views, __functionAddress);
    }

    /** {@code XrResult xrEnumerateViewConfigurationViews(XrInstance instance, XrSystemId systemId, XrViewConfigurationType viewConfigurationType, uint32_t viewCapacityInput, uint32_t * viewCountOutput, XrViewConfigurationView * views)} */
    @NativeType("XrResult")
    public static int xrEnumerateViewConfigurationViews(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrViewConfigurationType") int viewConfigurationType, @NativeType("uint32_t *") IntBuffer viewCountOutput, @NativeType("XrViewConfigurationView *") XrViewConfigurationView.@Nullable Buffer views) {
        if (CHECKS) {
            check(viewCountOutput, 1);
        }
        return nxrEnumerateViewConfigurationViews(instance, systemId, viewConfigurationType, remainingSafe(views), memAddress(viewCountOutput), memAddressSafe(views));
    }

    // --- [ xrEnumerateSwapchainFormats ] ---

    /** {@code XrResult xrEnumerateSwapchainFormats(XrSession session, uint32_t formatCapacityInput, uint32_t * formatCountOutput, int64_t * formats)} */
    public static int nxrEnumerateSwapchainFormats(XrSession session, int formatCapacityInput, long formatCountOutput, long formats) {
        long __functionAddress = session.getCapabilities().xrEnumerateSwapchainFormats;
        return callPPPI(session.address(), formatCapacityInput, formatCountOutput, formats, __functionAddress);
    }

    /** {@code XrResult xrEnumerateSwapchainFormats(XrSession session, uint32_t formatCapacityInput, uint32_t * formatCountOutput, int64_t * formats)} */
    @NativeType("XrResult")
    public static int xrEnumerateSwapchainFormats(XrSession session, @NativeType("uint32_t *") IntBuffer formatCountOutput, @NativeType("int64_t *") @Nullable LongBuffer formats) {
        if (CHECKS) {
            check(formatCountOutput, 1);
        }
        return nxrEnumerateSwapchainFormats(session, remainingSafe(formats), memAddress(formatCountOutput), memAddressSafe(formats));
    }

    // --- [ xrCreateSwapchain ] ---

    /** {@code XrResult xrCreateSwapchain(XrSession session, XrSwapchainCreateInfo const * createInfo, XrSwapchain * swapchain)} */
    public static int nxrCreateSwapchain(XrSession session, long createInfo, long swapchain) {
        long __functionAddress = session.getCapabilities().xrCreateSwapchain;
        return callPPPI(session.address(), createInfo, swapchain, __functionAddress);
    }

    /** {@code XrResult xrCreateSwapchain(XrSession session, XrSwapchainCreateInfo const * createInfo, XrSwapchain * swapchain)} */
    @NativeType("XrResult")
    public static int xrCreateSwapchain(XrSession session, @NativeType("XrSwapchainCreateInfo const *") XrSwapchainCreateInfo createInfo, @NativeType("XrSwapchain *") PointerBuffer swapchain) {
        if (CHECKS) {
            check(swapchain, 1);
        }
        return nxrCreateSwapchain(session, createInfo.address(), memAddress(swapchain));
    }

    // --- [ xrDestroySwapchain ] ---

    /** {@code XrResult xrDestroySwapchain(XrSwapchain swapchain)} */
    @NativeType("XrResult")
    public static int xrDestroySwapchain(XrSwapchain swapchain) {
        long __functionAddress = swapchain.getCapabilities().xrDestroySwapchain;
        return callPI(swapchain.address(), __functionAddress);
    }

    // --- [ xrEnumerateSwapchainImages ] ---

    /** {@code XrResult xrEnumerateSwapchainImages(XrSwapchain swapchain, uint32_t imageCapacityInput, uint32_t * imageCountOutput, XrSwapchainImageBaseHeader * images)} */
    public static int nxrEnumerateSwapchainImages(XrSwapchain swapchain, int imageCapacityInput, long imageCountOutput, long images) {
        long __functionAddress = swapchain.getCapabilities().xrEnumerateSwapchainImages;
        return callPPPI(swapchain.address(), imageCapacityInput, imageCountOutput, images, __functionAddress);
    }

    /** {@code XrResult xrEnumerateSwapchainImages(XrSwapchain swapchain, uint32_t imageCapacityInput, uint32_t * imageCountOutput, XrSwapchainImageBaseHeader * images)} */
    @NativeType("XrResult")
    public static int xrEnumerateSwapchainImages(XrSwapchain swapchain, @NativeType("uint32_t *") IntBuffer imageCountOutput, @NativeType("XrSwapchainImageBaseHeader *") XrSwapchainImageBaseHeader.@Nullable Buffer images) {
        if (CHECKS) {
            check(imageCountOutput, 1);
        }
        return nxrEnumerateSwapchainImages(swapchain, remainingSafe(images), memAddress(imageCountOutput), memAddressSafe(images));
    }

    // --- [ xrAcquireSwapchainImage ] ---

    /** {@code XrResult xrAcquireSwapchainImage(XrSwapchain swapchain, XrSwapchainImageAcquireInfo const * acquireInfo, uint32_t * index)} */
    public static int nxrAcquireSwapchainImage(XrSwapchain swapchain, long acquireInfo, long index) {
        long __functionAddress = swapchain.getCapabilities().xrAcquireSwapchainImage;
        return callPPPI(swapchain.address(), acquireInfo, index, __functionAddress);
    }

    /** {@code XrResult xrAcquireSwapchainImage(XrSwapchain swapchain, XrSwapchainImageAcquireInfo const * acquireInfo, uint32_t * index)} */
    @NativeType("XrResult")
    public static int xrAcquireSwapchainImage(XrSwapchain swapchain, @NativeType("XrSwapchainImageAcquireInfo const *") @Nullable XrSwapchainImageAcquireInfo acquireInfo, @NativeType("uint32_t *") IntBuffer index) {
        if (CHECKS) {
            check(index, 1);
        }
        return nxrAcquireSwapchainImage(swapchain, memAddressSafe(acquireInfo), memAddress(index));
    }

    // --- [ xrWaitSwapchainImage ] ---

    /** {@code XrResult xrWaitSwapchainImage(XrSwapchain swapchain, XrSwapchainImageWaitInfo const * waitInfo)} */
    public static int nxrWaitSwapchainImage(XrSwapchain swapchain, long waitInfo) {
        long __functionAddress = swapchain.getCapabilities().xrWaitSwapchainImage;
        return callPPI(swapchain.address(), waitInfo, __functionAddress);
    }

    /** {@code XrResult xrWaitSwapchainImage(XrSwapchain swapchain, XrSwapchainImageWaitInfo const * waitInfo)} */
    @NativeType("XrResult")
    public static int xrWaitSwapchainImage(XrSwapchain swapchain, @NativeType("XrSwapchainImageWaitInfo const *") XrSwapchainImageWaitInfo waitInfo) {
        return nxrWaitSwapchainImage(swapchain, waitInfo.address());
    }

    // --- [ xrReleaseSwapchainImage ] ---

    /** {@code XrResult xrReleaseSwapchainImage(XrSwapchain swapchain, XrSwapchainImageReleaseInfo const * releaseInfo)} */
    public static int nxrReleaseSwapchainImage(XrSwapchain swapchain, long releaseInfo) {
        long __functionAddress = swapchain.getCapabilities().xrReleaseSwapchainImage;
        return callPPI(swapchain.address(), releaseInfo, __functionAddress);
    }

    /** {@code XrResult xrReleaseSwapchainImage(XrSwapchain swapchain, XrSwapchainImageReleaseInfo const * releaseInfo)} */
    @NativeType("XrResult")
    public static int xrReleaseSwapchainImage(XrSwapchain swapchain, @NativeType("XrSwapchainImageReleaseInfo const *") @Nullable XrSwapchainImageReleaseInfo releaseInfo) {
        return nxrReleaseSwapchainImage(swapchain, memAddressSafe(releaseInfo));
    }

    // --- [ xrBeginSession ] ---

    /** {@code XrResult xrBeginSession(XrSession session, XrSessionBeginInfo const * beginInfo)} */
    public static int nxrBeginSession(XrSession session, long beginInfo) {
        long __functionAddress = session.getCapabilities().xrBeginSession;
        return callPPI(session.address(), beginInfo, __functionAddress);
    }

    /** {@code XrResult xrBeginSession(XrSession session, XrSessionBeginInfo const * beginInfo)} */
    @NativeType("XrResult")
    public static int xrBeginSession(XrSession session, @NativeType("XrSessionBeginInfo const *") XrSessionBeginInfo beginInfo) {
        return nxrBeginSession(session, beginInfo.address());
    }

    // --- [ xrEndSession ] ---

    /** {@code XrResult xrEndSession(XrSession session)} */
    @NativeType("XrResult")
    public static int xrEndSession(XrSession session) {
        long __functionAddress = session.getCapabilities().xrEndSession;
        return callPI(session.address(), __functionAddress);
    }

    // --- [ xrRequestExitSession ] ---

    /** {@code XrResult xrRequestExitSession(XrSession session)} */
    @NativeType("XrResult")
    public static int xrRequestExitSession(XrSession session) {
        long __functionAddress = session.getCapabilities().xrRequestExitSession;
        return callPI(session.address(), __functionAddress);
    }

    // --- [ xrWaitFrame ] ---

    /** {@code XrResult xrWaitFrame(XrSession session, XrFrameWaitInfo const * frameWaitInfo, XrFrameState * frameState)} */
    public static int nxrWaitFrame(XrSession session, long frameWaitInfo, long frameState) {
        long __functionAddress = session.getCapabilities().xrWaitFrame;
        return callPPPI(session.address(), frameWaitInfo, frameState, __functionAddress);
    }

    /** {@code XrResult xrWaitFrame(XrSession session, XrFrameWaitInfo const * frameWaitInfo, XrFrameState * frameState)} */
    @NativeType("XrResult")
    public static int xrWaitFrame(XrSession session, @NativeType("XrFrameWaitInfo const *") @Nullable XrFrameWaitInfo frameWaitInfo, @NativeType("XrFrameState *") XrFrameState frameState) {
        return nxrWaitFrame(session, memAddressSafe(frameWaitInfo), frameState.address());
    }

    // --- [ xrBeginFrame ] ---

    /** {@code XrResult xrBeginFrame(XrSession session, XrFrameBeginInfo const * frameBeginInfo)} */
    public static int nxrBeginFrame(XrSession session, long frameBeginInfo) {
        long __functionAddress = session.getCapabilities().xrBeginFrame;
        return callPPI(session.address(), frameBeginInfo, __functionAddress);
    }

    /** {@code XrResult xrBeginFrame(XrSession session, XrFrameBeginInfo const * frameBeginInfo)} */
    @NativeType("XrResult")
    public static int xrBeginFrame(XrSession session, @NativeType("XrFrameBeginInfo const *") @Nullable XrFrameBeginInfo frameBeginInfo) {
        return nxrBeginFrame(session, memAddressSafe(frameBeginInfo));
    }

    // --- [ xrEndFrame ] ---

    /** {@code XrResult xrEndFrame(XrSession session, XrFrameEndInfo const * frameEndInfo)} */
    public static int nxrEndFrame(XrSession session, long frameEndInfo) {
        long __functionAddress = session.getCapabilities().xrEndFrame;
        return callPPI(session.address(), frameEndInfo, __functionAddress);
    }

    /** {@code XrResult xrEndFrame(XrSession session, XrFrameEndInfo const * frameEndInfo)} */
    @NativeType("XrResult")
    public static int xrEndFrame(XrSession session, @NativeType("XrFrameEndInfo const *") XrFrameEndInfo frameEndInfo) {
        return nxrEndFrame(session, frameEndInfo.address());
    }

    // --- [ xrLocateViews ] ---

    /** {@code XrResult xrLocateViews(XrSession session, XrViewLocateInfo const * viewLocateInfo, XrViewState * viewState, uint32_t viewCapacityInput, uint32_t * viewCountOutput, XrView * views)} */
    public static int nxrLocateViews(XrSession session, long viewLocateInfo, long viewState, int viewCapacityInput, long viewCountOutput, long views) {
        long __functionAddress = session.getCapabilities().xrLocateViews;
        if (CHECKS) {
            XrViewLocateInfo.validate(viewLocateInfo);
        }
        return callPPPPPI(session.address(), viewLocateInfo, viewState, viewCapacityInput, viewCountOutput, views, __functionAddress);
    }

    /** {@code XrResult xrLocateViews(XrSession session, XrViewLocateInfo const * viewLocateInfo, XrViewState * viewState, uint32_t viewCapacityInput, uint32_t * viewCountOutput, XrView * views)} */
    @NativeType("XrResult")
    public static int xrLocateViews(XrSession session, @NativeType("XrViewLocateInfo const *") XrViewLocateInfo viewLocateInfo, @NativeType("XrViewState *") XrViewState viewState, @NativeType("uint32_t *") IntBuffer viewCountOutput, @NativeType("XrView *") XrView.@Nullable Buffer views) {
        if (CHECKS) {
            check(viewCountOutput, 1);
        }
        return nxrLocateViews(session, viewLocateInfo.address(), viewState.address(), remainingSafe(views), memAddress(viewCountOutput), memAddressSafe(views));
    }

    // --- [ xrStringToPath ] ---

    /** {@code XrResult xrStringToPath(XrInstance instance, char const * pathString, XrPath * path)} */
    public static int nxrStringToPath(XrInstance instance, long pathString, long path) {
        long __functionAddress = instance.getCapabilities().xrStringToPath;
        return callPPPI(instance.address(), pathString, path, __functionAddress);
    }

    /** {@code XrResult xrStringToPath(XrInstance instance, char const * pathString, XrPath * path)} */
    @NativeType("XrResult")
    public static int xrStringToPath(XrInstance instance, @NativeType("char const *") ByteBuffer pathString, @NativeType("XrPath *") LongBuffer path) {
        if (CHECKS) {
            checkNT1(pathString);
            check(path, 1);
        }
        return nxrStringToPath(instance, memAddress(pathString), memAddress(path));
    }

    /** {@code XrResult xrStringToPath(XrInstance instance, char const * pathString, XrPath * path)} */
    @NativeType("XrResult")
    public static int xrStringToPath(XrInstance instance, @NativeType("char const *") CharSequence pathString, @NativeType("XrPath *") LongBuffer path) {
        if (CHECKS) {
            check(path, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pathString, true);
            long pathStringEncoded = stack.getPointerAddress();
            return nxrStringToPath(instance, pathStringEncoded, memAddress(path));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ xrPathToString ] ---

    /** {@code XrResult xrPathToString(XrInstance instance, XrPath path, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, char * buffer)} */
    public static int nxrPathToString(XrInstance instance, long path, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = instance.getCapabilities().xrPathToString;
        return callPJPPI(instance.address(), path, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /** {@code XrResult xrPathToString(XrInstance instance, XrPath path, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, char * buffer)} */
    @NativeType("XrResult")
    public static int xrPathToString(XrInstance instance, @NativeType("XrPath") long path, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("char *") @Nullable ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrPathToString(instance, path, remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrCreateActionSet ] ---

    /** {@code XrResult xrCreateActionSet(XrInstance instance, XrActionSetCreateInfo const * createInfo, XrActionSet * actionSet)} */
    public static int nxrCreateActionSet(XrInstance instance, long createInfo, long actionSet) {
        long __functionAddress = instance.getCapabilities().xrCreateActionSet;
        return callPPPI(instance.address(), createInfo, actionSet, __functionAddress);
    }

    /** {@code XrResult xrCreateActionSet(XrInstance instance, XrActionSetCreateInfo const * createInfo, XrActionSet * actionSet)} */
    @NativeType("XrResult")
    public static int xrCreateActionSet(XrInstance instance, @NativeType("XrActionSetCreateInfo const *") XrActionSetCreateInfo createInfo, @NativeType("XrActionSet *") PointerBuffer actionSet) {
        if (CHECKS) {
            check(actionSet, 1);
        }
        return nxrCreateActionSet(instance, createInfo.address(), memAddress(actionSet));
    }

    // --- [ xrDestroyActionSet ] ---

    /** {@code XrResult xrDestroyActionSet(XrActionSet actionSet)} */
    @NativeType("XrResult")
    public static int xrDestroyActionSet(XrActionSet actionSet) {
        long __functionAddress = actionSet.getCapabilities().xrDestroyActionSet;
        return callPI(actionSet.address(), __functionAddress);
    }

    // --- [ xrCreateAction ] ---

    /** {@code XrResult xrCreateAction(XrActionSet actionSet, XrActionCreateInfo const * createInfo, XrAction * action)} */
    public static int nxrCreateAction(XrActionSet actionSet, long createInfo, long action) {
        long __functionAddress = actionSet.getCapabilities().xrCreateAction;
        return callPPPI(actionSet.address(), createInfo, action, __functionAddress);
    }

    /** {@code XrResult xrCreateAction(XrActionSet actionSet, XrActionCreateInfo const * createInfo, XrAction * action)} */
    @NativeType("XrResult")
    public static int xrCreateAction(XrActionSet actionSet, @NativeType("XrActionCreateInfo const *") XrActionCreateInfo createInfo, @NativeType("XrAction *") PointerBuffer action) {
        if (CHECKS) {
            check(action, 1);
        }
        return nxrCreateAction(actionSet, createInfo.address(), memAddress(action));
    }

    // --- [ xrDestroyAction ] ---

    /** {@code XrResult xrDestroyAction(XrAction action)} */
    @NativeType("XrResult")
    public static int xrDestroyAction(XrAction action) {
        long __functionAddress = action.getCapabilities().xrDestroyAction;
        return callPI(action.address(), __functionAddress);
    }

    // --- [ xrSuggestInteractionProfileBindings ] ---

    /** {@code XrResult xrSuggestInteractionProfileBindings(XrInstance instance, XrInteractionProfileSuggestedBinding const * suggestedBindings)} */
    public static int nxrSuggestInteractionProfileBindings(XrInstance instance, long suggestedBindings) {
        long __functionAddress = instance.getCapabilities().xrSuggestInteractionProfileBindings;
        if (CHECKS) {
            XrInteractionProfileSuggestedBinding.validate(suggestedBindings);
        }
        return callPPI(instance.address(), suggestedBindings, __functionAddress);
    }

    /** {@code XrResult xrSuggestInteractionProfileBindings(XrInstance instance, XrInteractionProfileSuggestedBinding const * suggestedBindings)} */
    @NativeType("XrResult")
    public static int xrSuggestInteractionProfileBindings(XrInstance instance, @NativeType("XrInteractionProfileSuggestedBinding const *") XrInteractionProfileSuggestedBinding suggestedBindings) {
        return nxrSuggestInteractionProfileBindings(instance, suggestedBindings.address());
    }

    // --- [ xrAttachSessionActionSets ] ---

    /** {@code XrResult xrAttachSessionActionSets(XrSession session, XrSessionActionSetsAttachInfo const * attachInfo)} */
    public static int nxrAttachSessionActionSets(XrSession session, long attachInfo) {
        long __functionAddress = session.getCapabilities().xrAttachSessionActionSets;
        if (CHECKS) {
            XrSessionActionSetsAttachInfo.validate(attachInfo);
        }
        return callPPI(session.address(), attachInfo, __functionAddress);
    }

    /** {@code XrResult xrAttachSessionActionSets(XrSession session, XrSessionActionSetsAttachInfo const * attachInfo)} */
    @NativeType("XrResult")
    public static int xrAttachSessionActionSets(XrSession session, @NativeType("XrSessionActionSetsAttachInfo const *") XrSessionActionSetsAttachInfo attachInfo) {
        return nxrAttachSessionActionSets(session, attachInfo.address());
    }

    // --- [ xrGetCurrentInteractionProfile ] ---

    /** {@code XrResult xrGetCurrentInteractionProfile(XrSession session, XrPath topLevelUserPath, XrInteractionProfileState * interactionProfile)} */
    public static int nxrGetCurrentInteractionProfile(XrSession session, long topLevelUserPath, long interactionProfile) {
        long __functionAddress = session.getCapabilities().xrGetCurrentInteractionProfile;
        return callPJPI(session.address(), topLevelUserPath, interactionProfile, __functionAddress);
    }

    /** {@code XrResult xrGetCurrentInteractionProfile(XrSession session, XrPath topLevelUserPath, XrInteractionProfileState * interactionProfile)} */
    @NativeType("XrResult")
    public static int xrGetCurrentInteractionProfile(XrSession session, @NativeType("XrPath") long topLevelUserPath, @NativeType("XrInteractionProfileState *") XrInteractionProfileState interactionProfile) {
        return nxrGetCurrentInteractionProfile(session, topLevelUserPath, interactionProfile.address());
    }

    // --- [ xrGetActionStateBoolean ] ---

    /** {@code XrResult xrGetActionStateBoolean(XrSession session, XrActionStateGetInfo const * getInfo, XrActionStateBoolean * state)} */
    public static int nxrGetActionStateBoolean(XrSession session, long getInfo, long state) {
        long __functionAddress = session.getCapabilities().xrGetActionStateBoolean;
        if (CHECKS) {
            XrActionStateGetInfo.validate(getInfo);
        }
        return callPPPI(session.address(), getInfo, state, __functionAddress);
    }

    /** {@code XrResult xrGetActionStateBoolean(XrSession session, XrActionStateGetInfo const * getInfo, XrActionStateBoolean * state)} */
    @NativeType("XrResult")
    public static int xrGetActionStateBoolean(XrSession session, @NativeType("XrActionStateGetInfo const *") XrActionStateGetInfo getInfo, @NativeType("XrActionStateBoolean *") XrActionStateBoolean state) {
        return nxrGetActionStateBoolean(session, getInfo.address(), state.address());
    }

    // --- [ xrGetActionStateFloat ] ---

    /** {@code XrResult xrGetActionStateFloat(XrSession session, XrActionStateGetInfo const * getInfo, XrActionStateFloat * state)} */
    public static int nxrGetActionStateFloat(XrSession session, long getInfo, long state) {
        long __functionAddress = session.getCapabilities().xrGetActionStateFloat;
        if (CHECKS) {
            XrActionStateGetInfo.validate(getInfo);
        }
        return callPPPI(session.address(), getInfo, state, __functionAddress);
    }

    /** {@code XrResult xrGetActionStateFloat(XrSession session, XrActionStateGetInfo const * getInfo, XrActionStateFloat * state)} */
    @NativeType("XrResult")
    public static int xrGetActionStateFloat(XrSession session, @NativeType("XrActionStateGetInfo const *") XrActionStateGetInfo getInfo, @NativeType("XrActionStateFloat *") XrActionStateFloat state) {
        return nxrGetActionStateFloat(session, getInfo.address(), state.address());
    }

    // --- [ xrGetActionStateVector2f ] ---

    /** {@code XrResult xrGetActionStateVector2f(XrSession session, XrActionStateGetInfo const * getInfo, XrActionStateVector2f * state)} */
    public static int nxrGetActionStateVector2f(XrSession session, long getInfo, long state) {
        long __functionAddress = session.getCapabilities().xrGetActionStateVector2f;
        if (CHECKS) {
            XrActionStateGetInfo.validate(getInfo);
        }
        return callPPPI(session.address(), getInfo, state, __functionAddress);
    }

    /** {@code XrResult xrGetActionStateVector2f(XrSession session, XrActionStateGetInfo const * getInfo, XrActionStateVector2f * state)} */
    @NativeType("XrResult")
    public static int xrGetActionStateVector2f(XrSession session, @NativeType("XrActionStateGetInfo const *") XrActionStateGetInfo getInfo, @NativeType("XrActionStateVector2f *") XrActionStateVector2f state) {
        return nxrGetActionStateVector2f(session, getInfo.address(), state.address());
    }

    // --- [ xrGetActionStatePose ] ---

    /** {@code XrResult xrGetActionStatePose(XrSession session, XrActionStateGetInfo const * getInfo, XrActionStatePose * state)} */
    public static int nxrGetActionStatePose(XrSession session, long getInfo, long state) {
        long __functionAddress = session.getCapabilities().xrGetActionStatePose;
        if (CHECKS) {
            XrActionStateGetInfo.validate(getInfo);
        }
        return callPPPI(session.address(), getInfo, state, __functionAddress);
    }

    /** {@code XrResult xrGetActionStatePose(XrSession session, XrActionStateGetInfo const * getInfo, XrActionStatePose * state)} */
    @NativeType("XrResult")
    public static int xrGetActionStatePose(XrSession session, @NativeType("XrActionStateGetInfo const *") XrActionStateGetInfo getInfo, @NativeType("XrActionStatePose *") XrActionStatePose state) {
        return nxrGetActionStatePose(session, getInfo.address(), state.address());
    }

    // --- [ xrSyncActions ] ---

    /** {@code XrResult xrSyncActions(XrSession session, XrActionsSyncInfo const * syncInfo)} */
    public static int nxrSyncActions(XrSession session, long syncInfo) {
        long __functionAddress = session.getCapabilities().xrSyncActions;
        return callPPI(session.address(), syncInfo, __functionAddress);
    }

    /** {@code XrResult xrSyncActions(XrSession session, XrActionsSyncInfo const * syncInfo)} */
    @NativeType("XrResult")
    public static int xrSyncActions(XrSession session, @NativeType("XrActionsSyncInfo const *") XrActionsSyncInfo syncInfo) {
        return nxrSyncActions(session, syncInfo.address());
    }

    // --- [ xrEnumerateBoundSourcesForAction ] ---

    /** {@code XrResult xrEnumerateBoundSourcesForAction(XrSession session, XrBoundSourcesForActionEnumerateInfo const * enumerateInfo, uint32_t sourceCapacityInput, uint32_t * sourceCountOutput, XrPath * sources)} */
    public static int nxrEnumerateBoundSourcesForAction(XrSession session, long enumerateInfo, int sourceCapacityInput, long sourceCountOutput, long sources) {
        long __functionAddress = session.getCapabilities().xrEnumerateBoundSourcesForAction;
        if (CHECKS) {
            XrBoundSourcesForActionEnumerateInfo.validate(enumerateInfo);
        }
        return callPPPPI(session.address(), enumerateInfo, sourceCapacityInput, sourceCountOutput, sources, __functionAddress);
    }

    /** {@code XrResult xrEnumerateBoundSourcesForAction(XrSession session, XrBoundSourcesForActionEnumerateInfo const * enumerateInfo, uint32_t sourceCapacityInput, uint32_t * sourceCountOutput, XrPath * sources)} */
    @NativeType("XrResult")
    public static int xrEnumerateBoundSourcesForAction(XrSession session, @NativeType("XrBoundSourcesForActionEnumerateInfo const *") XrBoundSourcesForActionEnumerateInfo enumerateInfo, @NativeType("uint32_t *") IntBuffer sourceCountOutput, @NativeType("XrPath *") @Nullable LongBuffer sources) {
        if (CHECKS) {
            check(sourceCountOutput, 1);
        }
        return nxrEnumerateBoundSourcesForAction(session, enumerateInfo.address(), remainingSafe(sources), memAddress(sourceCountOutput), memAddressSafe(sources));
    }

    // --- [ xrGetInputSourceLocalizedName ] ---

    /** {@code XrResult xrGetInputSourceLocalizedName(XrSession session, XrInputSourceLocalizedNameGetInfo const * getInfo, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, char * buffer)} */
    public static int nxrGetInputSourceLocalizedName(XrSession session, long getInfo, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = session.getCapabilities().xrGetInputSourceLocalizedName;
        return callPPPPI(session.address(), getInfo, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /** {@code XrResult xrGetInputSourceLocalizedName(XrSession session, XrInputSourceLocalizedNameGetInfo const * getInfo, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, char * buffer)} */
    @NativeType("XrResult")
    public static int xrGetInputSourceLocalizedName(XrSession session, @NativeType("XrInputSourceLocalizedNameGetInfo const *") XrInputSourceLocalizedNameGetInfo getInfo, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("char *") @Nullable ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetInputSourceLocalizedName(session, getInfo.address(), remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrApplyHapticFeedback ] ---

    /** {@code XrResult xrApplyHapticFeedback(XrSession session, XrHapticActionInfo const * hapticActionInfo, XrHapticBaseHeader const * hapticFeedback)} */
    public static int nxrApplyHapticFeedback(XrSession session, long hapticActionInfo, long hapticFeedback) {
        long __functionAddress = session.getCapabilities().xrApplyHapticFeedback;
        if (CHECKS) {
            XrHapticActionInfo.validate(hapticActionInfo);
        }
        return callPPPI(session.address(), hapticActionInfo, hapticFeedback, __functionAddress);
    }

    /** {@code XrResult xrApplyHapticFeedback(XrSession session, XrHapticActionInfo const * hapticActionInfo, XrHapticBaseHeader const * hapticFeedback)} */
    @NativeType("XrResult")
    public static int xrApplyHapticFeedback(XrSession session, @NativeType("XrHapticActionInfo const *") XrHapticActionInfo hapticActionInfo, @NativeType("XrHapticBaseHeader const *") XrHapticBaseHeader hapticFeedback) {
        return nxrApplyHapticFeedback(session, hapticActionInfo.address(), hapticFeedback.address());
    }

    // --- [ xrStopHapticFeedback ] ---

    /** {@code XrResult xrStopHapticFeedback(XrSession session, XrHapticActionInfo const * hapticActionInfo)} */
    public static int nxrStopHapticFeedback(XrSession session, long hapticActionInfo) {
        long __functionAddress = session.getCapabilities().xrStopHapticFeedback;
        if (CHECKS) {
            XrHapticActionInfo.validate(hapticActionInfo);
        }
        return callPPI(session.address(), hapticActionInfo, __functionAddress);
    }

    /** {@code XrResult xrStopHapticFeedback(XrSession session, XrHapticActionInfo const * hapticActionInfo)} */
    @NativeType("XrResult")
    public static int xrStopHapticFeedback(XrSession session, @NativeType("XrHapticActionInfo const *") XrHapticActionInfo hapticActionInfo) {
        return nxrStopHapticFeedback(session, hapticActionInfo.address());
    }

    // --- [ XR_MAKE_VERSION ] ---

    /** {@code uint64_t XR_MAKE_VERSION(uint16_t major, uint16_t minor, uint32_t patch)} */
    @NativeType("uint64_t")
    public static long XR_MAKE_VERSION(@NativeType("uint16_t") int major, @NativeType("uint16_t") int minor, @NativeType("uint32_t") int patch) {
        return ((major & 0xFFFFL) << 48) | ((minor & 0xFFFFL) << 32) | (patch & 0xFFFF_FFFFL);
    }

    // --- [ XR_VERSION_MAJOR ] ---

    /** {@code uint16_t XR_VERSION_MAJOR(uint64_t version)} */
    @NativeType("uint16_t")
    public static short XR_VERSION_MAJOR(@NativeType("uint64_t") long version) {
        return (short)((version >> 48) & 0xFFFFL);
    }

    // --- [ XR_VERSION_MINOR ] ---

    /** {@code uint16_t XR_VERSION_MINOR(uint64_t version)} */
    @NativeType("uint16_t")
    public static short XR_VERSION_MINOR(@NativeType("uint64_t") long version) {
        return (short)((version >> 32) & 0xFFFFL);
    }

    // --- [ XR_VERSION_PATCH ] ---

    /** {@code uint32_t XR_VERSION_PATCH(uint64_t version)} */
    @NativeType("uint32_t")
    public static int XR_VERSION_PATCH(@NativeType("uint64_t") long version) {
        return (int)(version & 0xFFFF_FFFFL);
    }

    // --- [ XR_SUCCEEDED ] ---

    /** {@code bool XR_SUCCEEDED(int result)} */
    @NativeType("bool")
    public static boolean XR_SUCCEEDED(int result) {
        return result >= 0;
    }

    // --- [ XR_UNQUALIFIED_SUCCESS ] ---

    /** {@code bool XR_UNQUALIFIED_SUCCESS(int result)} */
    @NativeType("bool")
    public static boolean XR_UNQUALIFIED_SUCCESS(int result) {
        return result == 0;
    }

    // --- [ XR_FAILED ] ---

    /** {@code bool XR_FAILED(int result)} */
    @NativeType("bool")
    public static boolean XR_FAILED(int result) {
        return result < 0;
    }

}