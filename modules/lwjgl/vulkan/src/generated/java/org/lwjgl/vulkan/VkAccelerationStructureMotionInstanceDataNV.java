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
 * union VkAccelerationStructureMotionInstanceDataNV {
 *     {@link VkAccelerationStructureInstanceKHR VkAccelerationStructureInstanceKHR} staticInstance;
 *     {@link VkAccelerationStructureMatrixMotionInstanceNV VkAccelerationStructureMatrixMotionInstanceNV} matrixMotionInstance;
 *     {@link VkAccelerationStructureSRTMotionInstanceNV VkAccelerationStructureSRTMotionInstanceNV} srtMotionInstance;
 * }}</pre>
 */
public class VkAccelerationStructureMotionInstanceDataNV extends Struct<VkAccelerationStructureMotionInstanceDataNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STATICINSTANCE,
        MATRIXMOTIONINSTANCE,
        SRTMOTIONINSTANCE;

    static {
        Layout layout = __union(
            __member(VkAccelerationStructureInstanceKHR.SIZEOF, VkAccelerationStructureInstanceKHR.ALIGNOF),
            __member(VkAccelerationStructureMatrixMotionInstanceNV.SIZEOF, VkAccelerationStructureMatrixMotionInstanceNV.ALIGNOF),
            __member(VkAccelerationStructureSRTMotionInstanceNV.SIZEOF, VkAccelerationStructureSRTMotionInstanceNV.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STATICINSTANCE = layout.offsetof(0);
        MATRIXMOTIONINSTANCE = layout.offsetof(1);
        SRTMOTIONINSTANCE = layout.offsetof(2);
    }

    protected VkAccelerationStructureMotionInstanceDataNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureMotionInstanceDataNV create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureMotionInstanceDataNV(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureMotionInstanceDataNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureMotionInstanceDataNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link VkAccelerationStructureInstanceKHR} view of the {@code staticInstance} field. */
    public VkAccelerationStructureInstanceKHR staticInstance() { return nstaticInstance(address()); }
    /** @return a {@link VkAccelerationStructureMatrixMotionInstanceNV} view of the {@code matrixMotionInstance} field. */
    public VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance() { return nmatrixMotionInstance(address()); }
    /** @return a {@link VkAccelerationStructureSRTMotionInstanceNV} view of the {@code srtMotionInstance} field. */
    public VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance() { return nsrtMotionInstance(address()); }

    /** Copies the specified {@link VkAccelerationStructureInstanceKHR} to the {@code staticInstance} field. */
    public VkAccelerationStructureMotionInstanceDataNV staticInstance(VkAccelerationStructureInstanceKHR value) { nstaticInstance(address(), value); return this; }
    /** Passes the {@code staticInstance} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureMotionInstanceDataNV staticInstance(java.util.function.Consumer<VkAccelerationStructureInstanceKHR> consumer) { consumer.accept(staticInstance()); return this; }
    /** Copies the specified {@link VkAccelerationStructureMatrixMotionInstanceNV} to the {@code matrixMotionInstance} field. */
    public VkAccelerationStructureMotionInstanceDataNV matrixMotionInstance(VkAccelerationStructureMatrixMotionInstanceNV value) { nmatrixMotionInstance(address(), value); return this; }
    /** Passes the {@code matrixMotionInstance} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureMotionInstanceDataNV matrixMotionInstance(java.util.function.Consumer<VkAccelerationStructureMatrixMotionInstanceNV> consumer) { consumer.accept(matrixMotionInstance()); return this; }
    /** Copies the specified {@link VkAccelerationStructureSRTMotionInstanceNV} to the {@code srtMotionInstance} field. */
    public VkAccelerationStructureMotionInstanceDataNV srtMotionInstance(VkAccelerationStructureSRTMotionInstanceNV value) { nsrtMotionInstance(address(), value); return this; }
    /** Passes the {@code srtMotionInstance} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureMotionInstanceDataNV srtMotionInstance(java.util.function.Consumer<VkAccelerationStructureSRTMotionInstanceNV> consumer) { consumer.accept(srtMotionInstance()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureMotionInstanceDataNV set(VkAccelerationStructureMotionInstanceDataNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureMotionInstanceDataNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureMotionInstanceDataNV malloc() {
        return new VkAccelerationStructureMotionInstanceDataNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureMotionInstanceDataNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureMotionInstanceDataNV calloc() {
        return new VkAccelerationStructureMotionInstanceDataNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureMotionInstanceDataNV} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureMotionInstanceDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureMotionInstanceDataNV(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureMotionInstanceDataNV} instance for the specified memory address. */
    public static VkAccelerationStructureMotionInstanceDataNV create(long address) {
        return new VkAccelerationStructureMotionInstanceDataNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureMotionInstanceDataNV createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureMotionInstanceDataNV(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMotionInstanceDataNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInstanceDataNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMotionInstanceDataNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInstanceDataNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMotionInstanceDataNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInstanceDataNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureMotionInstanceDataNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInstanceDataNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureMotionInstanceDataNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureMotionInstanceDataNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureMotionInstanceDataNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureMotionInstanceDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureMotionInstanceDataNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureMotionInstanceDataNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureMotionInstanceDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMotionInstanceDataNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInstanceDataNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMotionInstanceDataNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInstanceDataNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #staticInstance}. */
    public static VkAccelerationStructureInstanceKHR nstaticInstance(long struct) { return VkAccelerationStructureInstanceKHR.create(struct + VkAccelerationStructureMotionInstanceDataNV.STATICINSTANCE); }
    /** Unsafe version of {@link #matrixMotionInstance}. */
    public static VkAccelerationStructureMatrixMotionInstanceNV nmatrixMotionInstance(long struct) { return VkAccelerationStructureMatrixMotionInstanceNV.create(struct + VkAccelerationStructureMotionInstanceDataNV.MATRIXMOTIONINSTANCE); }
    /** Unsafe version of {@link #srtMotionInstance}. */
    public static VkAccelerationStructureSRTMotionInstanceNV nsrtMotionInstance(long struct) { return VkAccelerationStructureSRTMotionInstanceNV.create(struct + VkAccelerationStructureMotionInstanceDataNV.SRTMOTIONINSTANCE); }

    /** Unsafe version of {@link #staticInstance(VkAccelerationStructureInstanceKHR) staticInstance}. */
    public static void nstaticInstance(long struct, VkAccelerationStructureInstanceKHR value) { memCopy(value.address(), struct + VkAccelerationStructureMotionInstanceDataNV.STATICINSTANCE, VkAccelerationStructureInstanceKHR.SIZEOF); }
    /** Unsafe version of {@link #matrixMotionInstance(VkAccelerationStructureMatrixMotionInstanceNV) matrixMotionInstance}. */
    public static void nmatrixMotionInstance(long struct, VkAccelerationStructureMatrixMotionInstanceNV value) { memCopy(value.address(), struct + VkAccelerationStructureMotionInstanceDataNV.MATRIXMOTIONINSTANCE, VkAccelerationStructureMatrixMotionInstanceNV.SIZEOF); }
    /** Unsafe version of {@link #srtMotionInstance(VkAccelerationStructureSRTMotionInstanceNV) srtMotionInstance}. */
    public static void nsrtMotionInstance(long struct, VkAccelerationStructureSRTMotionInstanceNV value) { memCopy(value.address(), struct + VkAccelerationStructureMotionInstanceDataNV.SRTMOTIONINSTANCE, VkAccelerationStructureSRTMotionInstanceNV.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureMotionInstanceDataNV} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureMotionInstanceDataNV, Buffer> implements NativeResource {

        private static final VkAccelerationStructureMotionInstanceDataNV ELEMENT_FACTORY = VkAccelerationStructureMotionInstanceDataNV.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureMotionInstanceDataNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureMotionInstanceDataNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureMotionInstanceDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkAccelerationStructureInstanceKHR} view of the {@code staticInstance} field. */
        public VkAccelerationStructureInstanceKHR staticInstance() { return VkAccelerationStructureMotionInstanceDataNV.nstaticInstance(address()); }
        /** @return a {@link VkAccelerationStructureMatrixMotionInstanceNV} view of the {@code matrixMotionInstance} field. */
        public VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance() { return VkAccelerationStructureMotionInstanceDataNV.nmatrixMotionInstance(address()); }
        /** @return a {@link VkAccelerationStructureSRTMotionInstanceNV} view of the {@code srtMotionInstance} field. */
        public VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance() { return VkAccelerationStructureMotionInstanceDataNV.nsrtMotionInstance(address()); }

        /** Copies the specified {@link VkAccelerationStructureInstanceKHR} to the {@code staticInstance} field. */
        public VkAccelerationStructureMotionInstanceDataNV.Buffer staticInstance(VkAccelerationStructureInstanceKHR value) { VkAccelerationStructureMotionInstanceDataNV.nstaticInstance(address(), value); return this; }
        /** Passes the {@code staticInstance} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureMotionInstanceDataNV.Buffer staticInstance(java.util.function.Consumer<VkAccelerationStructureInstanceKHR> consumer) { consumer.accept(staticInstance()); return this; }
        /** Copies the specified {@link VkAccelerationStructureMatrixMotionInstanceNV} to the {@code matrixMotionInstance} field. */
        public VkAccelerationStructureMotionInstanceDataNV.Buffer matrixMotionInstance(VkAccelerationStructureMatrixMotionInstanceNV value) { VkAccelerationStructureMotionInstanceDataNV.nmatrixMotionInstance(address(), value); return this; }
        /** Passes the {@code matrixMotionInstance} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureMotionInstanceDataNV.Buffer matrixMotionInstance(java.util.function.Consumer<VkAccelerationStructureMatrixMotionInstanceNV> consumer) { consumer.accept(matrixMotionInstance()); return this; }
        /** Copies the specified {@link VkAccelerationStructureSRTMotionInstanceNV} to the {@code srtMotionInstance} field. */
        public VkAccelerationStructureMotionInstanceDataNV.Buffer srtMotionInstance(VkAccelerationStructureSRTMotionInstanceNV value) { VkAccelerationStructureMotionInstanceDataNV.nsrtMotionInstance(address(), value); return this; }
        /** Passes the {@code srtMotionInstance} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureMotionInstanceDataNV.Buffer srtMotionInstance(java.util.function.Consumer<VkAccelerationStructureSRTMotionInstanceNV> consumer) { consumer.accept(srtMotionInstance()); return this; }

    }

}