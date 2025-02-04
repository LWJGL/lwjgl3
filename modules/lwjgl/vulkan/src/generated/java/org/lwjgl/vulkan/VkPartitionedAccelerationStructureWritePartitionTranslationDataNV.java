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
 * struct VkPartitionedAccelerationStructureWritePartitionTranslationDataNV {
 *     uint32_t partitionIndex;
 *     float partitionTranslation[3];
 * }}</pre>
 */
public class VkPartitionedAccelerationStructureWritePartitionTranslationDataNV extends Struct<VkPartitionedAccelerationStructureWritePartitionTranslationDataNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PARTITIONINDEX,
        PARTITIONTRANSLATION;

    static {
        Layout layout = __struct(
            __member(4),
            __array(4, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PARTITIONINDEX = layout.offsetof(0);
        PARTITIONTRANSLATION = layout.offsetof(1);
    }

    protected VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPartitionedAccelerationStructureWritePartitionTranslationDataNV create(long address, @Nullable ByteBuffer container) {
        return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(address, container);
    }

    /**
     * Creates a {@code VkPartitionedAccelerationStructureWritePartitionTranslationDataNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code partitionIndex} field. */
    @NativeType("uint32_t")
    public int partitionIndex() { return npartitionIndex(address()); }
    /** @return a {@link FloatBuffer} view of the {@code partitionTranslation} field. */
    @NativeType("float[3]")
    public FloatBuffer partitionTranslation() { return npartitionTranslation(address()); }
    /** @return the value at the specified index of the {@code partitionTranslation} field. */
    public float partitionTranslation(int index) { return npartitionTranslation(address(), index); }

    /** Sets the specified value to the {@code partitionIndex} field. */
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionIndex(@NativeType("uint32_t") int value) { npartitionIndex(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code partitionTranslation} field. */
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionTranslation(@NativeType("float[3]") FloatBuffer value) { npartitionTranslation(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code partitionTranslation} field. */
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionTranslation(int index, float value) { npartitionTranslation(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV set(
        int partitionIndex,
        FloatBuffer partitionTranslation
    ) {
        partitionIndex(partitionIndex);
        partitionTranslation(partitionTranslation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV set(VkPartitionedAccelerationStructureWritePartitionTranslationDataNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPartitionedAccelerationStructureWritePartitionTranslationDataNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV malloc() {
        return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPartitionedAccelerationStructureWritePartitionTranslationDataNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV calloc() {
        return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPartitionedAccelerationStructureWritePartitionTranslationDataNV} instance allocated with {@link BufferUtils}. */
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPartitionedAccelerationStructureWritePartitionTranslationDataNV} instance for the specified memory address. */
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV create(long address) {
        return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPartitionedAccelerationStructureWritePartitionTranslationDataNV createSafe(long address) {
        return address == NULL ? null : new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(address, null);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPartitionedAccelerationStructureWritePartitionTranslationDataNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV malloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPartitionedAccelerationStructureWritePartitionTranslationDataNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV calloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #partitionIndex}. */
    public static int npartitionIndex(long struct) { return memGetInt(struct + VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.PARTITIONINDEX); }
    /** Unsafe version of {@link #partitionTranslation}. */
    public static FloatBuffer npartitionTranslation(long struct) { return memFloatBuffer(struct + VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.PARTITIONTRANSLATION, 3); }
    /** Unsafe version of {@link #partitionTranslation(int) partitionTranslation}. */
    public static float npartitionTranslation(long struct, int index) {
        return memGetFloat(struct + VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.PARTITIONTRANSLATION + check(index, 3) * 4);
    }

    /** Unsafe version of {@link #partitionIndex(int) partitionIndex}. */
    public static void npartitionIndex(long struct, int value) { memPutInt(struct + VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.PARTITIONINDEX, value); }
    /** Unsafe version of {@link #partitionTranslation(FloatBuffer) partitionTranslation}. */
    public static void npartitionTranslation(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.PARTITIONTRANSLATION, value.remaining() * 4);
    }
    /** Unsafe version of {@link #partitionTranslation(int, float) partitionTranslation}. */
    public static void npartitionTranslation(long struct, int index, float value) {
        memPutFloat(struct + VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.PARTITIONTRANSLATION + check(index, 3) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link VkPartitionedAccelerationStructureWritePartitionTranslationDataNV} structs. */
    public static class Buffer extends StructBuffer<VkPartitionedAccelerationStructureWritePartitionTranslationDataNV, Buffer> implements NativeResource {

        private static final VkPartitionedAccelerationStructureWritePartitionTranslationDataNV ELEMENT_FACTORY = VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.create(-1L);

        /**
         * Creates a new {@code VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPartitionedAccelerationStructureWritePartitionTranslationDataNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPartitionedAccelerationStructureWritePartitionTranslationDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code partitionIndex} field. */
        @NativeType("uint32_t")
        public int partitionIndex() { return VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.npartitionIndex(address()); }
        /** @return a {@link FloatBuffer} view of the {@code partitionTranslation} field. */
        @NativeType("float[3]")
        public FloatBuffer partitionTranslation() { return VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.npartitionTranslation(address()); }
        /** @return the value at the specified index of the {@code partitionTranslation} field. */
        public float partitionTranslation(int index) { return VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.npartitionTranslation(address(), index); }

        /** Sets the specified value to the {@code partitionIndex} field. */
        public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.Buffer partitionIndex(@NativeType("uint32_t") int value) { VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.npartitionIndex(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code partitionTranslation} field. */
        public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.Buffer partitionTranslation(@NativeType("float[3]") FloatBuffer value) { VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.npartitionTranslation(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code partitionTranslation} field. */
        public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.Buffer partitionTranslation(int index, float value) { VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.npartitionTranslation(address(), index, value); return this; }

    }

}