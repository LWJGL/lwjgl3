/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_config_stack_color {
 *     int head;
 *     {@link NkConfigStackColorElement struct nk_config_stack_color_element} elements[32];
 * }</code></pre>
 */
@NativeType("struct nk_config_stack_color")
class NkConfigStackColor extends Struct<NkConfigStackColor> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEAD,
        ELEMENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __array(NkConfigStackColorElement.SIZEOF, NkConfigStackColorElement.ALIGNOF, 32)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEAD = layout.offsetof(0);
        ELEMENTS = layout.offsetof(1);
    }

    protected NkConfigStackColor(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkConfigStackColor create(long address, @Nullable ByteBuffer container) {
        return new NkConfigStackColor(address, container);
    }

    /**
     * Creates a {@code NkConfigStackColor} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    NkConfigStackColor(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code head} field. */
    public int head() { return nhead(address()); }
    /** @return a {@link NkConfigStackColorElement}.Buffer view of the {@code elements} field. */
    @NativeType("struct nk_config_stack_color_element[32]")
    public NkConfigStackColorElement.Buffer elements() { return nelements(address()); }
    /** @return a {@link NkConfigStackColorElement} view of the struct at the specified index of the {@code elements} field. */
    @NativeType("struct nk_config_stack_color_element")
    public NkConfigStackColorElement elements(int index) { return nelements(address(), index); }

    // -----------------------------------

    /** Returns a new {@code NkConfigStackColor} instance for the specified memory address. */
    public static NkConfigStackColor create(long address) {
        return new NkConfigStackColor(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkConfigStackColor createSafe(long address) {
        return address == NULL ? null : new NkConfigStackColor(address, null);
    }

    /**
     * Create a {@link NkConfigStackColor.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkConfigStackColor.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkConfigStackColor.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #head}. */
    public static int nhead(long struct) { return memGetInt(struct + NkConfigStackColor.HEAD); }
    /** Unsafe version of {@link #elements}. */
    public static NkConfigStackColorElement.Buffer nelements(long struct) { return NkConfigStackColorElement.create(struct + NkConfigStackColor.ELEMENTS, 32); }
    /** Unsafe version of {@link #elements(int) elements}. */
    public static NkConfigStackColorElement nelements(long struct, int index) {
        return NkConfigStackColorElement.create(struct + NkConfigStackColor.ELEMENTS + check(index, 32) * NkConfigStackColorElement.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link NkConfigStackColor} structs. */
    public static class Buffer extends StructBuffer<NkConfigStackColor, Buffer> {

        private static final NkConfigStackColor ELEMENT_FACTORY = NkConfigStackColor.create(-1L);

        /**
         * Creates a new {@code NkConfigStackColor.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkConfigStackColor#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkConfigStackColor getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code head} field. */
        public int head() { return NkConfigStackColor.nhead(address()); }
        /** @return a {@link NkConfigStackColorElement}.Buffer view of the {@code elements} field. */
        @NativeType("struct nk_config_stack_color_element[32]")
        public NkConfigStackColorElement.Buffer elements() { return NkConfigStackColor.nelements(address()); }
        /** @return a {@link NkConfigStackColorElement} view of the struct at the specified index of the {@code elements} field. */
        @NativeType("struct nk_config_stack_color_element")
        public NkConfigStackColorElement elements(int index) { return NkConfigStackColor.nelements(address(), index); }

    }

}