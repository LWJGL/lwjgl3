/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_texture_gather_bias_lod = "AMDTextureGatherBiasLod".nativeClassVK("AMD_texture_gather_bias_lod", type = "device", postfix = AMD) {
    documentation =
        """
        This extension adds two related features.

        Firstly, support for the following SPIR-V extension in Vulkan is added:

        <ul>
            <li>SPV_AMD_texture_gather_bias_lod</li>
        </ul>

        Secondly, the extension allows the application to query, which formats can be used together with the new function prototypes introduced by the SPIR-V extension.

        <h5>Examples</h5>
        <code><pre>
￿struct VkTextureLODGatherFormatPropertiesAMD
￿{
￿    VkStructureType sType;
￿    const void*     pNext;
￿    VkBool32        supportsTextureGatherLODBiasAMD;
￿};
￿
￿// ----------------------------------------------------------------------------------------
￿// How to detect if an image format can be used with the new function prototypes.
￿VkPhysicalDeviceImageFormatInfo2KHR   formatInfo;
￿VkImageFormatProperties2KHR           formatProps;
￿VkTextureLODGatherFormatPropertiesAMD textureLODGatherSupport;
￿
￿textureLODGatherSupport.sType = VK_STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD;
￿textureLODGatherSupport.pNext = nullptr;
￿
￿formatInfo.sType  = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR;
￿formatInfo.pNext  = nullptr;
￿formatInfo.format = ...;
￿formatInfo.type   = ...;
￿formatInfo.tiling = ...;
￿formatInfo.usage  = ...;
￿formatInfo.flags  = ...;
￿
￿formatProps.sType = VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2_KHR;
￿formatProps.pNext = &textureLODGatherSupport;
￿
￿vkGetPhysicalDeviceImageFormatProperties2KHR(physical_device, &formatInfo, &formatProps);
￿
￿if (textureLODGatherSupport.supportsTextureGatherLODBiasAMD == VK_TRUE)
￿{
￿    // physical device supports SPV_AMD_texture_gather_bias_lod for the specified
￿    // format configuration.
￿}
￿else
￿{
￿    // physical device does not support SPV_AMD_texture_gather_bias_lod for the
￿    // specified format configuration.
￿}</pre></code>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_AMD_texture_gather_bias_lod}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>42</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VK_KHR_get_physical_device_properties2">{@code VK_KHR_get_physical_device_properties2}</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Rex Xu @amdrexu</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>03/21/2017</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Requires the <a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/AMD/SPV_AMD_texture_gather_bias_lod.html">SPV_AMD_texture_gather_bias_lod</a> SPIR-V extension.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Dominik Witczak, AMD</li>
                <li>Daniel Rakos, AMD</li>
                <li>Graham Sellers, AMD</li>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Qun Lin, AMD</li>
                <li>Rex Xu, AMD</li>
                <li>Timothy Lottes, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_TEXTURE_GATHER_BIAS_LOD_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMD_TEXTURE_GATHER_BIAS_LOD_EXTENSION_NAME".."VK_AMD_texture_gather_bias_lod"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD".."1000041000"
    )
}