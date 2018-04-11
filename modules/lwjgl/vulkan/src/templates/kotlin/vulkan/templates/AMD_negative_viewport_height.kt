/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_negative_viewport_height = "AMDNegativeViewportHeight".nativeClassVK("AMD_negative_viewport_height", type = "device", postfix = AMD) {
    documentation =
        """
        This extension allows an application to specify a negative viewport height. The result is that the viewport transformation will flip along the y-axis.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_AMD_negative_viewport_height}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>36</dd>

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
            <dd>2016-09-02</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Graham Sellers, AMD</li>
                <li>Baldur Karlsson</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_NEGATIVE_VIEWPORT_HEIGHT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMD_NEGATIVE_VIEWPORT_HEIGHT_EXTENSION_NAME".."VK_AMD_negative_viewport_height"
    )
}