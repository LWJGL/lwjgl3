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
 * The data exchange structure for the {@code increase-x-height} property.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Prop_IncreaseXHeight {
 *     {@link FT_Face FT_Face} face;
 *     FT_UInt limit;
 * }</code></pre>
 */
public class FT_Prop_IncreaseXHeight extends Struct<FT_Prop_IncreaseXHeight> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FACE,
        LIMIT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FACE = layout.offsetof(0);
        LIMIT = layout.offsetof(1);
    }

    protected FT_Prop_IncreaseXHeight(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Prop_IncreaseXHeight create(long address, @Nullable ByteBuffer container) {
        return new FT_Prop_IncreaseXHeight(address, container);
    }

    /**
     * Creates a {@code FT_Prop_IncreaseXHeight} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Prop_IncreaseXHeight(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_Face} view of the struct pointed to by the {@code face} field. */
    public FT_Face face() { return nface(address()); }
    /** @return the value of the {@code limit} field. */
    @NativeType("FT_UInt")
    public int limit$() { return nlimit$(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_Prop_IncreaseXHeight} instance for the specified memory address. */
    public static FT_Prop_IncreaseXHeight create(long address) {
        return new FT_Prop_IncreaseXHeight(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Prop_IncreaseXHeight createSafe(long address) {
        return address == NULL ? null : new FT_Prop_IncreaseXHeight(address, null);
    }

    /**
     * Create a {@link FT_Prop_IncreaseXHeight.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Prop_IncreaseXHeight.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Prop_IncreaseXHeight.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #face}. */
    public static FT_Face nface(long struct) { return FT_Face.create(memGetAddress(struct + FT_Prop_IncreaseXHeight.FACE)); }
    /** Unsafe version of {@link #limit$}. */
    public static int nlimit$(long struct) { return UNSAFE.getInt(null, struct + FT_Prop_IncreaseXHeight.LIMIT); }

    // -----------------------------------

    /** An array of {@link FT_Prop_IncreaseXHeight} structs. */
    public static class Buffer extends StructBuffer<FT_Prop_IncreaseXHeight, Buffer> {

        private static final FT_Prop_IncreaseXHeight ELEMENT_FACTORY = FT_Prop_IncreaseXHeight.create(-1L);

        /**
         * Creates a new {@code FT_Prop_IncreaseXHeight.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Prop_IncreaseXHeight#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Prop_IncreaseXHeight getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_Face} view of the struct pointed to by the {@code face} field. */
        public FT_Face face() { return FT_Prop_IncreaseXHeight.nface(address()); }
        /** @return the value of the {@code limit} field. */
        @NativeType("FT_UInt")
        public int limit$() { return FT_Prop_IncreaseXHeight.nlimit$(address()); }

    }

}