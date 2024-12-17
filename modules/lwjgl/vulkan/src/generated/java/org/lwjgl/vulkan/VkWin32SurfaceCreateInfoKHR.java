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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.system.windows.*;

/**
 * <pre>{@code
 * struct VkWin32SurfaceCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkWin32SurfaceCreateFlagsKHR flags;
 *     HINSTANCE hinstance;
 *     HWND hwnd;
 * }}</pre>
 */
public class VkWin32SurfaceCreateInfoKHR extends Struct<VkWin32SurfaceCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        HINSTANCE,
        HWND;

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
        HINSTANCE = layout.offsetof(3);
        HWND = layout.offsetof(4);
    }

    protected VkWin32SurfaceCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkWin32SurfaceCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkWin32SurfaceCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkWin32SurfaceCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkWin32SurfaceCreateInfoKHR(ByteBuffer container) {
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
    @NativeType("VkWin32SurfaceCreateFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code hinstance} field. */
    @NativeType("HINSTANCE")
    public long hinstance() { return nhinstance(address()); }
    /** @return the value of the {@code hwnd} field. */
    @NativeType("HWND")
    public long hwnd() { return nhwnd(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkWin32SurfaceCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRWin32Surface#VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkWin32SurfaceCreateInfoKHR sType$Default() { return sType(KHRWin32Surface.VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkWin32SurfaceCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkWin32SurfaceCreateInfoKHR flags(@NativeType("VkWin32SurfaceCreateFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code hinstance} field. */
    public VkWin32SurfaceCreateInfoKHR hinstance(@NativeType("HINSTANCE") long value) { nhinstance(address(), value); return this; }
    /** Sets the specified value to the {@code hwnd} field. */
    public VkWin32SurfaceCreateInfoKHR hwnd(@NativeType("HWND") long value) { nhwnd(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkWin32SurfaceCreateInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long hinstance,
        long hwnd
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        hinstance(hinstance);
        hwnd(hwnd);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkWin32SurfaceCreateInfoKHR set(VkWin32SurfaceCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkWin32SurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkWin32SurfaceCreateInfoKHR malloc() {
        return new VkWin32SurfaceCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkWin32SurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkWin32SurfaceCreateInfoKHR calloc() {
        return new VkWin32SurfaceCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkWin32SurfaceCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkWin32SurfaceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWin32SurfaceCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkWin32SurfaceCreateInfoKHR} instance for the specified memory address. */
    public static VkWin32SurfaceCreateInfoKHR create(long address) {
        return new VkWin32SurfaceCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkWin32SurfaceCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkWin32SurfaceCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkWin32SurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWin32SurfaceCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkWin32SurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWin32SurfaceCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWin32SurfaceCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkWin32SurfaceCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkWin32SurfaceCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkWin32SurfaceCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkWin32SurfaceCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkWin32SurfaceCreateInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkWin32SurfaceCreateInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkWin32SurfaceCreateInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkWin32SurfaceCreateInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWin32SurfaceCreateInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWin32SurfaceCreateInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWin32SurfaceCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWin32SurfaceCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkWin32SurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWin32SurfaceCreateInfoKHR malloc(MemoryStack stack) {
        return new VkWin32SurfaceCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkWin32SurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWin32SurfaceCreateInfoKHR calloc(MemoryStack stack) {
        return new VkWin32SurfaceCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkWin32SurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWin32SurfaceCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWin32SurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWin32SurfaceCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkWin32SurfaceCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkWin32SurfaceCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkWin32SurfaceCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #hinstance}. */
    public static long nhinstance(long struct) { return memGetAddress(struct + VkWin32SurfaceCreateInfoKHR.HINSTANCE); }
    /** Unsafe version of {@link #hwnd}. */
    public static long nhwnd(long struct) { return memGetAddress(struct + VkWin32SurfaceCreateInfoKHR.HWND); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkWin32SurfaceCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkWin32SurfaceCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkWin32SurfaceCreateInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #hinstance(long) hinstance}. */
    public static void nhinstance(long struct, long value) { memPutAddress(struct + VkWin32SurfaceCreateInfoKHR.HINSTANCE, check(value)); }
    /** Unsafe version of {@link #hwnd(long) hwnd}. */
    public static void nhwnd(long struct, long value) { memPutAddress(struct + VkWin32SurfaceCreateInfoKHR.HWND, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkWin32SurfaceCreateInfoKHR.HINSTANCE));
        check(memGetAddress(struct + VkWin32SurfaceCreateInfoKHR.HWND));
    }

    // -----------------------------------

    /** An array of {@link VkWin32SurfaceCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkWin32SurfaceCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkWin32SurfaceCreateInfoKHR ELEMENT_FACTORY = VkWin32SurfaceCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkWin32SurfaceCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkWin32SurfaceCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkWin32SurfaceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkWin32SurfaceCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkWin32SurfaceCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkWin32SurfaceCreateFlagsKHR")
        public int flags() { return VkWin32SurfaceCreateInfoKHR.nflags(address()); }
        /** @return the value of the {@code hinstance} field. */
        @NativeType("HINSTANCE")
        public long hinstance() { return VkWin32SurfaceCreateInfoKHR.nhinstance(address()); }
        /** @return the value of the {@code hwnd} field. */
        @NativeType("HWND")
        public long hwnd() { return VkWin32SurfaceCreateInfoKHR.nhwnd(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkWin32SurfaceCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkWin32SurfaceCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRWin32Surface#VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkWin32SurfaceCreateInfoKHR.Buffer sType$Default() { return sType(KHRWin32Surface.VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkWin32SurfaceCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkWin32SurfaceCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkWin32SurfaceCreateInfoKHR.Buffer flags(@NativeType("VkWin32SurfaceCreateFlagsKHR") int value) { VkWin32SurfaceCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code hinstance} field. */
        public VkWin32SurfaceCreateInfoKHR.Buffer hinstance(@NativeType("HINSTANCE") long value) { VkWin32SurfaceCreateInfoKHR.nhinstance(address(), value); return this; }
        /** Sets the specified value to the {@code hwnd} field. */
        public VkWin32SurfaceCreateInfoKHR.Buffer hwnd(@NativeType("HWND") long value) { VkWin32SurfaceCreateInfoKHR.nhwnd(address(), value); return this; }

    }

}