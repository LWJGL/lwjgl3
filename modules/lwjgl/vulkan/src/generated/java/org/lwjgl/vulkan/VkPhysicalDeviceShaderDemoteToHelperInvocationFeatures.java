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
 * Structure describing the shader demote to helper invocations features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderDemoteToHelperInvocation};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERDEMOTETOHELPERINVOCATION;

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
        SHADERDEMOTETOHELPERINVOCATION = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(ByteBuffer container) {
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
    /** indicates whether the implementation supports the SPIR-V {@code DemoteToHelperInvocationEXT} capability. */
    @NativeType("VkBool32")
    public boolean shaderDemoteToHelperInvocation() { return nshaderDemoteToHelperInvocation(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderDemoteToHelperInvocation} field. */
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures shaderDemoteToHelperInvocation(@NativeType("VkBool32") boolean value) { nshaderDemoteToHelperInvocation(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures set(
        int sType,
        long pNext,
        boolean shaderDemoteToHelperInvocation
    ) {
        sType(sType);
        pNext(pNext);
        shaderDemoteToHelperInvocation(shaderDemoteToHelperInvocation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures set(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures malloc() {
        return wrap(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures calloc() {
        return wrap(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures create(long address) {
        return wrap(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.PNEXT); }
    /** Unsafe version of {@link #shaderDemoteToHelperInvocation}. */
    public static int nshaderDemoteToHelperInvocation(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.SHADERDEMOTETOHELPERINVOCATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.PNEXT, value); }
    /** Unsafe version of {@link #shaderDemoteToHelperInvocation(boolean) shaderDemoteToHelperInvocation}. */
    public static void nshaderDemoteToHelperInvocation(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.SHADERDEMOTETOHELPERINVOCATION, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures ELEMENT_FACTORY = VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures#shaderDemoteToHelperInvocation} field. */
        @NativeType("VkBool32")
        public boolean shaderDemoteToHelperInvocation() { return VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.nshaderDemoteToHelperInvocation(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures#sType} field. */
        public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES} value to the {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures#sType} field. */
        public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures#pNext} field. */
        public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures#shaderDemoteToHelperInvocation} field. */
        public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer shaderDemoteToHelperInvocation(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.nshaderDemoteToHelperInvocation(address(), value ? 1 : 0); return this; }

    }

}