/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct nk_config_stack_style_item {
 *     int head;
 *     {@link NkConfigStackStyleItemElement struct nk_config_stack_style_item_element} elements[16];
 * }</pre></code>
 */
@NativeType("struct nk_config_stack_style_item")
class NkConfigStackStyleItem extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEAD,
        ELEMENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __array(NkConfigStackStyleItemElement.SIZEOF, NkConfigStackStyleItemElement.ALIGNOF, 16)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEAD = layout.offsetof(0);
        ELEMENTS = layout.offsetof(1);
    }

    NkConfigStackStyleItem(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NkConfigStackStyleItem} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    NkConfigStackStyleItem(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code head} field. */
    public int head() { return nhead(address()); }
    /** Returns a {@link NkConfigStackStyleItemElement}.Buffer view of the {@code elements} field. */
    @NativeType("struct nk_config_stack_style_item_element[16]")
    public NkConfigStackStyleItemElement.Buffer elements() { return nelements(address()); }
    /** Returns a {@link NkConfigStackStyleItemElement} view of the struct at the specified index of the {@code elements} field. */
    @NativeType("struct nk_config_stack_style_item_element")
    public NkConfigStackStyleItemElement elements(int index) { return nelements(address(), index); }

    // -----------------------------------

    /** Returns a new {@link NkConfigStackStyleItem} instance for the specified memory address. */
    public static NkConfigStackStyleItem create(long address) {
        return new NkConfigStackStyleItem(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkConfigStackStyleItem createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link NkConfigStackStyleItem.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkConfigStackStyleItem.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkConfigStackStyleItem.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #head}. */
    public static int nhead(long struct) { return memGetInt(struct + NkConfigStackStyleItem.HEAD); }
    /** Unsafe version of {@link #elements}. */
    public static NkConfigStackStyleItemElement.Buffer nelements(long struct) { return NkConfigStackStyleItemElement.create(struct + NkConfigStackStyleItem.ELEMENTS, 16); }
    /** Unsafe version of {@link #elements(int) elements}. */
    public static NkConfigStackStyleItemElement nelements(long struct, int index) {
        return NkConfigStackStyleItemElement.create(struct + NkConfigStackStyleItem.ELEMENTS + check(index, 16) * NkConfigStackStyleItemElement.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link NkConfigStackStyleItem} structs. */
    public static class Buffer extends StructBuffer<NkConfigStackStyleItem, Buffer> {

        /**
         * Creates a new {@link NkConfigStackStyleItem.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkConfigStackStyleItem#SIZEOF}, and its mark will be undefined.
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
        protected NkConfigStackStyleItem newInstance(long address) {
            return new NkConfigStackStyleItem(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code head} field. */
        public int head() { return NkConfigStackStyleItem.nhead(address()); }
        /** Returns a {@link NkConfigStackStyleItemElement}.Buffer view of the {@code elements} field. */
        @NativeType("struct nk_config_stack_style_item_element[16]")
        public NkConfigStackStyleItemElement.Buffer elements() { return NkConfigStackStyleItem.nelements(address()); }
        /** Returns a {@link NkConfigStackStyleItemElement} view of the struct at the specified index of the {@code elements} field. */
        @NativeType("struct nk_config_stack_style_item_element")
        public NkConfigStackStyleItemElement elements(int index) { return NkConfigStackStyleItem.nelements(address(), index); }

    }

}