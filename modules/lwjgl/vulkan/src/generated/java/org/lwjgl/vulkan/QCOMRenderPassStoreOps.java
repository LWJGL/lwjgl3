/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * Renderpass attachments <b>can</b> be read-only for the duration of a render pass.
 * 
 * <p>Examples include input attachments and depth attachments where depth tests are enabled but depth writes are not enabled.</p>
 * 
 * <p>In such cases, there <b>can</b> be no contents generated for an attachment within the render area.</p>
 * 
 * <p>This extension adds a new {@code VkAttachmentStoreOp} {@link #VK_ATTACHMENT_STORE_OP_NONE_QCOM ATTACHMENT_STORE_OP_NONE_QCOM} specifying that the contents within the render area <b>may</b> not be written to memory, but that the prior contents of the attachment in memory are preserved. However, if any contents were generated within the render area during rendering, the contents of the attachment will be undefined inside the render area.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The {@code VkAttachmentStoreOp} {@link VK10#VK_ATTACHMENT_STORE_OP_STORE ATTACHMENT_STORE_OP_STORE} <b>may</b> force an implementation to assume that the attachment was written and force an implementation to flush data to memory or to a higher level cache. The {@code VkAttachmentStoreOp} {@link #VK_ATTACHMENT_STORE_OP_NONE_QCOM ATTACHMENT_STORE_OP_NONE_QCOM} <b>may</b> allow an implementation to assume that the attachment was not written and allow an implementation to avoid such a flush..</p>
 * </div>
 * 
 * <h5>VK_QCOM_render_pass_store_ops</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_QCOM_render_pass_store_ops}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>302</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Bill Licea-Kane <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_QCOM_render_pass_store_ops]%20@wwlk%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_QCOM_render_pass_store_ops%20extension%3E%3E">wwlk</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-03-25</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Bill Licea-Kane, Qualcomm Technologies, Inc.</li>
 * </ul></dd>
 * </dl>
 */
public final class QCOMRenderPassStoreOps {

    /** The extension specification version. */
    public static final int VK_QCOM_RENDER_PASS_STORE_OPS_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_QCOM_RENDER_PASS_STORE_OPS_EXTENSION_NAME = "VK_QCOM_render_pass_store_ops";

    /** Extends {@code VkAttachmentStoreOp}. */
    public static final int VK_ATTACHMENT_STORE_OP_NONE_QCOM = 1000301000;

    private QCOMRenderPassStoreOps() {}

}