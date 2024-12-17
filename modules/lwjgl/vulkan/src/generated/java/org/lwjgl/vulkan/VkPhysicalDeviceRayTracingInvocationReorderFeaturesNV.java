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
 * struct VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 rayTracingInvocationReorder;
 * }}</pre>
 */
public class VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV extends Struct<VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RAYTRACINGINVOCATIONREORDER;

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
        RAYTRACINGINVOCATIONREORDER = layout.offsetof(2);
    }

    protected VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(ByteBuffer container) {
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
    /** @return the value of the {@code rayTracingInvocationReorder} field. */
    @NativeType("VkBool32")
    public boolean rayTracingInvocationReorder() { return nrayTracingInvocationReorder(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracingInvocationReorder#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV sType$Default() { return sType(NVRayTracingInvocationReorder.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code rayTracingInvocationReorder} field. */
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV rayTracingInvocationReorder(@NativeType("VkBool32") boolean value) { nrayTracingInvocationReorder(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV set(
        int sType,
        long pNext,
        boolean rayTracingInvocationReorder
    ) {
        sType(sType);
        pNext(pNext);
        rayTracingInvocationReorder(rayTracingInvocationReorder);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV set(VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV malloc() {
        return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV calloc() {
        return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV create(long address) {
        return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #rayTracingInvocationReorder}. */
    public static int nrayTracingInvocationReorder(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.RAYTRACINGINVOCATIONREORDER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #rayTracingInvocationReorder(boolean) rayTracingInvocationReorder}. */
    public static void nrayTracingInvocationReorder(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.RAYTRACINGINVOCATIONREORDER, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.npNext(address()); }
        /** @return the value of the {@code rayTracingInvocationReorder} field. */
        @NativeType("VkBool32")
        public boolean rayTracingInvocationReorder() { return VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.nrayTracingInvocationReorder(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracingInvocationReorder#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.Buffer sType$Default() { return sType(NVRayTracingInvocationReorder.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code rayTracingInvocationReorder} field. */
        public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.Buffer rayTracingInvocationReorder(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV.nrayTracingInvocationReorder(address(), value ? 1 : 0); return this; }

    }

}