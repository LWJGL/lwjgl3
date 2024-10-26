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
 * Structure describing the ray tracing validation features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceRayTracingValidationFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceRayTracingValidationFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRayTracingValidation#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_VALIDATION_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_VALIDATION_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceRayTracingValidationFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #rayTracingValidation};
 * }</code></pre>
 */
public class VkPhysicalDeviceRayTracingValidationFeaturesNV extends Struct<VkPhysicalDeviceRayTracingValidationFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RAYTRACINGVALIDATION;

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
        RAYTRACINGVALIDATION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceRayTracingValidationFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRayTracingValidationFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingValidationFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRayTracingValidationFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRayTracingValidationFeaturesNV(ByteBuffer container) {
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
    /** indicates whether the implementation supports the ray tracing validation feature. */
    @NativeType("VkBool32")
    public boolean rayTracingValidation() { return nrayTracingValidation(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceRayTracingValidationFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracingValidation#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_VALIDATION_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_VALIDATION_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceRayTracingValidationFeaturesNV sType$Default() { return sType(NVRayTracingValidation.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_VALIDATION_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceRayTracingValidationFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #rayTracingValidation} field. */
    public VkPhysicalDeviceRayTracingValidationFeaturesNV rayTracingValidation(@NativeType("VkBool32") boolean value) { nrayTracingValidation(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRayTracingValidationFeaturesNV set(
        int sType,
        long pNext,
        boolean rayTracingValidation
    ) {
        sType(sType);
        pNext(pNext);
        rayTracingValidation(rayTracingValidation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRayTracingValidationFeaturesNV set(VkPhysicalDeviceRayTracingValidationFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRayTracingValidationFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV malloc() {
        return new VkPhysicalDeviceRayTracingValidationFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingValidationFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV calloc() {
        return new VkPhysicalDeviceRayTracingValidationFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingValidationFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingValidationFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingValidationFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV create(long address) {
        return new VkPhysicalDeviceRayTracingValidationFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRayTracingValidationFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingValidationFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingValidationFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingValidationFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingValidationFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingValidationFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRayTracingValidationFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #rayTracingValidation}. */
    public static int nrayTracingValidation(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingValidationFeaturesNV.RAYTRACINGVALIDATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingValidationFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRayTracingValidationFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #rayTracingValidation(boolean) rayTracingValidation}. */
    public static void nrayTracingValidation(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingValidationFeaturesNV.RAYTRACINGVALIDATION, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRayTracingValidationFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingValidationFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRayTracingValidationFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceRayTracingValidationFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRayTracingValidationFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRayTracingValidationFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceRayTracingValidationFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRayTracingValidationFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingValidationFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRayTracingValidationFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingValidationFeaturesNV#rayTracingValidation} field. */
        @NativeType("VkBool32")
        public boolean rayTracingValidation() { return VkPhysicalDeviceRayTracingValidationFeaturesNV.nrayTracingValidation(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingValidationFeaturesNV#sType} field. */
        public VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRayTracingValidationFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracingValidation#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_VALIDATION_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_VALIDATION_FEATURES_NV} value to the {@link VkPhysicalDeviceRayTracingValidationFeaturesNV#sType} field. */
        public VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer sType$Default() { return sType(NVRayTracingValidation.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_VALIDATION_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingValidationFeaturesNV#pNext} field. */
        public VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRayTracingValidationFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingValidationFeaturesNV#rayTracingValidation} field. */
        public VkPhysicalDeviceRayTracingValidationFeaturesNV.Buffer rayTracingValidation(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingValidationFeaturesNV.nrayTracingValidation(address(), value ? 1 : 0); return this; }

    }

}