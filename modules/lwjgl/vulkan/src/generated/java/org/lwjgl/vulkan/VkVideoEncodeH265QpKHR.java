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
 * struct VkVideoEncodeH265QpKHR {
 *     int32_t qpI;
 *     int32_t qpP;
 *     int32_t qpB;
 * }}</pre>
 */
public class VkVideoEncodeH265QpKHR extends Struct<VkVideoEncodeH265QpKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        QPI,
        QPP,
        QPB;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        QPI = layout.offsetof(0);
        QPP = layout.offsetof(1);
        QPB = layout.offsetof(2);
    }

    protected VkVideoEncodeH265QpKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265QpKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265QpKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265QpKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265QpKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code qpI} field. */
    @NativeType("int32_t")
    public int qpI() { return nqpI(address()); }
    /** @return the value of the {@code qpP} field. */
    @NativeType("int32_t")
    public int qpP() { return nqpP(address()); }
    /** @return the value of the {@code qpB} field. */
    @NativeType("int32_t")
    public int qpB() { return nqpB(address()); }

    /** Sets the specified value to the {@code qpI} field. */
    public VkVideoEncodeH265QpKHR qpI(@NativeType("int32_t") int value) { nqpI(address(), value); return this; }
    /** Sets the specified value to the {@code qpP} field. */
    public VkVideoEncodeH265QpKHR qpP(@NativeType("int32_t") int value) { nqpP(address(), value); return this; }
    /** Sets the specified value to the {@code qpB} field. */
    public VkVideoEncodeH265QpKHR qpB(@NativeType("int32_t") int value) { nqpB(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265QpKHR set(
        int qpI,
        int qpP,
        int qpB
    ) {
        qpI(qpI);
        qpP(qpP);
        qpB(qpB);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265QpKHR set(VkVideoEncodeH265QpKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265QpKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265QpKHR malloc() {
        return new VkVideoEncodeH265QpKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265QpKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265QpKHR calloc() {
        return new VkVideoEncodeH265QpKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265QpKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265QpKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265QpKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265QpKHR} instance for the specified memory address. */
    public static VkVideoEncodeH265QpKHR create(long address) {
        return new VkVideoEncodeH265QpKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH265QpKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265QpKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265QpKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QpKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265QpKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QpKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265QpKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QpKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265QpKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QpKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH265QpKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265QpKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265QpKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265QpKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265QpKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265QpKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265QpKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265QpKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QpKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265QpKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QpKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #qpI}. */
    public static int nqpI(long struct) { return memGetInt(struct + VkVideoEncodeH265QpKHR.QPI); }
    /** Unsafe version of {@link #qpP}. */
    public static int nqpP(long struct) { return memGetInt(struct + VkVideoEncodeH265QpKHR.QPP); }
    /** Unsafe version of {@link #qpB}. */
    public static int nqpB(long struct) { return memGetInt(struct + VkVideoEncodeH265QpKHR.QPB); }

    /** Unsafe version of {@link #qpI(int) qpI}. */
    public static void nqpI(long struct, int value) { memPutInt(struct + VkVideoEncodeH265QpKHR.QPI, value); }
    /** Unsafe version of {@link #qpP(int) qpP}. */
    public static void nqpP(long struct, int value) { memPutInt(struct + VkVideoEncodeH265QpKHR.QPP, value); }
    /** Unsafe version of {@link #qpB(int) qpB}. */
    public static void nqpB(long struct, int value) { memPutInt(struct + VkVideoEncodeH265QpKHR.QPB, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265QpKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265QpKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265QpKHR ELEMENT_FACTORY = VkVideoEncodeH265QpKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265QpKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265QpKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265QpKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code qpI} field. */
        @NativeType("int32_t")
        public int qpI() { return VkVideoEncodeH265QpKHR.nqpI(address()); }
        /** @return the value of the {@code qpP} field. */
        @NativeType("int32_t")
        public int qpP() { return VkVideoEncodeH265QpKHR.nqpP(address()); }
        /** @return the value of the {@code qpB} field. */
        @NativeType("int32_t")
        public int qpB() { return VkVideoEncodeH265QpKHR.nqpB(address()); }

        /** Sets the specified value to the {@code qpI} field. */
        public VkVideoEncodeH265QpKHR.Buffer qpI(@NativeType("int32_t") int value) { VkVideoEncodeH265QpKHR.nqpI(address(), value); return this; }
        /** Sets the specified value to the {@code qpP} field. */
        public VkVideoEncodeH265QpKHR.Buffer qpP(@NativeType("int32_t") int value) { VkVideoEncodeH265QpKHR.nqpP(address(), value); return this; }
        /** Sets the specified value to the {@code qpB} field. */
        public VkVideoEncodeH265QpKHR.Buffer qpB(@NativeType("int32_t") int value) { VkVideoEncodeH265QpKHR.nqpB(address(), value); return this; }

    }

}