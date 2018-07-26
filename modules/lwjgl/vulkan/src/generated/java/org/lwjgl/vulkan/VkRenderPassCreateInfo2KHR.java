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
 * <p>Parameters defined by this structure with the same name as those in {@link VkRenderPassCreateInfo} have the identical effect to those parameters; the child structures are variants of those used in {@link VkRenderPassCreateInfo} which include {@code sType} and {@code pNext} parameters, allowing them to be extended.</p>
 * 
 * <p>If the {@link VkSubpassDescription2KHR}{@code ::viewMask} member of any element of {@code pSubpasses} is not zero, <em>multiview</em> functionality is considered to be enabled for this render pass.</p>
 * 
 * <p>{@code correlatedViewMaskCount} and {@code pCorrelatedViewMasks} have the same effect as {@link VkRenderPassMultiviewCreateInfo}{@code ::correlationMaskCount} and {@link VkRenderPassMultiviewCreateInfo}{@code ::pCorrelationMasks}, respectively.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If any two subpasses operate on attachments with overlapping ranges of the same {@code VkDeviceMemory} object, and at least one subpass writes to that area of {@code VkDeviceMemory}, a subpass dependency <b>must</b> be included (either directly or via some intermediate subpasses) between them</li>
 * <li>If the {@code attachment} member of any element of {@code pInputAttachments}, {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment}, or the attachment indexed by any element of {@code pPreserveAttachments} in any given element of {@code pSubpasses} is bound to a range of a {@code VkDeviceMemory} object that overlaps with any other attachment in any subpass (including the same subpass), the {@link VkAttachmentDescription2KHR} structures describing them <b>must</b> include {@link VK10#VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT} in {@code flags}</li>
 * <li>If the {@code attachment} member of any element of {@code pInputAttachments}, {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment}, or any element of {@code pPreserveAttachments} in any given element of {@code pSubpasses} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, it <b>must</b> be less than {@code attachmentCount}</li>
 * <li>The value of any element of the {@code pPreserveAttachments} member in any given element of {@code pSubpasses} <b>must</b> not be {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>For any member of {@code pAttachments} with a {@code loadOp} equal to {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}, the first use of that attachment <b>must</b> not specify a {@code layout} equal to {@code VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL} or {@code VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}.</li>
 * <li>For any element of {@code pDependencies}, if the {@code srcSubpass} is not {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}, all stage flags included in the {@code srcStageMask} member of that dependency <b>must</b> be a pipeline stage supported by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">pipeline</a> identified by the {@code pipelineBindPoint} member of the source subpass.</li>
 * <li>For any element of {@code pDependencies}, if the {@code dstSubpass} is not {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}, all stage flags included in the {@code dstStageMask} member of that dependency <b>must</b> be a pipeline stage supported by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">pipeline</a> identified by the {@code pipelineBindPoint} member of the source subpass.</li>
 * <li>The set of bits included in any element of {@code pCorrelatedViewMasks} <b>must</b> not overlap with the set of bits included in any other element of {@code pCorrelatedViewMasks}</li>
 * <li>If the {@link VkSubpassDescription2KHR}{@code ::viewMask} member of all elements of {@code pSubpasses} is 0, {@code correlatedViewMaskCount} <b>must</b> be 0</li>
 * <li>The {@link VkSubpassDescription2KHR}{@code ::viewMask} member of all elements of {@code pSubpasses} <b>must</b> either all be 0, or all not be 0</li>
 * <li>If the {@link VkSubpassDescription2KHR}{@code ::viewMask} member of all elements of {@code pSubpasses} is 0, the {@code dependencyFlags} member of any element of {@code pDependencies} <b>must</b> not include {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT}</li>
 * <li>For any element of {@code pDependencies} where its {@code srcSubpass} member equals its {@code dstSubpass} member, if the {@code viewMask} member of the corresponding element of {@code pSubpasses} includes more than one bit, its {@code dependencyFlags} member <b>must</b> include {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRCreateRenderpass2#VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2_KHR STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>If {@code attachmentCount} is not 0, {@code pAttachments} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid {@link VkAttachmentDescription2KHR} structures</li>
 * <li>{@code pSubpasses} <b>must</b> be a valid pointer to an array of {@code subpassCount} valid {@link VkSubpassDescription2KHR} structures</li>
 * <li>If {@code dependencyCount} is not 0, {@code pDependencies} <b>must</b> be a valid pointer to an array of {@code dependencyCount} valid {@link VkSubpassDependency2KHR} structures</li>
 * <li>If {@code correlatedViewMaskCount} is not 0, {@code pCorrelatedViewMasks} <b>must</b> be a valid pointer to an array of {@code correlatedViewMaskCount} {@code uint32_t} values</li>
 * <li>{@code subpassCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAttachmentDescription2KHR}, {@link VkSubpassDependency2KHR}, {@link VkSubpassDescription2KHR}, {@link KHRCreateRenderpass2#vkCreateRenderPass2KHR CreateRenderPass2KHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code attachmentCount} &ndash; the number of attachments used by this render pass.</li>
 * <li>{@code pAttachments} &ndash; points to an array of {@code attachmentCount} {@link VkAttachmentDescription2KHR} structures describing the attachments used by the render pass.</li>
 * <li>{@code subpassCount} &ndash; the number of subpasses to create.</li>
 * <li>{@code pSubpasses} &ndash; points to an array of {@code subpassCount} {@link VkSubpassDescription2KHR} structures describing each subpass.</li>
 * <li>{@code dependencyCount} &ndash; the number of dependencies between pairs of subpasses.</li>
 * <li>{@code pDependencies} &ndash; points to an array of {@code dependencyCount} {@link VkSubpassDependency2KHR} structures describing dependencies between pairs of subpasses.</li>
 * <li>{@code correlatedViewMaskCount} &ndash; the number of correlation masks.</li>
 * <li>{@code pCorrelatedViewMasks} &ndash; an array of view masks indicating sets of views that <b>may</b> be more efficient to render concurrently.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassCreateInfo2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkRenderPassCreateFlags flags;
 *     uint32_t attachmentCount;
 *     {@link VkAttachmentDescription2KHR VkAttachmentDescription2KHR const} * pAttachments;
 *     uint32_t subpassCount;
 *     {@link VkSubpassDescription2KHR VkSubpassDescription2KHR const} * pSubpasses;
 *     uint32_t dependencyCount;
 *     {@link VkSubpassDependency2KHR VkSubpassDependency2KHR const} * pDependencies;
 *     uint32_t correlatedViewMaskCount;
 *     uint32_t const * pCorrelatedViewMasks;
 * }</code></pre>
 */
public class VkRenderPassCreateInfo2KHR extends Struct implements NativeResource {

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

    VkRenderPassCreateInfo2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkRenderPassCreateInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassCreateInfo2KHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
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
    /** Returns a {@link VkAttachmentDescription2KHR.Buffer} view of the struct array pointed to by the {@code pAttachments} field. */
    @Nullable
    @NativeType("VkAttachmentDescription2KHR const *")
    public VkAttachmentDescription2KHR.Buffer pAttachments() { return npAttachments(address()); }
    /** Returns the value of the {@code subpassCount} field. */
    @NativeType("uint32_t")
    public int subpassCount() { return nsubpassCount(address()); }
    /** Returns a {@link VkSubpassDescription2KHR.Buffer} view of the struct array pointed to by the {@code pSubpasses} field. */
    @NativeType("VkSubpassDescription2KHR const *")
    public VkSubpassDescription2KHR.Buffer pSubpasses() { return npSubpasses(address()); }
    /** Returns the value of the {@code dependencyCount} field. */
    @NativeType("uint32_t")
    public int dependencyCount() { return ndependencyCount(address()); }
    /** Returns a {@link VkSubpassDependency2KHR.Buffer} view of the struct array pointed to by the {@code pDependencies} field. */
    @Nullable
    @NativeType("VkSubpassDependency2KHR const *")
    public VkSubpassDependency2KHR.Buffer pDependencies() { return npDependencies(address()); }
    /** Returns the value of the {@code correlatedViewMaskCount} field. */
    @NativeType("uint32_t")
    public int correlatedViewMaskCount() { return ncorrelatedViewMaskCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pCorrelatedViewMasks} field. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pCorrelatedViewMasks() { return npCorrelatedViewMasks(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassCreateInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassCreateInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkRenderPassCreateInfo2KHR flags(@NativeType("VkRenderPassCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentDescription2KHR.Buffer} to the {@code pAttachments} field. */
    public VkRenderPassCreateInfo2KHR pAttachments(@Nullable @NativeType("VkAttachmentDescription2KHR const *") VkAttachmentDescription2KHR.Buffer value) { npAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDescription2KHR.Buffer} to the {@code pSubpasses} field. */
    public VkRenderPassCreateInfo2KHR pSubpasses(@NativeType("VkSubpassDescription2KHR const *") VkSubpassDescription2KHR.Buffer value) { npSubpasses(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDependency2KHR.Buffer} to the {@code pDependencies} field. */
    public VkRenderPassCreateInfo2KHR pDependencies(@Nullable @NativeType("VkSubpassDependency2KHR const *") VkSubpassDependency2KHR.Buffer value) { npDependencies(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelatedViewMasks} field. */
    public VkRenderPassCreateInfo2KHR pCorrelatedViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npCorrelatedViewMasks(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassCreateInfo2KHR set(
        int sType,
        long pNext,
        int flags,
        @Nullable VkAttachmentDescription2KHR.Buffer pAttachments,
        VkSubpassDescription2KHR.Buffer pSubpasses,
        @Nullable VkSubpassDependency2KHR.Buffer pDependencies,
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
    public VkRenderPassCreateInfo2KHR set(VkRenderPassCreateInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkRenderPassCreateInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreateInfo2KHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkRenderPassCreateInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreateInfo2KHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkRenderPassCreateInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassCreateInfo2KHR create() {
        return new VkRenderPassCreateInfo2KHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkRenderPassCreateInfo2KHR} instance for the specified memory address. */
    public static VkRenderPassCreateInfo2KHR create(long address) {
        return new VkRenderPassCreateInfo2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassCreateInfo2KHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkRenderPassCreateInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassCreateInfo2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkRenderPassCreateInfo2KHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkRenderPassCreateInfo2KHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkRenderPassCreateInfo2KHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkRenderPassCreateInfo2KHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreateInfo2KHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreateInfo2KHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassCreateInfo2KHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2KHR.FLAGS); }
    /** Unsafe version of {@link #attachmentCount}. */
    public static int nattachmentCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2KHR.ATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pAttachments}. */
    @Nullable public static VkAttachmentDescription2KHR.Buffer npAttachments(long struct) { return VkAttachmentDescription2KHR.createSafe(memGetAddress(struct + VkRenderPassCreateInfo2KHR.PATTACHMENTS), nattachmentCount(struct)); }
    /** Unsafe version of {@link #subpassCount}. */
    public static int nsubpassCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2KHR.SUBPASSCOUNT); }
    /** Unsafe version of {@link #pSubpasses}. */
    public static VkSubpassDescription2KHR.Buffer npSubpasses(long struct) { return VkSubpassDescription2KHR.create(memGetAddress(struct + VkRenderPassCreateInfo2KHR.PSUBPASSES), nsubpassCount(struct)); }
    /** Unsafe version of {@link #dependencyCount}. */
    public static int ndependencyCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2KHR.DEPENDENCYCOUNT); }
    /** Unsafe version of {@link #pDependencies}. */
    @Nullable public static VkSubpassDependency2KHR.Buffer npDependencies(long struct) { return VkSubpassDependency2KHR.createSafe(memGetAddress(struct + VkRenderPassCreateInfo2KHR.PDEPENDENCIES), ndependencyCount(struct)); }
    /** Unsafe version of {@link #correlatedViewMaskCount}. */
    public static int ncorrelatedViewMaskCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2KHR.CORRELATEDVIEWMASKCOUNT); }
    /** Unsafe version of {@link #pCorrelatedViewMasks() pCorrelatedViewMasks}. */
    @Nullable public static IntBuffer npCorrelatedViewMasks(long struct) { return memIntBufferSafe(memGetAddress(struct + VkRenderPassCreateInfo2KHR.PCORRELATEDVIEWMASKS), ncorrelatedViewMaskCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassCreateInfo2KHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2KHR.FLAGS, value); }
    /** Sets the specified value to the {@code attachmentCount} field of the specified {@code struct}. */
    public static void nattachmentCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2KHR.ATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pAttachments(VkAttachmentDescription2KHR.Buffer) pAttachments}. */
    public static void npAttachments(long struct, @Nullable VkAttachmentDescription2KHR.Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo2KHR.PATTACHMENTS, memAddressSafe(value)); nattachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code subpassCount} field of the specified {@code struct}. */
    public static void nsubpassCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2KHR.SUBPASSCOUNT, value); }
    /** Unsafe version of {@link #pSubpasses(VkSubpassDescription2KHR.Buffer) pSubpasses}. */
    public static void npSubpasses(long struct, VkSubpassDescription2KHR.Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo2KHR.PSUBPASSES, value.address()); nsubpassCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code dependencyCount} field of the specified {@code struct}. */
    public static void ndependencyCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2KHR.DEPENDENCYCOUNT, value); }
    /** Unsafe version of {@link #pDependencies(VkSubpassDependency2KHR.Buffer) pDependencies}. */
    public static void npDependencies(long struct, @Nullable VkSubpassDependency2KHR.Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo2KHR.PDEPENDENCIES, memAddressSafe(value)); ndependencyCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code correlatedViewMaskCount} field of the specified {@code struct}. */
    public static void ncorrelatedViewMaskCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2KHR.CORRELATEDVIEWMASKCOUNT, value); }
    /** Unsafe version of {@link #pCorrelatedViewMasks(IntBuffer) pCorrelatedViewMasks}. */
    public static void npCorrelatedViewMasks(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkRenderPassCreateInfo2KHR.PCORRELATEDVIEWMASKS, memAddressSafe(value)); ncorrelatedViewMaskCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nattachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassCreateInfo2KHR.PATTACHMENTS));
        }
        int subpassCount = nsubpassCount(struct);
        long pSubpasses = memGetAddress(struct + VkRenderPassCreateInfo2KHR.PSUBPASSES);
        check(pSubpasses);
        VkSubpassDescription2KHR.validate(pSubpasses, subpassCount);
        if (ndependencyCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassCreateInfo2KHR.PDEPENDENCIES));
        }
        if (ncorrelatedViewMaskCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassCreateInfo2KHR.PCORRELATEDVIEWMASKS));
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

    /** An array of {@link VkRenderPassCreateInfo2KHR} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassCreateInfo2KHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassCreateInfo2KHR#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkRenderPassCreateInfo2KHR newInstance(long address) {
            return new VkRenderPassCreateInfo2KHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassCreateInfo2KHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassCreateInfo2KHR.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkRenderPassCreateFlags")
        public int flags() { return VkRenderPassCreateInfo2KHR.nflags(address()); }
        /** Returns the value of the {@code attachmentCount} field. */
        @NativeType("uint32_t")
        public int attachmentCount() { return VkRenderPassCreateInfo2KHR.nattachmentCount(address()); }
        /** Returns a {@link VkAttachmentDescription2KHR.Buffer} view of the struct array pointed to by the {@code pAttachments} field. */
        @Nullable
        @NativeType("VkAttachmentDescription2KHR const *")
        public VkAttachmentDescription2KHR.Buffer pAttachments() { return VkRenderPassCreateInfo2KHR.npAttachments(address()); }
        /** Returns the value of the {@code subpassCount} field. */
        @NativeType("uint32_t")
        public int subpassCount() { return VkRenderPassCreateInfo2KHR.nsubpassCount(address()); }
        /** Returns a {@link VkSubpassDescription2KHR.Buffer} view of the struct array pointed to by the {@code pSubpasses} field. */
        @NativeType("VkSubpassDescription2KHR const *")
        public VkSubpassDescription2KHR.Buffer pSubpasses() { return VkRenderPassCreateInfo2KHR.npSubpasses(address()); }
        /** Returns the value of the {@code dependencyCount} field. */
        @NativeType("uint32_t")
        public int dependencyCount() { return VkRenderPassCreateInfo2KHR.ndependencyCount(address()); }
        /** Returns a {@link VkSubpassDependency2KHR.Buffer} view of the struct array pointed to by the {@code pDependencies} field. */
        @Nullable
        @NativeType("VkSubpassDependency2KHR const *")
        public VkSubpassDependency2KHR.Buffer pDependencies() { return VkRenderPassCreateInfo2KHR.npDependencies(address()); }
        /** Returns the value of the {@code correlatedViewMaskCount} field. */
        @NativeType("uint32_t")
        public int correlatedViewMaskCount() { return VkRenderPassCreateInfo2KHR.ncorrelatedViewMaskCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pCorrelatedViewMasks} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pCorrelatedViewMasks() { return VkRenderPassCreateInfo2KHR.npCorrelatedViewMasks(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassCreateInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassCreateInfo2KHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassCreateInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassCreateInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkRenderPassCreateInfo2KHR.Buffer flags(@NativeType("VkRenderPassCreateFlags") int value) { VkRenderPassCreateInfo2KHR.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentDescription2KHR.Buffer} to the {@code pAttachments} field. */
        public VkRenderPassCreateInfo2KHR.Buffer pAttachments(@Nullable @NativeType("VkAttachmentDescription2KHR const *") VkAttachmentDescription2KHR.Buffer value) { VkRenderPassCreateInfo2KHR.npAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDescription2KHR.Buffer} to the {@code pSubpasses} field. */
        public VkRenderPassCreateInfo2KHR.Buffer pSubpasses(@NativeType("VkSubpassDescription2KHR const *") VkSubpassDescription2KHR.Buffer value) { VkRenderPassCreateInfo2KHR.npSubpasses(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDependency2KHR.Buffer} to the {@code pDependencies} field. */
        public VkRenderPassCreateInfo2KHR.Buffer pDependencies(@Nullable @NativeType("VkSubpassDependency2KHR const *") VkSubpassDependency2KHR.Buffer value) { VkRenderPassCreateInfo2KHR.npDependencies(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelatedViewMasks} field. */
        public VkRenderPassCreateInfo2KHR.Buffer pCorrelatedViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderPassCreateInfo2KHR.npCorrelatedViewMasks(address(), value); return this; }

    }

}