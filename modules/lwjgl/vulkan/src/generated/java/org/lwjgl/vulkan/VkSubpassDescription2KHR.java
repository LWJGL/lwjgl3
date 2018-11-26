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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a subpass description.
 * 
 * <h5>Description</h5>
 * 
 * <p>Parameters defined by this structure with the same name as those in {@link VkSubpassDescription} have the identical effect to those parameters.</p>
 * 
 * <p>{@code viewMask} has the same effect for the described subpass as {@link VkRenderPassMultiviewCreateInfo}{@code ::pViewMasks} has on each corresponding subpass.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code pipelineBindPoint} <b>must</b> be {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
 * <li>{@code colorAttachmentCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxColorAttachments}</li>
 * <li>If the first use of an attachment in this render pass is as an input attachment, and the attachment is not also used as a color or depth/stencil attachment in the same subpass, then {@code loadOp} <b>must</b> not be {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}</li>
 * <li>If {@code pResolveAttachments} is not {@code NULL}, for each resolve attachment that does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, the corresponding color attachment <b>must</b> not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If {@code pResolveAttachments} is not {@code NULL}, the sample count of each element of {@code pColorAttachments} <b>must</b> be anything other than {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>Any given element of {@code pResolveAttachments} <b>must</b> have a sample count of {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>Any given element of {@code pResolveAttachments} <b>must</b> have the same {@code VkFormat} as its corresponding color attachment</li>
 * <li>All attachments in {@code pColorAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have the same sample count</li>
 * <li>If the {@code VK_AMD_mixed_attachment_samples} extension is enabled, all attachments in {@code pColorAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have a sample count that is smaller than or equal to the sample count of {@code pDepthStencilAttachment} if it is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If neither the {@code VK_AMD_mixed_attachment_samples} nor the {@code VK_NV_framebuffer_mixed_samples} extensions are enabled, and if {@code pDepthStencilAttachment} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and any attachments in {@code pColorAttachments} are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, they <b>must</b> have the same sample count</li>
 * <li>The {@code attachment} member of any element of {@code pPreserveAttachments} <b>must</b> not be {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>Any given element of {@code pPreserveAttachments} <b>must</b> not also be an element of any other member of the subpass description</li>
 * <li>If any attachment is used by more than one {@link VkAttachmentReference} member, then each use <b>must</b> use the same {@code layout}</li>
 * <li>If {@code flags} includes {@link NVXMultiviewPerViewAttributes#VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX}, it <b>must</b> also include {@link NVXMultiviewPerViewAttributes#VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX}.</li>
 * <li>The {@code aspectMask} member of any element of {@code pInputAttachments} <b>must</b> be a valid combination of {@code VkImageAspectFlagBits}</li>
 * <li>The {@code aspectMask} member of any element of {@code pInputAttachments} <b>must</b> not be 0</li>
 * <li>The {@code aspectMask} member of each element of {@code pInputAttachments} <b>must</b> not include {@link VK10#VK_IMAGE_ASPECT_METADATA_BIT IMAGE_ASPECT_METADATA_BIT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRCreateRenderpass2#VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2_KHR STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2_KHR}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkSubpassDescriptionFlagBits} values</li>
 * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
 * <li>If {@code inputAttachmentCount} is not 0, {@code pInputAttachments} <b>must</b> be a valid pointer to an array of {@code inputAttachmentCount} valid {@link VkAttachmentReference2KHR} structures</li>
 * <li>If {@code colorAttachmentCount} is not 0, {@code pColorAttachments} <b>must</b> be a valid pointer to an array of {@code colorAttachmentCount} valid {@link VkAttachmentReference2KHR} structures</li>
 * <li>If {@code colorAttachmentCount} is not 0, and {@code pResolveAttachments} is not {@code NULL}, {@code pResolveAttachments} <b>must</b> be a valid pointer to an array of {@code colorAttachmentCount} valid {@link VkAttachmentReference2KHR} structures</li>
 * <li>If {@code pDepthStencilAttachment} is not {@code NULL}, {@code pDepthStencilAttachment} <b>must</b> be a valid pointer to a valid {@link VkAttachmentReference2KHR} structure</li>
 * <li>If {@code preserveAttachmentCount} is not 0, {@code pPreserveAttachments} <b>must</b> be a valid pointer to an array of {@code preserveAttachmentCount} {@code uint32_t} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAttachmentReference2KHR}, {@link VkRenderPassCreateInfo2KHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkSubpassDescriptionFlagBits} specifying usage of the subpass.</li>
 * <li>{@code pipelineBindPoint} &ndash; a {@code VkPipelineBindPoint} value specifying the pipeline type supported for this subpass.</li>
 * <li>{@code viewMask} &ndash; a bitfield of view indices describing which views rendering is broadcast to in this subpass, when multiview is enabled.</li>
 * <li>{@code inputAttachmentCount} &ndash; the number of input attachments.</li>
 * <li>{@code pInputAttachments} &ndash; an array of {@link VkAttachmentReference2KHR} structures defining the input attachments for this subpass and their layouts.</li>
 * <li>{@code colorAttachmentCount} &ndash; the number of color attachments.</li>
 * <li>{@code pColorAttachments} &ndash; an array of {@link VkAttachmentReference2KHR} structures defining the color attachments for this subpass and their layouts.</li>
 * <li>{@code pResolveAttachments} &ndash; an optional array of {@code colorAttachmentCount} {@link VkAttachmentReference2KHR} structures defining the resolve attachments for this subpass and their layouts.</li>
 * <li>{@code pDepthStencilAttachment} &ndash; a pointer to a {@link VkAttachmentReference2KHR} specifying the depth/stencil attachment for this subpass and its layout.</li>
 * <li>{@code preserveAttachmentCount} &ndash; the number of preserved attachments.</li>
 * <li>{@code pPreserveAttachments} &ndash; an array of {@code preserveAttachmentCount} render pass attachment indices identifying attachments that are not used by this subpass, but whose contents <b>must</b> be preserved throughout the subpass.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubpassDescription2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSubpassDescriptionFlags flags;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     uint32_t viewMask;
 *     uint32_t inputAttachmentCount;
 *     {@link VkAttachmentReference2KHR VkAttachmentReference2KHR const} * pInputAttachments;
 *     uint32_t colorAttachmentCount;
 *     {@link VkAttachmentReference2KHR VkAttachmentReference2KHR const} * pColorAttachments;
 *     {@link VkAttachmentReference2KHR VkAttachmentReference2KHR const} * pResolveAttachments;
 *     {@link VkAttachmentReference2KHR VkAttachmentReference2KHR const} * pDepthStencilAttachment;
 *     uint32_t preserveAttachmentCount;
 *     uint32_t const * pPreserveAttachments;
 * }</code></pre>
 */
public class VkSubpassDescription2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PIPELINEBINDPOINT,
        VIEWMASK,
        INPUTATTACHMENTCOUNT,
        PINPUTATTACHMENTS,
        COLORATTACHMENTCOUNT,
        PCOLORATTACHMENTS,
        PRESOLVEATTACHMENTS,
        PDEPTHSTENCILATTACHMENT,
        PRESERVEATTACHMENTCOUNT,
        PPRESERVEATTACHMENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PIPELINEBINDPOINT = layout.offsetof(3);
        VIEWMASK = layout.offsetof(4);
        INPUTATTACHMENTCOUNT = layout.offsetof(5);
        PINPUTATTACHMENTS = layout.offsetof(6);
        COLORATTACHMENTCOUNT = layout.offsetof(7);
        PCOLORATTACHMENTS = layout.offsetof(8);
        PRESOLVEATTACHMENTS = layout.offsetof(9);
        PDEPTHSTENCILATTACHMENT = layout.offsetof(10);
        PRESERVEATTACHMENTCOUNT = layout.offsetof(11);
        PPRESERVEATTACHMENTS = layout.offsetof(12);
    }

    /**
     * Creates a {@link VkSubpassDescription2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassDescription2KHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkSubpassDescriptionFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code pipelineBindPoint} field. */
    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() { return npipelineBindPoint(address()); }
    /** Returns the value of the {@code viewMask} field. */
    @NativeType("uint32_t")
    public int viewMask() { return nviewMask(address()); }
    /** Returns the value of the {@code inputAttachmentCount} field. */
    @NativeType("uint32_t")
    public int inputAttachmentCount() { return ninputAttachmentCount(address()); }
    /** Returns a {@link VkAttachmentReference2KHR.Buffer} view of the struct array pointed to by the {@code pInputAttachments} field. */
    @Nullable
    @NativeType("VkAttachmentReference2KHR const *")
    public VkAttachmentReference2KHR.Buffer pInputAttachments() { return npInputAttachments(address()); }
    /** Returns the value of the {@code colorAttachmentCount} field. */
    @NativeType("uint32_t")
    public int colorAttachmentCount() { return ncolorAttachmentCount(address()); }
    /** Returns a {@link VkAttachmentReference2KHR.Buffer} view of the struct array pointed to by the {@code pColorAttachments} field. */
    @Nullable
    @NativeType("VkAttachmentReference2KHR const *")
    public VkAttachmentReference2KHR.Buffer pColorAttachments() { return npColorAttachments(address()); }
    /** Returns a {@link VkAttachmentReference2KHR.Buffer} view of the struct array pointed to by the {@code pResolveAttachments} field. */
    @Nullable
    @NativeType("VkAttachmentReference2KHR const *")
    public VkAttachmentReference2KHR.Buffer pResolveAttachments() { return npResolveAttachments(address()); }
    /** Returns a {@link VkAttachmentReference2KHR} view of the struct pointed to by the {@code pDepthStencilAttachment} field. */
    @Nullable
    @NativeType("VkAttachmentReference2KHR const *")
    public VkAttachmentReference2KHR pDepthStencilAttachment() { return npDepthStencilAttachment(address()); }
    /** Returns the value of the {@code preserveAttachmentCount} field. */
    @NativeType("uint32_t")
    public int preserveAttachmentCount() { return npreserveAttachmentCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pPreserveAttachments} field. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pPreserveAttachments() { return npPreserveAttachments(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSubpassDescription2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSubpassDescription2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkSubpassDescription2KHR flags(@NativeType("VkSubpassDescriptionFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineBindPoint} field. */
    public VkSubpassDescription2KHR pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the specified value to the {@code viewMask} field. */
    public VkSubpassDescription2KHR viewMask(@NativeType("uint32_t") int value) { nviewMask(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2KHR.Buffer} to the {@code pInputAttachments} field. */
    public VkSubpassDescription2KHR pInputAttachments(@Nullable @NativeType("VkAttachmentReference2KHR const *") VkAttachmentReference2KHR.Buffer value) { npInputAttachments(address(), value); return this; }
    /** Sets the specified value to the {@code colorAttachmentCount} field. */
    public VkSubpassDescription2KHR colorAttachmentCount(@NativeType("uint32_t") int value) { ncolorAttachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2KHR.Buffer} to the {@code pColorAttachments} field. */
    public VkSubpassDescription2KHR pColorAttachments(@Nullable @NativeType("VkAttachmentReference2KHR const *") VkAttachmentReference2KHR.Buffer value) { npColorAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2KHR.Buffer} to the {@code pResolveAttachments} field. */
    public VkSubpassDescription2KHR pResolveAttachments(@Nullable @NativeType("VkAttachmentReference2KHR const *") VkAttachmentReference2KHR.Buffer value) { npResolveAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2KHR} to the {@code pDepthStencilAttachment} field. */
    public VkSubpassDescription2KHR pDepthStencilAttachment(@Nullable @NativeType("VkAttachmentReference2KHR const *") VkAttachmentReference2KHR value) { npDepthStencilAttachment(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pPreserveAttachments} field. */
    public VkSubpassDescription2KHR pPreserveAttachments(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npPreserveAttachments(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassDescription2KHR set(
        int sType,
        long pNext,
        int flags,
        int pipelineBindPoint,
        int viewMask,
        @Nullable VkAttachmentReference2KHR.Buffer pInputAttachments,
        int colorAttachmentCount,
        @Nullable VkAttachmentReference2KHR.Buffer pColorAttachments,
        @Nullable VkAttachmentReference2KHR.Buffer pResolveAttachments,
        @Nullable VkAttachmentReference2KHR pDepthStencilAttachment,
        @Nullable IntBuffer pPreserveAttachments
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pipelineBindPoint(pipelineBindPoint);
        viewMask(viewMask);
        pInputAttachments(pInputAttachments);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachments(pColorAttachments);
        pResolveAttachments(pResolveAttachments);
        pDepthStencilAttachment(pDepthStencilAttachment);
        pPreserveAttachments(pPreserveAttachments);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassDescription2KHR set(VkSubpassDescription2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkSubpassDescription2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassDescription2KHR malloc() {
        return wrap(VkSubpassDescription2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkSubpassDescription2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassDescription2KHR calloc() {
        return wrap(VkSubpassDescription2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkSubpassDescription2KHR} instance allocated with {@link BufferUtils}. */
    public static VkSubpassDescription2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubpassDescription2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@link VkSubpassDescription2KHR} instance for the specified memory address. */
    public static VkSubpassDescription2KHR create(long address) {
        return wrap(VkSubpassDescription2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDescription2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSubpassDescription2KHR.class, address);
    }

    /**
     * Returns a new {@link VkSubpassDescription2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubpassDescription2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDescription2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkSubpassDescription2KHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSubpassDescription2KHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkSubpassDescription2KHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSubpassDescription2KHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkSubpassDescription2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescription2KHR mallocStack(MemoryStack stack) {
        return wrap(VkSubpassDescription2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassDescription2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescription2KHR callocStack(MemoryStack stack) {
        return wrap(VkSubpassDescription2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassDescription2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2KHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSubpassDescription2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2KHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSubpassDescription2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2KHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2KHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescription2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassDescription2KHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescription2KHR.FLAGS); }
    /** Unsafe version of {@link #pipelineBindPoint}. */
    public static int npipelineBindPoint(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescription2KHR.PIPELINEBINDPOINT); }
    /** Unsafe version of {@link #viewMask}. */
    public static int nviewMask(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescription2KHR.VIEWMASK); }
    /** Unsafe version of {@link #inputAttachmentCount}. */
    public static int ninputAttachmentCount(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescription2KHR.INPUTATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pInputAttachments}. */
    @Nullable public static VkAttachmentReference2KHR.Buffer npInputAttachments(long struct) { return VkAttachmentReference2KHR.createSafe(memGetAddress(struct + VkSubpassDescription2KHR.PINPUTATTACHMENTS), ninputAttachmentCount(struct)); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescription2KHR.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachments}. */
    @Nullable public static VkAttachmentReference2KHR.Buffer npColorAttachments(long struct) { return VkAttachmentReference2KHR.createSafe(memGetAddress(struct + VkSubpassDescription2KHR.PCOLORATTACHMENTS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #pResolveAttachments}. */
    @Nullable public static VkAttachmentReference2KHR.Buffer npResolveAttachments(long struct) { return VkAttachmentReference2KHR.createSafe(memGetAddress(struct + VkSubpassDescription2KHR.PRESOLVEATTACHMENTS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #pDepthStencilAttachment}. */
    @Nullable public static VkAttachmentReference2KHR npDepthStencilAttachment(long struct) { return VkAttachmentReference2KHR.createSafe(memGetAddress(struct + VkSubpassDescription2KHR.PDEPTHSTENCILATTACHMENT)); }
    /** Unsafe version of {@link #preserveAttachmentCount}. */
    public static int npreserveAttachmentCount(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescription2KHR.PRESERVEATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pPreserveAttachments() pPreserveAttachments}. */
    @Nullable public static IntBuffer npPreserveAttachments(long struct) { return memIntBufferSafe(memGetAddress(struct + VkSubpassDescription2KHR.PPRESERVEATTACHMENTS), npreserveAttachmentCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescription2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassDescription2KHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescription2KHR.FLAGS, value); }
    /** Unsafe version of {@link #pipelineBindPoint(int) pipelineBindPoint}. */
    public static void npipelineBindPoint(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescription2KHR.PIPELINEBINDPOINT, value); }
    /** Unsafe version of {@link #viewMask(int) viewMask}. */
    public static void nviewMask(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescription2KHR.VIEWMASK, value); }
    /** Sets the specified value to the {@code inputAttachmentCount} field of the specified {@code struct}. */
    public static void ninputAttachmentCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescription2KHR.INPUTATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pInputAttachments(VkAttachmentReference2KHR.Buffer) pInputAttachments}. */
    public static void npInputAttachments(long struct, @Nullable VkAttachmentReference2KHR.Buffer value) { memPutAddress(struct + VkSubpassDescription2KHR.PINPUTATTACHMENTS, memAddressSafe(value)); ninputAttachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescription2KHR.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachments(VkAttachmentReference2KHR.Buffer) pColorAttachments}. */
    public static void npColorAttachments(long struct, @Nullable VkAttachmentReference2KHR.Buffer value) { memPutAddress(struct + VkSubpassDescription2KHR.PCOLORATTACHMENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pResolveAttachments(VkAttachmentReference2KHR.Buffer) pResolveAttachments}. */
    public static void npResolveAttachments(long struct, @Nullable VkAttachmentReference2KHR.Buffer value) { memPutAddress(struct + VkSubpassDescription2KHR.PRESOLVEATTACHMENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pDepthStencilAttachment(VkAttachmentReference2KHR) pDepthStencilAttachment}. */
    public static void npDepthStencilAttachment(long struct, @Nullable VkAttachmentReference2KHR value) { memPutAddress(struct + VkSubpassDescription2KHR.PDEPTHSTENCILATTACHMENT, memAddressSafe(value)); }
    /** Sets the specified value to the {@code preserveAttachmentCount} field of the specified {@code struct}. */
    public static void npreserveAttachmentCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescription2KHR.PRESERVEATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pPreserveAttachments(IntBuffer) pPreserveAttachments}. */
    public static void npPreserveAttachments(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkSubpassDescription2KHR.PPRESERVEATTACHMENTS, memAddressSafe(value)); npreserveAttachmentCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ninputAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription2KHR.PINPUTATTACHMENTS));
        }
        if (ncolorAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription2KHR.PCOLORATTACHMENTS));
        }
        if (npreserveAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription2KHR.PPRESERVEATTACHMENTS));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkSubpassDescription2KHR} structs. */
    public static class Buffer extends StructBuffer<VkSubpassDescription2KHR, Buffer> implements NativeResource {

        private static final VkSubpassDescription2KHR ELEMENT_FACTORY = VkSubpassDescription2KHR.create(-1L);

        /**
         * Creates a new {@link VkSubpassDescription2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassDescription2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSubpassDescription2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassDescription2KHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubpassDescription2KHR.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkSubpassDescriptionFlags")
        public int flags() { return VkSubpassDescription2KHR.nflags(address()); }
        /** Returns the value of the {@code pipelineBindPoint} field. */
        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() { return VkSubpassDescription2KHR.npipelineBindPoint(address()); }
        /** Returns the value of the {@code viewMask} field. */
        @NativeType("uint32_t")
        public int viewMask() { return VkSubpassDescription2KHR.nviewMask(address()); }
        /** Returns the value of the {@code inputAttachmentCount} field. */
        @NativeType("uint32_t")
        public int inputAttachmentCount() { return VkSubpassDescription2KHR.ninputAttachmentCount(address()); }
        /** Returns a {@link VkAttachmentReference2KHR.Buffer} view of the struct array pointed to by the {@code pInputAttachments} field. */
        @Nullable
        @NativeType("VkAttachmentReference2KHR const *")
        public VkAttachmentReference2KHR.Buffer pInputAttachments() { return VkSubpassDescription2KHR.npInputAttachments(address()); }
        /** Returns the value of the {@code colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkSubpassDescription2KHR.ncolorAttachmentCount(address()); }
        /** Returns a {@link VkAttachmentReference2KHR.Buffer} view of the struct array pointed to by the {@code pColorAttachments} field. */
        @Nullable
        @NativeType("VkAttachmentReference2KHR const *")
        public VkAttachmentReference2KHR.Buffer pColorAttachments() { return VkSubpassDescription2KHR.npColorAttachments(address()); }
        /** Returns a {@link VkAttachmentReference2KHR.Buffer} view of the struct array pointed to by the {@code pResolveAttachments} field. */
        @Nullable
        @NativeType("VkAttachmentReference2KHR const *")
        public VkAttachmentReference2KHR.Buffer pResolveAttachments() { return VkSubpassDescription2KHR.npResolveAttachments(address()); }
        /** Returns a {@link VkAttachmentReference2KHR} view of the struct pointed to by the {@code pDepthStencilAttachment} field. */
        @Nullable
        @NativeType("VkAttachmentReference2KHR const *")
        public VkAttachmentReference2KHR pDepthStencilAttachment() { return VkSubpassDescription2KHR.npDepthStencilAttachment(address()); }
        /** Returns the value of the {@code preserveAttachmentCount} field. */
        @NativeType("uint32_t")
        public int preserveAttachmentCount() { return VkSubpassDescription2KHR.npreserveAttachmentCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pPreserveAttachments} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pPreserveAttachments() { return VkSubpassDescription2KHR.npPreserveAttachments(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSubpassDescription2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassDescription2KHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSubpassDescription2KHR.Buffer pNext(@NativeType("void const *") long value) { VkSubpassDescription2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkSubpassDescription2KHR.Buffer flags(@NativeType("VkSubpassDescriptionFlags") int value) { VkSubpassDescription2KHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineBindPoint} field. */
        public VkSubpassDescription2KHR.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkSubpassDescription2KHR.npipelineBindPoint(address(), value); return this; }
        /** Sets the specified value to the {@code viewMask} field. */
        public VkSubpassDescription2KHR.Buffer viewMask(@NativeType("uint32_t") int value) { VkSubpassDescription2KHR.nviewMask(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2KHR.Buffer} to the {@code pInputAttachments} field. */
        public VkSubpassDescription2KHR.Buffer pInputAttachments(@Nullable @NativeType("VkAttachmentReference2KHR const *") VkAttachmentReference2KHR.Buffer value) { VkSubpassDescription2KHR.npInputAttachments(address(), value); return this; }
        /** Sets the specified value to the {@code colorAttachmentCount} field. */
        public VkSubpassDescription2KHR.Buffer colorAttachmentCount(@NativeType("uint32_t") int value) { VkSubpassDescription2KHR.ncolorAttachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2KHR.Buffer} to the {@code pColorAttachments} field. */
        public VkSubpassDescription2KHR.Buffer pColorAttachments(@Nullable @NativeType("VkAttachmentReference2KHR const *") VkAttachmentReference2KHR.Buffer value) { VkSubpassDescription2KHR.npColorAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2KHR.Buffer} to the {@code pResolveAttachments} field. */
        public VkSubpassDescription2KHR.Buffer pResolveAttachments(@Nullable @NativeType("VkAttachmentReference2KHR const *") VkAttachmentReference2KHR.Buffer value) { VkSubpassDescription2KHR.npResolveAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2KHR} to the {@code pDepthStencilAttachment} field. */
        public VkSubpassDescription2KHR.Buffer pDepthStencilAttachment(@Nullable @NativeType("VkAttachmentReference2KHR const *") VkAttachmentReference2KHR value) { VkSubpassDescription2KHR.npDepthStencilAttachment(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pPreserveAttachments} field. */
        public VkSubpassDescription2KHR.Buffer pPreserveAttachments(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkSubpassDescription2KHR.npPreserveAttachments(address(), value); return this; }

    }

}