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
 * struct VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 multisampledRenderToSwapchain;
 * }}</pre>
 */
public class VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT extends Struct<VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MULTISAMPLEDRENDERTOSWAPCHAIN;

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
        MULTISAMPLEDRENDERTOSWAPCHAIN = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code multisampledRenderToSwapchain} field. */
    @NativeType("VkBool32")
    public boolean multisampledRenderToSwapchain() { return nmultisampledRenderToSwapchain(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMultisampledRenderToSwapchain#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SWAPCHAIN_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SWAPCHAIN_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT sType$Default() { return sType(EXTMultisampledRenderToSwapchain.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SWAPCHAIN_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code multisampledRenderToSwapchain} field. */
    public VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT multisampledRenderToSwapchain(@NativeType("VkBool32") boolean value) { nmultisampledRenderToSwapchain(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT set(
        int sType,
        long pNext,
        boolean multisampledRenderToSwapchain
    ) {
        sType(sType);
        pNext(pNext);
        multisampledRenderToSwapchain(multisampledRenderToSwapchain);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT set(VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT malloc() {
        return new VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT calloc() {
        return new VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT create(long address) {
        return new VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #multisampledRenderToSwapchain}. */
    public static int nmultisampledRenderToSwapchain(long struct) { return memGetInt(struct + VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.MULTISAMPLEDRENDERTOSWAPCHAIN); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #multisampledRenderToSwapchain(boolean) multisampledRenderToSwapchain}. */
    public static void nmultisampledRenderToSwapchain(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.MULTISAMPLEDRENDERTOSWAPCHAIN, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code multisampledRenderToSwapchain} field. */
        @NativeType("VkBool32")
        public boolean multisampledRenderToSwapchain() { return VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.nmultisampledRenderToSwapchain(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMultisampledRenderToSwapchain#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SWAPCHAIN_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SWAPCHAIN_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.Buffer sType$Default() { return sType(EXTMultisampledRenderToSwapchain.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SWAPCHAIN_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code multisampledRenderToSwapchain} field. */
        public VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.Buffer multisampledRenderToSwapchain(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMultisampledRenderToSwapchainFeaturesEXT.nmultisampledRenderToSwapchain(address(), value ? 1 : 0); return this; }

    }

}