/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_mixed_attachment_samples = "AMDMixedAttachmentSamples".nativeClassVK("AMD_mixed_attachment_samples", type = "null", postfix = AMD) {
    documentation =
        """
        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_AMD_mixed_attachment_samples</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>137</dd>

            <dt><b>Status</b></dt>
            <dd>Complete</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-07-24</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Mais Alnasser, AMD</li>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Maciej Jesionowski, AMD</li>
                <li>Daniel Rakos, AMD</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Matthaeus G. Chajdas (mailto:matthaeus.chajdas@amd.com[matthaeus.chajdas@amd.com])</li>
            </ul></dd>

            <dt><b>Overview</b></dt>
            <dd>This extension enables applications to use multisampled rendering with a depth/stencil sample count that is larger than the color sample count. Having a depth/stencil sample count larger than the color sample count allows maintaining geometry and coverage information at a higher sample rate than color information. All samples are depth/stencil tested, but only the first color sample count number of samples get a corresponding color output.</dd>
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