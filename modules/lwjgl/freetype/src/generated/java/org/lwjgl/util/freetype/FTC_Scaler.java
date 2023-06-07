/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * A structure used to describe a given character size in either pixels or points to the cache manager. See {@link FreeType#FTC_Manager_LookupSize}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FTC_ScalerRec {
 *     FTC_FaceID face_id;
 *     FT_UInt width;
 *     FT_UInt height;
 *     FT_Int pixel;
 *     FT_UInt x_res;
 *     FT_UInt y_res;
 * }</code></pre>
 */
@NativeType("struct FTC_ScalerRec")
public class FTC_Scaler extends Struct<FTC_Scaler> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FACE_ID,
        WIDTH,
        HEIGHT,
        PIXEL,
        X_RES,
        Y_RES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FACE_ID = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        HEIGHT = layout.offsetof(2);
        PIXEL = layout.offsetof(3);
        X_RES = layout.offsetof(4);
        Y_RES = layout.offsetof(5);
    }

    protected FTC_Scaler(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FTC_Scaler create(long address, @Nullable ByteBuffer container) {
        return new FTC_Scaler(address, container);
    }

    /**
     * Creates a {@code FTC_Scaler} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FTC_Scaler(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code face_id} field. */
    @NativeType("FTC_FaceID")
    public long face_id() { return nface_id(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("FT_UInt")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("FT_UInt")
    public int height() { return nheight(address()); }
    /** @return the value of the {@code pixel} field. */
    @NativeType("FT_Int")
    public int pixel() { return npixel(address()); }
    /** @return the value of the {@code x_res} field. */
    @NativeType("FT_UInt")
    public int x_res() { return nx_res(address()); }
    /** @return the value of the {@code y_res} field. */
    @NativeType("FT_UInt")
    public int y_res() { return ny_res(address()); }

    // -----------------------------------

    /** Returns a new {@code FTC_Scaler} instance for the specified memory address. */
    public static FTC_Scaler create(long address) {
        return new FTC_Scaler(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FTC_Scaler createSafe(long address) {
        return address == NULL ? null : new FTC_Scaler(address, null);
    }

    /**
     * Create a {@link FTC_Scaler.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FTC_Scaler.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FTC_Scaler.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #face_id}. */
    public static long nface_id(long struct) { return memGetAddress(struct + FTC_Scaler.FACE_ID); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + FTC_Scaler.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + FTC_Scaler.HEIGHT); }
    /** Unsafe version of {@link #pixel}. */
    public static int npixel(long struct) { return UNSAFE.getInt(null, struct + FTC_Scaler.PIXEL); }
    /** Unsafe version of {@link #x_res}. */
    public static int nx_res(long struct) { return UNSAFE.getInt(null, struct + FTC_Scaler.X_RES); }
    /** Unsafe version of {@link #y_res}. */
    public static int ny_res(long struct) { return UNSAFE.getInt(null, struct + FTC_Scaler.Y_RES); }

    // -----------------------------------

    /** An array of {@link FTC_Scaler} structs. */
    public static class Buffer extends StructBuffer<FTC_Scaler, Buffer> {

        private static final FTC_Scaler ELEMENT_FACTORY = FTC_Scaler.create(-1L);

        /**
         * Creates a new {@code FTC_Scaler.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FTC_Scaler#SIZEOF}, and its mark will be undefined.</p>
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
        protected FTC_Scaler getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code face_id} field. */
        @NativeType("FTC_FaceID")
        public long face_id() { return FTC_Scaler.nface_id(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("FT_UInt")
        public int width() { return FTC_Scaler.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("FT_UInt")
        public int height() { return FTC_Scaler.nheight(address()); }
        /** @return the value of the {@code pixel} field. */
        @NativeType("FT_Int")
        public int pixel() { return FTC_Scaler.npixel(address()); }
        /** @return the value of the {@code x_res} field. */
        @NativeType("FT_UInt")
        public int x_res() { return FTC_Scaler.nx_res(address()); }
        /** @return the value of the {@code y_res} field. */
        @NativeType("FT_UInt")
        public int y_res() { return FTC_Scaler.ny_res(address()); }

    }

}