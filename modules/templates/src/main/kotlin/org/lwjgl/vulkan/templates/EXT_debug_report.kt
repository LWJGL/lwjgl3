/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val EXT_debug_report = "EXTDebugReport".nativeClassVK("EXT_debug_report", type = "instance", postfix = EXT) {
    documentation =
        """
        Due to the nature of the Vulkan interface, there is very little error information available to the developer and application. By enabling optional validation layers and using the {@code VK_EXT_debug_report} extension, developers <b>can</b> obtain much more detailed feedback on the application's use of Vulkan. This extension defines a way for layers and the implementation to call back to the application for events of interest to the application.

        <h5>Examples</h5>
        {@code VK_EXT_debug_report} allows an application to register multiple callbacks with the validation layers. Some callbacks may log the information to a file, others may cause a debug break point or other application defined behavior. An application <b>can</b> register callbacks even when no validation layers are enabled, but they will only be called for loader and, if implemented, driver events.

        To capture events that occur while creating or destroying an instance an application <b>can</b> link a ##VkDebugReportCallbackCreateInfoEXT structure to the {@code pNext} element of the ##VkInstanceCreateInfo structure given to #CreateInstance(). This callback is only valid for the duration of the #CreateInstance() and the #DestroyInstance() call. Use #CreateDebugReportCallbackEXT() to create persistent callback objects.

        Example uses: Create three callback objects. One will log errors and warnings to the debug console using Windows {@code OutputDebugString}. The second will cause the debugger to break at that callback when an error happens and the third will log warnings to stdout.

        <code><pre>
￿    VkResult res;
￿    VkDebugReportCallbackEXT cb1, cb2, cb3;
￿
￿    VkDebugReportCallbackCreateInfoEXT callback1 = {
￿            VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT,    // sType
￿            NULL,                                                       // pNext
￿            VK_DEBUG_REPORT_ERROR_BIT_EXT |                             // flags
￿            VK_DEBUG_REPORT_WARNING_BIT_EXT,
￿            myOutputDebugString,                                        // pfnCallback
￿            NULL                                                        // pUserData
￿    };
￿    res = vkCreateDebugReportCallbackEXT(instance, &callback1, &cb1);
￿    if (res != VK_SUCCESS)
￿       // Do error handling for VK_ERROR_OUT_OF_MEMORY 
￿
￿    callback.flags = VK_DEBUG_REPORT_ERROR_BIT_EXT;
￿    callback.pfnCallback = myDebugBreak;
￿    callback.pUserData = NULL;
￿    res = vkCreateDebugReportCallbackEXT(instance, &callback, &cb2);
￿    if (res != VK_SUCCESS)
￿       // Do error handling for VK_ERROR_OUT_OF_MEMORY 
￿
￿    VkDebugReportCallbackCreateInfoEXT callback3 = {
￿            VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT,    // sType
￿            NULL,                                                       // pNext
￿            VK_DEBUG_REPORT_WARNING_BIT_EXT,                            // flags
￿            mystdOutLogger,                                             // pfnCallback
￿            NULL                                                        // pUserData
￿    };
￿    res = vkCreateDebugReportCallbackEXT(instance, &callback3, &cb3);
￿    if (res != VK_SUCCESS)
￿       // Do error handling for VK_ERROR_OUT_OF_MEMORY 
￿
￿    ...
￿
￿    // remove callbacks when cleaning up 
￿    vkDestroyDebugReportCallbackEXT(instance, cb1);
￿    vkDestroyDebugReportCallbackEXT(instance, cb2);
￿    vkDestroyDebugReportCallbackEXT(instance, cb3);</pre></code>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        In the initial release of the {@code VK_EXT_debug_report} extension, the token #STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT was used. Starting in version 2 of the extension branch, #STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT is used instead for consistency with Vulkan naming rules. The older enum is still available for backwards compatibility.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        In the initial release of the {@code VK_EXT_debug_report} extension, the token #DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT was used. Starting in version 8 of the extension branch, #DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT is used instead for consistency with Vulkan naming rules. The older enum is still available for backwards compatibility.
        </div>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_EXT_debug_report</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>12</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-04-27</dd>

            <dt><b>Revision</b></dt>
            <dd>8</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0.27 of the Vulkan API.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Courtney Goeltzenleuchter, LunarG</li>
                <li>Dan Ginsburg, Valve</li>
                <li>Jon Ashburn, LunarG</li>
                <li>Mark Lobodzinski, LunarG</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Courtney Goeltzenleuchter</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_DEBUG_REPORT_SPEC_VERSION".."8"
    )

    StringConstant(
        "The extension name.",

        "EXT_DEBUG_REPORT_EXTENSION_NAME".."VK_EXT_debug_report"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT".."1000011000"
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_VALIDATION_FAILED_EXT".."-1000011001"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT".."1000011000"
    )

    EnumConstant(
        """
        VkDebugReportObjectTypeEXT - Specify the type of an object handle

        <h5>Description</h5>
        For more information, see:

        <ul>
            <li>The See Also section for other reference pages using this type.</li>
            <li>The Vulkan Specification.</li>
        </ul>

        <h5>See Also</h5>
        ##VkDebugMarkerObjectNameInfoEXT, ##VkDebugMarkerObjectTagInfoEXT, #DebugReportMessageEXT()
        """,

        "DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT".."0",
        "DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT".."1",
        "DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT".."2",
        "DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT".."3",
        "DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT".."4",
        "DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT".."5",
        "DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT".."6",
        "DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT".."7",
        "DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT".."8",
        "DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT".."9",
        "DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT".."10",
        "DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT".."11",
        "DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT".."12",
        "DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT".."13",
        "DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT".."14",
        "DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT".."15",
        "DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT".."16",
        "DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT".."17",
        "DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT".."18",
        "DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT".."19",
        "DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT".."20",
        "DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT".."21",
        "DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT".."22",
        "DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT".."23",
        "DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT".."24",
        "DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT".."25",
        "DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT".."26",
        "DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT".."27",
        "DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT".."28",
        "DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT".."29",
        "DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT".."30",
        "DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT".."31",
        "DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT".."32"
    )

    EnumConstant(
        """
        VkDebugReportFlagBitsEXT - Bitmask specifying events which cause a debug report callback

        <h5>Description</h5>
        <ul>
            <li>#DEBUG_REPORT_ERROR_BIT_EXT specifies that an error that may cause undefined results, including an application crash.</li>
            <li>#DEBUG_REPORT_WARNING_BIT_EXT specifies use of Vulkan that <b>may</b> expose an app bug. Such cases may not be immediately harmful, such as a fragment shader outputting to a location with no attachment. Other cases <b>may</b> point to behavior that is almost certainly bad when unintended such as using an image whose memory has not been filled. In general if you see a warning but you know that the behavior is intended/desired, then simply ignore the warning.</li>
            <li>#DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT specifies a potentially non-optimal use of Vulkan, e.g. using #CmdClearColorImage() when setting ##VkAttachmentDescription{@code ::loadOp} to #ATTACHMENT_LOAD_OP_CLEAR would have worked.</li>
            <li>#DEBUG_REPORT_INFORMATION_BIT_EXT specifies an informational message such as resource details that may be handy when debugging an application.</li>
            <li>#DEBUG_REPORT_DEBUG_BIT_EXT specifies diagnostic information from the implementation and layers.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkDebugReportFlagsEXT}
        """,

        "DEBUG_REPORT_INFORMATION_BIT_EXT".enum(0x00000001),
        "DEBUG_REPORT_WARNING_BIT_EXT".enum(0x00000002),
        "DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT".enum(0x00000004),
        "DEBUG_REPORT_ERROR_BIT_EXT".enum(0x00000008),
        "DEBUG_REPORT_DEBUG_BIT_EXT".enum(0x00000010)
    )

    VkResult(
        "CreateDebugReportCallbackEXT",
        """
        Create a debug report callback object.

        <h5>C Specification</h5>
        Debug report callbacks give more detailed feedback on the application's use of Vulkan when events of interest occur.

        To register a debug report callback, an application uses #CreateDebugReportCallbackEXT().

        <code><pre>
￿VkResult vkCreateDebugReportCallbackEXT(
￿    VkInstance                                  instance,
￿    const VkDebugReportCallbackCreateInfoEXT*   pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkDebugReportCallbackEXT*                   pCallback);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkDebugReportCallbackCreateInfoEXT structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pCallback} <b>must</b> be a pointer to a {@code VkDebugReportCallbackEXT} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkDebugReportCallbackCreateInfoEXT
        """,

        VkInstance.IN("instance", "the instance the callback will be logged on."),
        const..VkDebugReportCallbackCreateInfoEXT.p.IN("pCreateInfo", "points to a ##VkDebugReportCallbackCreateInfoEXT structure which defines the conditions under which this callback will be called."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkDebugReportCallbackEXT.p.OUT("pCallback", "a pointer to record the {@code VkDebugReportCallbackEXT} object created.")
    )

    void(
        "DestroyDebugReportCallbackEXT",
        """
        Destroy a debug report callback object.

        <h5>C Specification</h5>
        To destroy a {@code VkDebugReportCallbackEXT} object, call:

        <code><pre>
