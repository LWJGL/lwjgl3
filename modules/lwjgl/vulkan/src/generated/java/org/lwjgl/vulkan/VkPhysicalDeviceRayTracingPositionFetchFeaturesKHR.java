/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing support for fetching vertex positions of hit triangles.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRRayTracingPositionFetch#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_POSITION_FETCH_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_POSITION_FETCH_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #rayTracingPositionFetch};
 * }</code></pre>
 */
public class VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR extends Struct<VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RAYTRACINGPOSITIONFETCH;

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
        RAYTRACINGPOSITIONFETCH = layout.offsetof(2);
    }

    protected VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates that the implementation supports fetching the object space vertex positions of a hit triangle. */
    @NativeType("VkBool32")
    public boolean rayTracingPositionFetch() { return nrayTracingPositionFetch(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRRayTracingPositionFetch#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_POSITION_FETCH_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_POSITION_FETCH_FEATURES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR sType$Default() { return sType(KHRRayTracingPositionFetch.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_POSITION_FETCH_FEATURES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #rayTracingPositionFetch} field. */
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR rayTracingPositionFetch(@NativeType("VkBool32") boolean value) { nrayTracingPositionFetch(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR set(
        int sType,
        long pNext,
        boolean rayTracingPositionFetch
    ) {
        sType(sType);
        pNext(pNext);
        rayTracingPositionFetch(rayTracingPositionFetch);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR set(VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR malloc() {
        return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR calloc() {
        return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR create(long address) {
        return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #rayTracingPositionFetch}. */
    public static int nrayTracingPositionFetch(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.RAYTRACINGPOSITIONFETCH); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #rayTracingPositionFetch(boolean) rayTracingPositionFetch}. */
    public static void nrayTracingPositionFetch(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.RAYTRACINGPOSITIONFETCH, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR#rayTracingPositionFetch} field. */
        @NativeType("VkBool32")
        public boolean rayTracingPositionFetch() { return VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.nrayTracingPositionFetch(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR#sType} field. */
        public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRRayTracingPositionFetch#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_POSITION_FETCH_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_POSITION_FETCH_FEATURES_KHR} value to the {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR#sType} field. */
        public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer sType$Default() { return sType(KHRRayTracingPositionFetch.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_POSITION_FETCH_FEATURES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR#pNext} field. */
        public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR#rayTracingPositionFetch} field. */
        public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.Buffer rayTracingPositionFetch(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.nrayTracingPositionFetch(address(), value ? 1 : 0); return this; }

    }

}