/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing features supported by VK_KHR_shader_atomic_int64.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderAtomicInt64Features} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceShaderAtomicInt64Features} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderAtomicInt64Features {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderBufferInt64Atomics};
 *     VkBool32 {@link #shaderSharedInt64Atomics};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderAtomicInt64Features extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether shaders <b>can</b> perform 64-bit unsigned and signed integer atomic operations on buffers. */
    @NativeType("VkBool32")
    public boolean shaderBufferInt64Atomics() { return nshaderBufferInt64Atomics(address()) != 0; }
    /** indicates whether shaders <b>can</b> perform 64-bit unsigned and signed integer atomic operations on shared memory. */
    @NativeType("VkBool32")
    public boolean shaderSharedInt64Atomics() { return nshaderSharedInt64Atomics(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderAtomicInt64Features sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderAtomicInt64Features sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderAtomicInt64Features pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderBufferInt64Atomics} field. */
    public VkPhysicalDeviceShaderAtomicInt64Features shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) { nshaderBufferInt64Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderSharedInt64Atomics} field. */
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
        return wrap(VkPhysicalDeviceShaderAtomicInt64Features.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicInt64Features} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderAtomicInt64Features calloc() {
        return wrap(VkPhysicalDeviceShaderAtomicInt64Features.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicInt64Features} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderAtomicInt64Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderAtomicInt64Features.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicInt64Features} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderAtomicInt64Features create(long address) {
        return wrap(VkPhysicalDeviceShaderAtomicInt64Features.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderAtomicInt64Features createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderAtomicInt64Features.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64Features.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64Features.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64Features.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64Features.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64Features.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64Features.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderAtomicInt64Features.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64Features.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderAtomicInt64Features.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderAtomicInt64Features} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderAtomicInt64Features malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderAtomicInt64Features.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderAtomicInt64Features} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderAtomicInt64Features calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderAtomicInt64Features.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64Features.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64Features.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64Features.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64Features.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderAtomicInt64Features.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderAtomicInt64Features.PNEXT); }
    /** Unsafe version of {@link #shaderBufferInt64Atomics}. */
    public static int nshaderBufferInt64Atomics(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderAtomicInt64Features.SHADERBUFFERINT64ATOMICS); }
    /** Unsafe version of {@link #shaderSharedInt64Atomics}. */
    public static int nshaderSharedInt64Atomics(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderAtomicInt64Features.SHADERSHAREDINT64ATOMICS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderAtomicInt64Features.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderAtomicInt64Features.PNEXT, value); }
    /** Unsafe version of {@link #shaderBufferInt64Atomics(boolean) shaderBufferInt64Atomics}. */
    public static void nshaderBufferInt64Atomics(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderAtomicInt64Features.SHADERBUFFERINT64ATOMICS, value); }
    /** Unsafe version of {@link #shaderSharedInt64Atomics(boolean) shaderSharedInt64Atomics}. */
    public static void nshaderSharedInt64Atomics(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderAtomicInt64Features.SHADERSHAREDINT64ATOMICS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderAtomicInt64Features} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderAtomicInt64Features, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderAtomicInt64Features ELEMENT_FACTORY = VkPhysicalDeviceShaderAtomicInt64Features.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderAtomicInt64Features.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderAtomicInt64Features#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShaderAtomicInt64Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicInt64Features#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderAtomicInt64Features.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicInt64Features#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderAtomicInt64Features.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicInt64Features#shaderBufferInt64Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderBufferInt64Atomics() { return VkPhysicalDeviceShaderAtomicInt64Features.nshaderBufferInt64Atomics(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderAtomicInt64Features#shaderSharedInt64Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderSharedInt64Atomics() { return VkPhysicalDeviceShaderAtomicInt64Features.nshaderSharedInt64Atomics(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicInt64Features#sType} field. */
        public VkPhysicalDeviceShaderAtomicInt64Features.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicInt64Features.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES} value to the {@link VkPhysicalDeviceShaderAtomicInt64Features#sType} field. */
        public VkPhysicalDeviceShaderAtomicInt64Features.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicInt64Features#pNext} field. */
        public VkPhysicalDeviceShaderAtomicInt64Features.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderAtomicInt64Features.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicInt64Features#shaderBufferInt64Atomics} field. */
        public VkPhysicalDeviceShaderAtomicInt64Features.Buffer shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicInt64Features.nshaderBufferInt64Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderAtomicInt64Features#shaderSharedInt64Atomics} field. */
        public VkPhysicalDeviceShaderAtomicInt64Features.Buffer shaderSharedInt64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicInt64Features.nshaderSharedInt64Atomics(address(), value ? 1 : 0); return this; }

    }

}