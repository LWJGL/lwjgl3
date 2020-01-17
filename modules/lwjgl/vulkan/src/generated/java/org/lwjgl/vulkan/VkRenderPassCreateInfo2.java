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
 * Structure specifying parameters of a newly created render pass.
 * 
 * <h5>Description</h5>
 * 
 * <p>Parameters defined by this structure with the same name as those in {@link VkRenderPassCreateInfo} have the identical effect to those parameters; the child structures are variants of those used in {@link VkRenderPassCreateInfo} which add {@code sType} and {@code pNext} parameters, allowing them to be extended.</p>
 * 
 * <p>If the {@link VkSubpassDescription2}{@code ::viewMask} member of any element of {@code pSubpasses} is not zero, <em>multiview</em> functionality is considered to be enabled for this render pass.</p>
 * 
 * <p>{@code correlatedViewMaskCount} and {@code pCorrelatedViewMasks} have the same effect as {@link VkRenderPassMultiviewCreateInfo}{@code ::correlationMaskCount} and {@link VkRenderPassMultiviewCreateInfo}{@code ::pCorrelationMasks}, respectively.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If any two subpasses operate on attachments with overlapping ranges of the same {@code VkDeviceMemory} object, and at least one subpass writes to that area of {@code VkDeviceMemory}, a subpass dependency <b>must</b> be included (either directly or via some intermediate subpasses) between them</li>
 * <li>If the {@code attachment} member of any element of {@code pInputAttachments}, {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment}, or the attachment indexed by any element of {@code pPreserveAttachments} in any given element of {@code pSubpasses} is bound to a range of a {@code VkDeviceMemory} object that overlaps with any other attachment in any subpass (including the same subpass), the {@link VkAttachmentDescription2} structures describing them <b>must</b> include {@link VK10#VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT} in {@code flags}</li>
 * <li>If the {@code attachment} member of any element of {@code pInputAttachments}, {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment}, or any element of {@code pPreserveAttachments} in any given element of {@code pSubpasses} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, it <b>must</b> be less than {@code attachmentCount}</li>
 * <li>For any member of {@code pAttachments} with a {@code loadOp} equal to {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}, the first use of that attachment <b>must</b> not specify a {@code layout} equal to {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}</li>
 * <li>For any member of {@code pAttachments} with a {@code stencilLoadOp} equal to {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}, the first use of that attachment <b>must</b> not specify a {@code layout} equal to {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}.</li>
 * <li>For any element of {@code pDependencies}, if the {@code srcSubpass} is not {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}, all stage flags included in the {@code srcStageMask} member of that dependency <b>must</b> be a pipeline stage supported by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-pipeline-stages-types">pipeline</a> identified by the {@code pipelineBindPoint} member of the source subpass</li>
 * <li>For any element of {@code pDependencies}, if the {@code dstSubpass} is not {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}, all stage flags included in the {@code dstStageMask} member of that dependency <b>must</b> be a pipeline stage supported by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-pipeline-stages-types">pipeline</a> identified by the {@code pipelineBindPoint} member of the destination subpass</li>
 * <li>The set of bits included in any element of {@code pCorrelatedViewMasks} <b>must</b> not overlap with the set of bits included in any other element of {@code pCorrelatedViewMasks}</li>
 * <li>If the {@link VkSubpassDescription2}{@code ::viewMask} member of all elements of {@code pSubpasses} is 0, {@code correlatedViewMaskCount} <b>must</b> be 0</li>
 * <li>The {@link VkSubpassDescription2}{@code ::viewMask} member of all elements of {@code pSubpasses} <b>must</b> either all be 0, or all not be 0</li>
 * <li>If the {@link VkSubpassDescription2}{@code ::viewMask} member of all elements of {@code pSubpasses} is 0, the {@code dependencyFlags} member of any element of {@code pDependencies} <b>must</b> not include {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT}</li>
 * <li>For any element of {@code pDependencies} where its {@code srcSubpass} member equals its {@code dstSubpass} member, if the {@code viewMask} member of the corresponding element of {@code pSubpasses} includes more than one bit, its {@code dependencyFlags} member <b>must</b> include {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT}</li>
 * <li>The {@code viewMask} member <b>must</b> not have a bit set at an index greater than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxFramebufferLayers}</li>
 * <li>If the {@code attachment} member of any element of the {@code pInputAttachments} member of any element of {@code pSubpasses} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, the {@code aspectMask} member of that element of {@code pInputAttachments} <b>must</b> only include aspects that are present in images of the format specified by the element of {@code pAttachments} specified by {@code attachment}</li>
 * <li>The {@code srcSubpass} member of each element of {@code pDependencies} <b>must</b> be less than {@code subpassCount}</li>
 * <li>The {@code dstSubpass} member of each element of {@code pDependencies} <b>must</b> be less than {@code subpassCount}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2 STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkRenderPassFragmentDensityMapCreateInfoEXT}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>If {@code attachmentCount} is not 0, {@code pAttachments} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid {@link VkAttachmentDescription2} structures</li>
 * <li>{@code pSubpasses} <b>must</b> be a valid pointer to an array of {@code subpassCount} valid {@link VkSubpassDescription2} structures</li>
 * <li>If {@code dependencyCount} is not 0, {@code pDependencies} <b>must</b> be a valid pointer to an array of {@code dependencyCount} valid {@link VkSubpassDependency2} structures</li>
 * <li>If {@code correlatedViewMaskCount} is not 0, {@code pCorrelatedViewMasks} <b>must</b> be a valid pointer to an array of {@code correlatedViewMaskCount} {@code uint32_t} values</li>
 * <li>{@code subpassCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAttachmentDescription2}, {@link VkSubpassDependency2}, {@link VkSubpassDescription2}, {@link VK12#vkCreateRenderPass2 CreateRenderPass2}, {@link KHRCreateRenderpass2#vkCreateRenderPass2KHR CreateRenderPass2KHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code attachmentCount} &ndash; the number of attachments used by this render pass.</li>
 * <li>{@code pAttachments} &ndash; a pointer to an array of {@code attachmentCount} {@link VkAttachmentDescription2} structures describing the attachments used by the render pass.</li>
 * <li>{@code subpassCount} &ndash; the number of subpasses to create.</li>
 * <li>{@code pSubpasses} &ndash; a pointer to an array of {@code subpassCount} {@link VkSubpassDescription2} structures describing each subpass.</li>
 * <li>{@code dependencyCount} &ndash; the number of dependencies between pairs of subpasses.</li>
 * <li>{@code pDependencies} &ndash; a pointer to an array of {@code dependencyCount} {@link VkSubpassDependency} structures describing dependencies between pairs of subpasses.</li>
 * <li>{@code correlatedViewMaskCount} &ndash; the number of correlation masks.</li>
 * <li>{@code pCorrelatedViewMasks} &ndash; a pointer to an array of view masks indicating sets of views that <b>may</b> be more efficient to render concurrently.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassCreateInfo2 {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkRenderPassCreateFlags flags;
 *     uint32_t attachmentCount;
 *     {@link VkAttachmentDescription2 VkAttachmentDescription2} const * pAttachments;
 *     uint32_t subpassCount;
 *     {@link VkSubpassDescription2 VkSubpassDescription2} const * pSubpasses;
 *     uint32_t dependencyCount;
 *     {@link VkSubpassDependency2 VkSubpassDependency2} const * pDependencies;
 *     uint32_t correlatedViewMaskCount;
 *     uint32_t const * pCorrelatedViewMasks;
 * }</code></pre>
 */
public class VkRenderPassCreateInfo2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        ATTACHMENTCOUNT,
        PATTACHMENTS,
        SUBPASSCOUNT,
        PSUBPASSES,
        DEPENDENCYCOUNT,
        PDEPENDENCIES,
        CORRELATEDVIEWMASKCOUNT,
        PCORRELATEDVIEWMASKS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        ATTACHMENTCOUNT = layout.offsetof(3);
        PATTACHMENTS = layout.offsetof(4);
        SUBPASSCOUNT = layout.offsetof(5);
        PSUBPASSES = layout.offsetof(6);
        DEPENDENCYCOUNT = layout.offsetof(7);
        PDEPENDENCIES = layout.offsetof(8);
        CORRELATEDVIEWMASKCOUNT = layout.offsetof(9);
        PCORRELATEDVIEWMASKS = layout.offsetof(10);
    }

    /**
     * Creates a {@code VkRenderPassCreateInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassCreateInfo2(ByteBuffer container) {
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
    @NativeType("VkRenderPassCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code attachmentCount} field. */
    @NativeType("uint32_t")
    public int attachmentCount() { return nattachmentCount(address()); }
    /** Returns a {@link VkAttachmentDescription2.Buffer} view of the struct array pointed to by the {@code pAttachments} field. */
    @Nullable
    @NativeType("VkAttachmentDescription2 const *")
    public VkAttachmentDescription2.Buffer pAttachments() { return npAttachments(address()); }
    /** Returns the value of the {@code subpassCount} field. */
    @NativeType("uint32_t")
    public int subpassCount() { return nsubpassCount(address()); }
    /** Returns a {@link VkSubpassDescription2.Buffer} view of the struct array pointed to by the {@code pSubpasses} field. */
    @NativeType("VkSubpassDescription2 const *")
    public VkSubpassDescription2.Buffer pSubpasses() { return npSubpasses(address()); }
    /** Returns the value of the {@code dependencyCount} field. */
    @NativeType("uint32_t")
    public int dependencyCount() { return ndependencyCount(address()); }
    /** Returns a {@link VkSubpassDependency2.Buffer} view of the struct array pointed to by the {@code pDependencies} field. */
    @Nullable
    @NativeType("VkSubpassDependency2 const *")
    public VkSubpassDependency2.Buffer pDependencies() { return npDependencies(address()); }
    /** Returns the value of the {@code correlatedViewMaskCount} field. */
    @NativeType("uint32_t")
    public int correlatedViewMaskCount() { return ncorrelatedViewMaskCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pCorrelatedViewMasks} field. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pCorrelatedViewMasks() { return npCorrelatedViewMasks(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassCreateInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassCreateInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkRenderPassCreateInfo2 flags(@NativeType("VkRenderPassCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentDescription2.Buffer} to the {@code pAttachments} field. */
    public VkRenderPassCreateInfo2 pAttachments(@Nullable @NativeType("VkAttachmentDescription2 const *") VkAttachmentDescription2.Buffer value) { npAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDescription2.Buffer} to the {@code pSubpasses} field. */
    public VkRenderPassCreateInfo2 pSubpasses(@NativeType("VkSubpassDescription2 const *") VkSubpassDescription2.Buffer value) { npSubpasses(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDependency2.Buffer} to the {@code pDependencies} field. */
    public VkRenderPassCreateInfo2 pDependencies(@Nullable @NativeType("VkSubpassDependency2 const *") VkSubpassDependency2.Buffer value) { npDependencies(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelatedViewMasks} field. */
    public VkRenderPassCreateInfo2 pCorrelatedViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npCorrelatedViewMasks(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassCreateInfo2 set(
        int sType,
        long pNext,
        int flags,
        @Nullable VkAttachmentDescription2.Buffer pAttachments,
        VkSubpassDescription2.Buffer pSubpasses,
        @Nullable VkSubpassDependency2.Buffer pDependencies,
        @Nullable IntBuffer pCorrelatedViewMasks
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pAttachments(pAttachments);
        pSubpasses(pSubpasses);
        pDependencies(pDependencies);
        pCorrelatedViewMasks(pCorrelatedViewMasks);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassCreateInfo2 set(VkRenderPassCreateInfo2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassCreateInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreateInfo2 malloc() {
        return wrap(VkRenderPassCreateInfo2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRenderPassCreateInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreateInfo2 calloc() {
        return wrap(VkRenderPassCreateInfo2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRenderPassCreateInfo2} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassCreateInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRenderPassCreateInfo2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassCreateInfo2} instance for the specified memory address. */
    public static VkRenderPassCreateInfo2 create(long address) {
        return wrap(VkRenderPassCreateInfo2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassCreateInfo2 createSafe(long address) {
        return address == NULL ? null : wrap(VkRenderPassCreateInfo2.class, address);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRenderPassCreateInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassCreateInfo2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassCreateInfo2} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkRenderPassCreateInfo2 mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkRenderPassCreateInfo2} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkRenderPassCreateInfo2 callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkRenderPassCreateInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreateInfo2 mallocStack(MemoryStack stack) {
        return wrap(VkRenderPassCreateInfo2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRenderPassCreateInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreateInfo2 callocStack(MemoryStack stack) {
        return wrap(VkRenderPassCreateInfo2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassCreateInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassCreateInfo2.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassCreateInfo2.FLAGS); }
    /** Unsafe version of {@link #attachmentCount}. */
    public static int nattachmentCount(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassCreateInfo2.ATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pAttachments}. */
    @Nullable public static VkAttachmentDescription2.Buffer npAttachments(long struct) { return VkAttachmentDescription2.createSafe(memGetAddress(struct + VkRenderPassCreateInfo2.PATTACHMENTS), nattachmentCount(struct)); }
    /** Unsafe version of {@link #subpassCount}. */
    public static int nsubpassCount(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassCreateInfo2.SUBPASSCOUNT); }
    /** Unsafe version of {@link #pSubpasses}. */
    public static VkSubpassDescription2.Buffer npSubpasses(long struct) { return VkSubpassDescription2.create(memGetAddress(struct + VkRenderPassCreateInfo2.PSUBPASSES), nsubpassCount(struct)); }
    /** Unsafe version of {@link #dependencyCount}. */
    public static int ndependencyCount(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassCreateInfo2.DEPENDENCYCOUNT); }
    /** Unsafe version of {@link #pDependencies}. */
    @Nullable public static VkSubpassDependency2.Buffer npDependencies(long struct) { return VkSubpassDependency2.createSafe(memGetAddress(struct + VkRenderPassCreateInfo2.PDEPENDENCIES), ndependencyCount(struct)); }
    /** Unsafe version of {@link #correlatedViewMaskCount}. */
    public static int ncorrelatedViewMaskCount(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassCreateInfo2.CORRELATEDVIEWMASKCOUNT); }
    /** Unsafe version of {@link #pCorrelatedViewMasks() pCorrelatedViewMasks}. */
    @Nullable public static IntBuffer npCorrelatedViewMasks(long struct) { return memIntBufferSafe(memGetAddress(struct + VkRenderPassCreateInfo2.PCORRELATEDVIEWMASKS), ncorrelatedViewMaskCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassCreateInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassCreateInfo2.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassCreateInfo2.FLAGS, value); }
    /** Sets the specified value to the {@code attachmentCount} field of the specified {@code struct}. */
    public static void nattachmentCount(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassCreateInfo2.ATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pAttachments(VkAttachmentDescription2.Buffer) pAttachments}. */
    public static void npAttachments(long struct, @Nullable VkAttachmentDescription2.Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo2.PATTACHMENTS, memAddressSafe(value)); nattachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code subpassCount} field of the specified {@code struct}. */
    public static void nsubpassCount(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassCreateInfo2.SUBPASSCOUNT, value); }
    /** Unsafe version of {@link #pSubpasses(VkSubpassDescription2.Buffer) pSubpasses}. */
    public static void npSubpasses(long struct, VkSubpassDescription2.Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo2.PSUBPASSES, value.address()); nsubpassCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code dependencyCount} field of the specified {@code struct}. */
    public static void ndependencyCount(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassCreateInfo2.DEPENDENCYCOUNT, value); }
    /** Unsafe version of {@link #pDependencies(VkSubpassDependency2.Buffer) pDependencies}. */
    public static void npDependencies(long struct, @Nullable VkSubpassDependency2.Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo2.PDEPENDENCIES, memAddressSafe(value)); ndependencyCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code correlatedViewMaskCount} field of the specified {@code struct}. */
    public static void ncorrelatedViewMaskCount(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassCreateInfo2.CORRELATEDVIEWMASKCOUNT, value); }
    /** Unsafe version of {@link #pCorrelatedViewMasks(IntBuffer) pCorrelatedViewMasks}. */
    public static void npCorrelatedViewMasks(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkRenderPassCreateInfo2.PCORRELATEDVIEWMASKS, memAddressSafe(value)); ncorrelatedViewMaskCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nattachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassCreateInfo2.PATTACHMENTS));
        }
        int subpassCount = nsubpassCount(struct);
        long pSubpasses = memGetAddress(struct + VkRenderPassCreateInfo2.PSUBPASSES);
        check(pSubpasses);
        VkSubpassDescription2.validate(pSubpasses, subpassCount);
        if (ndependencyCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassCreateInfo2.PDEPENDENCIES));
        }
        if (ncorrelatedViewMaskCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassCreateInfo2.PCORRELATEDVIEWMASKS));
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
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassCreateInfo2} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassCreateInfo2, Buffer> implements NativeResource {

        private static final VkRenderPassCreateInfo2 ELEMENT_FACTORY = VkRenderPassCreateInfo2.create(-1L);

        /**
         * Creates a new {@code VkRenderPassCreateInfo2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassCreateInfo2#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderPassCreateInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassCreateInfo2.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassCreateInfo2.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkRenderPassCreateFlags")
        public int flags() { return VkRenderPassCreateInfo2.nflags(address()); }
        /** Returns the value of the {@code attachmentCount} field. */
        @NativeType("uint32_t")
        public int attachmentCount() { return VkRenderPassCreateInfo2.nattachmentCount(address()); }
        /** Returns a {@link VkAttachmentDescription2.Buffer} view of the struct array pointed to by the {@code pAttachments} field. */
        @Nullable
        @NativeType("VkAttachmentDescription2 const *")
        public VkAttachmentDescription2.Buffer pAttachments() { return VkRenderPassCreateInfo2.npAttachments(address()); }
        /** Returns the value of the {@code subpassCount} field. */
        @NativeType("uint32_t")
        public int subpassCount() { return VkRenderPassCreateInfo2.nsubpassCount(address()); }
        /** Returns a {@link VkSubpassDescription2.Buffer} view of the struct array pointed to by the {@code pSubpasses} field. */
        @NativeType("VkSubpassDescription2 const *")
        public VkSubpassDescription2.Buffer pSubpasses() { return VkRenderPassCreateInfo2.npSubpasses(address()); }
        /** Returns the value of the {@code dependencyCount} field. */
        @NativeType("uint32_t")
        public int dependencyCount() { return VkRenderPassCreateInfo2.ndependencyCount(address()); }
        /** Returns a {@link VkSubpassDependency2.Buffer} view of the struct array pointed to by the {@code pDependencies} field. */
        @Nullable
        @NativeType("VkSubpassDependency2 const *")
        public VkSubpassDependency2.Buffer pDependencies() { return VkRenderPassCreateInfo2.npDependencies(address()); }
        /** Returns the value of the {@code correlatedViewMaskCount} field. */
        @NativeType("uint32_t")
        public int correlatedViewMaskCount() { return VkRenderPassCreateInfo2.ncorrelatedViewMaskCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pCorrelatedViewMasks} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pCorrelatedViewMasks() { return VkRenderPassCreateInfo2.npCorrelatedViewMasks(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassCreateInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassCreateInfo2.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassCreateInfo2.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassCreateInfo2.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkRenderPassCreateInfo2.Buffer flags(@NativeType("VkRenderPassCreateFlags") int value) { VkRenderPassCreateInfo2.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentDescription2.Buffer} to the {@code pAttachments} field. */
        public VkRenderPassCreateInfo2.Buffer pAttachments(@Nullable @NativeType("VkAttachmentDescription2 const *") VkAttachmentDescription2.Buffer value) { VkRenderPassCreateInfo2.npAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDescription2.Buffer} to the {@code pSubpasses} field. */
        public VkRenderPassCreateInfo2.Buffer pSubpasses(@NativeType("VkSubpassDescription2 const *") VkSubpassDescription2.Buffer value) { VkRenderPassCreateInfo2.npSubpasses(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDependency2.Buffer} to the {@code pDependencies} field. */
        public VkRenderPassCreateInfo2.Buffer pDependencies(@Nullable @NativeType("VkSubpassDependency2 const *") VkSubpassDependency2.Buffer value) { VkRenderPassCreateInfo2.npDependencies(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelatedViewMasks} field. */
        public VkRenderPassCreateInfo2.Buffer pCorrelatedViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderPassCreateInfo2.npCorrelatedViewMasks(address(), value); return this; }

    }

}