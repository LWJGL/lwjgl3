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
    public static final int XR_EXT_debug_utils_SPEC_VERSION = 4;

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

    /**
     * XrDebugUtilsMessageSeverityFlagBitsEXT
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT}</li>
     * <li>{@link #XR_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT}</li>
     * <li>{@link #XR_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT}</li>
     * <li>{@link #XR_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        XR_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT = 0x1,
        XR_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT    = 0x10,
        XR_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT = 0x100,
        XR_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT   = 0x1000;

    /**
     * XrDebugUtilsMessageTypeFlagBitsEXT
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT}</li>
     * <li>{@link #XR_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT}</li>
     * <li>{@link #XR_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT}</li>
     * <li>{@link #XR_DEBUG_UTILS_MESSAGE_TYPE_CONFORMANCE_BIT_EXT DEBUG_UTILS_MESSAGE_TYPE_CONFORMANCE_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        XR_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT     = 0x1,
        XR_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT  = 0x2,
        XR_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT = 0x4,
        XR_DEBUG_UTILS_MESSAGE_TYPE_CONFORMANCE_BIT_EXT = 0x8;

    protected EXTDebugUtils() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetDebugUtilsObjectNameEXT ] ---

    /** Unsafe version of: {@link #xrSetDebugUtilsObjectNameEXT SetDebugUtilsObjectNameEXT} */
    public static int nxrSetDebugUtilsObjectNameEXT(XrInstance instance, long nameInfo) {
        long __functionAddress = instance.getCapabilities().xrSetDebugUtilsObjectNameEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(instance.address(), nameInfo, __functionAddress);
    }

    /**
     * Sets debug utils object name.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrSetDebugUtilsObjectNameEXT(
     *     XrInstance                                  instance,
     *     const XrDebugUtilsObjectNameInfoEXT*        nameInfo);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>In the structure pointed to by {@code nameInfo}, {@link XrDebugUtilsObjectNameInfoEXT}{@code ::objectType} <b>must</b> not be {@link XR10#XR_OBJECT_TYPE_UNKNOWN OBJECT_TYPE_UNKNOWN}</li>
     * <li>In the structure pointed to by {@code nameInfo}, {@link XrDebugUtilsObjectNameInfoEXT}{@code ::objectHandle} <b>must</b> not be {@link XR10#XR_NULL_HANDLE NULL_HANDLE}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to calling {@link #xrSetDebugUtilsObjectNameEXT SetDebugUtilsObjectNameEXT}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code nameInfo} <b>must</b> be a pointer to a valid {@link XrDebugUtilsObjectNameInfoEXT} structure</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to the {@code objectHandle} member of the {@code nameInfo} parameter <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <p>Applications <b>may</b> change the name associated with an object simply by calling {@link #xrSetDebugUtilsObjectNameEXT SetDebugUtilsObjectNameEXT} again with a new string. If {@link XrDebugUtilsObjectNameInfoEXT}{@code ::objectName} is an empty string, then any previously set name is removed.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrDebugUtilsObjectNameInfoEXT}</p>
     *
     * @param instance the {@code XrInstance} that the object was created under.
     * @param nameInfo a pointer to an instance of the {@link XrDebugUtilsObjectNameInfoEXT} structure specifying the parameters of the name to set on the object.
     */
    @NativeType("XrResult")
    public static int xrSetDebugUtilsObjectNameEXT(XrInstance instance, @NativeType("XrDebugUtilsObjectNameInfoEXT const *") XrDebugUtilsObjectNameInfoEXT nameInfo) {
        return nxrSetDebugUtilsObjectNameEXT(instance, nameInfo.address());
    }

    // --- [ xrCreateDebugUtilsMessengerEXT ] ---

    /** Unsafe version of: {@link #xrCreateDebugUtilsMessengerEXT CreateDebugUtilsMessengerEXT} */
    public static int nxrCreateDebugUtilsMessengerEXT(XrInstance instance, long createInfo, long messenger) {
        long __functionAddress = instance.getCapabilities().xrCreateDebugUtilsMessengerEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrDebugUtilsMessengerCreateInfoEXT.validate(createInfo);
        }
        return callPPPI(instance.address(), createInfo, messenger, __functionAddress);
    }

    /**
     * Creates a debug messenger.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrCreateDebugUtilsMessengerEXT(
     *     XrInstance                                  instance,
     *     const XrDebugUtilsMessengerCreateInfoEXT*   createInfo,
     *     XrDebugUtilsMessengerEXT*                   messenger);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to calling {@link #xrCreateDebugUtilsMessengerEXT CreateDebugUtilsMessengerEXT}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrDebugUtilsMessengerCreateInfoEXT} structure</li>
     * <li>{@code messenger} <b>must</b> be a pointer to an {@code XrDebugUtilsMessengerEXT} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code instance}, and any child handles, <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <p>The application <b>must</b> ensure that {@link #xrCreateDebugUtilsMessengerEXT CreateDebugUtilsMessengerEXT} is not executed in parallel with any OpenXR function that is also called with {@code instance} or child of {@code instance}.</p>
     * 
     * <p>When an event of interest occurs a debug messenger calls its {@code createInfo}-&gt;{@code userCallback} with a debug message from the producer of the event. Additionally, the debug messenger <b>must</b> filter out any debug messages that the application’s callback is not interested in based on {@link XrDebugUtilsMessengerCreateInfoEXT} flags, as described below.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrDebugUtilsMessengerCreateInfoEXT}, {@link #xrDestroyDebugUtilsMessengerEXT DestroyDebugUtilsMessengerEXT}</p>
     *
     * @param instance   the instance the messenger will be used with.
     * @param createInfo points to an {@link XrDebugUtilsMessengerCreateInfoEXT} structure, which contains the callback pointer as well as defines the conditions under which this messenger will trigger the callback.
     * @param messenger  a pointer to which the created {@code XrDebugUtilsMessengerEXT} object is returned.
     */
    @NativeType("XrResult")
    public static int xrCreateDebugUtilsMessengerEXT(XrInstance instance, @NativeType("XrDebugUtilsMessengerCreateInfoEXT const *") XrDebugUtilsMessengerCreateInfoEXT createInfo, @NativeType("XrDebugUtilsMessengerEXT *") PointerBuffer messenger) {
        if (CHECKS) {
            check(messenger, 1);
        }
        return nxrCreateDebugUtilsMessengerEXT(instance, createInfo.address(), memAddress(messenger));
    }

    // --- [ xrDestroyDebugUtilsMessengerEXT ] ---

    /**
     * Destroys a debug messenger.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrDestroyDebugUtilsMessengerEXT(
     *     XrDebugUtilsMessengerEXT                    messenger);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to calling {@link #xrDestroyDebugUtilsMessengerEXT DestroyDebugUtilsMessengerEXT}</li>
     * <li>{@code messenger} <b>must</b> be a valid {@code XrDebugUtilsMessengerEXT} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code messenger} <b>must</b> be externally synchronized</li>
     * <li>Access to the {@code XrInstance} used to create {@code messenger}, and all of its child handles <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <p>The application <b>must</b> ensure that {@link #xrDestroyDebugUtilsMessengerEXT DestroyDebugUtilsMessengerEXT} is not executed in parallel with any OpenXR function that is also called with the {@code instance} or child of {@code instance} that it was created with.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrCreateDebugUtilsMessengerEXT CreateDebugUtilsMessengerEXT}</p>
     *
     * @param messenger the {@code XrDebugUtilsMessengerEXT} object to destroy. {@code messenger} is an externally synchronized object and <b>must</b> not be used on more than one thread at a time. This means that {@link #xrDestroyDebugUtilsMessengerEXT DestroyDebugUtilsMessengerEXT} <b>must</b> not be called when a callback is active.
     */
    @NativeType("XrResult")
    public static int xrDestroyDebugUtilsMessengerEXT(XrDebugUtilsMessengerEXT messenger) {
        long __functionAddress = messenger.getCapabilities().xrDestroyDebugUtilsMessengerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(messenger.address(), __functionAddress);
    }

    // --- [ xrSubmitDebugUtilsMessageEXT ] ---

    /** Unsafe version of: {@link #xrSubmitDebugUtilsMessageEXT SubmitDebugUtilsMessageEXT} */
    public static int nxrSubmitDebugUtilsMessageEXT(XrInstance instance, long messageSeverity, long messageTypes, long callbackData) {
        long __functionAddress = instance.getCapabilities().xrSubmitDebugUtilsMessageEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrDebugUtilsMessengerCallbackDataEXT.validate(callbackData);
        }
        return callPJJPI(instance.address(), messageSeverity, messageTypes, callbackData, __functionAddress);
    }

    /**
     * Submits debug utils message.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult                                    xrSubmitDebugUtilsMessageEXT(
     *     XrInstance                                  instance,
     *     XrDebugUtilsMessageSeverityFlagsEXT         messageSeverity,
     *     XrDebugUtilsMessageTypeFlagsEXT             messageTypes,
     *     const XrDebugUtilsMessengerCallbackDataEXT* callbackData);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>For each structure in {@code objects} found in {@code callbackData}, the value of {@link XrDebugUtilsObjectNameInfoEXT}{@code ::objectType} <b>must</b> not be {@link XR10#XR_OBJECT_TYPE_UNKNOWN OBJECT_TYPE_UNKNOWN}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to calling {@link #xrSubmitDebugUtilsMessageEXT SubmitDebugUtilsMessageEXT}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code messageSeverity} <b>must</b> be a valid combination of {@code XrDebugUtilsMessageSeverityFlagBitsEXT} values</li>
     * <li>{@code messageSeverity} <b>must</b> not be 0</li>
     * <li>{@code messageTypes} <b>must</b> be a valid combination of {@code XrDebugUtilsMessageTypeFlagBitsEXT} values</li>
     * <li>{@code messageTypes} <b>must</b> not be 0</li>
     * <li>{@code callbackData} <b>must</b> be a pointer to a valid {@link XrDebugUtilsMessengerCallbackDataEXT} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <p>The application <b>can</b> also produce a debug message, and submit it into the OpenXR messaging system.</p>
     * 
     * <p>The call will propagate through the layers and generate callback(s) as indicated by the message’s flags. The parameters are passed on to the callback in addition to the userData value that was defined at the time the messenger was created.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrDebugUtilsMessengerCallbackDataEXT}</p>
     *
     * @param instance        the debug stream’s {@code XrInstance}.
     * @param messageSeverity a single bit value of {@code XrDebugUtilsMessageSeverityFlagsEXT} severity of this event/message.
     * @param messageTypes    an {@code XrDebugUtilsMessageTypeFlagsEXT} bitmask of {@code XrDebugUtilsMessageTypeFlagBitsEXT} specifying which types of event to identify this message with.
     * @param callbackData    contains all the callback related data in the {@link XrDebugUtilsMessengerCallbackDataEXT} structure.
     */
    @NativeType("XrResult")
    public static int xrSubmitDebugUtilsMessageEXT(XrInstance instance, @NativeType("XrDebugUtilsMessageSeverityFlagsEXT") long messageSeverity, @NativeType("XrDebugUtilsMessageTypeFlagsEXT") long messageTypes, @NativeType("XrDebugUtilsMessengerCallbackDataEXT const *") XrDebugUtilsMessengerCallbackDataEXT callbackData) {
        return nxrSubmitDebugUtilsMessageEXT(instance, messageSeverity, messageTypes, callbackData.address());
    }

    // --- [ xrSessionBeginDebugUtilsLabelRegionEXT ] ---

    /** Unsafe version of: {@link #xrSessionBeginDebugUtilsLabelRegionEXT SessionBeginDebugUtilsLabelRegionEXT} */
    public static int nxrSessionBeginDebugUtilsLabelRegionEXT(XrSession session, long labelInfo) {
        long __functionAddress = session.getCapabilities().xrSessionBeginDebugUtilsLabelRegionEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrDebugUtilsLabelEXT.validate(labelInfo);
        }
        return callPPI(session.address(), labelInfo, __functionAddress);
    }

    /**
     * Session begin debug utils label region.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrSessionBeginDebugUtilsLabelRegionEXT(
     *     XrSession                                   session,
     *     const XrDebugUtilsLabelEXT*                 labelInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to calling {@link #xrSessionBeginDebugUtilsLabelRegionEXT SessionBeginDebugUtilsLabelRegionEXT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code labelInfo} <b>must</b> be a pointer to a valid {@link XrDebugUtilsLabelEXT} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <p>The {@link #xrSessionBeginDebugUtilsLabelRegionEXT SessionBeginDebugUtilsLabelRegionEXT} function begins a label region within {@code session}.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrDebugUtilsLabelEXT}</p>
     *
     * @param session   the {@code XrSession} that a label region should be associated with.
     * @param labelInfo the {@link XrDebugUtilsLabelEXT} containing the label information for the region that should be begun.
     */
    @NativeType("XrResult")
    public static int xrSessionBeginDebugUtilsLabelRegionEXT(XrSession session, @NativeType("XrDebugUtilsLabelEXT const *") XrDebugUtilsLabelEXT labelInfo) {
        return nxrSessionBeginDebugUtilsLabelRegionEXT(session, labelInfo.address());
    }

    // --- [ xrSessionEndDebugUtilsLabelRegionEXT ] ---

    /**
     * Session end debug utils label region.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrSessionEndDebugUtilsLabelRegionEXT(
     *     XrSession                                   session);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@link #xrSessionEndDebugUtilsLabelRegionEXT SessionEndDebugUtilsLabelRegionEXT} <b>must</b> be called only after a matching {@link #xrSessionBeginDebugUtilsLabelRegionEXT SessionBeginDebugUtilsLabelRegionEXT}.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to calling {@link #xrSessionEndDebugUtilsLabelRegionEXT SessionEndDebugUtilsLabelRegionEXT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <p>This function ends the last label region begun with the {@link #xrSessionBeginDebugUtilsLabelRegionEXT SessionBeginDebugUtilsLabelRegionEXT} function within the same {@code session}.</p>
     *
     * @param session the {@code XrSession} that a label region should be associated with.
     */
    @NativeType("XrResult")
    public static int xrSessionEndDebugUtilsLabelRegionEXT(XrSession session) {
        long __functionAddress = session.getCapabilities().xrSessionEndDebugUtilsLabelRegionEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), __functionAddress);
    }

    // --- [ xrSessionInsertDebugUtilsLabelEXT ] ---

    /** Unsafe version of: {@link #xrSessionInsertDebugUtilsLabelEXT SessionInsertDebugUtilsLabelEXT} */
    public static int nxrSessionInsertDebugUtilsLabelEXT(XrSession session, long labelInfo) {
        long __functionAddress = session.getCapabilities().xrSessionInsertDebugUtilsLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrDebugUtilsLabelEXT.validate(labelInfo);
        }
        return callPPI(session.address(), labelInfo, __functionAddress);
    }

    /**
     * Session insert debug utils label.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrSessionInsertDebugUtilsLabelEXT(
     *     XrSession                                   session,
     *     const XrDebugUtilsLabelEXT*                 labelInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to calling {@link #xrSessionInsertDebugUtilsLabelEXT SessionInsertDebugUtilsLabelEXT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code labelInfo} <b>must</b> be a pointer to a valid {@link XrDebugUtilsLabelEXT} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <p>The {@link #xrSessionInsertDebugUtilsLabelEXT SessionInsertDebugUtilsLabelEXT} function inserts an individual label within {@code session}. The individual labels are useful for different reasons based on the type of debugging scenario. When used with something active like a profiler or debugger, it identifies a single point of time. When used with logging, the individual label identifies that a particular location has been passed at the point the log message is triggered. Because of this usage, individual labels only exist in a log until the next call to any of the label functions:</p>
     * 
     * <ul>
     * <li>{@link #xrSessionBeginDebugUtilsLabelRegionEXT SessionBeginDebugUtilsLabelRegionEXT}</li>
     * <li>{@link #xrSessionEndDebugUtilsLabelRegionEXT SessionEndDebugUtilsLabelRegionEXT}</li>
     * <li>{@link #xrSessionInsertDebugUtilsLabelEXT SessionInsertDebugUtilsLabelEXT}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrDebugUtilsLabelEXT}, {@link #xrSessionBeginDebugUtilsLabelRegionEXT SessionBeginDebugUtilsLabelRegionEXT}, {@link #xrSessionEndDebugUtilsLabelRegionEXT SessionEndDebugUtilsLabelRegionEXT}</p>
     *
     * @param session   the {@code XrSession} that a label region should be associated with.
     * @param labelInfo the {@link XrDebugUtilsLabelEXT} containing the label information for the region that should be begun.
     */
    @NativeType("XrResult")
    public static int xrSessionInsertDebugUtilsLabelEXT(XrSession session, @NativeType("XrDebugUtilsLabelEXT const *") XrDebugUtilsLabelEXT labelInfo) {
        return nxrSessionInsertDebugUtilsLabelEXT(session, labelInfo.address());
    }

}