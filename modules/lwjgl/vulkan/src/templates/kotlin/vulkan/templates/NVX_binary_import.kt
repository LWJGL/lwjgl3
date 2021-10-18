/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NVX_binary_import = "NVXBinaryImport".nativeClassVK("NVX_binary_import", type = "device", postfix = NVX) {
    documentation =
        """
        This extension allows applications to import CuBIN binaries and execute them.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        There is currently no specification language written for this extension, so although it appears in the Vulkan headers, its interfaces are not summarized here.
        </div>

        <h5>VK_NVX_binary_import</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NVX_binary_import}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>30</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Eric Werness <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NVX_binary_import]%20@ewerness-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NVX_binary_import%20extension%3E%3E">ewerness-nv</a></li>
                <li>Liam Middlebrook <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NVX_binary_import]%20@liam-middlebrook%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NVX_binary_import%20extension%3E%3E">liam-middlebrook</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-04-09</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Eric Werness, NVIDIA</li>
                <li>Liam Middlebrook, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NVX_BINARY_IMPORT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NVX_BINARY_IMPORT_EXTENSION_NAME".."VK_NVX_binary_import"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_CU_MODULE_CREATE_INFO_NVX".."1000029000",
        "STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX".."1000029001",
        "STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX".."1000029002"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_CU_MODULE_NVX".."1000029000",
        "OBJECT_TYPE_CU_FUNCTION_NVX".."1000029001"
    )

    EnumConstant(
        "Extends {@code VkDebugReportObjectTypeEXT}.",

        "DEBUG_REPORT_OBJECT_TYPE_CU_MODULE_NVX_EXT".."1000029000",
        "DEBUG_REPORT_OBJECT_TYPE_CU_FUNCTION_NVX_EXT".."1000029001"
    )

    VkResult(
        "CreateCuModuleNVX",
        "",

        VkDevice("device", ""),
        VkCuModuleCreateInfoNVX.const.p("pCreateInfo", ""),
        nullable..VkAllocationCallbacks.const.p("pAllocator", ""),
        Check(1)..VkCuModuleNVX.p("pModule", "")
    )

    VkResult(
        "CreateCuFunctionNVX",
        "",

        VkDevice("device", ""),
        VkCuFunctionCreateInfoNVX.const.p("pCreateInfo", ""),
        nullable..VkAllocationCallbacks.const.p("pAllocator", ""),
        Check(1)..VkCuFunctionNVX.p("pFunction", "")
    )

    void(
        "DestroyCuModuleNVX",
        "",

        VkDevice("device", ""),
        VkCuModuleNVX("module", ""),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "")
    )

    void(
        "DestroyCuFunctionNVX",
        "",

        VkDevice("device", ""),
        VkCuFunctionNVX("function", ""),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "")
    )

    void(
        "CmdCuLaunchKernelNVX",
        "",

        VkCommandBuffer("commandBuffer", ""),
        VkCuLaunchInfoNVX.const.p("pLaunchInfo", "")
    )
}