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
 * struct VkPhysicalDeviceShaderBfloat16FeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderBFloat16Type;
 *     VkBool32 shaderBFloat16DotProduct;
 *     VkBool32 shaderBFloat16CooperativeMatrix;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderBfloat16FeaturesKHR extends Struct<VkPhysicalDeviceShaderBfloat16FeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERBFLOAT16TYPE,
        SHADERBFLOAT16DOTPRODUCT,
        SHADERBFLOAT16COOPERATIVEMATRIX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERBFLOAT16TYPE = layout.offsetof(2);
        SHADERBFLOAT16DOTPRODUCT = layout.offsetof(3);
        SHADERBFLOAT16COOPERATIVEMATRIX = layout.offsetof(4);
    }

    protected VkPhysicalDeviceShaderBfloat16FeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderBfloat16FeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderBfloat16FeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code shaderBFloat16Type} field. */
    @NativeType("VkBool32")
    public boolean shaderBFloat16Type() { return nshaderBFloat16Type(address()) != 0; }
    /** @return the value of the {@code shaderBFloat16DotProduct} field. */
    @NativeType("VkBool32")
    public boolean shaderBFloat16DotProduct() { return nshaderBFloat16DotProduct(address()) != 0; }
    /** @return the value of the {@code shaderBFloat16CooperativeMatrix} field. */
    @NativeType("VkBool32")
    public boolean shaderBFloat16CooperativeMatrix() { return nshaderBFloat16CooperativeMatrix(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRShaderBfloat16#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_BFLOAT16_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_BFLOAT16_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR sType$Default() { return sType(KHRShaderBfloat16.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_BFLOAT16_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderBFloat16Type} field. */
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16Type(@NativeType("VkBool32") boolean value) { nshaderBFloat16Type(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderBFloat16DotProduct} field. */
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16DotProduct(@NativeType("VkBool32") boolean value) { nshaderBFloat16DotProduct(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderBFloat16CooperativeMatrix} field. */
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16CooperativeMatrix(@NativeType("VkBool32") boolean value) { nshaderBFloat16CooperativeMatrix(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR set(
        int sType,
        long pNext,
        boolean shaderBFloat16Type,
        boolean shaderBFloat16DotProduct,
        boolean shaderBFloat16CooperativeMatrix
    ) {
        sType(sType);
        pNext(pNext);
        shaderBFloat16Type(shaderBFloat16Type);
        shaderBFloat16DotProduct(shaderBFloat16DotProduct);
        shaderBFloat16CooperativeMatrix(shaderBFloat16CooperativeMatrix);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR set(VkPhysicalDeviceShaderBfloat16FeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderBfloat16FeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderBfloat16FeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderBfloat16FeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderBfloat16FeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderBfloat16FeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderBfloat16FeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderBfloat16FeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderBfloat16FeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderBfloat16FeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderBfloat16FeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #shaderBFloat16Type}. */
    public static int nshaderBFloat16Type(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderBfloat16FeaturesKHR.SHADERBFLOAT16TYPE); }
    /** Unsafe version of {@link #shaderBFloat16DotProduct}. */
    public static int nshaderBFloat16DotProduct(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderBfloat16FeaturesKHR.SHADERBFLOAT16DOTPRODUCT); }
    /** Unsafe version of {@link #shaderBFloat16CooperativeMatrix}. */
    public static int nshaderBFloat16CooperativeMatrix(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderBfloat16FeaturesKHR.SHADERBFLOAT16COOPERATIVEMATRIX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderBfloat16FeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderBfloat16FeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #shaderBFloat16Type(boolean) shaderBFloat16Type}. */
    public static void nshaderBFloat16Type(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderBfloat16FeaturesKHR.SHADERBFLOAT16TYPE, value); }
    /** Unsafe version of {@link #shaderBFloat16DotProduct(boolean) shaderBFloat16DotProduct}. */
    public static void nshaderBFloat16DotProduct(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderBfloat16FeaturesKHR.SHADERBFLOAT16DOTPRODUCT, value); }
    /** Unsafe version of {@link #shaderBFloat16CooperativeMatrix(boolean) shaderBFloat16CooperativeMatrix}. */
    public static void nshaderBFloat16CooperativeMatrix(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderBfloat16FeaturesKHR.SHADERBFLOAT16COOPERATIVEMATRIX, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderBfloat16FeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderBfloat16FeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderBfloat16FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderBfloat16FeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderBfloat16FeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderBfloat16FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderBfloat16FeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderBfloat16FeaturesKHR.npNext(address()); }
        /** @return the value of the {@code shaderBFloat16Type} field. */
        @NativeType("VkBool32")
        public boolean shaderBFloat16Type() { return VkPhysicalDeviceShaderBfloat16FeaturesKHR.nshaderBFloat16Type(address()) != 0; }
        /** @return the value of the {@code shaderBFloat16DotProduct} field. */
        @NativeType("VkBool32")
        public boolean shaderBFloat16DotProduct() { return VkPhysicalDeviceShaderBfloat16FeaturesKHR.nshaderBFloat16DotProduct(address()) != 0; }
        /** @return the value of the {@code shaderBFloat16CooperativeMatrix} field. */
        @NativeType("VkBool32")
        public boolean shaderBFloat16CooperativeMatrix() { return VkPhysicalDeviceShaderBfloat16FeaturesKHR.nshaderBFloat16CooperativeMatrix(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderBfloat16FeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRShaderBfloat16#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_BFLOAT16_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_BFLOAT16_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer sType$Default() { return sType(KHRShaderBfloat16.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_BFLOAT16_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderBfloat16FeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderBFloat16Type} field. */
        public VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer shaderBFloat16Type(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderBfloat16FeaturesKHR.nshaderBFloat16Type(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderBFloat16DotProduct} field. */
        public VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer shaderBFloat16DotProduct(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderBfloat16FeaturesKHR.nshaderBFloat16DotProduct(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderBFloat16CooperativeMatrix} field. */
        public VkPhysicalDeviceShaderBfloat16FeaturesKHR.Buffer shaderBFloat16CooperativeMatrix(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderBfloat16FeaturesKHR.nshaderBFloat16CooperativeMatrix(address(), value ? 1 : 0); return this; }

    }

}