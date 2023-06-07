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
 * A structure used to hold a simple doubly-linked list. These are used in many parts of FreeType.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_ListRec {
 *     {@link FT_ListNode FT_ListNode} head;
 *     {@link FT_ListNode FT_ListNode} tail;
 * }</code></pre>
 */
@NativeType("struct FT_ListRec")
public class FT_List extends Struct<FT_List> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEAD,
        TAIL;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEAD = layout.offsetof(0);
        TAIL = layout.offsetof(1);
    }

    protected FT_List(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_List create(long address, @Nullable ByteBuffer container) {
        return new FT_List(address, container);
    }

    /**
     * Creates a {@code FT_List} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_List(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_ListNode} view of the struct pointed to by the {@code head} field. */
    @Nullable
    public FT_ListNode head() { return nhead(address()); }
    /** @return a {@link FT_ListNode} view of the struct pointed to by the {@code tail} field. */
    @Nullable
    public FT_ListNode tail() { return ntail(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_List} instance for the specified memory address. */
    public static FT_List create(long address) {
        return new FT_List(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_List createSafe(long address) {
        return address == NULL ? null : new FT_List(address, null);
    }

    /**
     * Create a {@link FT_List.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_List.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_List.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #head}. */
    @Nullable public static FT_ListNode nhead(long struct) { return FT_ListNode.createSafe(memGetAddress(struct + FT_List.HEAD)); }
    /** Unsafe version of {@link #tail}. */
    @Nullable public static FT_ListNode ntail(long struct) { return FT_ListNode.createSafe(memGetAddress(struct + FT_List.TAIL)); }

    // -----------------------------------

    /** An array of {@link FT_List} structs. */
    public static class Buffer extends StructBuffer<FT_List, Buffer> {

        private static final FT_List ELEMENT_FACTORY = FT_List.create(-1L);

        /**
         * Creates a new {@code FT_List.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_List#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_List getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_ListNode} view of the struct pointed to by the {@code head} field. */
        @Nullable
        public FT_ListNode head() { return FT_List.nhead(address()); }
        /** @return a {@link FT_ListNode} view of the struct pointed to by the {@code tail} field. */
        @Nullable
        public FT_ListNode tail() { return FT_List.ntail(address()); }

    }

}