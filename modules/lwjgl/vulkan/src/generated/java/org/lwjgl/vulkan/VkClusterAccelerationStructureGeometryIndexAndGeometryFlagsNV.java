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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV {
 *     uint32_t geometryIndex : 24;
 *     uint32_t reserved : 5;
 *     uint32_t geometryFlags : 3;
 * }}</pre>
 */
public class VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV extends Struct<VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BITFIELD0;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BITFIELD0 = layout.offsetof(0);
    }

    protected VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV create(long address, @Nullable ByteBuffer container) {
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(address, container);
    }

    /**
     * Creates a {@code VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code geometryIndex} field. */
    @NativeType("uint32_t")
    public int geometryIndex() { return ngeometryIndex(address()); }
    /** @return the value of the {@code reserved} field. */
    @NativeType("uint32_t")
    public int reserved() { return nreserved(address()); }
    /** @return the value of the {@code geometryFlags} field. */
    @NativeType("uint32_t")
    public int geometryFlags() { return ngeometryFlags(address()); }

    /** Sets the specified value to the {@code geometryIndex} field. */
    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV geometryIndex(@NativeType("uint32_t") int value) { ngeometryIndex(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV reserved(@NativeType("uint32_t") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code geometryFlags} field. */
    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV geometryFlags(@NativeType("uint32_t") int value) { ngeometryFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV set(
        int geometryIndex,
        int reserved,
        int geometryFlags
    ) {
        geometryIndex(geometryIndex);
        reserved(reserved);
        geometryFlags(geometryFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV set(VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV malloc() {
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV calloc() {
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV} instance allocated with {@link BufferUtils}. */
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(memAddress(container), container);
    }

    /** Returns a new {@code VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV} instance for the specified memory address. */
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV create(long address) {
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV createSafe(long address) {
        return address == NULL ? null : new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(address, null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return memGetInt(struct + VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.BITFIELD0); }
    /** Unsafe version of {@link #geometryIndex}. */
    public static int ngeometryIndex(long struct) { return nbitfield0(struct) & 0x00_FF_FF_FF; }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return (nbitfield0(struct) & 0x1F_00_00_00) >>> 24; }
    /** Unsafe version of {@link #geometryFlags}. */
    public static int ngeometryFlags(long struct) { return nbitfield0(struct) >>> 29; }

    public static void nbitfield0(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.BITFIELD0, value); }
    /** Unsafe version of {@link #geometryIndex(int) geometryIndex}. */
    public static void ngeometryIndex(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_00_00_00) | (value & 0x00_FF_FF_FF)); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { nbitfield0(struct, ((value << 24) & 0x1F_00_00_00) | (nbitfield0(struct) & 0xE0_FF_FF_FF)); }
    /** Unsafe version of {@link #geometryFlags(int) geometryFlags}. */
    public static void ngeometryFlags(long struct, int value) { nbitfield0(struct, (value << 29) | (nbitfield0(struct) & 0x1F_FF_FF_FF)); }

    // -----------------------------------

    /** An array of {@link VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV} structs. */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV, Buffer> implements NativeResource {

        private static final VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV ELEMENT_FACTORY = VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.create(-1L);

        /**
         * Creates a new {@code VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code geometryIndex} field. */
        @NativeType("uint32_t")
        public int geometryIndex() { return VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ngeometryIndex(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("uint32_t")
        public int reserved() { return VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.nreserved(address()); }
        /** @return the value of the {@code geometryFlags} field. */
        @NativeType("uint32_t")
        public int geometryFlags() { return VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ngeometryFlags(address()); }

        /** Sets the specified value to the {@code geometryIndex} field. */
        public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer geometryIndex(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ngeometryIndex(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer reserved(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code geometryFlags} field. */
        public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer geometryFlags(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ngeometryFlags(address(), value); return this; }

    }

}