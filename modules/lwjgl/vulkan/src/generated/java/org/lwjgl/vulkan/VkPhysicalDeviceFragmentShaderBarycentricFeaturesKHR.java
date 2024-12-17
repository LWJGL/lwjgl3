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
 * struct VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 fragmentShaderBarycentric;
 * }}</pre>
 */
public class VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR extends Struct<VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FRAGMENTSHADERBARYCENTRIC;

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
        FRAGMENTSHADERBARYCENTRIC = layout.offsetof(2);
    }

    protected VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code fragmentShaderBarycentric} field. */
    @NativeType("VkBool32")
    public boolean fragmentShaderBarycentric() { return nfragmentShaderBarycentric(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRFragmentShaderBarycentric#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR sType$Default() { return sType(KHRFragmentShaderBarycentric.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code fragmentShaderBarycentric} field. */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR fragmentShaderBarycentric(@NativeType("VkBool32") boolean value) { nfragmentShaderBarycentric(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR set(
        int sType,
        long pNext,
        boolean fragmentShaderBarycentric
    ) {
        sType(sType);
        pNext(pNext);
        fragmentShaderBarycentric(fragmentShaderBarycentric);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR set(VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR malloc() {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR calloc() {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR create(long address) {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #fragmentShaderBarycentric}. */
    public static int nfragmentShaderBarycentric(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.FRAGMENTSHADERBARYCENTRIC); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #fragmentShaderBarycentric(boolean) fragmentShaderBarycentric}. */
    public static void nfragmentShaderBarycentric(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.FRAGMENTSHADERBARYCENTRIC, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code fragmentShaderBarycentric} field. */
        @NativeType("VkBool32")
        public boolean fragmentShaderBarycentric() { return VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.nfragmentShaderBarycentric(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRFragmentShaderBarycentric#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer sType$Default() { return sType(KHRFragmentShaderBarycentric.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code fragmentShaderBarycentric} field. */
        public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer fragmentShaderBarycentric(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.nfragmentShaderBarycentric(address(), value ? 1 : 0); return this; }

    }

}