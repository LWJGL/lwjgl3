/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_ycbcr_degamma = "QCOMYcbcrDegamma".nativeClassVK("QCOM_ycbcr_degamma", type = "device", postfix = "QCOM") {
    documentation =
        """
        This extension allows implementations to expose support for “{@code sRGB EOTF}” also known as “{@code sRGB degamma}”, used in combination with images using 8-bit Y′C<sub>B</sub>C<sub>R</sub> formats. In addition, the degamma can be selectively applied to the Y (luma) or CrCb (chroma).

        {@link KHRSamplerYcbcrConversion VK_KHR_sampler_ycbcr_conversion} adds support for Y′C<sub>B</sub>C<sub>R</sub> conversion, but allows texture sampling in a non-linear space which can cause artifacts. This extension allows implementations to expose sRGB degamma for Y′C<sub>B</sub>C<sub>R</sub> formats, which is performed during texture filtering, allowing texture filtering to operate in a linear space.

        <h5>VK_QCOM_ycbcr_degamma</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_QCOM_ycbcr_degamma}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>521</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Leger <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_QCOM_ycbcr_degamma]%20@jackohound%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_QCOM_ycbcr_degamma%20extension*">jackohound</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-07-31</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd>None</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Leger, Qualcomm</li>
                <li>Jonathan Wicks, Qualcomm</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "QCOM_YCBCR_DEGAMMA_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "QCOM_YCBCR_DEGAMMA_EXTENSION_NAME".."VK_QCOM_ycbcr_degamma"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM".."1000520000",
        "STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM".."1000520001"
    )
}