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
 * struct VkPhysicalDeviceMemoryDecompressionFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 memoryDecompression;
 * }}</pre>
 */
public class VkPhysicalDeviceMemoryDecompressionFeaturesEXT extends Struct<VkPhysicalDeviceMemoryDecompressionFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORYDECOMPRESSION;

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
        MEMORYDECOMPRESSION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMemoryDecompressionFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMemoryDecompressionFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMemoryDecompressionFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code memoryDecompression} field. */
    @NativeType("VkBool32")
    public boolean memoryDecompression() { return nmemoryDecompression(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMemoryDecompression#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT sType$Default() { return sType(EXTMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code memoryDecompression} field. */
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT memoryDecompression(@NativeType("VkBool32") boolean value) { nmemoryDecompression(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT set(
        int sType,
        long pNext,
        boolean memoryDecompression
    ) {
        sType(sType);
        pNext(pNext);
        memoryDecompression(memoryDecompression);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT set(VkPhysicalDeviceMemoryDecompressionFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT malloc() {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT calloc() {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT create(long address) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMemoryDecompressionFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMemoryDecompressionFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMemoryDecompressionFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #memoryDecompression}. */
    public static int nmemoryDecompression(long struct) { return memGetInt(struct + VkPhysicalDeviceMemoryDecompressionFeaturesEXT.MEMORYDECOMPRESSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMemoryDecompressionFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMemoryDecompressionFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #memoryDecompression(boolean) memoryDecompression}. */
    public static void nmemoryDecompression(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMemoryDecompressionFeaturesEXT.MEMORYDECOMPRESSION, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMemoryDecompressionFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMemoryDecompressionFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMemoryDecompressionFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceMemoryDecompressionFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMemoryDecompressionFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMemoryDecompressionFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMemoryDecompressionFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMemoryDecompressionFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code memoryDecompression} field. */
        @NativeType("VkBool32")
        public boolean memoryDecompression() { return VkPhysicalDeviceMemoryDecompressionFeaturesEXT.nmemoryDecompression(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMemoryDecompressionFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMemoryDecompression#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer sType$Default() { return sType(EXTMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMemoryDecompressionFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code memoryDecompression} field. */
        public VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer memoryDecompression(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMemoryDecompressionFeaturesEXT.nmemoryDecompression(address(), value ? 1 : 0); return this; }

    }

}