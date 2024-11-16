/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The opaque {@code stbrp_context} struct.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct stbrp_context {
 *     int width;
 *     int height;
 *     int align;
 *     int init_mode;
 *     int heuristic;
 *     int num_nodes;
 *     {@link STBRPNode stbrp_node} * active_head;
 *     {@link STBRPNode stbrp_node} * free_head;
 *     {@link STBRPNode stbrp_node} {@link #extra}[2];
 * }</code></pre>
 */
@NativeType("struct stbrp_context")
public class STBRPContext extends Struct<STBRPContext> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIDTH,
        HEIGHT,
        ALIGN,
        INIT_MODE,
        HEURISTIC,
        NUM_NODES,
        ACTIVE_HEAD,
        FREE_HEAD,
        EXTRA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __array(STBRPNode.SIZEOF, STBRPNode.ALIGNOF, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        ALIGN = layout.offsetof(2);
        INIT_MODE = layout.offsetof(3);
        HEURISTIC = layout.offsetof(4);
        NUM_NODES = layout.offsetof(5);
        ACTIVE_HEAD = layout.offsetof(6);
        FREE_HEAD = layout.offsetof(7);
        EXTRA = layout.offsetof(8);
    }

    protected STBRPContext(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected STBRPContext create(long address, @Nullable ByteBuffer container) {
        return new STBRPContext(address, container);
    }

    /**
     * Creates a {@code STBRPContext} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBRPContext(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code width} field. */
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    public int height() { return nheight(address()); }
    /** @return the value of the {@code align} field. */
    public int align() { return nalign(address()); }
    /** @return the value of the {@code init_mode} field. */
    public int init_mode() { return ninit_mode(address()); }
    /** @return the value of the {@code heuristic} field. */
    public int heuristic() { return nheuristic(address()); }
    /** @return the value of the {@code num_nodes} field. */
    public int num_nodes() { return nnum_nodes(address()); }
    /** @return a {@link STBRPNode} view of the struct pointed to by the {@code active_head} field. */
    @NativeType("stbrp_node *")
    public @Nullable STBRPNode active_head() { return nactive_head(address()); }
    /** @return a {@link STBRPNode} view of the struct pointed to by the {@code free_head} field. */
    @NativeType("stbrp_node *")
    public @Nullable STBRPNode free_head() { return nfree_head(address()); }
    /** we allocate two extra nodes so optimal user-node-count is {@code width} not {@code width+2} */
    @NativeType("stbrp_node[2]")
    public STBRPNode.Buffer extra() { return nextra(address()); }
    /** we allocate two extra nodes so optimal user-node-count is {@code width} not {@code width+2} */
    @NativeType("stbrp_node")
    public STBRPNode extra(int index) { return nextra(address(), index); }

    // -----------------------------------

    /** Returns a new {@code STBRPContext} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBRPContext malloc() {
        return new STBRPContext(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code STBRPContext} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBRPContext calloc() {
        return new STBRPContext(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code STBRPContext} instance allocated with {@link BufferUtils}. */
    public static STBRPContext create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBRPContext(memAddress(container), container);
    }

    /** Returns a new {@code STBRPContext} instance for the specified memory address. */
    public static STBRPContext create(long address) {
        return new STBRPContext(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable STBRPContext createSafe(long address) {
        return address == NULL ? null : new STBRPContext(address, null);
    }

    /**
     * Returns a new {@link STBRPContext.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPContext.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link STBRPContext.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPContext.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBRPContext.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPContext.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link STBRPContext.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static STBRPContext.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static STBRPContext.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBRPContext mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBRPContext callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBRPContext mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBRPContext callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBRPContext.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBRPContext.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBRPContext.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBRPContext.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code STBRPContext} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBRPContext malloc(MemoryStack stack) {
        return new STBRPContext(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code STBRPContext} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBRPContext calloc(MemoryStack stack) {
        return new STBRPContext(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link STBRPContext.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBRPContext.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBRPContext.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBRPContext.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + STBRPContext.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + STBRPContext.HEIGHT); }
    /** Unsafe version of {@link #align}. */
    public static int nalign(long struct) { return memGetInt(struct + STBRPContext.ALIGN); }
    /** Unsafe version of {@link #init_mode}. */
    public static int ninit_mode(long struct) { return memGetInt(struct + STBRPContext.INIT_MODE); }
    /** Unsafe version of {@link #heuristic}. */
    public static int nheuristic(long struct) { return memGetInt(struct + STBRPContext.HEURISTIC); }
    /** Unsafe version of {@link #num_nodes}. */
    public static int nnum_nodes(long struct) { return memGetInt(struct + STBRPContext.NUM_NODES); }
    /** Unsafe version of {@link #active_head}. */
    public static @Nullable STBRPNode nactive_head(long struct) { return STBRPNode.createSafe(memGetAddress(struct + STBRPContext.ACTIVE_HEAD)); }
    /** Unsafe version of {@link #free_head}. */
    public static @Nullable STBRPNode nfree_head(long struct) { return STBRPNode.createSafe(memGetAddress(struct + STBRPContext.FREE_HEAD)); }
    /** Unsafe version of {@link #extra}. */
    public static STBRPNode.Buffer nextra(long struct) { return STBRPNode.create(struct + STBRPContext.EXTRA, 2); }
    /** Unsafe version of {@link #extra(int) extra}. */
    public static STBRPNode nextra(long struct, int index) {
        return STBRPNode.create(struct + STBRPContext.EXTRA + check(index, 2) * STBRPNode.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link STBRPContext} structs. */
    public static class Buffer extends StructBuffer<STBRPContext, Buffer> implements NativeResource {

        private static final STBRPContext ELEMENT_FACTORY = STBRPContext.create(-1L);

        /**
         * Creates a new {@code STBRPContext.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBRPContext#SIZEOF}, and its mark will be undefined.</p>
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
        protected STBRPContext getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code width} field. */
        public int width() { return STBRPContext.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        public int height() { return STBRPContext.nheight(address()); }
        /** @return the value of the {@code align} field. */
        public int align() { return STBRPContext.nalign(address()); }
        /** @return the value of the {@code init_mode} field. */
        public int init_mode() { return STBRPContext.ninit_mode(address()); }
        /** @return the value of the {@code heuristic} field. */
        public int heuristic() { return STBRPContext.nheuristic(address()); }
        /** @return the value of the {@code num_nodes} field. */
        public int num_nodes() { return STBRPContext.nnum_nodes(address()); }
        /** @return a {@link STBRPNode} view of the struct pointed to by the {@code active_head} field. */
        @NativeType("stbrp_node *")
        public @Nullable STBRPNode active_head() { return STBRPContext.nactive_head(address()); }
        /** @return a {@link STBRPNode} view of the struct pointed to by the {@code free_head} field. */
        @NativeType("stbrp_node *")
        public @Nullable STBRPNode free_head() { return STBRPContext.nfree_head(address()); }
        /** @return a {@link STBRPNode}.Buffer view of the {@link STBRPContext#extra} field. */
        @NativeType("stbrp_node[2]")
        public STBRPNode.Buffer extra() { return STBRPContext.nextra(address()); }
        /** @return a {@link STBRPNode} view of the struct at the specified index of the {@link STBRPContext#extra} field. */
        @NativeType("stbrp_node")
        public STBRPNode extra(int index) { return STBRPContext.nextra(address(), index); }

    }

}