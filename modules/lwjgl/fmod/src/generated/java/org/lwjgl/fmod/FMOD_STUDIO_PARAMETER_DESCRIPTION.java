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
 * struct FMOD_STUDIO_PARAMETER_DESCRIPTION {
 *     char const * name;
 *     {@link FMOD_STUDIO_PARAMETER_ID FMOD_STUDIO_PARAMETER_ID} id;
 *     float minimum;
 *     float maximum;
 *     float defaultvalue;
 *     FMOD_STUDIO_PARAMETER_TYPE type;
 *     FMOD_STUDIO_PARAMETER_FLAGS flags;
 *     {@link FMOD_GUID FMOD_GUID} guid;
 * }</code></pre>
 */
public class FMOD_STUDIO_PARAMETER_DESCRIPTION extends Struct<FMOD_STUDIO_PARAMETER_DESCRIPTION> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        ID,
        MINIMUM,
        MAXIMUM,
        DEFAULTVALUE,
        TYPE,
        FLAGS,
        GUID;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(FMOD_STUDIO_PARAMETER_ID.SIZEOF, FMOD_STUDIO_PARAMETER_ID.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(FMOD_GUID.SIZEOF, FMOD_GUID.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        ID = layout.offsetof(1);
        MINIMUM = layout.offsetof(2);
        MAXIMUM = layout.offsetof(3);
        DEFAULTVALUE = layout.offsetof(4);
        TYPE = layout.offsetof(5);
        FLAGS = layout.offsetof(6);
        GUID = layout.offsetof(7);
    }

    protected FMOD_STUDIO_PARAMETER_DESCRIPTION(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_STUDIO_PARAMETER_DESCRIPTION create(long address, @Nullable ByteBuffer container) {
        return new FMOD_STUDIO_PARAMETER_DESCRIPTION(address, container);
    }

    /**
     * Creates a {@code FMOD_STUDIO_PARAMETER_DESCRIPTION} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_STUDIO_PARAMETER_DESCRIPTION(ByteBuffer container) {
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
    /** @return a {@link FMOD_STUDIO_PARAMETER_ID} view of the {@code id} field. */
    public FMOD_STUDIO_PARAMETER_ID id() { return nid(address()); }
    /** @return the value of the {@code minimum} field. */
    public float minimum() { return nminimum(address()); }
    /** @return the value of the {@code maximum} field. */
    public float maximum() { return nmaximum(address()); }
    /** @return the value of the {@code defaultvalue} field. */
    public float defaultvalue() { return ndefaultvalue(address()); }
    /** @return the value of the {@code type} field. */
    @NativeType("FMOD_STUDIO_PARAMETER_TYPE")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("FMOD_STUDIO_PARAMETER_FLAGS")
    public int flags() { return nflags(address()); }
    /** @return a {@link FMOD_GUID} view of the {@code guid} field. */
    public FMOD_GUID guid() { return nguid(address()); }

    /** Sets the address of the specified encoded string to the {@code name} field. */
    public FMOD_STUDIO_PARAMETER_DESCRIPTION name(@NativeType("char const *") ByteBuffer value) { nname(address(), value); return this; }
    /** Copies the specified {@link FMOD_STUDIO_PARAMETER_ID} to the {@code id} field. */
    public FMOD_STUDIO_PARAMETER_DESCRIPTION id(FMOD_STUDIO_PARAMETER_ID value) { nid(address(), value); return this; }
    /** Passes the {@code id} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_STUDIO_PARAMETER_DESCRIPTION id(java.util.function.Consumer<FMOD_STUDIO_PARAMETER_ID> consumer) { consumer.accept(id()); return this; }
    /** Sets the specified value to the {@code minimum} field. */
    public FMOD_STUDIO_PARAMETER_DESCRIPTION minimum(float value) { nminimum(address(), value); return this; }
    /** Sets the specified value to the {@code maximum} field. */
    public FMOD_STUDIO_PARAMETER_DESCRIPTION maximum(float value) { nmaximum(address(), value); return this; }
    /** Sets the specified value to the {@code defaultvalue} field. */
    public FMOD_STUDIO_PARAMETER_DESCRIPTION defaultvalue(float value) { ndefaultvalue(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public FMOD_STUDIO_PARAMETER_DESCRIPTION type(@NativeType("FMOD_STUDIO_PARAMETER_TYPE") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public FMOD_STUDIO_PARAMETER_DESCRIPTION flags(@NativeType("FMOD_STUDIO_PARAMETER_FLAGS") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link FMOD_GUID} to the {@code guid} field. */
    public FMOD_STUDIO_PARAMETER_DESCRIPTION guid(FMOD_GUID value) { nguid(address(), value); return this; }
    /** Passes the {@code guid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_STUDIO_PARAMETER_DESCRIPTION guid(java.util.function.Consumer<FMOD_GUID> consumer) { consumer.accept(guid()); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_STUDIO_PARAMETER_DESCRIPTION set(
        ByteBuffer name,
        FMOD_STUDIO_PARAMETER_ID id,
        float minimum,
        float maximum,
        float defaultvalue,
        int type,
        int flags,
        FMOD_GUID guid
    ) {
        name(name);
        id(id);
        minimum(minimum);
        maximum(maximum);
        defaultvalue(defaultvalue);
        type(type);
        flags(flags);
        guid(guid);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_STUDIO_PARAMETER_DESCRIPTION set(FMOD_STUDIO_PARAMETER_DESCRIPTION src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_STUDIO_PARAMETER_DESCRIPTION} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_PARAMETER_DESCRIPTION malloc() {
        return new FMOD_STUDIO_PARAMETER_DESCRIPTION(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_PARAMETER_DESCRIPTION} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_PARAMETER_DESCRIPTION calloc() {
        return new FMOD_STUDIO_PARAMETER_DESCRIPTION(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_PARAMETER_DESCRIPTION} instance allocated with {@link BufferUtils}. */
    public static FMOD_STUDIO_PARAMETER_DESCRIPTION create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_STUDIO_PARAMETER_DESCRIPTION(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_STUDIO_PARAMETER_DESCRIPTION} instance for the specified memory address. */
    public static FMOD_STUDIO_PARAMETER_DESCRIPTION create(long address) {
        return new FMOD_STUDIO_PARAMETER_DESCRIPTION(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_PARAMETER_DESCRIPTION createSafe(long address) {
        return address == NULL ? null : new FMOD_STUDIO_PARAMETER_DESCRIPTION(address, null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_PARAMETER_DESCRIPTION} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_PARAMETER_DESCRIPTION malloc(MemoryStack stack) {
        return new FMOD_STUDIO_PARAMETER_DESCRIPTION(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_PARAMETER_DESCRIPTION} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_PARAMETER_DESCRIPTION calloc(MemoryStack stack) {
        return new FMOD_STUDIO_PARAMETER_DESCRIPTION(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.NAME)); }
    /** Unsafe version of {@link #id}. */
    public static FMOD_STUDIO_PARAMETER_ID nid(long struct) { return FMOD_STUDIO_PARAMETER_ID.create(struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.ID); }
    /** Unsafe version of {@link #minimum}. */
    public static float nminimum(long struct) { return UNSAFE.getFloat(null, struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.MINIMUM); }
    /** Unsafe version of {@link #maximum}. */
    public static float nmaximum(long struct) { return UNSAFE.getFloat(null, struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.MAXIMUM); }
    /** Unsafe version of {@link #defaultvalue}. */
    public static float ndefaultvalue(long struct) { return UNSAFE.getFloat(null, struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.DEFAULTVALUE); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.TYPE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.FLAGS); }
    /** Unsafe version of {@link #guid}. */
    public static FMOD_GUID nguid(long struct) { return FMOD_GUID.create(struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.GUID); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #id(FMOD_STUDIO_PARAMETER_ID) id}. */
    public static void nid(long struct, FMOD_STUDIO_PARAMETER_ID value) { memCopy(value.address(), struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.ID, FMOD_STUDIO_PARAMETER_ID.SIZEOF); }
    /** Unsafe version of {@link #minimum(float) minimum}. */
    public static void nminimum(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.MINIMUM, value); }
    /** Unsafe version of {@link #maximum(float) maximum}. */
    public static void nmaximum(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.MAXIMUM, value); }
    /** Unsafe version of {@link #defaultvalue(float) defaultvalue}. */
    public static void ndefaultvalue(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.DEFAULTVALUE, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.TYPE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.FLAGS, value); }
    /** Unsafe version of {@link #guid(FMOD_GUID) guid}. */
    public static void nguid(long struct, FMOD_GUID value) { memCopy(value.address(), struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.GUID, FMOD_GUID.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_STUDIO_PARAMETER_DESCRIPTION.NAME));
    }

    // -----------------------------------

    /** An array of {@link FMOD_STUDIO_PARAMETER_DESCRIPTION} structs. */
    public static class Buffer extends StructBuffer<FMOD_STUDIO_PARAMETER_DESCRIPTION, Buffer> implements NativeResource {

        private static final FMOD_STUDIO_PARAMETER_DESCRIPTION ELEMENT_FACTORY = FMOD_STUDIO_PARAMETER_DESCRIPTION.create(-1L);

        /**
         * Creates a new {@code FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_STUDIO_PARAMETER_DESCRIPTION#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_STUDIO_PARAMETER_DESCRIPTION getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public ByteBuffer name() { return FMOD_STUDIO_PARAMETER_DESCRIPTION.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public String nameString() { return FMOD_STUDIO_PARAMETER_DESCRIPTION.nnameString(address()); }
        /** @return a {@link FMOD_STUDIO_PARAMETER_ID} view of the {@code id} field. */
        public FMOD_STUDIO_PARAMETER_ID id() { return FMOD_STUDIO_PARAMETER_DESCRIPTION.nid(address()); }
        /** @return the value of the {@code minimum} field. */
        public float minimum() { return FMOD_STUDIO_PARAMETER_DESCRIPTION.nminimum(address()); }
        /** @return the value of the {@code maximum} field. */
        public float maximum() { return FMOD_STUDIO_PARAMETER_DESCRIPTION.nmaximum(address()); }
        /** @return the value of the {@code defaultvalue} field. */
        public float defaultvalue() { return FMOD_STUDIO_PARAMETER_DESCRIPTION.ndefaultvalue(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("FMOD_STUDIO_PARAMETER_TYPE")
        public int type() { return FMOD_STUDIO_PARAMETER_DESCRIPTION.ntype(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("FMOD_STUDIO_PARAMETER_FLAGS")
        public int flags() { return FMOD_STUDIO_PARAMETER_DESCRIPTION.nflags(address()); }
        /** @return a {@link FMOD_GUID} view of the {@code guid} field. */
        public FMOD_GUID guid() { return FMOD_STUDIO_PARAMETER_DESCRIPTION.nguid(address()); }

        /** Sets the address of the specified encoded string to the {@code name} field. */
        public FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer name(@NativeType("char const *") ByteBuffer value) { FMOD_STUDIO_PARAMETER_DESCRIPTION.nname(address(), value); return this; }
        /** Copies the specified {@link FMOD_STUDIO_PARAMETER_ID} to the {@code id} field. */
        public FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer id(FMOD_STUDIO_PARAMETER_ID value) { FMOD_STUDIO_PARAMETER_DESCRIPTION.nid(address(), value); return this; }
        /** Passes the {@code id} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer id(java.util.function.Consumer<FMOD_STUDIO_PARAMETER_ID> consumer) { consumer.accept(id()); return this; }
        /** Sets the specified value to the {@code minimum} field. */
        public FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer minimum(float value) { FMOD_STUDIO_PARAMETER_DESCRIPTION.nminimum(address(), value); return this; }
        /** Sets the specified value to the {@code maximum} field. */
        public FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer maximum(float value) { FMOD_STUDIO_PARAMETER_DESCRIPTION.nmaximum(address(), value); return this; }
        /** Sets the specified value to the {@code defaultvalue} field. */
        public FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer defaultvalue(float value) { FMOD_STUDIO_PARAMETER_DESCRIPTION.ndefaultvalue(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer type(@NativeType("FMOD_STUDIO_PARAMETER_TYPE") int value) { FMOD_STUDIO_PARAMETER_DESCRIPTION.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer flags(@NativeType("FMOD_STUDIO_PARAMETER_FLAGS") int value) { FMOD_STUDIO_PARAMETER_DESCRIPTION.nflags(address(), value); return this; }
        /** Copies the specified {@link FMOD_GUID} to the {@code guid} field. */
        public FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer guid(FMOD_GUID value) { FMOD_STUDIO_PARAMETER_DESCRIPTION.nguid(address(), value); return this; }
        /** Passes the {@code guid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer guid(java.util.function.Consumer<FMOD_GUID> consumer) { consumer.accept(guid()); return this; }

    }

}