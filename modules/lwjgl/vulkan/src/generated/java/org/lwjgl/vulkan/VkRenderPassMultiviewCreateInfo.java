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
 * struct VkRenderPassMultiviewCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t subpassCount;
 *     uint32_t const * pViewMasks;
 *     uint32_t dependencyCount;
 *     int32_t const * pViewOffsets;
 *     uint32_t correlationMaskCount;
 *     uint32_t const * pCorrelationMasks;
 * }}</pre>
 */
public class VkRenderPassMultiviewCreateInfo extends Struct<VkRenderPassMultiviewCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUBPASSCOUNT,
        PVIEWMASKS,
        DEPENDENCYCOUNT,
        PVIEWOFFSETS,
        CORRELATIONMASKCOUNT,
        PCORRELATIONMASKS;

    static {
        Layout layout = __struct(
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
        SUBPASSCOUNT = layout.offsetof(2);
        PVIEWMASKS = layout.offsetof(3);
        DEPENDENCYCOUNT = layout.offsetof(4);
        PVIEWOFFSETS = layout.offsetof(5);
        CORRELATIONMASKCOUNT = layout.offsetof(6);
        PCORRELATIONMASKS = layout.offsetof(7);
    }

    protected VkRenderPassMultiviewCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassMultiviewCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassMultiviewCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkRenderPassMultiviewCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassMultiviewCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code subpassCount} field. */
    @NativeType("uint32_t")
    public int subpassCount() { return nsubpassCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pViewMasks} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pViewMasks() { return npViewMasks(address()); }
    /** @return the value of the {@code dependencyCount} field. */
    @NativeType("uint32_t")
    public int dependencyCount() { return ndependencyCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pViewOffsets} field. */
    @NativeType("int32_t const *")
    public @Nullable IntBuffer pViewOffsets() { return npViewOffsets(address()); }
    /** @return the value of the {@code correlationMaskCount} field. */
    @NativeType("uint32_t")
    public int correlationMaskCount() { return ncorrelationMaskCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pCorrelationMasks} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pCorrelationMasks() { return npCorrelationMasks(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassMultiviewCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO} value to the {@code sType} field. */
    public VkRenderPassMultiviewCreateInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassMultiviewCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pViewMasks} field. */
    public VkRenderPassMultiviewCreateInfo pViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npViewMasks(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pViewOffsets} field. */
    public VkRenderPassMultiviewCreateInfo pViewOffsets(@Nullable @NativeType("int32_t const *") IntBuffer value) { npViewOffsets(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelationMasks} field. */
    public VkRenderPassMultiviewCreateInfo pCorrelationMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npCorrelationMasks(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassMultiviewCreateInfo set(
        int sType,
        long pNext,
        @Nullable IntBuffer pViewMasks,
        @Nullable IntBuffer pViewOffsets,
        @Nullable IntBuffer pCorrelationMasks
    ) {
        sType(sType);
        pNext(pNext);
        pViewMasks(pViewMasks);
        pViewOffsets(pViewOffsets);
        pCorrelationMasks(pCorrelationMasks);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassMultiviewCreateInfo set(VkRenderPassMultiviewCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassMultiviewCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassMultiviewCreateInfo malloc() {
        return new VkRenderPassMultiviewCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassMultiviewCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassMultiviewCreateInfo calloc() {
        return new VkRenderPassMultiviewCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassMultiviewCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassMultiviewCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassMultiviewCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassMultiviewCreateInfo} instance for the specified memory address. */
    public static VkRenderPassMultiviewCreateInfo create(long address) {
        return new VkRenderPassMultiviewCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderPassMultiviewCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkRenderPassMultiviewCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderPassMultiviewCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderPassMultiviewCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassMultiviewCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassMultiviewCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassMultiviewCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassMultiviewCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassMultiviewCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassMultiviewCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassMultiviewCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassMultiviewCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkRenderPassMultiviewCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassMultiviewCreateInfo malloc(MemoryStack stack) {
        return new VkRenderPassMultiviewCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassMultiviewCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassMultiviewCreateInfo calloc(MemoryStack stack) {
        return new VkRenderPassMultiviewCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderPassMultiviewCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassMultiviewCreateInfo.PNEXT); }
    /** Unsafe version of {@link #subpassCount}. */
    public static int nsubpassCount(long struct) { return memGetInt(struct + VkRenderPassMultiviewCreateInfo.SUBPASSCOUNT); }
    /** Unsafe version of {@link #pViewMasks() pViewMasks}. */
    public static @Nullable IntBuffer npViewMasks(long struct) { return memIntBufferSafe(memGetAddress(struct + VkRenderPassMultiviewCreateInfo.PVIEWMASKS), nsubpassCount(struct)); }
    /** Unsafe version of {@link #dependencyCount}. */
    public static int ndependencyCount(long struct) { return memGetInt(struct + VkRenderPassMultiviewCreateInfo.DEPENDENCYCOUNT); }
    /** Unsafe version of {@link #pViewOffsets() pViewOffsets}. */
    public static @Nullable IntBuffer npViewOffsets(long struct) { return memIntBufferSafe(memGetAddress(struct + VkRenderPassMultiviewCreateInfo.PVIEWOFFSETS), ndependencyCount(struct)); }
    /** Unsafe version of {@link #correlationMaskCount}. */
    public static int ncorrelationMaskCount(long struct) { return memGetInt(struct + VkRenderPassMultiviewCreateInfo.CORRELATIONMASKCOUNT); }
    /** Unsafe version of {@link #pCorrelationMasks() pCorrelationMasks}. */
    public static @Nullable IntBuffer npCorrelationMasks(long struct) { return memIntBufferSafe(memGetAddress(struct + VkRenderPassMultiviewCreateInfo.PCORRELATIONMASKS), ncorrelationMaskCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassMultiviewCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassMultiviewCreateInfo.PNEXT, value); }
    /** Sets the specified value to the {@code subpassCount} field of the specified {@code struct}. */
    public static void nsubpassCount(long struct, int value) { memPutInt(struct + VkRenderPassMultiviewCreateInfo.SUBPASSCOUNT, value); }
    /** Unsafe version of {@link #pViewMasks(IntBuffer) pViewMasks}. */
    public static void npViewMasks(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkRenderPassMultiviewCreateInfo.PVIEWMASKS, memAddressSafe(value)); nsubpassCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code dependencyCount} field of the specified {@code struct}. */
    public static void ndependencyCount(long struct, int value) { memPutInt(struct + VkRenderPassMultiviewCreateInfo.DEPENDENCYCOUNT, value); }
    /** Unsafe version of {@link #pViewOffsets(IntBuffer) pViewOffsets}. */
    public static void npViewOffsets(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkRenderPassMultiviewCreateInfo.PVIEWOFFSETS, memAddressSafe(value)); ndependencyCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code correlationMaskCount} field of the specified {@code struct}. */
    public static void ncorrelationMaskCount(long struct, int value) { memPutInt(struct + VkRenderPassMultiviewCreateInfo.CORRELATIONMASKCOUNT, value); }
    /** Unsafe version of {@link #pCorrelationMasks(IntBuffer) pCorrelationMasks}. */
    public static void npCorrelationMasks(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkRenderPassMultiviewCreateInfo.PCORRELATIONMASKS, memAddressSafe(value)); ncorrelationMaskCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nsubpassCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassMultiviewCreateInfo.PVIEWMASKS));
        }
        if (ndependencyCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassMultiviewCreateInfo.PVIEWOFFSETS));
        }
        if (ncorrelationMaskCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassMultiviewCreateInfo.PCORRELATIONMASKS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassMultiviewCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassMultiviewCreateInfo, Buffer> implements NativeResource {

        private static final VkRenderPassMultiviewCreateInfo ELEMENT_FACTORY = VkRenderPassMultiviewCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkRenderPassMultiviewCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassMultiviewCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassMultiviewCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassMultiviewCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassMultiviewCreateInfo.npNext(address()); }
        /** @return the value of the {@code subpassCount} field. */
        @NativeType("uint32_t")
        public int subpassCount() { return VkRenderPassMultiviewCreateInfo.nsubpassCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pViewMasks} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pViewMasks() { return VkRenderPassMultiviewCreateInfo.npViewMasks(address()); }
        /** @return the value of the {@code dependencyCount} field. */
        @NativeType("uint32_t")
        public int dependencyCount() { return VkRenderPassMultiviewCreateInfo.ndependencyCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pViewOffsets} field. */
        @NativeType("int32_t const *")
        public @Nullable IntBuffer pViewOffsets() { return VkRenderPassMultiviewCreateInfo.npViewOffsets(address()); }
        /** @return the value of the {@code correlationMaskCount} field. */
        @NativeType("uint32_t")
        public int correlationMaskCount() { return VkRenderPassMultiviewCreateInfo.ncorrelationMaskCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pCorrelationMasks} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pCorrelationMasks() { return VkRenderPassMultiviewCreateInfo.npCorrelationMasks(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassMultiviewCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassMultiviewCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO} value to the {@code sType} field. */
        public VkRenderPassMultiviewCreateInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassMultiviewCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassMultiviewCreateInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pViewMasks} field. */
        public VkRenderPassMultiviewCreateInfo.Buffer pViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderPassMultiviewCreateInfo.npViewMasks(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pViewOffsets} field. */
        public VkRenderPassMultiviewCreateInfo.Buffer pViewOffsets(@Nullable @NativeType("int32_t const *") IntBuffer value) { VkRenderPassMultiviewCreateInfo.npViewOffsets(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelationMasks} field. */
        public VkRenderPassMultiviewCreateInfo.Buffer pCorrelationMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderPassMultiviewCreateInfo.npCorrelationMasks(address(), value); return this; }

    }

}