/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_load_store_op_none = "KHRLoadStoreOpNone".nativeClassVK("KHR_load_store_op_none", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension provides #ATTACHMENT_LOAD_OP_NONE_KHR and #ATTACHMENT_STORE_OP_NONE_KHR, which are identically promoted from the {@link EXTLoadStoreOpNone VK_EXT_load_store_op_none} extension.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_load_store_op_none}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>527</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Shahbaz Youssefi <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_load_store_op_none]%20@syoussefi%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_load_store_op_none%20extension*">syoussefi</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_load_store_op_none.adoc">VK_KHR_load_store_op_none</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-05-16</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Shahbaz Youssefi, Google</li>
                <li>Bill Licea-Kane, Qualcomm Technologies, Inc.</li>
                <li>Tobias Hector, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_LOAD_STORE_OP_NONE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_LOAD_STORE_OP_NONE_EXTENSION_NAME".."VK_KHR_load_store_op_none"
    )

    EnumConstant(
        "Extends {@code VkAttachmentLoadOp}.",

        "ATTACHMENT_LOAD_OP_NONE_KHR".."1000400000"
    )

    EnumConstant(
        "Extends {@code VkAttachmentStoreOp}.",

        "ATTACHMENT_STORE_OP_NONE_KHR".."1000301000"
    )
}