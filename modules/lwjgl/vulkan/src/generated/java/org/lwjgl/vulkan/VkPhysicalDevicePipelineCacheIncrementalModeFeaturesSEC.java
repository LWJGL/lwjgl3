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
 * struct VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 pipelineCacheIncrementalMode;
 * }}</pre>
 */
public class VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC extends Struct<VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINECACHEINCREMENTALMODE;

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
        PIPELINECACHEINCREMENTALMODE = layout.offsetof(2);
    }

    protected VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(ByteBuffer container) {
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
    /** @return the value of the {@code pipelineCacheIncrementalMode} field. */
    @NativeType("VkBool32")
    public boolean pipelineCacheIncrementalMode() { return npipelineCacheIncrementalMode(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link SECPipelineCacheIncrementalMode#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CACHE_INCREMENTAL_MODE_FEATURES_SEC STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CACHE_INCREMENTAL_MODE_FEATURES_SEC} value to the {@code sType} field. */
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC sType$Default() { return sType(SECPipelineCacheIncrementalMode.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CACHE_INCREMENTAL_MODE_FEATURES_SEC); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineCacheIncrementalMode} field. */
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC pipelineCacheIncrementalMode(@NativeType("VkBool32") boolean value) { npipelineCacheIncrementalMode(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC set(
        int sType,
        long pNext,
        boolean pipelineCacheIncrementalMode
    ) {
        sType(sType);
        pNext(pNext);
        pipelineCacheIncrementalMode(pipelineCacheIncrementalMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC set(VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC malloc() {
        return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC calloc() {
        return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC} instance for the specified memory address. */
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC create(long address) {
        return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.PNEXT); }
    /** Unsafe version of {@link #pipelineCacheIncrementalMode}. */
    public static int npipelineCacheIncrementalMode(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.PIPELINECACHEINCREMENTALMODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.PNEXT, value); }
    /** Unsafe version of {@link #pipelineCacheIncrementalMode(boolean) pipelineCacheIncrementalMode}. */
    public static void npipelineCacheIncrementalMode(long struct, int value) { memPutInt(struct + VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.PIPELINECACHEINCREMENTALMODE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC ELEMENT_FACTORY = VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.npNext(address()); }
        /** @return the value of the {@code pipelineCacheIncrementalMode} field. */
        @NativeType("VkBool32")
        public boolean pipelineCacheIncrementalMode() { return VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.npipelineCacheIncrementalMode(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.nsType(address(), value); return this; }
        /** Sets the {@link SECPipelineCacheIncrementalMode#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CACHE_INCREMENTAL_MODE_FEATURES_SEC STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CACHE_INCREMENTAL_MODE_FEATURES_SEC} value to the {@code sType} field. */
        public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.Buffer sType$Default() { return sType(SECPipelineCacheIncrementalMode.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CACHE_INCREMENTAL_MODE_FEATURES_SEC); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineCacheIncrementalMode} field. */
        public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.Buffer pipelineCacheIncrementalMode(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.npipelineCacheIncrementalMode(address(), value ? 1 : 0); return this; }

    }

}