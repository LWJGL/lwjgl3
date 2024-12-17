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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
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
 * }}</pre>
 */
public class VkRenderPassCreateInfo2 extends Struct<VkRenderPassCreateInfo2> implements NativeResource {

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

    protected VkRenderPassCreateInfo2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassCreateInfo2 create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassCreateInfo2(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkRenderPassCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code attachmentCount} field. */
    @NativeType("uint32_t")
    public int attachmentCount() { return nattachmentCount(address()); }
    /** @return a {@link VkAttachmentDescription2.Buffer} view of the struct array pointed to by the {@code pAttachments} field. */
    @NativeType("VkAttachmentDescription2 const *")
    public VkAttachmentDescription2.@Nullable Buffer pAttachments() { return npAttachments(address()); }
    /** @return the value of the {@code subpassCount} field. */
    @NativeType("uint32_t")
    public int subpassCount() { return nsubpassCount(address()); }
    /** @return a {@link VkSubpassDescription2.Buffer} view of the struct array pointed to by the {@code pSubpasses} field. */
    @NativeType("VkSubpassDescription2 const *")
    public VkSubpassDescription2.Buffer pSubpasses() { return npSubpasses(address()); }
    /** @return the value of the {@code dependencyCount} field. */
    @NativeType("uint32_t")
    public int dependencyCount() { return ndependencyCount(address()); }
    /** @return a {@link VkSubpassDependency2.Buffer} view of the struct array pointed to by the {@code pDependencies} field. */
    @NativeType("VkSubpassDependency2 const *")
    public VkSubpassDependency2.@Nullable Buffer pDependencies() { return npDependencies(address()); }
    /** @return the value of the {@code correlatedViewMaskCount} field. */
    @NativeType("uint32_t")
    public int correlatedViewMaskCount() { return ncorrelatedViewMaskCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pCorrelatedViewMasks} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pCorrelatedViewMasks() { return npCorrelatedViewMasks(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassCreateInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2 STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2} value to the {@code sType} field. */
    public VkRenderPassCreateInfo2 sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassCreateInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkRenderPassCreationControlEXT} value to the {@code pNext} chain. */
    public VkRenderPassCreateInfo2 pNext(VkRenderPassCreationControlEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
    public VkRenderPassCreateInfo2 pNext(VkRenderPassCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassFragmentDensityMapCreateInfoEXT} value to the {@code pNext} chain. */
    public VkRenderPassCreateInfo2 pNext(VkRenderPassFragmentDensityMapCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkRenderPassCreateInfo2 flags(@NativeType("VkRenderPassCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentDescription2.Buffer} to the {@code pAttachments} field. */
    public VkRenderPassCreateInfo2 pAttachments(@NativeType("VkAttachmentDescription2 const *") VkAttachmentDescription2.@Nullable Buffer value) { npAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDescription2.Buffer} to the {@code pSubpasses} field. */
    public VkRenderPassCreateInfo2 pSubpasses(@NativeType("VkSubpassDescription2 const *") VkSubpassDescription2.Buffer value) { npSubpasses(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDependency2.Buffer} to the {@code pDependencies} field. */
    public VkRenderPassCreateInfo2 pDependencies(@NativeType("VkSubpassDependency2 const *") VkSubpassDependency2.@Nullable Buffer value) { npDependencies(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelatedViewMasks} field. */
    public VkRenderPassCreateInfo2 pCorrelatedViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npCorrelatedViewMasks(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassCreateInfo2 set(
        int sType,
        long pNext,
        int flags,
        VkAttachmentDescription2.@Nullable Buffer pAttachments,
        VkSubpassDescription2.Buffer pSubpasses,
        VkSubpassDependency2.@Nullable Buffer pDependencies,
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
        return new VkRenderPassCreateInfo2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassCreateInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreateInfo2 calloc() {
        return new VkRenderPassCreateInfo2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassCreateInfo2} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassCreateInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassCreateInfo2(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassCreateInfo2} instance for the specified memory address. */
    public static VkRenderPassCreateInfo2 create(long address) {
        return new VkRenderPassCreateInfo2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderPassCreateInfo2 createSafe(long address) {
        return address == NULL ? null : new VkRenderPassCreateInfo2(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderPassCreateInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderPassCreateInfo2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderPassCreateInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreateInfo2 malloc(MemoryStack stack) {
        return new VkRenderPassCreateInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassCreateInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreateInfo2 calloc(MemoryStack stack) {
        return new VkRenderPassCreateInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassCreateInfo2.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2.FLAGS); }
    /** Unsafe version of {@link #attachmentCount}. */
    public static int nattachmentCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2.ATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pAttachments}. */
    public static VkAttachmentDescription2.@Nullable Buffer npAttachments(long struct) { return VkAttachmentDescription2.createSafe(memGetAddress(struct + VkRenderPassCreateInfo2.PATTACHMENTS), nattachmentCount(struct)); }
    /** Unsafe version of {@link #subpassCount}. */
    public static int nsubpassCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2.SUBPASSCOUNT); }
    /** Unsafe version of {@link #pSubpasses}. */
    public static VkSubpassDescription2.Buffer npSubpasses(long struct) { return VkSubpassDescription2.create(memGetAddress(struct + VkRenderPassCreateInfo2.PSUBPASSES), nsubpassCount(struct)); }
    /** Unsafe version of {@link #dependencyCount}. */
    public static int ndependencyCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2.DEPENDENCYCOUNT); }
    /** Unsafe version of {@link #pDependencies}. */
    public static VkSubpassDependency2.@Nullable Buffer npDependencies(long struct) { return VkSubpassDependency2.createSafe(memGetAddress(struct + VkRenderPassCreateInfo2.PDEPENDENCIES), ndependencyCount(struct)); }
    /** Unsafe version of {@link #correlatedViewMaskCount}. */
    public static int ncorrelatedViewMaskCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2.CORRELATEDVIEWMASKCOUNT); }
    /** Unsafe version of {@link #pCorrelatedViewMasks() pCorrelatedViewMasks}. */
    public static @Nullable IntBuffer npCorrelatedViewMasks(long struct) { return memIntBufferSafe(memGetAddress(struct + VkRenderPassCreateInfo2.PCORRELATEDVIEWMASKS), ncorrelatedViewMaskCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassCreateInfo2.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2.FLAGS, value); }
    /** Sets the specified value to the {@code attachmentCount} field of the specified {@code struct}. */
    public static void nattachmentCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2.ATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pAttachments(VkAttachmentDescription2.Buffer) pAttachments}. */
    public static void npAttachments(long struct, VkAttachmentDescription2.@Nullable Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo2.PATTACHMENTS, memAddressSafe(value)); nattachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code subpassCount} field of the specified {@code struct}. */
    public static void nsubpassCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2.SUBPASSCOUNT, value); }
    /** Unsafe version of {@link #pSubpasses(VkSubpassDescription2.Buffer) pSubpasses}. */
    public static void npSubpasses(long struct, VkSubpassDescription2.Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo2.PSUBPASSES, value.address()); nsubpassCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code dependencyCount} field of the specified {@code struct}. */
    public static void ndependencyCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2.DEPENDENCYCOUNT, value); }
    /** Unsafe version of {@link #pDependencies(VkSubpassDependency2.Buffer) pDependencies}. */
    public static void npDependencies(long struct, VkSubpassDependency2.@Nullable Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo2.PDEPENDENCIES, memAddressSafe(value)); ndependencyCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code correlatedViewMaskCount} field of the specified {@code struct}. */
    public static void ncorrelatedViewMaskCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2.CORRELATEDVIEWMASKCOUNT, value); }
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
        validate(pSubpasses, subpassCount, VkSubpassDescription2.SIZEOF, VkSubpassDescription2::validate);
        if (ndependencyCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassCreateInfo2.PDEPENDENCIES));
        }
        if (ncorrelatedViewMaskCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassCreateInfo2.PCORRELATEDVIEWMASKS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassCreateInfo2} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassCreateInfo2, Buffer> implements NativeResource {

        private static final VkRenderPassCreateInfo2 ELEMENT_FACTORY = VkRenderPassCreateInfo2.create(-1L);

        /**
         * Creates a new {@code VkRenderPassCreateInfo2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassCreateInfo2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassCreateInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassCreateInfo2.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassCreateInfo2.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkRenderPassCreateFlags")
        public int flags() { return VkRenderPassCreateInfo2.nflags(address()); }
        /** @return the value of the {@code attachmentCount} field. */
        @NativeType("uint32_t")
        public int attachmentCount() { return VkRenderPassCreateInfo2.nattachmentCount(address()); }
        /** @return a {@link VkAttachmentDescription2.Buffer} view of the struct array pointed to by the {@code pAttachments} field. */
        @NativeType("VkAttachmentDescription2 const *")
        public VkAttachmentDescription2.@Nullable Buffer pAttachments() { return VkRenderPassCreateInfo2.npAttachments(address()); }
        /** @return the value of the {@code subpassCount} field. */
        @NativeType("uint32_t")
        public int subpassCount() { return VkRenderPassCreateInfo2.nsubpassCount(address()); }
        /** @return a {@link VkSubpassDescription2.Buffer} view of the struct array pointed to by the {@code pSubpasses} field. */
        @NativeType("VkSubpassDescription2 const *")
        public VkSubpassDescription2.Buffer pSubpasses() { return VkRenderPassCreateInfo2.npSubpasses(address()); }
        /** @return the value of the {@code dependencyCount} field. */
        @NativeType("uint32_t")
        public int dependencyCount() { return VkRenderPassCreateInfo2.ndependencyCount(address()); }
        /** @return a {@link VkSubpassDependency2.Buffer} view of the struct array pointed to by the {@code pDependencies} field. */
        @NativeType("VkSubpassDependency2 const *")
        public VkSubpassDependency2.@Nullable Buffer pDependencies() { return VkRenderPassCreateInfo2.npDependencies(address()); }
        /** @return the value of the {@code correlatedViewMaskCount} field. */
        @NativeType("uint32_t")
        public int correlatedViewMaskCount() { return VkRenderPassCreateInfo2.ncorrelatedViewMaskCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pCorrelatedViewMasks} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pCorrelatedViewMasks() { return VkRenderPassCreateInfo2.npCorrelatedViewMasks(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassCreateInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassCreateInfo2.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2 STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2} value to the {@code sType} field. */
        public VkRenderPassCreateInfo2.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassCreateInfo2.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassCreateInfo2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkRenderPassCreationControlEXT} value to the {@code pNext} chain. */
        public VkRenderPassCreateInfo2.Buffer pNext(VkRenderPassCreationControlEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
        public VkRenderPassCreateInfo2.Buffer pNext(VkRenderPassCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassFragmentDensityMapCreateInfoEXT} value to the {@code pNext} chain. */
        public VkRenderPassCreateInfo2.Buffer pNext(VkRenderPassFragmentDensityMapCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkRenderPassCreateInfo2.Buffer flags(@NativeType("VkRenderPassCreateFlags") int value) { VkRenderPassCreateInfo2.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentDescription2.Buffer} to the {@code pAttachments} field. */
        public VkRenderPassCreateInfo2.Buffer pAttachments(@NativeType("VkAttachmentDescription2 const *") VkAttachmentDescription2.@Nullable Buffer value) { VkRenderPassCreateInfo2.npAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDescription2.Buffer} to the {@code pSubpasses} field. */
        public VkRenderPassCreateInfo2.Buffer pSubpasses(@NativeType("VkSubpassDescription2 const *") VkSubpassDescription2.Buffer value) { VkRenderPassCreateInfo2.npSubpasses(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDependency2.Buffer} to the {@code pDependencies} field. */
        public VkRenderPassCreateInfo2.Buffer pDependencies(@NativeType("VkSubpassDependency2 const *") VkSubpassDependency2.@Nullable Buffer value) { VkRenderPassCreateInfo2.npDependencies(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelatedViewMasks} field. */
        public VkRenderPassCreateInfo2.Buffer pCorrelatedViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderPassCreateInfo2.npCorrelatedViewMasks(address(), value); return this; }

    }

}