￿void vkDestroyDebugReportCallbackEXT(
￿    VkInstance                                  instance,
￿    VkDebugReportCallbackEXT                    callback,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkAllocationCallbacks were provided when {@code callback} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code callback} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>{@code callback} <b>must</b> be a valid {@code VkDebugReportCallbackEXT} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code callback} <b>must</b> have been created, allocated, or retrieved from {@code instance}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code callback} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkInstance.IN("instance", "the instance where the callback was created."),
        VkDebugReportCallbackEXT.IN("callback", "the {@code VkDebugReportCallbackEXT} object to destroy. {@code callback} is an externally synchronized object and <b>must</b> not be used on more than one thread at a time. This means that #DestroyDebugReportCallbackEXT() <b>must</b> not be called when a callback is active."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "DebugReportMessageEXT",
        """
        Inject a message into a debug stream.

        <h5>C Specification</h5>
        To inject its own messages into the debug stream, call:

        <code><pre>
￿void vkDebugReportMessageEXT(
￿    VkInstance                                  instance,
￿    VkDebugReportFlagsEXT                       flags,
￿    VkDebugReportObjectTypeEXT                  objectType,
￿    uint64_t                                    object,
￿    size_t                                      location,
￿    int32_t                                     messageCode,
￿    const char*                                 pLayerPrefix,
￿    const char*                                 pMessage);</pre></code>

        <h5>Description</h5>
        The call will propagate through the layers and generate callback(s) as indicated by the message's flags. The parameters are passed on to the callback in addition to the {@code pUserData} value that was defined at the time the callback was registered.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code object} <b>must</b> be a Vulkan object or #NULL_HANDLE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkDebugReportFlagBitsEXT} values</li>
            <li>{@code flags} <b>must</b> not be 0</li>
            <li>{@code objectType} <b>must</b> be a valid {@code VkDebugReportObjectTypeEXT} value</li>
            <li>{@code pLayerPrefix} <b>must</b> be a null-terminated UTF-8 string</li>
            <li>{@code pMessage} <b>must</b> be a null-terminated UTF-8 string</li>
        </ul>
        """,

        VkInstance.IN("instance", "the debug stream&#8217;s {@code VkInstance}."),
        VkDebugReportFlagsEXT.IN("flags", "indicates the {@code VkDebugReportFlagBitsEXT} classification of this event/message."),
        VkDebugReportObjectTypeEXT.IN("objectType", "a {@code VkDebugReportObjectTypeEXT} specifying the type of object being used or created at the time the event was triggered."),
        uint64_t.IN("object", "this is the object where the issue was detected. {@code object} <b>can</b> be #NULL_HANDLE if there is no object associated with the event."),
        size_t.IN("location", "an application defined value."),
        int32_t.IN("messageCode", "an application defined value."),
        const..charUTF8_p.IN("pLayerPrefix", "the abbreviation of the component making this event/message."),
        const..charUTF8_p.IN("pMessage", "a null-terminated string detailing the trigger conditions.")
    )
}