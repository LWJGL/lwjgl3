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
 * struct nfdopendialogu8args_t {
 *     {@link NFDFilterItem nfdfilteritem_t} const * filterList;
 *     nfdfiltersize_t filterCount;
 *     nfdchar_t const * defaultPath;
 *     {@link NFDWindowHandle nfdwindowhandle_t} parentWindow;
 * }}</pre>
 */
@NativeType("struct nfdopendialogu8args_t")
public class NFDOpenDialogArgs extends Struct<NFDOpenDialogArgs> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FILTERLIST,
        FILTERCOUNT,
        DEFAULTPATH,
        PARENTWINDOW;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(NFDWindowHandle.SIZEOF, NFDWindowHandle.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FILTERLIST = layout.offsetof(0);
        FILTERCOUNT = layout.offsetof(1);
        DEFAULTPATH = layout.offsetof(2);
        PARENTWINDOW = layout.offsetof(3);
    }

    protected NFDOpenDialogArgs(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NFDOpenDialogArgs create(long address, @Nullable ByteBuffer container) {
        return new NFDOpenDialogArgs(address, container);
    }

    /**
     * Creates a {@code NFDOpenDialogArgs} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NFDOpenDialogArgs(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link NFDFilterItem.Buffer} view of the struct array pointed to by the {@code filterList} field. */
    @NativeType("nfdfilteritem_t const *")
    public NFDFilterItem.@Nullable Buffer filterList() { return nfilterList(address()); }
    /** @return the value of the {@code filterCount} field. */
    @NativeType("nfdfiltersize_t")
    public int filterCount() { return nfilterCount(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code defaultPath} field. */
    @NativeType("nfdchar_t const *")
    public @Nullable ByteBuffer defaultPath() { return ndefaultPath(address()); }
    /** @return the null-terminated string pointed to by the {@code defaultPath} field. */
    @NativeType("nfdchar_t const *")
    public @Nullable String defaultPathString() { return ndefaultPathString(address()); }
    /** @return a {@link NFDWindowHandle} view of the {@code parentWindow} field. */
    @NativeType("nfdwindowhandle_t")
    public NFDWindowHandle parentWindow() { return nparentWindow(address()); }

    /** Sets the address of the specified {@link NFDFilterItem.Buffer} to the {@code filterList} field. */
    public NFDOpenDialogArgs filterList(@NativeType("nfdfilteritem_t const *") NFDFilterItem.@Nullable Buffer value) { nfilterList(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code defaultPath} field. */
    public NFDOpenDialogArgs defaultPath(@Nullable @NativeType("nfdchar_t const *") ByteBuffer value) { ndefaultPath(address(), value); return this; }
    /** Copies the specified {@link NFDWindowHandle} to the {@code parentWindow} field. */
    public NFDOpenDialogArgs parentWindow(@NativeType("nfdwindowhandle_t") NFDWindowHandle value) { nparentWindow(address(), value); return this; }
    /** Passes the {@code parentWindow} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NFDOpenDialogArgs parentWindow(java.util.function.Consumer<NFDWindowHandle> consumer) { consumer.accept(parentWindow()); return this; }

    /** Initializes this struct with the specified values. */
    public NFDOpenDialogArgs set(
        NFDFilterItem.@Nullable Buffer filterList,
        @Nullable ByteBuffer defaultPath,
        NFDWindowHandle parentWindow
    ) {
        filterList(filterList);
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
    public NFDOpenDialogArgs set(NFDOpenDialogArgs src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NFDOpenDialogArgs} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NFDOpenDialogArgs malloc() {
        return new NFDOpenDialogArgs(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NFDOpenDialogArgs} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NFDOpenDialogArgs calloc() {
        return new NFDOpenDialogArgs(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NFDOpenDialogArgs} instance allocated with {@link BufferUtils}. */
    public static NFDOpenDialogArgs create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NFDOpenDialogArgs(memAddress(container), container);
    }

    /** Returns a new {@code NFDOpenDialogArgs} instance for the specified memory address. */
    public static NFDOpenDialogArgs create(long address) {
        return new NFDOpenDialogArgs(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NFDOpenDialogArgs createSafe(long address) {
        return address == NULL ? null : new NFDOpenDialogArgs(address, null);
    }

    /**
     * Returns a new {@link NFDOpenDialogArgs.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NFDOpenDialogArgs.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NFDOpenDialogArgs.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NFDOpenDialogArgs.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NFDOpenDialogArgs.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NFDOpenDialogArgs.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NFDOpenDialogArgs.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NFDOpenDialogArgs.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NFDOpenDialogArgs.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code NFDOpenDialogArgs} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NFDOpenDialogArgs malloc(MemoryStack stack) {
        return new NFDOpenDialogArgs(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NFDOpenDialogArgs} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NFDOpenDialogArgs calloc(MemoryStack stack) {
        return new NFDOpenDialogArgs(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NFDOpenDialogArgs.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NFDOpenDialogArgs.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NFDOpenDialogArgs.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NFDOpenDialogArgs.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #filterList}. */
    public static NFDFilterItem.@Nullable Buffer nfilterList(long struct) { return NFDFilterItem.createSafe(memGetAddress(struct + NFDOpenDialogArgs.FILTERLIST), nfilterCount(struct)); }
    /** Unsafe version of {@link #filterCount}. */
    public static int nfilterCount(long struct) { return memGetInt(struct + NFDOpenDialogArgs.FILTERCOUNT); }
    /** Unsafe version of {@link #defaultPath}. */
    public static @Nullable ByteBuffer ndefaultPath(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + NFDOpenDialogArgs.DEFAULTPATH)); }
    /** Unsafe version of {@link #defaultPathString}. */
    public static @Nullable String ndefaultPathString(long struct) { return memUTF8Safe(memGetAddress(struct + NFDOpenDialogArgs.DEFAULTPATH)); }
    /** Unsafe version of {@link #parentWindow}. */
    public static NFDWindowHandle nparentWindow(long struct) { return NFDWindowHandle.create(struct + NFDOpenDialogArgs.PARENTWINDOW); }

    /** Unsafe version of {@link #filterList(NFDFilterItem.Buffer) filterList}. */
    public static void nfilterList(long struct, NFDFilterItem.@Nullable Buffer value) { memPutAddress(struct + NFDOpenDialogArgs.FILTERLIST, memAddressSafe(value)); nfilterCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code filterCount} field of the specified {@code struct}. */
    public static void nfilterCount(long struct, int value) { memPutInt(struct + NFDOpenDialogArgs.FILTERCOUNT, value); }
    /** Unsafe version of {@link #defaultPath(ByteBuffer) defaultPath}. */
    public static void ndefaultPath(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + NFDOpenDialogArgs.DEFAULTPATH, memAddressSafe(value));
    }
    /** Unsafe version of {@link #parentWindow(NFDWindowHandle) parentWindow}. */
    public static void nparentWindow(long struct, NFDWindowHandle value) { memCopy(value.address(), struct + NFDOpenDialogArgs.PARENTWINDOW, NFDWindowHandle.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int filterCount = nfilterCount(struct);
        if (filterCount != 0) {
            long filterList = memGetAddress(struct + NFDOpenDialogArgs.FILTERLIST);
            check(filterList);
            validate(filterList, filterCount, NFDFilterItem.SIZEOF, NFDFilterItem::validate);
        }
    }

    // -----------------------------------

    /** An array of {@link NFDOpenDialogArgs} structs. */
    public static class Buffer extends StructBuffer<NFDOpenDialogArgs, Buffer> implements NativeResource {

        private static final NFDOpenDialogArgs ELEMENT_FACTORY = NFDOpenDialogArgs.create(-1L);

        /**
         * Creates a new {@code NFDOpenDialogArgs.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NFDOpenDialogArgs#SIZEOF}, and its mark will be undefined.</p>
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
        protected NFDOpenDialogArgs getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NFDFilterItem.Buffer} view of the struct array pointed to by the {@code filterList} field. */
        @NativeType("nfdfilteritem_t const *")
        public NFDFilterItem.@Nullable Buffer filterList() { return NFDOpenDialogArgs.nfilterList(address()); }
        /** @return the value of the {@code filterCount} field. */
        @NativeType("nfdfiltersize_t")
        public int filterCount() { return NFDOpenDialogArgs.nfilterCount(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code defaultPath} field. */
        @NativeType("nfdchar_t const *")
        public @Nullable ByteBuffer defaultPath() { return NFDOpenDialogArgs.ndefaultPath(address()); }
        /** @return the null-terminated string pointed to by the {@code defaultPath} field. */
        @NativeType("nfdchar_t const *")
        public @Nullable String defaultPathString() { return NFDOpenDialogArgs.ndefaultPathString(address()); }
        /** @return a {@link NFDWindowHandle} view of the {@code parentWindow} field. */
        @NativeType("nfdwindowhandle_t")
        public NFDWindowHandle parentWindow() { return NFDOpenDialogArgs.nparentWindow(address()); }

        /** Sets the address of the specified {@link NFDFilterItem.Buffer} to the {@code filterList} field. */
        public NFDOpenDialogArgs.Buffer filterList(@NativeType("nfdfilteritem_t const *") NFDFilterItem.@Nullable Buffer value) { NFDOpenDialogArgs.nfilterList(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code defaultPath} field. */
        public NFDOpenDialogArgs.Buffer defaultPath(@Nullable @NativeType("nfdchar_t const *") ByteBuffer value) { NFDOpenDialogArgs.ndefaultPath(address(), value); return this; }
        /** Copies the specified {@link NFDWindowHandle} to the {@code parentWindow} field. */
        public NFDOpenDialogArgs.Buffer parentWindow(@NativeType("nfdwindowhandle_t") NFDWindowHandle value) { NFDOpenDialogArgs.nparentWindow(address(), value); return this; }
        /** Passes the {@code parentWindow} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NFDOpenDialogArgs.Buffer parentWindow(java.util.function.Consumer<NFDWindowHandle> consumer) { consumer.accept(parentWindow()); return this; }

    }

}