/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_tooling_info = "EXTToolingInfo".nativeClassVK("EXT_tooling_info", type = "device", postfix = EXT) {
    documentation =
        """
        When an error occurs during application development, a common question is "What tools are actually running right now?" This extension adds the ability to query that information directly from the Vulkan implementation.

        Outdated versions of one tool might not play nicely with another, or perhaps a tool is not actually running when it should have been. Trying to figure that out can cause headaches as it's necessary to consult each known tool to figure out what's going on - in some cases the tool might not even be known.

        Typically, the expectation is that developers will simply print out this information for visual inspection when an issue occurs, however a small amount of semantic information about what the tool is doing is provided to help identify it programmatically. For example, if the advertised limits or features of an implementation are unexpected, is there a tool active which modifies these limits? Or if an application is providing debug markers, but the implementation is not actually doing anything with that information, this can quickly point that out.

        <h5>Examples</h5>
        <pre><code>
￿uint32_t num_tools;
￿VkPhysicalDeviceToolPropertiesEXT *pToolProperties;
￿vkGetPhysicalDeviceToolPropertiesEXT(physicalDevice, &amp;num_tools, NULL);
￿
￿pToolProperties = (VkPhysicalDeviceToolPropertiesEXT*)malloc(sizeof(VkPhysicalDeviceToolPropertiesEXT) * num_tools);
￿
￿vkGetPhysicalDeviceToolPropertiesEXT(physicalDevice, &amp;num_tools, pToolProperties);
￿
￿for (int i = 0; i &lt; num_tools; ++i) {
￿    printf("%s:\n", pToolProperties[i].name);
￿    printf("Version:\n");
￿    printf("%s:\n", pToolProperties[i].version);
￿    printf("Description:\n");
￿    printf("\t%s\n", pToolProperties[i].description);
￿    printf("Purposes:\n");
￿    printf("\t%s\n", VkToolPurposeFlagBitsEXT_to_string(pToolProperties[i].purposes));
￿    if (strnlen_s(pToolProperties[i].layer,VK_MAX_EXTENSION_NAME_SIZE) &gt; 0) {
￿        printf("Corresponding Layer:\n");
￿        printf("\t%s\n", pToolProperties[i].layer);
￿    }
￿}</code></pre>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_tooling_info}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>246</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_tooling_info:%20&amp;body=@tobski%20">tobski</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2018-11-05</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Rolando Caloca</li>
                <li>Matthaeus Chajdas</li>
                <li>Baldur Karlsson</li>
                <li>Daniel Rakos</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_TOOLING_INFO_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_TOOLING_INFO_EXTENSION_NAME".."VK_EXT_tooling_info"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES_EXT".."1000245000"
    )

    EnumConstant(
        "Extends {@code VkToolPurposeFlagBitsEXT}.",

        "TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT".enum(0x00000020),
        "TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT".enum(0x00000040)
    )

    EnumConstant(
        """
        VkToolPurposeFlagBitsEXT - Bitmask specifying the purposes of an active tool

        <h5>Description</h5>
        <ul>
            <li>#TOOL_PURPOSE_VALIDATION_BIT_EXT specifies that the tool provides validation of API usage.</li>
            <li>#TOOL_PURPOSE_PROFILING_BIT_EXT specifies that the tool provides profiling of API usage.</li>
            <li>#TOOL_PURPOSE_TRACING_BIT_EXT specifies that the tool is capturing data about the application&#8217;s API usage, including anything from simple logging to capturing data for later replay.</li>
            <li>#TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT_EXT specifies that the tool provides additional API features/extensions on top of the underlying implementation.</li>
            <li>#TOOL_PURPOSE_MODIFYING_FEATURES_BIT_EXT specifies that the tool modifies the API features/limits/extensions presented to the application.</li>
            <li>#TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT specifies that the tool reports additional information to the application via callbacks specified by #CreateDebugReportCallbackEXT() or #CreateDebugUtilsMessengerEXT()</li>
            <li>#TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT specifies that the tool consumes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#debugging-debug-markers">debug markers</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#debugging-object-debug-annotation">object debug annotation</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#debugging-queue-labels">queue labels</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#debugging-command-buffer-labels">command buffer labels</a></li>
        </ul>

        <h5>See Also</h5>
        {@code VkToolPurposeFlagsEXT}
        """,

        "TOOL_PURPOSE_VALIDATION_BIT_EXT".enum(0x00000001),
        "TOOL_PURPOSE_PROFILING_BIT_EXT".enum(0x00000002),
        "TOOL_PURPOSE_TRACING_BIT_EXT".enum(0x00000004),
        "TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT_EXT".enum(0x00000008),
        "TOOL_PURPOSE_MODIFYING_FEATURES_BIT_EXT".enum(0x00000010)
    )

    VkResult(
        "GetPhysicalDeviceToolPropertiesEXT",
        """
        Reports properties of tools active on the specified physical device.

        <h5>C Specification</h5>
        Information about tools providing debugging, profiling, or similar services, active for a given physical device, can be obtained by calling:

        <pre><code>
￿VkResult vkGetPhysicalDeviceToolPropertiesEXT(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pToolCount,
￿    VkPhysicalDeviceToolPropertiesEXT*          pToolProperties);</code></pre>

        <h5>Description</h5>
        If {@code pToolProperties} is {@code NULL}, the implementation will return the number of tools currently active on {@code physicalDevice} in {@code pToolCount}.

        If {@code pToolProperties} is not {@code NULL}, its elements are populate with information about active tools, up to the number stored in {@code pToolCount}; the number of elements actually returned is returned in {@code pToolCount}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pToolCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If {@code pToolProperties} is not {@code NULL}, {@code pToolProperties} <b>must</b> be a valid pointer to an array of {@code pToolCount} ##VkPhysicalDeviceToolPropertiesEXT structures</li>
            <li>If {@code pToolProperties} is not {@code NULL}, the value referenced by {@code pToolCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkPhysicalDeviceToolPropertiesEXT
        """,

        VkPhysicalDevice("physicalDevice", "the handle to the physical device to query for active tools."),
        AutoSize("pToolProperties")..Check(1)..uint32_t.p("pToolCount", "a pointer to an integer describing the number of tools active on {@code physicalDevice}."),
        nullable..VkPhysicalDeviceToolPropertiesEXT.p("pToolProperties", "either {@code NULL} or a pointer to an array of ##VkPhysicalDeviceToolPropertiesEXT instances.")
    )
}