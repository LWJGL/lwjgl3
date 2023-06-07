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
 * Contains information about a simulated keyboard event.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct KEYBDINPUT {
 *     WORD {@link #wVk};
 *     WORD {@link #wScan};
 *     DWORD {@link #dwFlags};
 *     DWORD {@link #time};
 *     ULONG_PTR {@link #dwExtraInfo};
 * }</code></pre>
 */
public class KEYBDINPUT extends Struct<KEYBDINPUT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WVK,
        WSCAN,
        DWFLAGS,
        TIME,
        DWEXTRAINFO;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WVK = layout.offsetof(0);
        WSCAN = layout.offsetof(1);
        DWFLAGS = layout.offsetof(2);
        TIME = layout.offsetof(3);
        DWEXTRAINFO = layout.offsetof(4);
    }

    protected KEYBDINPUT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected KEYBDINPUT create(long address, @Nullable ByteBuffer container) {
        return new KEYBDINPUT(address, container);
    }

    /**
     * Creates a {@code KEYBDINPUT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public KEYBDINPUT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * A virtual-key code.
     * 
     * <p>The code must be a value in the range 1 to 254. If the {@code dwFlags} member specifies {@link User32#KEYEVENTF_UNICODE}, {@code wVk} must be 0.</p>
     */
    @NativeType("WORD")
    public short wVk() { return nwVk(address()); }
    /**
     * A hardware scan code for the key.
     * 
     * <p>If {@code dwFlags} specifies {@link User32#KEYEVENTF_UNICODE}, {@code wScan} specifies a Unicode character which is to be sent to the foreground application.</p>
     */
    @NativeType("WORD")
    public short wScan() { return nwScan(address()); }
    /** specifies various aspects of a keystroke. One of:<br><table><tr><td>{@link User32#KEYEVENTF_EXTENDEDKEY}</td><td>{@link User32#KEYEVENTF_KEYUP}</td><td>{@link User32#KEYEVENTF_SCANCODE}</td><td>{@link User32#KEYEVENTF_UNICODE}</td></tr></table> */
    @NativeType("DWORD")
    public int dwFlags() { return ndwFlags(address()); }
    /** the time stamp for the event, in milliseconds. If this parameter is zero, the system will provide its own time stamp. */
    @NativeType("DWORD")
    public int time() { return ntime(address()); }
    /** an additional value associated with the keystroke. Use the {@link User32#GetMessageExtraInfo} function to obtain this information. */
    @NativeType("ULONG_PTR")
    public long dwExtraInfo() { return ndwExtraInfo(address()); }

    /** Sets the specified value to the {@link #wVk} field. */
    public KEYBDINPUT wVk(@NativeType("WORD") short value) { nwVk(address(), value); return this; }
    /** Sets the specified value to the {@link #wScan} field. */
    public KEYBDINPUT wScan(@NativeType("WORD") short value) { nwScan(address(), value); return this; }
    /** Sets the specified value to the {@link #dwFlags} field. */
    public KEYBDINPUT dwFlags(@NativeType("DWORD") int value) { ndwFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public KEYBDINPUT time(@NativeType("DWORD") int value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@link #dwExtraInfo} field. */
    public KEYBDINPUT dwExtraInfo(@NativeType("ULONG_PTR") long value) { ndwExtraInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public KEYBDINPUT set(
        short wVk,
        short wScan,
        int dwFlags,
        int time,
        long dwExtraInfo
    ) {
        wVk(wVk);
        wScan(wScan);
        dwFlags(dwFlags);
        time(time);
        dwExtraInfo(dwExtraInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public KEYBDINPUT set(KEYBDINPUT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code KEYBDINPUT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static KEYBDINPUT malloc() {
        return new KEYBDINPUT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code KEYBDINPUT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static KEYBDINPUT calloc() {
        return new KEYBDINPUT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code KEYBDINPUT} instance allocated with {@link BufferUtils}. */
    public static KEYBDINPUT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new KEYBDINPUT(memAddress(container), container);
    }

    /** Returns a new {@code KEYBDINPUT} instance for the specified memory address. */
    public static KEYBDINPUT create(long address) {
        return new KEYBDINPUT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static KEYBDINPUT createSafe(long address) {
        return address == NULL ? null : new KEYBDINPUT(address, null);
    }

    /**
     * Returns a new {@link KEYBDINPUT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static KEYBDINPUT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link KEYBDINPUT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static KEYBDINPUT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link KEYBDINPUT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static KEYBDINPUT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link KEYBDINPUT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static KEYBDINPUT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static KEYBDINPUT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static KEYBDINPUT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static KEYBDINPUT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static KEYBDINPUT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static KEYBDINPUT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static KEYBDINPUT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static KEYBDINPUT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static KEYBDINPUT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static KEYBDINPUT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code KEYBDINPUT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static KEYBDINPUT malloc(MemoryStack stack) {
        return new KEYBDINPUT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code KEYBDINPUT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static KEYBDINPUT calloc(MemoryStack stack) {
        return new KEYBDINPUT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link KEYBDINPUT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static KEYBDINPUT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link KEYBDINPUT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static KEYBDINPUT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #wVk}. */
    public static short nwVk(long struct) { return UNSAFE.getShort(null, struct + KEYBDINPUT.WVK); }
    /** Unsafe version of {@link #wScan}. */
    public static short nwScan(long struct) { return UNSAFE.getShort(null, struct + KEYBDINPUT.WSCAN); }
    /** Unsafe version of {@link #dwFlags}. */
    public static int ndwFlags(long struct) { return UNSAFE.getInt(null, struct + KEYBDINPUT.DWFLAGS); }
    /** Unsafe version of {@link #time}. */
    public static int ntime(long struct) { return UNSAFE.getInt(null, struct + KEYBDINPUT.TIME); }
    /** Unsafe version of {@link #dwExtraInfo}. */
    public static long ndwExtraInfo(long struct) { return memGetAddress(struct + KEYBDINPUT.DWEXTRAINFO); }

    /** Unsafe version of {@link #wVk(short) wVk}. */
    public static void nwVk(long struct, short value) { UNSAFE.putShort(null, struct + KEYBDINPUT.WVK, value); }
    /** Unsafe version of {@link #wScan(short) wScan}. */
    public static void nwScan(long struct, short value) { UNSAFE.putShort(null, struct + KEYBDINPUT.WSCAN, value); }
    /** Unsafe version of {@link #dwFlags(int) dwFlags}. */
    public static void ndwFlags(long struct, int value) { UNSAFE.putInt(null, struct + KEYBDINPUT.DWFLAGS, value); }
    /** Unsafe version of {@link #time(int) time}. */
    public static void ntime(long struct, int value) { UNSAFE.putInt(null, struct + KEYBDINPUT.TIME, value); }
    /** Unsafe version of {@link #dwExtraInfo(long) dwExtraInfo}. */
    public static void ndwExtraInfo(long struct, long value) { memPutAddress(struct + KEYBDINPUT.DWEXTRAINFO, value); }

    // -----------------------------------

    /** An array of {@link KEYBDINPUT} structs. */
    public static class Buffer extends StructBuffer<KEYBDINPUT, Buffer> implements NativeResource {

        private static final KEYBDINPUT ELEMENT_FACTORY = KEYBDINPUT.create(-1L);

        /**
         * Creates a new {@code KEYBDINPUT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link KEYBDINPUT#SIZEOF}, and its mark will be undefined.</p>
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
        protected KEYBDINPUT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link KEYBDINPUT#wVk} field. */
        @NativeType("WORD")
        public short wVk() { return KEYBDINPUT.nwVk(address()); }
        /** @return the value of the {@link KEYBDINPUT#wScan} field. */
        @NativeType("WORD")
        public short wScan() { return KEYBDINPUT.nwScan(address()); }
        /** @return the value of the {@link KEYBDINPUT#dwFlags} field. */
        @NativeType("DWORD")
        public int dwFlags() { return KEYBDINPUT.ndwFlags(address()); }
        /** @return the value of the {@link KEYBDINPUT#time} field. */
        @NativeType("DWORD")
        public int time() { return KEYBDINPUT.ntime(address()); }
        /** @return the value of the {@link KEYBDINPUT#dwExtraInfo} field. */
        @NativeType("ULONG_PTR")
        public long dwExtraInfo() { return KEYBDINPUT.ndwExtraInfo(address()); }

        /** Sets the specified value to the {@link KEYBDINPUT#wVk} field. */
        public KEYBDINPUT.Buffer wVk(@NativeType("WORD") short value) { KEYBDINPUT.nwVk(address(), value); return this; }
        /** Sets the specified value to the {@link KEYBDINPUT#wScan} field. */
        public KEYBDINPUT.Buffer wScan(@NativeType("WORD") short value) { KEYBDINPUT.nwScan(address(), value); return this; }
        /** Sets the specified value to the {@link KEYBDINPUT#dwFlags} field. */
        public KEYBDINPUT.Buffer dwFlags(@NativeType("DWORD") int value) { KEYBDINPUT.ndwFlags(address(), value); return this; }
        /** Sets the specified value to the {@link KEYBDINPUT#time} field. */
        public KEYBDINPUT.Buffer time(@NativeType("DWORD") int value) { KEYBDINPUT.ntime(address(), value); return this; }
        /** Sets the specified value to the {@link KEYBDINPUT#dwExtraInfo} field. */
        public KEYBDINPUT.Buffer dwExtraInfo(@NativeType("ULONG_PTR") long value) { KEYBDINPUT.ndwExtraInfo(address(), value); return this; }

    }

}