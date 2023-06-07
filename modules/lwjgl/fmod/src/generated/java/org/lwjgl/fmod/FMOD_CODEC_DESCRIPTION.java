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
 * Codec structures
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FMOD_CODEC_DESCRIPTION {
 *     unsigned int apiversion;
 *     char const * name;
 *     unsigned int version;
 *     int defaultasstream;
 *     FMOD_TIMEUNIT timeunits;
 *     {@link FMOD_CODEC_OPEN_CALLBACKI FMOD_CODEC_OPEN_CALLBACK} open;
 *     {@link FMOD_CODEC_CLOSE_CALLBACKI FMOD_CODEC_CLOSE_CALLBACK} close;
 *     {@link FMOD_CODEC_READ_CALLBACKI FMOD_CODEC_READ_CALLBACK} read;
 *     {@link FMOD_CODEC_GETLENGTH_CALLBACKI FMOD_CODEC_GETLENGTH_CALLBACK} getlength;
 *     {@link FMOD_CODEC_SETPOSITION_CALLBACKI FMOD_CODEC_SETPOSITION_CALLBACK} setposition;
 *     {@link FMOD_CODEC_GETPOSITION_CALLBACKI FMOD_CODEC_GETPOSITION_CALLBACK} getposition;
 *     {@link FMOD_CODEC_SOUNDCREATE_CALLBACKI FMOD_CODEC_SOUNDCREATE_CALLBACK} soundcreate;
 *     {@link FMOD_CODEC_GETWAVEFORMAT_CALLBACKI FMOD_CODEC_GETWAVEFORMAT_CALLBACK} getwaveformat;
 * }</code></pre>
 */
