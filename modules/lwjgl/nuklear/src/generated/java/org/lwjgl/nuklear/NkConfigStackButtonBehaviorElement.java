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
 * struct nk_config_stack_button_behavior_element {
 *     enum nk_button_behavior * pValues;
 *     enum nk_button_behavior old_value;
 * }</code></pre>
 */
@NativeType("struct nk_config_stack_button_behavior_element")
class NkConfigStackButtonBehaviorElement extends Struct {

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
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PVALUES = layout.offsetof(0);
        OLD_VALUE = layout.offsetof(1);
    }

    /**
     * Creates a {@code NkConfigStackButtonBehaviorElement} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    NkConfigStackButtonBehaviorElement(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * @return a {@link IntBuffer} view of the data pointed to by the {@code pValues} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("enum nk_button_behavior *")
    public IntBuffer pValues(int capacity) { return npValues(address(), capacity); }
    /** @return the value of the {@code old_value} field. */
    @NativeType("enum nk_button_behavior")
    public int old_value() { return nold_value(address()); }

    // -----------------------------------

    /** Returns a new {@code NkConfigStackButtonBehaviorElement} instance for the specified memory address. */
    public static NkConfigStackButtonBehaviorElement create(long address) {
        return wrap(NkConfigStackButtonBehaviorElement.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkConfigStackButtonBehaviorElement createSafe(long address) {
        return address == NULL ? null : wrap(NkConfigStackButtonBehaviorElement.class, address);
    }

    /**
     * Create a {@link NkConfigStackButtonBehaviorElement.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkConfigStackButtonBehaviorElement.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkConfigStackButtonBehaviorElement.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pValues(int) pValues}. */
    public static IntBuffer npValues(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + NkConfigStackButtonBehaviorElement.PVALUES), capacity); }
    /** Unsafe version of {@link #old_value}. */
    public static int nold_value(long struct) { return UNSAFE.getInt(null, struct + NkConfigStackButtonBehaviorElement.OLD_VALUE); }

    // -----------------------------------

    /** An array of {@link NkConfigStackButtonBehaviorElement} structs. */
    public static class Buffer extends StructBuffer<NkConfigStackButtonBehaviorElement, Buffer> {

        private static final NkConfigStackButtonBehaviorElement ELEMENT_FACTORY = NkConfigStackButtonBehaviorElement.create(-1L);

        /**
         * Creates a new {@code NkConfigStackButtonBehaviorElement.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkConfigStackButtonBehaviorElement#SIZEOF}, and its mark will be undefined.
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
        protected NkConfigStackButtonBehaviorElement getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@code pValues} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("enum nk_button_behavior *")
        public IntBuffer pValues(int capacity) { return NkConfigStackButtonBehaviorElement.npValues(address(), capacity); }
        /** @return the value of the {@code old_value} field. */
        @NativeType("enum nk_button_behavior")
        public int old_value() { return NkConfigStackButtonBehaviorElement.nold_value(address()); }

    }

}