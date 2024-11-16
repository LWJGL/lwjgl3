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
 * struct VRTextureWithDepth_t {
 *     void * handle;
 *     ETextureType eType;
 *     EColorSpace eColorSpace;
 *     {@link VRTextureDepthInfo VRTextureDepthInfo_t} depth;
 * }</code></pre>
 */
@NativeType("struct VRTextureWithDepth_t")
public class VRTextureWithDepth extends Struct<VRTextureWithDepth> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HANDLE,
        ETYPE,
        ECOLORSPACE,
        DEPTH;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(VRTextureDepthInfo.SIZEOF, VRTextureDepthInfo.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HANDLE = layout.offsetof(0);
        ETYPE = layout.offsetof(1);
        ECOLORSPACE = layout.offsetof(2);
        DEPTH = layout.offsetof(3);
    }

    protected VRTextureWithDepth(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VRTextureWithDepth create(long address, @Nullable ByteBuffer container) {
        return new VRTextureWithDepth(address, container);
    }

    /**
     * Creates a {@code VRTextureWithDepth} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRTextureWithDepth(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code handle} field. */
    @NativeType("void *")
    public long handle() { return nhandle(address()); }
    /** @return the value of the {@code eType} field. */
    @NativeType("ETextureType")
    public int eType() { return neType(address()); }
    /** @return the value of the {@code eColorSpace} field. */
    @NativeType("EColorSpace")
    public int eColorSpace() { return neColorSpace(address()); }
    /** @return a {@link VRTextureDepthInfo} view of the {@code depth} field. */
    @NativeType("VRTextureDepthInfo_t")
    public VRTextureDepthInfo depth() { return ndepth(address()); }

    /** Sets the specified value to the {@code handle} field. */
    public VRTextureWithDepth handle(@NativeType("void *") long value) { nhandle(address(), value); return this; }
    /** Sets the specified value to the {@code eType} field. */
    public VRTextureWithDepth eType(@NativeType("ETextureType") int value) { neType(address(), value); return this; }
    /** Sets the specified value to the {@code eColorSpace} field. */
    public VRTextureWithDepth eColorSpace(@NativeType("EColorSpace") int value) { neColorSpace(address(), value); return this; }
    /** Copies the specified {@link VRTextureDepthInfo} to the {@code depth} field. */
    public VRTextureWithDepth depth(@NativeType("VRTextureDepthInfo_t") VRTextureDepthInfo value) { ndepth(address(), value); return this; }
    /** Passes the {@code depth} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VRTextureWithDepth depth(java.util.function.Consumer<VRTextureDepthInfo> consumer) { consumer.accept(depth()); return this; }

    /** Initializes this struct with the specified values. */
    public VRTextureWithDepth set(
        long handle,
        int eType,
        int eColorSpace,
        VRTextureDepthInfo depth
    ) {
        handle(handle);
        eType(eType);
        eColorSpace(eColorSpace);
        depth(depth);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VRTextureWithDepth set(VRTextureWithDepth src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VRTextureWithDepth} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRTextureWithDepth malloc() {
        return new VRTextureWithDepth(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VRTextureWithDepth} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRTextureWithDepth calloc() {
        return new VRTextureWithDepth(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VRTextureWithDepth} instance allocated with {@link BufferUtils}. */
    public static VRTextureWithDepth create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VRTextureWithDepth(memAddress(container), container);
    }

    /** Returns a new {@code VRTextureWithDepth} instance for the specified memory address. */
    public static VRTextureWithDepth create(long address) {
        return new VRTextureWithDepth(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VRTextureWithDepth createSafe(long address) {
        return address == NULL ? null : new VRTextureWithDepth(address, null);
    }

    /**
     * Returns a new {@link VRTextureWithDepth.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithDepth.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithDepth.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithDepth.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithDepth.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithDepth.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VRTextureWithDepth.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VRTextureWithDepth.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VRTextureWithDepth.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VRTextureWithDepth mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VRTextureWithDepth callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VRTextureWithDepth mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VRTextureWithDepth callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VRTextureWithDepth.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VRTextureWithDepth.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VRTextureWithDepth.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VRTextureWithDepth.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VRTextureWithDepth} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRTextureWithDepth malloc(MemoryStack stack) {
        return new VRTextureWithDepth(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VRTextureWithDepth} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRTextureWithDepth calloc(MemoryStack stack) {
        return new VRTextureWithDepth(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VRTextureWithDepth.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRTextureWithDepth.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithDepth.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRTextureWithDepth.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetAddress(struct + VRTextureWithDepth.HANDLE); }
    /** Unsafe version of {@link #eType}. */
    public static int neType(long struct) { return memGetInt(struct + VRTextureWithDepth.ETYPE); }
    /** Unsafe version of {@link #eColorSpace}. */
    public static int neColorSpace(long struct) { return memGetInt(struct + VRTextureWithDepth.ECOLORSPACE); }
    /** Unsafe version of {@link #depth}. */
    public static VRTextureDepthInfo ndepth(long struct) { return VRTextureDepthInfo.create(struct + VRTextureWithDepth.DEPTH); }

    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutAddress(struct + VRTextureWithDepth.HANDLE, check(value)); }
    /** Unsafe version of {@link #eType(int) eType}. */
    public static void neType(long struct, int value) { memPutInt(struct + VRTextureWithDepth.ETYPE, value); }
    /** Unsafe version of {@link #eColorSpace(int) eColorSpace}. */
    public static void neColorSpace(long struct, int value) { memPutInt(struct + VRTextureWithDepth.ECOLORSPACE, value); }
    /** Unsafe version of {@link #depth(VRTextureDepthInfo) depth}. */
    public static void ndepth(long struct, VRTextureDepthInfo value) { memCopy(value.address(), struct + VRTextureWithDepth.DEPTH, VRTextureDepthInfo.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VRTextureWithDepth.HANDLE));
        VRTextureDepthInfo.validate(struct + VRTextureWithDepth.DEPTH);
    }

    // -----------------------------------

    /** An array of {@link VRTextureWithDepth} structs. */
    public static class Buffer extends StructBuffer<VRTextureWithDepth, Buffer> implements NativeResource {

        private static final VRTextureWithDepth ELEMENT_FACTORY = VRTextureWithDepth.create(-1L);

        /**
         * Creates a new {@code VRTextureWithDepth.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRTextureWithDepth#SIZEOF}, and its mark will be undefined.</p>
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
        protected VRTextureWithDepth getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code handle} field. */
        @NativeType("void *")
        public long handle() { return VRTextureWithDepth.nhandle(address()); }
        /** @return the value of the {@code eType} field. */
        @NativeType("ETextureType")
        public int eType() { return VRTextureWithDepth.neType(address()); }
        /** @return the value of the {@code eColorSpace} field. */
        @NativeType("EColorSpace")
        public int eColorSpace() { return VRTextureWithDepth.neColorSpace(address()); }
        /** @return a {@link VRTextureDepthInfo} view of the {@code depth} field. */
        @NativeType("VRTextureDepthInfo_t")
        public VRTextureDepthInfo depth() { return VRTextureWithDepth.ndepth(address()); }

        /** Sets the specified value to the {@code handle} field. */
        public VRTextureWithDepth.Buffer handle(@NativeType("void *") long value) { VRTextureWithDepth.nhandle(address(), value); return this; }
        /** Sets the specified value to the {@code eType} field. */
        public VRTextureWithDepth.Buffer eType(@NativeType("ETextureType") int value) { VRTextureWithDepth.neType(address(), value); return this; }
        /** Sets the specified value to the {@code eColorSpace} field. */
        public VRTextureWithDepth.Buffer eColorSpace(@NativeType("EColorSpace") int value) { VRTextureWithDepth.neColorSpace(address(), value); return this; }
        /** Copies the specified {@link VRTextureDepthInfo} to the {@code depth} field. */
        public VRTextureWithDepth.Buffer depth(@NativeType("VRTextureDepthInfo_t") VRTextureDepthInfo value) { VRTextureWithDepth.ndepth(address(), value); return this; }
        /** Passes the {@code depth} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VRTextureWithDepth.Buffer depth(java.util.function.Consumer<VRTextureDepthInfo> consumer) { consumer.accept(depth()); return this; }

    }

}