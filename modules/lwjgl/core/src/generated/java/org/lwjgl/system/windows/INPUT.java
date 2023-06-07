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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct INPUT {
 *     DWORD {@link #type};
 *     union {
 *         {@link MOUSEINPUT MOUSEINPUT} {@link #DUMMYUNIONNAME_mi mi};
 *         {@link KEYBDINPUT KEYBDINPUT} {@link #DUMMYUNIONNAME_ki ki};
 *         {@link HARDWAREINPUT HARDWAREINPUT} {@link #DUMMYUNIONNAME_hi hi};
 *     } DUMMYUNIONNAME;
 * }</code></pre>
 */
public class INPUT extends Struct<INPUT> implements NativeResource {

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

    protected INPUT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected INPUT create(long address, @Nullable ByteBuffer container) {
        return new INPUT(address, container);
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

    /** the type of the input event. One of:<br><table><tr><td>{@link User32#INPUT_MOUSE}</td><td>{@link User32#INPUT_KEYBOARD}</td><td>{@link User32#INPUT_HARDWARE}</td></tr></table> */
    @NativeType("DWORD")
    public int type() { return ntype(address()); }
    /** the information about a simulated mouse event */
    public MOUSEINPUT DUMMYUNIONNAME_mi() { return nDUMMYUNIONNAME_mi(address()); }
    /** the information about a simulated keyboard event */
    public KEYBDINPUT DUMMYUNIONNAME_ki() { return nDUMMYUNIONNAME_ki(address()); }
    /** the information about a simulated hardware event */
    public HARDWAREINPUT DUMMYUNIONNAME_hi() { return nDUMMYUNIONNAME_hi(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public INPUT type(@NativeType("DWORD") int value) { ntype(address(), value); return this; }
    /** Copies the specified {@link MOUSEINPUT} to the {@link #DUMMYUNIONNAME_mi} field. */
    public INPUT DUMMYUNIONNAME_mi(MOUSEINPUT value) { nDUMMYUNIONNAME_mi(address(), value); return this; }
    /** Passes the {@link #DUMMYUNIONNAME_mi} field to the specified {@link java.util.function.Consumer Consumer}. */
    public INPUT DUMMYUNIONNAME_mi(java.util.function.Consumer<MOUSEINPUT> consumer) { consumer.accept(DUMMYUNIONNAME_mi()); return this; }
    /** Copies the specified {@link KEYBDINPUT} to the {@link #DUMMYUNIONNAME_ki} field. */
    public INPUT DUMMYUNIONNAME_ki(KEYBDINPUT value) { nDUMMYUNIONNAME_ki(address(), value); return this; }
    /** Passes the {@link #DUMMYUNIONNAME_ki} field to the specified {@link java.util.function.Consumer Consumer}. */
    public INPUT DUMMYUNIONNAME_ki(java.util.function.Consumer<KEYBDINPUT> consumer) { consumer.accept(DUMMYUNIONNAME_ki()); return this; }
    /** Copies the specified {@link HARDWAREINPUT} to the {@link #DUMMYUNIONNAME_hi} field. */
    public INPUT DUMMYUNIONNAME_hi(HARDWAREINPUT value) { nDUMMYUNIONNAME_hi(address(), value); return this; }
    /** Passes the {@link #DUMMYUNIONNAME_hi} field to the specified {@link java.util.function.Consumer Consumer}. */
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
        return new INPUT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code INPUT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static INPUT calloc() {
        return new INPUT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code INPUT} instance allocated with {@link BufferUtils}. */
    public static INPUT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new INPUT(memAddress(container), container);
    }

    /** Returns a new {@code INPUT} instance for the specified memory address. */
    public static INPUT create(long address) {
        return new INPUT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static INPUT createSafe(long address) {
        return address == NULL ? null : new INPUT(address, null);
    }

    /**
     * Returns a new {@link INPUT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static INPUT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link INPUT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static INPUT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link INPUT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static INPUT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link INPUT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static INPUT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static INPUT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static INPUT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static INPUT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static INPUT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static INPUT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static INPUT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static INPUT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static INPUT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static INPUT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code INPUT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static INPUT malloc(MemoryStack stack) {
        return new INPUT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code INPUT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static INPUT calloc(MemoryStack stack) {
        return new INPUT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link INPUT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static INPUT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link INPUT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static INPUT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link INPUT#SIZEOF}, and its mark will be undefined.</p>
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

        /** @return the value of the {@link INPUT#type} field. */
        @NativeType("DWORD")
        public int type() { return INPUT.ntype(address()); }
        /** @return a {@link MOUSEINPUT} view of the {@link INPUT#DUMMYUNIONNAME_mi} field. */
        public MOUSEINPUT DUMMYUNIONNAME_mi() { return INPUT.nDUMMYUNIONNAME_mi(address()); }
        /** @return a {@link KEYBDINPUT} view of the {@link INPUT#DUMMYUNIONNAME_ki} field. */
        public KEYBDINPUT DUMMYUNIONNAME_ki() { return INPUT.nDUMMYUNIONNAME_ki(address()); }
        /** @return a {@link HARDWAREINPUT} view of the {@link INPUT#DUMMYUNIONNAME_hi} field. */
        public HARDWAREINPUT DUMMYUNIONNAME_hi() { return INPUT.nDUMMYUNIONNAME_hi(address()); }

        /** Sets the specified value to the {@link INPUT#type} field. */
        public INPUT.Buffer type(@NativeType("DWORD") int value) { INPUT.ntype(address(), value); return this; }
        /** Copies the specified {@link MOUSEINPUT} to the {@link INPUT#DUMMYUNIONNAME_mi} field. */
        public INPUT.Buffer DUMMYUNIONNAME_mi(MOUSEINPUT value) { INPUT.nDUMMYUNIONNAME_mi(address(), value); return this; }
        /** Passes the {@link INPUT#DUMMYUNIONNAME_mi} field to the specified {@link java.util.function.Consumer Consumer}. */
        public INPUT.Buffer DUMMYUNIONNAME_mi(java.util.function.Consumer<MOUSEINPUT> consumer) { consumer.accept(DUMMYUNIONNAME_mi()); return this; }
        /** Copies the specified {@link KEYBDINPUT} to the {@link INPUT#DUMMYUNIONNAME_ki} field. */
        public INPUT.Buffer DUMMYUNIONNAME_ki(KEYBDINPUT value) { INPUT.nDUMMYUNIONNAME_ki(address(), value); return this; }
        /** Passes the {@link INPUT#DUMMYUNIONNAME_ki} field to the specified {@link java.util.function.Consumer Consumer}. */
        public INPUT.Buffer DUMMYUNIONNAME_ki(java.util.function.Consumer<KEYBDINPUT> consumer) { consumer.accept(DUMMYUNIONNAME_ki()); return this; }
        /** Copies the specified {@link HARDWAREINPUT} to the {@link INPUT#DUMMYUNIONNAME_hi} field. */
        public INPUT.Buffer DUMMYUNIONNAME_hi(HARDWAREINPUT value) { INPUT.nDUMMYUNIONNAME_hi(address(), value); return this; }
        /** Passes the {@link INPUT#DUMMYUNIONNAME_hi} field to the specified {@link java.util.function.Consumer Consumer}. */
        public INPUT.Buffer DUMMYUNIONNAME_hi(java.util.function.Consumer<HARDWAREINPUT> consumer) { consumer.accept(DUMMYUNIONNAME_hi()); return this; }

    }

}