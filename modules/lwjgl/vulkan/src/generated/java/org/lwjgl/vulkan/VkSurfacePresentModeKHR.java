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
 * struct VkSurfacePresentModeKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkPresentModeKHR presentMode;
 * }}</pre>
 */
public class VkSurfacePresentModeKHR extends Struct<VkSurfacePresentModeKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTMODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTMODE = layout.offsetof(2);
    }

    protected VkSurfacePresentModeKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSurfacePresentModeKHR create(long address, @Nullable ByteBuffer container) {
        return new VkSurfacePresentModeKHR(address, container);
    }

    /**
     * Creates a {@code VkSurfacePresentModeKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfacePresentModeKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code presentMode} field. */
    @NativeType("VkPresentModeKHR")
    public int presentMode() { return npresentMode(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSurfacePresentModeKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_KHR STRUCTURE_TYPE_SURFACE_PRESENT_MODE_KHR} value to the {@code sType} field. */
    public VkSurfacePresentModeKHR sType$Default() { return sType(KHRSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSurfacePresentModeKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentMode} field. */
    public VkSurfacePresentModeKHR presentMode(@NativeType("VkPresentModeKHR") int value) { npresentMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSurfacePresentModeKHR set(
        int sType,
        long pNext,
        int presentMode
    ) {
        sType(sType);
        pNext(pNext);
        presentMode(presentMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSurfacePresentModeKHR set(VkSurfacePresentModeKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfacePresentModeKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentModeKHR malloc() {
        return new VkSurfacePresentModeKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentModeKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentModeKHR calloc() {
        return new VkSurfacePresentModeKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentModeKHR} instance allocated with {@link BufferUtils}. */
    public static VkSurfacePresentModeKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfacePresentModeKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSurfacePresentModeKHR} instance for the specified memory address. */
    public static VkSurfacePresentModeKHR create(long address) {
        return new VkSurfacePresentModeKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSurfacePresentModeKHR createSafe(long address) {
        return address == NULL ? null : new VkSurfacePresentModeKHR(address, null);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSurfacePresentModeKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSurfacePresentModeKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSurfacePresentModeKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentModeKHR malloc(MemoryStack stack) {
        return new VkSurfacePresentModeKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSurfacePresentModeKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentModeKHR calloc(MemoryStack stack) {
        return new VkSurfacePresentModeKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSurfacePresentModeKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfacePresentModeKHR.PNEXT); }
    /** Unsafe version of {@link #presentMode}. */
    public static int npresentMode(long struct) { return memGetInt(struct + VkSurfacePresentModeKHR.PRESENTMODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSurfacePresentModeKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSurfacePresentModeKHR.PNEXT, value); }
    /** Unsafe version of {@link #presentMode(int) presentMode}. */
    public static void npresentMode(long struct, int value) { memPutInt(struct + VkSurfacePresentModeKHR.PRESENTMODE, value); }

    // -----------------------------------

    /** An array of {@link VkSurfacePresentModeKHR} structs. */
    public static class Buffer extends StructBuffer<VkSurfacePresentModeKHR, Buffer> implements NativeResource {

        private static final VkSurfacePresentModeKHR ELEMENT_FACTORY = VkSurfacePresentModeKHR.create(-1L);

        /**
         * Creates a new {@code VkSurfacePresentModeKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfacePresentModeKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSurfacePresentModeKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSurfacePresentModeKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSurfacePresentModeKHR.npNext(address()); }
        /** @return the value of the {@code presentMode} field. */
        @NativeType("VkPresentModeKHR")
        public int presentMode() { return VkSurfacePresentModeKHR.npresentMode(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSurfacePresentModeKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfacePresentModeKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_KHR STRUCTURE_TYPE_SURFACE_PRESENT_MODE_KHR} value to the {@code sType} field. */
        public VkSurfacePresentModeKHR.Buffer sType$Default() { return sType(KHRSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSurfacePresentModeKHR.Buffer pNext(@NativeType("void *") long value) { VkSurfacePresentModeKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentMode} field. */
        public VkSurfacePresentModeKHR.Buffer presentMode(@NativeType("VkPresentModeKHR") int value) { VkSurfacePresentModeKHR.npresentMode(address(), value); return this; }

    }

}