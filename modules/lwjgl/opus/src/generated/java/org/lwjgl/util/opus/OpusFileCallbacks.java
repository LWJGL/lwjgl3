/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The callbacks used to access non-{@code FILE} stream resources.
 * 
 * <p>The function prototypes are basically the same as for the stdio functions {@code fread()}, {@code fseek()}, {@code ftell()}, and {@code fclose()}. The
 * differences are that the {@code FILE *} arguments have been replaced with a {@code void *}, which is to be used as a pointer to whatever internal data
 * these functions might need, that {@code seek} and {@code tell} take and return 64-bit offsets, and that {@code seek} <em>must</em> return {@code -1} if
 * the stream is unseekable.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct OpusFileCallbacks {
 *     {@link OPReadFuncI op_read_func} {@link #read};
 *     {@link OPSeekFuncI op_seek_func} {@link #seek};
 *     {@link OPTellFuncI op_tell_func} {@link #tell};
 *     {@link OPCloseFuncI op_close_func} {@link #close$ close};
 * }</code></pre>
 */
public class OpusFileCallbacks extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        READ,
        SEEK,
        TELL,
        CLOSE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        READ = layout.offsetof(0);
        SEEK = layout.offsetof(1);
        TELL = layout.offsetof(2);
        CLOSE = layout.offsetof(3);
    }

    /**
     * Creates a {@code OpusFileCallbacks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OpusFileCallbacks(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** used to read data from the stream. This must not be {@code NULL}. */
    @NativeType("op_read_func")
    public OPReadFunc read() { return nread(address()); }
    /** used to seek in the stream. This may be {@code NULL} if seeking is not implemented. */
    @Nullable
    @NativeType("op_seek_func")
    public OPSeekFunc seek() { return nseek(address()); }
    /** used to return the current read position in the stream. This may be {@code NULL} if seeking is not implemented. */
    @Nullable
    @NativeType("op_tell_func")
    public OPTellFunc tell() { return ntell(address()); }
    /** used to close the stream when the decoder is freed. This may be {@code NULL} to leave the stream open. */
    @Nullable
    @NativeType("op_close_func")
    public OPCloseFunc close$() { return nclose$(address()); }

    /** Sets the specified value to the {@link #read} field. */
    public OpusFileCallbacks read(@NativeType("op_read_func") OPReadFuncI value) { nread(address(), value); return this; }
    /** Sets the specified value to the {@link #seek} field. */
    public OpusFileCallbacks seek(@Nullable @NativeType("op_seek_func") OPSeekFuncI value) { nseek(address(), value); return this; }
    /** Sets the specified value to the {@link #tell} field. */
    public OpusFileCallbacks tell(@Nullable @NativeType("op_tell_func") OPTellFuncI value) { ntell(address(), value); return this; }
    /** Sets the specified value to the {@link #close$} field. */
    public OpusFileCallbacks close$(@Nullable @NativeType("op_close_func") OPCloseFuncI value) { nclose$(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OpusFileCallbacks set(
        OPReadFuncI read,
        OPSeekFuncI seek,
        OPTellFuncI tell,
        OPCloseFuncI close$
    ) {
        read(read);
        seek(seek);
        tell(tell);
        close$(close$);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OpusFileCallbacks set(OpusFileCallbacks src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OpusFileCallbacks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OpusFileCallbacks malloc() {
        return wrap(OpusFileCallbacks.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OpusFileCallbacks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OpusFileCallbacks calloc() {
        return wrap(OpusFileCallbacks.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OpusFileCallbacks} instance allocated with {@link BufferUtils}. */
    public static OpusFileCallbacks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OpusFileCallbacks.class, memAddress(container), container);
    }

    /** Returns a new {@code OpusFileCallbacks} instance for the specified memory address. */
    public static OpusFileCallbacks create(long address) {
        return wrap(OpusFileCallbacks.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OpusFileCallbacks createSafe(long address) {
        return address == NULL ? null : wrap(OpusFileCallbacks.class, address);
    }

    /**
     * Returns a new {@link OpusFileCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpusFileCallbacks.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OpusFileCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpusFileCallbacks.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpusFileCallbacks.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OpusFileCallbacks.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OpusFileCallbacks.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OpusFileCallbacks.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OpusFileCallbacks.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code OpusFileCallbacks} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OpusFileCallbacks malloc(MemoryStack stack) {
        return wrap(OpusFileCallbacks.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OpusFileCallbacks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OpusFileCallbacks calloc(MemoryStack stack) {
        return wrap(OpusFileCallbacks.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OpusFileCallbacks.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpusFileCallbacks.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpusFileCallbacks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpusFileCallbacks.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #read}. */
    public static OPReadFunc nread(long struct) { return OPReadFunc.create(memGetAddress(struct + OpusFileCallbacks.READ)); }
    /** Unsafe version of {@link #seek}. */
    @Nullable public static OPSeekFunc nseek(long struct) { return OPSeekFunc.createSafe(memGetAddress(struct + OpusFileCallbacks.SEEK)); }
    /** Unsafe version of {@link #tell}. */
    @Nullable public static OPTellFunc ntell(long struct) { return OPTellFunc.createSafe(memGetAddress(struct + OpusFileCallbacks.TELL)); }
    /** Unsafe version of {@link #close$}. */
    @Nullable public static OPCloseFunc nclose$(long struct) { return OPCloseFunc.createSafe(memGetAddress(struct + OpusFileCallbacks.CLOSE)); }

    /** Unsafe version of {@link #read(OPReadFuncI) read}. */
    public static void nread(long struct, OPReadFuncI value) { memPutAddress(struct + OpusFileCallbacks.READ, value.address()); }
    /** Unsafe version of {@link #seek(OPSeekFuncI) seek}. */
    public static void nseek(long struct, @Nullable OPSeekFuncI value) { memPutAddress(struct + OpusFileCallbacks.SEEK, memAddressSafe(value)); }
    /** Unsafe version of {@link #tell(OPTellFuncI) tell}. */
    public static void ntell(long struct, @Nullable OPTellFuncI value) { memPutAddress(struct + OpusFileCallbacks.TELL, memAddressSafe(value)); }
    /** Unsafe version of {@link #close$(OPCloseFuncI) close$}. */
    public static void nclose$(long struct, @Nullable OPCloseFuncI value) { memPutAddress(struct + OpusFileCallbacks.CLOSE, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + OpusFileCallbacks.READ));
    }

    // -----------------------------------

    /** An array of {@link OpusFileCallbacks} structs. */
    public static class Buffer extends StructBuffer<OpusFileCallbacks, Buffer> implements NativeResource {

        private static final OpusFileCallbacks ELEMENT_FACTORY = OpusFileCallbacks.create(-1L);

        /**
         * Creates a new {@code OpusFileCallbacks.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OpusFileCallbacks#SIZEOF}, and its mark will be undefined.
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
        protected OpusFileCallbacks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OpusFileCallbacks#read} field. */
        @NativeType("op_read_func")
        public OPReadFunc read() { return OpusFileCallbacks.nread(address()); }
        /** @return the value of the {@link OpusFileCallbacks#seek} field. */
        @Nullable
        @NativeType("op_seek_func")
        public OPSeekFunc seek() { return OpusFileCallbacks.nseek(address()); }
        /** @return the value of the {@link OpusFileCallbacks#tell} field. */
        @Nullable
        @NativeType("op_tell_func")
        public OPTellFunc tell() { return OpusFileCallbacks.ntell(address()); }
        /** @return the value of the {@link OpusFileCallbacks#close$} field. */
        @Nullable
        @NativeType("op_close_func")
        public OPCloseFunc close$() { return OpusFileCallbacks.nclose$(address()); }

        /** Sets the specified value to the {@link OpusFileCallbacks#read} field. */
        public OpusFileCallbacks.Buffer read(@NativeType("op_read_func") OPReadFuncI value) { OpusFileCallbacks.nread(address(), value); return this; }
        /** Sets the specified value to the {@link OpusFileCallbacks#seek} field. */
        public OpusFileCallbacks.Buffer seek(@Nullable @NativeType("op_seek_func") OPSeekFuncI value) { OpusFileCallbacks.nseek(address(), value); return this; }
        /** Sets the specified value to the {@link OpusFileCallbacks#tell} field. */
        public OpusFileCallbacks.Buffer tell(@Nullable @NativeType("op_tell_func") OPTellFuncI value) { OpusFileCallbacks.ntell(address(), value); return this; }
        /** Sets the specified value to the {@link OpusFileCallbacks#close$} field. */
        public OpusFileCallbacks.Buffer close$(@Nullable @NativeType("op_close_func") OPCloseFuncI value) { OpusFileCallbacks.nclose$(address(), value); return this; }

    }

}