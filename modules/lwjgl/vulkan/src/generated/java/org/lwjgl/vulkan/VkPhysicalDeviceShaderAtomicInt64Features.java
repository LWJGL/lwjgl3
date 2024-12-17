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
 * struct VkPhysicalDeviceShaderAtomicInt64Features {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderBufferInt64Atomics;
 *     VkBool32 shaderSharedInt64Atomics;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderAtomicInt64Features extends Struct<VkPhysicalDeviceShaderAtomicInt64Features> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERBUFFERINT64ATOMICS,
        SHADERSHAREDINT64ATOMICS;

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
        SHADERBUFFERINT64ATOMICS = layout.offsetof(2);
        SHADERSHAREDINT64ATOMICS = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderAtomicInt64Features(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderAtomicInt64Features create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderAtomicInt64Features(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderAtomicInt64Features} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderAtomicInt64Features(ByteBuffer container) {
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
    /** @return the value of the {@code shaderBufferInt64Atomics} field. */
    @NativeType("VkBool32")
    public boolean shaderBufferInt64Atomics() { return nshaderBufferInt64Atomics(address()) != 0; }
    /** @return the value of the {@code shaderSharedInt64Atomics} field. */
    @NativeType("VkBool32")
    public boolean shaderSharedInt64Atomics() { return nshaderSharedInt64Atomics(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderAtomicInt64Features sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderAtomicInt64Features sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderAtomicInt64Features pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderBufferInt64Atomics} field. */
    public VkPhysicalDeviceShaderAtomicInt64Features shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) { nshaderBufferInt64Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSharedInt64Atomics} field. */
    public VkPhysicalDeviceShaderAtomicInt64Features shaderSharedInt64Atomics(@NativeType("VkBool32") boolean value) { nshaderSharedInt64Atomics(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderAtomicInt64Features set(
        int sType,
        long pNext,
        boolean shaderBufferInt64Atomics,
        boolean shaderSharedInt64Atomics
    ) {
        sType(sType);
        pNext(pNext);
        shaderBufferInt64Atomics(shaderBufferInt64Atomics);
        shaderSharedInt64Atomics(shaderSharedInt64Atomics);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderAtomicInt64Features set(VkPhysicalDeviceShaderAtomicInt64Features src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicInt64Features} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderAtomicInt64Features malloc() {
        return new VkPhysicalDeviceShaderAtomicInt64Features(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicInt64Features} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderAtomicInt64Features calloc() {
        return new VkPhysicalDeviceShaderAtomicInt64Features(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicInt64Features} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderAtomicInt64Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderAtomicInt64Features(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicInt64Features} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderAtomicInt64Features create(long address) {
        return new VkPhysicalDeviceShaderAtomicInt64Features(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderAtomicInt64Features createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderAtomicInt64Features(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64Features.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64Features.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64Features.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64Features.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64Features.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64Features.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderAtomicInt64Features.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64Features.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderAtomicInt64Features.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderAtomicInt64Features} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderAtomicInt64Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderAtomicInt64Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderAtomicInt64Features} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderAtomicInt64Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderAtomicInt64Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64Features.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64Features.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64Features.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64Features.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicInt64Features.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderAtomicInt64Features.PNEXT); }
    /** Unsafe version of {@link #shaderBufferInt64Atomics}. */
    public static int nshaderBufferInt64Atomics(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicInt64Features.SHADERBUFFERINT64ATOMICS); }
    /** Unsafe version of {@link #shaderSharedInt64Atomics}. */
    public static int nshaderSharedInt64Atomics(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicInt64Features.SHADERSHAREDINT64ATOMICS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicInt64Features.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderAtomicInt64Features.PNEXT, value); }
    /** Unsafe version of {@link #shaderBufferInt64Atomics(boolean) shaderBufferInt64Atomics}. */
    public static void nshaderBufferInt64Atomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicInt64Features.SHADERBUFFERINT64ATOMICS, value); }
    /** Unsafe version of {@link #shaderSharedInt64Atomics(boolean) shaderSharedInt64Atomics}. */
    public static void nshaderSharedInt64Atomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicInt64Features.SHADERSHAREDINT64ATOMICS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderAtomicInt64Features} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderAtomicInt64Features, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderAtomicInt64Features ELEMENT_FACTORY = VkPhysicalDeviceShaderAtomicInt64Features.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderAtomicInt64Features.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderAtomicInt64Features#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderAtomicInt64Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderAtomicInt64Features.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderAtomicInt64Features.npNext(address()); }
        /** @return the value of the {@code shaderBufferInt64Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderBufferInt64Atomics() { return VkPhysicalDeviceShaderAtomicInt64Features.nshaderBufferInt64Atomics(address()) != 0; }
        /** @return the value of the {@code shaderSharedInt64Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderSharedInt64Atomics() { return VkPhysicalDeviceShaderAtomicInt64Features.nshaderSharedInt64Atomics(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderAtomicInt64Features.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicInt64Features.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderAtomicInt64Features.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderAtomicInt64Features.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderAtomicInt64Features.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderBufferInt64Atomics} field. */
        public VkPhysicalDeviceShaderAtomicInt64Features.Buffer shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicInt64Features.nshaderBufferInt64Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSharedInt64Atomics} field. */
        public VkPhysicalDeviceShaderAtomicInt64Features.Buffer shaderSharedInt64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicInt64Features.nshaderSharedInt64Atomics(address(), value ? 1 : 0); return this; }

    }

}