/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_IOStreamInterface {
 *     Uint32 version;
 *     Sint64 (* size) (void * userdata);
 *     Sint64 (* seek) (void * userdata, Sint64 offset, SDL_IOWhence whence);
 *     size_t (* read) (void * userdata, void * ptr, size_t size, SDL_IOStatus * status);
 *     size_t (* write) (void * userdata, void const * ptr, size_t size, SDL_IOStatus * status);
 *     bool (* flush) (void * userdata, SDL_IOStatus * status);
 *     bool (* close) (void * userdata);
 * }}</pre>
 */
public class SDL_IOStreamInterface extends Struct<SDL_IOStreamInterface> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERSION,
        SIZE,
        SEEK,
        READ,
        WRITE,
        FLUSH,
        CLOSE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERSION = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        SEEK = layout.offsetof(2);
        READ = layout.offsetof(3);
        WRITE = layout.offsetof(4);
        FLUSH = layout.offsetof(5);
        CLOSE = layout.offsetof(6);
    }

    protected SDL_IOStreamInterface(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_IOStreamInterface create(long address, @Nullable ByteBuffer container) {
        return new SDL_IOStreamInterface(address, container);
    }

    /**
     * Creates a {@code SDL_IOStreamInterface} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_IOStreamInterface(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code version} field. */
    @NativeType("Uint32")
    public int version() { return nversion(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("Sint64 (*) (void *)")
    public SDL_IOStreamInterfaceSizeCallback size() { return nsize(address()); }
    /** @return the value of the {@code seek} field. */
    @NativeType("Sint64 (*) (void *, Sint64, SDL_IOWhence)")
    public SDL_IOStreamInterfaceSeekCallback seek() { return nseek(address()); }
    /** @return the value of the {@code read} field. */
    @NativeType("size_t (*) (void *, void *, size_t, SDL_IOStatus *)")
    public SDL_IOStreamInterfaceReadCallback read() { return nread(address()); }
    /** @return the value of the {@code write} field. */
    @NativeType("size_t (*) (void *, void const *, size_t, SDL_IOStatus *)")
    public SDL_IOStreamInterfaceWriteCallback write() { return nwrite(address()); }
    /** @return the value of the {@code flush} field. */
    @NativeType("bool (*) (void *, SDL_IOStatus *)")
    public SDL_IOStreamInterfaceFlushCallback flush() { return nflush(address()); }
    /** @return the value of the {@code close} field. */
    @NativeType("bool (*) (void *)")
    public SDL_IOStreamInterfaceCloseCallback close$() { return nclose$(address()); }

    /** Sets the specified value to the {@code version} field. */
    public SDL_IOStreamInterface version(@NativeType("Uint32") int value) { nversion(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public SDL_IOStreamInterface size(@NativeType("Sint64 (*) (void *)") SDL_IOStreamInterfaceSizeCallbackI value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code seek} field. */
    public SDL_IOStreamInterface seek(@NativeType("Sint64 (*) (void *, Sint64, SDL_IOWhence)") SDL_IOStreamInterfaceSeekCallbackI value) { nseek(address(), value); return this; }
    /** Sets the specified value to the {@code read} field. */
    public SDL_IOStreamInterface read(@NativeType("size_t (*) (void *, void *, size_t, SDL_IOStatus *)") SDL_IOStreamInterfaceReadCallbackI value) { nread(address(), value); return this; }
    /** Sets the specified value to the {@code write} field. */
    public SDL_IOStreamInterface write(@NativeType("size_t (*) (void *, void const *, size_t, SDL_IOStatus *)") SDL_IOStreamInterfaceWriteCallbackI value) { nwrite(address(), value); return this; }
    /** Sets the specified value to the {@code flush} field. */
    public SDL_IOStreamInterface flush(@NativeType("bool (*) (void *, SDL_IOStatus *)") SDL_IOStreamInterfaceFlushCallbackI value) { nflush(address(), value); return this; }
    /** Sets the specified value to the {@code close} field. */
    public SDL_IOStreamInterface close$(@NativeType("bool (*) (void *)") SDL_IOStreamInterfaceCloseCallbackI value) { nclose$(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_IOStreamInterface set(
        int version,
        SDL_IOStreamInterfaceSizeCallbackI size,
        SDL_IOStreamInterfaceSeekCallbackI seek,
        SDL_IOStreamInterfaceReadCallbackI read,
        SDL_IOStreamInterfaceWriteCallbackI write,
        SDL_IOStreamInterfaceFlushCallbackI flush,
        SDL_IOStreamInterfaceCloseCallbackI close$
    ) {
        version(version);
        size(size);
        seek(seek);
        read(read);
        write(write);
        flush(flush);
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
    public SDL_IOStreamInterface set(SDL_IOStreamInterface src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_IOStreamInterface} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_IOStreamInterface malloc() {
        return new SDL_IOStreamInterface(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_IOStreamInterface} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_IOStreamInterface calloc() {
        return new SDL_IOStreamInterface(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_IOStreamInterface} instance allocated with {@link BufferUtils}. */
    public static SDL_IOStreamInterface create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_IOStreamInterface(memAddress(container), container);
    }

    /** Returns a new {@code SDL_IOStreamInterface} instance for the specified memory address. */
    public static SDL_IOStreamInterface create(long address) {
        return new SDL_IOStreamInterface(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_IOStreamInterface createSafe(long address) {
        return address == NULL ? null : new SDL_IOStreamInterface(address, null);
    }

    /**
     * Returns a new {@link SDL_IOStreamInterface.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_IOStreamInterface.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_IOStreamInterface.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_IOStreamInterface.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_IOStreamInterface.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_IOStreamInterface.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_IOStreamInterface.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_IOStreamInterface.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_IOStreamInterface.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_IOStreamInterface} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_IOStreamInterface malloc(MemoryStack stack) {
        return new SDL_IOStreamInterface(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_IOStreamInterface} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_IOStreamInterface calloc(MemoryStack stack) {
        return new SDL_IOStreamInterface(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_IOStreamInterface.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_IOStreamInterface.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_IOStreamInterface.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_IOStreamInterface.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #version}. */
    public static int nversion(long struct) { return memGetInt(struct + SDL_IOStreamInterface.VERSION); }
    /** Unsafe version of {@link #size}. */
    public static SDL_IOStreamInterfaceSizeCallback nsize(long struct) { return SDL_IOStreamInterfaceSizeCallback.create(memGetAddress(struct + SDL_IOStreamInterface.SIZE)); }
    /** Unsafe version of {@link #seek}. */
    public static SDL_IOStreamInterfaceSeekCallback nseek(long struct) { return SDL_IOStreamInterfaceSeekCallback.create(memGetAddress(struct + SDL_IOStreamInterface.SEEK)); }
    /** Unsafe version of {@link #read}. */
    public static SDL_IOStreamInterfaceReadCallback nread(long struct) { return SDL_IOStreamInterfaceReadCallback.create(memGetAddress(struct + SDL_IOStreamInterface.READ)); }
    /** Unsafe version of {@link #write}. */
    public static SDL_IOStreamInterfaceWriteCallback nwrite(long struct) { return SDL_IOStreamInterfaceWriteCallback.create(memGetAddress(struct + SDL_IOStreamInterface.WRITE)); }
    /** Unsafe version of {@link #flush}. */
    public static SDL_IOStreamInterfaceFlushCallback nflush(long struct) { return SDL_IOStreamInterfaceFlushCallback.create(memGetAddress(struct + SDL_IOStreamInterface.FLUSH)); }
    /** Unsafe version of {@link #close$}. */
    public static SDL_IOStreamInterfaceCloseCallback nclose$(long struct) { return SDL_IOStreamInterfaceCloseCallback.create(memGetAddress(struct + SDL_IOStreamInterface.CLOSE)); }

    /** Unsafe version of {@link #version(int) version}. */
    public static void nversion(long struct, int value) { memPutInt(struct + SDL_IOStreamInterface.VERSION, value); }
    /** Unsafe version of {@link #size(SDL_IOStreamInterfaceSizeCallbackI) size}. */
    public static void nsize(long struct, SDL_IOStreamInterfaceSizeCallbackI value) { memPutAddress(struct + SDL_IOStreamInterface.SIZE, value.address()); }
    /** Unsafe version of {@link #seek(SDL_IOStreamInterfaceSeekCallbackI) seek}. */
    public static void nseek(long struct, SDL_IOStreamInterfaceSeekCallbackI value) { memPutAddress(struct + SDL_IOStreamInterface.SEEK, value.address()); }
    /** Unsafe version of {@link #read(SDL_IOStreamInterfaceReadCallbackI) read}. */
    public static void nread(long struct, SDL_IOStreamInterfaceReadCallbackI value) { memPutAddress(struct + SDL_IOStreamInterface.READ, value.address()); }
    /** Unsafe version of {@link #write(SDL_IOStreamInterfaceWriteCallbackI) write}. */
    public static void nwrite(long struct, SDL_IOStreamInterfaceWriteCallbackI value) { memPutAddress(struct + SDL_IOStreamInterface.WRITE, value.address()); }
    /** Unsafe version of {@link #flush(SDL_IOStreamInterfaceFlushCallbackI) flush}. */
    public static void nflush(long struct, SDL_IOStreamInterfaceFlushCallbackI value) { memPutAddress(struct + SDL_IOStreamInterface.FLUSH, value.address()); }
    /** Unsafe version of {@link #close$(SDL_IOStreamInterfaceCloseCallbackI) close$}. */
    public static void nclose$(long struct, SDL_IOStreamInterfaceCloseCallbackI value) { memPutAddress(struct + SDL_IOStreamInterface.CLOSE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_IOStreamInterface.SIZE));
        check(memGetAddress(struct + SDL_IOStreamInterface.SEEK));
        check(memGetAddress(struct + SDL_IOStreamInterface.READ));
        check(memGetAddress(struct + SDL_IOStreamInterface.WRITE));
        check(memGetAddress(struct + SDL_IOStreamInterface.FLUSH));
        check(memGetAddress(struct + SDL_IOStreamInterface.CLOSE));
    }

    // -----------------------------------

    /** An array of {@link SDL_IOStreamInterface} structs. */
    public static class Buffer extends StructBuffer<SDL_IOStreamInterface, Buffer> implements NativeResource {

        private static final SDL_IOStreamInterface ELEMENT_FACTORY = SDL_IOStreamInterface.create(-1L);

        /**
         * Creates a new {@code SDL_IOStreamInterface.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_IOStreamInterface#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected SDL_IOStreamInterface getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code version} field. */
        @NativeType("Uint32")
        public int version() { return SDL_IOStreamInterface.nversion(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("Sint64 (*) (void *)")
        public SDL_IOStreamInterfaceSizeCallback size() { return SDL_IOStreamInterface.nsize(address()); }
        /** @return the value of the {@code seek} field. */
        @NativeType("Sint64 (*) (void *, Sint64, SDL_IOWhence)")
        public SDL_IOStreamInterfaceSeekCallback seek() { return SDL_IOStreamInterface.nseek(address()); }
        /** @return the value of the {@code read} field. */
        @NativeType("size_t (*) (void *, void *, size_t, SDL_IOStatus *)")
        public SDL_IOStreamInterfaceReadCallback read() { return SDL_IOStreamInterface.nread(address()); }
        /** @return the value of the {@code write} field. */
        @NativeType("size_t (*) (void *, void const *, size_t, SDL_IOStatus *)")
        public SDL_IOStreamInterfaceWriteCallback write() { return SDL_IOStreamInterface.nwrite(address()); }
        /** @return the value of the {@code flush} field. */
        @NativeType("bool (*) (void *, SDL_IOStatus *)")
        public SDL_IOStreamInterfaceFlushCallback flush() { return SDL_IOStreamInterface.nflush(address()); }
        /** @return the value of the {@code close} field. */
        @NativeType("bool (*) (void *)")
        public SDL_IOStreamInterfaceCloseCallback close$() { return SDL_IOStreamInterface.nclose$(address()); }

        /** Sets the specified value to the {@code version} field. */
        public SDL_IOStreamInterface.Buffer version(@NativeType("Uint32") int value) { SDL_IOStreamInterface.nversion(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public SDL_IOStreamInterface.Buffer size(@NativeType("Sint64 (*) (void *)") SDL_IOStreamInterfaceSizeCallbackI value) { SDL_IOStreamInterface.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code seek} field. */
        public SDL_IOStreamInterface.Buffer seek(@NativeType("Sint64 (*) (void *, Sint64, SDL_IOWhence)") SDL_IOStreamInterfaceSeekCallbackI value) { SDL_IOStreamInterface.nseek(address(), value); return this; }
        /** Sets the specified value to the {@code read} field. */
        public SDL_IOStreamInterface.Buffer read(@NativeType("size_t (*) (void *, void *, size_t, SDL_IOStatus *)") SDL_IOStreamInterfaceReadCallbackI value) { SDL_IOStreamInterface.nread(address(), value); return this; }
        /** Sets the specified value to the {@code write} field. */
        public SDL_IOStreamInterface.Buffer write(@NativeType("size_t (*) (void *, void const *, size_t, SDL_IOStatus *)") SDL_IOStreamInterfaceWriteCallbackI value) { SDL_IOStreamInterface.nwrite(address(), value); return this; }
        /** Sets the specified value to the {@code flush} field. */
        public SDL_IOStreamInterface.Buffer flush(@NativeType("bool (*) (void *, SDL_IOStatus *)") SDL_IOStreamInterfaceFlushCallbackI value) { SDL_IOStreamInterface.nflush(address(), value); return this; }
        /** Sets the specified value to the {@code close} field. */
        public SDL_IOStreamInterface.Buffer close$(@NativeType("bool (*) (void *)") SDL_IOStreamInterfaceCloseCallbackI value) { SDL_IOStreamInterface.nclose$(address(), value); return this; }

    }

}