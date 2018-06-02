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
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If any two subpasses operate on attachments with overlapping ranges of the same {@code VkDeviceMemory} object, and at least one subpass writes to that area of {@code VkDeviceMemory}, a subpass dependency <b>must</b> be included (either directly or via some intermediate subpasses) between them</li>
 * <li>If the {@code attachment} member of any element of {@code pInputAttachments}, {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment}, or the attachment indexed by any element of {@code pPreserveAttachments} in any element of {@code pSubpasses} is bound to a range of a {@code VkDeviceMemory} object that overlaps with any other attachment in any subpass (including the same subpass), the {@link VkAttachmentDescription} structures describing them <b>must</b> include {@link VK10#VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT} in {@code flags}</li>
 * <li>If the {@code attachment} member of any element of {@code pInputAttachments}, {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment}, or any element of {@code pPreserveAttachments} in any element of {@code pSubpasses} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, it <b>must</b> be less than {@code attachmentCount}</li>
 * <li>The value of each element of the {@code pPreserveAttachments} member in each element of {@code pSubpasses} <b>must</b> not be {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>For any member of {@code pAttachments} with a {@code loadOp} equal to {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}, the first use of that attachment <b>must</b> not specify a {@code layout} equal to {@code VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL} or {@code VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}.</li>
 * <li>For any member of {@code pAttachments} with a {@code loadOp} equal to {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}, the first use of that attachment <b>must</b> not specify a {@code layout} equal to {@code VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}.</li>
 * <li>For any member of {@code pAttachments} with a {@code stencilLoadOp} equal to {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}, the first use of that attachment <b>must</b> not specify a {@code layout} equal to {@code VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}.</li>
 * <li>If the {@code pNext} chain includes an instance of {@link VkRenderPassInputAttachmentAspectCreateInfo}, the {@code subpass} member of each element of its {@code pAspectReferences} member <b>must</b> be less than {@code subpassCount}</li>
 * <li>If the {@code pNext} chain includes an instance of {@link VkRenderPassInputAttachmentAspectCreateInfo}, the {@code inputAttachmentIndex} member of each element of its {@code pAspectReferences} member <b>must</b> be less than the value of {@code inputAttachmentCount} in the member of {@code pSubpasses} identified by its {@code subpass} member</li>
 * <li>If the {@code pNext} chain includes an instance of {@link VkRenderPassInputAttachmentAspectCreateInfo}, the {@code aspectMask} member of any element of {@code pAspectReferences} <b>must</b> only include aspects that are present in images of the {@code format} of the input attachment specified by the {@code subpass} and {@code inputAttachment} of the same element of {@code pAspectReferences}</li>
 * <li>If the {@code pNext} chain includes an instance of {@link VkRenderPassMultiviewCreateInfo}, and its {@code subpassCount} member is not zero, that member <b>must</b> be equal to the value of {@code subpassCount}</li>
 * <li>If the {@code pNext} chain includes an instance of {@link VkRenderPassMultiviewCreateInfo}, if its {@code dependencyCount} member is not zero, it <b>must</b> be equal to {@code dependencyCount}</li>
 * <li>If the {@code pNext} chain includes an instance of {@link VkRenderPassMultiviewCreateInfo}, for each non-zero element of {@code pViewOffsets}, the {@code srcSubpass} and {@code dstSubpass} members of {@code pDependencies} at the same index <b>must</b> not be equal</li>
 * <li>For any element of {@code pDependencies}, if the {@code srcSubpass} is not {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}, all stage flags included in the {@code srcStageMask} member of that dependency <b>must</b> be a pipeline stage supported by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">pipeline</a> identified by the {@code pipelineBindPoint} member of the source subpass.</li>
 * <li>For any element of {@code pDependencies}, if the {@code dstSubpass} is not {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}, all stage flags included in the {@code dstStageMask} member of that dependency <b>must</b> be a pipeline stage supported by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">pipeline</a> identified by the {@code pipelineBindPoint} member of the source subpass.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkRenderPassInputAttachmentAspectCreateInfo} or {@link VkRenderPassMultiviewCreateInfo}</li>
 * <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be 0</li>
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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code attachmentCount} &ndash; the number of attachments used by this render pass, or zero indicating no attachments. Attachments are referred to by zero-based indices in the range [0,{@code attachmentCount}).</li>
 * <li>{@code pAttachments} &ndash; points to an array of {@code attachmentCount} number of {@link VkAttachmentDescription} structures describing properties of the attachments, or {@code NULL} if {@code attachmentCount} is zero.</li>
 * <li>{@code subpassCount} &ndash; the number of subpasses to create for this render pass. Subpasses are referred to by zero-based indices in the range [0,{@code subpassCount}). A render pass <b>must</b> have at least one subpass.</li>
 * <li>{@code pSubpasses} &ndash; points to an array of {@code subpassCount} number of {@link VkSubpassDescription} structures describing properties of the subpasses.</li>
 * <li>{@code dependencyCount} &ndash; the number of dependencies between pairs of subpasses, or zero indicating no dependencies.</li>
 * <li>{@code pDependencies} &ndash; points to an array of {@code dependencyCount} number of {@link VkSubpassDependency} structures describing dependencies between pairs of subpasses, or {@code NULL} if {@code dependencyCount} is zero.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkRenderPassCreateFlags flags;
 *     uint32_t attachmentCount;
 *     {@link VkAttachmentDescription VkAttachmentDescription const} * pAttachments;
 *     uint32_t subpassCount;
 *     {@link VkSubpassDescription VkSubpassDescription const} * pSubpasses;
 *     uint32_t dependencyCount;
 *     {@link VkSubpassDependency VkSubpassDependency const} * pDependencies;
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

    VkRenderPassCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkRenderPassCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassCreateInfo(ByteBuffer container) {
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
    /** Returns a {@link VkAttachmentDescription.Buffer} view of the struct array pointed to by the {@code pAttachments} field. */
    @Nullable
    @NativeType("VkAttachmentDescription const *")
    public VkAttachmentDescription.Buffer pAttachments() { return npAttachments(address()); }
    /** Returns the value of the {@code subpassCount} field. */
    @NativeType("uint32_t")
    public int subpassCount() { return nsubpassCount(address()); }
    /** Returns a {@link VkSubpassDescription.Buffer} view of the struct array pointed to by the {@code pSubpasses} field. */
    @NativeType("VkSubpassDescription const *")
    public VkSubpassDescription.Buffer pSubpasses() { return npSubpasses(address()); }
    /** Returns the value of the {@code dependencyCount} field. */
    @NativeType("uint32_t")
    public int dependencyCount() { return ndependencyCount(address()); }
    /** Returns a {@link VkSubpassDependency.Buffer} view of the struct array pointed to by the {@code pDependencies} field. */
    @Nullable
    @NativeType("VkSubpassDependency const *")
    public VkSubpassDependency.Buffer pDependencies() { return npDependencies(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkRenderPassCreateInfo flags(@NativeType("VkRenderPassCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentDescription.Buffer} to the {@code pAttachments} field. */
    public VkRenderPassCreateInfo pAttachments(@Nullable @NativeType("VkAttachmentDescription const *") VkAttachmentDescription.Buffer value) { npAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDescription.Buffer} to the {@code pSubpasses} field. */
    public VkRenderPassCreateInfo pSubpasses(@NativeType("VkSubpassDescription const *") VkSubpassDescription.Buffer value) { npSubpasses(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDependency.Buffer} to the {@code pDependencies} field. */
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

    /** Returns a new {@link VkRenderPassCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreateInfo malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkRenderPassCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreateInfo calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkRenderPassCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassCreateInfo create() {
        return new VkRenderPassCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkRenderPassCreateInfo} instance for the specified memory address. */
    public static VkRenderPassCreateInfo create(long address) {
        return new VkRenderPassCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassCreateInfo createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkRenderPassCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkRenderPassCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkRenderPassCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkRenderPassCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkRenderPassCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreateInfo mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreateInfo callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderPassCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkRenderPassCreateInfo.FLAGS); }
    /** Unsafe version of {@link #attachmentCount}. */
    public static int nattachmentCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo.ATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pAttachments}. */
    @Nullable public static VkAttachmentDescription.Buffer npAttachments(long struct) { return VkAttachmentDescription.createSafe(memGetAddress(struct + VkRenderPassCreateInfo.PATTACHMENTS), nattachmentCount(struct)); }
    /** Unsafe version of {@link #subpassCount}. */
    public static int nsubpassCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo.SUBPASSCOUNT); }
    /** Unsafe version of {@link #pSubpasses}. */
    public static VkSubpassDescription.Buffer npSubpasses(long struct) { return VkSubpassDescription.create(memGetAddress(struct + VkRenderPassCreateInfo.PSUBPASSES), nsubpassCount(struct)); }
    /** Unsafe version of {@link #dependencyCount}. */
    public static int ndependencyCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo.DEPENDENCYCOUNT); }
    /** Unsafe version of {@link #pDependencies}. */
    @Nullable public static VkSubpassDependency.Buffer npDependencies(long struct) { return VkSubpassDependency.createSafe(memGetAddress(struct + VkRenderPassCreateInfo.PDEPENDENCIES), ndependencyCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code attachmentCount} field of the specified {@code struct}. */
    public static void nattachmentCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.ATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pAttachments(VkAttachmentDescription.Buffer) pAttachments}. */
    public static void npAttachments(long struct, @Nullable VkAttachmentDescription.Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo.PATTACHMENTS, memAddressSafe(value)); nattachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code subpassCount} field of the specified {@code struct}. */
    public static void nsubpassCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.SUBPASSCOUNT, value); }
    /** Unsafe version of {@link #pSubpasses(VkSubpassDescription.Buffer) pSubpasses}. */
    public static void npSubpasses(long struct, VkSubpassDescription.Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo.PSUBPASSES, value.address()); nsubpassCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code dependencyCount} field of the specified {@code struct}. */
    public static void ndependencyCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.DEPENDENCYCOUNT, value); }
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
        VkSubpassDescription.validate(pSubpasses, subpassCount);
        if (ndependencyCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassCreateInfo.PDEPENDENCIES));
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

    /** An array of {@link VkRenderPassCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassCreateInfo, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkRenderPassCreateInfo.Buffer} instance backed by the specified container.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkRenderPassCreateInfo newInstance(long address) {
            return new VkRenderPassCreateInfo(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkRenderPassCreateFlags")
        public int flags() { return VkRenderPassCreateInfo.nflags(address()); }
        /** Returns the value of the {@code attachmentCount} field. */
        @NativeType("uint32_t")
        public int attachmentCount() { return VkRenderPassCreateInfo.nattachmentCount(address()); }
        /** Returns a {@link VkAttachmentDescription.Buffer} view of the struct array pointed to by the {@code pAttachments} field. */
        @Nullable
        @NativeType("VkAttachmentDescription const *")
        public VkAttachmentDescription.Buffer pAttachments() { return VkRenderPassCreateInfo.npAttachments(address()); }
        /** Returns the value of the {@code subpassCount} field. */
        @NativeType("uint32_t")
        public int subpassCount() { return VkRenderPassCreateInfo.nsubpassCount(address()); }
        /** Returns a {@link VkSubpassDescription.Buffer} view of the struct array pointed to by the {@code pSubpasses} field. */
        @NativeType("VkSubpassDescription const *")
        public VkSubpassDescription.Buffer pSubpasses() { return VkRenderPassCreateInfo.npSubpasses(address()); }
        /** Returns the value of the {@code dependencyCount} field. */
        @NativeType("uint32_t")
        public int dependencyCount() { return VkRenderPassCreateInfo.ndependencyCount(address()); }
        /** Returns a {@link VkSubpassDependency.Buffer} view of the struct array pointed to by the {@code pDependencies} field. */
        @Nullable
        @NativeType("VkSubpassDependency const *")
        public VkSubpassDependency.Buffer pDependencies() { return VkRenderPassCreateInfo.npDependencies(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkRenderPassCreateInfo.Buffer flags(@NativeType("VkRenderPassCreateFlags") int value) { VkRenderPassCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentDescription.Buffer} to the {@code pAttachments} field. */
        public VkRenderPassCreateInfo.Buffer pAttachments(@Nullable @NativeType("VkAttachmentDescription const *") VkAttachmentDescription.Buffer value) { VkRenderPassCreateInfo.npAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDescription.Buffer} to the {@code pSubpasses} field. */
        public VkRenderPassCreateInfo.Buffer pSubpasses(@NativeType("VkSubpassDescription const *") VkSubpassDescription.Buffer value) { VkRenderPassCreateInfo.npSubpasses(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDependency.Buffer} to the {@code pDependencies} field. */
        public VkRenderPassCreateInfo.Buffer pDependencies(@Nullable @NativeType("VkSubpassDependency const *") VkSubpassDependency.Buffer value) { VkRenderPassCreateInfo.npDependencies(address(), value); return this; }

    }

}