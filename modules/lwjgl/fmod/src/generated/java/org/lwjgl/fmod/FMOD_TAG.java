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
 * struct FMOD_TAG {
 *     FMOD_TAGTYPE type;
 *     FMOD_TAGDATATYPE datatype;
 *     char * name;
 *     void * data;
 *     unsigned int datalen;
 *     FMOD_BOOL updated;
 * }</code></pre>
 */
public class FMOD_TAG extends Struct<FMOD_TAG> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        DATATYPE,
        NAME,
        DATA,
        DATALEN,
        UPDATED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        DATATYPE = layout.offsetof(1);
        NAME = layout.offsetof(2);
        DATA = layout.offsetof(3);
        DATALEN = layout.offsetof(4);
        UPDATED = layout.offsetof(5);
    }

    protected FMOD_TAG(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_TAG create(long address, @Nullable ByteBuffer container) {
        return new FMOD_TAG(address, container);
    }

    /**
     * Creates a {@code FMOD_TAG} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_TAG(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("FMOD_TAGTYPE")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code datatype} field. */
    @NativeType("FMOD_TAGDATATYPE")
    public int datatype() { return ndatatype(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char *")
    public String nameString() { return nnameString(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
    @NativeType("void *")
    public ByteBuffer data() { return ndata(address()); }
    /** @return the value of the {@code datalen} field. */
    @NativeType("unsigned int")
    public int datalen() { return ndatalen(address()); }
    /** @return the value of the {@code updated} field. */
    @NativeType("FMOD_BOOL")
    public int updated() { return nupdated(address()); }

    /** Sets the specified value to the {@code type} field. */
    public FMOD_TAG type(@NativeType("FMOD_TAGTYPE") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code datatype} field. */
    public FMOD_TAG datatype(@NativeType("FMOD_TAGDATATYPE") int value) { ndatatype(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code name} field. */
    public FMOD_TAG name(@NativeType("char *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
    public FMOD_TAG data(@NativeType("void *") ByteBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value to the {@code updated} field. */
    public FMOD_TAG updated(@NativeType("FMOD_BOOL") int value) { nupdated(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_TAG set(
        int type,
        int datatype,
        ByteBuffer name,
        ByteBuffer data,
        int updated
    ) {
        type(type);
        datatype(datatype);
        name(name);
        data(data);
        updated(updated);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_TAG set(FMOD_TAG src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_TAG} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_TAG malloc() {
        return new FMOD_TAG(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_TAG} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_TAG calloc() {
        return new FMOD_TAG(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_TAG} instance allocated with {@link BufferUtils}. */
    public static FMOD_TAG create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_TAG(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_TAG} instance for the specified memory address. */
    public static FMOD_TAG create(long address) {
        return new FMOD_TAG(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_TAG createSafe(long address) {
        return address == NULL ? null : new FMOD_TAG(address, null);
    }

    /**
     * Returns a new {@link FMOD_TAG.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_TAG.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_TAG.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_TAG.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_TAG.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_TAG.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_TAG.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_TAG.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_TAG.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_TAG} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_TAG malloc(MemoryStack stack) {
        return new FMOD_TAG(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_TAG} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_TAG calloc(MemoryStack stack) {
        return new FMOD_TAG(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_TAG.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_TAG.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_TAG.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_TAG.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + FMOD_TAG.TYPE); }
    /** Unsafe version of {@link #datatype}. */
    public static int ndatatype(long struct) { return UNSAFE.getInt(null, struct + FMOD_TAG.DATATYPE); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + FMOD_TAG.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + FMOD_TAG.NAME)); }
    /** Unsafe version of {@link #data() data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(memGetAddress(struct + FMOD_TAG.DATA), ndatalen(struct)); }
    /** Unsafe version of {@link #datalen}. */
    public static int ndatalen(long struct) { return UNSAFE.getInt(null, struct + FMOD_TAG.DATALEN); }
    /** Unsafe version of {@link #updated}. */
    public static int nupdated(long struct) { return UNSAFE.getInt(null, struct + FMOD_TAG.UPDATED); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_TAG.TYPE, value); }
    /** Unsafe version of {@link #datatype(int) datatype}. */
    public static void ndatatype(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_TAG.DATATYPE, value); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + FMOD_TAG.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) { memPutAddress(struct + FMOD_TAG.DATA, memAddress(value)); ndatalen(struct, value.remaining()); }
    /** Sets the specified value to the {@code datalen} field of the specified {@code struct}. */
    public static void ndatalen(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_TAG.DATALEN, value); }
    /** Unsafe version of {@link #updated(int) updated}. */
    public static void nupdated(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_TAG.UPDATED, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_TAG.NAME));
        check(memGetAddress(struct + FMOD_TAG.DATA));
    }

    // -----------------------------------

    /** An array of {@link FMOD_TAG} structs. */
    public static class Buffer extends StructBuffer<FMOD_TAG, Buffer> implements NativeResource {

        private static final FMOD_TAG ELEMENT_FACTORY = FMOD_TAG.create(-1L);

        /**
         * Creates a new {@code FMOD_TAG.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_TAG#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_TAG getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("FMOD_TAGTYPE")
        public int type() { return FMOD_TAG.ntype(address()); }
        /** @return the value of the {@code datatype} field. */
        @NativeType("FMOD_TAGDATATYPE")
        public int datatype() { return FMOD_TAG.ndatatype(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char *")
        public ByteBuffer name() { return FMOD_TAG.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char *")
        public String nameString() { return FMOD_TAG.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
        @NativeType("void *")
        public ByteBuffer data() { return FMOD_TAG.ndata(address()); }
        /** @return the value of the {@code datalen} field. */
        @NativeType("unsigned int")
        public int datalen() { return FMOD_TAG.ndatalen(address()); }
        /** @return the value of the {@code updated} field. */
        @NativeType("FMOD_BOOL")
        public int updated() { return FMOD_TAG.nupdated(address()); }

        /** Sets the specified value to the {@code type} field. */
        public FMOD_TAG.Buffer type(@NativeType("FMOD_TAGTYPE") int value) { FMOD_TAG.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code datatype} field. */
        public FMOD_TAG.Buffer datatype(@NativeType("FMOD_TAGDATATYPE") int value) { FMOD_TAG.ndatatype(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code name} field. */
        public FMOD_TAG.Buffer name(@NativeType("char *") ByteBuffer value) { FMOD_TAG.nname(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
        public FMOD_TAG.Buffer data(@NativeType("void *") ByteBuffer value) { FMOD_TAG.ndata(address(), value); return this; }
        /** Sets the specified value to the {@code updated} field. */
        public FMOD_TAG.Buffer updated(@NativeType("FMOD_BOOL") int value) { FMOD_TAG.nupdated(address(), value); return this; }

    }

}