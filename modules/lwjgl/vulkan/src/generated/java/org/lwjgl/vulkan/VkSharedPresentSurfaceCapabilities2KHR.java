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
 * struct VkSharedPresentSurfaceCapabilities2KHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkImageUsageFlags2KHR sharedPresentSupportedUsageFlags;
 * }}</pre>
 */
public class VkSharedPresentSurfaceCapabilities2KHR extends Struct<VkSharedPresentSurfaceCapabilities2KHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHAREDPRESENTSUPPORTEDUSAGEFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHAREDPRESENTSUPPORTEDUSAGEFLAGS = layout.offsetof(2);
    }

    protected VkSharedPresentSurfaceCapabilities2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSharedPresentSurfaceCapabilities2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkSharedPresentSurfaceCapabilities2KHR(address, container);
    }

    /**
     * Creates a {@code VkSharedPresentSurfaceCapabilities2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSharedPresentSurfaceCapabilities2KHR(ByteBuffer container) {
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
    /** @return the value of the {@code sharedPresentSupportedUsageFlags} field. */
    @NativeType("VkImageUsageFlags2KHR")
    public long sharedPresentSupportedUsageFlags() { return nsharedPresentSupportedUsageFlags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSharedPresentSurfaceCapabilities2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRExtendedFlags#VK_STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_2_KHR STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_2_KHR} value to the {@code sType} field. */
    public VkSharedPresentSurfaceCapabilities2KHR sType$Default() { return sType(KHRExtendedFlags.VK_STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_2_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSharedPresentSurfaceCapabilities2KHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSharedPresentSurfaceCapabilities2KHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSharedPresentSurfaceCapabilities2KHR set(VkSharedPresentSurfaceCapabilities2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSharedPresentSurfaceCapabilities2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSharedPresentSurfaceCapabilities2KHR malloc() {
        return new VkSharedPresentSurfaceCapabilities2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSharedPresentSurfaceCapabilities2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSharedPresentSurfaceCapabilities2KHR calloc() {
        return new VkSharedPresentSurfaceCapabilities2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSharedPresentSurfaceCapabilities2KHR} instance allocated with {@link BufferUtils}. */
    public static VkSharedPresentSurfaceCapabilities2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSharedPresentSurfaceCapabilities2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSharedPresentSurfaceCapabilities2KHR} instance for the specified memory address. */
    public static VkSharedPresentSurfaceCapabilities2KHR create(long address) {
        return new VkSharedPresentSurfaceCapabilities2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSharedPresentSurfaceCapabilities2KHR createSafe(long address) {
        return address == NULL ? null : new VkSharedPresentSurfaceCapabilities2KHR(address, null);
    }

    /**
     * Returns a new {@link VkSharedPresentSurfaceCapabilities2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSharedPresentSurfaceCapabilities2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSharedPresentSurfaceCapabilities2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSharedPresentSurfaceCapabilities2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSharedPresentSurfaceCapabilities2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSharedPresentSurfaceCapabilities2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSharedPresentSurfaceCapabilities2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSharedPresentSurfaceCapabilities2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSharedPresentSurfaceCapabilities2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSharedPresentSurfaceCapabilities2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSharedPresentSurfaceCapabilities2KHR malloc(MemoryStack stack) {
        return new VkSharedPresentSurfaceCapabilities2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSharedPresentSurfaceCapabilities2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSharedPresentSurfaceCapabilities2KHR calloc(MemoryStack stack) {
        return new VkSharedPresentSurfaceCapabilities2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSharedPresentSurfaceCapabilities2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSharedPresentSurfaceCapabilities2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSharedPresentSurfaceCapabilities2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSharedPresentSurfaceCapabilities2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSharedPresentSurfaceCapabilities2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSharedPresentSurfaceCapabilities2KHR.PNEXT); }
    /** Unsafe version of {@link #sharedPresentSupportedUsageFlags}. */
    public static long nsharedPresentSupportedUsageFlags(long struct) { return memGetLong(struct + VkSharedPresentSurfaceCapabilities2KHR.SHAREDPRESENTSUPPORTEDUSAGEFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSharedPresentSurfaceCapabilities2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSharedPresentSurfaceCapabilities2KHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSharedPresentSurfaceCapabilities2KHR} structs. */
    public static class Buffer extends StructBuffer<VkSharedPresentSurfaceCapabilities2KHR, Buffer> implements NativeResource {

        private static final VkSharedPresentSurfaceCapabilities2KHR ELEMENT_FACTORY = VkSharedPresentSurfaceCapabilities2KHR.create(-1L);

        /**
         * Creates a new {@code VkSharedPresentSurfaceCapabilities2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSharedPresentSurfaceCapabilities2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSharedPresentSurfaceCapabilities2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSharedPresentSurfaceCapabilities2KHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSharedPresentSurfaceCapabilities2KHR.npNext(address()); }
        /** @return the value of the {@code sharedPresentSupportedUsageFlags} field. */
        @NativeType("VkImageUsageFlags2KHR")
        public long sharedPresentSupportedUsageFlags() { return VkSharedPresentSurfaceCapabilities2KHR.nsharedPresentSupportedUsageFlags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSharedPresentSurfaceCapabilities2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSharedPresentSurfaceCapabilities2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRExtendedFlags#VK_STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_2_KHR STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_2_KHR} value to the {@code sType} field. */
        public VkSharedPresentSurfaceCapabilities2KHR.Buffer sType$Default() { return sType(KHRExtendedFlags.VK_STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_2_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSharedPresentSurfaceCapabilities2KHR.Buffer pNext(@NativeType("void *") long value) { VkSharedPresentSurfaceCapabilities2KHR.npNext(address(), value); return this; }

    }

}