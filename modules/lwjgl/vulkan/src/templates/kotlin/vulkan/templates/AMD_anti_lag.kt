/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_anti_lag = "AMDAntiLag".nativeClassVK("AMD_anti_lag", type = "device", postfix = "AMD") {
    documentation =
        """
        This extension automatically paces the CPU to make sure it does not get too far ahead of the GPU, reducing the latency between inputs received and updates on the screen. Additionally, Anti-Lag+ offers applications the ability to inform the driver when input processing begins, in order to align the timing of display updates, enabling even lower latency between receiving input and displaying on the screen.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_AMD_anti_lag}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>477</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Stu Smith</li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_AMD_anti_lag.adoc">VK_AMD_anti_lag</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2024-06-06</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Tobias Hector, AMD</li>
                <li>Stuart Smith, AMD</li>
                <li>Arkadiusz Sarwa, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_ANTI_LAG_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMD_ANTI_LAG_EXTENSION_NAME".."VK_AMD_anti_lag"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD".."1000476000",
        "STRUCTURE_TYPE_ANTI_LAG_DATA_AMD".."1000476001",
        "STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD".."1000476002"
    )

    EnumConstant(
        """
        VkAntiLagModeAMD - Set the status of the anti-lag feature

        <h5>Description</h5>
        <ul>
            <li>#ANTI_LAG_MODE_DRIVER_CONTROL_AMD specifies that anti-lag will be enabled or disabled depending on driver settings.</li>
            <li>#ANTI_LAG_MODE_ON_AMD specifies that anti-lag will be enabled.</li>
            <li>#ANTI_LAG_MODE_OFF_AMD specifies that anti-lag will be disabled.</li>
        </ul>

        <h5>See Also</h5>
        ##VkAntiLagDataAMD
        """,

        "ANTI_LAG_MODE_DRIVER_CONTROL_AMD".."0",
        "ANTI_LAG_MODE_ON_AMD".."1",
        "ANTI_LAG_MODE_OFF_AMD".."2"
    )

    EnumConstant(
        """
        VkAntiLagStageAMD - Report the application stage

        <h5>Description</h5>
        <ul>
            <li>#ANTI_LAG_STAGE_INPUT_AMD specifies the stage before processing input.</li>
            <li>#ANTI_LAG_STAGE_PRESENT_AMD specifies the stage before #QueuePresentKHR().</li>
        </ul>

        <h5>See Also</h5>
        ##VkAntiLagPresentationInfoAMD
        """,

        "ANTI_LAG_STAGE_INPUT_AMD".."0",
        "ANTI_LAG_STAGE_PRESENT_AMD".."1"
    )

    void(
        "AntiLagUpdateAMD",
        """
        Provide information to reduce latency.

        <h5>C Specification</h5>
        To lower latency, call:

        <pre><code>
￿void vkAntiLagUpdateAMD(
￿    VkDevice                                    device,
￿    const VkAntiLagDataAMD*                     pData);</code></pre>

        <h5>Description</h5>
        This command should be executed immediately before the application processes user input. If {@code pData} is not {@code NULL} and ##VkAntiLagDataAMD{@code ::presentationInfo} is not {@code NULL}, this command <b>should</b> be executed again before #QueuePresentKHR(), with {@code pPresentationInfo} set to matching values.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-antiLag">{@code antiLag}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pData} <b>must</b> be a valid pointer to a valid ##VkAntiLagDataAMD structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkAntiLagDataAMD
        """,

        VkDevice("device", "the logical device"),
        VkAntiLagDataAMD.const.p("pData", "a pointer to a ##VkAntiLagDataAMD structure containing latency reduction parameters.")
    )
}