/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_config_stack_vec2_element {
 *     {@link NkVec2 struct nk_vec2} * pValues;
 *     {@link NkVec2 struct nk_vec2} old_value;
 * }</code></pre>
 */
@NativeType("struct nk_config_stack_vec2_element")
class NkConfigStackVec2Element extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PVALUES,
        OLD_VALUE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PVALUES = layout.offsetof(0);
        OLD_VALUE = layout.offsetof(1);
    }

    /**
     * Creates a {@code NkConfigStackVec2Element} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    NkConfigStackVec2Element(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NkVec2} view of the struct pointed to by the {@code pValues} field. */
    @NativeType("struct nk_vec2 *")
    public NkVec2 pValues() { return npValues(address()); }
    /** Returns a {@link NkVec2} view of the {@code old_value} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 old_value() { return nold_value(address()); }

    // -----------------------------------

    /** Returns a new {@code NkConfigStackVec2Element} instance for the specified memory address. */
    public static NkConfigStackVec2Element create(long address) {
        return wrap(NkConfigStackVec2Element.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkConfigStackVec2Element createSafe(long address) {
        return address == NULL ? null : wrap(NkConfigStackVec2Element.class, address);
    }

    /**
     * Create a {@link NkConfigStackVec2Element.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkConfigStackVec2Element.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkConfigStackVec2Element.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pValues}. */
    public static NkVec2 npValues(long struct) { return NkVec2.create(memGetAddress(struct + NkConfigStackVec2Element.PVALUES)); }
    /** Unsafe version of {@link #old_value}. */
    public static NkVec2 nold_value(long struct) { return NkVec2.create(struct + NkConfigStackVec2Element.OLD_VALUE); }

    // -----------------------------------

    /** An array of {@link NkConfigStackVec2Element} structs. */
    public static class Buffer extends StructBuffer<NkConfigStackVec2Element, Buffer> {

        private static final NkConfigStackVec2Element ELEMENT_FACTORY = NkConfigStackVec2Element.create(-1L);

        /**
         * Creates a new {@code NkConfigStackVec2Element.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkConfigStackVec2Element#SIZEOF}, and its mark will be undefined.
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
        protected NkConfigStackVec2Element getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NkVec2} view of the struct pointed to by the {@code pValues} field. */
        @NativeType("struct nk_vec2 *")
        public NkVec2 pValues() { return NkConfigStackVec2Element.npValues(address()); }
        /** Returns a {@link NkVec2} view of the {@code old_value} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 old_value() { return NkConfigStackVec2Element.nold_value(address()); }

    }

}