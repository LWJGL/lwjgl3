/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import org.jspecify.annotations.*;

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
 * struct CUDA_RESOURCE_VIEW_DESC {
 *     CUresourceViewFormat format;
 *     size_t width;
 *     size_t height;
 *     size_t depth;
 *     unsigned int firstMipmapLevel;
 *     unsigned int lastMipmapLevel;
 *     unsigned int firstLayer;
 *     unsigned int lastLayer;
 *     unsigned int reserved[16];
 * }</code></pre>
 */
public class CUDA_RESOURCE_VIEW_DESC extends Struct<CUDA_RESOURCE_VIEW_DESC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FORMAT,
        WIDTH,
        HEIGHT,
        DEPTH,
        FIRSTMIPMAPLEVEL,
        LASTMIPMAPLEVEL,
        FIRSTLAYER,
        LASTLAYER,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 16)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FORMAT = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        HEIGHT = layout.offsetof(2);
        DEPTH = layout.offsetof(3);
        FIRSTMIPMAPLEVEL = layout.offsetof(4);
        LASTMIPMAPLEVEL = layout.offsetof(5);
        FIRSTLAYER = layout.offsetof(6);
        LASTLAYER = layout.offsetof(7);
        RESERVED = layout.offsetof(8);
    }

    protected CUDA_RESOURCE_VIEW_DESC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUDA_RESOURCE_VIEW_DESC create(long address, @Nullable ByteBuffer container) {
        return new CUDA_RESOURCE_VIEW_DESC(address, container);
    }

    /**
     * Creates a {@code CUDA_RESOURCE_VIEW_DESC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_RESOURCE_VIEW_DESC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code format} field. */
    @NativeType("CUresourceViewFormat")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("size_t")
    public long width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("size_t")
    public long height() { return nheight(address()); }
    /** @return the value of the {@code depth} field. */
    @NativeType("size_t")
    public long depth() { return ndepth(address()); }
    /** @return the value of the {@code firstMipmapLevel} field. */
    @NativeType("unsigned int")
    public int firstMipmapLevel() { return nfirstMipmapLevel(address()); }
    /** @return the value of the {@code lastMipmapLevel} field. */
    @NativeType("unsigned int")
    public int lastMipmapLevel() { return nlastMipmapLevel(address()); }
    /** @return the value of the {@code firstLayer} field. */
    @NativeType("unsigned int")
    public int firstLayer() { return nfirstLayer(address()); }
    /** @return the value of the {@code lastLayer} field. */
    @NativeType("unsigned int")
    public int lastLayer() { return nlastLayer(address()); }
    /** @return a {@link IntBuffer} view of the {@code reserved} field. */
    @NativeType("unsigned int[16]")
    public IntBuffer reserved() { return nreserved(address()); }
    /** @return the value at the specified index of the {@code reserved} field. */
    @NativeType("unsigned int")
    public int reserved(int index) { return nreserved(address(), index); }

    /** Sets the specified value to the {@code format} field. */
    public CUDA_RESOURCE_VIEW_DESC format(@NativeType("CUresourceViewFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public CUDA_RESOURCE_VIEW_DESC width(@NativeType("size_t") long value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public CUDA_RESOURCE_VIEW_DESC height(@NativeType("size_t") long value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code depth} field. */
    public CUDA_RESOURCE_VIEW_DESC depth(@NativeType("size_t") long value) { ndepth(address(), value); return this; }
    /** Sets the specified value to the {@code firstMipmapLevel} field. */
    public CUDA_RESOURCE_VIEW_DESC firstMipmapLevel(@NativeType("unsigned int") int value) { nfirstMipmapLevel(address(), value); return this; }
    /** Sets the specified value to the {@code lastMipmapLevel} field. */
    public CUDA_RESOURCE_VIEW_DESC lastMipmapLevel(@NativeType("unsigned int") int value) { nlastMipmapLevel(address(), value); return this; }
    /** Sets the specified value to the {@code firstLayer} field. */
    public CUDA_RESOURCE_VIEW_DESC firstLayer(@NativeType("unsigned int") int value) { nfirstLayer(address(), value); return this; }
    /** Sets the specified value to the {@code lastLayer} field. */
    public CUDA_RESOURCE_VIEW_DESC lastLayer(@NativeType("unsigned int") int value) { nlastLayer(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
    public CUDA_RESOURCE_VIEW_DESC reserved(@NativeType("unsigned int[16]") IntBuffer value) { nreserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public CUDA_RESOURCE_VIEW_DESC reserved(int index, @NativeType("unsigned int") int value) { nreserved(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_RESOURCE_VIEW_DESC set(
        int format,
        long width,
        long height,
        long depth,
        int firstMipmapLevel,
        int lastMipmapLevel,
        int firstLayer,
        int lastLayer,
        IntBuffer reserved
    ) {
        format(format);
        width(width);
        height(height);
        depth(depth);
        firstMipmapLevel(firstMipmapLevel);
        lastMipmapLevel(lastMipmapLevel);
        firstLayer(firstLayer);
        lastLayer(lastLayer);
        reserved(reserved);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_RESOURCE_VIEW_DESC set(CUDA_RESOURCE_VIEW_DESC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_RESOURCE_VIEW_DESC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_RESOURCE_VIEW_DESC malloc() {
        return new CUDA_RESOURCE_VIEW_DESC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUDA_RESOURCE_VIEW_DESC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_RESOURCE_VIEW_DESC calloc() {
        return new CUDA_RESOURCE_VIEW_DESC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUDA_RESOURCE_VIEW_DESC} instance allocated with {@link BufferUtils}. */
    public static CUDA_RESOURCE_VIEW_DESC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUDA_RESOURCE_VIEW_DESC(memAddress(container), container);
    }

    /** Returns a new {@code CUDA_RESOURCE_VIEW_DESC} instance for the specified memory address. */
    public static CUDA_RESOURCE_VIEW_DESC create(long address) {
        return new CUDA_RESOURCE_VIEW_DESC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CUDA_RESOURCE_VIEW_DESC createSafe(long address) {
        return address == NULL ? null : new CUDA_RESOURCE_VIEW_DESC(address, null);
    }

    /**
     * Returns a new {@link CUDA_RESOURCE_VIEW_DESC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_RESOURCE_VIEW_DESC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_RESOURCE_VIEW_DESC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_RESOURCE_VIEW_DESC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_RESOURCE_VIEW_DESC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_RESOURCE_VIEW_DESC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUDA_RESOURCE_VIEW_DESC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_RESOURCE_VIEW_DESC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CUDA_RESOURCE_VIEW_DESC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_RESOURCE_VIEW_DESC mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_RESOURCE_VIEW_DESC callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_RESOURCE_VIEW_DESC mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_RESOURCE_VIEW_DESC callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_RESOURCE_VIEW_DESC.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_RESOURCE_VIEW_DESC.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_RESOURCE_VIEW_DESC.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_RESOURCE_VIEW_DESC.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CUDA_RESOURCE_VIEW_DESC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_RESOURCE_VIEW_DESC malloc(MemoryStack stack) {
        return new CUDA_RESOURCE_VIEW_DESC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUDA_RESOURCE_VIEW_DESC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_RESOURCE_VIEW_DESC calloc(MemoryStack stack) {
        return new CUDA_RESOURCE_VIEW_DESC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUDA_RESOURCE_VIEW_DESC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_RESOURCE_VIEW_DESC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_RESOURCE_VIEW_DESC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_RESOURCE_VIEW_DESC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + CUDA_RESOURCE_VIEW_DESC.FORMAT); }
    /** Unsafe version of {@link #width}. */
    public static long nwidth(long struct) { return memGetAddress(struct + CUDA_RESOURCE_VIEW_DESC.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static long nheight(long struct) { return memGetAddress(struct + CUDA_RESOURCE_VIEW_DESC.HEIGHT); }
    /** Unsafe version of {@link #depth}. */
    public static long ndepth(long struct) { return memGetAddress(struct + CUDA_RESOURCE_VIEW_DESC.DEPTH); }
    /** Unsafe version of {@link #firstMipmapLevel}. */
    public static int nfirstMipmapLevel(long struct) { return memGetInt(struct + CUDA_RESOURCE_VIEW_DESC.FIRSTMIPMAPLEVEL); }
    /** Unsafe version of {@link #lastMipmapLevel}. */
    public static int nlastMipmapLevel(long struct) { return memGetInt(struct + CUDA_RESOURCE_VIEW_DESC.LASTMIPMAPLEVEL); }
    /** Unsafe version of {@link #firstLayer}. */
    public static int nfirstLayer(long struct) { return memGetInt(struct + CUDA_RESOURCE_VIEW_DESC.FIRSTLAYER); }
    /** Unsafe version of {@link #lastLayer}. */
    public static int nlastLayer(long struct) { return memGetInt(struct + CUDA_RESOURCE_VIEW_DESC.LASTLAYER); }
    /** Unsafe version of {@link #reserved}. */
    public static IntBuffer nreserved(long struct) { return memIntBuffer(struct + CUDA_RESOURCE_VIEW_DESC.RESERVED, 16); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static int nreserved(long struct, int index) {
        return memGetInt(struct + CUDA_RESOURCE_VIEW_DESC.RESERVED + check(index, 16) * 4);
    }

    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + CUDA_RESOURCE_VIEW_DESC.FORMAT, value); }
    /** Unsafe version of {@link #width(long) width}. */
    public static void nwidth(long struct, long value) { memPutAddress(struct + CUDA_RESOURCE_VIEW_DESC.WIDTH, value); }
    /** Unsafe version of {@link #height(long) height}. */
    public static void nheight(long struct, long value) { memPutAddress(struct + CUDA_RESOURCE_VIEW_DESC.HEIGHT, value); }
    /** Unsafe version of {@link #depth(long) depth}. */
    public static void ndepth(long struct, long value) { memPutAddress(struct + CUDA_RESOURCE_VIEW_DESC.DEPTH, value); }
    /** Unsafe version of {@link #firstMipmapLevel(int) firstMipmapLevel}. */
    public static void nfirstMipmapLevel(long struct, int value) { memPutInt(struct + CUDA_RESOURCE_VIEW_DESC.FIRSTMIPMAPLEVEL, value); }
    /** Unsafe version of {@link #lastMipmapLevel(int) lastMipmapLevel}. */
    public static void nlastMipmapLevel(long struct, int value) { memPutInt(struct + CUDA_RESOURCE_VIEW_DESC.LASTMIPMAPLEVEL, value); }
    /** Unsafe version of {@link #firstLayer(int) firstLayer}. */
    public static void nfirstLayer(long struct, int value) { memPutInt(struct + CUDA_RESOURCE_VIEW_DESC.FIRSTLAYER, value); }
    /** Unsafe version of {@link #lastLayer(int) lastLayer}. */
    public static void nlastLayer(long struct, int value) { memPutInt(struct + CUDA_RESOURCE_VIEW_DESC.LASTLAYER, value); }
    /** Unsafe version of {@link #reserved(IntBuffer) reserved}. */
    public static void nreserved(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 16); }
        memCopy(memAddress(value), struct + CUDA_RESOURCE_VIEW_DESC.RESERVED, value.remaining() * 4);
    }
    /** Unsafe version of {@link #reserved(int, int) reserved}. */
    public static void nreserved(long struct, int index, int value) {
        memPutInt(struct + CUDA_RESOURCE_VIEW_DESC.RESERVED + check(index, 16) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link CUDA_RESOURCE_VIEW_DESC} structs. */
    public static class Buffer extends StructBuffer<CUDA_RESOURCE_VIEW_DESC, Buffer> implements NativeResource {

        private static final CUDA_RESOURCE_VIEW_DESC ELEMENT_FACTORY = CUDA_RESOURCE_VIEW_DESC.create(-1L);

        /**
         * Creates a new {@code CUDA_RESOURCE_VIEW_DESC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_RESOURCE_VIEW_DESC#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUDA_RESOURCE_VIEW_DESC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code format} field. */
        @NativeType("CUresourceViewFormat")
        public int format() { return CUDA_RESOURCE_VIEW_DESC.nformat(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("size_t")
        public long width() { return CUDA_RESOURCE_VIEW_DESC.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("size_t")
        public long height() { return CUDA_RESOURCE_VIEW_DESC.nheight(address()); }
        /** @return the value of the {@code depth} field. */
        @NativeType("size_t")
        public long depth() { return CUDA_RESOURCE_VIEW_DESC.ndepth(address()); }
        /** @return the value of the {@code firstMipmapLevel} field. */
        @NativeType("unsigned int")
        public int firstMipmapLevel() { return CUDA_RESOURCE_VIEW_DESC.nfirstMipmapLevel(address()); }
        /** @return the value of the {@code lastMipmapLevel} field. */
        @NativeType("unsigned int")
        public int lastMipmapLevel() { return CUDA_RESOURCE_VIEW_DESC.nlastMipmapLevel(address()); }
        /** @return the value of the {@code firstLayer} field. */
        @NativeType("unsigned int")
        public int firstLayer() { return CUDA_RESOURCE_VIEW_DESC.nfirstLayer(address()); }
        /** @return the value of the {@code lastLayer} field. */
        @NativeType("unsigned int")
        public int lastLayer() { return CUDA_RESOURCE_VIEW_DESC.nlastLayer(address()); }
        /** @return a {@link IntBuffer} view of the {@code reserved} field. */
        @NativeType("unsigned int[16]")
        public IntBuffer reserved() { return CUDA_RESOURCE_VIEW_DESC.nreserved(address()); }
        /** @return the value at the specified index of the {@code reserved} field. */
        @NativeType("unsigned int")
        public int reserved(int index) { return CUDA_RESOURCE_VIEW_DESC.nreserved(address(), index); }

        /** Sets the specified value to the {@code format} field. */
        public CUDA_RESOURCE_VIEW_DESC.Buffer format(@NativeType("CUresourceViewFormat") int value) { CUDA_RESOURCE_VIEW_DESC.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public CUDA_RESOURCE_VIEW_DESC.Buffer width(@NativeType("size_t") long value) { CUDA_RESOURCE_VIEW_DESC.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public CUDA_RESOURCE_VIEW_DESC.Buffer height(@NativeType("size_t") long value) { CUDA_RESOURCE_VIEW_DESC.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code depth} field. */
        public CUDA_RESOURCE_VIEW_DESC.Buffer depth(@NativeType("size_t") long value) { CUDA_RESOURCE_VIEW_DESC.ndepth(address(), value); return this; }
        /** Sets the specified value to the {@code firstMipmapLevel} field. */
        public CUDA_RESOURCE_VIEW_DESC.Buffer firstMipmapLevel(@NativeType("unsigned int") int value) { CUDA_RESOURCE_VIEW_DESC.nfirstMipmapLevel(address(), value); return this; }
        /** Sets the specified value to the {@code lastMipmapLevel} field. */
        public CUDA_RESOURCE_VIEW_DESC.Buffer lastMipmapLevel(@NativeType("unsigned int") int value) { CUDA_RESOURCE_VIEW_DESC.nlastMipmapLevel(address(), value); return this; }
        /** Sets the specified value to the {@code firstLayer} field. */
        public CUDA_RESOURCE_VIEW_DESC.Buffer firstLayer(@NativeType("unsigned int") int value) { CUDA_RESOURCE_VIEW_DESC.nfirstLayer(address(), value); return this; }
        /** Sets the specified value to the {@code lastLayer} field. */
        public CUDA_RESOURCE_VIEW_DESC.Buffer lastLayer(@NativeType("unsigned int") int value) { CUDA_RESOURCE_VIEW_DESC.nlastLayer(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
        public CUDA_RESOURCE_VIEW_DESC.Buffer reserved(@NativeType("unsigned int[16]") IntBuffer value) { CUDA_RESOURCE_VIEW_DESC.nreserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public CUDA_RESOURCE_VIEW_DESC.Buffer reserved(int index, @NativeType("unsigned int") int value) { CUDA_RESOURCE_VIEW_DESC.nreserved(address(), index, value); return this; }

    }

}