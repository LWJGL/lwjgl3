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
 * struct VkPhysicalDevicePipelineBinaryPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 pipelineBinaryInternalCache;
 *     VkBool32 pipelineBinaryInternalCacheControl;
 *     VkBool32 pipelineBinaryPrefersInternalCache;
 *     VkBool32 pipelineBinaryPrecompiledInternalCache;
 *     VkBool32 pipelineBinaryCompressedData;
 * }}</pre>
 */
public class VkPhysicalDevicePipelineBinaryPropertiesKHR extends Struct<VkPhysicalDevicePipelineBinaryPropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEBINARYINTERNALCACHE,
        PIPELINEBINARYINTERNALCACHECONTROL,
        PIPELINEBINARYPREFERSINTERNALCACHE,
        PIPELINEBINARYPRECOMPILEDINTERNALCACHE,
        PIPELINEBINARYCOMPRESSEDDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEBINARYINTERNALCACHE = layout.offsetof(2);
        PIPELINEBINARYINTERNALCACHECONTROL = layout.offsetof(3);
        PIPELINEBINARYPREFERSINTERNALCACHE = layout.offsetof(4);
        PIPELINEBINARYPRECOMPILEDINTERNALCACHE = layout.offsetof(5);
        PIPELINEBINARYCOMPRESSEDDATA = layout.offsetof(6);
    }

    protected VkPhysicalDevicePipelineBinaryPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePipelineBinaryPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePipelineBinaryPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePipelineBinaryPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePipelineBinaryPropertiesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code pipelineBinaryInternalCache} field. */
    @NativeType("VkBool32")
    public boolean pipelineBinaryInternalCache() { return npipelineBinaryInternalCache(address()) != 0; }
    /** @return the value of the {@code pipelineBinaryInternalCacheControl} field. */
    @NativeType("VkBool32")
    public boolean pipelineBinaryInternalCacheControl() { return npipelineBinaryInternalCacheControl(address()) != 0; }
    /** @return the value of the {@code pipelineBinaryPrefersInternalCache} field. */
    @NativeType("VkBool32")
    public boolean pipelineBinaryPrefersInternalCache() { return npipelineBinaryPrefersInternalCache(address()) != 0; }
    /** @return the value of the {@code pipelineBinaryPrecompiledInternalCache} field. */
    @NativeType("VkBool32")
    public boolean pipelineBinaryPrecompiledInternalCache() { return npipelineBinaryPrecompiledInternalCache(address()) != 0; }
    /** @return the value of the {@code pipelineBinaryCompressedData} field. */
    @NativeType("VkBool32")
    public boolean pipelineBinaryCompressedData() { return npipelineBinaryCompressedData(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePipelineBinaryPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR} value to the {@code sType} field. */
    public VkPhysicalDevicePipelineBinaryPropertiesKHR sType$Default() { return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePipelineBinaryPropertiesKHR set(
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
    public VkPhysicalDevicePipelineBinaryPropertiesKHR set(VkPhysicalDevicePipelineBinaryPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePipelineBinaryPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR malloc() {
        return new VkPhysicalDevicePipelineBinaryPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineBinaryPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR calloc() {
        return new VkPhysicalDevicePipelineBinaryPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineBinaryPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineBinaryPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineBinaryPropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR create(long address) {
        return new VkPhysicalDevicePipelineBinaryPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePipelineBinaryPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePipelineBinaryPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineBinaryPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineBinaryPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineBinaryPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePipelineBinaryPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineBinaryPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineBinaryPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineBinaryPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineBinaryPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineBinaryPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineBinaryPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineBinaryPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePipelineBinaryPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #pipelineBinaryInternalCache}. */
    public static int npipelineBinaryInternalCache(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineBinaryPropertiesKHR.PIPELINEBINARYINTERNALCACHE); }
    /** Unsafe version of {@link #pipelineBinaryInternalCacheControl}. */
    public static int npipelineBinaryInternalCacheControl(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineBinaryPropertiesKHR.PIPELINEBINARYINTERNALCACHECONTROL); }
    /** Unsafe version of {@link #pipelineBinaryPrefersInternalCache}. */
    public static int npipelineBinaryPrefersInternalCache(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineBinaryPropertiesKHR.PIPELINEBINARYPREFERSINTERNALCACHE); }
    /** Unsafe version of {@link #pipelineBinaryPrecompiledInternalCache}. */
    public static int npipelineBinaryPrecompiledInternalCache(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineBinaryPropertiesKHR.PIPELINEBINARYPRECOMPILEDINTERNALCACHE); }
    /** Unsafe version of {@link #pipelineBinaryCompressedData}. */
    public static int npipelineBinaryCompressedData(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineBinaryPropertiesKHR.PIPELINEBINARYCOMPRESSEDDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePipelineBinaryPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePipelineBinaryPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePipelineBinaryPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineBinaryPropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePipelineBinaryPropertiesKHR ELEMENT_FACTORY = VkPhysicalDevicePipelineBinaryPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePipelineBinaryPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePipelineBinaryPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePipelineBinaryPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePipelineBinaryPropertiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePipelineBinaryPropertiesKHR.npNext(address()); }
        /** @return the value of the {@code pipelineBinaryInternalCache} field. */
        @NativeType("VkBool32")
        public boolean pipelineBinaryInternalCache() { return VkPhysicalDevicePipelineBinaryPropertiesKHR.npipelineBinaryInternalCache(address()) != 0; }
        /** @return the value of the {@code pipelineBinaryInternalCacheControl} field. */
        @NativeType("VkBool32")
        public boolean pipelineBinaryInternalCacheControl() { return VkPhysicalDevicePipelineBinaryPropertiesKHR.npipelineBinaryInternalCacheControl(address()) != 0; }
        /** @return the value of the {@code pipelineBinaryPrefersInternalCache} field. */
        @NativeType("VkBool32")
        public boolean pipelineBinaryPrefersInternalCache() { return VkPhysicalDevicePipelineBinaryPropertiesKHR.npipelineBinaryPrefersInternalCache(address()) != 0; }
        /** @return the value of the {@code pipelineBinaryPrecompiledInternalCache} field. */
        @NativeType("VkBool32")
        public boolean pipelineBinaryPrecompiledInternalCache() { return VkPhysicalDevicePipelineBinaryPropertiesKHR.npipelineBinaryPrecompiledInternalCache(address()) != 0; }
        /** @return the value of the {@code pipelineBinaryCompressedData} field. */
        @NativeType("VkBool32")
        public boolean pipelineBinaryCompressedData() { return VkPhysicalDevicePipelineBinaryPropertiesKHR.npipelineBinaryCompressedData(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePipelineBinaryPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR} value to the {@code sType} field. */
        public VkPhysicalDevicePipelineBinaryPropertiesKHR.Buffer sType$Default() { return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePipelineBinaryPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.npNext(address(), value); return this; }

    }

}