/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jawt;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.windows.User32;

/**
 * <pre>{@code
 * struct JAWT_Win32DrawingSurfaceInfo {
 *     union {
 *         HWND hwnd;
 *         HBITMAP hbitmap;
 *         void * pbits;
 *     };
 *     HDC hdc;
 *     HPALETTE hpalette;
 * }}</pre>
 */
@NativeType("struct JAWT_Win32DrawingSurfaceInfo")
public class JAWTWin32DrawingSurfaceInfo extends Struct<JAWTWin32DrawingSurfaceInfo> {

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

    protected JAWTWin32DrawingSurfaceInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected JAWTWin32DrawingSurfaceInfo create(long address, @Nullable ByteBuffer container) {
        return new JAWTWin32DrawingSurfaceInfo(address, container);
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

    /** @return the value of the {@code hwnd} field. */
    @NativeType("HWND")
    public long hwnd() { return nhwnd(address()); }
    /** @return the value of the {@code hbitmap} field. */
    @NativeType("HBITMAP")
    public long hbitmap() { return nhbitmap(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pbits} field. */
    @NativeType("void *")
    public ByteBuffer pbits(int capacity) { return npbits(address(), capacity); }
    /** @return the value of the {@code hdc} field. */
    @NativeType("HDC")
    public long hdc() { return nhdc(address()); }
    /** @return the value of the {@code hpalette} field. */
    @NativeType("HPALETTE")
    public long hpalette() { return nhpalette(address()); }

    // -----------------------------------

    /** Returns a new {@code JAWTWin32DrawingSurfaceInfo} instance for the specified memory address. */
    public static JAWTWin32DrawingSurfaceInfo create(long address) {
        return new JAWTWin32DrawingSurfaceInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable JAWTWin32DrawingSurfaceInfo createSafe(long address) {
        return address == NULL ? null : new JAWTWin32DrawingSurfaceInfo(address, null);
    }

    /**
     * Create a {@link JAWTWin32DrawingSurfaceInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static JAWTWin32DrawingSurfaceInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static JAWTWin32DrawingSurfaceInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
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
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link JAWTWin32DrawingSurfaceInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected JAWTWin32DrawingSurfaceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code hwnd} field. */
        @NativeType("HWND")
        public long hwnd() { return JAWTWin32DrawingSurfaceInfo.nhwnd(address()); }
        /** @return the value of the {@code hbitmap} field. */
        @NativeType("HBITMAP")
        public long hbitmap() { return JAWTWin32DrawingSurfaceInfo.nhbitmap(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pbits} field. */
        @NativeType("void *")
        public ByteBuffer pbits(int capacity) { return JAWTWin32DrawingSurfaceInfo.npbits(address(), capacity); }
        /** @return the value of the {@code hdc} field. */
        @NativeType("HDC")
        public long hdc() { return JAWTWin32DrawingSurfaceInfo.nhdc(address()); }
        /** @return the value of the {@code hpalette} field. */
        @NativeType("HPALETTE")
        public long hpalette() { return JAWTWin32DrawingSurfaceInfo.nhpalette(address()); }

    }

}