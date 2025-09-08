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
 * <pre><code>
 * struct VkRenderPassCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkRenderPassCreateFlags flags;
 *     uint32_t attachmentCount;
 *     {@link VkAttachmentDescription VkAttachmentDescription} const * pAttachments;
 *     uint32_t subpassCount;
 *     {@link VkSubpassDescription VkSubpassDescription} const * pSubpasses;
 *     uint32_t dependencyCount;
 *     {@link VkSubpassDependency VkSubpassDependency} const * pDependencies;
 * }</code></pre>
 */
public class VkRenderPassCreateInfo extends Struct<VkRenderPassCreateInfo> implements NativeResource {

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

    protected VkRenderPassCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassCreateInfo(address, container);
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
    /** @return a {@link VkAttachmentDescription.Buffer} view of the struct array pointed to by the {@code pAttachments} field. */
    @NativeType("VkAttachmentDescription const *")
    public VkAttachmentDescription.@Nullable Buffer pAttachments() { return npAttachments(address()); }
    /** @return the value of the {@code subpassCount} field. */
    @NativeType("uint32_t")
    public int subpassCount() { return nsubpassCount(address()); }
    /** @return a {@link VkSubpassDescription.Buffer} view of the struct array pointed to by the {@code pSubpasses} field. */
    @NativeType("VkSubpassDescription const *")
    public VkSubpassDescription.Buffer pSubpasses() { return npSubpasses(address()); }
    /** @return the value of the {@code dependencyCount} field. */
    @NativeType("uint32_t")
    public int dependencyCount() { return ndependencyCount(address()); }
    /** @return a {@link VkSubpassDependency.Buffer} view of the struct array pointed to by the {@code pDependencies} field. */
    @NativeType("VkSubpassDependency const *")
    public VkSubpassDependency.@Nullable Buffer pDependencies() { return npDependencies(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO} value to the {@code sType} field. */
    public VkRenderPassCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
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
    /** Prepends the specified {@link VkRenderPassTileShadingCreateInfoQCOM} value to the {@code pNext} chain. */
    public VkRenderPassCreateInfo pNext(VkRenderPassTileShadingCreateInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkTileMemorySizeInfoQCOM} value to the {@code pNext} chain. */
    public VkRenderPassCreateInfo pNext(VkTileMemorySizeInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkRenderPassCreateInfo flags(@NativeType("VkRenderPassCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentDescription.Buffer} to the {@code pAttachments} field. */
    public VkRenderPassCreateInfo pAttachments(@NativeType("VkAttachmentDescription const *") VkAttachmentDescription.@Nullable Buffer value) { npAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDescription.Buffer} to the {@code pSubpasses} field. */
    public VkRenderPassCreateInfo pSubpasses(@NativeType("VkSubpassDescription const *") VkSubpassDescription.Buffer value) { npSubpasses(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDependency.Buffer} to the {@code pDependencies} field. */
    public VkRenderPassCreateInfo pDependencies(@NativeType("VkSubpassDependency const *") VkSubpassDependency.@Nullable Buffer value) { npDependencies(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassCreateInfo set(
        int sType,
        long pNext,
        int flags,
        VkAttachmentDescription.@Nullable Buffer pAttachments,
        VkSubpassDescription.Buffer pSubpasses,
        VkSubpassDependency.@Nullable Buffer pDependencies
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
        return new VkRenderPassCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreateInfo calloc() {
        return new VkRenderPassCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassCreateInfo} instance for the specified memory address. */
    public static VkRenderPassCreateInfo create(long address) {
        return new VkRenderPassCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderPassCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkRenderPassCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
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
    public static VkRenderPassCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
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
        return new VkRenderPassCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreateInfo calloc(MemoryStack stack) {
        return new VkRenderPassCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
    public static VkAttachmentDescription.@Nullable Buffer npAttachments(long struct) { return VkAttachmentDescription.createSafe(memGetAddress(struct + VkRenderPassCreateInfo.PATTACHMENTS), nattachmentCount(struct)); }
    /** Unsafe version of {@link #subpassCount}. */
    public static int nsubpassCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo.SUBPASSCOUNT); }
    /** Unsafe version of {@link #pSubpasses}. */
    public static VkSubpassDescription.Buffer npSubpasses(long struct) { return VkSubpassDescription.create(memGetAddress(struct + VkRenderPassCreateInfo.PSUBPASSES), nsubpassCount(struct)); }
    /** Unsafe version of {@link #dependencyCount}. */
    public static int ndependencyCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo.DEPENDENCYCOUNT); }
    /** Unsafe version of {@link #pDependencies}. */
    public static VkSubpassDependency.@Nullable Buffer npDependencies(long struct) { return VkSubpassDependency.createSafe(memGetAddress(struct + VkRenderPassCreateInfo.PDEPENDENCIES), ndependencyCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code attachmentCount} field of the specified {@code struct}. */
    public static void nattachmentCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.ATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pAttachments(VkAttachmentDescription.Buffer) pAttachments}. */
    public static void npAttachments(long struct, VkAttachmentDescription.@Nullable Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo.PATTACHMENTS, memAddressSafe(value)); nattachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code subpassCount} field of the specified {@code struct}. */
    public static void nsubpassCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.SUBPASSCOUNT, value); }
    /** Unsafe version of {@link #pSubpasses(VkSubpassDescription.Buffer) pSubpasses}. */
    public static void npSubpasses(long struct, VkSubpassDescription.Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo.PSUBPASSES, value.address()); nsubpassCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code dependencyCount} field of the specified {@code struct}. */
    public static void ndependencyCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.DEPENDENCYCOUNT, value); }
    /** Unsafe version of {@link #pDependencies(VkSubpassDependency.Buffer) pDependencies}. */
    public static void npDependencies(long struct, VkSubpassDependency.@Nullable Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo.PDEPENDENCIES, memAddressSafe(value)); ndependencyCount(struct, value == null ? 0 : value.remaining()); }

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
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkRenderPassCreateFlags")
        public int flags() { return VkRenderPassCreateInfo.nflags(address()); }
        /** @return the value of the {@code attachmentCount} field. */
        @NativeType("uint32_t")
        public int attachmentCount() { return VkRenderPassCreateInfo.nattachmentCount(address()); }
        /** @return a {@link VkAttachmentDescription.Buffer} view of the struct array pointed to by the {@code pAttachments} field. */
        @NativeType("VkAttachmentDescription const *")
        public VkAttachmentDescription.@Nullable Buffer pAttachments() { return VkRenderPassCreateInfo.npAttachments(address()); }
        /** @return the value of the {@code subpassCount} field. */
        @NativeType("uint32_t")
        public int subpassCount() { return VkRenderPassCreateInfo.nsubpassCount(address()); }
        /** @return a {@link VkSubpassDescription.Buffer} view of the struct array pointed to by the {@code pSubpasses} field. */
        @NativeType("VkSubpassDescription const *")
        public VkSubpassDescription.Buffer pSubpasses() { return VkRenderPassCreateInfo.npSubpasses(address()); }
        /** @return the value of the {@code dependencyCount} field. */
        @NativeType("uint32_t")
        public int dependencyCount() { return VkRenderPassCreateInfo.ndependencyCount(address()); }
        /** @return a {@link VkSubpassDependency.Buffer} view of the struct array pointed to by the {@code pDependencies} field. */
        @NativeType("VkSubpassDependency const *")
        public VkSubpassDependency.@Nullable Buffer pDependencies() { return VkRenderPassCreateInfo.npDependencies(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO} value to the {@code sType} field. */
        public VkRenderPassCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
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
        /** Prepends the specified {@link VkRenderPassTileShadingCreateInfoQCOM} value to the {@code pNext} chain. */
        public VkRenderPassCreateInfo.Buffer pNext(VkRenderPassTileShadingCreateInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkTileMemorySizeInfoQCOM} value to the {@code pNext} chain. */
        public VkRenderPassCreateInfo.Buffer pNext(VkTileMemorySizeInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkRenderPassCreateInfo.Buffer flags(@NativeType("VkRenderPassCreateFlags") int value) { VkRenderPassCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentDescription.Buffer} to the {@code pAttachments} field. */
        public VkRenderPassCreateInfo.Buffer pAttachments(@NativeType("VkAttachmentDescription const *") VkAttachmentDescription.@Nullable Buffer value) { VkRenderPassCreateInfo.npAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDescription.Buffer} to the {@code pSubpasses} field. */
        public VkRenderPassCreateInfo.Buffer pSubpasses(@NativeType("VkSubpassDescription const *") VkSubpassDescription.Buffer value) { VkRenderPassCreateInfo.npSubpasses(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDependency.Buffer} to the {@code pDependencies} field. */
        public VkRenderPassCreateInfo.Buffer pDependencies(@NativeType("VkSubpassDependency const *") VkSubpassDependency.@Nullable Buffer value) { VkRenderPassCreateInfo.npDependencies(address(), value); return this; }

    }

}