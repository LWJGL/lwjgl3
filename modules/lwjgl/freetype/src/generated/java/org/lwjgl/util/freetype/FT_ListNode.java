/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * A structure used to hold a single list element.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_ListNodeRec {
 *     {@link FT_ListNode FT_ListNode} prev;
 *     {@link FT_ListNode FT_ListNode} next;
 *     void * data;
 * }</code></pre>
 */
@NativeType("struct FT_ListNodeRec")
public class FT_ListNode extends Struct<FT_ListNode> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PREV,
        NEXT,
        DATA;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PREV = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DATA = layout.offsetof(2);
    }

    protected FT_ListNode(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_ListNode create(long address, @Nullable ByteBuffer container) {
        return new FT_ListNode(address, container);
    }

    /**
     * Creates a {@code FT_ListNode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_ListNode(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_ListNode} view of the struct pointed to by the {@code prev} field. */
    @Nullable
    public FT_ListNode prev() { return nprev(address()); }
    /** @return a {@link FT_ListNode} view of the struct pointed to by the {@code next} field. */
    @Nullable
    public FT_ListNode next() { return nnext(address()); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void *")
    public ByteBuffer data(int capacity) { return ndata(address(), capacity); }

    // -----------------------------------

    /** Returns a new {@code FT_ListNode} instance for the specified memory address. */
    public static FT_ListNode create(long address) {
        return new FT_ListNode(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_ListNode createSafe(long address) {
        return address == NULL ? null : new FT_ListNode(address, null);
    }

    /**
     * Create a {@link FT_ListNode.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_ListNode.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_ListNode.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #prev}. */
    @Nullable public static FT_ListNode nprev(long struct) { return FT_ListNode.createSafe(memGetAddress(struct + FT_ListNode.PREV)); }
    /** Unsafe version of {@link #next}. */
    @Nullable public static FT_ListNode nnext(long struct) { return FT_ListNode.createSafe(memGetAddress(struct + FT_ListNode.NEXT)); }
    /** Unsafe version of {@link #data(int) data}. */
    public static ByteBuffer ndata(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + FT_ListNode.DATA), capacity); }

    // -----------------------------------

    /** An array of {@link FT_ListNode} structs. */
    public static class Buffer extends StructBuffer<FT_ListNode, Buffer> {

        private static final FT_ListNode ELEMENT_FACTORY = FT_ListNode.create(-1L);

        /**
         * Creates a new {@code FT_ListNode.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_ListNode#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_ListNode getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_ListNode} view of the struct pointed to by the {@code prev} field. */
        @Nullable
        public FT_ListNode prev() { return FT_ListNode.nprev(address()); }
        /** @return a {@link FT_ListNode} view of the struct pointed to by the {@code next} field. */
        @Nullable
        public FT_ListNode next() { return FT_ListNode.nnext(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer data(int capacity) { return FT_ListNode.ndata(address(), capacity); }

    }

}