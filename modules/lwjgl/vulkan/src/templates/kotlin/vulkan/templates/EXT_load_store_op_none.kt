/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_load_store_op_none = "EXTLoadStoreOpNone".nativeClassVK("EXT_load_store_op_none", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension incorporates #ATTACHMENT_STORE_OP_NONE_EXT from {@link QCOMRenderPassStoreOps VK_QCOM_render_pass_store_ops}, enabling applications to avoid unnecessary synchronization when an attachment is not written during a render pass.

        Additionally, #ATTACHMENT_LOAD_OP_NONE_EXT is introduced to avoid unnecessary synchronization when an attachment is not used during a render pass at all. In combination with #ATTACHMENT_STORE_OP_NONE_EXT, this is useful as an alternative to preserve attachments in applications that cannot decide if an attachment will be used in a render pass until after the necessary pipelines have been created.

        <h5>VK_EXT_load_store_op_none</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_load_store_op_none}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>401</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Shahbaz Youssefi <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_load_store_op_none]%20@syoussefi%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_load_store_op_none%20extension%3E%3E">syoussefi</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-06-06</dd>

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

        "EXT_LOAD_STORE_OP_NONE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_LOAD_STORE_OP_NONE_EXTENSION_NAME".."VK_EXT_load_store_op_none"
    )

    EnumConstant(
        "Extends {@code VkAttachmentLoadOp}.",

        "ATTACHMENT_LOAD_OP_NONE_EXT".."1000400000"
    )

    EnumConstant(
        "Extends {@code VkAttachmentStoreOp}.",

        "ATTACHMENT_STORE_OP_NONE_EXT".."1000301000"
    )
}