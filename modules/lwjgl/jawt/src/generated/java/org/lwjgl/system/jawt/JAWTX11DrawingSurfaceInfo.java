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

/**
 * <pre>{@code
 * struct JAWT_X11DrawingSurfaceInfo {
 *     Drawable drawable;
 *     Display * display;
 *     VisualID visualID;
 *     Colormap colormapID;
 *     int depth;
 * }}</pre>
 */
@NativeType("struct JAWT_X11DrawingSurfaceInfo")
public class JAWTX11DrawingSurfaceInfo extends Struct<JAWTX11DrawingSurfaceInfo> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DRAWABLE,
        DISPLAY,
        VISUALID,
        COLORMAPID,
        DEPTH;

    static {
        Layout layout = __struct(
            __member(CLONG_SIZE),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DRAWABLE = layout.offsetof(0);
        DISPLAY = layout.offsetof(1);
        VISUALID = layout.offsetof(2);
        COLORMAPID = layout.offsetof(3);
        DEPTH = layout.offsetof(4);
    }

    protected JAWTX11DrawingSurfaceInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected JAWTX11DrawingSurfaceInfo create(long address, @Nullable ByteBuffer container) {
        return new JAWTX11DrawingSurfaceInfo(address, container);
    }

    /**
     * Creates a {@code JAWTX11DrawingSurfaceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public JAWTX11DrawingSurfaceInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code drawable} field. */
    @NativeType("Drawable")
    public long drawable() { return ndrawable(address()); }
    /** @return the value of the {@code display} field. */
    @NativeType("Display *")
    public long display() { return ndisplay(address()); }
    /** @return the value of the {@code visualID} field. */
    @NativeType("VisualID")
    public long visualID() { return nvisualID(address()); }
    /** @return the value of the {@code colormapID} field. */
    @NativeType("Colormap")
    public long colormapID() { return ncolormapID(address()); }
    /** @return the value of the {@code depth} field. */
    public int depth() { return ndepth(address()); }

    // -----------------------------------

    /** Returns a new {@code JAWTX11DrawingSurfaceInfo} instance for the specified memory address. */
    public static JAWTX11DrawingSurfaceInfo create(long address) {
        return new JAWTX11DrawingSurfaceInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable JAWTX11DrawingSurfaceInfo createSafe(long address) {
        return address == NULL ? null : new JAWTX11DrawingSurfaceInfo(address, null);
    }

    /**
     * Create a {@link JAWTX11DrawingSurfaceInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static JAWTX11DrawingSurfaceInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static JAWTX11DrawingSurfaceInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #drawable}. */
    public static long ndrawable(long struct) { return memGetCLong(struct + JAWTX11DrawingSurfaceInfo.DRAWABLE); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + JAWTX11DrawingSurfaceInfo.DISPLAY); }
    /** Unsafe version of {@link #visualID}. */
    public static long nvisualID(long struct) { return memGetCLong(struct + JAWTX11DrawingSurfaceInfo.VISUALID); }
    /** Unsafe version of {@link #colormapID}. */
    public static long ncolormapID(long struct) { return memGetCLong(struct + JAWTX11DrawingSurfaceInfo.COLORMAPID); }
    /** Unsafe version of {@link #depth}. */
    public static int ndepth(long struct) { return memGetInt(struct + JAWTX11DrawingSurfaceInfo.DEPTH); }

    // -----------------------------------

    /** An array of {@link JAWTX11DrawingSurfaceInfo} structs. */
    public static class Buffer extends StructBuffer<JAWTX11DrawingSurfaceInfo, Buffer> {

        private static final JAWTX11DrawingSurfaceInfo ELEMENT_FACTORY = JAWTX11DrawingSurfaceInfo.create(-1L);

        /**
         * Creates a new {@code JAWTX11DrawingSurfaceInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link JAWTX11DrawingSurfaceInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected JAWTX11DrawingSurfaceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code drawable} field. */
        @NativeType("Drawable")
        public long drawable() { return JAWTX11DrawingSurfaceInfo.ndrawable(address()); }
        /** @return the value of the {@code display} field. */
        @NativeType("Display *")
        public long display() { return JAWTX11DrawingSurfaceInfo.ndisplay(address()); }
        /** @return the value of the {@code visualID} field. */
        @NativeType("VisualID")
        public long visualID() { return JAWTX11DrawingSurfaceInfo.nvisualID(address()); }
        /** @return the value of the {@code colormapID} field. */
        @NativeType("Colormap")
        public long colormapID() { return JAWTX11DrawingSurfaceInfo.ncolormapID(address()); }
        /** @return the value of the {@code depth} field. */
        public int depth() { return JAWTX11DrawingSurfaceInfo.ndepth(address()); }

    }

}