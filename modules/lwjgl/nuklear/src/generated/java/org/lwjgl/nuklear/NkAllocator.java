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
 * struct nk_allocator {
 *     {@link NkHandle nk_handle} userdata;
 *     {@link NkPluginAllocI nk_plugin_alloc} alloc;
 *     {@link NkPluginFreeI nk_plugin_free} mfree;
 * }</code></pre>
 */
@NativeType("struct nk_allocator")
public class NkAllocator extends Struct<NkAllocator> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        USERDATA,
        ALLOC,
        MFREE;

    static {
        Layout layout = __struct(
            __member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        USERDATA = layout.offsetof(0);
        ALLOC = layout.offsetof(1);
        MFREE = layout.offsetof(2);
    }

    protected NkAllocator(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkAllocator create(long address, @Nullable ByteBuffer container) {
        return new NkAllocator(address, container);
    }

    /**
     * Creates a {@code NkAllocator} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkAllocator(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link NkHandle} view of the {@code userdata} field. */
    @NativeType("nk_handle")
    public NkHandle userdata() { return nuserdata(address()); }
    /** @return the value of the {@code alloc} field. */
    @NativeType("nk_plugin_alloc")
    public @Nullable NkPluginAlloc alloc() { return nalloc(address()); }
    /** @return the value of the {@code mfree} field. */
    @NativeType("nk_plugin_free")
    public @Nullable NkPluginFree mfree() { return nmfree(address()); }

    /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
    public NkAllocator userdata(@NativeType("nk_handle") NkHandle value) { nuserdata(address(), value); return this; }
    /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkAllocator userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
    /** Sets the specified value to the {@code alloc} field. */
    public NkAllocator alloc(@Nullable @NativeType("nk_plugin_alloc") NkPluginAllocI value) { nalloc(address(), value); return this; }
    /** Sets the specified value to the {@code mfree} field. */
    public NkAllocator mfree(@Nullable @NativeType("nk_plugin_free") NkPluginFreeI value) { nmfree(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkAllocator set(
        NkHandle userdata,
        NkPluginAllocI alloc,
        NkPluginFreeI mfree
    ) {
        userdata(userdata);
        alloc(alloc);
        mfree(mfree);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkAllocator set(NkAllocator src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkAllocator} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkAllocator malloc() {
        return new NkAllocator(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkAllocator} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkAllocator calloc() {
        return new NkAllocator(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkAllocator} instance allocated with {@link BufferUtils}. */
    public static NkAllocator create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkAllocator(memAddress(container), container);
    }

    /** Returns a new {@code NkAllocator} instance for the specified memory address. */
    public static NkAllocator create(long address) {
        return new NkAllocator(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkAllocator createSafe(long address) {
        return address == NULL ? null : new NkAllocator(address, null);
    }

    /**
     * Returns a new {@link NkAllocator.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkAllocator.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkAllocator.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkAllocator.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkAllocator.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkAllocator.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkAllocator.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkAllocator.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkAllocator.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkAllocator mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkAllocator callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkAllocator mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkAllocator callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkAllocator.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkAllocator.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkAllocator.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkAllocator.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NkAllocator} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkAllocator malloc(MemoryStack stack) {
        return new NkAllocator(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkAllocator} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkAllocator calloc(MemoryStack stack) {
        return new NkAllocator(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkAllocator.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkAllocator.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkAllocator.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkAllocator.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #userdata}. */
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkAllocator.USERDATA); }
    /** Unsafe version of {@link #alloc}. */
    public static @Nullable NkPluginAlloc nalloc(long struct) { return NkPluginAlloc.createSafe(memGetAddress(struct + NkAllocator.ALLOC)); }
    /** Unsafe version of {@link #mfree}. */
    public static @Nullable NkPluginFree nmfree(long struct) { return NkPluginFree.createSafe(memGetAddress(struct + NkAllocator.MFREE)); }

    /** Unsafe version of {@link #userdata(NkHandle) userdata}. */
    public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkAllocator.USERDATA, NkHandle.SIZEOF); }
    /** Unsafe version of {@link #alloc(NkPluginAllocI) alloc}. */
    public static void nalloc(long struct, @Nullable NkPluginAllocI value) { memPutAddress(struct + NkAllocator.ALLOC, memAddressSafe(value)); }
    /** Unsafe version of {@link #mfree(NkPluginFreeI) mfree}. */
    public static void nmfree(long struct, @Nullable NkPluginFreeI value) { memPutAddress(struct + NkAllocator.MFREE, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link NkAllocator} structs. */
    public static class Buffer extends StructBuffer<NkAllocator, Buffer> implements NativeResource {

        private static final NkAllocator ELEMENT_FACTORY = NkAllocator.create(-1L);

        /**
         * Creates a new {@code NkAllocator.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkAllocator#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkAllocator getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NkHandle} view of the {@code userdata} field. */
        @NativeType("nk_handle")
        public NkHandle userdata() { return NkAllocator.nuserdata(address()); }
        /** @return the value of the {@code alloc} field. */
        @NativeType("nk_plugin_alloc")
        public @Nullable NkPluginAlloc alloc() { return NkAllocator.nalloc(address()); }
        /** @return the value of the {@code mfree} field. */
        @NativeType("nk_plugin_free")
        public @Nullable NkPluginFree mfree() { return NkAllocator.nmfree(address()); }

        /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
        public NkAllocator.Buffer userdata(@NativeType("nk_handle") NkHandle value) { NkAllocator.nuserdata(address(), value); return this; }
        /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkAllocator.Buffer userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
        /** Sets the specified value to the {@code alloc} field. */
        public NkAllocator.Buffer alloc(@Nullable @NativeType("nk_plugin_alloc") NkPluginAllocI value) { NkAllocator.nalloc(address(), value); return this; }
        /** Sets the specified value to the {@code mfree} field. */
        public NkAllocator.Buffer mfree(@Nullable @NativeType("nk_plugin_free") NkPluginFreeI value) { NkAllocator.nmfree(address(), value); return this; }

    }

}