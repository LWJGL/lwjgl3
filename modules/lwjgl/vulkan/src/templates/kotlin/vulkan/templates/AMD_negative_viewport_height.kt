/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_negative_viewport_height = "AMDNegativeViewportHeight".nativeClassVK("AMD_negative_viewport_height", type = "device", postfix = "AMD") {
    documentation =
        """
        This extension allows an application to specify a negative viewport height. The result is that the viewport transformation will flip along the y-axis.

        <ul>
            <li>Allow negative height to be specified in the ##VkViewport{@code ::height} field to perform y-inversion of the clip-space to framebuffer-space transform. This allows apps to avoid having to use {@code gl_Position.y = -gl_Position.y} in shaders also targeting other APIs.</li>
        </ul>

        <h5>Obsoletion by {@code VK_KHR_maintenance1} and Vulkan 1.1</h5>
        Functionality in this extension is included in {@code VK_KHR_maintenance1} and subsequently Vulkan 1.1. Due to some slight behavioral differences, this extension <b>must</b> not be enabled alongside {@code VK_KHR_maintenance1}, or in an instance created with version 1.1 or later requested in ##VkApplicationInfo{@code ::apiVersion}.

        <h5>VK_AMD_negative_viewport_height</h5>
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

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li>
                    <em>Obsoleted</em> by {@link KHRMaintenance1 VK_KHR_maintenance1} extension
                    <ul>
                        <li>Which in turn was <em>promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1-promotions">Vulkan 1.1</a></li>
                    </ul>
                </li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Matthaeus G. Chajdas <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_negative_viewport_height]%20@anteru%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMD_negative_viewport_height%20extension%3E%3E">anteru</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
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