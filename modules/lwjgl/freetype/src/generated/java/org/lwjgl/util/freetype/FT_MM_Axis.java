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
 * A structure to model a given axis in design space for Multiple Masters fonts.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_MM_Axis {
 *     FT_String * name;
 *     FT_Long minimum;
 *     FT_Long maximum;
 * }</code></pre>
 */
public class FT_MM_Axis extends Struct<FT_MM_Axis> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        MINIMUM,
        MAXIMUM;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        MINIMUM = layout.offsetof(1);
        MAXIMUM = layout.offsetof(2);
    }

    protected FT_MM_Axis(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_MM_Axis create(long address, @Nullable ByteBuffer container) {
        return new FT_MM_Axis(address, container);
    }

    /**
     * Creates a {@code FT_MM_Axis} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_MM_Axis(ByteBuffer container) {
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
    @NativeType("FT_Long")
    public long minimum() { return nminimum(address()); }
    /** @return the value of the {@code maximum} field. */
    @NativeType("FT_Long")
    public long maximum() { return nmaximum(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_MM_Axis} instance for the specified memory address. */
    public static FT_MM_Axis create(long address) {
        return new FT_MM_Axis(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_MM_Axis createSafe(long address) {
        return address == NULL ? null : new FT_MM_Axis(address, null);
    }

    /**
     * Create a {@link FT_MM_Axis.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_MM_Axis.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_MM_Axis.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + FT_MM_Axis.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + FT_MM_Axis.NAME)); }
    /** Unsafe version of {@link #minimum}. */
    public static long nminimum(long struct) { return memGetCLong(struct + FT_MM_Axis.MINIMUM); }
    /** Unsafe version of {@link #maximum}. */
    public static long nmaximum(long struct) { return memGetCLong(struct + FT_MM_Axis.MAXIMUM); }

    // -----------------------------------

    /** An array of {@link FT_MM_Axis} structs. */
    public static class Buffer extends StructBuffer<FT_MM_Axis, Buffer> {

        private static final FT_MM_Axis ELEMENT_FACTORY = FT_MM_Axis.create(-1L);

        /**
         * Creates a new {@code FT_MM_Axis.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_MM_Axis#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_MM_Axis getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("FT_String *")
        public ByteBuffer name() { return FT_MM_Axis.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("FT_String *")
        public String nameString() { return FT_MM_Axis.nnameString(address()); }
        /** @return the value of the {@code minimum} field. */
        @NativeType("FT_Long")
        public long minimum() { return FT_MM_Axis.nminimum(address()); }
        /** @return the value of the {@code maximum} field. */
        @NativeType("FT_Long")
        public long maximum() { return FT_MM_Axis.nmaximum(address()); }

    }

}