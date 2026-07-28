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
 * struct VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 rayTracingInvocationReorder;
 * }}</pre>
 */
public class VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT extends Struct<VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT> implements NativeResource {

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

    protected VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT(ByteBuffer container) {
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
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTRayTracingInvocationReorder#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT sType$Default() { return sType(EXTRayTracingInvocationReorder.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code rayTracingInvocationReorder} field. */
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT rayTracingInvocationReorder(@NativeType("VkBool32") boolean value) { nrayTracingInvocationReorder(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT set(
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
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT set(VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT malloc() {
        return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT calloc() {
        return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT create(long address) {
        return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #rayTracingInvocationReorder}. */
    public static int nrayTracingInvocationReorder(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.RAYTRACINGINVOCATIONREORDER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #rayTracingInvocationReorder(boolean) rayTracingInvocationReorder}. */
    public static void nrayTracingInvocationReorder(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.RAYTRACINGINVOCATIONREORDER, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code rayTracingInvocationReorder} field. */
        @NativeType("VkBool32")
        public boolean rayTracingInvocationReorder() { return VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.nrayTracingInvocationReorder(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTRayTracingInvocationReorder#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.Buffer sType$Default() { return sType(EXTRayTracingInvocationReorder.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code rayTracingInvocationReorder} field. */
        public VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.Buffer rayTracingInvocationReorder(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT.nrayTracingInvocationReorder(address(), value ? 1 : 0); return this; }

    }

}