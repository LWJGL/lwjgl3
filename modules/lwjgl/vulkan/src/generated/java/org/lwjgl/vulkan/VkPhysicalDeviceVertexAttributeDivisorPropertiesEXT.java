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
 * struct VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxVertexAttribDivisor;
 * }}</pre>
 */
public class VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT extends Struct<VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXVERTEXATTRIBDIVISOR;

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
        MAXVERTEXATTRIBDIVISOR = layout.offsetof(2);
    }

    protected VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code maxVertexAttribDivisor} field. */
    @NativeType("uint32_t")
    public int maxVertexAttribDivisor() { return nmaxVertexAttribDivisor(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVertexAttributeDivisor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT sType$Default() { return sType(EXTVertexAttributeDivisor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT set(
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
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT set(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT malloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT calloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT create(long address) {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #maxVertexAttribDivisor}. */
    public static int nmaxVertexAttribDivisor(long struct) { return memGetInt(struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.MAXVERTEXATTRIBDIVISOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.npNext(address()); }
        /** @return the value of the {@code maxVertexAttribDivisor} field. */
        @NativeType("uint32_t")
        public int maxVertexAttribDivisor() { return VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.nmaxVertexAttribDivisor(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVertexAttributeDivisor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer sType$Default() { return sType(EXTVertexAttributeDivisor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.npNext(address(), value); return this; }

    }

}