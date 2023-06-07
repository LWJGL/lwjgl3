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
 * struct FMOD_STUDIO_USER_PROPERTY {
 *     char const * name;
 *     FMOD_STUDIO_USER_PROPERTY_TYPE type;
 *     union {
 *         int intvalue;
 *         FMOD_BOOL boolvalue;
 *         float floatvalue;
 *         char const * stringvalue;
 *     };
 * }</code></pre>
 */
public class FMOD_STUDIO_USER_PROPERTY extends Struct<FMOD_STUDIO_USER_PROPERTY> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        TYPE,
        INTVALUE,
        BOOLVALUE,
        FLOATVALUE,
        STRINGVALUE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __union(
                __member(4),
                __member(4),
                __member(4),
                __member(POINTER_SIZE)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        TYPE = layout.offsetof(1);
        INTVALUE = layout.offsetof(3);
        BOOLVALUE = layout.offsetof(4);
        FLOATVALUE = layout.offsetof(5);
        STRINGVALUE = layout.offsetof(6);
    }

    protected FMOD_STUDIO_USER_PROPERTY(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_STUDIO_USER_PROPERTY create(long address, @Nullable ByteBuffer container) {
        return new FMOD_STUDIO_USER_PROPERTY(address, container);
    }

    /**
     * Creates a {@code FMOD_STUDIO_USER_PROPERTY} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_STUDIO_USER_PROPERTY(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public String nameString() { return nnameString(address()); }
    /** @return the value of the {@code type} field. */
    @NativeType("FMOD_STUDIO_USER_PROPERTY_TYPE")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code intvalue} field. */
    public int intvalue() { return nintvalue(address()); }
    /** @return the value of the {@code boolvalue} field. */
    @NativeType("FMOD_BOOL")
    public int boolvalue() { return nboolvalue(address()); }
    /** @return the value of the {@code floatvalue} field. */
    public float floatvalue() { return nfloatvalue(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code stringvalue} field. */
    @Nullable
    @NativeType("char const *")
    public ByteBuffer stringvalue() { return nstringvalue(address()); }
    /** @return the null-terminated string pointed to by the {@code stringvalue} field. */
    @Nullable
    @NativeType("char const *")
    public String stringvalueString() { return nstringvalueString(address()); }

    /** Sets the address of the specified encoded string to the {@code name} field. */
    public FMOD_STUDIO_USER_PROPERTY name(@NativeType("char const *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public FMOD_STUDIO_USER_PROPERTY type(@NativeType("FMOD_STUDIO_USER_PROPERTY_TYPE") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code intvalue} field. */
    public FMOD_STUDIO_USER_PROPERTY intvalue(int value) { nintvalue(address(), value); return this; }
    /** Sets the specified value to the {@code boolvalue} field. */
    public FMOD_STUDIO_USER_PROPERTY boolvalue(@NativeType("FMOD_BOOL") int value) { nboolvalue(address(), value); return this; }
    /** Sets the specified value to the {@code floatvalue} field. */
    public FMOD_STUDIO_USER_PROPERTY floatvalue(float value) { nfloatvalue(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code stringvalue} field. */
    public FMOD_STUDIO_USER_PROPERTY stringvalue(@Nullable @NativeType("char const *") ByteBuffer value) { nstringvalue(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_STUDIO_USER_PROPERTY set(FMOD_STUDIO_USER_PROPERTY src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_STUDIO_USER_PROPERTY} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_USER_PROPERTY malloc() {
        return new FMOD_STUDIO_USER_PROPERTY(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_USER_PROPERTY} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_USER_PROPERTY calloc() {
        return new FMOD_STUDIO_USER_PROPERTY(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_USER_PROPERTY} instance allocated with {@link BufferUtils}. */
    public static FMOD_STUDIO_USER_PROPERTY create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_STUDIO_USER_PROPERTY(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_STUDIO_USER_PROPERTY} instance for the specified memory address. */
    public static FMOD_STUDIO_USER_PROPERTY create(long address) {
        return new FMOD_STUDIO_USER_PROPERTY(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_USER_PROPERTY createSafe(long address) {
        return address == NULL ? null : new FMOD_STUDIO_USER_PROPERTY(address, null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_USER_PROPERTY.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_USER_PROPERTY.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_USER_PROPERTY.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_USER_PROPERTY.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_USER_PROPERTY.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_USER_PROPERTY.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_STUDIO_USER_PROPERTY.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_USER_PROPERTY.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_USER_PROPERTY.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_USER_PROPERTY} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_USER_PROPERTY malloc(MemoryStack stack) {
        return new FMOD_STUDIO_USER_PROPERTY(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_USER_PROPERTY} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_USER_PROPERTY calloc(MemoryStack stack) {
        return new FMOD_STUDIO_USER_PROPERTY(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_USER_PROPERTY.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_USER_PROPERTY.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_USER_PROPERTY.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_USER_PROPERTY.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + FMOD_STUDIO_USER_PROPERTY.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + FMOD_STUDIO_USER_PROPERTY.NAME)); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_USER_PROPERTY.TYPE); }
    /** Unsafe version of {@link #intvalue}. */
    public static int nintvalue(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_USER_PROPERTY.INTVALUE); }
    /** Unsafe version of {@link #boolvalue}. */
    public static int nboolvalue(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_USER_PROPERTY.BOOLVALUE); }
    /** Unsafe version of {@link #floatvalue}. */
    public static float nfloatvalue(long struct) { return UNSAFE.getFloat(null, struct + FMOD_STUDIO_USER_PROPERTY.FLOATVALUE); }
    /** Unsafe version of {@link #stringvalue}. */
    @Nullable public static ByteBuffer nstringvalue(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + FMOD_STUDIO_USER_PROPERTY.STRINGVALUE)); }
    /** Unsafe version of {@link #stringvalueString}. */
    @Nullable public static String nstringvalueString(long struct) { return memUTF8Safe(memGetAddress(struct + FMOD_STUDIO_USER_PROPERTY.STRINGVALUE)); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + FMOD_STUDIO_USER_PROPERTY.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_USER_PROPERTY.TYPE, value); }
    /** Unsafe version of {@link #intvalue(int) intvalue}. */
    public static void nintvalue(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_USER_PROPERTY.INTVALUE, value); }
    /** Unsafe version of {@link #boolvalue(int) boolvalue}. */
    public static void nboolvalue(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_USER_PROPERTY.BOOLVALUE, value); }
    /** Unsafe version of {@link #floatvalue(float) floatvalue}. */
    public static void nfloatvalue(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_STUDIO_USER_PROPERTY.FLOATVALUE, value); }
    /** Unsafe version of {@link #stringvalue(ByteBuffer) stringvalue}. */
    public static void nstringvalue(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + FMOD_STUDIO_USER_PROPERTY.STRINGVALUE, memAddressSafe(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_STUDIO_USER_PROPERTY.NAME));
    }

    // -----------------------------------

    /** An array of {@link FMOD_STUDIO_USER_PROPERTY} structs. */
    public static class Buffer extends StructBuffer<FMOD_STUDIO_USER_PROPERTY, Buffer> implements NativeResource {

        private static final FMOD_STUDIO_USER_PROPERTY ELEMENT_FACTORY = FMOD_STUDIO_USER_PROPERTY.create(-1L);

        /**
         * Creates a new {@code FMOD_STUDIO_USER_PROPERTY.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_STUDIO_USER_PROPERTY#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_STUDIO_USER_PROPERTY getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public ByteBuffer name() { return FMOD_STUDIO_USER_PROPERTY.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public String nameString() { return FMOD_STUDIO_USER_PROPERTY.nnameString(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("FMOD_STUDIO_USER_PROPERTY_TYPE")
        public int type() { return FMOD_STUDIO_USER_PROPERTY.ntype(address()); }
        /** @return the value of the {@code intvalue} field. */
        public int intvalue() { return FMOD_STUDIO_USER_PROPERTY.nintvalue(address()); }
        /** @return the value of the {@code boolvalue} field. */
        @NativeType("FMOD_BOOL")
        public int boolvalue() { return FMOD_STUDIO_USER_PROPERTY.nboolvalue(address()); }
        /** @return the value of the {@code floatvalue} field. */
        public float floatvalue() { return FMOD_STUDIO_USER_PROPERTY.nfloatvalue(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code stringvalue} field. */
        @Nullable
        @NativeType("char const *")
        public ByteBuffer stringvalue() { return FMOD_STUDIO_USER_PROPERTY.nstringvalue(address()); }
        /** @return the null-terminated string pointed to by the {@code stringvalue} field. */
        @Nullable
        @NativeType("char const *")
        public String stringvalueString() { return FMOD_STUDIO_USER_PROPERTY.nstringvalueString(address()); }

        /** Sets the address of the specified encoded string to the {@code name} field. */
        public FMOD_STUDIO_USER_PROPERTY.Buffer name(@NativeType("char const *") ByteBuffer value) { FMOD_STUDIO_USER_PROPERTY.nname(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public FMOD_STUDIO_USER_PROPERTY.Buffer type(@NativeType("FMOD_STUDIO_USER_PROPERTY_TYPE") int value) { FMOD_STUDIO_USER_PROPERTY.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code intvalue} field. */
        public FMOD_STUDIO_USER_PROPERTY.Buffer intvalue(int value) { FMOD_STUDIO_USER_PROPERTY.nintvalue(address(), value); return this; }
        /** Sets the specified value to the {@code boolvalue} field. */
        public FMOD_STUDIO_USER_PROPERTY.Buffer boolvalue(@NativeType("FMOD_BOOL") int value) { FMOD_STUDIO_USER_PROPERTY.nboolvalue(address(), value); return this; }
        /** Sets the specified value to the {@code floatvalue} field. */
        public FMOD_STUDIO_USER_PROPERTY.Buffer floatvalue(float value) { FMOD_STUDIO_USER_PROPERTY.nfloatvalue(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code stringvalue} field. */
        public FMOD_STUDIO_USER_PROPERTY.Buffer stringvalue(@Nullable @NativeType("char const *") ByteBuffer value) { FMOD_STUDIO_USER_PROPERTY.nstringvalue(address(), value); return this; }

    }

}