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
 * struct nk_popup_buffer {
 *     nk_size begin;
 *     nk_size parent;
 *     nk_size last;
 *     nk_size end;
 *     nk_bool active;
 * }</code></pre>
 */
@NativeType("struct nk_popup_buffer")
public class NkPopupBuffer extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BEGIN,
        PARENT,
        LAST,
        END,
        ACTIVE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BEGIN = layout.offsetof(0);
        PARENT = layout.offsetof(1);
        LAST = layout.offsetof(2);
        END = layout.offsetof(3);
        ACTIVE = layout.offsetof(4);
    }

    /**
     * Creates a {@code NkPopupBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkPopupBuffer(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code begin} field. */
    @NativeType("nk_size")
    public long begin() { return nbegin(address()); }
    /** @return the value of the {@code parent} field. */
    @NativeType("nk_size")
    public long parent() { return nparent(address()); }
    /** @return the value of the {@code last} field. */
    @NativeType("nk_size")
    public long last() { return nlast(address()); }
    /** @return the value of the {@code end} field. */
    @NativeType("nk_size")
    public long end() { return nend(address()); }
    /** @return the value of the {@code active} field. */
    @NativeType("nk_bool")
    public boolean active() { return nactive(address()); }

    // -----------------------------------

    /** Returns a new {@code NkPopupBuffer} instance for the specified memory address. */
    public static NkPopupBuffer create(long address) {
        return wrap(NkPopupBuffer.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkPopupBuffer createSafe(long address) {
        return address == NULL ? null : wrap(NkPopupBuffer.class, address);
    }

    /**
     * Create a {@link NkPopupBuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkPopupBuffer.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkPopupBuffer.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #begin}. */
    public static long nbegin(long struct) { return memGetAddress(struct + NkPopupBuffer.BEGIN); }
    /** Unsafe version of {@link #parent}. */
    public static long nparent(long struct) { return memGetAddress(struct + NkPopupBuffer.PARENT); }
    /** Unsafe version of {@link #last}. */
    public static long nlast(long struct) { return memGetAddress(struct + NkPopupBuffer.LAST); }
    /** Unsafe version of {@link #end}. */
    public static long nend(long struct) { return memGetAddress(struct + NkPopupBuffer.END); }
    /** Unsafe version of {@link #active}. */
    public static boolean nactive(long struct) { return UNSAFE.getByte(null, struct + NkPopupBuffer.ACTIVE) != 0; }

    // -----------------------------------

    /** An array of {@link NkPopupBuffer} structs. */
    public static class Buffer extends StructBuffer<NkPopupBuffer, Buffer> {

        private static final NkPopupBuffer ELEMENT_FACTORY = NkPopupBuffer.create(-1L);

        /**
         * Creates a new {@code NkPopupBuffer.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkPopupBuffer#SIZEOF}, and its mark will be undefined.
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
        protected NkPopupBuffer getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code begin} field. */
        @NativeType("nk_size")
        public long begin() { return NkPopupBuffer.nbegin(address()); }
        /** @return the value of the {@code parent} field. */
        @NativeType("nk_size")
        public long parent() { return NkPopupBuffer.nparent(address()); }
        /** @return the value of the {@code last} field. */
        @NativeType("nk_size")
        public long last() { return NkPopupBuffer.nlast(address()); }
        /** @return the value of the {@code end} field. */
        @NativeType("nk_size")
        public long end() { return NkPopupBuffer.nend(address()); }
        /** @return the value of the {@code active} field. */
        @NativeType("nk_bool")
        public boolean active() { return NkPopupBuffer.nactive(address()); }

    }

}