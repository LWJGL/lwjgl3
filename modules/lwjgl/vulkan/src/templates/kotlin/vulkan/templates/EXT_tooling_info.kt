/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_tooling_info = "EXTToolingInfo".nativeClassVK("EXT_tooling_info", type = "device", postfix = "EXT") {
    documentation =
        """
        When an error occurs during application development, a common question is "What tools are actually running right now?" This extension adds the ability to query that information directly from the Vulkan implementation.

        Outdated versions of one tool might not play nicely with another, or perhaps a tool is not actually running when it should have been. Trying to figure that out can cause headaches as it is necessary to consult each known tool to figure out what is going on — in some cases the tool might not even be known.

        Typically, the expectation is that developers will simply print out this information for visual inspection when an issue occurs, however a small amount of semantic information about what the tool is doing is provided to help identify it programmatically. For example, if the advertised limits or features of an implementation are unexpected, is there a tool active which modifies these limits? Or if an application is providing debug markers, but the implementation is not actually doing anything with that information, this can quickly point that out.

        <h5>Promotion to Vulkan 1.3</h5>
        Functionality in this extension is included in core Vulkan 1.3, with the EXT suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

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

        <h5>VK_EXT_tooling_info</h5>
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

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.3-promotions">Vulkan 1.3</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_tooling_info]%20@tobski%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_tooling_info%20extension%3E%3E">tobski</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-11-05</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.3 Core</li>
            </ul></dd>

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
        "Extends {@code VkToolPurposeFlagBits}.",

        "TOOL_PURPOSE_VALIDATION_BIT_EXT".enum(0x00000001),
        "TOOL_PURPOSE_PROFILING_BIT_EXT".enum(0x00000002),
        "TOOL_PURPOSE_TRACING_BIT_EXT".enum(0x00000004),
        "TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT_EXT".enum(0x00000008),
        "TOOL_PURPOSE_MODIFYING_FEATURES_BIT_EXT".enum(0x00000010)
    )

    EnumConstant(
        "Extends {@code VkToolPurposeFlagBits}.",

        "TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT".enum(0x00000020),
        "TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT".enum(0x00000040)
    )

    VkResult(
        "GetPhysicalDeviceToolPropertiesEXT",
        "See #GetPhysicalDeviceToolProperties().",

        VkPhysicalDevice("physicalDevice", "the handle to the physical device to query for active tools."),
        AutoSize("pToolProperties")..Check(1)..uint32_t.p("pToolCount", "a pointer to an integer describing the number of tools active on {@code physicalDevice}."),
        nullable..VkPhysicalDeviceToolProperties.p("pToolProperties", "either {@code NULL} or a pointer to an array of ##VkPhysicalDeviceToolProperties structures.")
    )
}