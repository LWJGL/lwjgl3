/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Used by {@link User32#SendInput} to store information for synthesizing input events such as keystrokes, mouse movement, and mouse clicks.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code type} &ndash; the type of the input event. One of:<br><table><tr><td>{@link User32#INPUT_MOUSE}</td><td>{@link User32#INPUT_KEYBOARD}</td><td>{@link User32#INPUT_HARDWARE}</td></tr></table></li>
 * <li>{@code DUMMYUNIONNAME}
 * 
 * <ul>
 * <li>{@code DUMMYUNIONNAME.mi} &ndash; the information about a simulated mouse event</li>
 * <li>{@code DUMMYUNIONNAME.ki} &ndash; the information about a simulated keyboard event</li>
 * <li>{@code DUMMYUNIONNAME.hi} &ndash; the information about a simulated hardware event</li>
 * </ul></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct INPUT {
 *     DWORD type;
 *     union {
 *         {@link MOUSEINPUT MOUSEINPUT} mi;
 *         {@link KEYBDINPUT KEYBDINPUT} ki;
 *         {@link HARDWAREINPUT HARDWAREINPUT} hi;
 *     } DUMMYUNIONNAME;
 * }</code></pre>
 */
public class INPUT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        DUMMYUNIONNAME,
            DUMMYUNIONNAME_MI,
            DUMMYUNIONNAME_KI,
            DUMMYUNIONNAME_HI;

    static {
        Layout layout = __struct(
            __member(4),
            __union(
                __member(MOUSEINPUT.SIZEOF, MOUSEINPUT.ALIGNOF),
                __member(KEYBDINPUT.SIZEOF, KEYBDINPUT.ALIGNOF),
                __member(HARDWAREINPUT.SIZEOF, HARDWAREINPUT.ALIGNOF)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        DUMMYUNIONNAME = layout.offsetof(1);
            DUMMYUNIONNAME_MI = layout.offsetof(2);
            DUMMYUNIONNAME_KI = layout.offsetof(3);
            DUMMYUNIONNAME_HI = layout.offsetof(4);
    }

    /**
     * Creates a {@code INPUT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public INPUT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("DWORD")
    public int type() { return ntype(address()); }
    /** Returns a {@link MOUSEINPUT} view of the {@code DUMMYUNIONNAME.mi} field. */
    public MOUSEINPUT DUMMYUNIONNAME_mi() { return nDUMMYUNIONNAME_mi(address()); }
    /** Returns a {@link KEYBDINPUT} view of the {@code DUMMYUNIONNAME.ki} field. */
    public KEYBDINPUT DUMMYUNIONNAME_ki() { return nDUMMYUNIONNAME_ki(address()); }
    /** Returns a {@link HARDWAREINPUT} view of the {@code DUMMYUNIONNAME.hi} field. */
    public HARDWAREINPUT DUMMYUNIONNAME_hi() { return nDUMMYUNIONNAME_hi(address()); }

    /** Sets the specified value to the {@code type} field. */
    public INPUT type(@NativeType("DWORD") int value) { ntype(address(), value); return this; }
    /** Copies the specified {@link MOUSEINPUT} to the {@code DUMMYUNIONNAME.mi} field. */
    public INPUT DUMMYUNIONNAME_mi(MOUSEINPUT value) { nDUMMYUNIONNAME_mi(address(), value); return this; }
    /** Passes the {@code DUMMYUNIONNAME.mi} field to the specified {@link java.util.function.Consumer Consumer}. */
    public INPUT DUMMYUNIONNAME_mi(java.util.function.Consumer<MOUSEINPUT> consumer) { consumer.accept(DUMMYUNIONNAME_mi()); return this; }
    /** Copies the specified {@link KEYBDINPUT} to the {@code DUMMYUNIONNAME.ki} field. */
    public INPUT DUMMYUNIONNAME_ki(KEYBDINPUT value) { nDUMMYUNIONNAME_ki(address(), value); return this; }
    /** Passes the {@code DUMMYUNIONNAME.ki} field to the specified {@link java.util.function.Consumer Consumer}. */
    public INPUT DUMMYUNIONNAME_ki(java.util.function.Consumer<KEYBDINPUT> consumer) { consumer.accept(DUMMYUNIONNAME_ki()); return this; }
    /** Copies the specified {@link HARDWAREINPUT} to the {@code DUMMYUNIONNAME.hi} field. */
    public INPUT DUMMYUNIONNAME_hi(HARDWAREINPUT value) { nDUMMYUNIONNAME_hi(address(), value); return this; }
    /** Passes the {@code DUMMYUNIONNAME.hi} field to the specified {@link java.util.function.Consumer Consumer}. */
    public INPUT DUMMYUNIONNAME_hi(java.util.function.Consumer<HARDWAREINPUT> consumer) { consumer.accept(DUMMYUNIONNAME_hi()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public INPUT set(INPUT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code INPUT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static INPUT malloc() {
        return wrap(INPUT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code INPUT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static INPUT calloc() {
        return wrap(INPUT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code INPUT} instance allocated with {@link BufferUtils}. */
    public static INPUT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(INPUT.class, memAddress(container), container);
    }

    /** Returns a new {@code INPUT} instance for the specified memory address. */
    public static INPUT create(long address) {
        return wrap(INPUT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static INPUT createSafe(long address) {
        return address == NULL ? null : wrap(INPUT.class, address);
    }

    /**
     * Returns a new {@link INPUT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static INPUT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link INPUT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static INPUT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link INPUT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static INPUT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link INPUT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static INPUT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static INPUT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code INPUT} instance allocated on the thread-local {@link MemoryStack}. */
    public static INPUT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code INPUT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static INPUT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code INPUT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static INPUT mallocStack(MemoryStack stack) {
        return wrap(INPUT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code INPUT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static INPUT callocStack(MemoryStack stack) {
        return wrap(INPUT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link INPUT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static INPUT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link INPUT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static INPUT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link INPUT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static INPUT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link INPUT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static INPUT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + INPUT.TYPE); }
    /** Unsafe version of {@link #DUMMYUNIONNAME_mi}. */
    public static MOUSEINPUT nDUMMYUNIONNAME_mi(long struct) { return MOUSEINPUT.create(struct + INPUT.DUMMYUNIONNAME_MI); }
    /** Unsafe version of {@link #DUMMYUNIONNAME_ki}. */
    public static KEYBDINPUT nDUMMYUNIONNAME_ki(long struct) { return KEYBDINPUT.create(struct + INPUT.DUMMYUNIONNAME_KI); }
    /** Unsafe version of {@link #DUMMYUNIONNAME_hi}. */
    public static HARDWAREINPUT nDUMMYUNIONNAME_hi(long struct) { return HARDWAREINPUT.create(struct + INPUT.DUMMYUNIONNAME_HI); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + INPUT.TYPE, value); }
    /** Unsafe version of {@link #DUMMYUNIONNAME_mi(MOUSEINPUT) DUMMYUNIONNAME_mi}. */
    public static void nDUMMYUNIONNAME_mi(long struct, MOUSEINPUT value) { memCopy(value.address(), struct + INPUT.DUMMYUNIONNAME_MI, MOUSEINPUT.SIZEOF); }
    /** Unsafe version of {@link #DUMMYUNIONNAME_ki(KEYBDINPUT) DUMMYUNIONNAME_ki}. */
    public static void nDUMMYUNIONNAME_ki(long struct, KEYBDINPUT value) { memCopy(value.address(), struct + INPUT.DUMMYUNIONNAME_KI, KEYBDINPUT.SIZEOF); }
    /** Unsafe version of {@link #DUMMYUNIONNAME_hi(HARDWAREINPUT) DUMMYUNIONNAME_hi}. */
    public static void nDUMMYUNIONNAME_hi(long struct, HARDWAREINPUT value) { memCopy(value.address(), struct + INPUT.DUMMYUNIONNAME_HI, HARDWAREINPUT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link INPUT} structs. */
    public static class Buffer extends StructBuffer<INPUT, Buffer> implements NativeResource {

        private static final INPUT ELEMENT_FACTORY = INPUT.create(-1L);

        /**
         * Creates a new {@code INPUT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link INPUT#SIZEOF}, and its mark will be undefined.
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
        protected INPUT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("DWORD")
        public int type() { return INPUT.ntype(address()); }
        /** Returns a {@link MOUSEINPUT} view of the {@code DUMMYUNIONNAME.mi} field. */
        public MOUSEINPUT DUMMYUNIONNAME_mi() { return INPUT.nDUMMYUNIONNAME_mi(address()); }
        /** Returns a {@link KEYBDINPUT} view of the {@code DUMMYUNIONNAME.ki} field. */
        public KEYBDINPUT DUMMYUNIONNAME_ki() { return INPUT.nDUMMYUNIONNAME_ki(address()); }
        /** Returns a {@link HARDWAREINPUT} view of the {@code DUMMYUNIONNAME.hi} field. */
        public HARDWAREINPUT DUMMYUNIONNAME_hi() { return INPUT.nDUMMYUNIONNAME_hi(address()); }

        /** Sets the specified value to the {@code type} field. */
        public INPUT.Buffer type(@NativeType("DWORD") int value) { INPUT.ntype(address(), value); return this; }
        /** Copies the specified {@link MOUSEINPUT} to the {@code DUMMYUNIONNAME.mi} field. */
        public INPUT.Buffer DUMMYUNIONNAME_mi(MOUSEINPUT value) { INPUT.nDUMMYUNIONNAME_mi(address(), value); return this; }
        /** Passes the {@code DUMMYUNIONNAME.mi} field to the specified {@link java.util.function.Consumer Consumer}. */
        public INPUT.Buffer DUMMYUNIONNAME_mi(java.util.function.Consumer<MOUSEINPUT> consumer) { consumer.accept(DUMMYUNIONNAME_mi()); return this; }
        /** Copies the specified {@link KEYBDINPUT} to the {@code DUMMYUNIONNAME.ki} field. */
        public INPUT.Buffer DUMMYUNIONNAME_ki(KEYBDINPUT value) { INPUT.nDUMMYUNIONNAME_ki(address(), value); return this; }
        /** Passes the {@code DUMMYUNIONNAME.ki} field to the specified {@link java.util.function.Consumer Consumer}. */
        public INPUT.Buffer DUMMYUNIONNAME_ki(java.util.function.Consumer<KEYBDINPUT> consumer) { consumer.accept(DUMMYUNIONNAME_ki()); return this; }
        /** Copies the specified {@link HARDWAREINPUT} to the {@code DUMMYUNIONNAME.hi} field. */
        public INPUT.Buffer DUMMYUNIONNAME_hi(HARDWAREINPUT value) { INPUT.nDUMMYUNIONNAME_hi(address(), value); return this; }
        /** Passes the {@code DUMMYUNIONNAME.hi} field to the specified {@link java.util.function.Consumer Consumer}. */
        public INPUT.Buffer DUMMYUNIONNAME_hi(java.util.function.Consumer<HARDWAREINPUT> consumer) { consumer.accept(DUMMYUNIONNAME_hi()); return this; }

    }

}