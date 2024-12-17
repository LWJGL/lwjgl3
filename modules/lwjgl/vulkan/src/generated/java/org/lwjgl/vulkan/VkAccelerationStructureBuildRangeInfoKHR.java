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
 * struct VkAccelerationStructureBuildRangeInfoKHR {
 *     uint32_t primitiveCount;
 *     uint32_t primitiveOffset;
 *     uint32_t firstVertex;
 *     uint32_t transformOffset;
 * }}</pre>
 */
public class VkAccelerationStructureBuildRangeInfoKHR extends Struct<VkAccelerationStructureBuildRangeInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PRIMITIVECOUNT,
        PRIMITIVEOFFSET,
        FIRSTVERTEX,
        TRANSFORMOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PRIMITIVECOUNT = layout.offsetof(0);
        PRIMITIVEOFFSET = layout.offsetof(1);
        FIRSTVERTEX = layout.offsetof(2);
        TRANSFORMOFFSET = layout.offsetof(3);
    }

    protected VkAccelerationStructureBuildRangeInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureBuildRangeInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureBuildRangeInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureBuildRangeInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureBuildRangeInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code primitiveCount} field. */
    @NativeType("uint32_t")
    public int primitiveCount() { return nprimitiveCount(address()); }
    /** @return the value of the {@code primitiveOffset} field. */
    @NativeType("uint32_t")
    public int primitiveOffset() { return nprimitiveOffset(address()); }
    /** @return the value of the {@code firstVertex} field. */
    @NativeType("uint32_t")
    public int firstVertex() { return nfirstVertex(address()); }
    /** @return the value of the {@code transformOffset} field. */
    @NativeType("uint32_t")
    public int transformOffset() { return ntransformOffset(address()); }

    /** Sets the specified value to the {@code primitiveCount} field. */
    public VkAccelerationStructureBuildRangeInfoKHR primitiveCount(@NativeType("uint32_t") int value) { nprimitiveCount(address(), value); return this; }
    /** Sets the specified value to the {@code primitiveOffset} field. */
    public VkAccelerationStructureBuildRangeInfoKHR primitiveOffset(@NativeType("uint32_t") int value) { nprimitiveOffset(address(), value); return this; }
    /** Sets the specified value to the {@code firstVertex} field. */
    public VkAccelerationStructureBuildRangeInfoKHR firstVertex(@NativeType("uint32_t") int value) { nfirstVertex(address(), value); return this; }
    /** Sets the specified value to the {@code transformOffset} field. */
    public VkAccelerationStructureBuildRangeInfoKHR transformOffset(@NativeType("uint32_t") int value) { ntransformOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureBuildRangeInfoKHR set(
        int primitiveCount,
        int primitiveOffset,
        int firstVertex,
        int transformOffset
    ) {
        primitiveCount(primitiveCount);
        primitiveOffset(primitiveOffset);
        firstVertex(firstVertex);
        transformOffset(transformOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureBuildRangeInfoKHR set(VkAccelerationStructureBuildRangeInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureBuildRangeInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureBuildRangeInfoKHR malloc() {
        return new VkAccelerationStructureBuildRangeInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureBuildRangeInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureBuildRangeInfoKHR calloc() {
        return new VkAccelerationStructureBuildRangeInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureBuildRangeInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureBuildRangeInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureBuildRangeInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureBuildRangeInfoKHR} instance for the specified memory address. */
    public static VkAccelerationStructureBuildRangeInfoKHR create(long address) {
        return new VkAccelerationStructureBuildRangeInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureBuildRangeInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureBuildRangeInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildRangeInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildRangeInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildRangeInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildRangeInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildRangeInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildRangeInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureBuildRangeInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildRangeInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureBuildRangeInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureBuildRangeInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureBuildRangeInfoKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureBuildRangeInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureBuildRangeInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureBuildRangeInfoKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureBuildRangeInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildRangeInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildRangeInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildRangeInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildRangeInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #primitiveCount}. */
    public static int nprimitiveCount(long struct) { return memGetInt(struct + VkAccelerationStructureBuildRangeInfoKHR.PRIMITIVECOUNT); }
    /** Unsafe version of {@link #primitiveOffset}. */
    public static int nprimitiveOffset(long struct) { return memGetInt(struct + VkAccelerationStructureBuildRangeInfoKHR.PRIMITIVEOFFSET); }
    /** Unsafe version of {@link #firstVertex}. */
    public static int nfirstVertex(long struct) { return memGetInt(struct + VkAccelerationStructureBuildRangeInfoKHR.FIRSTVERTEX); }
    /** Unsafe version of {@link #transformOffset}. */
    public static int ntransformOffset(long struct) { return memGetInt(struct + VkAccelerationStructureBuildRangeInfoKHR.TRANSFORMOFFSET); }

    /** Unsafe version of {@link #primitiveCount(int) primitiveCount}. */
    public static void nprimitiveCount(long struct, int value) { memPutInt(struct + VkAccelerationStructureBuildRangeInfoKHR.PRIMITIVECOUNT, value); }
    /** Unsafe version of {@link #primitiveOffset(int) primitiveOffset}. */
    public static void nprimitiveOffset(long struct, int value) { memPutInt(struct + VkAccelerationStructureBuildRangeInfoKHR.PRIMITIVEOFFSET, value); }
    /** Unsafe version of {@link #firstVertex(int) firstVertex}. */
    public static void nfirstVertex(long struct, int value) { memPutInt(struct + VkAccelerationStructureBuildRangeInfoKHR.FIRSTVERTEX, value); }
    /** Unsafe version of {@link #transformOffset(int) transformOffset}. */
    public static void ntransformOffset(long struct, int value) { memPutInt(struct + VkAccelerationStructureBuildRangeInfoKHR.TRANSFORMOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureBuildRangeInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureBuildRangeInfoKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureBuildRangeInfoKHR ELEMENT_FACTORY = VkAccelerationStructureBuildRangeInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureBuildRangeInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureBuildRangeInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureBuildRangeInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code primitiveCount} field. */
        @NativeType("uint32_t")
        public int primitiveCount() { return VkAccelerationStructureBuildRangeInfoKHR.nprimitiveCount(address()); }
        /** @return the value of the {@code primitiveOffset} field. */
        @NativeType("uint32_t")
        public int primitiveOffset() { return VkAccelerationStructureBuildRangeInfoKHR.nprimitiveOffset(address()); }
        /** @return the value of the {@code firstVertex} field. */
        @NativeType("uint32_t")
        public int firstVertex() { return VkAccelerationStructureBuildRangeInfoKHR.nfirstVertex(address()); }
        /** @return the value of the {@code transformOffset} field. */
        @NativeType("uint32_t")
        public int transformOffset() { return VkAccelerationStructureBuildRangeInfoKHR.ntransformOffset(address()); }

        /** Sets the specified value to the {@code primitiveCount} field. */
        public VkAccelerationStructureBuildRangeInfoKHR.Buffer primitiveCount(@NativeType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.nprimitiveCount(address(), value); return this; }
        /** Sets the specified value to the {@code primitiveOffset} field. */
        public VkAccelerationStructureBuildRangeInfoKHR.Buffer primitiveOffset(@NativeType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.nprimitiveOffset(address(), value); return this; }
        /** Sets the specified value to the {@code firstVertex} field. */
        public VkAccelerationStructureBuildRangeInfoKHR.Buffer firstVertex(@NativeType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.nfirstVertex(address(), value); return this; }
        /** Sets the specified value to the {@code transformOffset} field. */
        public VkAccelerationStructureBuildRangeInfoKHR.Buffer transformOffset(@NativeType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.ntransformOffset(address(), value); return this; }

    }

}