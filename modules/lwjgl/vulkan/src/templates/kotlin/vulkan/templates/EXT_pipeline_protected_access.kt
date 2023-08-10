/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_pipeline_protected_access = "EXTPipelineProtectedAccess".nativeClassVK("EXT_pipeline_protected_access", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension allows protected memory access to be specified per pipeline as opposed to per device. Through the usage of this extension, any performance penalty paid due to access to protected memory will be limited to the specific pipelines that make such accesses.

        <h5>VK_EXT_pipeline_protected_access</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_pipeline_protected_access}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>467</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Shahbaz Youssefi <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_pipeline_protected_access]%20@syoussefi%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_pipeline_protected_access%20extension*">syoussefi</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_pipeline_protected_access.adoc">VK_EXT_pipeline_protected_access</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-07-28</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Shahbaz Youssefi, Google</li>
                <li>Jörg Wagner, Arm</li>
                <li>Ralph Potter, Samsung</li>
                <li>Daniel Koch, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_PIPELINE_PROTECTED_ACCESS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_PIPELINE_PROTECTED_ACCESS_EXTENSION_NAME".."VK_EXT_pipeline_protected_access"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES_EXT".."1000466000"
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_NO_PROTECTED_ACCESS_BIT_EXT".enum(0x08000000),
        "PIPELINE_CREATE_PROTECTED_ACCESS_ONLY_BIT_EXT".enum(0x40000000)
    )
}