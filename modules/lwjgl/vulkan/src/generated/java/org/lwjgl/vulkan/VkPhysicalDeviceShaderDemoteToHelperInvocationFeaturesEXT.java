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
 * <p>If the {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTShaderDemoteToHelperInvocation#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderDemoteToHelperInvocation};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT extends Struct implements NativeResource {

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
     * Creates a {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT(ByteBuffer container) {
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
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderDemoteToHelperInvocation} field. */
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT shaderDemoteToHelperInvocation(@NativeType("VkBool32") boolean value) { nshaderDemoteToHelperInvocation(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT set(
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
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT set(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #shaderDemoteToHelperInvocation}. */
    public static int nshaderDemoteToHelperInvocation(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.SHADERDEMOTETOHELPERINVOCATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #shaderDemoteToHelperInvocation(boolean) shaderDemoteToHelperInvocation}. */
    public static void nshaderDemoteToHelperInvocation(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.SHADERDEMOTETOHELPERINVOCATION, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT#shaderDemoteToHelperInvocation} field. */
        @NativeType("VkBool32")
        public boolean shaderDemoteToHelperInvocation() { return VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.nshaderDemoteToHelperInvocation(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT#sType} field. */
        public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT#shaderDemoteToHelperInvocation} field. */
        public VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.Buffer shaderDemoteToHelperInvocation(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT.nshaderDemoteToHelperInvocation(address(), value ? 1 : 0); return this; }

    }

}