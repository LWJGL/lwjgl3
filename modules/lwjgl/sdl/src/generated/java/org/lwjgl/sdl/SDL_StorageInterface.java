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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_StorageInterface {
 *     Uint32 version;
 *     bool (* close) (void * userdata);
 *     bool (* ready) (void * userdata);
 *     bool (* enumerate) (void * userdata, char const * path, SDL_EnumerateDirectoryCallback callback, void * callback_userdata);
 *     bool (* info) (void * userdata, char const * path, SDL_PathInfo * info);
 *     bool (* read_file) (void * userdata, char const * path, void * destination, Uint64 length);
 *     bool (* write_file) (void * userdata, char const * path, void const * source, Uint64 length);
 *     bool (* mkdir) (void * userdata, char const * path);
 *     bool (* remove) (void * userdata, char const * path);
 *     bool (* rename) (void * userdata, char const * oldpath, char const * newpath);
 *     bool (* copy) (void * userdata, char const * oldpath, char const * newpath);
 *     Uint64 (* space_remaining) (void * userdata);
 * }}</pre>
 */
public class SDL_StorageInterface extends Struct<SDL_StorageInterface> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERSION,
        CLOSE,
        READY,
        ENUMERATE,
        INFO,
        READ_FILE,
        WRITE_FILE,
        MKDIR,
        REMOVE,
        RENAME,
        COPY,
        SPACE_REMAINING;

    static {
        Layout layout = __struct(
            __member(4),
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

        VERSION = layout.offsetof(0);
        CLOSE = layout.offsetof(1);
        READY = layout.offsetof(2);
        ENUMERATE = layout.offsetof(3);
        INFO = layout.offsetof(4);
        READ_FILE = layout.offsetof(5);
        WRITE_FILE = layout.offsetof(6);
        MKDIR = layout.offsetof(7);
        REMOVE = layout.offsetof(8);
        RENAME = layout.offsetof(9);
        COPY = layout.offsetof(10);
        SPACE_REMAINING = layout.offsetof(11);
    }

    protected SDL_StorageInterface(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_StorageInterface create(long address, @Nullable ByteBuffer container) {
        return new SDL_StorageInterface(address, container);
    }

    /**
     * Creates a {@code SDL_StorageInterface} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_StorageInterface(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code version} field. */
    @NativeType("Uint32")
    public int version() { return nversion(address()); }
    /** @return the value of the {@code close} field. */
    @NativeType("bool (*) (void *)")
    public @Nullable SDL_StorageInterfaceCloseCallback close$() { return nclose$(address()); }
    /** @return the value of the {@code ready} field. */
    @NativeType("bool (*) (void *)")
    public @Nullable SDL_StorageInterfaceReadyCallback ready() { return nready(address()); }
    /** @return the value of the {@code enumerate} field. */
    @NativeType("bool (*) (void *, char const *, SDL_EnumerateDirectoryCallback, void *)")
    public @Nullable SDL_StorageInterfaceEnumerateCallback enumerate() { return nenumerate(address()); }
    /** @return the value of the {@code info} field. */
    @NativeType("bool (*) (void *, char const *, SDL_PathInfo *)")
    public @Nullable SDL_StorageInterfaceInfoCallback info() { return ninfo(address()); }
    /** @return the value of the {@code read_file} field. */
    @NativeType("bool (*) (void *, char const *, void *, Uint64)")
    public @Nullable SDL_StorageInterfaceReadFileCallback read_file() { return nread_file(address()); }
    /** @return the value of the {@code write_file} field. */
    @NativeType("bool (*) (void *, char const *, void const *, Uint64)")
    public @Nullable SDL_StorageInterfaceWriteFileCallback write_file() { return nwrite_file(address()); }
    /** @return the value of the {@code mkdir} field. */
    @NativeType("bool (*) (void *, char const *)")
    public @Nullable SDL_StorageInterfaceMkdirCallback mkdir() { return nmkdir(address()); }
    /** @return the value of the {@code remove} field. */
    @NativeType("bool (*) (void *, char const *)")
    public @Nullable SDL_StorageInterfaceRemoveCallback remove() { return nremove(address()); }
    /** @return the value of the {@code rename} field. */
    @NativeType("bool (*) (void *, char const *, char const *)")
    public @Nullable SDL_StorageInterfaceRenameCallback rename() { return nrename(address()); }
    /** @return the value of the {@code copy} field. */
    @NativeType("bool (*) (void *, char const *, char const *)")
    public @Nullable SDL_StorageInterfaceCopyCallback copy() { return ncopy(address()); }
    /** @return the value of the {@code space_remaining} field. */
    @NativeType("Uint64 (*) (void *)")
    public @Nullable SDL_StorageInterfaceSpaceRemainingCallback space_remaining() { return nspace_remaining(address()); }

    /** Sets the specified value to the {@code version} field. */
    public SDL_StorageInterface version(@NativeType("Uint32") int value) { nversion(address(), value); return this; }
    /** Sets the specified value to the {@code close} field. */
    public SDL_StorageInterface close$(@Nullable @NativeType("bool (*) (void *)") SDL_StorageInterfaceCloseCallbackI value) { nclose$(address(), value); return this; }
    /** Sets the specified value to the {@code ready} field. */
    public SDL_StorageInterface ready(@Nullable @NativeType("bool (*) (void *)") SDL_StorageInterfaceReadyCallbackI value) { nready(address(), value); return this; }
    /** Sets the specified value to the {@code enumerate} field. */
    public SDL_StorageInterface enumerate(@Nullable @NativeType("bool (*) (void *, char const *, SDL_EnumerateDirectoryCallback, void *)") SDL_StorageInterfaceEnumerateCallbackI value) { nenumerate(address(), value); return this; }
    /** Sets the specified value to the {@code info} field. */
    public SDL_StorageInterface info(@Nullable @NativeType("bool (*) (void *, char const *, SDL_PathInfo *)") SDL_StorageInterfaceInfoCallbackI value) { ninfo(address(), value); return this; }
    /** Sets the specified value to the {@code read_file} field. */
    public SDL_StorageInterface read_file(@Nullable @NativeType("bool (*) (void *, char const *, void *, Uint64)") SDL_StorageInterfaceReadFileCallbackI value) { nread_file(address(), value); return this; }
    /** Sets the specified value to the {@code write_file} field. */
    public SDL_StorageInterface write_file(@Nullable @NativeType("bool (*) (void *, char const *, void const *, Uint64)") SDL_StorageInterfaceWriteFileCallbackI value) { nwrite_file(address(), value); return this; }
    /** Sets the specified value to the {@code mkdir} field. */
    public SDL_StorageInterface mkdir(@Nullable @NativeType("bool (*) (void *, char const *)") SDL_StorageInterfaceMkdirCallbackI value) { nmkdir(address(), value); return this; }
    /** Sets the specified value to the {@code remove} field. */
    public SDL_StorageInterface remove(@Nullable @NativeType("bool (*) (void *, char const *)") SDL_StorageInterfaceRemoveCallbackI value) { nremove(address(), value); return this; }
    /** Sets the specified value to the {@code rename} field. */
    public SDL_StorageInterface rename(@Nullable @NativeType("bool (*) (void *, char const *, char const *)") SDL_StorageInterfaceRenameCallbackI value) { nrename(address(), value); return this; }
    /** Sets the specified value to the {@code copy} field. */
    public SDL_StorageInterface copy(@Nullable @NativeType("bool (*) (void *, char const *, char const *)") SDL_StorageInterfaceCopyCallbackI value) { ncopy(address(), value); return this; }
    /** Sets the specified value to the {@code space_remaining} field. */
    public SDL_StorageInterface space_remaining(@Nullable @NativeType("Uint64 (*) (void *)") SDL_StorageInterfaceSpaceRemainingCallbackI value) { nspace_remaining(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_StorageInterface set(
        int version,
        SDL_StorageInterfaceCloseCallbackI close$,
        SDL_StorageInterfaceReadyCallbackI ready,
        SDL_StorageInterfaceEnumerateCallbackI enumerate,
        SDL_StorageInterfaceInfoCallbackI info,
        SDL_StorageInterfaceReadFileCallbackI read_file,
        SDL_StorageInterfaceWriteFileCallbackI write_file,
        SDL_StorageInterfaceMkdirCallbackI mkdir,
        SDL_StorageInterfaceRemoveCallbackI remove,
        SDL_StorageInterfaceRenameCallbackI rename,
        SDL_StorageInterfaceCopyCallbackI copy,
        SDL_StorageInterfaceSpaceRemainingCallbackI space_remaining
    ) {
        version(version);
        close$(close$);
        ready(ready);
        enumerate(enumerate);
        info(info);
        read_file(read_file);
        write_file(write_file);
        mkdir(mkdir);
        remove(remove);
        rename(rename);
        copy(copy);
        space_remaining(space_remaining);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_StorageInterface set(SDL_StorageInterface src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_StorageInterface} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_StorageInterface malloc() {
        return new SDL_StorageInterface(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_StorageInterface} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_StorageInterface calloc() {
        return new SDL_StorageInterface(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_StorageInterface} instance allocated with {@link BufferUtils}. */
    public static SDL_StorageInterface create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_StorageInterface(memAddress(container), container);
    }

    /** Returns a new {@code SDL_StorageInterface} instance for the specified memory address. */
    public static SDL_StorageInterface create(long address) {
        return new SDL_StorageInterface(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_StorageInterface createSafe(long address) {
        return address == NULL ? null : new SDL_StorageInterface(address, null);
    }

    /**
     * Returns a new {@link SDL_StorageInterface.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_StorageInterface.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_StorageInterface.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_StorageInterface.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_StorageInterface.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_StorageInterface.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_StorageInterface.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_StorageInterface.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_StorageInterface.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_StorageInterface} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_StorageInterface malloc(MemoryStack stack) {
        return new SDL_StorageInterface(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_StorageInterface} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_StorageInterface calloc(MemoryStack stack) {
        return new SDL_StorageInterface(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_StorageInterface.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_StorageInterface.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_StorageInterface.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_StorageInterface.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #version}. */
    public static int nversion(long struct) { return memGetInt(struct + SDL_StorageInterface.VERSION); }
    /** Unsafe version of {@link #close$}. */
    public static @Nullable SDL_StorageInterfaceCloseCallback nclose$(long struct) { return SDL_StorageInterfaceCloseCallback.createSafe(memGetAddress(struct + SDL_StorageInterface.CLOSE)); }
    /** Unsafe version of {@link #ready}. */
    public static @Nullable SDL_StorageInterfaceReadyCallback nready(long struct) { return SDL_StorageInterfaceReadyCallback.createSafe(memGetAddress(struct + SDL_StorageInterface.READY)); }
    /** Unsafe version of {@link #enumerate}. */
    public static @Nullable SDL_StorageInterfaceEnumerateCallback nenumerate(long struct) { return SDL_StorageInterfaceEnumerateCallback.createSafe(memGetAddress(struct + SDL_StorageInterface.ENUMERATE)); }
    /** Unsafe version of {@link #info}. */
    public static @Nullable SDL_StorageInterfaceInfoCallback ninfo(long struct) { return SDL_StorageInterfaceInfoCallback.createSafe(memGetAddress(struct + SDL_StorageInterface.INFO)); }
    /** Unsafe version of {@link #read_file}. */
    public static @Nullable SDL_StorageInterfaceReadFileCallback nread_file(long struct) { return SDL_StorageInterfaceReadFileCallback.createSafe(memGetAddress(struct + SDL_StorageInterface.READ_FILE)); }
    /** Unsafe version of {@link #write_file}. */
    public static @Nullable SDL_StorageInterfaceWriteFileCallback nwrite_file(long struct) { return SDL_StorageInterfaceWriteFileCallback.createSafe(memGetAddress(struct + SDL_StorageInterface.WRITE_FILE)); }
    /** Unsafe version of {@link #mkdir}. */
    public static @Nullable SDL_StorageInterfaceMkdirCallback nmkdir(long struct) { return SDL_StorageInterfaceMkdirCallback.createSafe(memGetAddress(struct + SDL_StorageInterface.MKDIR)); }
    /** Unsafe version of {@link #remove}. */
    public static @Nullable SDL_StorageInterfaceRemoveCallback nremove(long struct) { return SDL_StorageInterfaceRemoveCallback.createSafe(memGetAddress(struct + SDL_StorageInterface.REMOVE)); }
    /** Unsafe version of {@link #rename}. */
    public static @Nullable SDL_StorageInterfaceRenameCallback nrename(long struct) { return SDL_StorageInterfaceRenameCallback.createSafe(memGetAddress(struct + SDL_StorageInterface.RENAME)); }
    /** Unsafe version of {@link #copy}. */
    public static @Nullable SDL_StorageInterfaceCopyCallback ncopy(long struct) { return SDL_StorageInterfaceCopyCallback.createSafe(memGetAddress(struct + SDL_StorageInterface.COPY)); }
    /** Unsafe version of {@link #space_remaining}. */
    public static @Nullable SDL_StorageInterfaceSpaceRemainingCallback nspace_remaining(long struct) { return SDL_StorageInterfaceSpaceRemainingCallback.createSafe(memGetAddress(struct + SDL_StorageInterface.SPACE_REMAINING)); }

    /** Unsafe version of {@link #version(int) version}. */
    public static void nversion(long struct, int value) { memPutInt(struct + SDL_StorageInterface.VERSION, value); }
    /** Unsafe version of {@link #close$(SDL_StorageInterfaceCloseCallbackI) close$}. */
    public static void nclose$(long struct, @Nullable SDL_StorageInterfaceCloseCallbackI value) { memPutAddress(struct + SDL_StorageInterface.CLOSE, memAddressSafe(value)); }
    /** Unsafe version of {@link #ready(SDL_StorageInterfaceReadyCallbackI) ready}. */
    public static void nready(long struct, @Nullable SDL_StorageInterfaceReadyCallbackI value) { memPutAddress(struct + SDL_StorageInterface.READY, memAddressSafe(value)); }
    /** Unsafe version of {@link #enumerate(SDL_StorageInterfaceEnumerateCallbackI) enumerate}. */
    public static void nenumerate(long struct, @Nullable SDL_StorageInterfaceEnumerateCallbackI value) { memPutAddress(struct + SDL_StorageInterface.ENUMERATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #info(SDL_StorageInterfaceInfoCallbackI) info}. */
    public static void ninfo(long struct, @Nullable SDL_StorageInterfaceInfoCallbackI value) { memPutAddress(struct + SDL_StorageInterface.INFO, memAddressSafe(value)); }
    /** Unsafe version of {@link #read_file(SDL_StorageInterfaceReadFileCallbackI) read_file}. */
    public static void nread_file(long struct, @Nullable SDL_StorageInterfaceReadFileCallbackI value) { memPutAddress(struct + SDL_StorageInterface.READ_FILE, memAddressSafe(value)); }
    /** Unsafe version of {@link #write_file(SDL_StorageInterfaceWriteFileCallbackI) write_file}. */
    public static void nwrite_file(long struct, @Nullable SDL_StorageInterfaceWriteFileCallbackI value) { memPutAddress(struct + SDL_StorageInterface.WRITE_FILE, memAddressSafe(value)); }
    /** Unsafe version of {@link #mkdir(SDL_StorageInterfaceMkdirCallbackI) mkdir}. */
    public static void nmkdir(long struct, @Nullable SDL_StorageInterfaceMkdirCallbackI value) { memPutAddress(struct + SDL_StorageInterface.MKDIR, memAddressSafe(value)); }
    /** Unsafe version of {@link #remove(SDL_StorageInterfaceRemoveCallbackI) remove}. */
    public static void nremove(long struct, @Nullable SDL_StorageInterfaceRemoveCallbackI value) { memPutAddress(struct + SDL_StorageInterface.REMOVE, memAddressSafe(value)); }
    /** Unsafe version of {@link #rename(SDL_StorageInterfaceRenameCallbackI) rename}. */
    public static void nrename(long struct, @Nullable SDL_StorageInterfaceRenameCallbackI value) { memPutAddress(struct + SDL_StorageInterface.RENAME, memAddressSafe(value)); }
    /** Unsafe version of {@link #copy(SDL_StorageInterfaceCopyCallbackI) copy}. */
    public static void ncopy(long struct, @Nullable SDL_StorageInterfaceCopyCallbackI value) { memPutAddress(struct + SDL_StorageInterface.COPY, memAddressSafe(value)); }
    /** Unsafe version of {@link #space_remaining(SDL_StorageInterfaceSpaceRemainingCallbackI) space_remaining}. */
    public static void nspace_remaining(long struct, @Nullable SDL_StorageInterfaceSpaceRemainingCallbackI value) { memPutAddress(struct + SDL_StorageInterface.SPACE_REMAINING, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link SDL_StorageInterface} structs. */
    public static class Buffer extends StructBuffer<SDL_StorageInterface, Buffer> implements NativeResource {

        private static final SDL_StorageInterface ELEMENT_FACTORY = SDL_StorageInterface.create(-1L);

        /**
         * Creates a new {@code SDL_StorageInterface.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_StorageInterface#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_StorageInterface getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code version} field. */
        @NativeType("Uint32")
        public int version() { return SDL_StorageInterface.nversion(address()); }
        /** @return the value of the {@code close} field. */
        @NativeType("bool (*) (void *)")
        public @Nullable SDL_StorageInterfaceCloseCallback close$() { return SDL_StorageInterface.nclose$(address()); }
        /** @return the value of the {@code ready} field. */
        @NativeType("bool (*) (void *)")
        public @Nullable SDL_StorageInterfaceReadyCallback ready() { return SDL_StorageInterface.nready(address()); }
        /** @return the value of the {@code enumerate} field. */
        @NativeType("bool (*) (void *, char const *, SDL_EnumerateDirectoryCallback, void *)")
        public @Nullable SDL_StorageInterfaceEnumerateCallback enumerate() { return SDL_StorageInterface.nenumerate(address()); }
        /** @return the value of the {@code info} field. */
        @NativeType("bool (*) (void *, char const *, SDL_PathInfo *)")
        public @Nullable SDL_StorageInterfaceInfoCallback info() { return SDL_StorageInterface.ninfo(address()); }
        /** @return the value of the {@code read_file} field. */
        @NativeType("bool (*) (void *, char const *, void *, Uint64)")
        public @Nullable SDL_StorageInterfaceReadFileCallback read_file() { return SDL_StorageInterface.nread_file(address()); }
        /** @return the value of the {@code write_file} field. */
        @NativeType("bool (*) (void *, char const *, void const *, Uint64)")
        public @Nullable SDL_StorageInterfaceWriteFileCallback write_file() { return SDL_StorageInterface.nwrite_file(address()); }
        /** @return the value of the {@code mkdir} field. */
        @NativeType("bool (*) (void *, char const *)")
        public @Nullable SDL_StorageInterfaceMkdirCallback mkdir() { return SDL_StorageInterface.nmkdir(address()); }
        /** @return the value of the {@code remove} field. */
        @NativeType("bool (*) (void *, char const *)")
        public @Nullable SDL_StorageInterfaceRemoveCallback remove() { return SDL_StorageInterface.nremove(address()); }
        /** @return the value of the {@code rename} field. */
        @NativeType("bool (*) (void *, char const *, char const *)")
        public @Nullable SDL_StorageInterfaceRenameCallback rename() { return SDL_StorageInterface.nrename(address()); }
        /** @return the value of the {@code copy} field. */
        @NativeType("bool (*) (void *, char const *, char const *)")
        public @Nullable SDL_StorageInterfaceCopyCallback copy() { return SDL_StorageInterface.ncopy(address()); }
        /** @return the value of the {@code space_remaining} field. */
        @NativeType("Uint64 (*) (void *)")
        public @Nullable SDL_StorageInterfaceSpaceRemainingCallback space_remaining() { return SDL_StorageInterface.nspace_remaining(address()); }

        /** Sets the specified value to the {@code version} field. */
        public SDL_StorageInterface.Buffer version(@NativeType("Uint32") int value) { SDL_StorageInterface.nversion(address(), value); return this; }
        /** Sets the specified value to the {@code close} field. */
        public SDL_StorageInterface.Buffer close$(@Nullable @NativeType("bool (*) (void *)") SDL_StorageInterfaceCloseCallbackI value) { SDL_StorageInterface.nclose$(address(), value); return this; }
        /** Sets the specified value to the {@code ready} field. */
        public SDL_StorageInterface.Buffer ready(@Nullable @NativeType("bool (*) (void *)") SDL_StorageInterfaceReadyCallbackI value) { SDL_StorageInterface.nready(address(), value); return this; }
        /** Sets the specified value to the {@code enumerate} field. */
        public SDL_StorageInterface.Buffer enumerate(@Nullable @NativeType("bool (*) (void *, char const *, SDL_EnumerateDirectoryCallback, void *)") SDL_StorageInterfaceEnumerateCallbackI value) { SDL_StorageInterface.nenumerate(address(), value); return this; }
        /** Sets the specified value to the {@code info} field. */
        public SDL_StorageInterface.Buffer info(@Nullable @NativeType("bool (*) (void *, char const *, SDL_PathInfo *)") SDL_StorageInterfaceInfoCallbackI value) { SDL_StorageInterface.ninfo(address(), value); return this; }
        /** Sets the specified value to the {@code read_file} field. */
        public SDL_StorageInterface.Buffer read_file(@Nullable @NativeType("bool (*) (void *, char const *, void *, Uint64)") SDL_StorageInterfaceReadFileCallbackI value) { SDL_StorageInterface.nread_file(address(), value); return this; }
        /** Sets the specified value to the {@code write_file} field. */
        public SDL_StorageInterface.Buffer write_file(@Nullable @NativeType("bool (*) (void *, char const *, void const *, Uint64)") SDL_StorageInterfaceWriteFileCallbackI value) { SDL_StorageInterface.nwrite_file(address(), value); return this; }
        /** Sets the specified value to the {@code mkdir} field. */
        public SDL_StorageInterface.Buffer mkdir(@Nullable @NativeType("bool (*) (void *, char const *)") SDL_StorageInterfaceMkdirCallbackI value) { SDL_StorageInterface.nmkdir(address(), value); return this; }
        /** Sets the specified value to the {@code remove} field. */
        public SDL_StorageInterface.Buffer remove(@Nullable @NativeType("bool (*) (void *, char const *)") SDL_StorageInterfaceRemoveCallbackI value) { SDL_StorageInterface.nremove(address(), value); return this; }
        /** Sets the specified value to the {@code rename} field. */
        public SDL_StorageInterface.Buffer rename(@Nullable @NativeType("bool (*) (void *, char const *, char const *)") SDL_StorageInterfaceRenameCallbackI value) { SDL_StorageInterface.nrename(address(), value); return this; }
        /** Sets the specified value to the {@code copy} field. */
        public SDL_StorageInterface.Buffer copy(@Nullable @NativeType("bool (*) (void *, char const *, char const *)") SDL_StorageInterfaceCopyCallbackI value) { SDL_StorageInterface.ncopy(address(), value); return this; }
        /** Sets the specified value to the {@code space_remaining} field. */
        public SDL_StorageInterface.Buffer space_remaining(@Nullable @NativeType("Uint64 (*) (void *)") SDL_StorageInterfaceSpaceRemainingCallbackI value) { SDL_StorageInterface.nspace_remaining(address(), value); return this; }

    }

}