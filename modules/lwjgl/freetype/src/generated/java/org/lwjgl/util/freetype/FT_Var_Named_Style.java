/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * A structure to model a named instance in a TrueType GX or OpenType variation font.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Var_Named_Style {
 *     FT_Fixed * coords;
 *     FT_UInt strid;
 *     FT_UInt psid;
 * }</code></pre>
 */
public class FT_Var_Named_Style extends Struct<FT_Var_Named_Style> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COORDS,
        STRID,
        PSID;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COORDS = layout.offsetof(0);
        STRID = layout.offsetof(1);
        PSID = layout.offsetof(2);
    }

    protected FT_Var_Named_Style(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Var_Named_Style create(long address, @Nullable ByteBuffer container) {
        return new FT_Var_Named_Style(address, container);
    }

    /**
     * Creates a {@code FT_Var_Named_Style} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Var_Named_Style(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * @return a {@link CLongBuffer} view of the data pointed to by the {@code coords} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("FT_Fixed *")
    public CLongBuffer coords(int capacity) { return ncoords(address(), capacity); }
    /** @return the value of the {@code strid} field. */
    @NativeType("FT_UInt")
    public int strid() { return nstrid(address()); }
    /** @return the value of the {@code psid} field. */
    @NativeType("FT_UInt")
    public int psid() { return npsid(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_Var_Named_Style} instance for the specified memory address. */
    public static FT_Var_Named_Style create(long address) {
        return new FT_Var_Named_Style(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Var_Named_Style createSafe(long address) {
        return address == NULL ? null : new FT_Var_Named_Style(address, null);
    }

    /**
     * Create a {@link FT_Var_Named_Style.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Var_Named_Style.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Var_Named_Style.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #coords(int) coords}. */
    public static CLongBuffer ncoords(long struct, int capacity) { return memCLongBuffer(memGetAddress(struct + FT_Var_Named_Style.COORDS), capacity); }
    /** Unsafe version of {@link #strid}. */
    public static int nstrid(long struct) { return UNSAFE.getInt(null, struct + FT_Var_Named_Style.STRID); }
    /** Unsafe version of {@link #psid}. */
    public static int npsid(long struct) { return UNSAFE.getInt(null, struct + FT_Var_Named_Style.PSID); }

    // -----------------------------------

    /** An array of {@link FT_Var_Named_Style} structs. */
    public static class Buffer extends StructBuffer<FT_Var_Named_Style, Buffer> {

        private static final FT_Var_Named_Style ELEMENT_FACTORY = FT_Var_Named_Style.create(-1L);

        /**
         * Creates a new {@code FT_Var_Named_Style.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Var_Named_Style#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Var_Named_Style getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * @return a {@link CLongBuffer} view of the data pointed to by the {@code coords} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("FT_Fixed *")
        public CLongBuffer coords(int capacity) { return FT_Var_Named_Style.ncoords(address(), capacity); }
        /** @return the value of the {@code strid} field. */
        @NativeType("FT_UInt")
        public int strid() { return FT_Var_Named_Style.nstrid(address()); }
        /** @return the value of the {@code psid} field. */
        @NativeType("FT_UInt")
        public int psid() { return FT_Var_Named_Style.npsid(address()); }

    }

}