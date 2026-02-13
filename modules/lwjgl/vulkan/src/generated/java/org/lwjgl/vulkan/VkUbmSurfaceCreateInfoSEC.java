/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkUbmSurfaceCreateInfoSEC {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkUbmSurfaceCreateFlagsSEC flags;
 *     ubm_device * ubm_device;
 *     ubm_surface * ubm_surface;
 * }}</pre>
 */
public class VkUbmSurfaceCreateInfoSEC extends Struct<VkUbmSurfaceCreateInfoSEC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        UBM_DEVICE,
        UBM_SURFACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        UBM_DEVICE = layout.offsetof(3);
        UBM_SURFACE = layout.offsetof(4);
    }

    protected VkUbmSurfaceCreateInfoSEC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkUbmSurfaceCreateInfoSEC create(long address, @Nullable ByteBuffer container) {
        return new VkUbmSurfaceCreateInfoSEC(address, container);
    }

    /**
     * Creates a {@code VkUbmSurfaceCreateInfoSEC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkUbmSurfaceCreateInfoSEC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkUbmSurfaceCreateFlagsSEC")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code ubm_device} field. */
    @NativeType("ubm_device *")
    public long ubm_device() { return nubm_device(address()); }
    /** @return the value of the {@code ubm_surface} field. */
    @NativeType("ubm_surface *")
    public long ubm_surface() { return nubm_surface(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkUbmSurfaceCreateInfoSEC sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link SECUbmSurface#VK_STRUCTURE_TYPE_UBM_SURFACE_CREATE_INFO_SEC STRUCTURE_TYPE_UBM_SURFACE_CREATE_INFO_SEC} value to the {@code sType} field. */
    public VkUbmSurfaceCreateInfoSEC sType$Default() { return sType(SECUbmSurface.VK_STRUCTURE_TYPE_UBM_SURFACE_CREATE_INFO_SEC); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkUbmSurfaceCreateInfoSEC pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkUbmSurfaceCreateInfoSEC flags(@NativeType("VkUbmSurfaceCreateFlagsSEC") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code ubm_device} field. */
    public VkUbmSurfaceCreateInfoSEC ubm_device(@NativeType("ubm_device *") long value) { nubm_device(address(), value); return this; }
    /** Sets the specified value to the {@code ubm_surface} field. */
    public VkUbmSurfaceCreateInfoSEC ubm_surface(@NativeType("ubm_surface *") long value) { nubm_surface(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkUbmSurfaceCreateInfoSEC set(
        int sType,
        long pNext,
        int flags,
        long ubm_device,
        long ubm_surface
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        ubm_device(ubm_device);
        ubm_surface(ubm_surface);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkUbmSurfaceCreateInfoSEC set(VkUbmSurfaceCreateInfoSEC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkUbmSurfaceCreateInfoSEC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkUbmSurfaceCreateInfoSEC malloc() {
        return new VkUbmSurfaceCreateInfoSEC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkUbmSurfaceCreateInfoSEC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkUbmSurfaceCreateInfoSEC calloc() {
        return new VkUbmSurfaceCreateInfoSEC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkUbmSurfaceCreateInfoSEC} instance allocated with {@link BufferUtils}. */
    public static VkUbmSurfaceCreateInfoSEC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkUbmSurfaceCreateInfoSEC(memAddress(container), container);
    }

    /** Returns a new {@code VkUbmSurfaceCreateInfoSEC} instance for the specified memory address. */
    public static VkUbmSurfaceCreateInfoSEC create(long address) {
        return new VkUbmSurfaceCreateInfoSEC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkUbmSurfaceCreateInfoSEC createSafe(long address) {
        return address == NULL ? null : new VkUbmSurfaceCreateInfoSEC(address, null);
    }

    /**
     * Returns a new {@link VkUbmSurfaceCreateInfoSEC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkUbmSurfaceCreateInfoSEC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkUbmSurfaceCreateInfoSEC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkUbmSurfaceCreateInfoSEC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkUbmSurfaceCreateInfoSEC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkUbmSurfaceCreateInfoSEC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkUbmSurfaceCreateInfoSEC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkUbmSurfaceCreateInfoSEC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkUbmSurfaceCreateInfoSEC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkUbmSurfaceCreateInfoSEC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkUbmSurfaceCreateInfoSEC malloc(MemoryStack stack) {
        return new VkUbmSurfaceCreateInfoSEC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkUbmSurfaceCreateInfoSEC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkUbmSurfaceCreateInfoSEC calloc(MemoryStack stack) {
        return new VkUbmSurfaceCreateInfoSEC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkUbmSurfaceCreateInfoSEC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkUbmSurfaceCreateInfoSEC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkUbmSurfaceCreateInfoSEC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkUbmSurfaceCreateInfoSEC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkUbmSurfaceCreateInfoSEC.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkUbmSurfaceCreateInfoSEC.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkUbmSurfaceCreateInfoSEC.FLAGS); }
    /** Unsafe version of {@link #ubm_device}. */
    public static long nubm_device(long struct) { return memGetAddress(struct + VkUbmSurfaceCreateInfoSEC.UBM_DEVICE); }
    /** Unsafe version of {@link #ubm_surface}. */
    public static long nubm_surface(long struct) { return memGetAddress(struct + VkUbmSurfaceCreateInfoSEC.UBM_SURFACE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkUbmSurfaceCreateInfoSEC.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkUbmSurfaceCreateInfoSEC.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkUbmSurfaceCreateInfoSEC.FLAGS, value); }
    /** Unsafe version of {@link #ubm_device(long) ubm_device}. */
    public static void nubm_device(long struct, long value) { memPutAddress(struct + VkUbmSurfaceCreateInfoSEC.UBM_DEVICE, value); }
    /** Unsafe version of {@link #ubm_surface(long) ubm_surface}. */
    public static void nubm_surface(long struct, long value) { memPutAddress(struct + VkUbmSurfaceCreateInfoSEC.UBM_SURFACE, value); }

    // -----------------------------------

    /** An array of {@link VkUbmSurfaceCreateInfoSEC} structs. */
    public static class Buffer extends StructBuffer<VkUbmSurfaceCreateInfoSEC, Buffer> implements NativeResource {

        private static final VkUbmSurfaceCreateInfoSEC ELEMENT_FACTORY = VkUbmSurfaceCreateInfoSEC.create(-1L);

        /**
         * Creates a new {@code VkUbmSurfaceCreateInfoSEC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkUbmSurfaceCreateInfoSEC#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkUbmSurfaceCreateInfoSEC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkUbmSurfaceCreateInfoSEC.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkUbmSurfaceCreateInfoSEC.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkUbmSurfaceCreateFlagsSEC")
        public int flags() { return VkUbmSurfaceCreateInfoSEC.nflags(address()); }
        /** @return the value of the {@code ubm_device} field. */
        @NativeType("ubm_device *")
        public long ubm_device() { return VkUbmSurfaceCreateInfoSEC.nubm_device(address()); }
        /** @return the value of the {@code ubm_surface} field. */
        @NativeType("ubm_surface *")
        public long ubm_surface() { return VkUbmSurfaceCreateInfoSEC.nubm_surface(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkUbmSurfaceCreateInfoSEC.Buffer sType(@NativeType("VkStructureType") int value) { VkUbmSurfaceCreateInfoSEC.nsType(address(), value); return this; }
        /** Sets the {@link SECUbmSurface#VK_STRUCTURE_TYPE_UBM_SURFACE_CREATE_INFO_SEC STRUCTURE_TYPE_UBM_SURFACE_CREATE_INFO_SEC} value to the {@code sType} field. */
        public VkUbmSurfaceCreateInfoSEC.Buffer sType$Default() { return sType(SECUbmSurface.VK_STRUCTURE_TYPE_UBM_SURFACE_CREATE_INFO_SEC); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkUbmSurfaceCreateInfoSEC.Buffer pNext(@NativeType("void const *") long value) { VkUbmSurfaceCreateInfoSEC.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkUbmSurfaceCreateInfoSEC.Buffer flags(@NativeType("VkUbmSurfaceCreateFlagsSEC") int value) { VkUbmSurfaceCreateInfoSEC.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code ubm_device} field. */
        public VkUbmSurfaceCreateInfoSEC.Buffer ubm_device(@NativeType("ubm_device *") long value) { VkUbmSurfaceCreateInfoSEC.nubm_device(address(), value); return this; }
        /** Sets the specified value to the {@code ubm_surface} field. */
        public VkUbmSurfaceCreateInfoSEC.Buffer ubm_surface(@NativeType("ubm_surface *") long value) { VkUbmSurfaceCreateInfoSEC.nubm_surface(address(), value); return this; }

    }

}