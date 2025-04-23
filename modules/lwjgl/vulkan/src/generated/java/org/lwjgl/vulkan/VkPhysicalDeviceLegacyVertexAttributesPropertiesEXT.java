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
 * struct VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 nativeUnalignedPerformance;
 * }}</pre>
 */
public class VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT extends Struct<VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NATIVEUNALIGNEDPERFORMANCE;

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
        NATIVEUNALIGNEDPERFORMANCE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code nativeUnalignedPerformance} field. */
    @NativeType("VkBool32")
    public boolean nativeUnalignedPerformance() { return nnativeUnalignedPerformance(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTLegacyVertexAttributes#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT sType$Default() { return sType(EXTLegacyVertexAttributes.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT set(
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
    public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT set(VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT malloc() {
        return new VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT calloc() {
        return new VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT create(long address) {
        return new VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #nativeUnalignedPerformance}. */
    public static int nnativeUnalignedPerformance(long struct) { return memGetInt(struct + VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.NATIVEUNALIGNEDPERFORMANCE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.npNext(address()); }
        /** @return the value of the {@code nativeUnalignedPerformance} field. */
        @NativeType("VkBool32")
        public boolean nativeUnalignedPerformance() { return VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.nnativeUnalignedPerformance(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTLegacyVertexAttributes#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.Buffer sType$Default() { return sType(EXTLegacyVertexAttributes.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT.npNext(address(), value); return this; }

    }

}