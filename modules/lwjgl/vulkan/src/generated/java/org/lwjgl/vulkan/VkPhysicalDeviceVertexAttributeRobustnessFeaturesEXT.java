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
 * struct VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 vertexAttributeRobustness;
 * }}</pre>
 */
public class VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT extends Struct<VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VERTEXATTRIBUTEROBUSTNESS;

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
        VERTEXATTRIBUTEROBUSTNESS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code vertexAttributeRobustness} field. */
    @NativeType("VkBool32")
    public boolean vertexAttributeRobustness() { return nvertexAttributeRobustness(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVertexAttributeRobustness#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_ROBUSTNESS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_ROBUSTNESS_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT sType$Default() { return sType(EXTVertexAttributeRobustness.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_ROBUSTNESS_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code vertexAttributeRobustness} field. */
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT vertexAttributeRobustness(@NativeType("VkBool32") boolean value) { nvertexAttributeRobustness(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT set(
        int sType,
        long pNext,
        boolean vertexAttributeRobustness
    ) {
        sType(sType);
        pNext(pNext);
        vertexAttributeRobustness(vertexAttributeRobustness);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT set(VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT malloc() {
        return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT calloc() {
        return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT create(long address) {
        return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #vertexAttributeRobustness}. */
    public static int nvertexAttributeRobustness(long struct) { return memGetInt(struct + VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.VERTEXATTRIBUTEROBUSTNESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #vertexAttributeRobustness(boolean) vertexAttributeRobustness}. */
    public static void nvertexAttributeRobustness(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.VERTEXATTRIBUTEROBUSTNESS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code vertexAttributeRobustness} field. */
        @NativeType("VkBool32")
        public boolean vertexAttributeRobustness() { return VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.nvertexAttributeRobustness(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVertexAttributeRobustness#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_ROBUSTNESS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_ROBUSTNESS_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.Buffer sType$Default() { return sType(EXTVertexAttributeRobustness.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_ROBUSTNESS_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code vertexAttributeRobustness} field. */
        public VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.Buffer vertexAttributeRobustness(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT.nvertexAttributeRobustness(address(), value ? 1 : 0); return this; }

    }

}