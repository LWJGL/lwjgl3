/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_representative_fragment_test = "NVRepresentativeFragmentTest".nativeClassVK("NV_representative_fragment_test", type = "device", postfix = NV) {
    documentation =
        """
        This extension provides a new representative fragment test that allows implementations to reduce the amount of rasterization and fragment processing work performed for each point, line, or triangle primitive. For any primitive that produces one or more fragments that pass all other early fragment tests, the implementation is permitted to choose one or more "{@code representative}" fragments for processing and discard all other fragments. For draw calls rendering multiple points, lines, or triangles arranged in lists, strips, or fans, the representative fragment test is performed independently for each of those primitives.

        This extension is useful for applications that use an early render pass to determine the full set of primitives that would be visible in the final scene. In this render pass, such applications would set up a fragment shader that enables early fragment tests and writes to an image or shader storage buffer to record the ID of the primitive that generated the fragment. Without this extension, the shader would record the ID separately for each visible fragment of each primitive. With this extension, fewer stores will be performed, particularly for large primitives.

        The representative fragment test has no effect if early fragment tests are not enabled via the fragment shader. The set of fragments discarded by the representative fragment test is implementation-dependent and may vary from frame to frame. In some cases, the representative fragment test may not discard any fragments for a given primitive.

        <h5>VK_NV_representative_fragment_test</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_representative_fragment_test}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>167</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Kedarnath Thangudu <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_NV_representative_fragment_test:%20&amp;body=@kthangudu%20">kthangudu</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-09-13</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Kedarnath Thangudu, NVIDIA</li>
                <li>Christoph Kubisch, NVIDIA</li>
                <li>Pierre Boudier, NVIDIA</li>
                <li>Pat Brown, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Eric Werness, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_REPRESENTATIVE_FRAGMENT_TEST_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "NV_REPRESENTATIVE_FRAGMENT_TEST_EXTENSION_NAME".."VK_NV_representative_fragment_test"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV".."1000166000",
        "STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV".."1000166001"
    )
}