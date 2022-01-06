/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_debug_utils = "EXTDebugUtils".nativeClassXR("EXT_debug_utils", type = "instance", postfix = "EXT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_debug_utils_SPEC_VERSION".."4"
    )

    StringConstant(
        "The extension name.",

        "EXT_DEBUG_UTILS_EXTENSION_NAME".."XR_EXT_debug_utils"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT".."1000019000",
        "TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT".."1000019001",
        "TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT".."1000019002",
        "TYPE_DEBUG_UTILS_LABEL_EXT".."1000019003"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT".."1000019000"
    )

    EnumConstant(
        "XrDebugUtilsMessageSeverityFlagBitsEXT",

        "DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT".enum(0x00000001),
        "DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT".enum(0x00000010),
        "DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT".enum(0x00000100),
        "DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT".enum(0x00001000)
    )

    EnumConstant(
        "XrDebugUtilsMessageTypeFlagBitsEXT",

        "DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT".enum(0x00000001),
        "DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT".enum(0x00000002),
        "DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT".enum(0x00000004),
        "DEBUG_UTILS_MESSAGE_TYPE_CONFORMANCE_BIT_EXT".enum(0x00000008)
    )

    XrResult(
        "SetDebugUtilsObjectNameEXT",
        """
        Sets debug utils object name.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrSetDebugUtilsObjectNameEXT(
￿    XrInstance                                  instance,
￿    const XrDebugUtilsObjectNameInfoEXT*        nameInfo);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>In the structure pointed to by {@code nameInfo}, ##XrDebugUtilsObjectNameInfoEXT{@code ::objectType} <b>must</b> not be #OBJECT_TYPE_UNKNOWN</li>
            <li>In the structure pointed to by {@code nameInfo}, ##XrDebugUtilsObjectNameInfoEXT{@code ::objectHandle} <b>must</b> not be #NULL_HANDLE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to calling #SetDebugUtilsObjectNameEXT()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code nameInfo} <b>must</b> be a pointer to a valid ##XrDebugUtilsObjectNameInfoEXT structure</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to the {@code objectHandle} member of the {@code nameInfo} parameter <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
            </ul></dd>
        </dl>

        Applications <b>may</b> change the name associated with an object simply by calling #SetDebugUtilsObjectNameEXT() again with a new string. If ##XrDebugUtilsObjectNameInfoEXT{@code ::objectName} is an empty string, then any previously set name is removed.

        <h5>See Also</h5>
        ##XrDebugUtilsObjectNameInfoEXT
        """,

        XrInstance("instance", "the {@code XrInstance} that the object was created under."),
        XrDebugUtilsObjectNameInfoEXT.const.p("nameInfo", "a pointer to an instance of the ##XrDebugUtilsObjectNameInfoEXT structure specifying the parameters of the name to set on the object.")
    )

    XrResult(
        "CreateDebugUtilsMessengerEXT",
        """
        Creates a debug messenger.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrCreateDebugUtilsMessengerEXT(
￿    XrInstance                                  instance,
￿    const XrDebugUtilsMessengerCreateInfoEXT*   createInfo,
￿    XrDebugUtilsMessengerEXT*                   messenger);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to calling #CreateDebugUtilsMessengerEXT()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrDebugUtilsMessengerCreateInfoEXT structure</li>
            <li>{@code messenger} <b>must</b> be a pointer to an {@code XrDebugUtilsMessengerEXT} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code instance}, and any child handles, <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
            </ul></dd>
        </dl>

        The application <b>must</b> ensure that #CreateDebugUtilsMessengerEXT() is not executed in parallel with any OpenXR function that is also called with {@code instance} or child of {@code instance}.

        When an event of interest occurs a debug messenger calls its {@code createInfo}-&gt;{@code userCallback} with a debug message from the producer of the event. Additionally, the debug messenger <b>must</b> filter out any debug messages that the application’s callback is not interested in based on ##XrDebugUtilsMessengerCreateInfoEXT flags, as described below.

        <h5>See Also</h5>
        ##XrDebugUtilsMessengerCreateInfoEXT, #DestroyDebugUtilsMessengerEXT()
        """,

        XrInstance("instance", "the instance the messenger will be used with."),
        XrDebugUtilsMessengerCreateInfoEXT.const.p("createInfo", "points to an ##XrDebugUtilsMessengerCreateInfoEXT structure, which contains the callback pointer as well as defines the conditions under which this messenger will trigger the callback."),
        Check(1)..XrDebugUtilsMessengerEXT.p("messenger", "a pointer to which the created {@code XrDebugUtilsMessengerEXT} object is returned.")
    )

    XrResult(
        "DestroyDebugUtilsMessengerEXT",
        """
        Destroys a debug messenger.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrDestroyDebugUtilsMessengerEXT(
￿    XrDebugUtilsMessengerEXT                    messenger);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to calling #DestroyDebugUtilsMessengerEXT()</li>
            <li>{@code messenger} <b>must</b> be a valid {@code XrDebugUtilsMessengerEXT} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code messenger} <b>must</b> be externally synchronized</li>
            <li>Access to the {@code XrInstance} used to create {@code messenger}, and all of its child handles <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_HANDLE_INVALID</li>
            </ul></dd>
        </dl>

        The application <b>must</b> ensure that #DestroyDebugUtilsMessengerEXT() is not executed in parallel with any OpenXR function that is also called with the {@code instance} or child of {@code instance} that it was created with.

        <h5>See Also</h5>
        #CreateDebugUtilsMessengerEXT()
        """,

        XrDebugUtilsMessengerEXT("messenger", "the {@code XrDebugUtilsMessengerEXT} object to destroy. {@code messenger} is an externally synchronized object and <b>must</b> not be used on more than one thread at a time. This means that #DestroyDebugUtilsMessengerEXT() <b>must</b> not be called when a callback is active.")
    )

    XrResult(
        "SubmitDebugUtilsMessageEXT",
        """
        Submits debug utils message.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult                                    xrSubmitDebugUtilsMessageEXT(
￿    XrInstance                                  instance,
￿    XrDebugUtilsMessageSeverityFlagsEXT         messageSeverity,
￿    XrDebugUtilsMessageTypeFlagsEXT             messageTypes,
￿    const XrDebugUtilsMessengerCallbackDataEXT* callbackData);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>For each structure in {@code objects} found in {@code callbackData}, the value of ##XrDebugUtilsObjectNameInfoEXT{@code ::objectType} <b>must</b> not be #OBJECT_TYPE_UNKNOWN</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to calling #SubmitDebugUtilsMessageEXT()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code messageSeverity} <b>must</b> be a valid combination of {@code XrDebugUtilsMessageSeverityFlagBitsEXT} values</li>
            <li>{@code messageSeverity} <b>must</b> not be 0</li>
            <li>{@code messageTypes} <b>must</b> be a valid combination of {@code XrDebugUtilsMessageTypeFlagBitsEXT} values</li>
            <li>{@code messageTypes} <b>must</b> not be 0</li>
            <li>{@code callbackData} <b>must</b> be a pointer to a valid ##XrDebugUtilsMessengerCallbackDataEXT structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
            </ul></dd>
        </dl>

        The application <b>can</b> also produce a debug message, and submit it into the OpenXR messaging system.

        The call will propagate through the layers and generate callback(s) as indicated by the message’s flags. The parameters are passed on to the callback in addition to the userData value that was defined at the time the messenger was created.

        <h5>See Also</h5>
        ##XrDebugUtilsMessengerCallbackDataEXT
        """,

        XrInstance("instance", "the debug stream’s {@code XrInstance}."),
        XrDebugUtilsMessageSeverityFlagsEXT("messageSeverity", "a single bit value of {@code XrDebugUtilsMessageSeverityFlagsEXT} severity of this event/message."),
        XrDebugUtilsMessageTypeFlagsEXT("messageTypes", "an {@code XrDebugUtilsMessageTypeFlagsEXT} bitmask of {@code XrDebugUtilsMessageTypeFlagBitsEXT} specifying which types of event to identify this message with."),
        XrDebugUtilsMessengerCallbackDataEXT.const.p("callbackData", "contains all the callback related data in the ##XrDebugUtilsMessengerCallbackDataEXT structure.")
    )

    XrResult(
        "SessionBeginDebugUtilsLabelRegionEXT",
        """
        Session begin debug utils label region.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrSessionBeginDebugUtilsLabelRegionEXT(
￿    XrSession                                   session,
￿    const XrDebugUtilsLabelEXT*                 labelInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to calling #SessionBeginDebugUtilsLabelRegionEXT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code labelInfo} <b>must</b> be a pointer to a valid ##XrDebugUtilsLabelEXT structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
            </ul></dd>
        </dl>

        The #SessionBeginDebugUtilsLabelRegionEXT() function begins a label region within {@code session}.

        <h5>See Also</h5>
        ##XrDebugUtilsLabelEXT
        """,

        XrSession("session", "the {@code XrSession} that a label region should be associated with."),
        XrDebugUtilsLabelEXT.const.p("labelInfo", "the ##XrDebugUtilsLabelEXT containing the label information for the region that should be begun.")
    )

    XrResult(
        "SessionEndDebugUtilsLabelRegionEXT",
        """
        Session end debug utils label region.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrSessionEndDebugUtilsLabelRegionEXT(
￿    XrSession                                   session);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>#SessionEndDebugUtilsLabelRegionEXT() <b>must</b> be called only after a matching #SessionBeginDebugUtilsLabelRegionEXT().</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to calling #SessionEndDebugUtilsLabelRegionEXT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
            </ul></dd>
        </dl>

        This function ends the last label region begun with the #SessionBeginDebugUtilsLabelRegionEXT() function within the same {@code session}.
        """,

        XrSession("session", "the {@code XrSession} that a label region should be associated with.")
    )

    XrResult(
        "SessionInsertDebugUtilsLabelEXT",
        """
        Session insert debug utils label.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrSessionInsertDebugUtilsLabelEXT(
￿    XrSession                                   session,
￿    const XrDebugUtilsLabelEXT*                 labelInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTDebugUtils XR_EXT_debug_utils} extension <b>must</b> be enabled prior to calling #SessionInsertDebugUtilsLabelEXT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code labelInfo} <b>must</b> be a pointer to a valid ##XrDebugUtilsLabelEXT structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
            </ul></dd>
        </dl>

        The #SessionInsertDebugUtilsLabelEXT() function inserts an individual label within {@code session}. The individual labels are useful for different reasons based on the type of debugging scenario. When used with something active like a profiler or debugger, it identifies a single point of time. When used with logging, the individual label identifies that a particular location has been passed at the point the log message is triggered. Because of this usage, individual labels only exist in a log until the next call to any of the label functions:

        <ul>
            <li>#SessionBeginDebugUtilsLabelRegionEXT()</li>
            <li>#SessionEndDebugUtilsLabelRegionEXT()</li>
            <li>#SessionInsertDebugUtilsLabelEXT()</li>
        </ul>

        <h5>See Also</h5>
        ##XrDebugUtilsLabelEXT, #SessionBeginDebugUtilsLabelRegionEXT(), #SessionEndDebugUtilsLabelRegionEXT()
        """,

        XrSession("session", "the {@code XrSession} that a label region should be associated with."),
        XrDebugUtilsLabelEXT.const.p("labelInfo", "the ##XrDebugUtilsLabelEXT containing the label information for the region that should be begun.")
    )
}