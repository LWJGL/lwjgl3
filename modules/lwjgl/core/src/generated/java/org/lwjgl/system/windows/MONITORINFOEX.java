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
 * Contains information about a display monitor.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct MONITORINFOEX {
 *     DWORD {@link #cbSize};
 *     {@link RECT RECT} {@link #rcMonitor};
 *     {@link RECT RECT} {@link #rcWork};
 *     DWORD {@link #dwFlags};
 *     TCHAR {@link #szDevice}[32];
 * }</code></pre>
 */
public class MONITORINFOEX extends Struct<MONITORINFOEX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CBSIZE,
        RCMONITOR,
        RCWORK,
        DWFLAGS,
        SZDEVICE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(RECT.SIZEOF, RECT.ALIGNOF),
            __member(RECT.SIZEOF, RECT.ALIGNOF),
            __member(4),
            __array(2, 32)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CBSIZE = layout.offsetof(0);
        RCMONITOR = layout.offsetof(1);
        RCWORK = layout.offsetof(2);
        DWFLAGS = layout.offsetof(3);
        SZDEVICE = layout.offsetof(4);
    }

    protected MONITORINFOEX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MONITORINFOEX create(long address, @Nullable ByteBuffer container) {
        return new MONITORINFOEX(address, container);
    }

    /**
     * Creates a {@code MONITORINFOEX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MONITORINFOEX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * the size, in bytes, of the structure.
     * 
     * <p>Set this member to {@link #SIZEOF} before calling the {@link User32#GetMonitorInfo} function. Doing so lets the function determine the type of structure you
     * are passing to it.</p>
     */
    @NativeType("DWORD")
    public int cbSize() { return ncbSize(address()); }
    /**
     * a {@link RECT} structure that specifies the display monitor rectangle, expressed in virtual-screen coordinates. Note that if the monitor is not the primary
     * display monitor, some of the rectangle's coordinates may be negative values.
     */
    public RECT rcMonitor() { return nrcMonitor(address()); }
    /**
     * a {@link RECT} structure that specifies the work area rectangle of the display monitor that can be used by applications, expressed in virtual-screen
     * coordinates. Windows uses this rectangle to maximize an application on the monitor. The rest of the area in {@code rcMonitor} contains system windows
     * such as the task bar and side bars. Note that if the monitor is not the primary display monitor, some of the rectangle's coordinates may be negative
     * values.
     */
    public RECT rcWork() { return nrcWork(address()); }
    /** the attributes of the display monitor. May be:<br>{@link User32#MONITORINFOF_PRIMARY} */
    @NativeType("DWORD")
    public int dwFlags() { return ndwFlags(address()); }
    /** a string that specifies the device name of the monitor being used */
    @NativeType("TCHAR[32]")
    public ByteBuffer szDevice() { return nszDevice(address()); }
    /** a string that specifies the device name of the monitor being used */
    @NativeType("TCHAR[32]")
    public String szDeviceString() { return nszDeviceString(address()); }

    /** Sets the specified value to the {@link #cbSize} field. */
    public MONITORINFOEX cbSize(@NativeType("DWORD") int value) { ncbSize(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MONITORINFOEX set(MONITORINFOEX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MONITORINFOEX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MONITORINFOEX malloc() {
        return new MONITORINFOEX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MONITORINFOEX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MONITORINFOEX calloc() {
        return new MONITORINFOEX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MONITORINFOEX} instance allocated with {@link BufferUtils}. */
    public static MONITORINFOEX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MONITORINFOEX(memAddress(container), container);
    }

    /** Returns a new {@code MONITORINFOEX} instance for the specified memory address. */
    public static MONITORINFOEX create(long address) {
        return new MONITORINFOEX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MONITORINFOEX createSafe(long address) {
        return address == NULL ? null : new MONITORINFOEX(address, null);
    }

    /**
     * Returns a new {@link MONITORINFOEX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MONITORINFOEX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MONITORINFOEX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MONITORINFOEX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MONITORINFOEX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MONITORINFOEX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MONITORINFOEX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MONITORINFOEX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MONITORINFOEX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static MONITORINFOEX mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static MONITORINFOEX callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static MONITORINFOEX mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static MONITORINFOEX callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static MONITORINFOEX.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static MONITORINFOEX.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static MONITORINFOEX.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static MONITORINFOEX.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code MONITORINFOEX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MONITORINFOEX malloc(MemoryStack stack) {
        return new MONITORINFOEX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MONITORINFOEX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MONITORINFOEX calloc(MemoryStack stack) {
        return new MONITORINFOEX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MONITORINFOEX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MONITORINFOEX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MONITORINFOEX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MONITORINFOEX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cbSize}. */
    public static int ncbSize(long struct) { return UNSAFE.getInt(null, struct + MONITORINFOEX.CBSIZE); }
    /** Unsafe version of {@link #rcMonitor}. */
    public static RECT nrcMonitor(long struct) { return RECT.create(struct + MONITORINFOEX.RCMONITOR); }
    /** Unsafe version of {@link #rcWork}. */
    public static RECT nrcWork(long struct) { return RECT.create(struct + MONITORINFOEX.RCWORK); }
    /** Unsafe version of {@link #dwFlags}. */
    public static int ndwFlags(long struct) { return UNSAFE.getInt(null, struct + MONITORINFOEX.DWFLAGS); }
    /** Unsafe version of {@link #szDevice}. */
    public static ByteBuffer nszDevice(long struct) { return memByteBuffer(struct + MONITORINFOEX.SZDEVICE, 32 * 2); }
    /** Unsafe version of {@link #szDeviceString}. */
    public static String nszDeviceString(long struct) { return memUTF16(struct + MONITORINFOEX.SZDEVICE); }

    /** Unsafe version of {@link #cbSize(int) cbSize}. */
    public static void ncbSize(long struct, int value) { UNSAFE.putInt(null, struct + MONITORINFOEX.CBSIZE, value); }

    // -----------------------------------

    /** An array of {@link MONITORINFOEX} structs. */
    public static class Buffer extends StructBuffer<MONITORINFOEX, Buffer> implements NativeResource {

        private static final MONITORINFOEX ELEMENT_FACTORY = MONITORINFOEX.create(-1L);

        /**
         * Creates a new {@code MONITORINFOEX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MONITORINFOEX#SIZEOF}, and its mark will be undefined.</p>
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
        protected MONITORINFOEX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link MONITORINFOEX#cbSize} field. */
        @NativeType("DWORD")
        public int cbSize() { return MONITORINFOEX.ncbSize(address()); }
        /** @return a {@link RECT} view of the {@link MONITORINFOEX#rcMonitor} field. */
        public RECT rcMonitor() { return MONITORINFOEX.nrcMonitor(address()); }
        /** @return a {@link RECT} view of the {@link MONITORINFOEX#rcWork} field. */
        public RECT rcWork() { return MONITORINFOEX.nrcWork(address()); }
        /** @return the value of the {@link MONITORINFOEX#dwFlags} field. */
        @NativeType("DWORD")
        public int dwFlags() { return MONITORINFOEX.ndwFlags(address()); }
        /** @return a {@link ByteBuffer} view of the {@link MONITORINFOEX#szDevice} field. */
        @NativeType("TCHAR[32]")
        public ByteBuffer szDevice() { return MONITORINFOEX.nszDevice(address()); }
        /** @return the null-terminated string stored in the {@link MONITORINFOEX#szDevice} field. */
        @NativeType("TCHAR[32]")
        public String szDeviceString() { return MONITORINFOEX.nszDeviceString(address()); }

        /** Sets the specified value to the {@link MONITORINFOEX#cbSize} field. */
        public MONITORINFOEX.Buffer cbSize(@NativeType("DWORD") int value) { MONITORINFOEX.ncbSize(address(), value); return this; }

    }

}