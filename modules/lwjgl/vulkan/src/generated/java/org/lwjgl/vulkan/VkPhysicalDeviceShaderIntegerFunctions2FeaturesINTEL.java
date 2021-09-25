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
 * Structure describing shader integer functions that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link INTELShaderIntegerFunctions2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES_INTEL STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES_INTEL}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderIntegerFunctions2};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERINTEGERFUNCTIONS2;

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
        SHADERINTEGERFUNCTIONS2 = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(ByteBuffer container) {
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
    /** indicates that the implementation supports the {@code IntegerFunctions2INTEL} SPIR-V capability. */
    @NativeType("VkBool32")
    public boolean shaderIntegerFunctions2() { return nshaderIntegerFunctions2(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link INTELShaderIntegerFunctions2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES_INTEL STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES_INTEL} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL sType$Default() { return sType(INTELShaderIntegerFunctions2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES_INTEL); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderIntegerFunctions2} field. */
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL shaderIntegerFunctions2(@NativeType("VkBool32") boolean value) { nshaderIntegerFunctions2(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL set(
        int sType,
        long pNext,
        boolean shaderIntegerFunctions2
    ) {
        sType(sType);
        pNext(pNext);
        shaderIntegerFunctions2(shaderIntegerFunctions2);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL set(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL malloc() {
        return wrap(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL calloc() {
        return wrap(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL create(long address) {
        return wrap(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.PNEXT); }
    /** Unsafe version of {@link #shaderIntegerFunctions2}. */
    public static int nshaderIntegerFunctions2(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.SHADERINTEGERFUNCTIONS2); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.PNEXT, value); }
    /** Unsafe version of {@link #shaderIntegerFunctions2(boolean) shaderIntegerFunctions2}. */
    public static void nshaderIntegerFunctions2(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.SHADERINTEGERFUNCTIONS2, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL ELEMENT_FACTORY = VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL#shaderIntegerFunctions2} field. */
        @NativeType("VkBool32")
        public boolean shaderIntegerFunctions2() { return VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.nshaderIntegerFunctions2(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL#sType} field. */
        public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.nsType(address(), value); return this; }
        /** Sets the {@link INTELShaderIntegerFunctions2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES_INTEL STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES_INTEL} value to the {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL#sType} field. */
        public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer sType$Default() { return sType(INTELShaderIntegerFunctions2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES_INTEL); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL#pNext} field. */
        public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL#shaderIntegerFunctions2} field. */
        public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.Buffer shaderIntegerFunctions2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.nshaderIntegerFunctions2(address(), value ? 1 : 0); return this; }

    }

}