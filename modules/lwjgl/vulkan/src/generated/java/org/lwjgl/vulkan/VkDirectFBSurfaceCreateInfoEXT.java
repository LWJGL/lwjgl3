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
 * struct VkDirectFBSurfaceCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDirectFBSurfaceCreateFlagsEXT flags;
 *     IDirectFB * dfb;
 *     IDirectFBSurface * surface;
 * }}</pre>
 */
public class VkDirectFBSurfaceCreateInfoEXT extends Struct<VkDirectFBSurfaceCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DFB,
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
        DFB = layout.offsetof(3);
        SURFACE = layout.offsetof(4);
    }

    protected VkDirectFBSurfaceCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDirectFBSurfaceCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDirectFBSurfaceCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkDirectFBSurfaceCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDirectFBSurfaceCreateInfoEXT(ByteBuffer container) {
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
    @NativeType("VkDirectFBSurfaceCreateFlagsEXT")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code dfb} field. */
    @NativeType("IDirectFB *")
    public long dfb() { return ndfb(address()); }
    /** @return the value of the {@code surface} field. */
    @NativeType("IDirectFBSurface *")
    public long surface() { return nsurface(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDirectFBSurfaceCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDirectfbSurface#VK_STRUCTURE_TYPE_DIRECTFB_SURFACE_CREATE_INFO_EXT STRUCTURE_TYPE_DIRECTFB_SURFACE_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkDirectFBSurfaceCreateInfoEXT sType$Default() { return sType(EXTDirectfbSurface.VK_STRUCTURE_TYPE_DIRECTFB_SURFACE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDirectFBSurfaceCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkDirectFBSurfaceCreateInfoEXT flags(@NativeType("VkDirectFBSurfaceCreateFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code dfb} field. */
    public VkDirectFBSurfaceCreateInfoEXT dfb(@NativeType("IDirectFB *") long value) { ndfb(address(), value); return this; }
    /** Sets the specified value to the {@code surface} field. */
    public VkDirectFBSurfaceCreateInfoEXT surface(@NativeType("IDirectFBSurface *") long value) { nsurface(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDirectFBSurfaceCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        long dfb,
        long surface
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        dfb(dfb);
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
    public VkDirectFBSurfaceCreateInfoEXT set(VkDirectFBSurfaceCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDirectFBSurfaceCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDirectFBSurfaceCreateInfoEXT malloc() {
        return new VkDirectFBSurfaceCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDirectFBSurfaceCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDirectFBSurfaceCreateInfoEXT calloc() {
        return new VkDirectFBSurfaceCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDirectFBSurfaceCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDirectFBSurfaceCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDirectFBSurfaceCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDirectFBSurfaceCreateInfoEXT} instance for the specified memory address. */
    public static VkDirectFBSurfaceCreateInfoEXT create(long address) {
        return new VkDirectFBSurfaceCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDirectFBSurfaceCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkDirectFBSurfaceCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDirectFBSurfaceCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDirectFBSurfaceCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDirectFBSurfaceCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDirectFBSurfaceCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDirectFBSurfaceCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDirectFBSurfaceCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDirectFBSurfaceCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDirectFBSurfaceCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDirectFBSurfaceCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDirectFBSurfaceCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDirectFBSurfaceCreateInfoEXT malloc(MemoryStack stack) {
        return new VkDirectFBSurfaceCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDirectFBSurfaceCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDirectFBSurfaceCreateInfoEXT calloc(MemoryStack stack) {
        return new VkDirectFBSurfaceCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDirectFBSurfaceCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDirectFBSurfaceCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDirectFBSurfaceCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDirectFBSurfaceCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDirectFBSurfaceCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDirectFBSurfaceCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkDirectFBSurfaceCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #dfb}. */
    public static long ndfb(long struct) { return memGetAddress(struct + VkDirectFBSurfaceCreateInfoEXT.DFB); }
    /** Unsafe version of {@link #surface}. */
    public static long nsurface(long struct) { return memGetAddress(struct + VkDirectFBSurfaceCreateInfoEXT.SURFACE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDirectFBSurfaceCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDirectFBSurfaceCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkDirectFBSurfaceCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #dfb(long) dfb}. */
    public static void ndfb(long struct, long value) { memPutAddress(struct + VkDirectFBSurfaceCreateInfoEXT.DFB, value); }
    /** Unsafe version of {@link #surface(long) surface}. */
    public static void nsurface(long struct, long value) { memPutAddress(struct + VkDirectFBSurfaceCreateInfoEXT.SURFACE, value); }

    // -----------------------------------

    /** An array of {@link VkDirectFBSurfaceCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDirectFBSurfaceCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkDirectFBSurfaceCreateInfoEXT ELEMENT_FACTORY = VkDirectFBSurfaceCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDirectFBSurfaceCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDirectFBSurfaceCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDirectFBSurfaceCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDirectFBSurfaceCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDirectFBSurfaceCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkDirectFBSurfaceCreateFlagsEXT")
        public int flags() { return VkDirectFBSurfaceCreateInfoEXT.nflags(address()); }
        /** @return the value of the {@code dfb} field. */
        @NativeType("IDirectFB *")
        public long dfb() { return VkDirectFBSurfaceCreateInfoEXT.ndfb(address()); }
        /** @return the value of the {@code surface} field. */
        @NativeType("IDirectFBSurface *")
        public long surface() { return VkDirectFBSurfaceCreateInfoEXT.nsurface(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDirectFBSurfaceCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDirectFBSurfaceCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDirectfbSurface#VK_STRUCTURE_TYPE_DIRECTFB_SURFACE_CREATE_INFO_EXT STRUCTURE_TYPE_DIRECTFB_SURFACE_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkDirectFBSurfaceCreateInfoEXT.Buffer sType$Default() { return sType(EXTDirectfbSurface.VK_STRUCTURE_TYPE_DIRECTFB_SURFACE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDirectFBSurfaceCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDirectFBSurfaceCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkDirectFBSurfaceCreateInfoEXT.Buffer flags(@NativeType("VkDirectFBSurfaceCreateFlagsEXT") int value) { VkDirectFBSurfaceCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code dfb} field. */
        public VkDirectFBSurfaceCreateInfoEXT.Buffer dfb(@NativeType("IDirectFB *") long value) { VkDirectFBSurfaceCreateInfoEXT.ndfb(address(), value); return this; }
        /** Sets the specified value to the {@code surface} field. */
        public VkDirectFBSurfaceCreateInfoEXT.Buffer surface(@NativeType("IDirectFBSurface *") long value) { VkDirectFBSurfaceCreateInfoEXT.nsurface(address(), value); return this; }

    }

}