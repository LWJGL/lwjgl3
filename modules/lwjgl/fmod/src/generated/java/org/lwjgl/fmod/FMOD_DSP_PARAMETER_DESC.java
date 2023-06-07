/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FMOD_DSP_PARAMETER_DESC {
 *     FMOD_DSP_PARAMETER_TYPE type;
 *     char name[16];
 *     char label[16];
 *     char const * description;
 *     union {
 *         {@link FMOD_DSP_PARAMETER_DESC_FLOAT FMOD_DSP_PARAMETER_DESC_FLOAT} floatdesc;
 *         {@link FMOD_DSP_PARAMETER_DESC_INT FMOD_DSP_PARAMETER_DESC_INT} intdesc;
 *         {@link FMOD_DSP_PARAMETER_DESC_BOOL FMOD_DSP_PARAMETER_DESC_BOOL} booldesc;
 *         {@link FMOD_DSP_PARAMETER_DESC_DATA FMOD_DSP_PARAMETER_DESC_DATA} datadesc;
 *     };
 * }</code></pre>
 */
public class FMOD_DSP_PARAMETER_DESC extends Struct<FMOD_DSP_PARAMETER_DESC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NAME,
        LABEL,
        DESCRIPTION,
        FLOATDESC,
        INTDESC,
        BOOLDESC,
        DATADESC;

    static {
        Layout layout = __struct(
            __member(4),
            __array(1, 16),
            __array(1, 16),
            __member(POINTER_SIZE),
            __union(
                __member(FMOD_DSP_PARAMETER_DESC_FLOAT.SIZEOF, FMOD_DSP_PARAMETER_DESC_FLOAT.ALIGNOF),
                __member(FMOD_DSP_PARAMETER_DESC_INT.SIZEOF, FMOD_DSP_PARAMETER_DESC_INT.ALIGNOF),
                __member(FMOD_DSP_PARAMETER_DESC_BOOL.SIZEOF, FMOD_DSP_PARAMETER_DESC_BOOL.ALIGNOF),
                __member(FMOD_DSP_PARAMETER_DESC_DATA.SIZEOF, FMOD_DSP_PARAMETER_DESC_DATA.ALIGNOF)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NAME = layout.offsetof(1);
        LABEL = layout.offsetof(2);
        DESCRIPTION = layout.offsetof(3);
        FLOATDESC = layout.offsetof(5);
        INTDESC = layout.offsetof(6);
        BOOLDESC = layout.offsetof(7);
        DATADESC = layout.offsetof(8);
    }

    protected FMOD_DSP_PARAMETER_DESC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_PARAMETER_DESC create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_PARAMETER_DESC(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_PARAMETER_DESC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_PARAMETER_DESC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("FMOD_DSP_PARAMETER_TYPE")
    public int type() { return ntype(address()); }
    /** @return a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[16]")
    public ByteBuffer name() { return nname(address()); }
    /** @return the value at the specified index of the {@code name} field. */
    @NativeType("char")
    public byte name(int index) { return nname(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code label} field. */
    @NativeType("char[16]")
    public ByteBuffer label() { return nlabel(address()); }
    /** @return the value at the specified index of the {@code label} field. */
    @NativeType("char")
    public byte label(int index) { return nlabel(address(), index); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code description} field. */
    @NativeType("char const *")
    public ByteBuffer description() { return ndescription(address()); }
    /** @return the null-terminated string pointed to by the {@code description} field. */
    @NativeType("char const *")
    public String descriptionString() { return ndescriptionString(address()); }
    /** @return a {@link FMOD_DSP_PARAMETER_DESC_FLOAT} view of the {@code floatdesc} field. */
    public FMOD_DSP_PARAMETER_DESC_FLOAT floatdesc() { return nfloatdesc(address()); }
    /** @return a {@link FMOD_DSP_PARAMETER_DESC_INT} view of the {@code intdesc} field. */
    public FMOD_DSP_PARAMETER_DESC_INT intdesc() { return nintdesc(address()); }
    /** @return a {@link FMOD_DSP_PARAMETER_DESC_BOOL} view of the {@code booldesc} field. */
    public FMOD_DSP_PARAMETER_DESC_BOOL booldesc() { return nbooldesc(address()); }
    /** @return a {@link FMOD_DSP_PARAMETER_DESC_DATA} view of the {@code datadesc} field. */
    public FMOD_DSP_PARAMETER_DESC_DATA datadesc() { return ndatadesc(address()); }

    /** Sets the specified value to the {@code type} field. */
    public FMOD_DSP_PARAMETER_DESC type(@NativeType("FMOD_DSP_PARAMETER_TYPE") int value) { ntype(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code name} field. */
    public FMOD_DSP_PARAMETER_DESC name(@NativeType("char[16]") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code name} field. */
    public FMOD_DSP_PARAMETER_DESC name(int index, @NativeType("char") byte value) { nname(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code label} field. */
    public FMOD_DSP_PARAMETER_DESC label(@NativeType("char[16]") ByteBuffer value) { nlabel(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code label} field. */
    public FMOD_DSP_PARAMETER_DESC label(int index, @NativeType("char") byte value) { nlabel(address(), index, value); return this; }
    /** Sets the address of the specified encoded string to the {@code description} field. */
    public FMOD_DSP_PARAMETER_DESC description(@NativeType("char const *") ByteBuffer value) { ndescription(address(), value); return this; }
    /** Copies the specified {@link FMOD_DSP_PARAMETER_DESC_FLOAT} to the {@code floatdesc} field. */
    public FMOD_DSP_PARAMETER_DESC floatdesc(FMOD_DSP_PARAMETER_DESC_FLOAT value) { nfloatdesc(address(), value); return this; }
    /** Passes the {@code floatdesc} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_DSP_PARAMETER_DESC floatdesc(java.util.function.Consumer<FMOD_DSP_PARAMETER_DESC_FLOAT> consumer) { consumer.accept(floatdesc()); return this; }
    /** Copies the specified {@link FMOD_DSP_PARAMETER_DESC_INT} to the {@code intdesc} field. */
    public FMOD_DSP_PARAMETER_DESC intdesc(FMOD_DSP_PARAMETER_DESC_INT value) { nintdesc(address(), value); return this; }
    /** Passes the {@code intdesc} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_DSP_PARAMETER_DESC intdesc(java.util.function.Consumer<FMOD_DSP_PARAMETER_DESC_INT> consumer) { consumer.accept(intdesc()); return this; }
    /** Copies the specified {@link FMOD_DSP_PARAMETER_DESC_BOOL} to the {@code booldesc} field. */
    public FMOD_DSP_PARAMETER_DESC booldesc(FMOD_DSP_PARAMETER_DESC_BOOL value) { nbooldesc(address(), value); return this; }
    /** Passes the {@code booldesc} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_DSP_PARAMETER_DESC booldesc(java.util.function.Consumer<FMOD_DSP_PARAMETER_DESC_BOOL> consumer) { consumer.accept(booldesc()); return this; }
    /** Copies the specified {@link FMOD_DSP_PARAMETER_DESC_DATA} to the {@code datadesc} field. */
    public FMOD_DSP_PARAMETER_DESC datadesc(FMOD_DSP_PARAMETER_DESC_DATA value) { ndatadesc(address(), value); return this; }
    /** Passes the {@code datadesc} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_DSP_PARAMETER_DESC datadesc(java.util.function.Consumer<FMOD_DSP_PARAMETER_DESC_DATA> consumer) { consumer.accept(datadesc()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_PARAMETER_DESC set(FMOD_DSP_PARAMETER_DESC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_DESC malloc() {
        return new FMOD_DSP_PARAMETER_DESC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_DESC calloc() {
        return new FMOD_DSP_PARAMETER_DESC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_PARAMETER_DESC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_PARAMETER_DESC(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC} instance for the specified memory address. */
    public static FMOD_DSP_PARAMETER_DESC create(long address) {
        return new FMOD_DSP_PARAMETER_DESC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_DESC createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_PARAMETER_DESC(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_PARAMETER_DESC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_DESC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_DESC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_DESC malloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_DESC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_DESC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_DESC calloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_DESC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_PARAMETER_DESC.TYPE); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + FMOD_DSP_PARAMETER_DESC.NAME, 16); }
    /** Unsafe version of {@link #name(int) name}. */
    public static byte nname(long struct, int index) {
        return UNSAFE.getByte(null, struct + FMOD_DSP_PARAMETER_DESC.NAME + check(index, 16) * 1);
    }
    /** Unsafe version of {@link #label}. */
    public static ByteBuffer nlabel(long struct) { return memByteBuffer(struct + FMOD_DSP_PARAMETER_DESC.LABEL, 16); }
    /** Unsafe version of {@link #label(int) label}. */
    public static byte nlabel(long struct, int index) {
        return UNSAFE.getByte(null, struct + FMOD_DSP_PARAMETER_DESC.LABEL + check(index, 16) * 1);
    }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBufferNT1(memGetAddress(struct + FMOD_DSP_PARAMETER_DESC.DESCRIPTION)); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(memGetAddress(struct + FMOD_DSP_PARAMETER_DESC.DESCRIPTION)); }
    /** Unsafe version of {@link #floatdesc}. */
    public static FMOD_DSP_PARAMETER_DESC_FLOAT nfloatdesc(long struct) { return FMOD_DSP_PARAMETER_DESC_FLOAT.create(struct + FMOD_DSP_PARAMETER_DESC.FLOATDESC); }
    /** Unsafe version of {@link #intdesc}. */
    public static FMOD_DSP_PARAMETER_DESC_INT nintdesc(long struct) { return FMOD_DSP_PARAMETER_DESC_INT.create(struct + FMOD_DSP_PARAMETER_DESC.INTDESC); }
    /** Unsafe version of {@link #booldesc}. */
    public static FMOD_DSP_PARAMETER_DESC_BOOL nbooldesc(long struct) { return FMOD_DSP_PARAMETER_DESC_BOOL.create(struct + FMOD_DSP_PARAMETER_DESC.BOOLDESC); }
    /** Unsafe version of {@link #datadesc}. */
    public static FMOD_DSP_PARAMETER_DESC_DATA ndatadesc(long struct) { return FMOD_DSP_PARAMETER_DESC_DATA.create(struct + FMOD_DSP_PARAMETER_DESC.DATADESC); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_PARAMETER_DESC.TYPE, value); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 16); }
        memCopy(memAddress(value), struct + FMOD_DSP_PARAMETER_DESC.NAME, value.remaining() * 1);
    }
    /** Unsafe version of {@link #name(int, byte) name}. */
    public static void nname(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + FMOD_DSP_PARAMETER_DESC.NAME + check(index, 16) * 1, value);
    }
    /** Unsafe version of {@link #label(ByteBuffer) label}. */
    public static void nlabel(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 16); }
        memCopy(memAddress(value), struct + FMOD_DSP_PARAMETER_DESC.LABEL, value.remaining() * 1);
    }
    /** Unsafe version of {@link #label(int, byte) label}. */
    public static void nlabel(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + FMOD_DSP_PARAMETER_DESC.LABEL + check(index, 16) * 1, value);
    }
    /** Unsafe version of {@link #description(ByteBuffer) description}. */
    public static void ndescription(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + FMOD_DSP_PARAMETER_DESC.DESCRIPTION, memAddress(value));
    }
    /** Unsafe version of {@link #floatdesc(FMOD_DSP_PARAMETER_DESC_FLOAT) floatdesc}. */
    public static void nfloatdesc(long struct, FMOD_DSP_PARAMETER_DESC_FLOAT value) { memCopy(value.address(), struct + FMOD_DSP_PARAMETER_DESC.FLOATDESC, FMOD_DSP_PARAMETER_DESC_FLOAT.SIZEOF); }
    /** Unsafe version of {@link #intdesc(FMOD_DSP_PARAMETER_DESC_INT) intdesc}. */
    public static void nintdesc(long struct, FMOD_DSP_PARAMETER_DESC_INT value) { memCopy(value.address(), struct + FMOD_DSP_PARAMETER_DESC.INTDESC, FMOD_DSP_PARAMETER_DESC_INT.SIZEOF); }
    /** Unsafe version of {@link #booldesc(FMOD_DSP_PARAMETER_DESC_BOOL) booldesc}. */
    public static void nbooldesc(long struct, FMOD_DSP_PARAMETER_DESC_BOOL value) { memCopy(value.address(), struct + FMOD_DSP_PARAMETER_DESC.BOOLDESC, FMOD_DSP_PARAMETER_DESC_BOOL.SIZEOF); }
    /** Unsafe version of {@link #datadesc(FMOD_DSP_PARAMETER_DESC_DATA) datadesc}. */
    public static void ndatadesc(long struct, FMOD_DSP_PARAMETER_DESC_DATA value) { memCopy(value.address(), struct + FMOD_DSP_PARAMETER_DESC.DATADESC, FMOD_DSP_PARAMETER_DESC_DATA.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_DSP_PARAMETER_DESC.DESCRIPTION));
    }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_PARAMETER_DESC} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_PARAMETER_DESC, Buffer> implements NativeResource {

        private static final FMOD_DSP_PARAMETER_DESC ELEMENT_FACTORY = FMOD_DSP_PARAMETER_DESC.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_PARAMETER_DESC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_PARAMETER_DESC#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_PARAMETER_DESC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("FMOD_DSP_PARAMETER_TYPE")
        public int type() { return FMOD_DSP_PARAMETER_DESC.ntype(address()); }
        /** @return a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[16]")
        public ByteBuffer name() { return FMOD_DSP_PARAMETER_DESC.nname(address()); }
        /** @return the value at the specified index of the {@code name} field. */
        @NativeType("char")
        public byte name(int index) { return FMOD_DSP_PARAMETER_DESC.nname(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code label} field. */
        @NativeType("char[16]")
        public ByteBuffer label() { return FMOD_DSP_PARAMETER_DESC.nlabel(address()); }
        /** @return the value at the specified index of the {@code label} field. */
        @NativeType("char")
        public byte label(int index) { return FMOD_DSP_PARAMETER_DESC.nlabel(address(), index); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code description} field. */
        @NativeType("char const *")
        public ByteBuffer description() { return FMOD_DSP_PARAMETER_DESC.ndescription(address()); }
        /** @return the null-terminated string pointed to by the {@code description} field. */
        @NativeType("char const *")
        public String descriptionString() { return FMOD_DSP_PARAMETER_DESC.ndescriptionString(address()); }
        /** @return a {@link FMOD_DSP_PARAMETER_DESC_FLOAT} view of the {@code floatdesc} field. */
        public FMOD_DSP_PARAMETER_DESC_FLOAT floatdesc() { return FMOD_DSP_PARAMETER_DESC.nfloatdesc(address()); }
        /** @return a {@link FMOD_DSP_PARAMETER_DESC_INT} view of the {@code intdesc} field. */
        public FMOD_DSP_PARAMETER_DESC_INT intdesc() { return FMOD_DSP_PARAMETER_DESC.nintdesc(address()); }
        /** @return a {@link FMOD_DSP_PARAMETER_DESC_BOOL} view of the {@code booldesc} field. */
        public FMOD_DSP_PARAMETER_DESC_BOOL booldesc() { return FMOD_DSP_PARAMETER_DESC.nbooldesc(address()); }
        /** @return a {@link FMOD_DSP_PARAMETER_DESC_DATA} view of the {@code datadesc} field. */
        public FMOD_DSP_PARAMETER_DESC_DATA datadesc() { return FMOD_DSP_PARAMETER_DESC.ndatadesc(address()); }

        /** Sets the specified value to the {@code type} field. */
        public FMOD_DSP_PARAMETER_DESC.Buffer type(@NativeType("FMOD_DSP_PARAMETER_TYPE") int value) { FMOD_DSP_PARAMETER_DESC.ntype(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code name} field. */
        public FMOD_DSP_PARAMETER_DESC.Buffer name(@NativeType("char[16]") ByteBuffer value) { FMOD_DSP_PARAMETER_DESC.nname(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code name} field. */
        public FMOD_DSP_PARAMETER_DESC.Buffer name(int index, @NativeType("char") byte value) { FMOD_DSP_PARAMETER_DESC.nname(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code label} field. */
        public FMOD_DSP_PARAMETER_DESC.Buffer label(@NativeType("char[16]") ByteBuffer value) { FMOD_DSP_PARAMETER_DESC.nlabel(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code label} field. */
        public FMOD_DSP_PARAMETER_DESC.Buffer label(int index, @NativeType("char") byte value) { FMOD_DSP_PARAMETER_DESC.nlabel(address(), index, value); return this; }
        /** Sets the address of the specified encoded string to the {@code description} field. */
        public FMOD_DSP_PARAMETER_DESC.Buffer description(@NativeType("char const *") ByteBuffer value) { FMOD_DSP_PARAMETER_DESC.ndescription(address(), value); return this; }
        /** Copies the specified {@link FMOD_DSP_PARAMETER_DESC_FLOAT} to the {@code floatdesc} field. */
        public FMOD_DSP_PARAMETER_DESC.Buffer floatdesc(FMOD_DSP_PARAMETER_DESC_FLOAT value) { FMOD_DSP_PARAMETER_DESC.nfloatdesc(address(), value); return this; }
        /** Passes the {@code floatdesc} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_DSP_PARAMETER_DESC.Buffer floatdesc(java.util.function.Consumer<FMOD_DSP_PARAMETER_DESC_FLOAT> consumer) { consumer.accept(floatdesc()); return this; }
        /** Copies the specified {@link FMOD_DSP_PARAMETER_DESC_INT} to the {@code intdesc} field. */
        public FMOD_DSP_PARAMETER_DESC.Buffer intdesc(FMOD_DSP_PARAMETER_DESC_INT value) { FMOD_DSP_PARAMETER_DESC.nintdesc(address(), value); return this; }
        /** Passes the {@code intdesc} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_DSP_PARAMETER_DESC.Buffer intdesc(java.util.function.Consumer<FMOD_DSP_PARAMETER_DESC_INT> consumer) { consumer.accept(intdesc()); return this; }
        /** Copies the specified {@link FMOD_DSP_PARAMETER_DESC_BOOL} to the {@code booldesc} field. */
        public FMOD_DSP_PARAMETER_DESC.Buffer booldesc(FMOD_DSP_PARAMETER_DESC_BOOL value) { FMOD_DSP_PARAMETER_DESC.nbooldesc(address(), value); return this; }
        /** Passes the {@code booldesc} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_DSP_PARAMETER_DESC.Buffer booldesc(java.util.function.Consumer<FMOD_DSP_PARAMETER_DESC_BOOL> consumer) { consumer.accept(booldesc()); return this; }
        /** Copies the specified {@link FMOD_DSP_PARAMETER_DESC_DATA} to the {@code datadesc} field. */
        public FMOD_DSP_PARAMETER_DESC.Buffer datadesc(FMOD_DSP_PARAMETER_DESC_DATA value) { FMOD_DSP_PARAMETER_DESC.ndatadesc(address(), value); return this; }
        /** Passes the {@code datadesc} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_DSP_PARAMETER_DESC.Buffer datadesc(java.util.function.Consumer<FMOD_DSP_PARAMETER_DESC_DATA> consumer) { consumer.accept(datadesc()); return this; }

    }

}