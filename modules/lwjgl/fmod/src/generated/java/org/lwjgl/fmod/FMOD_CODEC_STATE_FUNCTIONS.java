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
 * struct FMOD_CODEC_STATE_FUNCTIONS {
 *     {@link FMOD_CODEC_METADATA_FUNCI FMOD_CODEC_METADATA_FUNC} metadata;
 *     {@link FMOD_CODEC_ALLOC_FUNCI FMOD_CODEC_ALLOC_FUNC} alloc;
 *     {@link FMOD_CODEC_FREE_FUNCI FMOD_CODEC_FREE_FUNC} free;
 *     {@link FMOD_CODEC_LOG_FUNCI FMOD_CODEC_LOG_FUNC} log;
 *     {@link FMOD_CODEC_FILE_READ_FUNCI FMOD_CODEC_FILE_READ_FUNC} read;
 *     {@link FMOD_CODEC_FILE_SEEK_FUNCI FMOD_CODEC_FILE_SEEK_FUNC} seek;
 *     {@link FMOD_CODEC_FILE_TELL_FUNCI FMOD_CODEC_FILE_TELL_FUNC} tell;
 *     {@link FMOD_CODEC_FILE_SIZE_FUNCI FMOD_CODEC_FILE_SIZE_FUNC} size;
 * }</code></pre>
 */
