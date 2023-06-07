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
 * struct FMOD_ERRORCALLBACK_INFO {
 *     FMOD_RESULT result;
 *     FMOD_ERRORCALLBACK_INSTANCETYPE instancetype;
 *     void * instance;
 *     char const * functionname;
 *     char const * functionparams;
 * }</code></pre>
 */
public class FMOD_ERRORCALLBACK_INFO extends Struct<FMOD_ERRORCALLBACK_INFO> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESULT,
        INSTANCETYPE,
        INSTANCE,
        FUNCTIONNAME,
        FUNCTIONPARAMS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESULT = layout.offsetof(0);
        INSTANCETYPE = layout.offsetof(1);
        INSTANCE = layout.offsetof(2);
        FUNCTIONNAME = layout.offsetof(3);
        FUNCTIONPARAMS = layout.offsetof(4);
    }

    protected FMOD_ERRORCALLBACK_INFO(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_ERRORCALLBACK_INFO create(long address, @Nullable ByteBuffer container) {
        return new FMOD_ERRORCALLBACK_INFO(address, container);
    }

    /**
     * Creates a {@code FMOD_ERRORCALLBACK_INFO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_ERRORCALLBACK_INFO(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code result} field. */
    @NativeType("FMOD_RESULT")
    public int result() { return nresult(address()); }
    /** @return the value of the {@code instancetype} field. */
    @NativeType("FMOD_ERRORCALLBACK_INSTANCETYPE")
    public int instancetype() { return ninstancetype(address()); }
    /** @return the value of the {@code instance} field. */
    @NativeType("void *")
    public long instance() { return ninstance(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code functionname} field. */
    @NativeType("char const *")
    public ByteBuffer functionname() { return nfunctionname(address()); }
    /** @return the null-terminated string pointed to by the {@code functionname} field. */
    @NativeType("char const *")
    public String functionnameString() { return nfunctionnameString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code functionparams} field. */
    @NativeType("char const *")
    public ByteBuffer functionparams() { return nfunctionparams(address()); }
    /** @return the null-terminated string pointed to by the {@code functionparams} field. */
    @NativeType("char const *")
    public String functionparamsString() { return nfunctionparamsString(address()); }

    /** Sets the specified value to the {@code result} field. */
    public FMOD_ERRORCALLBACK_INFO result(@NativeType("FMOD_RESULT") int value) { nresult(address(), value); return this; }
    /** Sets the specified value to the {@code instancetype} field. */
    public FMOD_ERRORCALLBACK_INFO instancetype(@NativeType("FMOD_ERRORCALLBACK_INSTANCETYPE") int value) { ninstancetype(address(), value); return this; }
    /** Sets the specified value to the {@code instance} field. */
    public FMOD_ERRORCALLBACK_INFO instance(@NativeType("void *") long value) { ninstance(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code functionname} field. */
    public FMOD_ERRORCALLBACK_INFO functionname(@NativeType("char const *") ByteBuffer value) { nfunctionname(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code functionparams} field. */
    public FMOD_ERRORCALLBACK_INFO functionparams(@NativeType("char const *") ByteBuffer value) { nfunctionparams(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_ERRORCALLBACK_INFO set(
        int result,
        int instancetype,
        long instance,
        ByteBuffer functionname,
        ByteBuffer functionparams
    ) {
        result(result);
        instancetype(instancetype);
        instance(instance);
        functionname(functionname);
        functionparams(functionparams);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_ERRORCALLBACK_INFO set(FMOD_ERRORCALLBACK_INFO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_ERRORCALLBACK_INFO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_ERRORCALLBACK_INFO malloc() {
        return new FMOD_ERRORCALLBACK_INFO(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_ERRORCALLBACK_INFO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_ERRORCALLBACK_INFO calloc() {
        return new FMOD_ERRORCALLBACK_INFO(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_ERRORCALLBACK_INFO} instance allocated with {@link BufferUtils}. */
    public static FMOD_ERRORCALLBACK_INFO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_ERRORCALLBACK_INFO(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_ERRORCALLBACK_INFO} instance for the specified memory address. */
    public static FMOD_ERRORCALLBACK_INFO create(long address) {
        return new FMOD_ERRORCALLBACK_INFO(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_ERRORCALLBACK_INFO createSafe(long address) {
        return address == NULL ? null : new FMOD_ERRORCALLBACK_INFO(address, null);
    }

    /**
     * Returns a new {@link FMOD_ERRORCALLBACK_INFO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_ERRORCALLBACK_INFO.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_ERRORCALLBACK_INFO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_ERRORCALLBACK_INFO.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_ERRORCALLBACK_INFO.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_ERRORCALLBACK_INFO.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_ERRORCALLBACK_INFO.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_ERRORCALLBACK_INFO.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_ERRORCALLBACK_INFO.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_ERRORCALLBACK_INFO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_ERRORCALLBACK_INFO malloc(MemoryStack stack) {
        return new FMOD_ERRORCALLBACK_INFO(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_ERRORCALLBACK_INFO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_ERRORCALLBACK_INFO calloc(MemoryStack stack) {
        return new FMOD_ERRORCALLBACK_INFO(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_ERRORCALLBACK_INFO.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_ERRORCALLBACK_INFO.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_ERRORCALLBACK_INFO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_ERRORCALLBACK_INFO.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return UNSAFE.getInt(null, struct + FMOD_ERRORCALLBACK_INFO.RESULT); }
    /** Unsafe version of {@link #instancetype}. */
    public static int ninstancetype(long struct) { return UNSAFE.getInt(null, struct + FMOD_ERRORCALLBACK_INFO.INSTANCETYPE); }
    /** Unsafe version of {@link #instance}. */
    public static long ninstance(long struct) { return memGetAddress(struct + FMOD_ERRORCALLBACK_INFO.INSTANCE); }
    /** Unsafe version of {@link #functionname}. */
    public static ByteBuffer nfunctionname(long struct) { return memByteBufferNT1(memGetAddress(struct + FMOD_ERRORCALLBACK_INFO.FUNCTIONNAME)); }
    /** Unsafe version of {@link #functionnameString}. */
    public static String nfunctionnameString(long struct) { return memUTF8(memGetAddress(struct + FMOD_ERRORCALLBACK_INFO.FUNCTIONNAME)); }
    /** Unsafe version of {@link #functionparams}. */
    public static ByteBuffer nfunctionparams(long struct) { return memByteBufferNT1(memGetAddress(struct + FMOD_ERRORCALLBACK_INFO.FUNCTIONPARAMS)); }
    /** Unsafe version of {@link #functionparamsString}. */
    public static String nfunctionparamsString(long struct) { return memUTF8(memGetAddress(struct + FMOD_ERRORCALLBACK_INFO.FUNCTIONPARAMS)); }

    /** Unsafe version of {@link #result(int) result}. */
    public static void nresult(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ERRORCALLBACK_INFO.RESULT, value); }
    /** Unsafe version of {@link #instancetype(int) instancetype}. */
    public static void ninstancetype(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ERRORCALLBACK_INFO.INSTANCETYPE, value); }
    /** Unsafe version of {@link #instance(long) instance}. */
    public static void ninstance(long struct, long value) { memPutAddress(struct + FMOD_ERRORCALLBACK_INFO.INSTANCE, check(value)); }
    /** Unsafe version of {@link #functionname(ByteBuffer) functionname}. */
    public static void nfunctionname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + FMOD_ERRORCALLBACK_INFO.FUNCTIONNAME, memAddress(value));
    }
    /** Unsafe version of {@link #functionparams(ByteBuffer) functionparams}. */
    public static void nfunctionparams(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + FMOD_ERRORCALLBACK_INFO.FUNCTIONPARAMS, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_ERRORCALLBACK_INFO.INSTANCE));
        check(memGetAddress(struct + FMOD_ERRORCALLBACK_INFO.FUNCTIONNAME));
        check(memGetAddress(struct + FMOD_ERRORCALLBACK_INFO.FUNCTIONPARAMS));
    }

    // -----------------------------------

    /** An array of {@link FMOD_ERRORCALLBACK_INFO} structs. */
    public static class Buffer extends StructBuffer<FMOD_ERRORCALLBACK_INFO, Buffer> implements NativeResource {

        private static final FMOD_ERRORCALLBACK_INFO ELEMENT_FACTORY = FMOD_ERRORCALLBACK_INFO.create(-1L);

        /**
         * Creates a new {@code FMOD_ERRORCALLBACK_INFO.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_ERRORCALLBACK_INFO#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_ERRORCALLBACK_INFO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code result} field. */
        @NativeType("FMOD_RESULT")
        public int result() { return FMOD_ERRORCALLBACK_INFO.nresult(address()); }
        /** @return the value of the {@code instancetype} field. */
        @NativeType("FMOD_ERRORCALLBACK_INSTANCETYPE")
        public int instancetype() { return FMOD_ERRORCALLBACK_INFO.ninstancetype(address()); }
        /** @return the value of the {@code instance} field. */
        @NativeType("void *")
        public long instance() { return FMOD_ERRORCALLBACK_INFO.ninstance(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code functionname} field. */
        @NativeType("char const *")
        public ByteBuffer functionname() { return FMOD_ERRORCALLBACK_INFO.nfunctionname(address()); }
        /** @return the null-terminated string pointed to by the {@code functionname} field. */
        @NativeType("char const *")
        public String functionnameString() { return FMOD_ERRORCALLBACK_INFO.nfunctionnameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code functionparams} field. */
        @NativeType("char const *")
        public ByteBuffer functionparams() { return FMOD_ERRORCALLBACK_INFO.nfunctionparams(address()); }
        /** @return the null-terminated string pointed to by the {@code functionparams} field. */
        @NativeType("char const *")
        public String functionparamsString() { return FMOD_ERRORCALLBACK_INFO.nfunctionparamsString(address()); }

        /** Sets the specified value to the {@code result} field. */
        public FMOD_ERRORCALLBACK_INFO.Buffer result(@NativeType("FMOD_RESULT") int value) { FMOD_ERRORCALLBACK_INFO.nresult(address(), value); return this; }
        /** Sets the specified value to the {@code instancetype} field. */
        public FMOD_ERRORCALLBACK_INFO.Buffer instancetype(@NativeType("FMOD_ERRORCALLBACK_INSTANCETYPE") int value) { FMOD_ERRORCALLBACK_INFO.ninstancetype(address(), value); return this; }
        /** Sets the specified value to the {@code instance} field. */
        public FMOD_ERRORCALLBACK_INFO.Buffer instance(@NativeType("void *") long value) { FMOD_ERRORCALLBACK_INFO.ninstance(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code functionname} field. */
        public FMOD_ERRORCALLBACK_INFO.Buffer functionname(@NativeType("char const *") ByteBuffer value) { FMOD_ERRORCALLBACK_INFO.nfunctionname(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code functionparams} field. */
        public FMOD_ERRORCALLBACK_INFO.Buffer functionparams(@NativeType("char const *") ByteBuffer value) { FMOD_ERRORCALLBACK_INFO.nfunctionparams(address(), value); return this; }

    }

}