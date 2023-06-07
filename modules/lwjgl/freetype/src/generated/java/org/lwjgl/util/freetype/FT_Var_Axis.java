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
 * A structure to model a given axis in design space for Multiple Masters, TrueType GX, and OpenType variation fonts.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Var_Axis {
 *     FT_String * name;
 *     FT_Fixed minimum;
 *     FT_Fixed def;
 *     FT_Fixed maximum;
 *     FT_ULong tag;
 *     FT_UInt strid;
 * }</code></pre>
 */
public class FT_Var_Axis extends Struct<FT_Var_Axis> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        MINIMUM,
        DEF,
        MAXIMUM,
        TAG,
        STRID;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        MINIMUM = layout.offsetof(1);
        DEF = layout.offsetof(2);
        MAXIMUM = layout.offsetof(3);
        TAG = layout.offsetof(4);
        STRID = layout.offsetof(5);
    }

    protected FT_Var_Axis(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Var_Axis create(long address, @Nullable ByteBuffer container) {
        return new FT_Var_Axis(address, container);
    }

    /**
     * Creates a {@code FT_Var_Axis} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Var_Axis(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("FT_String *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("FT_String *")
    public String nameString() { return nnameString(address()); }
    /** @return the value of the {@code minimum} field. */
    @NativeType("FT_Fixed")
    public long minimum() { return nminimum(address()); }
    /** @return the value of the {@code def} field. */
    @NativeType("FT_Fixed")
    public long def() { return ndef(address()); }
    /** @return the value of the {@code maximum} field. */
    @NativeType("FT_Fixed")
    public long maximum() { return nmaximum(address()); }
    /** @return the value of the {@code tag} field. */
    @NativeType("FT_ULong")
    public long tag() { return ntag(address()); }
    /** @return the value of the {@code strid} field. */
    @NativeType("FT_UInt")
    public int strid() { return nstrid(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_Var_Axis} instance for the specified memory address. */
    public static FT_Var_Axis create(long address) {
        return new FT_Var_Axis(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Var_Axis createSafe(long address) {
        return address == NULL ? null : new FT_Var_Axis(address, null);
    }

    /**
     * Create a {@link FT_Var_Axis.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Var_Axis.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Var_Axis.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + FT_Var_Axis.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + FT_Var_Axis.NAME)); }
    /** Unsafe version of {@link #minimum}. */
    public static long nminimum(long struct) { return memGetCLong(struct + FT_Var_Axis.MINIMUM); }
    /** Unsafe version of {@link #def}. */
    public static long ndef(long struct) { return memGetCLong(struct + FT_Var_Axis.DEF); }
    /** Unsafe version of {@link #maximum}. */
    public static long nmaximum(long struct) { return memGetCLong(struct + FT_Var_Axis.MAXIMUM); }
    /** Unsafe version of {@link #tag}. */
    public static long ntag(long struct) { return memGetCLong(struct + FT_Var_Axis.TAG); }
    /** Unsafe version of {@link #strid}. */
    public static int nstrid(long struct) { return UNSAFE.getInt(null, struct + FT_Var_Axis.STRID); }

    // -----------------------------------

    /** An array of {@link FT_Var_Axis} structs. */
    public static class Buffer extends StructBuffer<FT_Var_Axis, Buffer> {

        private static final FT_Var_Axis ELEMENT_FACTORY = FT_Var_Axis.create(-1L);

        /**
         * Creates a new {@code FT_Var_Axis.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Var_Axis#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Var_Axis getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("FT_String *")
        public ByteBuffer name() { return FT_Var_Axis.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("FT_String *")
        public String nameString() { return FT_Var_Axis.nnameString(address()); }
        /** @return the value of the {@code minimum} field. */
        @NativeType("FT_Fixed")
        public long minimum() { return FT_Var_Axis.nminimum(address()); }
        /** @return the value of the {@code def} field. */
        @NativeType("FT_Fixed")
        public long def() { return FT_Var_Axis.ndef(address()); }
        /** @return the value of the {@code maximum} field. */
        @NativeType("FT_Fixed")
        public long maximum() { return FT_Var_Axis.nmaximum(address()); }
        /** @return the value of the {@code tag} field. */
        @NativeType("FT_ULong")
        public long tag() { return FT_Var_Axis.ntag(address()); }
        /** @return the value of the {@code strid} field. */
        @NativeType("FT_UInt")
        public int strid() { return FT_Var_Axis.nstrid(address()); }

    }

}