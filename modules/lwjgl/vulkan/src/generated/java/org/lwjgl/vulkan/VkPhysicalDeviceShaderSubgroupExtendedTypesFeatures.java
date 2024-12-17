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
 * struct VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderSubgroupExtendedTypes;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures extends Struct<VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERSUBGROUPEXTENDEDTYPES;

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
        SHADERSUBGROUPEXTENDEDTYPES = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(ByteBuffer container) {
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
    /** @return the value of the {@code shaderSubgroupExtendedTypes} field. */
    @NativeType("VkBool32")
    public boolean shaderSubgroupExtendedTypes() { return nshaderSubgroupExtendedTypes(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderSubgroupExtendedTypes} field. */
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures shaderSubgroupExtendedTypes(@NativeType("VkBool32") boolean value) { nshaderSubgroupExtendedTypes(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures set(
        int sType,
        long pNext,
        boolean shaderSubgroupExtendedTypes
    ) {
        sType(sType);
        pNext(pNext);
        shaderSubgroupExtendedTypes(shaderSubgroupExtendedTypes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures set(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures malloc() {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures calloc() {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures create(long address) {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.PNEXT); }
    /** Unsafe version of {@link #shaderSubgroupExtendedTypes}. */
    public static int nshaderSubgroupExtendedTypes(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.SHADERSUBGROUPEXTENDEDTYPES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.PNEXT, value); }
    /** Unsafe version of {@link #shaderSubgroupExtendedTypes(boolean) shaderSubgroupExtendedTypes}. */
    public static void nshaderSubgroupExtendedTypes(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.SHADERSUBGROUPEXTENDEDTYPES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures ELEMENT_FACTORY = VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.npNext(address()); }
        /** @return the value of the {@code shaderSubgroupExtendedTypes} field. */
        @NativeType("VkBool32")
        public boolean shaderSubgroupExtendedTypes() { return VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.nshaderSubgroupExtendedTypes(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderSubgroupExtendedTypes} field. */
        public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer shaderSubgroupExtendedTypes(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.nshaderSubgroupExtendedTypes(address(), value ? 1 : 0); return this; }

    }

}