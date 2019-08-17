/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jawt;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.windows.User32;

/**
 * Win32-specific declarations for AWT native interface.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li><em>&lt;union&gt;</em>
 * 
 * <ul>
 * <li>{@code hwnd} &ndash; the native window handle</li>
 * <li>{@code hbitmap} &ndash; the DDB handle</li>
 * <li>{@code pbits} &ndash; the DIB handle</li>
 * </ul></li>
 * <li>{@code hdc} &ndash; the device context handle. This HDC should always be used instead of the HDC returned from {@code BeginPaint()} or any calls to {@link User32#GetDC}.</li>
 * <li>{@code hpalette} &ndash; the palette handle</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct JAWT_Win32DrawingSurfaceInfo {
 *     union {
 *         HWND hwnd;
 *         HBITMAP hbitmap;
 *         void * pbits;
 *     };
 *     HDC hdc;
 *     HPALETTE hpalette;
 * }</code></pre>
 */
@NativeType("struct JAWT_Win32DrawingSurfaceInfo")
public class JAWTWin32DrawingSurfaceInfo extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HWND,
        HBITMAP,
        PBITS,
        HDC,
        HPALETTE;

    static {
        Layout layout = __struct(
            __union(
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE)
            ),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HWND = layout.offsetof(1);
        HBITMAP = layout.offsetof(2);
        PBITS = layout.offsetof(3);
        HDC = layout.offsetof(4);
        HPALETTE = layout.offsetof(5);
    }

    /**
     * Creates a {@code JAWTWin32DrawingSurfaceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public JAWTWin32DrawingSurfaceInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code hwnd} field. */
    @NativeType("HWND")
    public long hwnd() { return nhwnd(address()); }
    /** Returns the value of the {@code hbitmap} field. */
    @NativeType("HBITMAP")
    public long hbitmap() { return nhbitmap(address()); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code pbits} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void *")
    public ByteBuffer pbits(int capacity) { return npbits(address(), capacity); }
    /** Returns the value of the {@code hdc} field. */
    @NativeType("HDC")
    public long hdc() { return nhdc(address()); }
    /** Returns the value of the {@code hpalette} field. */
    @NativeType("HPALETTE")
    public long hpalette() { return nhpalette(address()); }

    // -----------------------------------

    /** Returns a new {@code JAWTWin32DrawingSurfaceInfo} instance for the specified memory address. */
    public static JAWTWin32DrawingSurfaceInfo create(long address) {
        return wrap(JAWTWin32DrawingSurfaceInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static JAWTWin32DrawingSurfaceInfo createSafe(long address) {
        return address == NULL ? null : wrap(JAWTWin32DrawingSurfaceInfo.class, address);
    }

    /**
     * Create a {@link JAWTWin32DrawingSurfaceInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static JAWTWin32DrawingSurfaceInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static JAWTWin32DrawingSurfaceInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #hwnd}. */
    public static long nhwnd(long struct) { return memGetAddress(struct + JAWTWin32DrawingSurfaceInfo.HWND); }
    /** Unsafe version of {@link #hbitmap}. */
    public static long nhbitmap(long struct) { return memGetAddress(struct + JAWTWin32DrawingSurfaceInfo.HBITMAP); }
    /** Unsafe version of {@link #pbits(int) pbits}. */
    public static ByteBuffer npbits(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + JAWTWin32DrawingSurfaceInfo.PBITS), capacity); }
    /** Unsafe version of {@link #hdc}. */
    public static long nhdc(long struct) { return memGetAddress(struct + JAWTWin32DrawingSurfaceInfo.HDC); }
    /** Unsafe version of {@link #hpalette}. */
    public static long nhpalette(long struct) { return memGetAddress(struct + JAWTWin32DrawingSurfaceInfo.HPALETTE); }

    // -----------------------------------

    /** An array of {@link JAWTWin32DrawingSurfaceInfo} structs. */
    public static class Buffer extends StructBuffer<JAWTWin32DrawingSurfaceInfo, Buffer> {

        private static final JAWTWin32DrawingSurfaceInfo ELEMENT_FACTORY = JAWTWin32DrawingSurfaceInfo.create(-1L);

        /**
         * Creates a new {@code JAWTWin32DrawingSurfaceInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link JAWTWin32DrawingSurfaceInfo#SIZEOF}, and its mark will be undefined.
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
        protected JAWTWin32DrawingSurfaceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code hwnd} field. */
        @NativeType("HWND")
        public long hwnd() { return JAWTWin32DrawingSurfaceInfo.nhwnd(address()); }
        /** Returns the value of the {@code hbitmap} field. */
        @NativeType("HBITMAP")
        public long hbitmap() { return JAWTWin32DrawingSurfaceInfo.nhbitmap(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code pbits} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer pbits(int capacity) { return JAWTWin32DrawingSurfaceInfo.npbits(address(), capacity); }
        /** Returns the value of the {@code hdc} field. */
        @NativeType("HDC")
        public long hdc() { return JAWTWin32DrawingSurfaceInfo.nhdc(address()); }
        /** Returns the value of the {@code hpalette} field. */
        @NativeType("HPALETTE")
        public long hpalette() { return JAWTWin32DrawingSurfaceInfo.nhpalette(address()); }

    }

}