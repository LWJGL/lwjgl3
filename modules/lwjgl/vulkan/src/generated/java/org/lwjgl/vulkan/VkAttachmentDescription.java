/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying an attachment description.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the attachment uses a color format, then {@code loadOp} and {@code storeOp} are used, and {@code stencilLoadOp} and {@code stencilStoreOp} are ignored. If the format has depth and/or stencil components, {@code loadOp} and {@code storeOp} apply only to the depth data, while {@code stencilLoadOp} and {@code stencilStoreOp} define how the stencil data is handled. {@code loadOp} and {@code stencilLoadOp} define the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-load-operations">load operations</a> for the attachment. {@code storeOp} and {@code stencilStoreOp} define the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-store-operations">store operations</a> for the attachment. If an attachment is not used by any subpass, {@code loadOp}, {@code storeOp}, {@code stencilStoreOp}, and {@code stencilLoadOp} will be ignored for that attachment, and no load or store ops will be performed. However, any transition specified by {@code initialLayout} and {@code finalLayout} will still be executed.</p>
 * 
 * <p>If {@code flags} includes {@link VK10#VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT}, then the attachment is treated as if it shares physical memory with another attachment in the same render pass. This information limits the ability of the implementation to reorder certain operations (like layout transitions and the {@code loadOp}) such that it is not improperly reordered against other uses of the same physical memory via a different attachment. This is described in more detail below.</p>
 * 
 * <p>If a render pass uses multiple attachments that alias the same device memory, those attachments <b>must</b> each include the {@link VK10#VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT} bit in their attachment description flags. Attachments aliasing the same memory occurs in multiple ways:</p>
 * 
 * <ul>
 * <li>Multiple attachments being assigned the same image view as part of framebuffer creation.</li>
 * <li>Attachments using distinct image views that correspond to the same image subresource of an image.</li>
 * <li>Attachments using views of distinct image subresources which are bound to overlapping memory ranges.</li>
 * </ul>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Render passes <b>must</b> include subpass dependencies (either directly or via a subpass dependency chain) between any two subpasses that operate on the same attachment or aliasing attachments and those subpass dependencies <b>must</b> include execution and memory dependencies separating uses of the aliases, if at least one of those subpasses writes to one of the aliases. These dependencies <b>must</b> not include the {@link VK10#VK_DEPENDENCY_BY_REGION_BIT DEPENDENCY_BY_REGION_BIT} if the aliases are views of distinct image subresources which overlap in memory.</p>
 * </div>
 * 
 * <p>Multiple attachments that alias the same memory <b>must</b> not be used in a single subpass. A given attachment index <b>must</b> not be used multiple times in a single subpass, with one exception: two subpass attachments <b>can</b> use the same attachment index if at least one use is as an input attachment and neither use is as a resolve or preserve attachment. In other words, the same view <b>can</b> be used simultaneously as an input and color or depth/stencil attachment, but <b>must</b> not be used as multiple color or depth/stencil attachments nor as resolve or preserve attachments.</p>
 * 
 * <p>If a set of attachments alias each other, then all except the first to be used in the render pass <b>must</b> use an {@code initialLayout} of {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}, since the earlier uses of the other aliases make their contents undefined. Once an alias has been used and a different alias has been used after it, the first alias <b>must</b> not be used in any later subpasses. However, an application <b>can</b> assign the same image view to multiple aliasing attachment indices, which allows that image view to be used multiple times even if other aliases are used in between.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Once an attachment needs the {@link VK10#VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT} bit, there <b>should</b> be no additional cost of introducing additional aliases, and using these additional aliases <b>may</b> allow more efficient clearing of the attachments on multiple uses via {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code format} includes a color or depth component and {@code loadOp} is {@link VK10#VK_ATTACHMENT_LOAD_OP_LOAD ATTACHMENT_LOAD_OP_LOAD}, then {@code initialLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}</li>
 * <li>{@code finalLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}</li>
 * <li>If {@code format} is a color format, {@code initialLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code format} is a depth/stencil format, {@code initialLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}</li>
 * <li>If {@code format} is a color format, {@code finalLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code format} is a depth/stencil format, {@code finalLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}</li>
 * <li>If {@code format} is a color format, {@code initialLayout} <b>must</b> not be {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL} or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}</li>
 * <li>If {@code format} is a color format, {@code finalLayout} <b>must</b> not be {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL} or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-separateDepthStencilLayouts">{@code separateDepthStencilLayouts}</a> feature is not enabled, {@code initialLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL}, or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL},</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-separateDepthStencilLayouts">{@code separateDepthStencilLayouts}</a> feature is not enabled, {@code finalLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL}, or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL},</li>
 * <li>If {@code format} is a color format, {@code initialLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL}, or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code format} is a color format, {@code finalLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL}, or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code format} is a depth/stencil format which includes both depth and stencil components, {@code initialLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code format} is a depth/stencil format which includes both depth and stencil components, {@code finalLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code format} is a depth/stencil format which includes only the depth component, {@code initialLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code format} is a depth/stencil format which includes only the depth component, {@code finalLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature is not enabled, {@code initialLayout} <b>must</b> not be {@link KHRSynchronization2#VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR} or {@link KHRSynchronization2#VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature is not enabled, {@code finalLayout} <b>must</b> not be {@link KHRSynchronization2#VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR} or {@link KHRSynchronization2#VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-attachmentFeedbackLoopLayout">{@code attachmentFeedbackLoopLayout}</a> feature is not enabled, {@code initialLayout} <b>must</b> not be {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-attachmentFeedbackLoopLayout">{@code attachmentFeedbackLoopLayout}</a> feature is not enabled, {@code finalLayout} <b>must</b> not be {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT}</li>
 * <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value that is set in {@code imageCreateSampleCounts} (as defined in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-creation-limits">Image Creation Limits</a>) for the given {@code format}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingLocalRead">{@code dynamicRenderingLocalRead}</a> feature is not enabled, {@code initialLayout} <b>must</b> not be {@link KHRDynamicRenderingLocalRead#VK_IMAGE_LAYOUT_RENDERING_LOCAL_READ_KHR IMAGE_LAYOUT_RENDERING_LOCAL_READ_KHR}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingLocalRead">{@code dynamicRenderingLocalRead}</a> feature is not enabled, {@code finalLayout} <b>must</b> not be {@link KHRDynamicRenderingLocalRead#VK_IMAGE_LAYOUT_RENDERING_LOCAL_READ_KHR IMAGE_LAYOUT_RENDERING_LOCAL_READ_KHR}</li>
 * <li>{@code format} <b>must</b> not be VK_FORMAT_UNDEFINED</li>
 * <li>If {@code format} includes a stencil component and {@code stencilLoadOp} is {@link VK10#VK_ATTACHMENT_LOAD_OP_LOAD ATTACHMENT_LOAD_OP_LOAD}, then {@code initialLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}</li>
 * <li>If {@code format} is a depth/stencil format which includes only the stencil component, {@code initialLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code format} is a depth/stencil format which includes only the stencil component, {@code finalLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code format} is a depth/stencil format which includes both depth and stencil components, {@code initialLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code format} is a depth/stencil format which includes both depth and stencil components, {@code finalLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkAttachmentDescriptionFlagBits} values</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * <li>{@code loadOp} <b>must</b> be a valid {@code VkAttachmentLoadOp} value</li>
 * <li>{@code storeOp} <b>must</b> be a valid {@code VkAttachmentStoreOp} value</li>
 * <li>{@code stencilLoadOp} <b>must</b> be a valid {@code VkAttachmentLoadOp} value</li>
 * <li>{@code stencilStoreOp} <b>must</b> be a valid {@code VkAttachmentStoreOp} value</li>
 * <li>{@code initialLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code finalLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRenderPassCreateInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAttachmentDescription {
 *     VkAttachmentDescriptionFlags {@link #flags};
 *     VkFormat {@link #format};
 *     VkSampleCountFlagBits {@link #samples};
 *     VkAttachmentLoadOp {@link #loadOp};
 *     VkAttachmentStoreOp {@link #storeOp};
 *     VkAttachmentLoadOp {@link #stencilLoadOp};
 *     VkAttachmentStoreOp {@link #stencilStoreOp};
 *     VkImageLayout {@link #initialLayout};
 *     VkImageLayout {@link #finalLayout};
 * }</code></pre>
 */
public class VkAttachmentDescription extends Struct<VkAttachmentDescription> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        FORMAT,
        SAMPLES,
        LOADOP,
        STOREOP,
        STENCILLOADOP,
        STENCILSTOREOP,
        INITIALLAYOUT,
        FINALLAYOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        FORMAT = layout.offsetof(1);
        SAMPLES = layout.offsetof(2);
        LOADOP = layout.offsetof(3);
        STOREOP = layout.offsetof(4);
        STENCILLOADOP = layout.offsetof(5);
        STENCILSTOREOP = layout.offsetof(6);
        INITIALLAYOUT = layout.offsetof(7);
        FINALLAYOUT = layout.offsetof(8);
    }

    protected VkAttachmentDescription(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAttachmentDescription create(long address, @Nullable ByteBuffer container) {
        return new VkAttachmentDescription(address, container);
    }

    /**
     * Creates a {@code VkAttachmentDescription} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAttachmentDescription(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a bitmask of {@code VkAttachmentDescriptionFlagBits} specifying additional properties of the attachment. */
    @NativeType("VkAttachmentDescriptionFlags")
    public int flags() { return nflags(address()); }
    /** a {@code VkFormat} value specifying the format of the image view that will be used for the attachment. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** a {@code VkSampleCountFlagBits} value specifying the number of samples of the image. */
    @NativeType("VkSampleCountFlagBits")
    public int samples() { return nsamples(address()); }
    /** a {@code VkAttachmentLoadOp} value specifying how the contents of color and depth components of the attachment are treated at the beginning of the subpass where it is first used. */
    @NativeType("VkAttachmentLoadOp")
    public int loadOp() { return nloadOp(address()); }
    /** a {@code VkAttachmentStoreOp} value specifying how the contents of color and depth components of the attachment are treated at the end of the subpass where it is last used. */
    @NativeType("VkAttachmentStoreOp")
    public int storeOp() { return nstoreOp(address()); }
    /** a {@code VkAttachmentLoadOp} value specifying how the contents of stencil components of the attachment are treated at the beginning of the subpass where it is first used. */
    @NativeType("VkAttachmentLoadOp")
    public int stencilLoadOp() { return nstencilLoadOp(address()); }
    /** a {@code VkAttachmentStoreOp} value specifying how the contents of stencil components of the attachment are treated at the end of the last subpass where it is used. */
    @NativeType("VkAttachmentStoreOp")
    public int stencilStoreOp() { return nstencilStoreOp(address()); }
    /** the layout the attachment image subresource will be in when a render pass instance begins. */
    @NativeType("VkImageLayout")
    public int initialLayout() { return ninitialLayout(address()); }
    /** the layout the attachment image subresource will be transitioned to when a render pass instance ends. */
    @NativeType("VkImageLayout")
    public int finalLayout() { return nfinalLayout(address()); }

    /** Sets the specified value to the {@link #flags} field. */
    public VkAttachmentDescription flags(@NativeType("VkAttachmentDescriptionFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #format} field. */
    public VkAttachmentDescription format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@link #samples} field. */
    public VkAttachmentDescription samples(@NativeType("VkSampleCountFlagBits") int value) { nsamples(address(), value); return this; }
    /** Sets the specified value to the {@link #loadOp} field. */
    public VkAttachmentDescription loadOp(@NativeType("VkAttachmentLoadOp") int value) { nloadOp(address(), value); return this; }
    /** Sets the specified value to the {@link #storeOp} field. */
    public VkAttachmentDescription storeOp(@NativeType("VkAttachmentStoreOp") int value) { nstoreOp(address(), value); return this; }
    /** Sets the specified value to the {@link #stencilLoadOp} field. */
    public VkAttachmentDescription stencilLoadOp(@NativeType("VkAttachmentLoadOp") int value) { nstencilLoadOp(address(), value); return this; }
    /** Sets the specified value to the {@link #stencilStoreOp} field. */
    public VkAttachmentDescription stencilStoreOp(@NativeType("VkAttachmentStoreOp") int value) { nstencilStoreOp(address(), value); return this; }
    /** Sets the specified value to the {@link #initialLayout} field. */
    public VkAttachmentDescription initialLayout(@NativeType("VkImageLayout") int value) { ninitialLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #finalLayout} field. */
    public VkAttachmentDescription finalLayout(@NativeType("VkImageLayout") int value) { nfinalLayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAttachmentDescription set(
        int flags,
        int format,
        int samples,
        int loadOp,
        int storeOp,
        int stencilLoadOp,
        int stencilStoreOp,
        int initialLayout,
        int finalLayout
    ) {
        flags(flags);
        format(format);
        samples(samples);
        loadOp(loadOp);
        storeOp(storeOp);
        stencilLoadOp(stencilLoadOp);
        stencilStoreOp(stencilStoreOp);
        initialLayout(initialLayout);
        finalLayout(finalLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAttachmentDescription set(VkAttachmentDescription src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentDescription} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAttachmentDescription malloc() {
        return new VkAttachmentDescription(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAttachmentDescription} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentDescription calloc() {
        return new VkAttachmentDescription(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAttachmentDescription} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentDescription create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentDescription(memAddress(container), container);
    }

    /** Returns a new {@code VkAttachmentDescription} instance for the specified memory address. */
    public static VkAttachmentDescription create(long address) {
        return new VkAttachmentDescription(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAttachmentDescription createSafe(long address) {
        return address == NULL ? null : new VkAttachmentDescription(address, null);
    }

    /**
     * Returns a new {@link VkAttachmentDescription.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescription.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescription.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAttachmentDescription.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAttachmentDescription.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAttachmentDescription mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAttachmentDescription callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAttachmentDescription mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAttachmentDescription callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAttachmentDescription.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAttachmentDescription.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAttachmentDescription.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAttachmentDescription.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkAttachmentDescription} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentDescription malloc(MemoryStack stack) {
        return new VkAttachmentDescription(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAttachmentDescription} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentDescription calloc(MemoryStack stack) {
        return new VkAttachmentDescription(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAttachmentDescription.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescription.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkAttachmentDescription.FLAGS); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkAttachmentDescription.FORMAT); }
    /** Unsafe version of {@link #samples}. */
    public static int nsamples(long struct) { return memGetInt(struct + VkAttachmentDescription.SAMPLES); }
    /** Unsafe version of {@link #loadOp}. */
    public static int nloadOp(long struct) { return memGetInt(struct + VkAttachmentDescription.LOADOP); }
    /** Unsafe version of {@link #storeOp}. */
    public static int nstoreOp(long struct) { return memGetInt(struct + VkAttachmentDescription.STOREOP); }
    /** Unsafe version of {@link #stencilLoadOp}. */
    public static int nstencilLoadOp(long struct) { return memGetInt(struct + VkAttachmentDescription.STENCILLOADOP); }
    /** Unsafe version of {@link #stencilStoreOp}. */
    public static int nstencilStoreOp(long struct) { return memGetInt(struct + VkAttachmentDescription.STENCILSTOREOP); }
    /** Unsafe version of {@link #initialLayout}. */
    public static int ninitialLayout(long struct) { return memGetInt(struct + VkAttachmentDescription.INITIALLAYOUT); }
    /** Unsafe version of {@link #finalLayout}. */
    public static int nfinalLayout(long struct) { return memGetInt(struct + VkAttachmentDescription.FINALLAYOUT); }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkAttachmentDescription.FLAGS, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkAttachmentDescription.FORMAT, value); }
    /** Unsafe version of {@link #samples(int) samples}. */
    public static void nsamples(long struct, int value) { memPutInt(struct + VkAttachmentDescription.SAMPLES, value); }
    /** Unsafe version of {@link #loadOp(int) loadOp}. */
    public static void nloadOp(long struct, int value) { memPutInt(struct + VkAttachmentDescription.LOADOP, value); }
    /** Unsafe version of {@link #storeOp(int) storeOp}. */
    public static void nstoreOp(long struct, int value) { memPutInt(struct + VkAttachmentDescription.STOREOP, value); }
    /** Unsafe version of {@link #stencilLoadOp(int) stencilLoadOp}. */
    public static void nstencilLoadOp(long struct, int value) { memPutInt(struct + VkAttachmentDescription.STENCILLOADOP, value); }
    /** Unsafe version of {@link #stencilStoreOp(int) stencilStoreOp}. */
    public static void nstencilStoreOp(long struct, int value) { memPutInt(struct + VkAttachmentDescription.STENCILSTOREOP, value); }
    /** Unsafe version of {@link #initialLayout(int) initialLayout}. */
    public static void ninitialLayout(long struct, int value) { memPutInt(struct + VkAttachmentDescription.INITIALLAYOUT, value); }
    /** Unsafe version of {@link #finalLayout(int) finalLayout}. */
    public static void nfinalLayout(long struct, int value) { memPutInt(struct + VkAttachmentDescription.FINALLAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkAttachmentDescription} structs. */
    public static class Buffer extends StructBuffer<VkAttachmentDescription, Buffer> implements NativeResource {

        private static final VkAttachmentDescription ELEMENT_FACTORY = VkAttachmentDescription.create(-1L);

        /**
         * Creates a new {@code VkAttachmentDescription.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentDescription#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkAttachmentDescription getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAttachmentDescription#flags} field. */
        @NativeType("VkAttachmentDescriptionFlags")
        public int flags() { return VkAttachmentDescription.nflags(address()); }
        /** @return the value of the {@link VkAttachmentDescription#format} field. */
        @NativeType("VkFormat")
        public int format() { return VkAttachmentDescription.nformat(address()); }
        /** @return the value of the {@link VkAttachmentDescription#samples} field. */
        @NativeType("VkSampleCountFlagBits")
        public int samples() { return VkAttachmentDescription.nsamples(address()); }
        /** @return the value of the {@link VkAttachmentDescription#loadOp} field. */
        @NativeType("VkAttachmentLoadOp")
        public int loadOp() { return VkAttachmentDescription.nloadOp(address()); }
        /** @return the value of the {@link VkAttachmentDescription#storeOp} field. */
        @NativeType("VkAttachmentStoreOp")
        public int storeOp() { return VkAttachmentDescription.nstoreOp(address()); }
        /** @return the value of the {@link VkAttachmentDescription#stencilLoadOp} field. */
        @NativeType("VkAttachmentLoadOp")
        public int stencilLoadOp() { return VkAttachmentDescription.nstencilLoadOp(address()); }
        /** @return the value of the {@link VkAttachmentDescription#stencilStoreOp} field. */
        @NativeType("VkAttachmentStoreOp")
        public int stencilStoreOp() { return VkAttachmentDescription.nstencilStoreOp(address()); }
        /** @return the value of the {@link VkAttachmentDescription#initialLayout} field. */
        @NativeType("VkImageLayout")
        public int initialLayout() { return VkAttachmentDescription.ninitialLayout(address()); }
        /** @return the value of the {@link VkAttachmentDescription#finalLayout} field. */
        @NativeType("VkImageLayout")
        public int finalLayout() { return VkAttachmentDescription.nfinalLayout(address()); }

        /** Sets the specified value to the {@link VkAttachmentDescription#flags} field. */
        public VkAttachmentDescription.Buffer flags(@NativeType("VkAttachmentDescriptionFlags") int value) { VkAttachmentDescription.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescription#format} field. */
        public VkAttachmentDescription.Buffer format(@NativeType("VkFormat") int value) { VkAttachmentDescription.nformat(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescription#samples} field. */
        public VkAttachmentDescription.Buffer samples(@NativeType("VkSampleCountFlagBits") int value) { VkAttachmentDescription.nsamples(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescription#loadOp} field. */
        public VkAttachmentDescription.Buffer loadOp(@NativeType("VkAttachmentLoadOp") int value) { VkAttachmentDescription.nloadOp(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescription#storeOp} field. */
        public VkAttachmentDescription.Buffer storeOp(@NativeType("VkAttachmentStoreOp") int value) { VkAttachmentDescription.nstoreOp(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescription#stencilLoadOp} field. */
        public VkAttachmentDescription.Buffer stencilLoadOp(@NativeType("VkAttachmentLoadOp") int value) { VkAttachmentDescription.nstencilLoadOp(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescription#stencilStoreOp} field. */
        public VkAttachmentDescription.Buffer stencilStoreOp(@NativeType("VkAttachmentStoreOp") int value) { VkAttachmentDescription.nstencilStoreOp(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescription#initialLayout} field. */
        public VkAttachmentDescription.Buffer initialLayout(@NativeType("VkImageLayout") int value) { VkAttachmentDescription.ninitialLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescription#finalLayout} field. */
        public VkAttachmentDescription.Buffer finalLayout(@NativeType("VkImageLayout") int value) { VkAttachmentDescription.nfinalLayout(address(), value); return this; }

    }

}