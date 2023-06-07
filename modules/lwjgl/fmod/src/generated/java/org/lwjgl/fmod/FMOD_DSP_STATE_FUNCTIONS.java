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
 * struct FMOD_DSP_STATE_FUNCTIONS {
 *     {@link FMOD_DSP_ALLOC_FUNCI FMOD_DSP_ALLOC_FUNC} alloc;
 *     {@link FMOD_DSP_REALLOC_FUNCI FMOD_DSP_REALLOC_FUNC} realloc;
 *     {@link FMOD_DSP_FREE_FUNCI FMOD_DSP_FREE_FUNC} free;
 *     {@link FMOD_DSP_GETSAMPLERATE_FUNCI FMOD_DSP_GETSAMPLERATE_FUNC} getsamplerate;
 *     {@link FMOD_DSP_GETBLOCKSIZE_FUNCI FMOD_DSP_GETBLOCKSIZE_FUNC} getblocksize;
 *     {@link FMOD_DSP_STATE_DFT_FUNCTIONS FMOD_DSP_STATE_DFT_FUNCTIONS} * dft;
 *     {@link FMOD_DSP_STATE_PAN_FUNCTIONS FMOD_DSP_STATE_PAN_FUNCTIONS} * pan;
 *     {@link FMOD_DSP_GETSPEAKERMODE_FUNCI FMOD_DSP_GETSPEAKERMODE_FUNC} getspeakermode;
 *     {@link FMOD_DSP_GETCLOCK_FUNCI FMOD_DSP_GETCLOCK_FUNC} getclock;
 *     {@link FMOD_DSP_GETLISTENERATTRIBUTES_FUNCI FMOD_DSP_GETLISTENERATTRIBUTES_FUNC} getlistenerattributes;
 *     {@link FMOD_DSP_LOG_FUNCI FMOD_DSP_LOG_FUNC} log;
 *     {@link FMOD_DSP_GETUSERDATA_FUNCI FMOD_DSP_GETUSERDATA_FUNC} getuserdata;
 * }</code></pre>
 */
