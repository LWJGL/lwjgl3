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
 * struct VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 spheres;
 *     VkBool32 linearSweptSpheres;
 * }}</pre>
 */
public class VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV extends Struct<VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SPHERES,
        LINEARSWEPTSPHERES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SPHERES = layout.offsetof(2);
        LINEARSWEPTSPHERES = layout.offsetof(3);
    }

    protected VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(ByteBuffer container) {
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
    /** @return the value of the {@code spheres} field. */
    @NativeType("VkBool32")
    public boolean spheres() { return nspheres(address()) != 0; }
    /** @return the value of the {@code linearSweptSpheres} field. */
    @NativeType("VkBool32")
    public boolean linearSweptSpheres() { return nlinearSweptSpheres(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracingLinearSweptSpheres#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_LINEAR_SWEPT_SPHERES_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_LINEAR_SWEPT_SPHERES_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV sType$Default() { return sType(NVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_LINEAR_SWEPT_SPHERES_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code spheres} field. */
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV spheres(@NativeType("VkBool32") boolean value) { nspheres(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code linearSweptSpheres} field. */
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV linearSweptSpheres(@NativeType("VkBool32") boolean value) { nlinearSweptSpheres(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV set(
        int sType,
        long pNext,
        boolean spheres,
        boolean linearSweptSpheres
    ) {
        sType(sType);
        pNext(pNext);
        spheres(spheres);
        linearSweptSpheres(linearSweptSpheres);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV set(VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV malloc() {
        return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV calloc() {
        return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV create(long address) {
        return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #spheres}. */
    public static int nspheres(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.SPHERES); }
    /** Unsafe version of {@link #linearSweptSpheres}. */
    public static int nlinearSweptSpheres(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.LINEARSWEPTSPHERES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #spheres(boolean) spheres}. */
    public static void nspheres(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.SPHERES, value); }
    /** Unsafe version of {@link #linearSweptSpheres(boolean) linearSweptSpheres}. */
    public static void nlinearSweptSpheres(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.LINEARSWEPTSPHERES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.npNext(address()); }
        /** @return the value of the {@code spheres} field. */
        @NativeType("VkBool32")
        public boolean spheres() { return VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.nspheres(address()) != 0; }
        /** @return the value of the {@code linearSweptSpheres} field. */
        @NativeType("VkBool32")
        public boolean linearSweptSpheres() { return VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.nlinearSweptSpheres(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracingLinearSweptSpheres#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_LINEAR_SWEPT_SPHERES_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_LINEAR_SWEPT_SPHERES_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer sType$Default() { return sType(NVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_LINEAR_SWEPT_SPHERES_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code spheres} field. */
        public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer spheres(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.nspheres(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code linearSweptSpheres} field. */
        public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.Buffer linearSweptSpheres(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.nlinearSweptSpheres(address(), value ? 1 : 0); return this; }

    }

}