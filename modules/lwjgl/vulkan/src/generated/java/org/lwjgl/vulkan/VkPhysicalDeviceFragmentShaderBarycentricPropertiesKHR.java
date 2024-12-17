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
 * struct VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 triStripVertexOrderIndependentOfProvokingVertex;
 * }}</pre>
 */
public class VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR extends Struct<VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TRISTRIPVERTEXORDERINDEPENDENTOFPROVOKINGVERTEX;

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
        TRISTRIPVERTEXORDERINDEPENDENTOFPROVOKINGVERTEX = layout.offsetof(2);
    }

    protected VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code triStripVertexOrderIndependentOfProvokingVertex} field. */
    @NativeType("VkBool32")
    public boolean triStripVertexOrderIndependentOfProvokingVertex() { return ntriStripVertexOrderIndependentOfProvokingVertex(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRFragmentShaderBarycentric#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_PROPERTIES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR sType$Default() { return sType(KHRFragmentShaderBarycentric.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_PROPERTIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR set(
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
    public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR set(VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR malloc() {
        return new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR calloc() {
        return new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR create(long address) {
        return new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #triStripVertexOrderIndependentOfProvokingVertex}. */
    public static int ntriStripVertexOrderIndependentOfProvokingVertex(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.TRISTRIPVERTEXORDERINDEPENDENTOFPROVOKINGVERTEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.npNext(address()); }
        /** @return the value of the {@code triStripVertexOrderIndependentOfProvokingVertex} field. */
        @NativeType("VkBool32")
        public boolean triStripVertexOrderIndependentOfProvokingVertex() { return VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.ntriStripVertexOrderIndependentOfProvokingVertex(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRFragmentShaderBarycentric#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_PROPERTIES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.Buffer sType$Default() { return sType(KHRFragmentShaderBarycentric.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_PROPERTIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR.npNext(address(), value); return this; }

    }

}