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
 * Structure describing integer dot product features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderIntegerDotProductFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceShaderIntegerDotProductFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderIntegerDotProductFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderIntegerDotProduct};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderIntegerDotProductFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERINTEGERDOTPRODUCT;

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
        SHADERINTEGERDOTPRODUCT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderIntegerDotProductFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderIntegerDotProductFeatures(ByteBuffer container) {
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
    /** specifies whether shader modules <b>can</b> declare the {@code DotProductInputAllKHR}, {@code DotProductInput4x8BitKHR}, {@code DotProductInput4x8BitPackedKHR} and {@code DotProductKHR} capabilities. */
    @NativeType("VkBool32")
    public boolean shaderIntegerDotProduct() { return nshaderIntegerDotProduct(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderIntegerDotProductFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderIntegerDotProductFeatures sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderIntegerDotProductFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderIntegerDotProduct} field. */
    public VkPhysicalDeviceShaderIntegerDotProductFeatures shaderIntegerDotProduct(@NativeType("VkBool32") boolean value) { nshaderIntegerDotProduct(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderIntegerDotProductFeatures set(
        int sType,
        long pNext,
        boolean shaderIntegerDotProduct
    ) {
        sType(sType);
        pNext(pNext);
        shaderIntegerDotProduct(shaderIntegerDotProduct);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderIntegerDotProductFeatures set(VkPhysicalDeviceShaderIntegerDotProductFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderIntegerDotProductFeatures malloc() {
        return wrap(VkPhysicalDeviceShaderIntegerDotProductFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderIntegerDotProductFeatures calloc() {
        return wrap(VkPhysicalDeviceShaderIntegerDotProductFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderIntegerDotProductFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderIntegerDotProductFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderIntegerDotProductFeatures create(long address) {
        return wrap(VkPhysicalDeviceShaderIntegerDotProductFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderIntegerDotProductFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderIntegerDotProductFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderIntegerDotProductFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderIntegerDotProductFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderIntegerDotProductFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderIntegerDotProductFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderIntegerDotProductFeatures.PNEXT); }
    /** Unsafe version of {@link #shaderIntegerDotProduct}. */
    public static int nshaderIntegerDotProduct(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductFeatures.SHADERINTEGERDOTPRODUCT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderIntegerDotProductFeatures.PNEXT, value); }
    /** Unsafe version of {@link #shaderIntegerDotProduct(boolean) shaderIntegerDotProduct}. */
    public static void nshaderIntegerDotProduct(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderIntegerDotProductFeatures.SHADERINTEGERDOTPRODUCT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderIntegerDotProductFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderIntegerDotProductFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderIntegerDotProductFeatures ELEMENT_FACTORY = VkPhysicalDeviceShaderIntegerDotProductFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderIntegerDotProductFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShaderIntegerDotProductFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderIntegerDotProductFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderIntegerDotProductFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderIntegerDotProductFeatures#shaderIntegerDotProduct} field. */
        @NativeType("VkBool32")
        public boolean shaderIntegerDotProduct() { return VkPhysicalDeviceShaderIntegerDotProductFeatures.nshaderIntegerDotProduct(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductFeatures#sType} field. */
        public VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderIntegerDotProductFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES} value to the {@link VkPhysicalDeviceShaderIntegerDotProductFeatures#sType} field. */
        public VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductFeatures#pNext} field. */
        public VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderIntegerDotProductFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderIntegerDotProductFeatures#shaderIntegerDotProduct} field. */
        public VkPhysicalDeviceShaderIntegerDotProductFeatures.Buffer shaderIntegerDotProduct(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderIntegerDotProductFeatures.nshaderIntegerDotProduct(address(), value ? 1 : 0); return this; }

    }

}