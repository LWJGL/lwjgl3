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
 * struct VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 imageCompressionControlSwapchain;
 * }}</pre>
 */
public class VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT extends Struct<VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGECOMPRESSIONCONTROLSWAPCHAIN;

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
        IMAGECOMPRESSIONCONTROLSWAPCHAIN = layout.offsetof(2);
    }

    protected VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code imageCompressionControlSwapchain} field. */
    @NativeType("VkBool32")
    public boolean imageCompressionControlSwapchain() { return nimageCompressionControlSwapchain(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageCompressionControlSwapchain#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT sType$Default() { return sType(EXTImageCompressionControlSwapchain.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code imageCompressionControlSwapchain} field. */
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT imageCompressionControlSwapchain(@NativeType("VkBool32") boolean value) { nimageCompressionControlSwapchain(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT set(
        int sType,
        long pNext,
        boolean imageCompressionControlSwapchain
    ) {
        sType(sType);
        pNext(pNext);
        imageCompressionControlSwapchain(imageCompressionControlSwapchain);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT set(VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT malloc() {
        return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT calloc() {
        return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT create(long address) {
        return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #imageCompressionControlSwapchain}. */
    public static int nimageCompressionControlSwapchain(long struct) { return memGetInt(struct + VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.IMAGECOMPRESSIONCONTROLSWAPCHAIN); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #imageCompressionControlSwapchain(boolean) imageCompressionControlSwapchain}. */
    public static void nimageCompressionControlSwapchain(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.IMAGECOMPRESSIONCONTROLSWAPCHAIN, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code imageCompressionControlSwapchain} field. */
        @NativeType("VkBool32")
        public boolean imageCompressionControlSwapchain() { return VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.nimageCompressionControlSwapchain(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageCompressionControlSwapchain#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.Buffer sType$Default() { return sType(EXTImageCompressionControlSwapchain.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code imageCompressionControlSwapchain} field. */
        public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.Buffer imageCompressionControlSwapchain(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.nimageCompressionControlSwapchain(address(), value ? 1 : 0); return this; }

    }

}