public class FMOD_DSP_STATE_FUNCTIONS extends Struct<FMOD_DSP_STATE_FUNCTIONS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALLOC,
        REALLOC,
        FREE,
        GETSAMPLERATE,
        GETBLOCKSIZE,
        DFT,
        PAN,
        GETSPEAKERMODE,
        GETCLOCK,
        GETLISTENERATTRIBUTES,
        LOG,
        GETUSERDATA;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
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

        ALLOC = layout.offsetof(0);
        REALLOC = layout.offsetof(1);
        FREE = layout.offsetof(2);
        GETSAMPLERATE = layout.offsetof(3);
        GETBLOCKSIZE = layout.offsetof(4);
        DFT = layout.offsetof(5);
        PAN = layout.offsetof(6);
        GETSPEAKERMODE = layout.offsetof(7);
        GETCLOCK = layout.offsetof(8);
        GETLISTENERATTRIBUTES = layout.offsetof(9);
        LOG = layout.offsetof(10);
        GETUSERDATA = layout.offsetof(11);
    }

    protected FMOD_DSP_STATE_FUNCTIONS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_STATE_FUNCTIONS create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_STATE_FUNCTIONS(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_STATE_FUNCTIONS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_STATE_FUNCTIONS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code alloc} field. */
    public FMOD_DSP_ALLOC_FUNC alloc() { return nalloc(address()); }
    /** @return the value of the {@code realloc} field. */
    public FMOD_DSP_REALLOC_FUNC realloc() { return nrealloc(address()); }
    /** @return the value of the {@code free} field. */
    public FMOD_DSP_FREE_FUNC free$() { return nfree$(address()); }
    /** @return the value of the {@code getsamplerate} field. */
    public FMOD_DSP_GETSAMPLERATE_FUNC getsamplerate() { return ngetsamplerate(address()); }
    /** @return the value of the {@code getblocksize} field. */
    public FMOD_DSP_GETBLOCKSIZE_FUNC getblocksize() { return ngetblocksize(address()); }
    /** @return a {@link FMOD_DSP_STATE_DFT_FUNCTIONS} view of the struct pointed to by the {@code dft} field. */
    @NativeType("FMOD_DSP_STATE_DFT_FUNCTIONS *")
    public FMOD_DSP_STATE_DFT_FUNCTIONS dft() { return ndft(address()); }
    /** @return a {@link FMOD_DSP_STATE_PAN_FUNCTIONS} view of the struct pointed to by the {@code pan} field. */
    @NativeType("FMOD_DSP_STATE_PAN_FUNCTIONS *")
    public FMOD_DSP_STATE_PAN_FUNCTIONS pan() { return npan(address()); }
    /** @return the value of the {@code getspeakermode} field. */
    public FMOD_DSP_GETSPEAKERMODE_FUNC getspeakermode() { return ngetspeakermode(address()); }
    /** @return the value of the {@code getclock} field. */
    public FMOD_DSP_GETCLOCK_FUNC getclock() { return ngetclock(address()); }
    /** @return the value of the {@code getlistenerattributes} field. */
    public FMOD_DSP_GETLISTENERATTRIBUTES_FUNC getlistenerattributes() { return ngetlistenerattributes(address()); }
    /** @return the value of the {@code log} field. */
    public FMOD_DSP_LOG_FUNC log() { return nlog(address()); }
    /** @return the value of the {@code getuserdata} field. */
    public FMOD_DSP_GETUSERDATA_FUNC getuserdata() { return ngetuserdata(address()); }

    /** Sets the specified value to the {@code alloc} field. */
    public FMOD_DSP_STATE_FUNCTIONS alloc(@NativeType("FMOD_DSP_ALLOC_FUNC") FMOD_DSP_ALLOC_FUNCI value) { nalloc(address(), value); return this; }
    /** Sets the specified value to the {@code realloc} field. */
    public FMOD_DSP_STATE_FUNCTIONS realloc(@NativeType("FMOD_DSP_REALLOC_FUNC") FMOD_DSP_REALLOC_FUNCI value) { nrealloc(address(), value); return this; }
    /** Sets the specified value to the {@code free} field. */
    public FMOD_DSP_STATE_FUNCTIONS free$(@NativeType("FMOD_DSP_FREE_FUNC") FMOD_DSP_FREE_FUNCI value) { nfree$(address(), value); return this; }
    /** Sets the specified value to the {@code getsamplerate} field. */
    public FMOD_DSP_STATE_FUNCTIONS getsamplerate(@NativeType("FMOD_DSP_GETSAMPLERATE_FUNC") FMOD_DSP_GETSAMPLERATE_FUNCI value) { ngetsamplerate(address(), value); return this; }
    /** Sets the specified value to the {@code getblocksize} field. */
    public FMOD_DSP_STATE_FUNCTIONS getblocksize(@NativeType("FMOD_DSP_GETBLOCKSIZE_FUNC") FMOD_DSP_GETBLOCKSIZE_FUNCI value) { ngetblocksize(address(), value); return this; }
    /** Sets the address of the specified {@link FMOD_DSP_STATE_DFT_FUNCTIONS} to the {@code dft} field. */
    public FMOD_DSP_STATE_FUNCTIONS dft(@NativeType("FMOD_DSP_STATE_DFT_FUNCTIONS *") FMOD_DSP_STATE_DFT_FUNCTIONS value) { ndft(address(), value); return this; }
    /** Sets the address of the specified {@link FMOD_DSP_STATE_PAN_FUNCTIONS} to the {@code pan} field. */
    public FMOD_DSP_STATE_FUNCTIONS pan(@NativeType("FMOD_DSP_STATE_PAN_FUNCTIONS *") FMOD_DSP_STATE_PAN_FUNCTIONS value) { npan(address(), value); return this; }
    /** Sets the specified value to the {@code getspeakermode} field. */
    public FMOD_DSP_STATE_FUNCTIONS getspeakermode(@NativeType("FMOD_DSP_GETSPEAKERMODE_FUNC") FMOD_DSP_GETSPEAKERMODE_FUNCI value) { ngetspeakermode(address(), value); return this; }
    /** Sets the specified value to the {@code getclock} field. */
    public FMOD_DSP_STATE_FUNCTIONS getclock(@NativeType("FMOD_DSP_GETCLOCK_FUNC") FMOD_DSP_GETCLOCK_FUNCI value) { ngetclock(address(), value); return this; }
    /** Sets the specified value to the {@code getlistenerattributes} field. */
    public FMOD_DSP_STATE_FUNCTIONS getlistenerattributes(@NativeType("FMOD_DSP_GETLISTENERATTRIBUTES_FUNC") FMOD_DSP_GETLISTENERATTRIBUTES_FUNCI value) { ngetlistenerattributes(address(), value); return this; }
    /** Sets the specified value to the {@code log} field. */
    public FMOD_DSP_STATE_FUNCTIONS log(@NativeType("FMOD_DSP_LOG_FUNC") FMOD_DSP_LOG_FUNCI value) { nlog(address(), value); return this; }
    /** Sets the specified value to the {@code getuserdata} field. */
    public FMOD_DSP_STATE_FUNCTIONS getuserdata(@NativeType("FMOD_DSP_GETUSERDATA_FUNC") FMOD_DSP_GETUSERDATA_FUNCI value) { ngetuserdata(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_STATE_FUNCTIONS set(
        FMOD_DSP_ALLOC_FUNCI alloc,
        FMOD_DSP_REALLOC_FUNCI realloc,
        FMOD_DSP_FREE_FUNCI free$,
        FMOD_DSP_GETSAMPLERATE_FUNCI getsamplerate,
        FMOD_DSP_GETBLOCKSIZE_FUNCI getblocksize,
        FMOD_DSP_STATE_DFT_FUNCTIONS dft,
        FMOD_DSP_STATE_PAN_FUNCTIONS pan,
        FMOD_DSP_GETSPEAKERMODE_FUNCI getspeakermode,
        FMOD_DSP_GETCLOCK_FUNCI getclock,
        FMOD_DSP_GETLISTENERATTRIBUTES_FUNCI getlistenerattributes,
        FMOD_DSP_LOG_FUNCI log,
        FMOD_DSP_GETUSERDATA_FUNCI getuserdata
    ) {
        alloc(alloc);
        realloc(realloc);
        free$(free$);
        getsamplerate(getsamplerate);
        getblocksize(getblocksize);
        dft(dft);
        pan(pan);
        getspeakermode(getspeakermode);
        getclock(getclock);
        getlistenerattributes(getlistenerattributes);
        log(log);
        getuserdata(getuserdata);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_STATE_FUNCTIONS set(FMOD_DSP_STATE_FUNCTIONS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_STATE_FUNCTIONS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_STATE_FUNCTIONS malloc() {
        return new FMOD_DSP_STATE_FUNCTIONS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_STATE_FUNCTIONS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_STATE_FUNCTIONS calloc() {
        return new FMOD_DSP_STATE_FUNCTIONS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_STATE_FUNCTIONS} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_STATE_FUNCTIONS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_STATE_FUNCTIONS(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_STATE_FUNCTIONS} instance for the specified memory address. */
    public static FMOD_DSP_STATE_FUNCTIONS create(long address) {
        return new FMOD_DSP_STATE_FUNCTIONS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_STATE_FUNCTIONS createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_STATE_FUNCTIONS(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE_FUNCTIONS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_FUNCTIONS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE_FUNCTIONS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_FUNCTIONS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE_FUNCTIONS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_FUNCTIONS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_STATE_FUNCTIONS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_FUNCTIONS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_STATE_FUNCTIONS.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_STATE_FUNCTIONS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_STATE_FUNCTIONS malloc(MemoryStack stack) {
        return new FMOD_DSP_STATE_FUNCTIONS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_STATE_FUNCTIONS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_STATE_FUNCTIONS calloc(MemoryStack stack) {
        return new FMOD_DSP_STATE_FUNCTIONS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE_FUNCTIONS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_FUNCTIONS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE_FUNCTIONS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_FUNCTIONS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #alloc}. */
    public static FMOD_DSP_ALLOC_FUNC nalloc(long struct) { return FMOD_DSP_ALLOC_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.ALLOC)); }
    /** Unsafe version of {@link #realloc}. */
    public static FMOD_DSP_REALLOC_FUNC nrealloc(long struct) { return FMOD_DSP_REALLOC_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.REALLOC)); }
    /** Unsafe version of {@link #free$}. */
    public static FMOD_DSP_FREE_FUNC nfree$(long struct) { return FMOD_DSP_FREE_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.FREE)); }
    /** Unsafe version of {@link #getsamplerate}. */
    public static FMOD_DSP_GETSAMPLERATE_FUNC ngetsamplerate(long struct) { return FMOD_DSP_GETSAMPLERATE_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETSAMPLERATE)); }
    /** Unsafe version of {@link #getblocksize}. */
    public static FMOD_DSP_GETBLOCKSIZE_FUNC ngetblocksize(long struct) { return FMOD_DSP_GETBLOCKSIZE_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETBLOCKSIZE)); }
    /** Unsafe version of {@link #dft}. */
    public static FMOD_DSP_STATE_DFT_FUNCTIONS ndft(long struct) { return FMOD_DSP_STATE_DFT_FUNCTIONS.create(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.DFT)); }
    /** Unsafe version of {@link #pan}. */
    public static FMOD_DSP_STATE_PAN_FUNCTIONS npan(long struct) { return FMOD_DSP_STATE_PAN_FUNCTIONS.create(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.PAN)); }
    /** Unsafe version of {@link #getspeakermode}. */
    public static FMOD_DSP_GETSPEAKERMODE_FUNC ngetspeakermode(long struct) { return FMOD_DSP_GETSPEAKERMODE_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETSPEAKERMODE)); }
    /** Unsafe version of {@link #getclock}. */
    public static FMOD_DSP_GETCLOCK_FUNC ngetclock(long struct) { return FMOD_DSP_GETCLOCK_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETCLOCK)); }
    /** Unsafe version of {@link #getlistenerattributes}. */
    public static FMOD_DSP_GETLISTENERATTRIBUTES_FUNC ngetlistenerattributes(long struct) { return FMOD_DSP_GETLISTENERATTRIBUTES_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETLISTENERATTRIBUTES)); }
    /** Unsafe version of {@link #log}. */
    public static FMOD_DSP_LOG_FUNC nlog(long struct) { return FMOD_DSP_LOG_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.LOG)); }
    /** Unsafe version of {@link #getuserdata}. */
    public static FMOD_DSP_GETUSERDATA_FUNC ngetuserdata(long struct) { return FMOD_DSP_GETUSERDATA_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETUSERDATA)); }

    /** Unsafe version of {@link #alloc(FMOD_DSP_ALLOC_FUNCI) alloc}. */
    public static void nalloc(long struct, FMOD_DSP_ALLOC_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_FUNCTIONS.ALLOC, value.address()); }
    /** Unsafe version of {@link #realloc(FMOD_DSP_REALLOC_FUNCI) realloc}. */
    public static void nrealloc(long struct, FMOD_DSP_REALLOC_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_FUNCTIONS.REALLOC, value.address()); }
    /** Unsafe version of {@link #free$(FMOD_DSP_FREE_FUNCI) free$}. */
    public static void nfree$(long struct, FMOD_DSP_FREE_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_FUNCTIONS.FREE, value.address()); }
    /** Unsafe version of {@link #getsamplerate(FMOD_DSP_GETSAMPLERATE_FUNCI) getsamplerate}. */
    public static void ngetsamplerate(long struct, FMOD_DSP_GETSAMPLERATE_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETSAMPLERATE, value.address()); }
    /** Unsafe version of {@link #getblocksize(FMOD_DSP_GETBLOCKSIZE_FUNCI) getblocksize}. */
    public static void ngetblocksize(long struct, FMOD_DSP_GETBLOCKSIZE_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETBLOCKSIZE, value.address()); }
    /** Unsafe version of {@link #dft(FMOD_DSP_STATE_DFT_FUNCTIONS) dft}. */
    public static void ndft(long struct, FMOD_DSP_STATE_DFT_FUNCTIONS value) { memPutAddress(struct + FMOD_DSP_STATE_FUNCTIONS.DFT, value.address()); }
    /** Unsafe version of {@link #pan(FMOD_DSP_STATE_PAN_FUNCTIONS) pan}. */
    public static void npan(long struct, FMOD_DSP_STATE_PAN_FUNCTIONS value) { memPutAddress(struct + FMOD_DSP_STATE_FUNCTIONS.PAN, value.address()); }
    /** Unsafe version of {@link #getspeakermode(FMOD_DSP_GETSPEAKERMODE_FUNCI) getspeakermode}. */
    public static void ngetspeakermode(long struct, FMOD_DSP_GETSPEAKERMODE_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETSPEAKERMODE, value.address()); }
    /** Unsafe version of {@link #getclock(FMOD_DSP_GETCLOCK_FUNCI) getclock}. */
    public static void ngetclock(long struct, FMOD_DSP_GETCLOCK_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETCLOCK, value.address()); }
    /** Unsafe version of {@link #getlistenerattributes(FMOD_DSP_GETLISTENERATTRIBUTES_FUNCI) getlistenerattributes}. */
    public static void ngetlistenerattributes(long struct, FMOD_DSP_GETLISTENERATTRIBUTES_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETLISTENERATTRIBUTES, value.address()); }
    /** Unsafe version of {@link #log(FMOD_DSP_LOG_FUNCI) log}. */
    public static void nlog(long struct, FMOD_DSP_LOG_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_FUNCTIONS.LOG, value.address()); }
    /** Unsafe version of {@link #getuserdata(FMOD_DSP_GETUSERDATA_FUNCI) getuserdata}. */
    public static void ngetuserdata(long struct, FMOD_DSP_GETUSERDATA_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETUSERDATA, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.ALLOC));
        check(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.REALLOC));
        check(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.FREE));
        check(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETSAMPLERATE));
        check(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETBLOCKSIZE));
        long dft = memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.DFT);
        check(dft);
        FMOD_DSP_STATE_DFT_FUNCTIONS.validate(dft);
        long pan = memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.PAN);
        check(pan);
        FMOD_DSP_STATE_PAN_FUNCTIONS.validate(pan);
        check(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETSPEAKERMODE));
        check(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETCLOCK));
        check(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETLISTENERATTRIBUTES));
        check(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.LOG));
        check(memGetAddress(struct + FMOD_DSP_STATE_FUNCTIONS.GETUSERDATA));
    }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_STATE_FUNCTIONS} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_STATE_FUNCTIONS, Buffer> implements NativeResource {

        private static final FMOD_DSP_STATE_FUNCTIONS ELEMENT_FACTORY = FMOD_DSP_STATE_FUNCTIONS.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_STATE_FUNCTIONS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_STATE_FUNCTIONS#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_STATE_FUNCTIONS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code alloc} field. */
        public FMOD_DSP_ALLOC_FUNC alloc() { return FMOD_DSP_STATE_FUNCTIONS.nalloc(address()); }
        /** @return the value of the {@code realloc} field. */
        public FMOD_DSP_REALLOC_FUNC realloc() { return FMOD_DSP_STATE_FUNCTIONS.nrealloc(address()); }
        /** @return the value of the {@code free} field. */
        public FMOD_DSP_FREE_FUNC free$() { return FMOD_DSP_STATE_FUNCTIONS.nfree$(address()); }
        /** @return the value of the {@code getsamplerate} field. */
        public FMOD_DSP_GETSAMPLERATE_FUNC getsamplerate() { return FMOD_DSP_STATE_FUNCTIONS.ngetsamplerate(address()); }
        /** @return the value of the {@code getblocksize} field. */
        public FMOD_DSP_GETBLOCKSIZE_FUNC getblocksize() { return FMOD_DSP_STATE_FUNCTIONS.ngetblocksize(address()); }
        /** @return a {@link FMOD_DSP_STATE_DFT_FUNCTIONS} view of the struct pointed to by the {@code dft} field. */
        @NativeType("FMOD_DSP_STATE_DFT_FUNCTIONS *")
        public FMOD_DSP_STATE_DFT_FUNCTIONS dft() { return FMOD_DSP_STATE_FUNCTIONS.ndft(address()); }
        /** @return a {@link FMOD_DSP_STATE_PAN_FUNCTIONS} view of the struct pointed to by the {@code pan} field. */
        @NativeType("FMOD_DSP_STATE_PAN_FUNCTIONS *")
        public FMOD_DSP_STATE_PAN_FUNCTIONS pan() { return FMOD_DSP_STATE_FUNCTIONS.npan(address()); }
        /** @return the value of the {@code getspeakermode} field. */
        public FMOD_DSP_GETSPEAKERMODE_FUNC getspeakermode() { return FMOD_DSP_STATE_FUNCTIONS.ngetspeakermode(address()); }
        /** @return the value of the {@code getclock} field. */
        public FMOD_DSP_GETCLOCK_FUNC getclock() { return FMOD_DSP_STATE_FUNCTIONS.ngetclock(address()); }
        /** @return the value of the {@code getlistenerattributes} field. */
        public FMOD_DSP_GETLISTENERATTRIBUTES_FUNC getlistenerattributes() { return FMOD_DSP_STATE_FUNCTIONS.ngetlistenerattributes(address()); }
        /** @return the value of the {@code log} field. */
        public FMOD_DSP_LOG_FUNC log() { return FMOD_DSP_STATE_FUNCTIONS.nlog(address()); }
        /** @return the value of the {@code getuserdata} field. */
        public FMOD_DSP_GETUSERDATA_FUNC getuserdata() { return FMOD_DSP_STATE_FUNCTIONS.ngetuserdata(address()); }

        /** Sets the specified value to the {@code alloc} field. */
        public FMOD_DSP_STATE_FUNCTIONS.Buffer alloc(@NativeType("FMOD_DSP_ALLOC_FUNC") FMOD_DSP_ALLOC_FUNCI value) { FMOD_DSP_STATE_FUNCTIONS.nalloc(address(), value); return this; }
        /** Sets the specified value to the {@code realloc} field. */
        public FMOD_DSP_STATE_FUNCTIONS.Buffer realloc(@NativeType("FMOD_DSP_REALLOC_FUNC") FMOD_DSP_REALLOC_FUNCI value) { FMOD_DSP_STATE_FUNCTIONS.nrealloc(address(), value); return this; }
        /** Sets the specified value to the {@code free} field. */
        public FMOD_DSP_STATE_FUNCTIONS.Buffer free$(@NativeType("FMOD_DSP_FREE_FUNC") FMOD_DSP_FREE_FUNCI value) { FMOD_DSP_STATE_FUNCTIONS.nfree$(address(), value); return this; }
        /** Sets the specified value to the {@code getsamplerate} field. */
        public FMOD_DSP_STATE_FUNCTIONS.Buffer getsamplerate(@NativeType("FMOD_DSP_GETSAMPLERATE_FUNC") FMOD_DSP_GETSAMPLERATE_FUNCI value) { FMOD_DSP_STATE_FUNCTIONS.ngetsamplerate(address(), value); return this; }
        /** Sets the specified value to the {@code getblocksize} field. */
        public FMOD_DSP_STATE_FUNCTIONS.Buffer getblocksize(@NativeType("FMOD_DSP_GETBLOCKSIZE_FUNC") FMOD_DSP_GETBLOCKSIZE_FUNCI value) { FMOD_DSP_STATE_FUNCTIONS.ngetblocksize(address(), value); return this; }
        /** Sets the address of the specified {@link FMOD_DSP_STATE_DFT_FUNCTIONS} to the {@code dft} field. */
        public FMOD_DSP_STATE_FUNCTIONS.Buffer dft(@NativeType("FMOD_DSP_STATE_DFT_FUNCTIONS *") FMOD_DSP_STATE_DFT_FUNCTIONS value) { FMOD_DSP_STATE_FUNCTIONS.ndft(address(), value); return this; }
        /** Sets the address of the specified {@link FMOD_DSP_STATE_PAN_FUNCTIONS} to the {@code pan} field. */
        public FMOD_DSP_STATE_FUNCTIONS.Buffer pan(@NativeType("FMOD_DSP_STATE_PAN_FUNCTIONS *") FMOD_DSP_STATE_PAN_FUNCTIONS value) { FMOD_DSP_STATE_FUNCTIONS.npan(address(), value); return this; }
        /** Sets the specified value to the {@code getspeakermode} field. */
        public FMOD_DSP_STATE_FUNCTIONS.Buffer getspeakermode(@NativeType("FMOD_DSP_GETSPEAKERMODE_FUNC") FMOD_DSP_GETSPEAKERMODE_FUNCI value) { FMOD_DSP_STATE_FUNCTIONS.ngetspeakermode(address(), value); return this; }
        /** Sets the specified value to the {@code getclock} field. */
        public FMOD_DSP_STATE_FUNCTIONS.Buffer getclock(@NativeType("FMOD_DSP_GETCLOCK_FUNC") FMOD_DSP_GETCLOCK_FUNCI value) { FMOD_DSP_STATE_FUNCTIONS.ngetclock(address(), value); return this; }
        /** Sets the specified value to the {@code getlistenerattributes} field. */
        public FMOD_DSP_STATE_FUNCTIONS.Buffer getlistenerattributes(@NativeType("FMOD_DSP_GETLISTENERATTRIBUTES_FUNC") FMOD_DSP_GETLISTENERATTRIBUTES_FUNCI value) { FMOD_DSP_STATE_FUNCTIONS.ngetlistenerattributes(address(), value); return this; }
        /** Sets the specified value to the {@code log} field. */
        public FMOD_DSP_STATE_FUNCTIONS.Buffer log(@NativeType("FMOD_DSP_LOG_FUNC") FMOD_DSP_LOG_FUNCI value) { FMOD_DSP_STATE_FUNCTIONS.nlog(address(), value); return this; }
        /** Sets the specified value to the {@code getuserdata} field. */
        public FMOD_DSP_STATE_FUNCTIONS.Buffer getuserdata(@NativeType("FMOD_DSP_GETUSERDATA_FUNC") FMOD_DSP_GETUSERDATA_FUNCI value) { FMOD_DSP_STATE_FUNCTIONS.ngetuserdata(address(), value); return this; }

    }

}