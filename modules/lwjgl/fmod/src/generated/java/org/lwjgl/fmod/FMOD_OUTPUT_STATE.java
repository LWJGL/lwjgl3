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
 * struct FMOD_OUTPUT_STATE {
 *     void * plugindata;
 *     {@link FMOD_OUTPUT_READFROMMIXER_FUNCI FMOD_OUTPUT_READFROMMIXER_FUNC} readfrommixer;
 *     {@link FMOD_OUTPUT_ALLOC_FUNCI FMOD_OUTPUT_ALLOC_FUNC} alloc;
 *     {@link FMOD_OUTPUT_FREE_FUNCI FMOD_OUTPUT_FREE_FUNC} free;
 *     {@link FMOD_OUTPUT_LOG_FUNCI FMOD_OUTPUT_LOG_FUNC} log;
 *     {@link FMOD_OUTPUT_COPYPORT_FUNCI FMOD_OUTPUT_COPYPORT_FUNC} copyport;
 *     {@link FMOD_OUTPUT_REQUESTRESET_FUNCI FMOD_OUTPUT_REQUESTRESET_FUNC} requestreset;
 * }</code></pre>
 */
@NativeType("struct FMOD_OUTPUT_STATE")
public class FMOD_OUTPUT_STATE extends Struct<FMOD_OUTPUT_STATE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PLUGINDATA,
        READFROMMIXER,
        ALLOC,
        FREE,
        LOG,
        COPYPORT,
        REQUESTRESET;

    static {
        Layout layout = __struct(
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

        PLUGINDATA = layout.offsetof(0);
        READFROMMIXER = layout.offsetof(1);
        ALLOC = layout.offsetof(2);
        FREE = layout.offsetof(3);
        LOG = layout.offsetof(4);
        COPYPORT = layout.offsetof(5);
        REQUESTRESET = layout.offsetof(6);
    }

    protected FMOD_OUTPUT_STATE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_OUTPUT_STATE create(long address, @Nullable ByteBuffer container) {
        return new FMOD_OUTPUT_STATE(address, container);
    }

    /**
     * Creates a {@code FMOD_OUTPUT_STATE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_OUTPUT_STATE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code plugindata} field. */
    @NativeType("void *")
    public long plugindata() { return nplugindata(address()); }
    /** @return the value of the {@code readfrommixer} field. */
    public FMOD_OUTPUT_READFROMMIXER_FUNC readfrommixer() { return nreadfrommixer(address()); }
    /** @return the value of the {@code alloc} field. */
    public FMOD_OUTPUT_ALLOC_FUNC alloc() { return nalloc(address()); }
    /** @return the value of the {@code free} field. */
    public FMOD_OUTPUT_FREE_FUNC free$() { return nfree$(address()); }
    /** @return the value of the {@code log} field. */
    public FMOD_OUTPUT_LOG_FUNC log() { return nlog(address()); }
    /** @return the value of the {@code copyport} field. */
    public FMOD_OUTPUT_COPYPORT_FUNC copyport() { return ncopyport(address()); }
    /** @return the value of the {@code requestreset} field. */
    public FMOD_OUTPUT_REQUESTRESET_FUNC requestreset() { return nrequestreset(address()); }

    /** Sets the specified value to the {@code plugindata} field. */
    public FMOD_OUTPUT_STATE plugindata(@NativeType("void *") long value) { nplugindata(address(), value); return this; }
    /** Sets the specified value to the {@code readfrommixer} field. */
    public FMOD_OUTPUT_STATE readfrommixer(@NativeType("FMOD_OUTPUT_READFROMMIXER_FUNC") FMOD_OUTPUT_READFROMMIXER_FUNCI value) { nreadfrommixer(address(), value); return this; }
    /** Sets the specified value to the {@code alloc} field. */
    public FMOD_OUTPUT_STATE alloc(@NativeType("FMOD_OUTPUT_ALLOC_FUNC") FMOD_OUTPUT_ALLOC_FUNCI value) { nalloc(address(), value); return this; }
    /** Sets the specified value to the {@code free} field. */
    public FMOD_OUTPUT_STATE free$(@NativeType("FMOD_OUTPUT_FREE_FUNC") FMOD_OUTPUT_FREE_FUNCI value) { nfree$(address(), value); return this; }
    /** Sets the specified value to the {@code log} field. */
    public FMOD_OUTPUT_STATE log(@NativeType("FMOD_OUTPUT_LOG_FUNC") FMOD_OUTPUT_LOG_FUNCI value) { nlog(address(), value); return this; }
    /** Sets the specified value to the {@code copyport} field. */
    public FMOD_OUTPUT_STATE copyport(@NativeType("FMOD_OUTPUT_COPYPORT_FUNC") FMOD_OUTPUT_COPYPORT_FUNCI value) { ncopyport(address(), value); return this; }
    /** Sets the specified value to the {@code requestreset} field. */
    public FMOD_OUTPUT_STATE requestreset(@NativeType("FMOD_OUTPUT_REQUESTRESET_FUNC") FMOD_OUTPUT_REQUESTRESET_FUNCI value) { nrequestreset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_OUTPUT_STATE set(
        long plugindata,
        FMOD_OUTPUT_READFROMMIXER_FUNCI readfrommixer,
        FMOD_OUTPUT_ALLOC_FUNCI alloc,
        FMOD_OUTPUT_FREE_FUNCI free$,
        FMOD_OUTPUT_LOG_FUNCI log,
        FMOD_OUTPUT_COPYPORT_FUNCI copyport,
        FMOD_OUTPUT_REQUESTRESET_FUNCI requestreset
    ) {
        plugindata(plugindata);
        readfrommixer(readfrommixer);
        alloc(alloc);
        free$(free$);
        log(log);
        copyport(copyport);
        requestreset(requestreset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_OUTPUT_STATE set(FMOD_OUTPUT_STATE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_OUTPUT_STATE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_OUTPUT_STATE malloc() {
        return new FMOD_OUTPUT_STATE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_OUTPUT_STATE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_OUTPUT_STATE calloc() {
        return new FMOD_OUTPUT_STATE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_OUTPUT_STATE} instance allocated with {@link BufferUtils}. */
    public static FMOD_OUTPUT_STATE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_OUTPUT_STATE(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_OUTPUT_STATE} instance for the specified memory address. */
    public static FMOD_OUTPUT_STATE create(long address) {
        return new FMOD_OUTPUT_STATE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_OUTPUT_STATE createSafe(long address) {
        return address == NULL ? null : new FMOD_OUTPUT_STATE(address, null);
    }

    /**
     * Returns a new {@link FMOD_OUTPUT_STATE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_STATE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_OUTPUT_STATE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_STATE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_OUTPUT_STATE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_STATE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_OUTPUT_STATE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_STATE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_OUTPUT_STATE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_OUTPUT_STATE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_OUTPUT_STATE malloc(MemoryStack stack) {
        return new FMOD_OUTPUT_STATE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_OUTPUT_STATE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_OUTPUT_STATE calloc(MemoryStack stack) {
        return new FMOD_OUTPUT_STATE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_OUTPUT_STATE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_STATE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_OUTPUT_STATE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_STATE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #plugindata}. */
    public static long nplugindata(long struct) { return memGetAddress(struct + FMOD_OUTPUT_STATE.PLUGINDATA); }
    /** Unsafe version of {@link #readfrommixer}. */
    public static FMOD_OUTPUT_READFROMMIXER_FUNC nreadfrommixer(long struct) { return FMOD_OUTPUT_READFROMMIXER_FUNC.create(memGetAddress(struct + FMOD_OUTPUT_STATE.READFROMMIXER)); }
    /** Unsafe version of {@link #alloc}. */
    public static FMOD_OUTPUT_ALLOC_FUNC nalloc(long struct) { return FMOD_OUTPUT_ALLOC_FUNC.create(memGetAddress(struct + FMOD_OUTPUT_STATE.ALLOC)); }
    /** Unsafe version of {@link #free$}. */
    public static FMOD_OUTPUT_FREE_FUNC nfree$(long struct) { return FMOD_OUTPUT_FREE_FUNC.create(memGetAddress(struct + FMOD_OUTPUT_STATE.FREE)); }
    /** Unsafe version of {@link #log}. */
    public static FMOD_OUTPUT_LOG_FUNC nlog(long struct) { return FMOD_OUTPUT_LOG_FUNC.create(memGetAddress(struct + FMOD_OUTPUT_STATE.LOG)); }
    /** Unsafe version of {@link #copyport}. */
    public static FMOD_OUTPUT_COPYPORT_FUNC ncopyport(long struct) { return FMOD_OUTPUT_COPYPORT_FUNC.create(memGetAddress(struct + FMOD_OUTPUT_STATE.COPYPORT)); }
    /** Unsafe version of {@link #requestreset}. */
    public static FMOD_OUTPUT_REQUESTRESET_FUNC nrequestreset(long struct) { return FMOD_OUTPUT_REQUESTRESET_FUNC.create(memGetAddress(struct + FMOD_OUTPUT_STATE.REQUESTRESET)); }

    /** Unsafe version of {@link #plugindata(long) plugindata}. */
    public static void nplugindata(long struct, long value) { memPutAddress(struct + FMOD_OUTPUT_STATE.PLUGINDATA, check(value)); }
    /** Unsafe version of {@link #readfrommixer(FMOD_OUTPUT_READFROMMIXER_FUNCI) readfrommixer}. */
    public static void nreadfrommixer(long struct, FMOD_OUTPUT_READFROMMIXER_FUNCI value) { memPutAddress(struct + FMOD_OUTPUT_STATE.READFROMMIXER, value.address()); }
    /** Unsafe version of {@link #alloc(FMOD_OUTPUT_ALLOC_FUNCI) alloc}. */
    public static void nalloc(long struct, FMOD_OUTPUT_ALLOC_FUNCI value) { memPutAddress(struct + FMOD_OUTPUT_STATE.ALLOC, value.address()); }
    /** Unsafe version of {@link #free$(FMOD_OUTPUT_FREE_FUNCI) free$}. */
    public static void nfree$(long struct, FMOD_OUTPUT_FREE_FUNCI value) { memPutAddress(struct + FMOD_OUTPUT_STATE.FREE, value.address()); }
    /** Unsafe version of {@link #log(FMOD_OUTPUT_LOG_FUNCI) log}. */
    public static void nlog(long struct, FMOD_OUTPUT_LOG_FUNCI value) { memPutAddress(struct + FMOD_OUTPUT_STATE.LOG, value.address()); }
    /** Unsafe version of {@link #copyport(FMOD_OUTPUT_COPYPORT_FUNCI) copyport}. */
    public static void ncopyport(long struct, FMOD_OUTPUT_COPYPORT_FUNCI value) { memPutAddress(struct + FMOD_OUTPUT_STATE.COPYPORT, value.address()); }
    /** Unsafe version of {@link #requestreset(FMOD_OUTPUT_REQUESTRESET_FUNCI) requestreset}. */
    public static void nrequestreset(long struct, FMOD_OUTPUT_REQUESTRESET_FUNCI value) { memPutAddress(struct + FMOD_OUTPUT_STATE.REQUESTRESET, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_OUTPUT_STATE.PLUGINDATA));
        check(memGetAddress(struct + FMOD_OUTPUT_STATE.READFROMMIXER));
        check(memGetAddress(struct + FMOD_OUTPUT_STATE.ALLOC));
        check(memGetAddress(struct + FMOD_OUTPUT_STATE.FREE));
        check(memGetAddress(struct + FMOD_OUTPUT_STATE.LOG));
        check(memGetAddress(struct + FMOD_OUTPUT_STATE.COPYPORT));
        check(memGetAddress(struct + FMOD_OUTPUT_STATE.REQUESTRESET));
    }

    // -----------------------------------

    /** An array of {@link FMOD_OUTPUT_STATE} structs. */
    public static class Buffer extends StructBuffer<FMOD_OUTPUT_STATE, Buffer> implements NativeResource {

        private static final FMOD_OUTPUT_STATE ELEMENT_FACTORY = FMOD_OUTPUT_STATE.create(-1L);

        /**
         * Creates a new {@code FMOD_OUTPUT_STATE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_OUTPUT_STATE#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_OUTPUT_STATE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code plugindata} field. */
        @NativeType("void *")
        public long plugindata() { return FMOD_OUTPUT_STATE.nplugindata(address()); }
        /** @return the value of the {@code readfrommixer} field. */
        public FMOD_OUTPUT_READFROMMIXER_FUNC readfrommixer() { return FMOD_OUTPUT_STATE.nreadfrommixer(address()); }
        /** @return the value of the {@code alloc} field. */
        public FMOD_OUTPUT_ALLOC_FUNC alloc() { return FMOD_OUTPUT_STATE.nalloc(address()); }
        /** @return the value of the {@code free} field. */
        public FMOD_OUTPUT_FREE_FUNC free$() { return FMOD_OUTPUT_STATE.nfree$(address()); }
        /** @return the value of the {@code log} field. */
        public FMOD_OUTPUT_LOG_FUNC log() { return FMOD_OUTPUT_STATE.nlog(address()); }
        /** @return the value of the {@code copyport} field. */
        public FMOD_OUTPUT_COPYPORT_FUNC copyport() { return FMOD_OUTPUT_STATE.ncopyport(address()); }
        /** @return the value of the {@code requestreset} field. */
        public FMOD_OUTPUT_REQUESTRESET_FUNC requestreset() { return FMOD_OUTPUT_STATE.nrequestreset(address()); }

        /** Sets the specified value to the {@code plugindata} field. */
        public FMOD_OUTPUT_STATE.Buffer plugindata(@NativeType("void *") long value) { FMOD_OUTPUT_STATE.nplugindata(address(), value); return this; }
        /** Sets the specified value to the {@code readfrommixer} field. */
        public FMOD_OUTPUT_STATE.Buffer readfrommixer(@NativeType("FMOD_OUTPUT_READFROMMIXER_FUNC") FMOD_OUTPUT_READFROMMIXER_FUNCI value) { FMOD_OUTPUT_STATE.nreadfrommixer(address(), value); return this; }
        /** Sets the specified value to the {@code alloc} field. */
        public FMOD_OUTPUT_STATE.Buffer alloc(@NativeType("FMOD_OUTPUT_ALLOC_FUNC") FMOD_OUTPUT_ALLOC_FUNCI value) { FMOD_OUTPUT_STATE.nalloc(address(), value); return this; }
        /** Sets the specified value to the {@code free} field. */
        public FMOD_OUTPUT_STATE.Buffer free$(@NativeType("FMOD_OUTPUT_FREE_FUNC") FMOD_OUTPUT_FREE_FUNCI value) { FMOD_OUTPUT_STATE.nfree$(address(), value); return this; }
        /** Sets the specified value to the {@code log} field. */
        public FMOD_OUTPUT_STATE.Buffer log(@NativeType("FMOD_OUTPUT_LOG_FUNC") FMOD_OUTPUT_LOG_FUNCI value) { FMOD_OUTPUT_STATE.nlog(address(), value); return this; }
        /** Sets the specified value to the {@code copyport} field. */
        public FMOD_OUTPUT_STATE.Buffer copyport(@NativeType("FMOD_OUTPUT_COPYPORT_FUNC") FMOD_OUTPUT_COPYPORT_FUNCI value) { FMOD_OUTPUT_STATE.ncopyport(address(), value); return this; }
        /** Sets the specified value to the {@code requestreset} field. */
        public FMOD_OUTPUT_STATE.Buffer requestreset(@NativeType("FMOD_OUTPUT_REQUESTRESET_FUNC") FMOD_OUTPUT_REQUESTRESET_FUNCI value) { FMOD_OUTPUT_STATE.nrequestreset(address(), value); return this; }

    }

}