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
 * struct VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkRayTracingInvocationReorderModeEXT rayTracingInvocationReorderReorderingHint;
 *     uint32_t maxShaderBindingTableRecordIndex;
 * }}</pre>
 */
public class VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT extends Struct<VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RAYTRACINGINVOCATIONREORDERREORDERINGHINT,
        MAXSHADERBINDINGTABLERECORDINDEX;

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
        RAYTRACINGINVOCATIONREORDERREORDERINGHINT = layout.offsetof(2);
        MAXSHADERBINDINGTABLERECORDINDEX = layout.offsetof(3);
    }

    protected VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code rayTracingInvocationReorderReorderingHint} field. */
    @NativeType("VkRayTracingInvocationReorderModeEXT")
    public int rayTracingInvocationReorderReorderingHint() { return nrayTracingInvocationReorderReorderingHint(address()); }
    /** @return the value of the {@code maxShaderBindingTableRecordIndex} field. */
    @NativeType("uint32_t")
    public int maxShaderBindingTableRecordIndex() { return nmaxShaderBindingTableRecordIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTRayTracingInvocationReorder#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT sType$Default() { return sType(EXTRayTracingInvocationReorder.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT set(
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
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT set(VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT malloc() {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT calloc() {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT create(long address) {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #rayTracingInvocationReorderReorderingHint}. */
    public static int nrayTracingInvocationReorderReorderingHint(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.RAYTRACINGINVOCATIONREORDERREORDERINGHINT); }
    /** Unsafe version of {@link #maxShaderBindingTableRecordIndex}. */
    public static int nmaxShaderBindingTableRecordIndex(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.MAXSHADERBINDINGTABLERECORDINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.npNext(address()); }
        /** @return the value of the {@code rayTracingInvocationReorderReorderingHint} field. */
        @NativeType("VkRayTracingInvocationReorderModeEXT")
        public int rayTracingInvocationReorderReorderingHint() { return VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.nrayTracingInvocationReorderReorderingHint(address()); }
        /** @return the value of the {@code maxShaderBindingTableRecordIndex} field. */
        @NativeType("uint32_t")
        public int maxShaderBindingTableRecordIndex() { return VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.nmaxShaderBindingTableRecordIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTRayTracingInvocationReorder#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.Buffer sType$Default() { return sType(EXTRayTracingInvocationReorder.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.npNext(address(), value); return this; }

    }

}