/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * An opaque structure which holds all the context needed from {@link STBTruetype#stbtt_PackBegin PackBegin} to {@link STBTruetype#stbtt_PackEnd PackEnd}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct stbtt_pack_context {
 *     void * user_allocator_context;
 *     {@link STBRPContext stbrp_context} * pack_info;
 *     int width;
 *     int height;
 *     int stride_in_bytes;
 *     int padding;
 *     int skip_missing;
 *     unsigned int h_oversample;
 *     unsigned int v_oversample;
 *     unsigned char * pixels;
 *     {@link STBRPNode stbrp_node} * nodes;
 * }</code></pre>
 */
@NativeType("struct stbtt_pack_context")
public class STBTTPackContext extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        USER_ALLOCATOR_CONTEXT,
        PACK_INFO,
        WIDTH,
        HEIGHT,
        STRIDE_IN_BYTES,
        PADDING,
        SKIP_MISSING,
        H_OVERSAMPLE,
        V_OVERSAMPLE,
        PIXELS,
        NODES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        USER_ALLOCATOR_CONTEXT = layout.offsetof(0);
        PACK_INFO = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        HEIGHT = layout.offsetof(3);
        STRIDE_IN_BYTES = layout.offsetof(4);
        PADDING = layout.offsetof(5);
        SKIP_MISSING = layout.offsetof(6);
        H_OVERSAMPLE = layout.offsetof(7);
        V_OVERSAMPLE = layout.offsetof(8);
        PIXELS = layout.offsetof(9);
        NODES = layout.offsetof(10);
    }

    /**
     * Creates a {@code STBTTPackContext} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBTTPackContext(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code user_allocator_context} field. */
    @NativeType("void *")
    public long user_allocator_context() { return nuser_allocator_context(address()); }
    /** @return a {@link STBRPContext} view of the struct pointed to by the {@code pack_info} field. */
    @NativeType("stbrp_context *")
    public STBRPContext pack_info() { return npack_info(address()); }
    /** @return the value of the {@code width} field. */
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    public int height() { return nheight(address()); }
    /** @return the value of the {@code stride_in_bytes} field. */
    public int stride_in_bytes() { return nstride_in_bytes(address()); }
    /** @return the value of the {@code padding} field. */
    public int padding() { return npadding(address()); }
    /** @return the value of the {@code skip_missing} field. */
    @NativeType("int")
    public boolean skip_missing() { return nskip_missing(address()) != 0; }
    /** @return the value of the {@code h_oversample} field. */
    @NativeType("unsigned int")
    public int h_oversample() { return nh_oversample(address()); }
    /** @return the value of the {@code v_oversample} field. */
    @NativeType("unsigned int")
    public int v_oversample() { return nv_oversample(address()); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code pixels} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("unsigned char *")
    public ByteBuffer pixels(int capacity) { return npixels(address(), capacity); }
    /**
     * @return a {@link STBRPNode.Buffer} view of the struct array pointed to by the {@code nodes} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("stbrp_node *")
    public STBRPNode.Buffer nodes(int capacity) { return nnodes(address(), capacity); }

    // -----------------------------------

    /** Returns a new {@code STBTTPackContext} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBTTPackContext malloc() {
        return wrap(STBTTPackContext.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code STBTTPackContext} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBTTPackContext calloc() {
        return wrap(STBTTPackContext.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code STBTTPackContext} instance allocated with {@link BufferUtils}. */
    public static STBTTPackContext create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(STBTTPackContext.class, memAddress(container), container);
    }

    /** Returns a new {@code STBTTPackContext} instance for the specified memory address. */
    public static STBTTPackContext create(long address) {
        return wrap(STBTTPackContext.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBTTPackContext createSafe(long address) {
        return address == NULL ? null : wrap(STBTTPackContext.class, address);
    }

    /**
     * Returns a new {@link STBTTPackContext.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTPackContext.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link STBTTPackContext.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTPackContext.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTPackContext.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTPackContext.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link STBTTPackContext.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static STBTTPackContext.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBTTPackContext.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBTTPackContext mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBTTPackContext callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBTTPackContext mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBTTPackContext callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTPackContext.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTPackContext.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTPackContext.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTPackContext.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code STBTTPackContext} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTPackContext malloc(MemoryStack stack) {
        return wrap(STBTTPackContext.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code STBTTPackContext} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTPackContext calloc(MemoryStack stack) {
        return wrap(STBTTPackContext.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link STBTTPackContext.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBTTPackContext.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTPackContext.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBTTPackContext.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #user_allocator_context}. */
    public static long nuser_allocator_context(long struct) { return memGetAddress(struct + STBTTPackContext.USER_ALLOCATOR_CONTEXT); }
    /** Unsafe version of {@link #pack_info}. */
    public static STBRPContext npack_info(long struct) { return STBRPContext.create(memGetAddress(struct + STBTTPackContext.PACK_INFO)); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + STBTTPackContext.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + STBTTPackContext.HEIGHT); }
    /** Unsafe version of {@link #stride_in_bytes}. */
    public static int nstride_in_bytes(long struct) { return UNSAFE.getInt(null, struct + STBTTPackContext.STRIDE_IN_BYTES); }
    /** Unsafe version of {@link #padding}. */
    public static int npadding(long struct) { return UNSAFE.getInt(null, struct + STBTTPackContext.PADDING); }
    /** Unsafe version of {@link #skip_missing}. */
    public static int nskip_missing(long struct) { return UNSAFE.getInt(null, struct + STBTTPackContext.SKIP_MISSING); }
    /** Unsafe version of {@link #h_oversample}. */
    public static int nh_oversample(long struct) { return UNSAFE.getInt(null, struct + STBTTPackContext.H_OVERSAMPLE); }
    /** Unsafe version of {@link #v_oversample}. */
    public static int nv_oversample(long struct) { return UNSAFE.getInt(null, struct + STBTTPackContext.V_OVERSAMPLE); }
    /** Unsafe version of {@link #pixels(int) pixels}. */
    public static ByteBuffer npixels(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + STBTTPackContext.PIXELS), capacity); }
    /** Unsafe version of {@link #nodes}. */
    public static STBRPNode.Buffer nnodes(long struct, int capacity) { return STBRPNode.create(memGetAddress(struct + STBTTPackContext.NODES), capacity); }

    // -----------------------------------

    /** An array of {@link STBTTPackContext} structs. */
    public static class Buffer extends StructBuffer<STBTTPackContext, Buffer> implements NativeResource {

        private static final STBTTPackContext ELEMENT_FACTORY = STBTTPackContext.create(-1L);

        /**
         * Creates a new {@code STBTTPackContext.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBTTPackContext#SIZEOF}, and its mark will be undefined.
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
        protected STBTTPackContext getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code user_allocator_context} field. */
        @NativeType("void *")
        public long user_allocator_context() { return STBTTPackContext.nuser_allocator_context(address()); }
        /** @return a {@link STBRPContext} view of the struct pointed to by the {@code pack_info} field. */
        @NativeType("stbrp_context *")
        public STBRPContext pack_info() { return STBTTPackContext.npack_info(address()); }
        /** @return the value of the {@code width} field. */
        public int width() { return STBTTPackContext.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        public int height() { return STBTTPackContext.nheight(address()); }
        /** @return the value of the {@code stride_in_bytes} field. */
        public int stride_in_bytes() { return STBTTPackContext.nstride_in_bytes(address()); }
        /** @return the value of the {@code padding} field. */
        public int padding() { return STBTTPackContext.npadding(address()); }
        /** @return the value of the {@code skip_missing} field. */
        @NativeType("int")
        public boolean skip_missing() { return STBTTPackContext.nskip_missing(address()) != 0; }
        /** @return the value of the {@code h_oversample} field. */
        @NativeType("unsigned int")
        public int h_oversample() { return STBTTPackContext.nh_oversample(address()); }
        /** @return the value of the {@code v_oversample} field. */
        @NativeType("unsigned int")
        public int v_oversample() { return STBTTPackContext.nv_oversample(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code pixels} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned char *")
        public ByteBuffer pixels(int capacity) { return STBTTPackContext.npixels(address(), capacity); }
        /**
         * @return a {@link STBRPNode.Buffer} view of the struct array pointed to by the {@code nodes} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("stbrp_node *")
        public STBRPNode.Buffer nodes(int capacity) { return STBTTPackContext.nnodes(address(), capacity); }

    }

}