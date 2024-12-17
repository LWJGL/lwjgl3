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
 * struct VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderImageInt64Atomics;
 *     VkBool32 sparseImageInt64Atomics;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT extends Struct<VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERIMAGEINT64ATOMICS,
        SPARSEIMAGEINT64ATOMICS;

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
        SHADERIMAGEINT64ATOMICS = layout.offsetof(2);
        SPARSEIMAGEINT64ATOMICS = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code shaderImageInt64Atomics} field. */
    @NativeType("VkBool32")
    public boolean shaderImageInt64Atomics() { return nshaderImageInt64Atomics(address()) != 0; }
    /** @return the value of the {@code sparseImageInt64Atomics} field. */
    @NativeType("VkBool32")
    public boolean sparseImageInt64Atomics() { return nsparseImageInt64Atomics(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderImageAtomicInt64#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sType$Default() { return sType(EXTShaderImageAtomicInt64.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderImageInt64Atomics} field. */
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT shaderImageInt64Atomics(@NativeType("VkBool32") boolean value) { nshaderImageInt64Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sparseImageInt64Atomics} field. */
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sparseImageInt64Atomics(@NativeType("VkBool32") boolean value) { nsparseImageInt64Atomics(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT set(
        int sType,
        long pNext,
        boolean shaderImageInt64Atomics,
        boolean sparseImageInt64Atomics
    ) {
        sType(sType);
        pNext(pNext);
        shaderImageInt64Atomics(shaderImageInt64Atomics);
        sparseImageInt64Atomics(sparseImageInt64Atomics);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT set(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #shaderImageInt64Atomics}. */
    public static int nshaderImageInt64Atomics(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.SHADERIMAGEINT64ATOMICS); }
    /** Unsafe version of {@link #sparseImageInt64Atomics}. */
    public static int nsparseImageInt64Atomics(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.SPARSEIMAGEINT64ATOMICS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #shaderImageInt64Atomics(boolean) shaderImageInt64Atomics}. */
    public static void nshaderImageInt64Atomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.SHADERIMAGEINT64ATOMICS, value); }
    /** Unsafe version of {@link #sparseImageInt64Atomics(boolean) sparseImageInt64Atomics}. */
    public static void nsparseImageInt64Atomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.SPARSEIMAGEINT64ATOMICS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.npNext(address()); }
        /** @return the value of the {@code shaderImageInt64Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderImageInt64Atomics() { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nshaderImageInt64Atomics(address()) != 0; }
        /** @return the value of the {@code sparseImageInt64Atomics} field. */
        @NativeType("VkBool32")
        public boolean sparseImageInt64Atomics() { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nsparseImageInt64Atomics(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderImageAtomicInt64#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer sType$Default() { return sType(EXTShaderImageAtomicInt64.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderImageInt64Atomics} field. */
        public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer shaderImageInt64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nshaderImageInt64Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sparseImageInt64Atomics} field. */
        public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.Buffer sparseImageInt64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nsparseImageInt64Atomics(address(), value ? 1 : 0); return this; }

    }

}