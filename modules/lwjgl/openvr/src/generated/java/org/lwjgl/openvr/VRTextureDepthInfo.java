/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

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
 * struct VRTextureDepthInfo_t {
 *     void * handle;
 *     {@link HmdMatrix44 HmdMatrix44_t} mProjection;
 *     {@link HmdVector2 HmdVector2_t} vRange;
 * }</code></pre>
 */
@NativeType("struct VRTextureDepthInfo_t")
public class VRTextureDepthInfo extends Struct<VRTextureDepthInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HANDLE,
        MPROJECTION,
        VRANGE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(HmdMatrix44.SIZEOF, HmdMatrix44.ALIGNOF),
            __member(HmdVector2.SIZEOF, HmdVector2.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HANDLE = layout.offsetof(0);
        MPROJECTION = layout.offsetof(1);
        VRANGE = layout.offsetof(2);
    }

    protected VRTextureDepthInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VRTextureDepthInfo create(long address, @Nullable ByteBuffer container) {
        return new VRTextureDepthInfo(address, container);
    }

    /**
     * Creates a {@code VRTextureDepthInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRTextureDepthInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code handle} field. */
    @NativeType("void *")
    public long handle() { return nhandle(address()); }
    /** @return a {@link HmdMatrix44} view of the {@code mProjection} field. */
    @NativeType("HmdMatrix44_t")
    public HmdMatrix44 mProjection() { return nmProjection(address()); }
    /** @return a {@link HmdVector2} view of the {@code vRange} field. */
    @NativeType("HmdVector2_t")
    public HmdVector2 vRange() { return nvRange(address()); }

    /** Sets the specified value to the {@code handle} field. */
    public VRTextureDepthInfo handle(@NativeType("void *") long value) { nhandle(address(), value); return this; }
    /** Copies the specified {@link HmdMatrix44} to the {@code mProjection} field. */
    public VRTextureDepthInfo mProjection(@NativeType("HmdMatrix44_t") HmdMatrix44 value) { nmProjection(address(), value); return this; }
    /** Passes the {@code mProjection} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VRTextureDepthInfo mProjection(java.util.function.Consumer<HmdMatrix44> consumer) { consumer.accept(mProjection()); return this; }
    /** Copies the specified {@link HmdVector2} to the {@code vRange} field. */
    public VRTextureDepthInfo vRange(@NativeType("HmdVector2_t") HmdVector2 value) { nvRange(address(), value); return this; }
    /** Passes the {@code vRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VRTextureDepthInfo vRange(java.util.function.Consumer<HmdVector2> consumer) { consumer.accept(vRange()); return this; }

    /** Initializes this struct with the specified values. */
    public VRTextureDepthInfo set(
        long handle,
        HmdMatrix44 mProjection,
        HmdVector2 vRange
    ) {
        handle(handle);
        mProjection(mProjection);
        vRange(vRange);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VRTextureDepthInfo set(VRTextureDepthInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VRTextureDepthInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRTextureDepthInfo malloc() {
        return new VRTextureDepthInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VRTextureDepthInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRTextureDepthInfo calloc() {
        return new VRTextureDepthInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VRTextureDepthInfo} instance allocated with {@link BufferUtils}. */
    public static VRTextureDepthInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VRTextureDepthInfo(memAddress(container), container);
    }

    /** Returns a new {@code VRTextureDepthInfo} instance for the specified memory address. */
    public static VRTextureDepthInfo create(long address) {
        return new VRTextureDepthInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VRTextureDepthInfo createSafe(long address) {
        return address == NULL ? null : new VRTextureDepthInfo(address, null);
    }

    /**
     * Returns a new {@link VRTextureDepthInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureDepthInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VRTextureDepthInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureDepthInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureDepthInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureDepthInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VRTextureDepthInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VRTextureDepthInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VRTextureDepthInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VRTextureDepthInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VRTextureDepthInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VRTextureDepthInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VRTextureDepthInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VRTextureDepthInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VRTextureDepthInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VRTextureDepthInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VRTextureDepthInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VRTextureDepthInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRTextureDepthInfo malloc(MemoryStack stack) {
        return new VRTextureDepthInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VRTextureDepthInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRTextureDepthInfo calloc(MemoryStack stack) {
        return new VRTextureDepthInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VRTextureDepthInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRTextureDepthInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureDepthInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRTextureDepthInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetAddress(struct + VRTextureDepthInfo.HANDLE); }
    /** Unsafe version of {@link #mProjection}. */
    public static HmdMatrix44 nmProjection(long struct) { return HmdMatrix44.create(struct + VRTextureDepthInfo.MPROJECTION); }
    /** Unsafe version of {@link #vRange}. */
    public static HmdVector2 nvRange(long struct) { return HmdVector2.create(struct + VRTextureDepthInfo.VRANGE); }

    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutAddress(struct + VRTextureDepthInfo.HANDLE, check(value)); }
    /** Unsafe version of {@link #mProjection(HmdMatrix44) mProjection}. */
    public static void nmProjection(long struct, HmdMatrix44 value) { memCopy(value.address(), struct + VRTextureDepthInfo.MPROJECTION, HmdMatrix44.SIZEOF); }
    /** Unsafe version of {@link #vRange(HmdVector2) vRange}. */
    public static void nvRange(long struct, HmdVector2 value) { memCopy(value.address(), struct + VRTextureDepthInfo.VRANGE, HmdVector2.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VRTextureDepthInfo.HANDLE));
    }

    // -----------------------------------

    /** An array of {@link VRTextureDepthInfo} structs. */
    public static class Buffer extends StructBuffer<VRTextureDepthInfo, Buffer> implements NativeResource {

        private static final VRTextureDepthInfo ELEMENT_FACTORY = VRTextureDepthInfo.create(-1L);

        /**
         * Creates a new {@code VRTextureDepthInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRTextureDepthInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VRTextureDepthInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code handle} field. */
        @NativeType("void *")
        public long handle() { return VRTextureDepthInfo.nhandle(address()); }
        /** @return a {@link HmdMatrix44} view of the {@code mProjection} field. */
        @NativeType("HmdMatrix44_t")
        public HmdMatrix44 mProjection() { return VRTextureDepthInfo.nmProjection(address()); }
        /** @return a {@link HmdVector2} view of the {@code vRange} field. */
        @NativeType("HmdVector2_t")
        public HmdVector2 vRange() { return VRTextureDepthInfo.nvRange(address()); }

        /** Sets the specified value to the {@code handle} field. */
        public VRTextureDepthInfo.Buffer handle(@NativeType("void *") long value) { VRTextureDepthInfo.nhandle(address(), value); return this; }
        /** Copies the specified {@link HmdMatrix44} to the {@code mProjection} field. */
        public VRTextureDepthInfo.Buffer mProjection(@NativeType("HmdMatrix44_t") HmdMatrix44 value) { VRTextureDepthInfo.nmProjection(address(), value); return this; }
        /** Passes the {@code mProjection} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VRTextureDepthInfo.Buffer mProjection(java.util.function.Consumer<HmdMatrix44> consumer) { consumer.accept(mProjection()); return this; }
        /** Copies the specified {@link HmdVector2} to the {@code vRange} field. */
        public VRTextureDepthInfo.Buffer vRange(@NativeType("HmdVector2_t") HmdVector2 value) { VRTextureDepthInfo.nvRange(address(), value); return this; }
        /** Passes the {@code vRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VRTextureDepthInfo.Buffer vRange(java.util.function.Consumer<HmdVector2> consumer) { consumer.accept(vRange()); return this; }

    }

}