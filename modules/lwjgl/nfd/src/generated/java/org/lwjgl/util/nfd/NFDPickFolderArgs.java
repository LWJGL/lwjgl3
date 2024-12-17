/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.nfd;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct nfdpickfolderu8args_t {
 *     nfdchar_t const * defaultPath;
 *     {@link NFDWindowHandle nfdwindowhandle_t} parentWindow;
 * }}</pre>
 */
@NativeType("struct nfdpickfolderu8args_t")
public class NFDPickFolderArgs extends Struct<NFDPickFolderArgs> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DEFAULTPATH,
        PARENTWINDOW;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(NFDWindowHandle.SIZEOF, NFDWindowHandle.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DEFAULTPATH = layout.offsetof(0);
        PARENTWINDOW = layout.offsetof(1);
    }

    protected NFDPickFolderArgs(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NFDPickFolderArgs create(long address, @Nullable ByteBuffer container) {
        return new NFDPickFolderArgs(address, container);
    }

    /**
     * Creates a {@code NFDPickFolderArgs} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NFDPickFolderArgs(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code defaultPath} field. */
    @NativeType("nfdchar_t const *")
    public @Nullable ByteBuffer defaultPath() { return ndefaultPath(address()); }
    /** @return the null-terminated string pointed to by the {@code defaultPath} field. */
    @NativeType("nfdchar_t const *")
    public @Nullable String defaultPathString() { return ndefaultPathString(address()); }
    /** @return a {@link NFDWindowHandle} view of the {@code parentWindow} field. */
    @NativeType("nfdwindowhandle_t")
    public NFDWindowHandle parentWindow() { return nparentWindow(address()); }

    /** Sets the address of the specified encoded string to the {@code defaultPath} field. */
    public NFDPickFolderArgs defaultPath(@Nullable @NativeType("nfdchar_t const *") ByteBuffer value) { ndefaultPath(address(), value); return this; }
    /** Copies the specified {@link NFDWindowHandle} to the {@code parentWindow} field. */
    public NFDPickFolderArgs parentWindow(@NativeType("nfdwindowhandle_t") NFDWindowHandle value) { nparentWindow(address(), value); return this; }
    /** Passes the {@code parentWindow} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NFDPickFolderArgs parentWindow(java.util.function.Consumer<NFDWindowHandle> consumer) { consumer.accept(parentWindow()); return this; }

    /** Initializes this struct with the specified values. */
    public NFDPickFolderArgs set(
        @Nullable ByteBuffer defaultPath,
        NFDWindowHandle parentWindow
    ) {
        defaultPath(defaultPath);
        parentWindow(parentWindow);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NFDPickFolderArgs set(NFDPickFolderArgs src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NFDPickFolderArgs} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NFDPickFolderArgs malloc() {
        return new NFDPickFolderArgs(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NFDPickFolderArgs} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NFDPickFolderArgs calloc() {
        return new NFDPickFolderArgs(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NFDPickFolderArgs} instance allocated with {@link BufferUtils}. */
    public static NFDPickFolderArgs create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NFDPickFolderArgs(memAddress(container), container);
    }

    /** Returns a new {@code NFDPickFolderArgs} instance for the specified memory address. */
    public static NFDPickFolderArgs create(long address) {
        return new NFDPickFolderArgs(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NFDPickFolderArgs createSafe(long address) {
        return address == NULL ? null : new NFDPickFolderArgs(address, null);
    }

    /**
     * Returns a new {@link NFDPickFolderArgs.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NFDPickFolderArgs.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NFDPickFolderArgs.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NFDPickFolderArgs.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NFDPickFolderArgs.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NFDPickFolderArgs.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NFDPickFolderArgs.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NFDPickFolderArgs.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NFDPickFolderArgs.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code NFDPickFolderArgs} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NFDPickFolderArgs malloc(MemoryStack stack) {
        return new NFDPickFolderArgs(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NFDPickFolderArgs} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NFDPickFolderArgs calloc(MemoryStack stack) {
        return new NFDPickFolderArgs(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NFDPickFolderArgs.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NFDPickFolderArgs.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NFDPickFolderArgs.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NFDPickFolderArgs.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #defaultPath}. */
    public static @Nullable ByteBuffer ndefaultPath(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + NFDPickFolderArgs.DEFAULTPATH)); }
    /** Unsafe version of {@link #defaultPathString}. */
    public static @Nullable String ndefaultPathString(long struct) { return memUTF8Safe(memGetAddress(struct + NFDPickFolderArgs.DEFAULTPATH)); }
    /** Unsafe version of {@link #parentWindow}. */
    public static NFDWindowHandle nparentWindow(long struct) { return NFDWindowHandle.create(struct + NFDPickFolderArgs.PARENTWINDOW); }

    /** Unsafe version of {@link #defaultPath(ByteBuffer) defaultPath}. */
    public static void ndefaultPath(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + NFDPickFolderArgs.DEFAULTPATH, memAddressSafe(value));
    }
    /** Unsafe version of {@link #parentWindow(NFDWindowHandle) parentWindow}. */
    public static void nparentWindow(long struct, NFDWindowHandle value) { memCopy(value.address(), struct + NFDPickFolderArgs.PARENTWINDOW, NFDWindowHandle.SIZEOF); }

    // -----------------------------------

    /** An array of {@link NFDPickFolderArgs} structs. */
    public static class Buffer extends StructBuffer<NFDPickFolderArgs, Buffer> implements NativeResource {

        private static final NFDPickFolderArgs ELEMENT_FACTORY = NFDPickFolderArgs.create(-1L);

        /**
         * Creates a new {@code NFDPickFolderArgs.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NFDPickFolderArgs#SIZEOF}, and its mark will be undefined.</p>
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
        protected NFDPickFolderArgs getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code defaultPath} field. */
        @NativeType("nfdchar_t const *")
        public @Nullable ByteBuffer defaultPath() { return NFDPickFolderArgs.ndefaultPath(address()); }
        /** @return the null-terminated string pointed to by the {@code defaultPath} field. */
        @NativeType("nfdchar_t const *")
        public @Nullable String defaultPathString() { return NFDPickFolderArgs.ndefaultPathString(address()); }
        /** @return a {@link NFDWindowHandle} view of the {@code parentWindow} field. */
        @NativeType("nfdwindowhandle_t")
        public NFDWindowHandle parentWindow() { return NFDPickFolderArgs.nparentWindow(address()); }

        /** Sets the address of the specified encoded string to the {@code defaultPath} field. */
        public NFDPickFolderArgs.Buffer defaultPath(@Nullable @NativeType("nfdchar_t const *") ByteBuffer value) { NFDPickFolderArgs.ndefaultPath(address(), value); return this; }
        /** Copies the specified {@link NFDWindowHandle} to the {@code parentWindow} field. */
        public NFDPickFolderArgs.Buffer parentWindow(@NativeType("nfdwindowhandle_t") NFDWindowHandle value) { NFDPickFolderArgs.nparentWindow(address(), value); return this; }
        /** Passes the {@code parentWindow} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NFDPickFolderArgs.Buffer parentWindow(java.util.function.Consumer<NFDWindowHandle> consumer) { consumer.accept(parentWindow()); return this; }

    }

}