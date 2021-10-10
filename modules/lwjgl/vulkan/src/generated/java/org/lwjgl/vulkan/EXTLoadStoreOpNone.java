/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension incorporates {@link #VK_ATTACHMENT_STORE_OP_NONE_EXT ATTACHMENT_STORE_OP_NONE_EXT} from {@link QCOMRenderPassStoreOps VK_QCOM_render_pass_store_ops}, enabling applications to avoid unnecessary synchronization when an attachment is not written during a render pass.
 * 
 * <p>Additionally, {@link #VK_ATTACHMENT_LOAD_OP_NONE_EXT ATTACHMENT_LOAD_OP_NONE_EXT} is introduced to avoid unnecessary synchronization when an attachment is not used during a render pass at all. In combination with {@link #VK_ATTACHMENT_STORE_OP_NONE_EXT ATTACHMENT_STORE_OP_NONE_EXT}, this is useful as an alternative to preserve attachments in applications that cannot decide if an attachment will be used in a render pass until after the necessary pipelines have been created.</p>
 * 
 * <h5>VK_EXT_load_store_op_none</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_load_store_op_none}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>401</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Shahbaz Youssefi <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_load_store_op_none]%20@syoussefi%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_load_store_op_none%20extension%3E%3E">syoussefi</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-06-06</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Shahbaz Youssefi, Google</li>
 * <li>Bill Licea-Kane, Qualcomm Technologies, Inc.</li>
 * <li>Tobias Hector, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTLoadStoreOpNone {

    /** The extension specification version. */
    public static final int VK_EXT_LOAD_STORE_OP_NONE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_LOAD_STORE_OP_NONE_EXTENSION_NAME = "VK_EXT_load_store_op_none";

    /** Extends {@code VkAttachmentLoadOp}. */
    public static final int VK_ATTACHMENT_LOAD_OP_NONE_EXT = 1000400000;

    /** Extends {@code VkAttachmentStoreOp}. */
    public static final int VK_ATTACHMENT_STORE_OP_NONE_EXT = 1000301000;

    private EXTLoadStoreOpNone() {}

}