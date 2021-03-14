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
 * Structure describing support for the SPIR-V {@code SPV_KHR_terminate_invocation} extension.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2}, it is filled with a value indicating whether the feature is supported. {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} <b>can</b> also be included in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable the features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRShaderTerminateInvocation#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code shaderTerminateInvocation} &ndash; specifies whether the implementation supports SPIR-V modules that use the {@code SPV_KHR_terminate_invocation} extension.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderTerminateInvocation;
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERTERMINATEINVOCATION;

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
        SHADERTERMINATEINVOCATION = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code shaderTerminateInvocation} field. */
    @NativeType("VkBool32")
    public boolean shaderTerminateInvocation() { return nshaderTerminateInvocation(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderTerminateInvocation} field. */
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR shaderTerminateInvocation(@NativeType("VkBool32") boolean value) { nshaderTerminateInvocation(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR set(
        int sType,
        long pNext,
        boolean shaderTerminateInvocation
    ) {
        sType(sType);
        pNext(pNext);
        shaderTerminateInvocation(shaderTerminateInvocation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR set(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #shaderTerminateInvocation}. */
    public static int nshaderTerminateInvocation(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.SHADERTERMINATEINVOCATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #shaderTerminateInvocation(boolean) shaderTerminateInvocation}. */
    public static void nshaderTerminateInvocation(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.SHADERTERMINATEINVOCATION, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.npNext(address()); }
        /** Returns the value of the {@code shaderTerminateInvocation} field. */
        @NativeType("VkBool32")
        public boolean shaderTerminateInvocation() { return VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.nshaderTerminateInvocation(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderTerminateInvocation} field. */
        public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.Buffer shaderTerminateInvocation(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR.nshaderTerminateInvocation(address(), value ? 1 : 0); return this; }

    }

}