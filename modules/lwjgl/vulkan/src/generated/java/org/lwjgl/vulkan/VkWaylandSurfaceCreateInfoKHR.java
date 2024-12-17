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

import org.lwjgl.system.linux.*;

/**
 * <pre>{@code
 * struct VkWaylandSurfaceCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkWaylandSurfaceCreateFlagsKHR flags;
 *     struct wl_display * display;
 *     struct wl_surface * surface;
 * }}</pre>
 */
public class VkWaylandSurfaceCreateInfoKHR extends Struct<VkWaylandSurfaceCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DISPLAY,
        SURFACE;

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
        DISPLAY = layout.offsetof(3);
        SURFACE = layout.offsetof(4);
    }

    protected VkWaylandSurfaceCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkWaylandSurfaceCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkWaylandSurfaceCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkWaylandSurfaceCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkWaylandSurfaceCreateInfoKHR(ByteBuffer container) {
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
    @NativeType("VkWaylandSurfaceCreateFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code display} field. */
    @NativeType("struct wl_display *")
    public long display() { return ndisplay(address()); }
    /** @return the value of the {@code surface} field. */
    @NativeType("struct wl_surface *")
    public long surface() { return nsurface(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkWaylandSurfaceCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRWaylandSurface#VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkWaylandSurfaceCreateInfoKHR sType$Default() { return sType(KHRWaylandSurface.VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkWaylandSurfaceCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkWaylandSurfaceCreateInfoKHR flags(@NativeType("VkWaylandSurfaceCreateFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code display} field. */
    public VkWaylandSurfaceCreateInfoKHR display(@NativeType("struct wl_display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code surface} field. */
    public VkWaylandSurfaceCreateInfoKHR surface(@NativeType("struct wl_surface *") long value) { nsurface(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkWaylandSurfaceCreateInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long display,
        long surface
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        display(display);
        surface(surface);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkWaylandSurfaceCreateInfoKHR set(VkWaylandSurfaceCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkWaylandSurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkWaylandSurfaceCreateInfoKHR malloc() {
        return new VkWaylandSurfaceCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkWaylandSurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkWaylandSurfaceCreateInfoKHR calloc() {
        return new VkWaylandSurfaceCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkWaylandSurfaceCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkWaylandSurfaceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWaylandSurfaceCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkWaylandSurfaceCreateInfoKHR} instance for the specified memory address. */
    public static VkWaylandSurfaceCreateInfoKHR create(long address) {
        return new VkWaylandSurfaceCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkWaylandSurfaceCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkWaylandSurfaceCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkWaylandSurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWaylandSurfaceCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkWaylandSurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWaylandSurfaceCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWaylandSurfaceCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkWaylandSurfaceCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkWaylandSurfaceCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkWaylandSurfaceCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkWaylandSurfaceCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkWaylandSurfaceCreateInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkWaylandSurfaceCreateInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkWaylandSurfaceCreateInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkWaylandSurfaceCreateInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWaylandSurfaceCreateInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWaylandSurfaceCreateInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWaylandSurfaceCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWaylandSurfaceCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkWaylandSurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWaylandSurfaceCreateInfoKHR malloc(MemoryStack stack) {
        return new VkWaylandSurfaceCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkWaylandSurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWaylandSurfaceCreateInfoKHR calloc(MemoryStack stack) {
        return new VkWaylandSurfaceCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkWaylandSurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWaylandSurfaceCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWaylandSurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWaylandSurfaceCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkWaylandSurfaceCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkWaylandSurfaceCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkWaylandSurfaceCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + VkWaylandSurfaceCreateInfoKHR.DISPLAY); }
    /** Unsafe version of {@link #surface}. */
    public static long nsurface(long struct) { return memGetAddress(struct + VkWaylandSurfaceCreateInfoKHR.SURFACE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkWaylandSurfaceCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkWaylandSurfaceCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkWaylandSurfaceCreateInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + VkWaylandSurfaceCreateInfoKHR.DISPLAY, value); }
    /** Unsafe version of {@link #surface(long) surface}. */
    public static void nsurface(long struct, long value) { memPutAddress(struct + VkWaylandSurfaceCreateInfoKHR.SURFACE, value); }

    // -----------------------------------

    /** An array of {@link VkWaylandSurfaceCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkWaylandSurfaceCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkWaylandSurfaceCreateInfoKHR ELEMENT_FACTORY = VkWaylandSurfaceCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkWaylandSurfaceCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkWaylandSurfaceCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkWaylandSurfaceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkWaylandSurfaceCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkWaylandSurfaceCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkWaylandSurfaceCreateFlagsKHR")
        public int flags() { return VkWaylandSurfaceCreateInfoKHR.nflags(address()); }
        /** @return the value of the {@code display} field. */
        @NativeType("struct wl_display *")
        public long display() { return VkWaylandSurfaceCreateInfoKHR.ndisplay(address()); }
        /** @return the value of the {@code surface} field. */
        @NativeType("struct wl_surface *")
        public long surface() { return VkWaylandSurfaceCreateInfoKHR.nsurface(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkWaylandSurfaceCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkWaylandSurfaceCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRWaylandSurface#VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkWaylandSurfaceCreateInfoKHR.Buffer sType$Default() { return sType(KHRWaylandSurface.VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkWaylandSurfaceCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkWaylandSurfaceCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkWaylandSurfaceCreateInfoKHR.Buffer flags(@NativeType("VkWaylandSurfaceCreateFlagsKHR") int value) { VkWaylandSurfaceCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code display} field. */
        public VkWaylandSurfaceCreateInfoKHR.Buffer display(@NativeType("struct wl_display *") long value) { VkWaylandSurfaceCreateInfoKHR.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code surface} field. */
        public VkWaylandSurfaceCreateInfoKHR.Buffer surface(@NativeType("struct wl_surface *") long value) { VkWaylandSurfaceCreateInfoKHR.nsurface(address(), value); return this; }

    }

}