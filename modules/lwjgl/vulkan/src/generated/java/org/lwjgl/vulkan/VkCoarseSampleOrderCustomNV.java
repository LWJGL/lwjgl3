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
 * struct VkCoarseSampleOrderCustomNV {
 *     VkShadingRatePaletteEntryNV shadingRate;
 *     uint32_t sampleCount;
 *     uint32_t sampleLocationCount;
 *     {@link VkCoarseSampleLocationNV VkCoarseSampleLocationNV} const * pSampleLocations;
 * }</code></pre>
 */
public class VkCoarseSampleOrderCustomNV extends Struct<VkCoarseSampleOrderCustomNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SHADINGRATE,
        SAMPLECOUNT,
        SAMPLELOCATIONCOUNT,
        PSAMPLELOCATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SHADINGRATE = layout.offsetof(0);
        SAMPLECOUNT = layout.offsetof(1);
        SAMPLELOCATIONCOUNT = layout.offsetof(2);
        PSAMPLELOCATIONS = layout.offsetof(3);
    }

    protected VkCoarseSampleOrderCustomNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCoarseSampleOrderCustomNV create(long address, @Nullable ByteBuffer container) {
        return new VkCoarseSampleOrderCustomNV(address, container);
    }

    /**
     * Creates a {@code VkCoarseSampleOrderCustomNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCoarseSampleOrderCustomNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code shadingRate} field. */
    @NativeType("VkShadingRatePaletteEntryNV")
    public int shadingRate() { return nshadingRate(address()); }
    /** @return the value of the {@code sampleCount} field. */
    @NativeType("uint32_t")
    public int sampleCount() { return nsampleCount(address()); }
    /** @return the value of the {@code sampleLocationCount} field. */
    @NativeType("uint32_t")
    public int sampleLocationCount() { return nsampleLocationCount(address()); }
    /** @return a {@link VkCoarseSampleLocationNV.Buffer} view of the struct array pointed to by the {@code pSampleLocations} field. */
    @NativeType("VkCoarseSampleLocationNV const *")
    public VkCoarseSampleLocationNV.Buffer pSampleLocations() { return npSampleLocations(address()); }

    /** Sets the specified value to the {@code shadingRate} field. */
    public VkCoarseSampleOrderCustomNV shadingRate(@NativeType("VkShadingRatePaletteEntryNV") int value) { nshadingRate(address(), value); return this; }
    /** Sets the specified value to the {@code sampleCount} field. */
    public VkCoarseSampleOrderCustomNV sampleCount(@NativeType("uint32_t") int value) { nsampleCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkCoarseSampleLocationNV.Buffer} to the {@code pSampleLocations} field. */
    public VkCoarseSampleOrderCustomNV pSampleLocations(@NativeType("VkCoarseSampleLocationNV const *") VkCoarseSampleLocationNV.Buffer value) { npSampleLocations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCoarseSampleOrderCustomNV set(
        int shadingRate,
        int sampleCount,
        VkCoarseSampleLocationNV.Buffer pSampleLocations
    ) {
        shadingRate(shadingRate);
        sampleCount(sampleCount);
        pSampleLocations(pSampleLocations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCoarseSampleOrderCustomNV set(VkCoarseSampleOrderCustomNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCoarseSampleOrderCustomNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCoarseSampleOrderCustomNV malloc() {
        return new VkCoarseSampleOrderCustomNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCoarseSampleOrderCustomNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCoarseSampleOrderCustomNV calloc() {
        return new VkCoarseSampleOrderCustomNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCoarseSampleOrderCustomNV} instance allocated with {@link BufferUtils}. */
    public static VkCoarseSampleOrderCustomNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCoarseSampleOrderCustomNV(memAddress(container), container);
    }

    /** Returns a new {@code VkCoarseSampleOrderCustomNV} instance for the specified memory address. */
    public static VkCoarseSampleOrderCustomNV create(long address) {
        return new VkCoarseSampleOrderCustomNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCoarseSampleOrderCustomNV createSafe(long address) {
        return address == NULL ? null : new VkCoarseSampleOrderCustomNV(address, null);
    }

    /**
     * Returns a new {@link VkCoarseSampleOrderCustomNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleOrderCustomNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCoarseSampleOrderCustomNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleOrderCustomNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCoarseSampleOrderCustomNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleOrderCustomNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCoarseSampleOrderCustomNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleOrderCustomNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCoarseSampleOrderCustomNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleOrderCustomNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleOrderCustomNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleOrderCustomNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleOrderCustomNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleOrderCustomNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleOrderCustomNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleOrderCustomNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleOrderCustomNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkCoarseSampleOrderCustomNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCoarseSampleOrderCustomNV malloc(MemoryStack stack) {
        return new VkCoarseSampleOrderCustomNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCoarseSampleOrderCustomNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCoarseSampleOrderCustomNV calloc(MemoryStack stack) {
        return new VkCoarseSampleOrderCustomNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCoarseSampleOrderCustomNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleOrderCustomNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCoarseSampleOrderCustomNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleOrderCustomNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #shadingRate}. */
    public static int nshadingRate(long struct) { return memGetInt(struct + VkCoarseSampleOrderCustomNV.SHADINGRATE); }
    /** Unsafe version of {@link #sampleCount}. */
    public static int nsampleCount(long struct) { return memGetInt(struct + VkCoarseSampleOrderCustomNV.SAMPLECOUNT); }
    /** Unsafe version of {@link #sampleLocationCount}. */
    public static int nsampleLocationCount(long struct) { return memGetInt(struct + VkCoarseSampleOrderCustomNV.SAMPLELOCATIONCOUNT); }
    /** Unsafe version of {@link #pSampleLocations}. */
    public static VkCoarseSampleLocationNV.Buffer npSampleLocations(long struct) { return VkCoarseSampleLocationNV.create(memGetAddress(struct + VkCoarseSampleOrderCustomNV.PSAMPLELOCATIONS), nsampleLocationCount(struct)); }

    /** Unsafe version of {@link #shadingRate(int) shadingRate}. */
    public static void nshadingRate(long struct, int value) { memPutInt(struct + VkCoarseSampleOrderCustomNV.SHADINGRATE, value); }
    /** Unsafe version of {@link #sampleCount(int) sampleCount}. */
    public static void nsampleCount(long struct, int value) { memPutInt(struct + VkCoarseSampleOrderCustomNV.SAMPLECOUNT, value); }
    /** Sets the specified value to the {@code sampleLocationCount} field of the specified {@code struct}. */
    public static void nsampleLocationCount(long struct, int value) { memPutInt(struct + VkCoarseSampleOrderCustomNV.SAMPLELOCATIONCOUNT, value); }
    /** Unsafe version of {@link #pSampleLocations(VkCoarseSampleLocationNV.Buffer) pSampleLocations}. */
    public static void npSampleLocations(long struct, VkCoarseSampleLocationNV.Buffer value) { memPutAddress(struct + VkCoarseSampleOrderCustomNV.PSAMPLELOCATIONS, value.address()); nsampleLocationCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCoarseSampleOrderCustomNV.PSAMPLELOCATIONS));
    }

    // -----------------------------------

    /** An array of {@link VkCoarseSampleOrderCustomNV} structs. */
    public static class Buffer extends StructBuffer<VkCoarseSampleOrderCustomNV, Buffer> implements NativeResource {

        private static final VkCoarseSampleOrderCustomNV ELEMENT_FACTORY = VkCoarseSampleOrderCustomNV.create(-1L);

        /**
         * Creates a new {@code VkCoarseSampleOrderCustomNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCoarseSampleOrderCustomNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCoarseSampleOrderCustomNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code shadingRate} field. */
        @NativeType("VkShadingRatePaletteEntryNV")
        public int shadingRate() { return VkCoarseSampleOrderCustomNV.nshadingRate(address()); }
        /** @return the value of the {@code sampleCount} field. */
        @NativeType("uint32_t")
        public int sampleCount() { return VkCoarseSampleOrderCustomNV.nsampleCount(address()); }
        /** @return the value of the {@code sampleLocationCount} field. */
        @NativeType("uint32_t")
        public int sampleLocationCount() { return VkCoarseSampleOrderCustomNV.nsampleLocationCount(address()); }
        /** @return a {@link VkCoarseSampleLocationNV.Buffer} view of the struct array pointed to by the {@code pSampleLocations} field. */
        @NativeType("VkCoarseSampleLocationNV const *")
        public VkCoarseSampleLocationNV.Buffer pSampleLocations() { return VkCoarseSampleOrderCustomNV.npSampleLocations(address()); }

        /** Sets the specified value to the {@code shadingRate} field. */
        public VkCoarseSampleOrderCustomNV.Buffer shadingRate(@NativeType("VkShadingRatePaletteEntryNV") int value) { VkCoarseSampleOrderCustomNV.nshadingRate(address(), value); return this; }
        /** Sets the specified value to the {@code sampleCount} field. */
        public VkCoarseSampleOrderCustomNV.Buffer sampleCount(@NativeType("uint32_t") int value) { VkCoarseSampleOrderCustomNV.nsampleCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkCoarseSampleLocationNV.Buffer} to the {@code pSampleLocations} field. */
        public VkCoarseSampleOrderCustomNV.Buffer pSampleLocations(@NativeType("VkCoarseSampleLocationNV const *") VkCoarseSampleLocationNV.Buffer value) { VkCoarseSampleOrderCustomNV.npSampleLocations(address(), value); return this; }

    }

}