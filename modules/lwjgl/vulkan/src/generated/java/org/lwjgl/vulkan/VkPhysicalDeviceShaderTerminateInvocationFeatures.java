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
 * Structure describing support for the SPIR-V {@code SPV_KHR_terminate_invocation} extension.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderTerminateInvocationFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceShaderTerminateInvocationFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderTerminateInvocationFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderTerminateInvocation};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderTerminateInvocationFeatures extends Struct<VkPhysicalDeviceShaderTerminateInvocationFeatures> implements NativeResource {

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

    protected VkPhysicalDeviceShaderTerminateInvocationFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderTerminateInvocationFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderTerminateInvocationFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderTerminateInvocationFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderTerminateInvocationFeatures(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** specifies whether the implementation supports SPIR-V modules that use the {@code SPV_KHR_terminate_invocation} extension. */
    @NativeType("VkBool32")
    public boolean shaderTerminateInvocation() { return nshaderTerminateInvocation(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderTerminateInvocationFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderTerminateInvocationFeatures sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderTerminateInvocationFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderTerminateInvocation} field. */
    public VkPhysicalDeviceShaderTerminateInvocationFeatures shaderTerminateInvocation(@NativeType("VkBool32") boolean value) { nshaderTerminateInvocation(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderTerminateInvocationFeatures set(
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
    public VkPhysicalDeviceShaderTerminateInvocationFeatures set(VkPhysicalDeviceShaderTerminateInvocationFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderTerminateInvocationFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderTerminateInvocationFeatures malloc() {
        return new VkPhysicalDeviceShaderTerminateInvocationFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderTerminateInvocationFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderTerminateInvocationFeatures calloc() {
        return new VkPhysicalDeviceShaderTerminateInvocationFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderTerminateInvocationFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderTerminateInvocationFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderTerminateInvocationFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderTerminateInvocationFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderTerminateInvocationFeatures create(long address) {
        return new VkPhysicalDeviceShaderTerminateInvocationFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderTerminateInvocationFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderTerminateInvocationFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderTerminateInvocationFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderTerminateInvocationFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderTerminateInvocationFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderTerminateInvocationFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderTerminateInvocationFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderTerminateInvocationFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderTerminateInvocationFeatures.PNEXT); }
    /** Unsafe version of {@link #shaderTerminateInvocation}. */
    public static int nshaderTerminateInvocation(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderTerminateInvocationFeatures.SHADERTERMINATEINVOCATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderTerminateInvocationFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderTerminateInvocationFeatures.PNEXT, value); }
    /** Unsafe version of {@link #shaderTerminateInvocation(boolean) shaderTerminateInvocation}. */
    public static void nshaderTerminateInvocation(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderTerminateInvocationFeatures.SHADERTERMINATEINVOCATION, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderTerminateInvocationFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderTerminateInvocationFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderTerminateInvocationFeatures ELEMENT_FACTORY = VkPhysicalDeviceShaderTerminateInvocationFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderTerminateInvocationFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderTerminateInvocationFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderTerminateInvocationFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderTerminateInvocationFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderTerminateInvocationFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderTerminateInvocationFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderTerminateInvocationFeatures#shaderTerminateInvocation} field. */
        @NativeType("VkBool32")
        public boolean shaderTerminateInvocation() { return VkPhysicalDeviceShaderTerminateInvocationFeatures.nshaderTerminateInvocation(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderTerminateInvocationFeatures#sType} field. */
        public VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderTerminateInvocationFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES} value to the {@link VkPhysicalDeviceShaderTerminateInvocationFeatures#sType} field. */
        public VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderTerminateInvocationFeatures#pNext} field. */
        public VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderTerminateInvocationFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderTerminateInvocationFeatures#shaderTerminateInvocation} field. */
        public VkPhysicalDeviceShaderTerminateInvocationFeatures.Buffer shaderTerminateInvocation(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderTerminateInvocationFeatures.nshaderTerminateInvocation(address(), value ? 1 : 0); return this; }

    }

}