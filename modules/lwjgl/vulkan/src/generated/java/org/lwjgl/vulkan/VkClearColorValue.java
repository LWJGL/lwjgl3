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
 * union VkClearColorValue {
 *     float float32[4];
 *     int32_t int32[4];
 *     uint32_t uint32[4];
 * }}</pre>
 */
public class VkClearColorValue extends Struct<VkClearColorValue> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLOAT32,
        INT32,
        UINT32;

    static {
        Layout layout = __union(
            __array(4, 4),
            __array(4, 4),
            __array(4, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLOAT32 = layout.offsetof(0);
        INT32 = layout.offsetof(1);
        UINT32 = layout.offsetof(2);
    }

    protected VkClearColorValue(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkClearColorValue create(long address, @Nullable ByteBuffer container) {
        return new VkClearColorValue(address, container);
    }

    /**
     * Creates a {@code VkClearColorValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClearColorValue(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FloatBuffer} view of the {@code float32} field. */
    @NativeType("float[4]")
    public FloatBuffer float32() { return nfloat32(address()); }
    /** @return the value at the specified index of the {@code float32} field. */
    public float float32(int index) { return nfloat32(address(), index); }
    /** @return a {@link IntBuffer} view of the {@code int32} field. */
    @NativeType("int32_t[4]")
    public IntBuffer int32() { return nint32(address()); }
    /** @return the value at the specified index of the {@code int32} field. */
    @NativeType("int32_t")
    public int int32(int index) { return nint32(address(), index); }
    /** @return a {@link IntBuffer} view of the {@code uint32} field. */
    @NativeType("uint32_t[4]")
    public IntBuffer uint32() { return nuint32(address()); }
    /** @return the value at the specified index of the {@code uint32} field. */
    @NativeType("uint32_t")
    public int uint32(int index) { return nuint32(address(), index); }

    /** Copies the specified {@link FloatBuffer} to the {@code float32} field. */
    public VkClearColorValue float32(@NativeType("float[4]") FloatBuffer value) { nfloat32(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code float32} field. */
    public VkClearColorValue float32(int index, float value) { nfloat32(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code int32} field. */
    public VkClearColorValue int32(@NativeType("int32_t[4]") IntBuffer value) { nint32(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code int32} field. */
    public VkClearColorValue int32(int index, @NativeType("int32_t") int value) { nint32(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code uint32} field. */
    public VkClearColorValue uint32(@NativeType("uint32_t[4]") IntBuffer value) { nuint32(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code uint32} field. */
    public VkClearColorValue uint32(int index, @NativeType("uint32_t") int value) { nuint32(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClearColorValue set(VkClearColorValue src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClearColorValue} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClearColorValue malloc() {
        return new VkClearColorValue(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkClearColorValue} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClearColorValue calloc() {
        return new VkClearColorValue(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkClearColorValue} instance allocated with {@link BufferUtils}. */
    public static VkClearColorValue create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClearColorValue(memAddress(container), container);
    }

    /** Returns a new {@code VkClearColorValue} instance for the specified memory address. */
    public static VkClearColorValue create(long address) {
        return new VkClearColorValue(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkClearColorValue createSafe(long address) {
        return address == NULL ? null : new VkClearColorValue(address, null);
    }

    /**
     * Returns a new {@link VkClearColorValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearColorValue.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClearColorValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearColorValue.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearColorValue.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearColorValue.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkClearColorValue.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClearColorValue.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkClearColorValue.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkClearColorValue mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkClearColorValue callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkClearColorValue mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkClearColorValue callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkClearColorValue.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkClearColorValue.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkClearColorValue.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkClearColorValue.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkClearColorValue} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClearColorValue malloc(MemoryStack stack) {
        return new VkClearColorValue(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkClearColorValue} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClearColorValue calloc(MemoryStack stack) {
        return new VkClearColorValue(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkClearColorValue.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearColorValue.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearColorValue.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearColorValue.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #float32}. */
    public static FloatBuffer nfloat32(long struct) { return memFloatBuffer(struct + VkClearColorValue.FLOAT32, 4); }
    /** Unsafe version of {@link #float32(int) float32}. */
    public static float nfloat32(long struct, int index) {
        return memGetFloat(struct + VkClearColorValue.FLOAT32 + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #int32}. */
    public static IntBuffer nint32(long struct) { return memIntBuffer(struct + VkClearColorValue.INT32, 4); }
    /** Unsafe version of {@link #int32(int) int32}. */
    public static int nint32(long struct, int index) {
        return memGetInt(struct + VkClearColorValue.INT32 + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #uint32}. */
    public static IntBuffer nuint32(long struct) { return memIntBuffer(struct + VkClearColorValue.UINT32, 4); }
    /** Unsafe version of {@link #uint32(int) uint32}. */
    public static int nuint32(long struct, int index) {
        return memGetInt(struct + VkClearColorValue.UINT32 + check(index, 4) * 4);
    }

    /** Unsafe version of {@link #float32(FloatBuffer) float32}. */
    public static void nfloat32(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + VkClearColorValue.FLOAT32, value.remaining() * 4);
    }
    /** Unsafe version of {@link #float32(int, float) float32}. */
    public static void nfloat32(long struct, int index, float value) {
        memPutFloat(struct + VkClearColorValue.FLOAT32 + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #int32(IntBuffer) int32}. */
    public static void nint32(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + VkClearColorValue.INT32, value.remaining() * 4);
    }
    /** Unsafe version of {@link #int32(int, int) int32}. */
    public static void nint32(long struct, int index, int value) {
        memPutInt(struct + VkClearColorValue.INT32 + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #uint32(IntBuffer) uint32}. */
    public static void nuint32(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + VkClearColorValue.UINT32, value.remaining() * 4);
    }
    /** Unsafe version of {@link #uint32(int, int) uint32}. */
    public static void nuint32(long struct, int index, int value) {
        memPutInt(struct + VkClearColorValue.UINT32 + check(index, 4) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link VkClearColorValue} structs. */
    public static class Buffer extends StructBuffer<VkClearColorValue, Buffer> implements NativeResource {

        private static final VkClearColorValue ELEMENT_FACTORY = VkClearColorValue.create(-1L);

        /**
         * Creates a new {@code VkClearColorValue.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClearColorValue#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkClearColorValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the {@code float32} field. */
        @NativeType("float[4]")
        public FloatBuffer float32() { return VkClearColorValue.nfloat32(address()); }
        /** @return the value at the specified index of the {@code float32} field. */
        public float float32(int index) { return VkClearColorValue.nfloat32(address(), index); }
        /** @return a {@link IntBuffer} view of the {@code int32} field. */
        @NativeType("int32_t[4]")
        public IntBuffer int32() { return VkClearColorValue.nint32(address()); }
        /** @return the value at the specified index of the {@code int32} field. */
        @NativeType("int32_t")
        public int int32(int index) { return VkClearColorValue.nint32(address(), index); }
        /** @return a {@link IntBuffer} view of the {@code uint32} field. */
        @NativeType("uint32_t[4]")
        public IntBuffer uint32() { return VkClearColorValue.nuint32(address()); }
        /** @return the value at the specified index of the {@code uint32} field. */
        @NativeType("uint32_t")
        public int uint32(int index) { return VkClearColorValue.nuint32(address(), index); }

        /** Copies the specified {@link FloatBuffer} to the {@code float32} field. */
        public VkClearColorValue.Buffer float32(@NativeType("float[4]") FloatBuffer value) { VkClearColorValue.nfloat32(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code float32} field. */
        public VkClearColorValue.Buffer float32(int index, float value) { VkClearColorValue.nfloat32(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code int32} field. */
        public VkClearColorValue.Buffer int32(@NativeType("int32_t[4]") IntBuffer value) { VkClearColorValue.nint32(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code int32} field. */
        public VkClearColorValue.Buffer int32(int index, @NativeType("int32_t") int value) { VkClearColorValue.nint32(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code uint32} field. */
        public VkClearColorValue.Buffer uint32(@NativeType("uint32_t[4]") IntBuffer value) { VkClearColorValue.nuint32(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code uint32} field. */
        public VkClearColorValue.Buffer uint32(int index, @NativeType("uint32_t") int value) { VkClearColorValue.nuint32(address(), index, value); return this; }

    }

}