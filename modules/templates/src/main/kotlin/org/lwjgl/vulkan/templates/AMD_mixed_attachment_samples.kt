/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_mixed_attachment_samples = "AMDMixedAttachmentSamples".nativeClassVK("AMD_mixed_attachment_samples", type = "device", postfix = AMD) {
    documentation =
        """
        This extension enables applications to use multisampled rendering with a depth/stencil sample count that is larger than the color sample count. Having a depth/stencil sample count larger than the color sample count allows maintaining geometry and coverage information at a higher sample rate than color information. All samples are depth/stencil tested, but only the first color sample count number of samples get a corresponding color output.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_AMD_mixed_attachment_samples}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>137</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Matthaeus G. Chajdas @anteru</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-07-24</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Mais Alnasser, AMD</li>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Maciej Jesionowski, AMD</li>
                <li>Daniel Rakos, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_MIXED_ATTACHMENT_SAMPLES_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMD_MIXED_ATTACHMENT_SAMPLES_EXTENSION_NAME".."VK_AMD_mixed_attachment_samples"
    )
}