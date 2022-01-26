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
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Care should be taken to avoid a data race here; if any subpasses access attachments with overlapping memory locations, and one of those accesses is a write, a subpass dependency needs to be included between them.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the {@code attachment} member of any element of {@code pInputAttachments}, {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment}, or any element of {@code pPreserveAttachments} in any element of {@code pSubpasses} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, then it <b>must</b> be less than {@code attachmentCount}</li>
 * <li>If the pNext chain includes a {@link VkRenderPassFragmentDensityMapCreateInfoEXT} structure and the {@code fragmentDensityMapAttachment} member is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, then {@code attachment} <b>must</b> be less than {@code attachmentCount}</li>
 * <li>For any member of {@code pAttachments} with a {@code loadOp} equal to {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}, the first use of that attachment <b>must</b> not specify a {@code layout} equal to {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL} or {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>For any member of {@code pAttachments} with a {@code stencilLoadOp} equal to {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}, the first use of that attachment <b>must</b> not specify a {@code layout} equal to {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL} or {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>For any member of {@code pAttachments} with a {@code loadOp} equal to {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}, the first use of that attachment <b>must</b> not specify a {@code layout} equal to {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}</li>
 * <li>For any member of {@code pAttachments} with a {@code stencilLoadOp} equal to {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}, the first use of that attachment <b>must</b> not specify a {@code layout} equal to {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If the {@code pNext} chain includes a {@link VkRenderPassInputAttachmentAspectCreateInfo} structure, the {@code subpass} member of each element of its {@code pAspectReferences} member <b>must</b> be less than {@code subpassCount}</li>
 * <li>If the {@code pNext} chain includes a {@link VkRenderPassInputAttachmentAspectCreateInfo} structure, the {@code inputAttachmentIndex} member of each element of its {@code pAspectReferences} member <b>must</b> be less than the value of {@code inputAttachmentCount} in the element of {@code pSubpasses} identified by its {@code subpass} member</li>
 * <li>If the {@code pNext} chain includes a {@link VkRenderPassInputAttachmentAspectCreateInfo} structure, for any element of the {@code pInputAttachments} member of any element of {@code pSubpasses} where the {@code attachment} member is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, the {@code aspectMask} member of the corresponding element of {@link VkRenderPassInputAttachmentAspectCreateInfo}{@code ::pAspectReferences} <b>must</b> only include aspects that are present in images of the format specified by the element of {@code pAttachments} at {@code attachment}</li>
 * <li>If the {@code pNext} chain includes a {@link VkRenderPassMultiviewCreateInfo} structure, and its {@code subpassCount} member is not zero, that member <b>must</b> be equal to the value of {@code subpassCount}</li>
 * <li>If the {@code pNext} chain includes a {@link VkRenderPassMultiviewCreateInfo} structure, if its {@code dependencyCount} member is not zero, it <b>must</b> be equal to {@code dependencyCount}</li>
 * <li>If the {@code pNext} chain includes a {@link VkRenderPassMultiviewCreateInfo} structure, for each non-zero element of {@code pViewOffsets}, the {@code srcSubpass} and {@code dstSubpass} members of {@code pDependencies} at the same index <b>must</b> not be equal</li>
 * <li>If the {@code pNext} chain includes a {@link VkRenderPassMultiviewCreateInfo} structure, for any element of {@code pDependencies} with a {@code dependencyFlags} member that does not include {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT}, the corresponding element of the {@code pViewOffsets} member of that {@link VkRenderPassMultiviewCreateInfo} instance <b>must</b> be 0</li>
 * <li>If the {@code pNext} chain includes a {@link VkRenderPassMultiviewCreateInfo} structure, elements of its {@code pViewMasks} member <b>must</b> either all be 0, or all not be 0</li>
 * <li>If the {@code pNext} chain includes a {@link VkRenderPassMultiviewCreateInfo} structure, and each element of its {@code pViewMasks} member is 0, the {@code dependencyFlags} member of each element of {@code pDependencies} <b>must</b> not include {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT}</li>
 * <li>If the {@code pNext} chain includes a {@link VkRenderPassMultiviewCreateInfo} structure, and each element of its {@code pViewMasks} member is 0, its {@code correlationMaskCount} member <b>must</b> be 0</li>
 * <li>For any element of {@code pDependencies}, if the {@code srcSubpass} is not {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}, all stage flags included in the {@code srcStageMask} member of that dependency <b>must</b> be a pipeline stage supported by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages-types">pipeline</a> identified by the {@code pipelineBindPoint} member of the source subpass</li>
 * <li>For any element of {@code pDependencies}, if the {@code dstSubpass} is not {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}, all stage flags included in the {@code dstStageMask} member of that dependency <b>must</b> be a pipeline stage supported by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages-types">pipeline</a> identified by the {@code pipelineBindPoint} member of the destination subpass</li>
 * <li>The {@code srcSubpass} member of each element of {@code pDependencies} <b>must</b> be less than {@code subpassCount}</li>
 * <li>The {@code dstSubpass} member of each element of {@code pDependencies} <b>must</b> be less than {@code subpassCount}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkRenderPassFragmentDensityMapCreateInfoEXT}, {@link VkRenderPassInputAttachmentAspectCreateInfo}, or {@link VkRenderPassMultiviewCreateInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkRenderPassCreateFlagBits} values</li>
 * <li>If {@code attachmentCount} is not 0, {@code pAttachments} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid {@link VkAttachmentDescription} structures</li>
 * <li>{@code pSubpasses} <b>must</b> be a valid pointer to an array of {@code subpassCount} valid {@link VkSubpassDescription} structures</li>
 * <li>If {@code dependencyCount} is not 0, {@code pDependencies} <b>must</b> be a valid pointer to an array of {@code dependencyCount} valid {@link VkSubpassDependency} structures</li>
 * <li>{@code subpassCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAttachmentDescription}, {@link VkSubpassDependency}, {@link VkSubpassDescription}, {@link VK10#vkCreateRenderPass CreateRenderPass}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkRenderPassCreateFlags {@link #flags};
 *     uint32_t {@link #attachmentCount};
 *     {@link VkAttachmentDescription VkAttachmentDescription} const * {@link #pAttachments};
 *     uint32_t {@link #subpassCount};
 *     {@link VkSubpassDescription VkSubpassDescription} const * {@link #pSubpasses};
 *     uint32_t {@link #dependencyCount};
 *     {@link VkSubpassDependency VkSubpassDependency} const * {@link #pDependencies};
 * }</code></pre>
 */
public class VkRenderPassCreateInfo extends Struct implements NativeResource {

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
        PDEPENDENCIES;

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
    }

    /**
     * Creates a {@code VkRenderPassCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassCreateInfo(ByteBuffer container) {
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
    /** a bitmask of {@code VkRenderPassCreateFlagBits} */
    @NativeType("VkRenderPassCreateFlags")
    public int flags() { return nflags(address()); }
    /** the number of attachments used by this render pass. */
    @NativeType("uint32_t")
    public int attachmentCount() { return nattachmentCount(address()); }
    /** a pointer to an array of {@code attachmentCount} {@link VkAttachmentDescription} structures describing the attachments used by the render pass. */
    @Nullable
    @NativeType("VkAttachmentDescription const *")
    public VkAttachmentDescription.Buffer pAttachments() { return npAttachments(address()); }
    /** the number of subpasses to create. */
    @NativeType("uint32_t")
    public int subpassCount() { return nsubpassCount(address()); }
    /** a pointer to an array of {@code subpassCount} {@link VkSubpassDescription} structures describing each subpass. */
    @NativeType("VkSubpassDescription const *")
    public VkSubpassDescription.Buffer pSubpasses() { return npSubpasses(address()); }
    /** the number of memory dependencies between pairs of subpasses. */
    @NativeType("uint32_t")
    public int dependencyCount() { return ndependencyCount(address()); }
    /** a pointer to an array of {@code dependencyCount} {@link VkSubpassDependency} structures describing dependencies between pairs of subpasses. */
    @Nullable
    @NativeType("VkSubpassDependency const *")
    public VkSubpassDependency.Buffer pDependencies() { return npDependencies(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRenderPassCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO} value to the {@link #sType} field. */
    public VkRenderPassCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRenderPassCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkRenderPassFragmentDensityMapCreateInfoEXT} value to the {@code pNext} chain. */
    public VkRenderPassCreateInfo pNext(VkRenderPassFragmentDensityMapCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassInputAttachmentAspectCreateInfo} value to the {@code pNext} chain. */
    public VkRenderPassCreateInfo pNext(VkRenderPassInputAttachmentAspectCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassInputAttachmentAspectCreateInfoKHR} value to the {@code pNext} chain. */
    public VkRenderPassCreateInfo pNext(VkRenderPassInputAttachmentAspectCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassMultiviewCreateInfo} value to the {@code pNext} chain. */
    public VkRenderPassCreateInfo pNext(VkRenderPassMultiviewCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassMultiviewCreateInfoKHR} value to the {@code pNext} chain. */
    public VkRenderPassCreateInfo pNext(VkRenderPassMultiviewCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkRenderPassCreateInfo flags(@NativeType("VkRenderPassCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentDescription.Buffer} to the {@link #pAttachments} field. */
    public VkRenderPassCreateInfo pAttachments(@Nullable @NativeType("VkAttachmentDescription const *") VkAttachmentDescription.Buffer value) { npAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDescription.Buffer} to the {@link #pSubpasses} field. */
    public VkRenderPassCreateInfo pSubpasses(@NativeType("VkSubpassDescription const *") VkSubpassDescription.Buffer value) { npSubpasses(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDependency.Buffer} to the {@link #pDependencies} field. */
    public VkRenderPassCreateInfo pDependencies(@Nullable @NativeType("VkSubpassDependency const *") VkSubpassDependency.Buffer value) { npDependencies(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassCreateInfo set(
        int sType,
        long pNext,
        int flags,
        @Nullable VkAttachmentDescription.Buffer pAttachments,
        VkSubpassDescription.Buffer pSubpasses,
        @Nullable VkSubpassDependency.Buffer pDependencies
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pAttachments(pAttachments);
        pSubpasses(pSubpasses);
        pDependencies(pDependencies);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassCreateInfo set(VkRenderPassCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreateInfo malloc() {
        return wrap(VkRenderPassCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRenderPassCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreateInfo calloc() {
        return wrap(VkRenderPassCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRenderPassCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRenderPassCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassCreateInfo} instance for the specified memory address. */
    public static VkRenderPassCreateInfo create(long address) {
        return wrap(VkRenderPassCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkRenderPassCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRenderPassCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkRenderPassCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreateInfo malloc(MemoryStack stack) {
        return wrap(VkRenderPassCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRenderPassCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreateInfo calloc(MemoryStack stack) {
        return wrap(VkRenderPassCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassCreateInfo.FLAGS); }
    /** Unsafe version of {@link #attachmentCount}. */
    public static int nattachmentCount(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassCreateInfo.ATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pAttachments}. */
    @Nullable public static VkAttachmentDescription.Buffer npAttachments(long struct) { return VkAttachmentDescription.createSafe(memGetAddress(struct + VkRenderPassCreateInfo.PATTACHMENTS), nattachmentCount(struct)); }
    /** Unsafe version of {@link #subpassCount}. */
    public static int nsubpassCount(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassCreateInfo.SUBPASSCOUNT); }
    /** Unsafe version of {@link #pSubpasses}. */
    public static VkSubpassDescription.Buffer npSubpasses(long struct) { return VkSubpassDescription.create(memGetAddress(struct + VkRenderPassCreateInfo.PSUBPASSES), nsubpassCount(struct)); }
    /** Unsafe version of {@link #dependencyCount}. */
    public static int ndependencyCount(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassCreateInfo.DEPENDENCYCOUNT); }
    /** Unsafe version of {@link #pDependencies}. */
    @Nullable public static VkSubpassDependency.Buffer npDependencies(long struct) { return VkSubpassDependency.createSafe(memGetAddress(struct + VkRenderPassCreateInfo.PDEPENDENCIES), ndependencyCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code attachmentCount} field of the specified {@code struct}. */
    public static void nattachmentCount(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassCreateInfo.ATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pAttachments(VkAttachmentDescription.Buffer) pAttachments}. */
    public static void npAttachments(long struct, @Nullable VkAttachmentDescription.Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo.PATTACHMENTS, memAddressSafe(value)); nattachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code subpassCount} field of the specified {@code struct}. */
    public static void nsubpassCount(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassCreateInfo.SUBPASSCOUNT, value); }
    /** Unsafe version of {@link #pSubpasses(VkSubpassDescription.Buffer) pSubpasses}. */
    public static void npSubpasses(long struct, VkSubpassDescription.Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo.PSUBPASSES, value.address()); nsubpassCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code dependencyCount} field of the specified {@code struct}. */
    public static void ndependencyCount(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassCreateInfo.DEPENDENCYCOUNT, value); }
    /** Unsafe version of {@link #pDependencies(VkSubpassDependency.Buffer) pDependencies}. */
    public static void npDependencies(long struct, @Nullable VkSubpassDependency.Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo.PDEPENDENCIES, memAddressSafe(value)); ndependencyCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nattachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassCreateInfo.PATTACHMENTS));
        }
        int subpassCount = nsubpassCount(struct);
        long pSubpasses = memGetAddress(struct + VkRenderPassCreateInfo.PSUBPASSES);
        check(pSubpasses);
        validate(pSubpasses, subpassCount, VkSubpassDescription.SIZEOF, VkSubpassDescription::validate);
        if (ndependencyCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassCreateInfo.PDEPENDENCIES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassCreateInfo, Buffer> implements NativeResource {

        private static final VkRenderPassCreateInfo ELEMENT_FACTORY = VkRenderPassCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkRenderPassCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderPassCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRenderPassCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkRenderPassCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkRenderPassCreateInfo#flags} field. */
        @NativeType("VkRenderPassCreateFlags")
        public int flags() { return VkRenderPassCreateInfo.nflags(address()); }
        /** @return the value of the {@link VkRenderPassCreateInfo#attachmentCount} field. */
        @NativeType("uint32_t")
        public int attachmentCount() { return VkRenderPassCreateInfo.nattachmentCount(address()); }
        /** @return a {@link VkAttachmentDescription.Buffer} view of the struct array pointed to by the {@link VkRenderPassCreateInfo#pAttachments} field. */
        @Nullable
        @NativeType("VkAttachmentDescription const *")
        public VkAttachmentDescription.Buffer pAttachments() { return VkRenderPassCreateInfo.npAttachments(address()); }
        /** @return the value of the {@link VkRenderPassCreateInfo#subpassCount} field. */
        @NativeType("uint32_t")
        public int subpassCount() { return VkRenderPassCreateInfo.nsubpassCount(address()); }
        /** @return a {@link VkSubpassDescription.Buffer} view of the struct array pointed to by the {@link VkRenderPassCreateInfo#pSubpasses} field. */
        @NativeType("VkSubpassDescription const *")
        public VkSubpassDescription.Buffer pSubpasses() { return VkRenderPassCreateInfo.npSubpasses(address()); }
        /** @return the value of the {@link VkRenderPassCreateInfo#dependencyCount} field. */
        @NativeType("uint32_t")
        public int dependencyCount() { return VkRenderPassCreateInfo.ndependencyCount(address()); }
        /** @return a {@link VkSubpassDependency.Buffer} view of the struct array pointed to by the {@link VkRenderPassCreateInfo#pDependencies} field. */
        @Nullable
        @NativeType("VkSubpassDependency const *")
        public VkSubpassDependency.Buffer pDependencies() { return VkRenderPassCreateInfo.npDependencies(address()); }

        /** Sets the specified value to the {@link VkRenderPassCreateInfo#sType} field. */
        public VkRenderPassCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO} value to the {@link VkRenderPassCreateInfo#sType} field. */
        public VkRenderPassCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO); }
        /** Sets the specified value to the {@link VkRenderPassCreateInfo#pNext} field. */
        public VkRenderPassCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkRenderPassFragmentDensityMapCreateInfoEXT} value to the {@code pNext} chain. */
        public VkRenderPassCreateInfo.Buffer pNext(VkRenderPassFragmentDensityMapCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassInputAttachmentAspectCreateInfo} value to the {@code pNext} chain. */
        public VkRenderPassCreateInfo.Buffer pNext(VkRenderPassInputAttachmentAspectCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassInputAttachmentAspectCreateInfoKHR} value to the {@code pNext} chain. */
        public VkRenderPassCreateInfo.Buffer pNext(VkRenderPassInputAttachmentAspectCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassMultiviewCreateInfo} value to the {@code pNext} chain. */
        public VkRenderPassCreateInfo.Buffer pNext(VkRenderPassMultiviewCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassMultiviewCreateInfoKHR} value to the {@code pNext} chain. */
        public VkRenderPassCreateInfo.Buffer pNext(VkRenderPassMultiviewCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkRenderPassCreateInfo#flags} field. */
        public VkRenderPassCreateInfo.Buffer flags(@NativeType("VkRenderPassCreateFlags") int value) { VkRenderPassCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentDescription.Buffer} to the {@link VkRenderPassCreateInfo#pAttachments} field. */
        public VkRenderPassCreateInfo.Buffer pAttachments(@Nullable @NativeType("VkAttachmentDescription const *") VkAttachmentDescription.Buffer value) { VkRenderPassCreateInfo.npAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDescription.Buffer} to the {@link VkRenderPassCreateInfo#pSubpasses} field. */
        public VkRenderPassCreateInfo.Buffer pSubpasses(@NativeType("VkSubpassDescription const *") VkSubpassDescription.Buffer value) { VkRenderPassCreateInfo.npSubpasses(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDependency.Buffer} to the {@link VkRenderPassCreateInfo#pDependencies} field. */
        public VkRenderPassCreateInfo.Buffer pDependencies(@Nullable @NativeType("VkSubpassDependency const *") VkSubpassDependency.Buffer value) { VkRenderPassCreateInfo.npDependencies(address(), value); return this; }

    }

}