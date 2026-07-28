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
 * struct VkShaderInstrumentationMetricDataHeaderARM {
 *     uint32_t resultIndex;
 *     uint32_t resultSubIndex;
 *     VkShaderStageFlags stages;
 *     uint32_t basicBlockIndex;
 * }}</pre>
 */
public class VkShaderInstrumentationMetricDataHeaderARM extends Struct<VkShaderInstrumentationMetricDataHeaderARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESULTINDEX,
        RESULTSUBINDEX,
        STAGES,
        BASICBLOCKINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESULTINDEX = layout.offsetof(0);
        RESULTSUBINDEX = layout.offsetof(1);
        STAGES = layout.offsetof(2);
        BASICBLOCKINDEX = layout.offsetof(3);
    }

    protected VkShaderInstrumentationMetricDataHeaderARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkShaderInstrumentationMetricDataHeaderARM create(long address, @Nullable ByteBuffer container) {
        return new VkShaderInstrumentationMetricDataHeaderARM(address, container);
    }

    /**
     * Creates a {@code VkShaderInstrumentationMetricDataHeaderARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkShaderInstrumentationMetricDataHeaderARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code resultIndex} field. */
    @NativeType("uint32_t")
    public int resultIndex() { return nresultIndex(address()); }
    /** @return the value of the {@code resultSubIndex} field. */
    @NativeType("uint32_t")
    public int resultSubIndex() { return nresultSubIndex(address()); }
    /** @return the value of the {@code stages} field. */
    @NativeType("VkShaderStageFlags")
    public int stages() { return nstages(address()); }
    /** @return the value of the {@code basicBlockIndex} field. */
    @NativeType("uint32_t")
    public int basicBlockIndex() { return nbasicBlockIndex(address()); }

    /** Sets the specified value to the {@code resultIndex} field. */
    public VkShaderInstrumentationMetricDataHeaderARM resultIndex(@NativeType("uint32_t") int value) { nresultIndex(address(), value); return this; }
    /** Sets the specified value to the {@code resultSubIndex} field. */
    public VkShaderInstrumentationMetricDataHeaderARM resultSubIndex(@NativeType("uint32_t") int value) { nresultSubIndex(address(), value); return this; }
    /** Sets the specified value to the {@code stages} field. */
    public VkShaderInstrumentationMetricDataHeaderARM stages(@NativeType("VkShaderStageFlags") int value) { nstages(address(), value); return this; }
    /** Sets the specified value to the {@code basicBlockIndex} field. */
    public VkShaderInstrumentationMetricDataHeaderARM basicBlockIndex(@NativeType("uint32_t") int value) { nbasicBlockIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkShaderInstrumentationMetricDataHeaderARM set(
        int resultIndex,
        int resultSubIndex,
        int stages,
        int basicBlockIndex
    ) {
        resultIndex(resultIndex);
        resultSubIndex(resultSubIndex);
        stages(stages);
        basicBlockIndex(basicBlockIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkShaderInstrumentationMetricDataHeaderARM set(VkShaderInstrumentationMetricDataHeaderARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkShaderInstrumentationMetricDataHeaderARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkShaderInstrumentationMetricDataHeaderARM malloc() {
        return new VkShaderInstrumentationMetricDataHeaderARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkShaderInstrumentationMetricDataHeaderARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkShaderInstrumentationMetricDataHeaderARM calloc() {
        return new VkShaderInstrumentationMetricDataHeaderARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkShaderInstrumentationMetricDataHeaderARM} instance allocated with {@link BufferUtils}. */
    public static VkShaderInstrumentationMetricDataHeaderARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkShaderInstrumentationMetricDataHeaderARM(memAddress(container), container);
    }

    /** Returns a new {@code VkShaderInstrumentationMetricDataHeaderARM} instance for the specified memory address. */
    public static VkShaderInstrumentationMetricDataHeaderARM create(long address) {
        return new VkShaderInstrumentationMetricDataHeaderARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkShaderInstrumentationMetricDataHeaderARM createSafe(long address) {
        return address == NULL ? null : new VkShaderInstrumentationMetricDataHeaderARM(address, null);
    }

    /**
     * Returns a new {@link VkShaderInstrumentationMetricDataHeaderARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationMetricDataHeaderARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkShaderInstrumentationMetricDataHeaderARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationMetricDataHeaderARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderInstrumentationMetricDataHeaderARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationMetricDataHeaderARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkShaderInstrumentationMetricDataHeaderARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationMetricDataHeaderARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkShaderInstrumentationMetricDataHeaderARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkShaderInstrumentationMetricDataHeaderARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderInstrumentationMetricDataHeaderARM malloc(MemoryStack stack) {
        return new VkShaderInstrumentationMetricDataHeaderARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkShaderInstrumentationMetricDataHeaderARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderInstrumentationMetricDataHeaderARM calloc(MemoryStack stack) {
        return new VkShaderInstrumentationMetricDataHeaderARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkShaderInstrumentationMetricDataHeaderARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationMetricDataHeaderARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderInstrumentationMetricDataHeaderARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationMetricDataHeaderARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #resultIndex}. */
    public static int nresultIndex(long struct) { return memGetInt(struct + VkShaderInstrumentationMetricDataHeaderARM.RESULTINDEX); }
    /** Unsafe version of {@link #resultSubIndex}. */
    public static int nresultSubIndex(long struct) { return memGetInt(struct + VkShaderInstrumentationMetricDataHeaderARM.RESULTSUBINDEX); }
    /** Unsafe version of {@link #stages}. */
    public static int nstages(long struct) { return memGetInt(struct + VkShaderInstrumentationMetricDataHeaderARM.STAGES); }
    /** Unsafe version of {@link #basicBlockIndex}. */
    public static int nbasicBlockIndex(long struct) { return memGetInt(struct + VkShaderInstrumentationMetricDataHeaderARM.BASICBLOCKINDEX); }

    /** Unsafe version of {@link #resultIndex(int) resultIndex}. */
    public static void nresultIndex(long struct, int value) { memPutInt(struct + VkShaderInstrumentationMetricDataHeaderARM.RESULTINDEX, value); }
    /** Unsafe version of {@link #resultSubIndex(int) resultSubIndex}. */
    public static void nresultSubIndex(long struct, int value) { memPutInt(struct + VkShaderInstrumentationMetricDataHeaderARM.RESULTSUBINDEX, value); }
    /** Unsafe version of {@link #stages(int) stages}. */
    public static void nstages(long struct, int value) { memPutInt(struct + VkShaderInstrumentationMetricDataHeaderARM.STAGES, value); }
    /** Unsafe version of {@link #basicBlockIndex(int) basicBlockIndex}. */
    public static void nbasicBlockIndex(long struct, int value) { memPutInt(struct + VkShaderInstrumentationMetricDataHeaderARM.BASICBLOCKINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkShaderInstrumentationMetricDataHeaderARM} structs. */
    public static class Buffer extends StructBuffer<VkShaderInstrumentationMetricDataHeaderARM, Buffer> implements NativeResource {

        private static final VkShaderInstrumentationMetricDataHeaderARM ELEMENT_FACTORY = VkShaderInstrumentationMetricDataHeaderARM.create(-1L);

        /**
         * Creates a new {@code VkShaderInstrumentationMetricDataHeaderARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkShaderInstrumentationMetricDataHeaderARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkShaderInstrumentationMetricDataHeaderARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code resultIndex} field. */
        @NativeType("uint32_t")
        public int resultIndex() { return VkShaderInstrumentationMetricDataHeaderARM.nresultIndex(address()); }
        /** @return the value of the {@code resultSubIndex} field. */
        @NativeType("uint32_t")
        public int resultSubIndex() { return VkShaderInstrumentationMetricDataHeaderARM.nresultSubIndex(address()); }
        /** @return the value of the {@code stages} field. */
        @NativeType("VkShaderStageFlags")
        public int stages() { return VkShaderInstrumentationMetricDataHeaderARM.nstages(address()); }
        /** @return the value of the {@code basicBlockIndex} field. */
        @NativeType("uint32_t")
        public int basicBlockIndex() { return VkShaderInstrumentationMetricDataHeaderARM.nbasicBlockIndex(address()); }

        /** Sets the specified value to the {@code resultIndex} field. */
        public VkShaderInstrumentationMetricDataHeaderARM.Buffer resultIndex(@NativeType("uint32_t") int value) { VkShaderInstrumentationMetricDataHeaderARM.nresultIndex(address(), value); return this; }
        /** Sets the specified value to the {@code resultSubIndex} field. */
        public VkShaderInstrumentationMetricDataHeaderARM.Buffer resultSubIndex(@NativeType("uint32_t") int value) { VkShaderInstrumentationMetricDataHeaderARM.nresultSubIndex(address(), value); return this; }
        /** Sets the specified value to the {@code stages} field. */
        public VkShaderInstrumentationMetricDataHeaderARM.Buffer stages(@NativeType("VkShaderStageFlags") int value) { VkShaderInstrumentationMetricDataHeaderARM.nstages(address(), value); return this; }
        /** Sets the specified value to the {@code basicBlockIndex} field. */
        public VkShaderInstrumentationMetricDataHeaderARM.Buffer basicBlockIndex(@NativeType("uint32_t") int value) { VkShaderInstrumentationMetricDataHeaderARM.nbasicBlockIndex(address(), value); return this; }

    }

}