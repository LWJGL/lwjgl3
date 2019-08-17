/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Used for keyboard events.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code cNewInput[8]} &ndash; up to 8 bytes of new input</li>
 * <li>{@code uUserValue} &ndash; possible flags about the new input</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_Keyboard_t {
 *     char cNewInput[8];
 *     uint64_t uUserValue;
 * }</code></pre>
 */
@NativeType("struct VREvent_Keyboard_t")
public class VREventKeyboard extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CNEWINPUT,
        UUSERVALUE;

    static {
        Layout layout = __struct(
            __array(1, 8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CNEWINPUT = layout.offsetof(0);
        UUSERVALUE = layout.offsetof(1);
    }

    /**
     * Creates a {@code VREventKeyboard} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventKeyboard(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the {@code cNewInput} field. */
    @NativeType("char[8]")
    public ByteBuffer cNewInput() { return ncNewInput(address()); }
    /** Returns the value at the specified index of the {@code cNewInput} field. */
    @NativeType("char")
    public byte cNewInput(int index) { return ncNewInput(address(), index); }
    /** Returns the value of the {@code uUserValue} field. */
    @NativeType("uint64_t")
    public long uUserValue() { return nuUserValue(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventKeyboard} instance for the specified memory address. */
    public static VREventKeyboard create(long address) {
        return wrap(VREventKeyboard.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventKeyboard createSafe(long address) {
        return address == NULL ? null : wrap(VREventKeyboard.class, address);
    }

    /**
     * Create a {@link VREventKeyboard.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventKeyboard.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventKeyboard.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cNewInput}. */
    public static ByteBuffer ncNewInput(long struct) { return memByteBuffer(struct + VREventKeyboard.CNEWINPUT, 8); }
    /** Unsafe version of {@link #cNewInput(int) cNewInput}. */
    public static byte ncNewInput(long struct, int index) {
        return UNSAFE.getByte(null, struct + VREventKeyboard.CNEWINPUT + check(index, 8) * 1);
    }
    /** Unsafe version of {@link #uUserValue}. */
    public static long nuUserValue(long struct) { return UNSAFE.getLong(null, struct + VREventKeyboard.UUSERVALUE); }

    // -----------------------------------

    /** An array of {@link VREventKeyboard} structs. */
    public static class Buffer extends StructBuffer<VREventKeyboard, Buffer> {

        private static final VREventKeyboard ELEMENT_FACTORY = VREventKeyboard.create(-1L);

        /**
         * Creates a new {@code VREventKeyboard.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventKeyboard#SIZEOF}, and its mark will be undefined.
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
        protected VREventKeyboard getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link ByteBuffer} view of the {@code cNewInput} field. */
        @NativeType("char[8]")
        public ByteBuffer cNewInput() { return VREventKeyboard.ncNewInput(address()); }
        /** Returns the value at the specified index of the {@code cNewInput} field. */
        @NativeType("char")
        public byte cNewInput(int index) { return VREventKeyboard.ncNewInput(address(), index); }
        /** Returns the value of the {@code uUserValue} field. */
        @NativeType("uint64_t")
        public long uUserValue() { return VREventKeyboard.nuUserValue(address()); }

    }

}