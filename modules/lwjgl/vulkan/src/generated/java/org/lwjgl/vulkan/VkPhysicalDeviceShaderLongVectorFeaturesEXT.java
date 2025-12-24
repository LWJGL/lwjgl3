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
 * struct VkPhysicalDeviceShaderLongVectorFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 longVector;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderLongVectorFeaturesEXT extends Struct<VkPhysicalDeviceShaderLongVectorFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        LONGVECTOR;

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
        LONGVECTOR = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderLongVectorFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderLongVectorFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderLongVectorFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderLongVectorFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderLongVectorFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code longVector} field. */
    @NativeType("VkBool32")
    public boolean longVector() { return nlongVector(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderLongVectorFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderLongVector#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_LONG_VECTOR_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_LONG_VECTOR_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderLongVectorFeaturesEXT sType$Default() { return sType(EXTShaderLongVector.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_LONG_VECTOR_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderLongVectorFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code longVector} field. */
    public VkPhysicalDeviceShaderLongVectorFeaturesEXT longVector(@NativeType("VkBool32") boolean value) { nlongVector(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderLongVectorFeaturesEXT set(
        int sType,
        long pNext,
        boolean longVector
    ) {
        sType(sType);
        pNext(pNext);
        longVector(longVector);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderLongVectorFeaturesEXT set(VkPhysicalDeviceShaderLongVectorFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderLongVectorFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderLongVectorFeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderLongVectorFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderLongVectorFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderLongVectorFeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderLongVectorFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderLongVectorFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderLongVectorFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderLongVectorFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderLongVectorFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderLongVectorFeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderLongVectorFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderLongVectorFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderLongVectorFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderLongVectorFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderLongVectorFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderLongVectorFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderLongVectorFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderLongVectorFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderLongVectorFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderLongVectorFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderLongVectorFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderLongVectorFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderLongVectorFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderLongVectorFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderLongVectorFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderLongVectorFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderLongVectorFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderLongVectorFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderLongVectorFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderLongVectorFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderLongVectorFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderLongVectorFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderLongVectorFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderLongVectorFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #longVector}. */
    public static int nlongVector(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderLongVectorFeaturesEXT.LONGVECTOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderLongVectorFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderLongVectorFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #longVector(boolean) longVector}. */
    public static void nlongVector(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderLongVectorFeaturesEXT.LONGVECTOR, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderLongVectorFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderLongVectorFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderLongVectorFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderLongVectorFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderLongVectorFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderLongVectorFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderLongVectorFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderLongVectorFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderLongVectorFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code longVector} field. */
        @NativeType("VkBool32")
        public boolean longVector() { return VkPhysicalDeviceShaderLongVectorFeaturesEXT.nlongVector(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderLongVectorFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderLongVectorFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderLongVector#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_LONG_VECTOR_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_LONG_VECTOR_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderLongVectorFeaturesEXT.Buffer sType$Default() { return sType(EXTShaderLongVector.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_LONG_VECTOR_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderLongVectorFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderLongVectorFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code longVector} field. */
        public VkPhysicalDeviceShaderLongVectorFeaturesEXT.Buffer longVector(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderLongVectorFeaturesEXT.nlongVector(address(), value ? 1 : 0); return this; }

    }

}