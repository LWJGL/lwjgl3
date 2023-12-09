/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val ANDROID_external_format_resolve = "ANDROIDExternalFormatResolve".nativeClassVK("ANDROID_external_format_resolve", type = "device", postfix = "ANDROID") {
    documentation =
        """
        This extension enables rendering to Android Hardware Buffers with external formats which cannot be directly represented as renderable in Vulkan, including Y′C<sub>B</sub>C<sub>R</sub> formats.

        <h5>VK_ANDROID_external_format_resolve</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_ANDROID_external_format_resolve}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>469</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link ANDROIDExternalMemoryAndroidHardwareBuffer VK_ANDROID_external_memory_android_hardware_buffer}</dd>

            <dt><b>API Interactions</b></dt>
            <dd><ul>
                <li>Interacts with VK_KHR_dynamic_rendering</li>
            </ul></dd>

            <dt><b>Special Use</b></dt>
            <dd><ul>
                <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#extendingvulkan-compatibility-specialuse">OpenGL / ES support</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Chris Forbes <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_ANDROID_external_format_resolve]%20@chrisforbes%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_ANDROID_external_format_resolve%20extension*">chrisforbes</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_ANDROID_external_format_resolve.adoc">VK_ANDROID_external_format_resolve</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-05-03</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Tobias Hector, AMD</li>
                <li>Chris Forbes, Google</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Shahbaz Youssefi, Google</li>
                <li>Matthew Netsch, Qualcomm</li>
                <li>Tony Zlatsinki, Nvidia</li>
                <li>Daniel Koch, Nvidia</li>
                <li>Jeff Leger, Qualcomm</li>
                <li>Alex Walters, Imagination</li>
                <li>Andrew Garrard, Imagination</li>
                <li>Ralph Potter, Samsung</li>
                <li>Ian Elliott, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "ANDROID_EXTERNAL_FORMAT_RESOLVE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ANDROID_EXTERNAL_FORMAT_RESOLVE_EXTENSION_NAME".."VK_ANDROID_external_format_resolve"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_FEATURES_ANDROID".."1000468000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_PROPERTIES_ANDROID".."1000468001",
        "STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_RESOLVE_PROPERTIES_ANDROID".."1000468002"
    )

    EnumConstant(
        "Extends {@code VkResolveModeFlagBits}.",

        "RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID".enum(0x00000010)
    )
}