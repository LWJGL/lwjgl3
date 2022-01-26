/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_shader_info = "AMDShaderInfo".nativeClassVK("AMD_shader_info", type = "device", postfix = "AMD") {
    documentation =
        """
        This extension adds a way to query certain information about a compiled shader which is part of a pipeline. This information may include shader disassembly, shader binary and various statistics about a shader’s resource usage.

        While this extension provides a mechanism for extracting this information, the details regarding the contents or format of this information are not specified by this extension and may be provided by the vendor externally.

        Furthermore, all information types are optionally supported, and users should not assume every implementation supports querying every type of information.

        <h5>Examples</h5>
        This example extracts the register usage of a fragment shader within a particular graphics pipeline:

        <pre><code>
￿extern VkDevice device;
￿extern VkPipeline gfxPipeline;
￿
￿PFN_vkGetShaderInfoAMD pfnGetShaderInfoAMD = (PFN_vkGetShaderInfoAMD)vkGetDeviceProcAddr(
￿    device, "vkGetShaderInfoAMD");
￿
￿VkShaderStatisticsInfoAMD statistics = {};
￿
￿size_t dataSize = sizeof(statistics);
￿
￿if (pfnGetShaderInfoAMD(device,
￿    gfxPipeline,
￿    VK_SHADER_STAGE_FRAGMENT_BIT,
￿    VK_SHADER_INFO_TYPE_STATISTICS_AMD,
￿    &amp;dataSize,
￿    &amp;statistics) == VK_SUCCESS)
￿{
￿    printf("VGPR usage: %d\n", statistics.resourceUsage.numUsedVgprs);
￿    printf("SGPR usage: %d\n", statistics.resourceUsage.numUsedSgprs);
￿}</code></pre>

        The following example continues the previous example by subsequently attempting to query and print shader disassembly about the fragment shader:

        <pre><code>
￿// Query disassembly size (if available)
￿if (pfnGetShaderInfoAMD(device,
￿    gfxPipeline,
￿    VK_SHADER_STAGE_FRAGMENT_BIT,
￿    VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD,
￿    &amp;dataSize,
￿    nullptr) == VK_SUCCESS)
￿{
￿    printf("Fragment shader disassembly:\n");
￿
￿    void* disassembly = malloc(dataSize);
￿
￿    // Query disassembly and print
￿    if (pfnGetShaderInfoAMD(device,
￿        gfxPipeline,
￿        VK_SHADER_STAGE_FRAGMENT_BIT,
￿        VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD,
￿        &amp;dataSize,
￿        disassembly) == VK_SUCCESS)
￿    {
￿        printf((char*)disassembly);
￿    }
￿
￿    free(disassembly);
￿}</code></pre>

        <h5>VK_AMD_shader_info</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_AMD_shader_info}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>43</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Special Use</b></dt>
            <dd><ul>
                <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#extendingvulkan-compatibility-specialuse">Developer tools</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jaakko Konttinen <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_shader_info]%20@jaakkoamd%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMD_shader_info%20extension%3E%3E">jaakkoamd</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-10-09</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jaakko Konttinen, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_SHADER_INFO_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMD_SHADER_INFO_EXTENSION_NAME".."VK_AMD_shader_info"
    )

    EnumConstant(
        """
        VkShaderInfoTypeAMD - Enum specifying which type of shader information to query

        <h5>Description</h5>
        <ul>
            <li>#SHADER_INFO_TYPE_STATISTICS_AMD specifies that device resources used by a shader will be queried.</li>
            <li>#SHADER_INFO_TYPE_BINARY_AMD specifies that implementation-specific information will be queried.</li>
            <li>#SHADER_INFO_TYPE_DISASSEMBLY_AMD specifies that human-readable dissassembly of a shader.</li>
        </ul>

        <h5>See Also</h5>
        #GetShaderInfoAMD()
        """,

        "SHADER_INFO_TYPE_STATISTICS_AMD".."0",
        "SHADER_INFO_TYPE_BINARY_AMD".."1",
        "SHADER_INFO_TYPE_DISASSEMBLY_AMD".."2"
    )

    VkResult(
        "GetShaderInfoAMD",
        """
        Get information about a shader in a pipeline.

        <h5>C Specification</h5>
        Information about a particular shader that has been compiled as part of a pipeline object can be extracted by calling:

        <pre><code>
￿VkResult vkGetShaderInfoAMD(
￿    VkDevice                                    device,
￿    VkPipeline                                  pipeline,
￿    VkShaderStageFlagBits                       shaderStage,
￿    VkShaderInfoTypeAMD                         infoType,
￿    size_t*                                     pInfoSize,
￿    void*                                       pInfo);</code></pre>

        <h5>Description</h5>
        If {@code pInfo} is {@code NULL}, then the maximum size of the information that <b>can</b> be retrieved about the shader, in bytes, is returned in {@code pInfoSize}. Otherwise, {@code pInfoSize} <b>must</b> point to a variable set by the user to the size of the buffer, in bytes, pointed to by {@code pInfo}, and on return the variable is overwritten with the amount of data actually written to {@code pInfo}. If {@code pInfoSize} is less than the maximum size that <b>can</b> be retrieved by the pipeline cache, then at most {@code pInfoSize} bytes will be written to {@code pInfo}, and #INCOMPLETE will be returned, instead of #SUCCESS, to indicate that not all required of the pipeline cache was returned.

        Not all information is available for every shader and implementations may not support all kinds of information for any shader. When a certain type of information is unavailable, the function returns #ERROR_FEATURE_NOT_PRESENT.

        If information is successfully and fully queried, the function will return #SUCCESS.

        For {@code infoType} #SHADER_INFO_TYPE_STATISTICS_AMD, a ##VkShaderStatisticsInfoAMD structure will be written to the buffer pointed to by {@code pInfo}. This structure will be populated with statistics regarding the physical device resources used by that shader along with other miscellaneous information and is described in further detail below.

        For {@code infoType} #SHADER_INFO_TYPE_DISASSEMBLY_AMD, {@code pInfo} is a pointer to a UTF-8 null-terminated string containing human-readable disassembly. The exact formatting and contents of the disassembly string are vendor-specific.

        The formatting and contents of all other types of information, including {@code infoType} #SHADER_INFO_TYPE_BINARY_AMD, are left to the vendor and are not further specified by this extension.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
            <li>{@code shaderStage} <b>must</b> be a valid {@code VkShaderStageFlagBits} value</li>
            <li>{@code infoType} <b>must</b> be a valid {@code VkShaderInfoTypeAMD} value</li>
            <li>{@code pInfoSize} <b>must</b> be a valid pointer to a {@code size_t} value</li>
            <li>If the value referenced by {@code pInfoSize} is not 0, and {@code pInfo} is not {@code NULL}, {@code pInfo} <b>must</b> be a valid pointer to an array of {@code pInfoSize} bytes</li>
            <li>{@code pipeline} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FEATURE_NOT_PRESENT</li>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the device that created {@code pipeline}."),
        VkPipeline("pipeline", "the target of the query."),
        VkShaderStageFlagBits("shaderStage", "a {@code VkShaderStageFlagBits} specifying the particular shader within the pipeline about which information is being queried."),
        VkShaderInfoTypeAMD("infoType", "describes what kind of information is being queried."),
        AutoSize("pInfo")..Check(1)..size_t.p("pInfoSize", "a pointer to a value related to the amount of data the query returns, as described below."),
        nullable..void.p("pInfo", "either {@code NULL} or a pointer to a buffer.")
    )
}