public class FMOD_CODEC_DESCRIPTION extends Struct<FMOD_CODEC_DESCRIPTION> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        APIVERSION,
        NAME,
        VERSION,
        DEFAULTASSTREAM,
        TIMEUNITS,
        OPEN,
        CLOSE,
        READ,
        GETLENGTH,
        SETPOSITION,
        GETPOSITION,
        SOUNDCREATE,
        GETWAVEFORMAT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        APIVERSION = layout.offsetof(0);
        NAME = layout.offsetof(1);
        VERSION = layout.offsetof(2);
        DEFAULTASSTREAM = layout.offsetof(3);
        TIMEUNITS = layout.offsetof(4);
        OPEN = layout.offsetof(5);
        CLOSE = layout.offsetof(6);
        READ = layout.offsetof(7);
        GETLENGTH = layout.offsetof(8);
        SETPOSITION = layout.offsetof(9);
        GETPOSITION = layout.offsetof(10);
        SOUNDCREATE = layout.offsetof(11);
        GETWAVEFORMAT = layout.offsetof(12);
    }

    protected FMOD_CODEC_DESCRIPTION(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_CODEC_DESCRIPTION create(long address, @Nullable ByteBuffer container) {
        return new FMOD_CODEC_DESCRIPTION(address, container);
    }

    /**
     * Creates a {@code FMOD_CODEC_DESCRIPTION} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_CODEC_DESCRIPTION(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code apiversion} field. */
    @NativeType("unsigned int")
    public int apiversion() { return napiversion(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public String nameString() { return nnameString(address()); }
    /** @return the value of the {@code version} field. */
    @NativeType("unsigned int")
    public int version() { return nversion(address()); }
    /** @return the value of the {@code defaultasstream} field. */
    public int defaultasstream() { return ndefaultasstream(address()); }
    /** @return the value of the {@code timeunits} field. */
    @NativeType("FMOD_TIMEUNIT")
    public int timeunits() { return ntimeunits(address()); }
    /** @return the value of the {@code open} field. */
    public FMOD_CODEC_OPEN_CALLBACK open() { return nopen(address()); }
    /** @return the value of the {@code close} field. */
    public FMOD_CODEC_CLOSE_CALLBACK close$() { return nclose$(address()); }
    /** @return the value of the {@code read} field. */
    public FMOD_CODEC_READ_CALLBACK read() { return nread(address()); }
    /** @return the value of the {@code getlength} field. */
    public FMOD_CODEC_GETLENGTH_CALLBACK getlength() { return ngetlength(address()); }
    /** @return the value of the {@code setposition} field. */
    public FMOD_CODEC_SETPOSITION_CALLBACK setposition() { return nsetposition(address()); }
    /** @return the value of the {@code getposition} field. */
    public FMOD_CODEC_GETPOSITION_CALLBACK getposition() { return ngetposition(address()); }
    /** @return the value of the {@code soundcreate} field. */
    public FMOD_CODEC_SOUNDCREATE_CALLBACK soundcreate() { return nsoundcreate(address()); }
    /** @return the value of the {@code getwaveformat} field. */
    public FMOD_CODEC_GETWAVEFORMAT_CALLBACK getwaveformat() { return ngetwaveformat(address()); }

    /** Sets the specified value to the {@code apiversion} field. */
    public FMOD_CODEC_DESCRIPTION apiversion(@NativeType("unsigned int") int value) { napiversion(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code name} field. */
    public FMOD_CODEC_DESCRIPTION name(@NativeType("char const *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the specified value to the {@code version} field. */
    public FMOD_CODEC_DESCRIPTION version(@NativeType("unsigned int") int value) { nversion(address(), value); return this; }
    /** Sets the specified value to the {@code defaultasstream} field. */
    public FMOD_CODEC_DESCRIPTION defaultasstream(int value) { ndefaultasstream(address(), value); return this; }
    /** Sets the specified value to the {@code timeunits} field. */
    public FMOD_CODEC_DESCRIPTION timeunits(@NativeType("FMOD_TIMEUNIT") int value) { ntimeunits(address(), value); return this; }
    /** Sets the specified value to the {@code open} field. */
    public FMOD_CODEC_DESCRIPTION open(@NativeType("FMOD_CODEC_OPEN_CALLBACK") FMOD_CODEC_OPEN_CALLBACKI value) { nopen(address(), value); return this; }
    /** Sets the specified value to the {@code close} field. */
    public FMOD_CODEC_DESCRIPTION close$(@NativeType("FMOD_CODEC_CLOSE_CALLBACK") FMOD_CODEC_CLOSE_CALLBACKI value) { nclose$(address(), value); return this; }
    /** Sets the specified value to the {@code read} field. */
    public FMOD_CODEC_DESCRIPTION read(@NativeType("FMOD_CODEC_READ_CALLBACK") FMOD_CODEC_READ_CALLBACKI value) { nread(address(), value); return this; }
    /** Sets the specified value to the {@code getlength} field. */
    public FMOD_CODEC_DESCRIPTION getlength(@NativeType("FMOD_CODEC_GETLENGTH_CALLBACK") FMOD_CODEC_GETLENGTH_CALLBACKI value) { ngetlength(address(), value); return this; }
    /** Sets the specified value to the {@code setposition} field. */
    public FMOD_CODEC_DESCRIPTION setposition(@NativeType("FMOD_CODEC_SETPOSITION_CALLBACK") FMOD_CODEC_SETPOSITION_CALLBACKI value) { nsetposition(address(), value); return this; }
    /** Sets the specified value to the {@code getposition} field. */
    public FMOD_CODEC_DESCRIPTION getposition(@NativeType("FMOD_CODEC_GETPOSITION_CALLBACK") FMOD_CODEC_GETPOSITION_CALLBACKI value) { ngetposition(address(), value); return this; }
    /** Sets the specified value to the {@code soundcreate} field. */
    public FMOD_CODEC_DESCRIPTION soundcreate(@NativeType("FMOD_CODEC_SOUNDCREATE_CALLBACK") FMOD_CODEC_SOUNDCREATE_CALLBACKI value) { nsoundcreate(address(), value); return this; }
    /** Sets the specified value to the {@code getwaveformat} field. */
    public FMOD_CODEC_DESCRIPTION getwaveformat(@NativeType("FMOD_CODEC_GETWAVEFORMAT_CALLBACK") FMOD_CODEC_GETWAVEFORMAT_CALLBACKI value) { ngetwaveformat(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_CODEC_DESCRIPTION set(
        int apiversion,
        ByteBuffer name,
        int version,
        int defaultasstream,
        int timeunits,
        FMOD_CODEC_OPEN_CALLBACKI open,
        FMOD_CODEC_CLOSE_CALLBACKI close$,
        FMOD_CODEC_READ_CALLBACKI read,
        FMOD_CODEC_GETLENGTH_CALLBACKI getlength,
        FMOD_CODEC_SETPOSITION_CALLBACKI setposition,
        FMOD_CODEC_GETPOSITION_CALLBACKI getposition,
        FMOD_CODEC_SOUNDCREATE_CALLBACKI soundcreate,
        FMOD_CODEC_GETWAVEFORMAT_CALLBACKI getwaveformat
    ) {
        apiversion(apiversion);
        name(name);
        version(version);
        defaultasstream(defaultasstream);
        timeunits(timeunits);
        open(open);
        close$(close$);
        read(read);
        getlength(getlength);
        setposition(setposition);
        getposition(getposition);
        soundcreate(soundcreate);
        getwaveformat(getwaveformat);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_CODEC_DESCRIPTION set(FMOD_CODEC_DESCRIPTION src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_CODEC_DESCRIPTION} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_CODEC_DESCRIPTION malloc() {
        return new FMOD_CODEC_DESCRIPTION(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_CODEC_DESCRIPTION} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_CODEC_DESCRIPTION calloc() {
        return new FMOD_CODEC_DESCRIPTION(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_CODEC_DESCRIPTION} instance allocated with {@link BufferUtils}. */
    public static FMOD_CODEC_DESCRIPTION create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_CODEC_DESCRIPTION(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_CODEC_DESCRIPTION} instance for the specified memory address. */
    public static FMOD_CODEC_DESCRIPTION create(long address) {
        return new FMOD_CODEC_DESCRIPTION(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_CODEC_DESCRIPTION createSafe(long address) {
        return address == NULL ? null : new FMOD_CODEC_DESCRIPTION(address, null);
    }

    /**
     * Returns a new {@link FMOD_CODEC_DESCRIPTION.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_DESCRIPTION.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_CODEC_DESCRIPTION.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_DESCRIPTION.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_CODEC_DESCRIPTION.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_DESCRIPTION.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_CODEC_DESCRIPTION.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_DESCRIPTION.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_CODEC_DESCRIPTION.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_CODEC_DESCRIPTION} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_CODEC_DESCRIPTION malloc(MemoryStack stack) {
        return new FMOD_CODEC_DESCRIPTION(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_CODEC_DESCRIPTION} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_CODEC_DESCRIPTION calloc(MemoryStack stack) {
        return new FMOD_CODEC_DESCRIPTION(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_CODEC_DESCRIPTION.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_DESCRIPTION.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_CODEC_DESCRIPTION.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_DESCRIPTION.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #apiversion}. */
    public static int napiversion(long struct) { return UNSAFE.getInt(null, struct + FMOD_CODEC_DESCRIPTION.APIVERSION); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.NAME)); }
    /** Unsafe version of {@link #version}. */
    public static int nversion(long struct) { return UNSAFE.getInt(null, struct + FMOD_CODEC_DESCRIPTION.VERSION); }
    /** Unsafe version of {@link #defaultasstream}. */
    public static int ndefaultasstream(long struct) { return UNSAFE.getInt(null, struct + FMOD_CODEC_DESCRIPTION.DEFAULTASSTREAM); }
    /** Unsafe version of {@link #timeunits}. */
    public static int ntimeunits(long struct) { return UNSAFE.getInt(null, struct + FMOD_CODEC_DESCRIPTION.TIMEUNITS); }
    /** Unsafe version of {@link #open}. */
    public static FMOD_CODEC_OPEN_CALLBACK nopen(long struct) { return FMOD_CODEC_OPEN_CALLBACK.create(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.OPEN)); }
    /** Unsafe version of {@link #close$}. */
    public static FMOD_CODEC_CLOSE_CALLBACK nclose$(long struct) { return FMOD_CODEC_CLOSE_CALLBACK.create(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.CLOSE)); }
    /** Unsafe version of {@link #read}. */
    public static FMOD_CODEC_READ_CALLBACK nread(long struct) { return FMOD_CODEC_READ_CALLBACK.create(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.READ)); }
    /** Unsafe version of {@link #getlength}. */
    public static FMOD_CODEC_GETLENGTH_CALLBACK ngetlength(long struct) { return FMOD_CODEC_GETLENGTH_CALLBACK.create(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.GETLENGTH)); }
    /** Unsafe version of {@link #setposition}. */
    public static FMOD_CODEC_SETPOSITION_CALLBACK nsetposition(long struct) { return FMOD_CODEC_SETPOSITION_CALLBACK.create(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.SETPOSITION)); }
    /** Unsafe version of {@link #getposition}. */
    public static FMOD_CODEC_GETPOSITION_CALLBACK ngetposition(long struct) { return FMOD_CODEC_GETPOSITION_CALLBACK.create(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.GETPOSITION)); }
    /** Unsafe version of {@link #soundcreate}. */
    public static FMOD_CODEC_SOUNDCREATE_CALLBACK nsoundcreate(long struct) { return FMOD_CODEC_SOUNDCREATE_CALLBACK.create(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.SOUNDCREATE)); }
    /** Unsafe version of {@link #getwaveformat}. */
    public static FMOD_CODEC_GETWAVEFORMAT_CALLBACK ngetwaveformat(long struct) { return FMOD_CODEC_GETWAVEFORMAT_CALLBACK.create(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.GETWAVEFORMAT)); }

    /** Unsafe version of {@link #apiversion(int) apiversion}. */
    public static void napiversion(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CODEC_DESCRIPTION.APIVERSION, value); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + FMOD_CODEC_DESCRIPTION.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #version(int) version}. */
    public static void nversion(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CODEC_DESCRIPTION.VERSION, value); }
    /** Unsafe version of {@link #defaultasstream(int) defaultasstream}. */
    public static void ndefaultasstream(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CODEC_DESCRIPTION.DEFAULTASSTREAM, value); }
    /** Unsafe version of {@link #timeunits(int) timeunits}. */
    public static void ntimeunits(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CODEC_DESCRIPTION.TIMEUNITS, value); }
    /** Unsafe version of {@link #open(FMOD_CODEC_OPEN_CALLBACKI) open}. */
    public static void nopen(long struct, FMOD_CODEC_OPEN_CALLBACKI value) { memPutAddress(struct + FMOD_CODEC_DESCRIPTION.OPEN, value.address()); }
    /** Unsafe version of {@link #close$(FMOD_CODEC_CLOSE_CALLBACKI) close$}. */
    public static void nclose$(long struct, FMOD_CODEC_CLOSE_CALLBACKI value) { memPutAddress(struct + FMOD_CODEC_DESCRIPTION.CLOSE, value.address()); }
    /** Unsafe version of {@link #read(FMOD_CODEC_READ_CALLBACKI) read}. */
    public static void nread(long struct, FMOD_CODEC_READ_CALLBACKI value) { memPutAddress(struct + FMOD_CODEC_DESCRIPTION.READ, value.address()); }
    /** Unsafe version of {@link #getlength(FMOD_CODEC_GETLENGTH_CALLBACKI) getlength}. */
    public static void ngetlength(long struct, FMOD_CODEC_GETLENGTH_CALLBACKI value) { memPutAddress(struct + FMOD_CODEC_DESCRIPTION.GETLENGTH, value.address()); }
    /** Unsafe version of {@link #setposition(FMOD_CODEC_SETPOSITION_CALLBACKI) setposition}. */
    public static void nsetposition(long struct, FMOD_CODEC_SETPOSITION_CALLBACKI value) { memPutAddress(struct + FMOD_CODEC_DESCRIPTION.SETPOSITION, value.address()); }
    /** Unsafe version of {@link #getposition(FMOD_CODEC_GETPOSITION_CALLBACKI) getposition}. */
    public static void ngetposition(long struct, FMOD_CODEC_GETPOSITION_CALLBACKI value) { memPutAddress(struct + FMOD_CODEC_DESCRIPTION.GETPOSITION, value.address()); }
    /** Unsafe version of {@link #soundcreate(FMOD_CODEC_SOUNDCREATE_CALLBACKI) soundcreate}. */
    public static void nsoundcreate(long struct, FMOD_CODEC_SOUNDCREATE_CALLBACKI value) { memPutAddress(struct + FMOD_CODEC_DESCRIPTION.SOUNDCREATE, value.address()); }
    /** Unsafe version of {@link #getwaveformat(FMOD_CODEC_GETWAVEFORMAT_CALLBACKI) getwaveformat}. */
    public static void ngetwaveformat(long struct, FMOD_CODEC_GETWAVEFORMAT_CALLBACKI value) { memPutAddress(struct + FMOD_CODEC_DESCRIPTION.GETWAVEFORMAT, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.NAME));
        check(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.OPEN));
        check(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.CLOSE));
        check(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.READ));
        check(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.GETLENGTH));
        check(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.SETPOSITION));
        check(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.GETPOSITION));
        check(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.SOUNDCREATE));
        check(memGetAddress(struct + FMOD_CODEC_DESCRIPTION.GETWAVEFORMAT));
    }

    // -----------------------------------

    /** An array of {@link FMOD_CODEC_DESCRIPTION} structs. */
    public static class Buffer extends StructBuffer<FMOD_CODEC_DESCRIPTION, Buffer> implements NativeResource {

        private static final FMOD_CODEC_DESCRIPTION ELEMENT_FACTORY = FMOD_CODEC_DESCRIPTION.create(-1L);

        /**
         * Creates a new {@code FMOD_CODEC_DESCRIPTION.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_CODEC_DESCRIPTION#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_CODEC_DESCRIPTION getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code apiversion} field. */
        @NativeType("unsigned int")
        public int apiversion() { return FMOD_CODEC_DESCRIPTION.napiversion(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public ByteBuffer name() { return FMOD_CODEC_DESCRIPTION.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public String nameString() { return FMOD_CODEC_DESCRIPTION.nnameString(address()); }
        /** @return the value of the {@code version} field. */
        @NativeType("unsigned int")
        public int version() { return FMOD_CODEC_DESCRIPTION.nversion(address()); }
        /** @return the value of the {@code defaultasstream} field. */
        public int defaultasstream() { return FMOD_CODEC_DESCRIPTION.ndefaultasstream(address()); }
        /** @return the value of the {@code timeunits} field. */
        @NativeType("FMOD_TIMEUNIT")
        public int timeunits() { return FMOD_CODEC_DESCRIPTION.ntimeunits(address()); }
        /** @return the value of the {@code open} field. */
        public FMOD_CODEC_OPEN_CALLBACK open() { return FMOD_CODEC_DESCRIPTION.nopen(address()); }
        /** @return the value of the {@code close} field. */
        public FMOD_CODEC_CLOSE_CALLBACK close$() { return FMOD_CODEC_DESCRIPTION.nclose$(address()); }
        /** @return the value of the {@code read} field. */
        public FMOD_CODEC_READ_CALLBACK read() { return FMOD_CODEC_DESCRIPTION.nread(address()); }
        /** @return the value of the {@code getlength} field. */
        public FMOD_CODEC_GETLENGTH_CALLBACK getlength() { return FMOD_CODEC_DESCRIPTION.ngetlength(address()); }
        /** @return the value of the {@code setposition} field. */
        public FMOD_CODEC_SETPOSITION_CALLBACK setposition() { return FMOD_CODEC_DESCRIPTION.nsetposition(address()); }
        /** @return the value of the {@code getposition} field. */
        public FMOD_CODEC_GETPOSITION_CALLBACK getposition() { return FMOD_CODEC_DESCRIPTION.ngetposition(address()); }
        /** @return the value of the {@code soundcreate} field. */
        public FMOD_CODEC_SOUNDCREATE_CALLBACK soundcreate() { return FMOD_CODEC_DESCRIPTION.nsoundcreate(address()); }
        /** @return the value of the {@code getwaveformat} field. */
        public FMOD_CODEC_GETWAVEFORMAT_CALLBACK getwaveformat() { return FMOD_CODEC_DESCRIPTION.ngetwaveformat(address()); }

        /** Sets the specified value to the {@code apiversion} field. */
        public FMOD_CODEC_DESCRIPTION.Buffer apiversion(@NativeType("unsigned int") int value) { FMOD_CODEC_DESCRIPTION.napiversion(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code name} field. */
        public FMOD_CODEC_DESCRIPTION.Buffer name(@NativeType("char const *") ByteBuffer value) { FMOD_CODEC_DESCRIPTION.nname(address(), value); return this; }
        /** Sets the specified value to the {@code version} field. */
        public FMOD_CODEC_DESCRIPTION.Buffer version(@NativeType("unsigned int") int value) { FMOD_CODEC_DESCRIPTION.nversion(address(), value); return this; }
        /** Sets the specified value to the {@code defaultasstream} field. */
        public FMOD_CODEC_DESCRIPTION.Buffer defaultasstream(int value) { FMOD_CODEC_DESCRIPTION.ndefaultasstream(address(), value); return this; }
        /** Sets the specified value to the {@code timeunits} field. */
        public FMOD_CODEC_DESCRIPTION.Buffer timeunits(@NativeType("FMOD_TIMEUNIT") int value) { FMOD_CODEC_DESCRIPTION.ntimeunits(address(), value); return this; }
        /** Sets the specified value to the {@code open} field. */
        public FMOD_CODEC_DESCRIPTION.Buffer open(@NativeType("FMOD_CODEC_OPEN_CALLBACK") FMOD_CODEC_OPEN_CALLBACKI value) { FMOD_CODEC_DESCRIPTION.nopen(address(), value); return this; }
        /** Sets the specified value to the {@code close} field. */
        public FMOD_CODEC_DESCRIPTION.Buffer close$(@NativeType("FMOD_CODEC_CLOSE_CALLBACK") FMOD_CODEC_CLOSE_CALLBACKI value) { FMOD_CODEC_DESCRIPTION.nclose$(address(), value); return this; }
        /** Sets the specified value to the {@code read} field. */
        public FMOD_CODEC_DESCRIPTION.Buffer read(@NativeType("FMOD_CODEC_READ_CALLBACK") FMOD_CODEC_READ_CALLBACKI value) { FMOD_CODEC_DESCRIPTION.nread(address(), value); return this; }
        /** Sets the specified value to the {@code getlength} field. */
        public FMOD_CODEC_DESCRIPTION.Buffer getlength(@NativeType("FMOD_CODEC_GETLENGTH_CALLBACK") FMOD_CODEC_GETLENGTH_CALLBACKI value) { FMOD_CODEC_DESCRIPTION.ngetlength(address(), value); return this; }
        /** Sets the specified value to the {@code setposition} field. */
        public FMOD_CODEC_DESCRIPTION.Buffer setposition(@NativeType("FMOD_CODEC_SETPOSITION_CALLBACK") FMOD_CODEC_SETPOSITION_CALLBACKI value) { FMOD_CODEC_DESCRIPTION.nsetposition(address(), value); return this; }
        /** Sets the specified value to the {@code getposition} field. */
        public FMOD_CODEC_DESCRIPTION.Buffer getposition(@NativeType("FMOD_CODEC_GETPOSITION_CALLBACK") FMOD_CODEC_GETPOSITION_CALLBACKI value) { FMOD_CODEC_DESCRIPTION.ngetposition(address(), value); return this; }
        /** Sets the specified value to the {@code soundcreate} field. */
        public FMOD_CODEC_DESCRIPTION.Buffer soundcreate(@NativeType("FMOD_CODEC_SOUNDCREATE_CALLBACK") FMOD_CODEC_SOUNDCREATE_CALLBACKI value) { FMOD_CODEC_DESCRIPTION.nsoundcreate(address(), value); return this; }
        /** Sets the specified value to the {@code getwaveformat} field. */
        public FMOD_CODEC_DESCRIPTION.Buffer getwaveformat(@NativeType("FMOD_CODEC_GETWAVEFORMAT_CALLBACK") FMOD_CODEC_GETWAVEFORMAT_CALLBACKI value) { FMOD_CODEC_DESCRIPTION.ngetwaveformat(address(), value); return this; }

    }

}