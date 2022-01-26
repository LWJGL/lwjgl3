/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_robustness2 = "EXTRobustness2".nativeClassVK("EXT_robustness2", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension adds stricter requirements for how out of bounds reads and writes are handled. Most accesses <b>must</b> be tightly bounds-checked, out of bounds writes <b>must</b> be discarded, out of bound reads <b>must</b> return zero. Rather than allowing multiple possible <code>(0,0,0,x)</code> vectors, the out of bounds values are treated as zero, and then missing components are inserted based on the format as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-conversion-to-rgba">Conversion to RGBA</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#fxvertex-input-extraction">vertex input attribute extraction</a>.

        These additional requirements <b>may</b> be expensive on some implementations, and should only be enabled when truly necessary.

        This extension also adds support for “{@code null descriptors}”, where #NULL_HANDLE <b>can</b> be used instead of a valid handle. Accesses to null descriptors have well-defined behavior, and do not rely on robustness.

        <h5>Examples</h5>
        None.

        <h5>VK_EXT_robustness2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_robustness2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>287</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Liam Middlebrook <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_robustness2]%20@liam-middlebrook%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_robustness2%20extension%3E%3E">liam-middlebrook</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-01-29</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Liam Middlebrook, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_ROBUSTNESS_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_ROBUSTNESS_2_EXTENSION_NAME".."VK_EXT_robustness2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT".."1000286000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT".."1000286001"
    )
}