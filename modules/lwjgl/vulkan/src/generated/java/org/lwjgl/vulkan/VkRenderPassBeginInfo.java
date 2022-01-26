/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying render pass begin information.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code renderArea} is the render area that is affected by the render pass instance. The effects of attachment load, store and multisample resolve operations are restricted to the pixels whose x and y coordinates fall within the render area on all attachments. The render area extends to all layers of {@code framebuffer}. The application <b>must</b> ensure (using scissor if necessary) that all rendering is contained within the render area. The render area, after any transform specified by {@link VkRenderPassTransformBeginInfoQCOM}{@code ::transform} is applied, <b>must</b> be contained within the framebuffer dimensions.</p>
 * 
 * <p>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vertexpostproc-renderpass-transform">render pass transform</a> is enabled, then {@code renderArea} <b>must</b> equal the framebuffer pre-transformed dimensions. After {@code renderArea} has been transformed by {@link VkRenderPassTransformBeginInfoQCOM}{@code ::transform}, the resulting render area <b>must</b> be equal to the framebuffer dimensions.</p>
 * 
 * <p>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-subpassShading">subpass shading</a> is enabled, then {@code renderArea} <b>must</b> equal the framebuffer dimensions.</p>
 * 
 * <p>When multiview is enabled, the resolve operation at the end of a subpass applies to all views in the view mask.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>There <b>may</b> be a performance cost for using a render area smaller than the framebuffer, unless it matches the render area granularity for the render pass.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code clearValueCount} <b>must</b> be greater than the largest attachment index in {@code renderPass} specifying a {@code loadOp} (or {@code stencilLoadOp}, if the attachment has a depth/stencil format) of {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}</li>
 * <li>If {@code clearValueCount} is not 0, {@code pClearValues} <b>must</b> be a valid pointer to an array of {@code clearValueCount} {@link VkClearValue} unions</li>
 * <li>{@code renderPass} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the {@link VkFramebufferCreateInfo} structure specified when creating {@code framebuffer}</li>
 * <li>If the {@code pNext} chain does not contain {@link VkDeviceGroupRenderPassBeginInfo} or its {@code deviceRenderAreaCount} member is equal to 0, {@code renderArea.offset.x} <b>must</b> be greater than or equal to 0</li>
 * <li>If the {@code pNext} chain does not contain {@link VkDeviceGroupRenderPassBeginInfo} or its {@code deviceRenderAreaCount} member is equal to 0, {@code renderArea.offset.y} <b>must</b> be greater than or equal to 0</li>
 * <li>If the {@code pNext} chain does not contain {@link VkDeviceGroupRenderPassBeginInfo} or its {@code deviceRenderAreaCount} member is equal to 0, <code>renderArea.offset.x + renderArea.extent.width</code> <b>must</b> be less than or equal to {@link VkFramebufferCreateInfo}{@code ::width} the {@code framebuffer} was created with</li>
 * <li>If the {@code pNext} chain does not contain {@link VkDeviceGroupRenderPassBeginInfo} or its {@code deviceRenderAreaCount} member is equal to 0, <code>renderArea.offset.y + renderArea.extent.height</code> <b>must</b> be less than or equal to {@link VkFramebufferCreateInfo}{@code ::height} the {@code framebuffer} was created with</li>
 * <li>If the {@code pNext} chain contains {@link VkDeviceGroupRenderPassBeginInfo}, <code>offset.x + extent.width</code> of each element of {@code pDeviceRenderAreas} <b>must</b> be less than or equal to {@link VkFramebufferCreateInfo}{@code ::width} the {@code framebuffer} was created with</li>
 * <li>If the {@code pNext} chain contains {@link VkDeviceGroupRenderPassBeginInfo}, <code>offset.y + extent.height</code> of each element of {@code pDeviceRenderAreas} <b>must</b> be less than or equal to {@link VkFramebufferCreateInfo}{@code ::height} the {@code framebuffer} was created with</li>
 * <li>If {@code framebuffer} was created with a {@link VkFramebufferCreateInfo}{@code ::flags} value that did not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, and the {@code pNext} chain includes a {@link VkRenderPassAttachmentBeginInfo} structure, its {@code attachmentCount} <b>must</b> be zero</li>
 * <li>If {@code framebuffer} was created with a {@link VkFramebufferCreateInfo}{@code ::flags} value that included {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code attachmentCount} of a {@link VkRenderPassAttachmentBeginInfo} structure included in the {@code pNext} chain <b>must</b> be equal to the value of {@link VkFramebufferAttachmentsCreateInfo}{@code ::attachmentImageInfoCount} used to create {@code framebuffer}</li>
 * <li>If {@code framebuffer} was created with a {@link VkFramebufferCreateInfo}{@code ::flags} value that included {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of the {@code pAttachments} member of a {@link VkRenderPassAttachmentBeginInfo} structure included in the {@code pNext} chain <b>must</b> have been created on the same {@code VkDevice} as {@code framebuffer} and {@code renderPass}</li>
 * <li>If {@code framebuffer} was created with a {@link VkFramebufferCreateInfo}{@code ::flags} value that included {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of the {@code pAttachments} member of a {@link VkRenderPassAttachmentBeginInfo} structure included in the {@code pNext} chain <b>must</b> be a {@code VkImageView} of an image created with a value of {@link VkImageCreateInfo}{@code ::flags} equal to the {@code flags} member of the corresponding element of {@link VkFramebufferAttachmentsCreateInfo}{@code ::pAttachmentImageInfos} used to create {@code framebuffer}</li>
 * <li>If {@code framebuffer} was created with a {@link VkFramebufferCreateInfo}{@code ::flags} value that included {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of the {@code pAttachments} member of a {@link VkRenderPassAttachmentBeginInfo} structure included in the {@code pNext} chain <b>must</b> be a {@code VkImageView} with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-inherited-usage">an inherited usage</a> equal to the {@code usage} member of the corresponding element of {@link VkFramebufferAttachmentsCreateInfo}{@code ::pAttachmentImageInfos} used to create {@code framebuffer}</li>
 * <li>If {@code framebuffer} was created with a {@link VkFramebufferCreateInfo}{@code ::flags} value that included {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of the {@code pAttachments} member of a {@link VkRenderPassAttachmentBeginInfo} structure included in the {@code pNext} chain <b>must</b> be a {@code VkImageView} with a width equal to the {@code width} member of the corresponding element of {@link VkFramebufferAttachmentsCreateInfo}{@code ::pAttachmentImageInfos} used to create {@code framebuffer}</li>
 * <li>If {@code framebuffer} was created with a {@link VkFramebufferCreateInfo}{@code ::flags} value that included {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of the {@code pAttachments} member of a {@link VkRenderPassAttachmentBeginInfo} structure included in the {@code pNext} chain <b>must</b> be a {@code VkImageView} with a height equal to the {@code height} member of the corresponding element of {@link VkFramebufferAttachmentsCreateInfo}{@code ::pAttachmentImageInfos} used to create {@code framebuffer}</li>
 * <li>If {@code framebuffer} was created with a {@link VkFramebufferCreateInfo}{@code ::flags} value that included {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of the {@code pAttachments} member of a {@link VkRenderPassAttachmentBeginInfo} structure included in the {@code pNext} chain <b>must</b> be a {@code VkImageView} of an image created with a value of {@link VkImageViewCreateInfo}{@code ::subresourceRange.layerCount} equal to the {@code layerCount} member of the corresponding element of {@link VkFramebufferAttachmentsCreateInfo}{@code ::pAttachmentImageInfos} used to create {@code framebuffer}</li>
 * <li>If {@code framebuffer} was created with a {@link VkFramebufferCreateInfo}{@code ::flags} value that included {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of the {@code pAttachments} member of a {@link VkRenderPassAttachmentBeginInfo} structure included in the {@code pNext} chain <b>must</b> be a {@code VkImageView} of an image created with a value of {@link VkImageFormatListCreateInfo}{@code ::viewFormatCount} equal to the {@code viewFormatCount} member of the corresponding element of {@link VkFramebufferAttachmentsCreateInfo}{@code ::pAttachmentImageInfos} used to create {@code framebuffer}</li>
 * <li>If {@code framebuffer} was created with a {@link VkFramebufferCreateInfo}{@code ::flags} value that included {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of the {@code pAttachments} member of a {@link VkRenderPassAttachmentBeginInfo} structure included in the {@code pNext} chain <b>must</b> be a {@code VkImageView} of an image created with a set of elements in {@link VkImageFormatListCreateInfo}{@code ::pViewFormats} equal to the set of elements in the {@code pViewFormats} member of the corresponding element of {@link VkFramebufferAttachmentsCreateInfo}{@code ::pAttachmentImageInfos} used to create {@code framebuffer}</li>
 * <li>If {@code framebuffer} was created with a {@link VkFramebufferCreateInfo}{@code ::flags} value that included {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of the {@code pAttachments} member of a {@link VkRenderPassAttachmentBeginInfo} structure included in the {@code pNext} chain <b>must</b> be a {@code VkImageView} of an image created with a value of {@link VkImageViewCreateInfo}{@code ::format} equal to the corresponding value of {@link VkAttachmentDescription}{@code ::format} in {@code renderPass}</li>
 * <li>If {@code framebuffer} was created with a {@link VkFramebufferCreateInfo}{@code ::flags} value that included {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of the {@code pAttachments} member of a {@link VkRenderPassAttachmentBeginInfo} structure included in the {@code pNext} chain <b>must</b> be a {@code VkImageView} of an image created with a value of {@link VkImageCreateInfo}{@code ::samples} equal to the corresponding value of {@link VkAttachmentDescription}{@code ::samples} in {@code renderPass}</li>
 * <li>If the {@code pNext} chain includes {@link VkRenderPassTransformBeginInfoQCOM}, {@code renderArea.offset} <b>must</b> equal (0,0)</li>
 * <li>If the {@code pNext} chain includes {@link VkRenderPassTransformBeginInfoQCOM}, {@code renderArea.extent} transformed by {@link VkRenderPassTransformBeginInfoQCOM}{@code ::transform} <b>must</b> equal the {@code framebuffer} dimensions</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDeviceGroupRenderPassBeginInfo}, {@link VkRenderPassAttachmentBeginInfo}, {@link VkRenderPassSampleLocationsBeginInfoEXT}, or {@link VkRenderPassTransformBeginInfoQCOM}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
 * <li>{@code framebuffer} <b>must</b> be a valid {@code VkFramebuffer} handle</li>
 * <li>Both of {@code framebuffer}, and {@code renderPass} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkClearValue}, {@link VkRect2D}, {@link VK10#vkCmdBeginRenderPass CmdBeginRenderPass}, {@link VK12#vkCmdBeginRenderPass2 CmdBeginRenderPass2}, {@link KHRCreateRenderpass2#vkCmdBeginRenderPass2KHR CmdBeginRenderPass2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassBeginInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkRenderPass {@link #renderPass};
 *     VkFramebuffer {@link #framebuffer};
 *     {@link VkRect2D VkRect2D} {@link #renderArea};
 *     uint32_t {@link #clearValueCount};
 *     {@link VkClearValue VkClearValue} const * {@link #pClearValues};
 * }</code></pre>
 */
public class VkRenderPassBeginInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RENDERPASS,
        FRAMEBUFFER,
        RENDERAREA,
        CLEARVALUECOUNT,
        PCLEARVALUES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RENDERPASS = layout.offsetof(2);
        FRAMEBUFFER = layout.offsetof(3);
        RENDERAREA = layout.offsetof(4);
        CLEARVALUECOUNT = layout.offsetof(5);
        PCLEARVALUES = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkRenderPassBeginInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassBeginInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the render pass to begin an instance of. */
    @NativeType("VkRenderPass")
    public long renderPass() { return nrenderPass(address()); }
    /** the framebuffer containing the attachments that are used with the render pass. */
    @NativeType("VkFramebuffer")
    public long framebuffer() { return nframebuffer(address()); }
    /** the render area that is affected by the render pass instance, and is described in more detail below. */
    public VkRect2D renderArea() { return nrenderArea(address()); }
    /** the number of elements in {@code pClearValues}. */
    @NativeType("uint32_t")
    public int clearValueCount() { return nclearValueCount(address()); }
    /** a pointer to an array of {@code clearValueCount} {@link VkClearValue} structures containing clear values for each attachment, if the attachment uses a {@code loadOp} value of {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR} or if the attachment has a depth/stencil format and uses a {@code stencilLoadOp} value of {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}. The array is indexed by attachment number. Only elements corresponding to cleared attachments are used. Other elements of {@code pClearValues} are ignored. */
    @Nullable
    @NativeType("VkClearValue const *")
    public VkClearValue.Buffer pClearValues() { return npClearValues(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRenderPassBeginInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO} value to the {@link #sType} field. */
    public VkRenderPassBeginInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRenderPassBeginInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDeviceGroupRenderPassBeginInfo} value to the {@code pNext} chain. */
    public VkRenderPassBeginInfo pNext(VkDeviceGroupRenderPassBeginInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceGroupRenderPassBeginInfoKHR} value to the {@code pNext} chain. */
    public VkRenderPassBeginInfo pNext(VkDeviceGroupRenderPassBeginInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassAttachmentBeginInfo} value to the {@code pNext} chain. */
    public VkRenderPassBeginInfo pNext(VkRenderPassAttachmentBeginInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassAttachmentBeginInfoKHR} value to the {@code pNext} chain. */
    public VkRenderPassBeginInfo pNext(VkRenderPassAttachmentBeginInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassSampleLocationsBeginInfoEXT} value to the {@code pNext} chain. */
    public VkRenderPassBeginInfo pNext(VkRenderPassSampleLocationsBeginInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassTransformBeginInfoQCOM} value to the {@code pNext} chain. */
    public VkRenderPassBeginInfo pNext(VkRenderPassTransformBeginInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #renderPass} field. */
    public VkRenderPassBeginInfo renderPass(@NativeType("VkRenderPass") long value) { nrenderPass(address(), value); return this; }
    /** Sets the specified value to the {@link #framebuffer} field. */
    public VkRenderPassBeginInfo framebuffer(@NativeType("VkFramebuffer") long value) { nframebuffer(address(), value); return this; }
    /** Copies the specified {@link VkRect2D} to the {@link #renderArea} field. */
    public VkRenderPassBeginInfo renderArea(VkRect2D value) { nrenderArea(address(), value); return this; }
    /** Passes the {@link #renderArea} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkRenderPassBeginInfo renderArea(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(renderArea()); return this; }
    /** Sets the specified value to the {@link #clearValueCount} field. */
    public VkRenderPassBeginInfo clearValueCount(@NativeType("uint32_t") int value) { nclearValueCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkClearValue.Buffer} to the {@link #pClearValues} field. */
    public VkRenderPassBeginInfo pClearValues(@Nullable @NativeType("VkClearValue const *") VkClearValue.Buffer value) { npClearValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassBeginInfo set(
        int sType,
        long pNext,
        long renderPass,
        long framebuffer,
        VkRect2D renderArea,
        int clearValueCount,
        @Nullable VkClearValue.Buffer pClearValues
    ) {
        sType(sType);
        pNext(pNext);
        renderPass(renderPass);
        framebuffer(framebuffer);
        renderArea(renderArea);
        clearValueCount(clearValueCount);
        pClearValues(pClearValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassBeginInfo set(VkRenderPassBeginInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassBeginInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassBeginInfo malloc() {
        return wrap(VkRenderPassBeginInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRenderPassBeginInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassBeginInfo calloc() {
        return wrap(VkRenderPassBeginInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRenderPassBeginInfo} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRenderPassBeginInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassBeginInfo} instance for the specified memory address. */
    public static VkRenderPassBeginInfo create(long address) {
        return wrap(VkRenderPassBeginInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassBeginInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkRenderPassBeginInfo.class, address);
    }

    /**
     * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRenderPassBeginInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassBeginInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassBeginInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassBeginInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassBeginInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassBeginInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassBeginInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassBeginInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassBeginInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassBeginInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkRenderPassBeginInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassBeginInfo malloc(MemoryStack stack) {
        return wrap(VkRenderPassBeginInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRenderPassBeginInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassBeginInfo calloc(MemoryStack stack) {
        return wrap(VkRenderPassBeginInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassBeginInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassBeginInfo.PNEXT); }
    /** Unsafe version of {@link #renderPass}. */
    public static long nrenderPass(long struct) { return UNSAFE.getLong(null, struct + VkRenderPassBeginInfo.RENDERPASS); }
    /** Unsafe version of {@link #framebuffer}. */
    public static long nframebuffer(long struct) { return UNSAFE.getLong(null, struct + VkRenderPassBeginInfo.FRAMEBUFFER); }
    /** Unsafe version of {@link #renderArea}. */
    public static VkRect2D nrenderArea(long struct) { return VkRect2D.create(struct + VkRenderPassBeginInfo.RENDERAREA); }
    /** Unsafe version of {@link #clearValueCount}. */
    public static int nclearValueCount(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassBeginInfo.CLEARVALUECOUNT); }
    /** Unsafe version of {@link #pClearValues}. */
    @Nullable public static VkClearValue.Buffer npClearValues(long struct) { return VkClearValue.createSafe(memGetAddress(struct + VkRenderPassBeginInfo.PCLEARVALUES), nclearValueCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassBeginInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassBeginInfo.PNEXT, value); }
    /** Unsafe version of {@link #renderPass(long) renderPass}. */
    public static void nrenderPass(long struct, long value) { UNSAFE.putLong(null, struct + VkRenderPassBeginInfo.RENDERPASS, value); }
    /** Unsafe version of {@link #framebuffer(long) framebuffer}. */
    public static void nframebuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkRenderPassBeginInfo.FRAMEBUFFER, value); }
    /** Unsafe version of {@link #renderArea(VkRect2D) renderArea}. */
    public static void nrenderArea(long struct, VkRect2D value) { memCopy(value.address(), struct + VkRenderPassBeginInfo.RENDERAREA, VkRect2D.SIZEOF); }
    /** Sets the specified value to the {@code clearValueCount} field of the specified {@code struct}. */
    public static void nclearValueCount(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassBeginInfo.CLEARVALUECOUNT, value); }
    /** Unsafe version of {@link #pClearValues(VkClearValue.Buffer) pClearValues}. */
    public static void npClearValues(long struct, @Nullable VkClearValue.Buffer value) { memPutAddress(struct + VkRenderPassBeginInfo.PCLEARVALUES, memAddressSafe(value)); if (value != null) { nclearValueCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkRenderPassBeginInfo} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassBeginInfo, Buffer> implements NativeResource {

        private static final VkRenderPassBeginInfo ELEMENT_FACTORY = VkRenderPassBeginInfo.create(-1L);

        /**
         * Creates a new {@code VkRenderPassBeginInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassBeginInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderPassBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRenderPassBeginInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassBeginInfo.nsType(address()); }
        /** @return the value of the {@link VkRenderPassBeginInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassBeginInfo.npNext(address()); }
        /** @return the value of the {@link VkRenderPassBeginInfo#renderPass} field. */
        @NativeType("VkRenderPass")
        public long renderPass() { return VkRenderPassBeginInfo.nrenderPass(address()); }
        /** @return the value of the {@link VkRenderPassBeginInfo#framebuffer} field. */
        @NativeType("VkFramebuffer")
        public long framebuffer() { return VkRenderPassBeginInfo.nframebuffer(address()); }
        /** @return a {@link VkRect2D} view of the {@link VkRenderPassBeginInfo#renderArea} field. */
        public VkRect2D renderArea() { return VkRenderPassBeginInfo.nrenderArea(address()); }
        /** @return the value of the {@link VkRenderPassBeginInfo#clearValueCount} field. */
        @NativeType("uint32_t")
        public int clearValueCount() { return VkRenderPassBeginInfo.nclearValueCount(address()); }
        /** @return a {@link VkClearValue.Buffer} view of the struct array pointed to by the {@link VkRenderPassBeginInfo#pClearValues} field. */
        @Nullable
        @NativeType("VkClearValue const *")
        public VkClearValue.Buffer pClearValues() { return VkRenderPassBeginInfo.npClearValues(address()); }

        /** Sets the specified value to the {@link VkRenderPassBeginInfo#sType} field. */
        public VkRenderPassBeginInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassBeginInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO} value to the {@link VkRenderPassBeginInfo#sType} field. */
        public VkRenderPassBeginInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO); }
        /** Sets the specified value to the {@link VkRenderPassBeginInfo#pNext} field. */
        public VkRenderPassBeginInfo.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassBeginInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDeviceGroupRenderPassBeginInfo} value to the {@code pNext} chain. */
        public VkRenderPassBeginInfo.Buffer pNext(VkDeviceGroupRenderPassBeginInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceGroupRenderPassBeginInfoKHR} value to the {@code pNext} chain. */
        public VkRenderPassBeginInfo.Buffer pNext(VkDeviceGroupRenderPassBeginInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassAttachmentBeginInfo} value to the {@code pNext} chain. */
        public VkRenderPassBeginInfo.Buffer pNext(VkRenderPassAttachmentBeginInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassAttachmentBeginInfoKHR} value to the {@code pNext} chain. */
        public VkRenderPassBeginInfo.Buffer pNext(VkRenderPassAttachmentBeginInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassSampleLocationsBeginInfoEXT} value to the {@code pNext} chain. */
        public VkRenderPassBeginInfo.Buffer pNext(VkRenderPassSampleLocationsBeginInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassTransformBeginInfoQCOM} value to the {@code pNext} chain. */
        public VkRenderPassBeginInfo.Buffer pNext(VkRenderPassTransformBeginInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkRenderPassBeginInfo#renderPass} field. */
        public VkRenderPassBeginInfo.Buffer renderPass(@NativeType("VkRenderPass") long value) { VkRenderPassBeginInfo.nrenderPass(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderPassBeginInfo#framebuffer} field. */
        public VkRenderPassBeginInfo.Buffer framebuffer(@NativeType("VkFramebuffer") long value) { VkRenderPassBeginInfo.nframebuffer(address(), value); return this; }
        /** Copies the specified {@link VkRect2D} to the {@link VkRenderPassBeginInfo#renderArea} field. */
        public VkRenderPassBeginInfo.Buffer renderArea(VkRect2D value) { VkRenderPassBeginInfo.nrenderArea(address(), value); return this; }
        /** Passes the {@link VkRenderPassBeginInfo#renderArea} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkRenderPassBeginInfo.Buffer renderArea(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(renderArea()); return this; }
        /** Sets the specified value to the {@link VkRenderPassBeginInfo#clearValueCount} field. */
        public VkRenderPassBeginInfo.Buffer clearValueCount(@NativeType("uint32_t") int value) { VkRenderPassBeginInfo.nclearValueCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkClearValue.Buffer} to the {@link VkRenderPassBeginInfo#pClearValues} field. */
        public VkRenderPassBeginInfo.Buffer pClearValues(@Nullable @NativeType("VkClearValue const *") VkClearValue.Buffer value) { VkRenderPassBeginInfo.npClearValues(address(), value); return this; }

    }

}