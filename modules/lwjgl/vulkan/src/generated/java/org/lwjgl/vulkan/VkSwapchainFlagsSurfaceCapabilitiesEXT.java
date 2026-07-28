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
 * struct VkSwapchainFlagsSurfaceCapabilitiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkSwapchainCreateFlagsKHR swapchainSupportedFlags;
 * }}</pre>
 */
public class VkSwapchainFlagsSurfaceCapabilitiesEXT extends Struct<VkSwapchainFlagsSurfaceCapabilitiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAINSUPPORTEDFLAGS;

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
        SWAPCHAINSUPPORTEDFLAGS = layout.offsetof(2);
    }

    protected VkSwapchainFlagsSurfaceCapabilitiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSwapchainFlagsSurfaceCapabilitiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSwapchainFlagsSurfaceCapabilitiesEXT(address, container);
    }

    /**
     * Creates a {@code VkSwapchainFlagsSurfaceCapabilitiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainFlagsSurfaceCapabilitiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code swapchainSupportedFlags} field. */
    @NativeType("VkSwapchainCreateFlagsKHR")
    public int swapchainSupportedFlags() { return nswapchainSupportedFlags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSwapchainFlagsSurfaceCapabilitiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMultisampledRenderToSwapchain#VK_STRUCTURE_TYPE_SWAPCHAIN_FLAGS_SURFACE_CAPABILITIES_EXT STRUCTURE_TYPE_SWAPCHAIN_FLAGS_SURFACE_CAPABILITIES_EXT} value to the {@code sType} field. */
    public VkSwapchainFlagsSurfaceCapabilitiesEXT sType$Default() { return sType(EXTMultisampledRenderToSwapchain.VK_STRUCTURE_TYPE_SWAPCHAIN_FLAGS_SURFACE_CAPABILITIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSwapchainFlagsSurfaceCapabilitiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainFlagsSurfaceCapabilitiesEXT set(
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
    public VkSwapchainFlagsSurfaceCapabilitiesEXT set(VkSwapchainFlagsSurfaceCapabilitiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainFlagsSurfaceCapabilitiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainFlagsSurfaceCapabilitiesEXT malloc() {
        return new VkSwapchainFlagsSurfaceCapabilitiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainFlagsSurfaceCapabilitiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainFlagsSurfaceCapabilitiesEXT calloc() {
        return new VkSwapchainFlagsSurfaceCapabilitiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainFlagsSurfaceCapabilitiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainFlagsSurfaceCapabilitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainFlagsSurfaceCapabilitiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSwapchainFlagsSurfaceCapabilitiesEXT} instance for the specified memory address. */
    public static VkSwapchainFlagsSurfaceCapabilitiesEXT create(long address) {
        return new VkSwapchainFlagsSurfaceCapabilitiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSwapchainFlagsSurfaceCapabilitiesEXT createSafe(long address) {
        return address == NULL ? null : new VkSwapchainFlagsSurfaceCapabilitiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkSwapchainFlagsSurfaceCapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainFlagsSurfaceCapabilitiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainFlagsSurfaceCapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainFlagsSurfaceCapabilitiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainFlagsSurfaceCapabilitiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainFlagsSurfaceCapabilitiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSwapchainFlagsSurfaceCapabilitiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSwapchainFlagsSurfaceCapabilitiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSwapchainFlagsSurfaceCapabilitiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSwapchainFlagsSurfaceCapabilitiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainFlagsSurfaceCapabilitiesEXT malloc(MemoryStack stack) {
        return new VkSwapchainFlagsSurfaceCapabilitiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSwapchainFlagsSurfaceCapabilitiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainFlagsSurfaceCapabilitiesEXT calloc(MemoryStack stack) {
        return new VkSwapchainFlagsSurfaceCapabilitiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSwapchainFlagsSurfaceCapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainFlagsSurfaceCapabilitiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainFlagsSurfaceCapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainFlagsSurfaceCapabilitiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSwapchainFlagsSurfaceCapabilitiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainFlagsSurfaceCapabilitiesEXT.PNEXT); }
    /** Unsafe version of {@link #swapchainSupportedFlags}. */
    public static int nswapchainSupportedFlags(long struct) { return memGetInt(struct + VkSwapchainFlagsSurfaceCapabilitiesEXT.SWAPCHAINSUPPORTEDFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSwapchainFlagsSurfaceCapabilitiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainFlagsSurfaceCapabilitiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSwapchainFlagsSurfaceCapabilitiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainFlagsSurfaceCapabilitiesEXT, Buffer> implements NativeResource {

        private static final VkSwapchainFlagsSurfaceCapabilitiesEXT ELEMENT_FACTORY = VkSwapchainFlagsSurfaceCapabilitiesEXT.create(-1L);

        /**
         * Creates a new {@code VkSwapchainFlagsSurfaceCapabilitiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainFlagsSurfaceCapabilitiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSwapchainFlagsSurfaceCapabilitiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSwapchainFlagsSurfaceCapabilitiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSwapchainFlagsSurfaceCapabilitiesEXT.npNext(address()); }
        /** @return the value of the {@code swapchainSupportedFlags} field. */
        @NativeType("VkSwapchainCreateFlagsKHR")
        public int swapchainSupportedFlags() { return VkSwapchainFlagsSurfaceCapabilitiesEXT.nswapchainSupportedFlags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSwapchainFlagsSurfaceCapabilitiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSwapchainFlagsSurfaceCapabilitiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMultisampledRenderToSwapchain#VK_STRUCTURE_TYPE_SWAPCHAIN_FLAGS_SURFACE_CAPABILITIES_EXT STRUCTURE_TYPE_SWAPCHAIN_FLAGS_SURFACE_CAPABILITIES_EXT} value to the {@code sType} field. */
        public VkSwapchainFlagsSurfaceCapabilitiesEXT.Buffer sType$Default() { return sType(EXTMultisampledRenderToSwapchain.VK_STRUCTURE_TYPE_SWAPCHAIN_FLAGS_SURFACE_CAPABILITIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSwapchainFlagsSurfaceCapabilitiesEXT.Buffer pNext(@NativeType("void *") long value) { VkSwapchainFlagsSurfaceCapabilitiesEXT.npNext(address(), value); return this; }

    }

}