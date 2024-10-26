/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_MEMSET_NODE_PARAMS_v2 {
 *     CUdeviceptr dst;
 *     size_t pitch;
 *     unsigned int value;
 *     unsigned int elementSize;
 *     size_t width;
 *     size_t height;
 *     CUcontext ctx;
 * }</code></pre>
 */
public class CUDA_MEMSET_NODE_PARAMS_v2 extends Struct<CUDA_MEMSET_NODE_PARAMS_v2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DST,
        PITCH,
        VALUE,
        ELEMENTSIZE,
        WIDTH,
        HEIGHT,
        CTX;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DST = layout.offsetof(0);
        PITCH = layout.offsetof(1);
        VALUE = layout.offsetof(2);
        ELEMENTSIZE = layout.offsetof(3);
        WIDTH = layout.offsetof(4);
        HEIGHT = layout.offsetof(5);
        CTX = layout.offsetof(6);
    }

    protected CUDA_MEMSET_NODE_PARAMS_v2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUDA_MEMSET_NODE_PARAMS_v2 create(long address, @Nullable ByteBuffer container) {
        return new CUDA_MEMSET_NODE_PARAMS_v2(address, container);
    }

    /**
     * Creates a {@code CUDA_MEMSET_NODE_PARAMS_v2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_MEMSET_NODE_PARAMS_v2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code dst} field. */
    @NativeType("CUdeviceptr")
    public long dst() { return ndst(address()); }
    /** @return the value of the {@code pitch} field. */
    @NativeType("size_t")
    public long pitch() { return npitch(address()); }
    /** @return the value of the {@code value} field. */
    @NativeType("unsigned int")
    public int value() { return nvalue(address()); }
    /** @return the value of the {@code elementSize} field. */
    @NativeType("unsigned int")
    public int elementSize() { return nelementSize(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("size_t")
    public long width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("size_t")
    public long height() { return nheight(address()); }
    /** @return the value of the {@code ctx} field. */
    @NativeType("CUcontext")
    public long ctx() { return nctx(address()); }

    /** Sets the specified value to the {@code dst} field. */
    public CUDA_MEMSET_NODE_PARAMS_v2 dst(@NativeType("CUdeviceptr") long value) { ndst(address(), value); return this; }
    /** Sets the specified value to the {@code pitch} field. */
    public CUDA_MEMSET_NODE_PARAMS_v2 pitch(@NativeType("size_t") long value) { npitch(address(), value); return this; }
    /** Sets the specified value to the {@code value} field. */
    public CUDA_MEMSET_NODE_PARAMS_v2 value(@NativeType("unsigned int") int value) { nvalue(address(), value); return this; }
    /** Sets the specified value to the {@code elementSize} field. */
    public CUDA_MEMSET_NODE_PARAMS_v2 elementSize(@NativeType("unsigned int") int value) { nelementSize(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public CUDA_MEMSET_NODE_PARAMS_v2 width(@NativeType("size_t") long value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public CUDA_MEMSET_NODE_PARAMS_v2 height(@NativeType("size_t") long value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code ctx} field. */
    public CUDA_MEMSET_NODE_PARAMS_v2 ctx(@NativeType("CUcontext") long value) { nctx(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_MEMSET_NODE_PARAMS_v2 set(
        long dst,
        long pitch,
        int value,
        int elementSize,
        long width,
        long height,
        long ctx
    ) {
        dst(dst);
        pitch(pitch);
        value(value);
        elementSize(elementSize);
        width(width);
        height(height);
        ctx(ctx);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_MEMSET_NODE_PARAMS_v2 set(CUDA_MEMSET_NODE_PARAMS_v2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_MEMSET_NODE_PARAMS_v2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_MEMSET_NODE_PARAMS_v2 malloc() {
        return new CUDA_MEMSET_NODE_PARAMS_v2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUDA_MEMSET_NODE_PARAMS_v2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_MEMSET_NODE_PARAMS_v2 calloc() {
        return new CUDA_MEMSET_NODE_PARAMS_v2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUDA_MEMSET_NODE_PARAMS_v2} instance allocated with {@link BufferUtils}. */
    public static CUDA_MEMSET_NODE_PARAMS_v2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUDA_MEMSET_NODE_PARAMS_v2(memAddress(container), container);
    }

    /** Returns a new {@code CUDA_MEMSET_NODE_PARAMS_v2} instance for the specified memory address. */
    public static CUDA_MEMSET_NODE_PARAMS_v2 create(long address) {
        return new CUDA_MEMSET_NODE_PARAMS_v2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_MEMSET_NODE_PARAMS_v2 createSafe(long address) {
        return address == NULL ? null : new CUDA_MEMSET_NODE_PARAMS_v2(address, null);
    }

    /**
     * Returns a new {@link CUDA_MEMSET_NODE_PARAMS_v2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMSET_NODE_PARAMS_v2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEMSET_NODE_PARAMS_v2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMSET_NODE_PARAMS_v2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEMSET_NODE_PARAMS_v2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMSET_NODE_PARAMS_v2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUDA_MEMSET_NODE_PARAMS_v2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMSET_NODE_PARAMS_v2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_MEMSET_NODE_PARAMS_v2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUDA_MEMSET_NODE_PARAMS_v2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_MEMSET_NODE_PARAMS_v2 malloc(MemoryStack stack) {
        return new CUDA_MEMSET_NODE_PARAMS_v2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUDA_MEMSET_NODE_PARAMS_v2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_MEMSET_NODE_PARAMS_v2 calloc(MemoryStack stack) {
        return new CUDA_MEMSET_NODE_PARAMS_v2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUDA_MEMSET_NODE_PARAMS_v2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMSET_NODE_PARAMS_v2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEMSET_NODE_PARAMS_v2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMSET_NODE_PARAMS_v2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #dst}. */
    public static long ndst(long struct) { return memGetAddress(struct + CUDA_MEMSET_NODE_PARAMS_v2.DST); }
    /** Unsafe version of {@link #pitch}. */
    public static long npitch(long struct) { return memGetAddress(struct + CUDA_MEMSET_NODE_PARAMS_v2.PITCH); }
    /** Unsafe version of {@link #value}. */
    public static int nvalue(long struct) { return memGetInt(struct + CUDA_MEMSET_NODE_PARAMS_v2.VALUE); }
    /** Unsafe version of {@link #elementSize}. */
    public static int nelementSize(long struct) { return memGetInt(struct + CUDA_MEMSET_NODE_PARAMS_v2.ELEMENTSIZE); }
    /** Unsafe version of {@link #width}. */
    public static long nwidth(long struct) { return memGetAddress(struct + CUDA_MEMSET_NODE_PARAMS_v2.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static long nheight(long struct) { return memGetAddress(struct + CUDA_MEMSET_NODE_PARAMS_v2.HEIGHT); }
    /** Unsafe version of {@link #ctx}. */
    public static long nctx(long struct) { return memGetAddress(struct + CUDA_MEMSET_NODE_PARAMS_v2.CTX); }

    /** Unsafe version of {@link #dst(long) dst}. */
    public static void ndst(long struct, long value) { memPutAddress(struct + CUDA_MEMSET_NODE_PARAMS_v2.DST, check(value)); }
    /** Unsafe version of {@link #pitch(long) pitch}. */
    public static void npitch(long struct, long value) { memPutAddress(struct + CUDA_MEMSET_NODE_PARAMS_v2.PITCH, value); }
    /** Unsafe version of {@link #value(int) value}. */
    public static void nvalue(long struct, int value) { memPutInt(struct + CUDA_MEMSET_NODE_PARAMS_v2.VALUE, value); }
    /** Unsafe version of {@link #elementSize(int) elementSize}. */
    public static void nelementSize(long struct, int value) { memPutInt(struct + CUDA_MEMSET_NODE_PARAMS_v2.ELEMENTSIZE, value); }
    /** Unsafe version of {@link #width(long) width}. */
    public static void nwidth(long struct, long value) { memPutAddress(struct + CUDA_MEMSET_NODE_PARAMS_v2.WIDTH, value); }
    /** Unsafe version of {@link #height(long) height}. */
    public static void nheight(long struct, long value) { memPutAddress(struct + CUDA_MEMSET_NODE_PARAMS_v2.HEIGHT, value); }
    /** Unsafe version of {@link #ctx(long) ctx}. */
    public static void nctx(long struct, long value) { memPutAddress(struct + CUDA_MEMSET_NODE_PARAMS_v2.CTX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CUDA_MEMSET_NODE_PARAMS_v2.DST));
    }

    // -----------------------------------

    /** An array of {@link CUDA_MEMSET_NODE_PARAMS_v2} structs. */
    public static class Buffer extends StructBuffer<CUDA_MEMSET_NODE_PARAMS_v2, Buffer> implements NativeResource {

        private static final CUDA_MEMSET_NODE_PARAMS_v2 ELEMENT_FACTORY = CUDA_MEMSET_NODE_PARAMS_v2.create(-1L);

        /**
         * Creates a new {@code CUDA_MEMSET_NODE_PARAMS_v2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_MEMSET_NODE_PARAMS_v2#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUDA_MEMSET_NODE_PARAMS_v2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code dst} field. */
        @NativeType("CUdeviceptr")
        public long dst() { return CUDA_MEMSET_NODE_PARAMS_v2.ndst(address()); }
        /** @return the value of the {@code pitch} field. */
        @NativeType("size_t")
        public long pitch() { return CUDA_MEMSET_NODE_PARAMS_v2.npitch(address()); }
        /** @return the value of the {@code value} field. */
        @NativeType("unsigned int")
        public int value() { return CUDA_MEMSET_NODE_PARAMS_v2.nvalue(address()); }
        /** @return the value of the {@code elementSize} field. */
        @NativeType("unsigned int")
        public int elementSize() { return CUDA_MEMSET_NODE_PARAMS_v2.nelementSize(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("size_t")
        public long width() { return CUDA_MEMSET_NODE_PARAMS_v2.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("size_t")
        public long height() { return CUDA_MEMSET_NODE_PARAMS_v2.nheight(address()); }
        /** @return the value of the {@code ctx} field. */
        @NativeType("CUcontext")
        public long ctx() { return CUDA_MEMSET_NODE_PARAMS_v2.nctx(address()); }

        /** Sets the specified value to the {@code dst} field. */
        public CUDA_MEMSET_NODE_PARAMS_v2.Buffer dst(@NativeType("CUdeviceptr") long value) { CUDA_MEMSET_NODE_PARAMS_v2.ndst(address(), value); return this; }
        /** Sets the specified value to the {@code pitch} field. */
        public CUDA_MEMSET_NODE_PARAMS_v2.Buffer pitch(@NativeType("size_t") long value) { CUDA_MEMSET_NODE_PARAMS_v2.npitch(address(), value); return this; }
        /** Sets the specified value to the {@code value} field. */
        public CUDA_MEMSET_NODE_PARAMS_v2.Buffer value(@NativeType("unsigned int") int value) { CUDA_MEMSET_NODE_PARAMS_v2.nvalue(address(), value); return this; }
        /** Sets the specified value to the {@code elementSize} field. */
        public CUDA_MEMSET_NODE_PARAMS_v2.Buffer elementSize(@NativeType("unsigned int") int value) { CUDA_MEMSET_NODE_PARAMS_v2.nelementSize(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public CUDA_MEMSET_NODE_PARAMS_v2.Buffer width(@NativeType("size_t") long value) { CUDA_MEMSET_NODE_PARAMS_v2.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public CUDA_MEMSET_NODE_PARAMS_v2.Buffer height(@NativeType("size_t") long value) { CUDA_MEMSET_NODE_PARAMS_v2.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code ctx} field. */
        public CUDA_MEMSET_NODE_PARAMS_v2.Buffer ctx(@NativeType("CUcontext") long value) { CUDA_MEMSET_NODE_PARAMS_v2.nctx(address(), value); return this; }

    }

}