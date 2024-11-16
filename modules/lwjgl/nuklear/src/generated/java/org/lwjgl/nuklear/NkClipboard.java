/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_clipboard {
 *     {@link NkHandle nk_handle} userdata;
 *     {@link NkPluginPasteI nk_plugin_paste} paste;
 *     {@link NkPluginCopyI nk_plugin_copy} copy;
 * }</code></pre>
 */
@NativeType("struct nk_clipboard")
public class NkClipboard extends Struct<NkClipboard> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        USERDATA,
        PASTE,
        COPY;

    static {
        Layout layout = __struct(
            __member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        USERDATA = layout.offsetof(0);
        PASTE = layout.offsetof(1);
        COPY = layout.offsetof(2);
    }

    protected NkClipboard(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkClipboard create(long address, @Nullable ByteBuffer container) {
        return new NkClipboard(address, container);
    }

    /**
     * Creates a {@code NkClipboard} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkClipboard(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link NkHandle} view of the {@code userdata} field. */
    @NativeType("nk_handle")
    public NkHandle userdata() { return nuserdata(address()); }
    /** @return the value of the {@code paste} field. */
    @NativeType("nk_plugin_paste")
    public @Nullable NkPluginPaste paste() { return npaste(address()); }
    /** @return the value of the {@code copy} field. */
    @NativeType("nk_plugin_copy")
    public @Nullable NkPluginCopy copy() { return ncopy(address()); }

    /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
    public NkClipboard userdata(@NativeType("nk_handle") NkHandle value) { nuserdata(address(), value); return this; }
    /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkClipboard userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
    /** Sets the specified value to the {@code paste} field. */
    public NkClipboard paste(@Nullable @NativeType("nk_plugin_paste") NkPluginPasteI value) { npaste(address(), value); return this; }
    /** Sets the specified value to the {@code copy} field. */
    public NkClipboard copy(@Nullable @NativeType("nk_plugin_copy") NkPluginCopyI value) { ncopy(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkClipboard set(
        NkHandle userdata,
        NkPluginPasteI paste,
        NkPluginCopyI copy
    ) {
        userdata(userdata);
        paste(paste);
        copy(copy);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkClipboard set(NkClipboard src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkClipboard} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkClipboard malloc() {
        return new NkClipboard(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkClipboard} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkClipboard calloc() {
        return new NkClipboard(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkClipboard} instance allocated with {@link BufferUtils}. */
    public static NkClipboard create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkClipboard(memAddress(container), container);
    }

    /** Returns a new {@code NkClipboard} instance for the specified memory address. */
    public static NkClipboard create(long address) {
        return new NkClipboard(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkClipboard createSafe(long address) {
        return address == NULL ? null : new NkClipboard(address, null);
    }

    /**
     * Returns a new {@link NkClipboard.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkClipboard.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkClipboard.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkClipboard.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkClipboard.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkClipboard.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkClipboard.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkClipboard.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkClipboard.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkClipboard mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkClipboard callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkClipboard mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkClipboard callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkClipboard.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkClipboard.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkClipboard.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkClipboard.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NkClipboard} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkClipboard malloc(MemoryStack stack) {
        return new NkClipboard(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkClipboard} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkClipboard calloc(MemoryStack stack) {
        return new NkClipboard(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkClipboard.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkClipboard.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkClipboard.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkClipboard.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #userdata}. */
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkClipboard.USERDATA); }
    /** Unsafe version of {@link #paste}. */
    public static @Nullable NkPluginPaste npaste(long struct) { return NkPluginPaste.createSafe(memGetAddress(struct + NkClipboard.PASTE)); }
    /** Unsafe version of {@link #copy}. */
    public static @Nullable NkPluginCopy ncopy(long struct) { return NkPluginCopy.createSafe(memGetAddress(struct + NkClipboard.COPY)); }

    /** Unsafe version of {@link #userdata(NkHandle) userdata}. */
    public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkClipboard.USERDATA, NkHandle.SIZEOF); }
    /** Unsafe version of {@link #paste(NkPluginPasteI) paste}. */
    public static void npaste(long struct, @Nullable NkPluginPasteI value) { memPutAddress(struct + NkClipboard.PASTE, memAddressSafe(value)); }
    /** Unsafe version of {@link #copy(NkPluginCopyI) copy}. */
    public static void ncopy(long struct, @Nullable NkPluginCopyI value) { memPutAddress(struct + NkClipboard.COPY, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link NkClipboard} structs. */
    public static class Buffer extends StructBuffer<NkClipboard, Buffer> implements NativeResource {

        private static final NkClipboard ELEMENT_FACTORY = NkClipboard.create(-1L);

        /**
         * Creates a new {@code NkClipboard.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkClipboard#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkClipboard getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NkHandle} view of the {@code userdata} field. */
        @NativeType("nk_handle")
        public NkHandle userdata() { return NkClipboard.nuserdata(address()); }
        /** @return the value of the {@code paste} field. */
        @NativeType("nk_plugin_paste")
        public @Nullable NkPluginPaste paste() { return NkClipboard.npaste(address()); }
        /** @return the value of the {@code copy} field. */
        @NativeType("nk_plugin_copy")
        public @Nullable NkPluginCopy copy() { return NkClipboard.ncopy(address()); }

        /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
        public NkClipboard.Buffer userdata(@NativeType("nk_handle") NkHandle value) { NkClipboard.nuserdata(address(), value); return this; }
        /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkClipboard.Buffer userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
        /** Sets the specified value to the {@code paste} field. */
        public NkClipboard.Buffer paste(@Nullable @NativeType("nk_plugin_paste") NkPluginPasteI value) { NkClipboard.npaste(address(), value); return this; }
        /** Sets the specified value to the {@code copy} field. */
        public NkClipboard.Buffer copy(@Nullable @NativeType("nk_plugin_copy") NkPluginCopyI value) { NkClipboard.ncopy(address(), value); return this; }

    }

}