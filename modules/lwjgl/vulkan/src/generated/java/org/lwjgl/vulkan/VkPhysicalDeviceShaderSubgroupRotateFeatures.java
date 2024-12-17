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
 * struct VkPhysicalDeviceShaderSubgroupRotateFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderSubgroupRotate;
 *     VkBool32 shaderSubgroupRotateClustered;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderSubgroupRotateFeatures extends Struct<VkPhysicalDeviceShaderSubgroupRotateFeatures> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERSUBGROUPROTATE,
        SHADERSUBGROUPROTATECLUSTERED;

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
        SHADERSUBGROUPROTATE = layout.offsetof(2);
        SHADERSUBGROUPROTATECLUSTERED = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderSubgroupRotateFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderSubgroupRotateFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderSubgroupRotateFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderSubgroupRotateFeatures(ByteBuffer container) {
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
    /** @return the value of the {@code shaderSubgroupRotate} field. */
    @NativeType("VkBool32")
    public boolean shaderSubgroupRotate() { return nshaderSubgroupRotate(address()) != 0; }
    /** @return the value of the {@code shaderSubgroupRotateClustered} field. */
    @NativeType("VkBool32")
    public boolean shaderSubgroupRotateClustered() { return nshaderSubgroupRotateClustered(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderSubgroupRotateFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderSubgroupRotateFeatures sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderSubgroupRotateFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderSubgroupRotate} field. */
    public VkPhysicalDeviceShaderSubgroupRotateFeatures shaderSubgroupRotate(@NativeType("VkBool32") boolean value) { nshaderSubgroupRotate(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSubgroupRotateClustered} field. */
    public VkPhysicalDeviceShaderSubgroupRotateFeatures shaderSubgroupRotateClustered(@NativeType("VkBool32") boolean value) { nshaderSubgroupRotateClustered(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderSubgroupRotateFeatures set(
        int sType,
        long pNext,
        boolean shaderSubgroupRotate,
        boolean shaderSubgroupRotateClustered
    ) {
        sType(sType);
        pNext(pNext);
        shaderSubgroupRotate(shaderSubgroupRotate);
        shaderSubgroupRotateClustered(shaderSubgroupRotateClustered);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderSubgroupRotateFeatures set(VkPhysicalDeviceShaderSubgroupRotateFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures malloc() {
        return new VkPhysicalDeviceShaderSubgroupRotateFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures calloc() {
        return new VkPhysicalDeviceShaderSubgroupRotateFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderSubgroupRotateFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures create(long address) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderSubgroupRotateFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderSubgroupRotateFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderSubgroupRotateFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderSubgroupRotateFeatures.PNEXT); }
    /** Unsafe version of {@link #shaderSubgroupRotate}. */
    public static int nshaderSubgroupRotate(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderSubgroupRotateFeatures.SHADERSUBGROUPROTATE); }
    /** Unsafe version of {@link #shaderSubgroupRotateClustered}. */
    public static int nshaderSubgroupRotateClustered(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderSubgroupRotateFeatures.SHADERSUBGROUPROTATECLUSTERED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderSubgroupRotateFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderSubgroupRotateFeatures.PNEXT, value); }
    /** Unsafe version of {@link #shaderSubgroupRotate(boolean) shaderSubgroupRotate}. */
    public static void nshaderSubgroupRotate(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderSubgroupRotateFeatures.SHADERSUBGROUPROTATE, value); }
    /** Unsafe version of {@link #shaderSubgroupRotateClustered(boolean) shaderSubgroupRotateClustered}. */
    public static void nshaderSubgroupRotateClustered(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderSubgroupRotateFeatures.SHADERSUBGROUPROTATECLUSTERED, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderSubgroupRotateFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderSubgroupRotateFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderSubgroupRotateFeatures ELEMENT_FACTORY = VkPhysicalDeviceShaderSubgroupRotateFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderSubgroupRotateFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderSubgroupRotateFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderSubgroupRotateFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderSubgroupRotateFeatures.npNext(address()); }
        /** @return the value of the {@code shaderSubgroupRotate} field. */
        @NativeType("VkBool32")
        public boolean shaderSubgroupRotate() { return VkPhysicalDeviceShaderSubgroupRotateFeatures.nshaderSubgroupRotate(address()) != 0; }
        /** @return the value of the {@code shaderSubgroupRotateClustered} field. */
        @NativeType("VkBool32")
        public boolean shaderSubgroupRotateClustered() { return VkPhysicalDeviceShaderSubgroupRotateFeatures.nshaderSubgroupRotateClustered(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderSubgroupRotateFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderSubgroupRotateFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderSubgroupRotate} field. */
        public VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer shaderSubgroupRotate(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderSubgroupRotateFeatures.nshaderSubgroupRotate(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSubgroupRotateClustered} field. */
        public VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer shaderSubgroupRotateClustered(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderSubgroupRotateFeatures.nshaderSubgroupRotateClustered(address(), value ? 1 : 0); return this; }

    }

}