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
 * A structure used to model the type of images in a glyph cache.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FTC_ImageTypeRec {
 *     FTC_FaceID face_id;
 *     FT_UInt width;
 *     FT_UInt height;
 *     FT_Int32 flags;
 * }</code></pre>
 */
@NativeType("struct FTC_ImageTypeRec")
public class FTC_ImageType extends Struct<FTC_ImageType> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FACE_ID,
        WIDTH,
        HEIGHT,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FACE_ID = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        HEIGHT = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
    }

    protected FTC_ImageType(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FTC_ImageType create(long address, @Nullable ByteBuffer container) {
        return new FTC_ImageType(address, container);
    }

    /**
     * Creates a {@code FTC_ImageType} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FTC_ImageType(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("FT_Int32")
    public int flags() { return nflags(address()); }

    // -----------------------------------

    /** Returns a new {@code FTC_ImageType} instance for the specified memory address. */
    public static FTC_ImageType create(long address) {
        return new FTC_ImageType(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FTC_ImageType createSafe(long address) {
        return address == NULL ? null : new FTC_ImageType(address, null);
    }

    /**
     * Create a {@link FTC_ImageType.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FTC_ImageType.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FTC_ImageType.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #face_id}. */
    public static long nface_id(long struct) { return memGetAddress(struct + FTC_ImageType.FACE_ID); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + FTC_ImageType.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + FTC_ImageType.HEIGHT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + FTC_ImageType.FLAGS); }

    // -----------------------------------

    /** An array of {@link FTC_ImageType} structs. */
    public static class Buffer extends StructBuffer<FTC_ImageType, Buffer> {

        private static final FTC_ImageType ELEMENT_FACTORY = FTC_ImageType.create(-1L);

        /**
         * Creates a new {@code FTC_ImageType.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FTC_ImageType#SIZEOF}, and its mark will be undefined.</p>
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
        protected FTC_ImageType getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code face_id} field. */
        @NativeType("FTC_FaceID")
        public long face_id() { return FTC_ImageType.nface_id(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("FT_UInt")
        public int width() { return FTC_ImageType.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("FT_UInt")
        public int height() { return FTC_ImageType.nheight(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("FT_Int32")
        public int flags() { return FTC_ImageType.nflags(address()); }

    }

}