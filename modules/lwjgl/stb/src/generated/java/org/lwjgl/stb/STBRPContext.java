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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The opaque {@code stbrp_context} struct.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code extra} &ndash; we allocate two extra nodes so optimal user-node-count is {@code width} not {@code width+2}</li>
 * </ul>
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
 *     {@link STBRPNode stbrp_node} extra[2];
 * }</code></pre>
 */
@NativeType("struct stbrp_context")
public class STBRPContext extends Struct implements NativeResource {

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

    STBRPContext(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link STBRPContext} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBRPContext(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code width} field. */
    public int width() { return nwidth(address()); }
    /** Returns the value of the {@code height} field. */
    public int height() { return nheight(address()); }
    /** Returns the value of the {@code align} field. */
    public int align() { return nalign(address()); }
    /** Returns the value of the {@code init_mode} field. */
    public int init_mode() { return ninit_mode(address()); }
    /** Returns the value of the {@code heuristic} field. */
    public int heuristic() { return nheuristic(address()); }
    /** Returns the value of the {@code num_nodes} field. */
    public int num_nodes() { return nnum_nodes(address()); }
    /** Returns a {@link STBRPNode} view of the struct pointed to by the {@code active_head} field. */
    @Nullable
    @NativeType("stbrp_node *")
    public STBRPNode active_head() { return nactive_head(address()); }
    /** Returns a {@link STBRPNode} view of the struct pointed to by the {@code free_head} field. */
    @Nullable
    @NativeType("stbrp_node *")
    public STBRPNode free_head() { return nfree_head(address()); }
    /** Returns a {@link STBRPNode}.Buffer view of the {@code extra} field. */
    @NativeType("stbrp_node[2]")
    public STBRPNode.Buffer extra() { return nextra(address()); }
    /** Returns a {@link STBRPNode} view of the struct at the specified index of the {@code extra} field. */
    @NativeType("stbrp_node")
    public STBRPNode extra(int index) { return nextra(address(), index); }

    // -----------------------------------

    /** Returns a new {@link STBRPContext} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBRPContext malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link STBRPContext} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBRPContext calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link STBRPContext} instance allocated with {@link BufferUtils}. */
    public static STBRPContext create() {
        return new STBRPContext(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link STBRPContext} instance for the specified memory address. */
    public static STBRPContext create(long address) {
        return new STBRPContext(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBRPContext createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link STBRPContext.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPContext.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBRPContext.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPContext.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBRPContext.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPContext.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
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
    @Nullable
    public static STBRPContext.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link STBRPContext} instance allocated on the thread-local {@link MemoryStack}. */
    public static STBRPContext mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link STBRPContext} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static STBRPContext callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link STBRPContext} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBRPContext mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link STBRPContext} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBRPContext callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link STBRPContext.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPContext.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link STBRPContext.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPContext.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link STBRPContext.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBRPContext.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBRPContext.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBRPContext.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
    @Nullable public static STBRPNode nactive_head(long struct) { return STBRPNode.createSafe(memGetAddress(struct + STBRPContext.ACTIVE_HEAD)); }
    /** Unsafe version of {@link #free_head}. */
    @Nullable public static STBRPNode nfree_head(long struct) { return STBRPNode.createSafe(memGetAddress(struct + STBRPContext.FREE_HEAD)); }
    /** Unsafe version of {@link #extra}. */
    public static STBRPNode.Buffer nextra(long struct) { return STBRPNode.create(struct + STBRPContext.EXTRA, 2); }
    /** Unsafe version of {@link #extra(int) extra}. */
    public static STBRPNode nextra(long struct, int index) {
        return STBRPNode.create(struct + STBRPContext.EXTRA + check(index, 2) * STBRPNode.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link STBRPContext} structs. */
    public static class Buffer extends StructBuffer<STBRPContext, Buffer> implements NativeResource {

        /**
         * Creates a new {@link STBRPContext.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBRPContext#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected STBRPContext newInstance(long address) {
            return new STBRPContext(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code width} field. */
        public int width() { return STBRPContext.nwidth(address()); }
        /** Returns the value of the {@code height} field. */
        public int height() { return STBRPContext.nheight(address()); }
        /** Returns the value of the {@code align} field. */
        public int align() { return STBRPContext.nalign(address()); }
        /** Returns the value of the {@code init_mode} field. */
        public int init_mode() { return STBRPContext.ninit_mode(address()); }
        /** Returns the value of the {@code heuristic} field. */
        public int heuristic() { return STBRPContext.nheuristic(address()); }
        /** Returns the value of the {@code num_nodes} field. */
        public int num_nodes() { return STBRPContext.nnum_nodes(address()); }
        /** Returns a {@link STBRPNode} view of the struct pointed to by the {@code active_head} field. */
        @Nullable
        @NativeType("stbrp_node *")
        public STBRPNode active_head() { return STBRPContext.nactive_head(address()); }
        /** Returns a {@link STBRPNode} view of the struct pointed to by the {@code free_head} field. */
        @Nullable
        @NativeType("stbrp_node *")
        public STBRPNode free_head() { return STBRPContext.nfree_head(address()); }
        /** Returns a {@link STBRPNode}.Buffer view of the {@code extra} field. */
        @NativeType("stbrp_node[2]")
        public STBRPNode.Buffer extra() { return STBRPContext.nextra(address()); }
        /** Returns a {@link STBRPNode} view of the struct at the specified index of the {@code extra} field. */
        @NativeType("stbrp_node")
        public STBRPNode extra(int index) { return STBRPContext.nextra(address(), index); }

    }

}