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
 * Contains information about a simulated mouse event.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct MOUSEINPUT {
 *     LONG {@link #dx};
 *     LONG {@link #dy};
 *     DWORD {@link #mouseData};
 *     DWORD {@link #dwFlags};
 *     DWORD {@link #time};
 *     ULONG_PTR {@link #dwExtraInfo};
 * }</code></pre>
 */
public class MOUSEINPUT extends Struct<MOUSEINPUT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DX,
        DY,
        MOUSEDATA,
        DWFLAGS,
        TIME,
        DWEXTRAINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DX = layout.offsetof(0);
        DY = layout.offsetof(1);
        MOUSEDATA = layout.offsetof(2);
        DWFLAGS = layout.offsetof(3);
        TIME = layout.offsetof(4);
        DWEXTRAINFO = layout.offsetof(5);
    }

    protected MOUSEINPUT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MOUSEINPUT create(long address, @Nullable ByteBuffer container) {
        return new MOUSEINPUT(address, container);
    }

    /**
     * Creates a {@code MOUSEINPUT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MOUSEINPUT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * the absolute position of the mouse, or the amount of motion since the last mouse event was generated, depending on the value of the {@code dwFlags}
     * member.
     * 
     * <p>Absolute data is specified as the x coordinate of the mouse; relative data is specified as the number of pixels moved.</p>
     */
    @NativeType("LONG")
    public int dx() { return ndx(address()); }
    /**
     * the absolute position of the mouse, or the amount of motion since the last mouse event was generated, depending on the value of the {@code dwFlags}
     * member.
     * 
     * <p>Absolute data is specified as the y coordinate of the mouse; relative data is specified as the number of pixels moved.</p>
     */
    @NativeType("LONG")
    public int dy() { return ndy(address()); }
    /**
     * If {@code dwFlags} contains {@link User32#MOUSEEVENTF_WHEEL}, then {@code mouseData} specifies the amount of wheel movement. A positive value indicates that the
     * wheel was rotated forward, away from the user; a negative value indicates that the wheel was rotated backward, toward the user. One wheel click is
     * defined as {@link User32#WHEEL_DELTA}, which is 120.
     * 
     * <p>Windows Vista: If {@code dwFlags} contains {@link User32#MOUSEEVENTF_HWHEEL}, then {@code dwData} specifies the amount of wheel movement. A positive value indicates
     * that the wheel was rotated to the right; a negative value indicates that the wheel was rotated to the left. One wheel click is defined as
     * {@code WHEEL_DELTA}, which is 120.</p>
     * 
     * <p>If {@code dwFlags} does not contain {@link User32#MOUSEEVENTF_WHEEL}, {@link User32#MOUSEEVENTF_XDOWN}, or {@link User32#MOUSEEVENTF_XUP}, then {@code mouseData} should be zero.</p>
     * 
     * <p>If {@code dwFlags} contains {@link User32#MOUSEEVENTF_XDOWN} or {@link User32#MOUSEEVENTF_XUP}, then {@code mouseData} specifies which X buttons were pressed or released. This
     * value may be any combination of the following flags: {@link User32#XBUTTON1}, {@link User32#XBUTTON2}. One of:<br></p><table><tr><td>{@link User32#XBUTTON1}</td><td>{@link User32#XBUTTON2}</td></tr></table>
     */
    @NativeType("DWORD")
    public int mouseData() { return nmouseData(address()); }
    /**
     * A set of bit flags that specify various aspects of mouse motion and button clicks.
     * 
     * <p>The bit flags that specify mouse button status are set to indicate changes in status, not ongoing conditions. For example, if the left mouse button is
     * pressed and held down, {@link User32#MOUSEEVENTF_LEFTDOWN} is set when the left button is first pressed, but not for subsequent motions. Similarly,
     * {@link User32#MOUSEEVENTF_LEFTUP} is set only when the button is first released.</p>
     * 
     * <p>You cannot specify both the {@link User32#MOUSEEVENTF_WHEEL} flag and either {@link User32#MOUSEEVENTF_XDOWN} or {@link User32#MOUSEEVENTF_XUP} flags simultaneously in the {@code dwFlags}
     * parameter, because they both require use of the {@code mouseData} field. One of:<br></p><table><tr><td>{@link User32#MOUSEEVENTF_ABSOLUTE}</td><td>{@link User32#MOUSEEVENTF_HWHEEL}</td><td>{@link User32#MOUSEEVENTF_MOVE}</td><td>{@link User32#MOUSEEVENTF_MOVE_NOCOALESCE}</td></tr><tr><td>{@link User32#MOUSEEVENTF_LEFTDOWN}</td><td>{@link User32#MOUSEEVENTF_LEFTUP}</td><td>{@link User32#MOUSEEVENTF_RIGHTDOWN}</td><td>{@link User32#MOUSEEVENTF_RIGHTUP}</td></tr><tr><td>{@link User32#MOUSEEVENTF_MIDDLEDOWN}</td><td>{@link User32#MOUSEEVENTF_MIDDLEUP}</td><td>{@link User32#MOUSEEVENTF_VIRTUALDESK}</td><td>{@link User32#MOUSEEVENTF_WHEEL}</td></tr><tr><td>{@link User32#MOUSEEVENTF_XDOWN}</td><td>{@link User32#MOUSEEVENTF_XUP}</td></tr></table>
     */
    @NativeType("DWORD")
    public int dwFlags() { return ndwFlags(address()); }
    /** the time stamp for the event, in milliseconds. If this parameter is 0, the system will provide its own time stamp. */
    @NativeType("DWORD")
    public int time() { return ntime(address()); }
    /** an additional value associated with the mouse event. An application calls {@link User32#GetMessageExtraInfo} to obtain this extra information. */
    @NativeType("ULONG_PTR")
    public long dwExtraInfo() { return ndwExtraInfo(address()); }

    /** Sets the specified value to the {@link #dx} field. */
    public MOUSEINPUT dx(@NativeType("LONG") int value) { ndx(address(), value); return this; }
    /** Sets the specified value to the {@link #dy} field. */
    public MOUSEINPUT dy(@NativeType("LONG") int value) { ndy(address(), value); return this; }
    /** Sets the specified value to the {@link #mouseData} field. */
    public MOUSEINPUT mouseData(@NativeType("DWORD") int value) { nmouseData(address(), value); return this; }
    /** Sets the specified value to the {@link #dwFlags} field. */
    public MOUSEINPUT dwFlags(@NativeType("DWORD") int value) { ndwFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public MOUSEINPUT time(@NativeType("DWORD") int value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@link #dwExtraInfo} field. */
    public MOUSEINPUT dwExtraInfo(@NativeType("ULONG_PTR") long value) { ndwExtraInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public MOUSEINPUT set(
        int dx,
        int dy,
        int mouseData,
        int dwFlags,
        int time,
        long dwExtraInfo
    ) {
        dx(dx);
        dy(dy);
        mouseData(mouseData);
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
    public MOUSEINPUT set(MOUSEINPUT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MOUSEINPUT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MOUSEINPUT malloc() {
        return new MOUSEINPUT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MOUSEINPUT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MOUSEINPUT calloc() {
        return new MOUSEINPUT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MOUSEINPUT} instance allocated with {@link BufferUtils}. */
    public static MOUSEINPUT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MOUSEINPUT(memAddress(container), container);
    }

    /** Returns a new {@code MOUSEINPUT} instance for the specified memory address. */
    public static MOUSEINPUT create(long address) {
        return new MOUSEINPUT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MOUSEINPUT createSafe(long address) {
        return address == NULL ? null : new MOUSEINPUT(address, null);
    }

    /**
     * Returns a new {@link MOUSEINPUT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MOUSEINPUT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MOUSEINPUT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MOUSEINPUT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MOUSEINPUT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MOUSEINPUT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MOUSEINPUT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MOUSEINPUT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MOUSEINPUT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static MOUSEINPUT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static MOUSEINPUT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static MOUSEINPUT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static MOUSEINPUT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static MOUSEINPUT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static MOUSEINPUT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static MOUSEINPUT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static MOUSEINPUT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code MOUSEINPUT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MOUSEINPUT malloc(MemoryStack stack) {
        return new MOUSEINPUT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MOUSEINPUT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MOUSEINPUT calloc(MemoryStack stack) {
        return new MOUSEINPUT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MOUSEINPUT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MOUSEINPUT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MOUSEINPUT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MOUSEINPUT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #dx}. */
    public static int ndx(long struct) { return UNSAFE.getInt(null, struct + MOUSEINPUT.DX); }
    /** Unsafe version of {@link #dy}. */
    public static int ndy(long struct) { return UNSAFE.getInt(null, struct + MOUSEINPUT.DY); }
    /** Unsafe version of {@link #mouseData}. */
    public static int nmouseData(long struct) { return UNSAFE.getInt(null, struct + MOUSEINPUT.MOUSEDATA); }
    /** Unsafe version of {@link #dwFlags}. */
    public static int ndwFlags(long struct) { return UNSAFE.getInt(null, struct + MOUSEINPUT.DWFLAGS); }
    /** Unsafe version of {@link #time}. */
    public static int ntime(long struct) { return UNSAFE.getInt(null, struct + MOUSEINPUT.TIME); }
    /** Unsafe version of {@link #dwExtraInfo}. */
    public static long ndwExtraInfo(long struct) { return memGetAddress(struct + MOUSEINPUT.DWEXTRAINFO); }

    /** Unsafe version of {@link #dx(int) dx}. */
    public static void ndx(long struct, int value) { UNSAFE.putInt(null, struct + MOUSEINPUT.DX, value); }
    /** Unsafe version of {@link #dy(int) dy}. */
    public static void ndy(long struct, int value) { UNSAFE.putInt(null, struct + MOUSEINPUT.DY, value); }
    /** Unsafe version of {@link #mouseData(int) mouseData}. */
    public static void nmouseData(long struct, int value) { UNSAFE.putInt(null, struct + MOUSEINPUT.MOUSEDATA, value); }
    /** Unsafe version of {@link #dwFlags(int) dwFlags}. */
    public static void ndwFlags(long struct, int value) { UNSAFE.putInt(null, struct + MOUSEINPUT.DWFLAGS, value); }
    /** Unsafe version of {@link #time(int) time}. */
    public static void ntime(long struct, int value) { UNSAFE.putInt(null, struct + MOUSEINPUT.TIME, value); }
    /** Unsafe version of {@link #dwExtraInfo(long) dwExtraInfo}. */
    public static void ndwExtraInfo(long struct, long value) { memPutAddress(struct + MOUSEINPUT.DWEXTRAINFO, value); }

    // -----------------------------------

    /** An array of {@link MOUSEINPUT} structs. */
    public static class Buffer extends StructBuffer<MOUSEINPUT, Buffer> implements NativeResource {

        private static final MOUSEINPUT ELEMENT_FACTORY = MOUSEINPUT.create(-1L);

        /**
         * Creates a new {@code MOUSEINPUT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MOUSEINPUT#SIZEOF}, and its mark will be undefined.</p>
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
        protected MOUSEINPUT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link MOUSEINPUT#dx} field. */
        @NativeType("LONG")
        public int dx() { return MOUSEINPUT.ndx(address()); }
        /** @return the value of the {@link MOUSEINPUT#dy} field. */
        @NativeType("LONG")
        public int dy() { return MOUSEINPUT.ndy(address()); }
        /** @return the value of the {@link MOUSEINPUT#mouseData} field. */
        @NativeType("DWORD")
        public int mouseData() { return MOUSEINPUT.nmouseData(address()); }
        /** @return the value of the {@link MOUSEINPUT#dwFlags} field. */
        @NativeType("DWORD")
        public int dwFlags() { return MOUSEINPUT.ndwFlags(address()); }
        /** @return the value of the {@link MOUSEINPUT#time} field. */
        @NativeType("DWORD")
        public int time() { return MOUSEINPUT.ntime(address()); }
        /** @return the value of the {@link MOUSEINPUT#dwExtraInfo} field. */
        @NativeType("ULONG_PTR")
        public long dwExtraInfo() { return MOUSEINPUT.ndwExtraInfo(address()); }

        /** Sets the specified value to the {@link MOUSEINPUT#dx} field. */
        public MOUSEINPUT.Buffer dx(@NativeType("LONG") int value) { MOUSEINPUT.ndx(address(), value); return this; }
        /** Sets the specified value to the {@link MOUSEINPUT#dy} field. */
        public MOUSEINPUT.Buffer dy(@NativeType("LONG") int value) { MOUSEINPUT.ndy(address(), value); return this; }
        /** Sets the specified value to the {@link MOUSEINPUT#mouseData} field. */
        public MOUSEINPUT.Buffer mouseData(@NativeType("DWORD") int value) { MOUSEINPUT.nmouseData(address(), value); return this; }
        /** Sets the specified value to the {@link MOUSEINPUT#dwFlags} field. */
        public MOUSEINPUT.Buffer dwFlags(@NativeType("DWORD") int value) { MOUSEINPUT.ndwFlags(address(), value); return this; }
        /** Sets the specified value to the {@link MOUSEINPUT#time} field. */
        public MOUSEINPUT.Buffer time(@NativeType("DWORD") int value) { MOUSEINPUT.ntime(address(), value); return this; }
        /** Sets the specified value to the {@link MOUSEINPUT#dwExtraInfo} field. */
        public MOUSEINPUT.Buffer dwExtraInfo(@NativeType("ULONG_PTR") long value) { MOUSEINPUT.ndwExtraInfo(address(), value); return this; }

    }

}