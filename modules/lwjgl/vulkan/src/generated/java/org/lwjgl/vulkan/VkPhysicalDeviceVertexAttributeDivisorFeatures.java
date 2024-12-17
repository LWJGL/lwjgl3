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
 * struct VkPhysicalDeviceVertexAttributeDivisorFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 vertexAttributeInstanceRateDivisor;
 *     VkBool32 vertexAttributeInstanceRateZeroDivisor;
 * }}</pre>
 */
public class VkPhysicalDeviceVertexAttributeDivisorFeatures extends Struct<VkPhysicalDeviceVertexAttributeDivisorFeatures> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VERTEXATTRIBUTEINSTANCERATEDIVISOR,
        VERTEXATTRIBUTEINSTANCERATEZERODIVISOR;

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
        VERTEXATTRIBUTEINSTANCERATEDIVISOR = layout.offsetof(2);
        VERTEXATTRIBUTEINSTANCERATEZERODIVISOR = layout.offsetof(3);
    }

    protected VkPhysicalDeviceVertexAttributeDivisorFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVertexAttributeDivisorFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVertexAttributeDivisorFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVertexAttributeDivisorFeatures(ByteBuffer container) {
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
    /** @return the value of the {@code vertexAttributeInstanceRateDivisor} field. */
    @NativeType("VkBool32")
    public boolean vertexAttributeInstanceRateDivisor() { return nvertexAttributeInstanceRateDivisor(address()) != 0; }
    /** @return the value of the {@code vertexAttributeInstanceRateZeroDivisor} field. */
    @NativeType("VkBool32")
    public boolean vertexAttributeInstanceRateZeroDivisor() { return nvertexAttributeInstanceRateZeroDivisor(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVertexAttributeDivisorFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceVertexAttributeDivisorFeatures sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVertexAttributeDivisorFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code vertexAttributeInstanceRateDivisor} field. */
    public VkPhysicalDeviceVertexAttributeDivisorFeatures vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) { nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vertexAttributeInstanceRateZeroDivisor} field. */
    public VkPhysicalDeviceVertexAttributeDivisorFeatures vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) { nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVertexAttributeDivisorFeatures set(
        int sType,
        long pNext,
        boolean vertexAttributeInstanceRateDivisor,
        boolean vertexAttributeInstanceRateZeroDivisor
    ) {
        sType(sType);
        pNext(pNext);
        vertexAttributeInstanceRateDivisor(vertexAttributeInstanceRateDivisor);
        vertexAttributeInstanceRateZeroDivisor(vertexAttributeInstanceRateZeroDivisor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVertexAttributeDivisorFeatures set(VkPhysicalDeviceVertexAttributeDivisorFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures malloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures calloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVertexAttributeDivisorFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures create(long address) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVertexAttributeDivisorFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVertexAttributeDivisorFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVertexAttributeDivisorFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVertexAttributeDivisorFeatures.PNEXT); }
    /** Unsafe version of {@link #vertexAttributeInstanceRateDivisor}. */
    public static int nvertexAttributeInstanceRateDivisor(long struct) { return memGetInt(struct + VkPhysicalDeviceVertexAttributeDivisorFeatures.VERTEXATTRIBUTEINSTANCERATEDIVISOR); }
    /** Unsafe version of {@link #vertexAttributeInstanceRateZeroDivisor}. */
    public static int nvertexAttributeInstanceRateZeroDivisor(long struct) { return memGetInt(struct + VkPhysicalDeviceVertexAttributeDivisorFeatures.VERTEXATTRIBUTEINSTANCERATEZERODIVISOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVertexAttributeDivisorFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVertexAttributeDivisorFeatures.PNEXT, value); }
    /** Unsafe version of {@link #vertexAttributeInstanceRateDivisor(boolean) vertexAttributeInstanceRateDivisor}. */
    public static void nvertexAttributeInstanceRateDivisor(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVertexAttributeDivisorFeatures.VERTEXATTRIBUTEINSTANCERATEDIVISOR, value); }
    /** Unsafe version of {@link #vertexAttributeInstanceRateZeroDivisor(boolean) vertexAttributeInstanceRateZeroDivisor}. */
    public static void nvertexAttributeInstanceRateZeroDivisor(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVertexAttributeDivisorFeatures.VERTEXATTRIBUTEINSTANCERATEZERODIVISOR, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVertexAttributeDivisorFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVertexAttributeDivisorFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVertexAttributeDivisorFeatures ELEMENT_FACTORY = VkPhysicalDeviceVertexAttributeDivisorFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVertexAttributeDivisorFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVertexAttributeDivisorFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVertexAttributeDivisorFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVertexAttributeDivisorFeatures.npNext(address()); }
        /** @return the value of the {@code vertexAttributeInstanceRateDivisor} field. */
        @NativeType("VkBool32")
        public boolean vertexAttributeInstanceRateDivisor() { return VkPhysicalDeviceVertexAttributeDivisorFeatures.nvertexAttributeInstanceRateDivisor(address()) != 0; }
        /** @return the value of the {@code vertexAttributeInstanceRateZeroDivisor} field. */
        @NativeType("VkBool32")
        public boolean vertexAttributeInstanceRateZeroDivisor() { return VkPhysicalDeviceVertexAttributeDivisorFeatures.nvertexAttributeInstanceRateZeroDivisor(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVertexAttributeDivisorFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVertexAttributeDivisorFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code vertexAttributeInstanceRateDivisor} field. */
        public VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVertexAttributeDivisorFeatures.nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vertexAttributeInstanceRateZeroDivisor} field. */
        public VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVertexAttributeDivisorFeatures.nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0); return this; }

    }

}