public class FMOD_CODEC_STATE_FUNCTIONS extends Struct<FMOD_CODEC_STATE_FUNCTIONS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        METADATA,
        ALLOC,
        FREE,
        LOG,
        READ,
        SEEK,
        TELL,
        SIZE;

    static {
        Layout layout = __struct(
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

        METADATA = layout.offsetof(0);
        ALLOC = layout.offsetof(1);
        FREE = layout.offsetof(2);
        LOG = layout.offsetof(3);
        READ = layout.offsetof(4);
        SEEK = layout.offsetof(5);
        TELL = layout.offsetof(6);
        SIZE = layout.offsetof(7);
    }

    protected FMOD_CODEC_STATE_FUNCTIONS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_CODEC_STATE_FUNCTIONS create(long address, @Nullable ByteBuffer container) {
        return new FMOD_CODEC_STATE_FUNCTIONS(address, container);
    }

    /**
     * Creates a {@code FMOD_CODEC_STATE_FUNCTIONS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_CODEC_STATE_FUNCTIONS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code metadata} field. */
    public FMOD_CODEC_METADATA_FUNC metadata() { return nmetadata(address()); }
    /** @return the value of the {@code alloc} field. */
    public FMOD_CODEC_ALLOC_FUNC alloc() { return nalloc(address()); }
    /** @return the value of the {@code free} field. */
    public FMOD_CODEC_FREE_FUNC free$() { return nfree$(address()); }
    /** @return the value of the {@code log} field. */
    public FMOD_CODEC_LOG_FUNC log() { return nlog(address()); }
    /** @return the value of the {@code read} field. */
    public FMOD_CODEC_FILE_READ_FUNC read() { return nread(address()); }
    /** @return the value of the {@code seek} field. */
    public FMOD_CODEC_FILE_SEEK_FUNC seek() { return nseek(address()); }
    /** @return the value of the {@code tell} field. */
    public FMOD_CODEC_FILE_TELL_FUNC tell() { return ntell(address()); }
    /** @return the value of the {@code size} field. */
    public FMOD_CODEC_FILE_SIZE_FUNC size() { return nsize(address()); }

    /** Sets the specified value to the {@code metadata} field. */
    public FMOD_CODEC_STATE_FUNCTIONS metadata(@NativeType("FMOD_CODEC_METADATA_FUNC") FMOD_CODEC_METADATA_FUNCI value) { nmetadata(address(), value); return this; }
    /** Sets the specified value to the {@code alloc} field. */
    public FMOD_CODEC_STATE_FUNCTIONS alloc(@NativeType("FMOD_CODEC_ALLOC_FUNC") FMOD_CODEC_ALLOC_FUNCI value) { nalloc(address(), value); return this; }
    /** Sets the specified value to the {@code free} field. */
    public FMOD_CODEC_STATE_FUNCTIONS free$(@NativeType("FMOD_CODEC_FREE_FUNC") FMOD_CODEC_FREE_FUNCI value) { nfree$(address(), value); return this; }
    /** Sets the specified value to the {@code log} field. */
    public FMOD_CODEC_STATE_FUNCTIONS log(@NativeType("FMOD_CODEC_LOG_FUNC") FMOD_CODEC_LOG_FUNCI value) { nlog(address(), value); return this; }
    /** Sets the specified value to the {@code read} field. */
    public FMOD_CODEC_STATE_FUNCTIONS read(@NativeType("FMOD_CODEC_FILE_READ_FUNC") FMOD_CODEC_FILE_READ_FUNCI value) { nread(address(), value); return this; }
    /** Sets the specified value to the {@code seek} field. */
    public FMOD_CODEC_STATE_FUNCTIONS seek(@NativeType("FMOD_CODEC_FILE_SEEK_FUNC") FMOD_CODEC_FILE_SEEK_FUNCI value) { nseek(address(), value); return this; }
    /** Sets the specified value to the {@code tell} field. */
    public FMOD_CODEC_STATE_FUNCTIONS tell(@NativeType("FMOD_CODEC_FILE_TELL_FUNC") FMOD_CODEC_FILE_TELL_FUNCI value) { ntell(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public FMOD_CODEC_STATE_FUNCTIONS size(@NativeType("FMOD_CODEC_FILE_SIZE_FUNC") FMOD_CODEC_FILE_SIZE_FUNCI value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_CODEC_STATE_FUNCTIONS set(
        FMOD_CODEC_METADATA_FUNCI metadata,
        FMOD_CODEC_ALLOC_FUNCI alloc,
        FMOD_CODEC_FREE_FUNCI free$,
        FMOD_CODEC_LOG_FUNCI log,
        FMOD_CODEC_FILE_READ_FUNCI read,
        FMOD_CODEC_FILE_SEEK_FUNCI seek,
        FMOD_CODEC_FILE_TELL_FUNCI tell,
        FMOD_CODEC_FILE_SIZE_FUNCI size
    ) {
        metadata(metadata);
        alloc(alloc);
        free$(free$);
        log(log);
        read(read);
        seek(seek);
        tell(tell);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_CODEC_STATE_FUNCTIONS set(FMOD_CODEC_STATE_FUNCTIONS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_CODEC_STATE_FUNCTIONS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_CODEC_STATE_FUNCTIONS malloc() {
        return new FMOD_CODEC_STATE_FUNCTIONS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_CODEC_STATE_FUNCTIONS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_CODEC_STATE_FUNCTIONS calloc() {
        return new FMOD_CODEC_STATE_FUNCTIONS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_CODEC_STATE_FUNCTIONS} instance allocated with {@link BufferUtils}. */
    public static FMOD_CODEC_STATE_FUNCTIONS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_CODEC_STATE_FUNCTIONS(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_CODEC_STATE_FUNCTIONS} instance for the specified memory address. */
    public static FMOD_CODEC_STATE_FUNCTIONS create(long address) {
        return new FMOD_CODEC_STATE_FUNCTIONS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_CODEC_STATE_FUNCTIONS createSafe(long address) {
        return address == NULL ? null : new FMOD_CODEC_STATE_FUNCTIONS(address, null);
    }

    /**
     * Returns a new {@link FMOD_CODEC_STATE_FUNCTIONS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_STATE_FUNCTIONS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_CODEC_STATE_FUNCTIONS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_STATE_FUNCTIONS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_CODEC_STATE_FUNCTIONS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_STATE_FUNCTIONS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_CODEC_STATE_FUNCTIONS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_STATE_FUNCTIONS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_CODEC_STATE_FUNCTIONS.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_CODEC_STATE_FUNCTIONS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_CODEC_STATE_FUNCTIONS malloc(MemoryStack stack) {
        return new FMOD_CODEC_STATE_FUNCTIONS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_CODEC_STATE_FUNCTIONS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_CODEC_STATE_FUNCTIONS calloc(MemoryStack stack) {
        return new FMOD_CODEC_STATE_FUNCTIONS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_CODEC_STATE_FUNCTIONS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_STATE_FUNCTIONS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_CODEC_STATE_FUNCTIONS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_STATE_FUNCTIONS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #metadata}. */
    public static FMOD_CODEC_METADATA_FUNC nmetadata(long struct) { return FMOD_CODEC_METADATA_FUNC.create(memGetAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.METADATA)); }
    /** Unsafe version of {@link #alloc}. */
    public static FMOD_CODEC_ALLOC_FUNC nalloc(long struct) { return FMOD_CODEC_ALLOC_FUNC.create(memGetAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.ALLOC)); }
    /** Unsafe version of {@link #free$}. */
    public static FMOD_CODEC_FREE_FUNC nfree$(long struct) { return FMOD_CODEC_FREE_FUNC.create(memGetAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.FREE)); }
    /** Unsafe version of {@link #log}. */
    public static FMOD_CODEC_LOG_FUNC nlog(long struct) { return FMOD_CODEC_LOG_FUNC.create(memGetAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.LOG)); }
    /** Unsafe version of {@link #read}. */
    public static FMOD_CODEC_FILE_READ_FUNC nread(long struct) { return FMOD_CODEC_FILE_READ_FUNC.create(memGetAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.READ)); }
    /** Unsafe version of {@link #seek}. */
    public static FMOD_CODEC_FILE_SEEK_FUNC nseek(long struct) { return FMOD_CODEC_FILE_SEEK_FUNC.create(memGetAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.SEEK)); }
    /** Unsafe version of {@link #tell}. */
    public static FMOD_CODEC_FILE_TELL_FUNC ntell(long struct) { return FMOD_CODEC_FILE_TELL_FUNC.create(memGetAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.TELL)); }
    /** Unsafe version of {@link #size}. */
    public static FMOD_CODEC_FILE_SIZE_FUNC nsize(long struct) { return FMOD_CODEC_FILE_SIZE_FUNC.create(memGetAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.SIZE)); }

    /** Unsafe version of {@link #metadata(FMOD_CODEC_METADATA_FUNCI) metadata}. */
    public static void nmetadata(long struct, FMOD_CODEC_METADATA_FUNCI value) { memPutAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.METADATA, value.address()); }
    /** Unsafe version of {@link #alloc(FMOD_CODEC_ALLOC_FUNCI) alloc}. */
    public static void nalloc(long struct, FMOD_CODEC_ALLOC_FUNCI value) { memPutAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.ALLOC, value.address()); }
    /** Unsafe version of {@link #free$(FMOD_CODEC_FREE_FUNCI) free$}. */
    public static void nfree$(long struct, FMOD_CODEC_FREE_FUNCI value) { memPutAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.FREE, value.address()); }
    /** Unsafe version of {@link #log(FMOD_CODEC_LOG_FUNCI) log}. */
    public static void nlog(long struct, FMOD_CODEC_LOG_FUNCI value) { memPutAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.LOG, value.address()); }
    /** Unsafe version of {@link #read(FMOD_CODEC_FILE_READ_FUNCI) read}. */
    public static void nread(long struct, FMOD_CODEC_FILE_READ_FUNCI value) { memPutAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.READ, value.address()); }
    /** Unsafe version of {@link #seek(FMOD_CODEC_FILE_SEEK_FUNCI) seek}. */
    public static void nseek(long struct, FMOD_CODEC_FILE_SEEK_FUNCI value) { memPutAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.SEEK, value.address()); }
    /** Unsafe version of {@link #tell(FMOD_CODEC_FILE_TELL_FUNCI) tell}. */
    public static void ntell(long struct, FMOD_CODEC_FILE_TELL_FUNCI value) { memPutAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.TELL, value.address()); }
    /** Unsafe version of {@link #size(FMOD_CODEC_FILE_SIZE_FUNCI) size}. */
    public static void nsize(long struct, FMOD_CODEC_FILE_SIZE_FUNCI value) { memPutAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.SIZE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.METADATA));
        check(memGetAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.ALLOC));
        check(memGetAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.FREE));
        check(memGetAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.LOG));
        check(memGetAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.READ));
        check(memGetAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.SEEK));
        check(memGetAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.TELL));
        check(memGetAddress(struct + FMOD_CODEC_STATE_FUNCTIONS.SIZE));
    }

    // -----------------------------------

    /** An array of {@link FMOD_CODEC_STATE_FUNCTIONS} structs. */
    public static class Buffer extends StructBuffer<FMOD_CODEC_STATE_FUNCTIONS, Buffer> implements NativeResource {

        private static final FMOD_CODEC_STATE_FUNCTIONS ELEMENT_FACTORY = FMOD_CODEC_STATE_FUNCTIONS.create(-1L);

        /**
         * Creates a new {@code FMOD_CODEC_STATE_FUNCTIONS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_CODEC_STATE_FUNCTIONS#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_CODEC_STATE_FUNCTIONS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code metadata} field. */
        public FMOD_CODEC_METADATA_FUNC metadata() { return FMOD_CODEC_STATE_FUNCTIONS.nmetadata(address()); }
        /** @return the value of the {@code alloc} field. */
        public FMOD_CODEC_ALLOC_FUNC alloc() { return FMOD_CODEC_STATE_FUNCTIONS.nalloc(address()); }
        /** @return the value of the {@code free} field. */
        public FMOD_CODEC_FREE_FUNC free$() { return FMOD_CODEC_STATE_FUNCTIONS.nfree$(address()); }
        /** @return the value of the {@code log} field. */
        public FMOD_CODEC_LOG_FUNC log() { return FMOD_CODEC_STATE_FUNCTIONS.nlog(address()); }
        /** @return the value of the {@code read} field. */
        public FMOD_CODEC_FILE_READ_FUNC read() { return FMOD_CODEC_STATE_FUNCTIONS.nread(address()); }
        /** @return the value of the {@code seek} field. */
        public FMOD_CODEC_FILE_SEEK_FUNC seek() { return FMOD_CODEC_STATE_FUNCTIONS.nseek(address()); }
        /** @return the value of the {@code tell} field. */
        public FMOD_CODEC_FILE_TELL_FUNC tell() { return FMOD_CODEC_STATE_FUNCTIONS.ntell(address()); }
        /** @return the value of the {@code size} field. */
        public FMOD_CODEC_FILE_SIZE_FUNC size() { return FMOD_CODEC_STATE_FUNCTIONS.nsize(address()); }

        /** Sets the specified value to the {@code metadata} field. */
        public FMOD_CODEC_STATE_FUNCTIONS.Buffer metadata(@NativeType("FMOD_CODEC_METADATA_FUNC") FMOD_CODEC_METADATA_FUNCI value) { FMOD_CODEC_STATE_FUNCTIONS.nmetadata(address(), value); return this; }
        /** Sets the specified value to the {@code alloc} field. */
        public FMOD_CODEC_STATE_FUNCTIONS.Buffer alloc(@NativeType("FMOD_CODEC_ALLOC_FUNC") FMOD_CODEC_ALLOC_FUNCI value) { FMOD_CODEC_STATE_FUNCTIONS.nalloc(address(), value); return this; }
        /** Sets the specified value to the {@code free} field. */
        public FMOD_CODEC_STATE_FUNCTIONS.Buffer free$(@NativeType("FMOD_CODEC_FREE_FUNC") FMOD_CODEC_FREE_FUNCI value) { FMOD_CODEC_STATE_FUNCTIONS.nfree$(address(), value); return this; }
        /** Sets the specified value to the {@code log} field. */
        public FMOD_CODEC_STATE_FUNCTIONS.Buffer log(@NativeType("FMOD_CODEC_LOG_FUNC") FMOD_CODEC_LOG_FUNCI value) { FMOD_CODEC_STATE_FUNCTIONS.nlog(address(), value); return this; }
        /** Sets the specified value to the {@code read} field. */
        public FMOD_CODEC_STATE_FUNCTIONS.Buffer read(@NativeType("FMOD_CODEC_FILE_READ_FUNC") FMOD_CODEC_FILE_READ_FUNCI value) { FMOD_CODEC_STATE_FUNCTIONS.nread(address(), value); return this; }
        /** Sets the specified value to the {@code seek} field. */
        public FMOD_CODEC_STATE_FUNCTIONS.Buffer seek(@NativeType("FMOD_CODEC_FILE_SEEK_FUNC") FMOD_CODEC_FILE_SEEK_FUNCI value) { FMOD_CODEC_STATE_FUNCTIONS.nseek(address(), value); return this; }
        /** Sets the specified value to the {@code tell} field. */
        public FMOD_CODEC_STATE_FUNCTIONS.Buffer tell(@NativeType("FMOD_CODEC_FILE_TELL_FUNC") FMOD_CODEC_FILE_TELL_FUNCI value) { FMOD_CODEC_STATE_FUNCTIONS.ntell(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public FMOD_CODEC_STATE_FUNCTIONS.Buffer size(@NativeType("FMOD_CODEC_FILE_SIZE_FUNC") FMOD_CODEC_FILE_SIZE_FUNCI value) { FMOD_CODEC_STATE_FUNCTIONS.nsize(address(), value); return this; }

    }

}