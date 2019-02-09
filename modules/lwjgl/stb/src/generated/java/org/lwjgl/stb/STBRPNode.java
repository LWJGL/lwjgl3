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
 * The opaque {@code stbrp_node} struct.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct stbrp_node {
 *     stbrp_coord x;
 *     stbrp_coord y;
 *     {@link STBRPNode stbrp_node} * next;
 * }</code></pre>
 */
@NativeType("struct stbrp_node")
public class STBRPNode extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        NEXT;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        NEXT = layout.offsetof(2);
    }

    /**
     * Creates a {@code STBRPNode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBRPNode(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code x} field. */
    @NativeType("stbrp_coord")
    public short x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    @NativeType("stbrp_coord")
    public short y() { return ny(address()); }
    /** Returns a {@link STBRPNode} view of the struct pointed to by the {@code next} field. */
    @Nullable
    @NativeType("stbrp_node *")
    public STBRPNode next() { return nnext(address()); }

    // -----------------------------------

    /** Returns a new {@code STBRPNode} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBRPNode malloc() {
        return wrap(STBRPNode.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code STBRPNode} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBRPNode calloc() {
        return wrap(STBRPNode.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code STBRPNode} instance allocated with {@link BufferUtils}. */
    public static STBRPNode create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(STBRPNode.class, memAddress(container), container);
    }

    /** Returns a new {@code STBRPNode} instance for the specified memory address. */
    public static STBRPNode create(long address) {
        return wrap(STBRPNode.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBRPNode createSafe(long address) {
        return address == NULL ? null : wrap(STBRPNode.class, address);
    }

    /**
     * Returns a new {@link STBRPNode.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPNode.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link STBRPNode.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPNode.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBRPNode.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPNode.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link STBRPNode.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static STBRPNode.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBRPNode.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code STBRPNode} instance allocated on the thread-local {@link MemoryStack}. */
    public static STBRPNode mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code STBRPNode} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static STBRPNode callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code STBRPNode} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBRPNode mallocStack(MemoryStack stack) {
        return wrap(STBRPNode.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code STBRPNode} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBRPNode callocStack(MemoryStack stack) {
        return wrap(STBRPNode.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link STBRPNode.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPNode.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link STBRPNode.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPNode.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link STBRPNode.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBRPNode.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBRPNode.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBRPNode.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static short nx(long struct) { return UNSAFE.getShort(null, struct + STBRPNode.X); }
    /** Unsafe version of {@link #y}. */
    public static short ny(long struct) { return UNSAFE.getShort(null, struct + STBRPNode.Y); }
    /** Unsafe version of {@link #next}. */
    @Nullable public static STBRPNode nnext(long struct) { return STBRPNode.createSafe(memGetAddress(struct + STBRPNode.NEXT)); }

    // -----------------------------------

    /** An array of {@link STBRPNode} structs. */
    public static class Buffer extends StructBuffer<STBRPNode, Buffer> implements NativeResource {

        private static final STBRPNode ELEMENT_FACTORY = STBRPNode.create(-1L);

        /**
         * Creates a new {@code STBRPNode.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBRPNode#SIZEOF}, and its mark will be undefined.
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
        protected STBRPNode getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code x} field. */
        @NativeType("stbrp_coord")
        public short x() { return STBRPNode.nx(address()); }
        /** Returns the value of the {@code y} field. */
        @NativeType("stbrp_coord")
        public short y() { return STBRPNode.ny(address()); }
        /** Returns a {@link STBRPNode} view of the struct pointed to by the {@code next} field. */
        @Nullable
        @NativeType("stbrp_node *")
        public STBRPNode next() { return STBRPNode.nnext(address()); }

    }

}