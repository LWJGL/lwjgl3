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
 * struct VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderMixedFloatDotProductFloat16AccFloat32;
 *     VkBool32 shaderMixedFloatDotProductFloat16AccFloat16;
 *     VkBool32 shaderMixedFloatDotProductBFloat16Acc;
 *     VkBool32 shaderMixedFloatDotProductFloat8AccFloat32;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE extends Struct<VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERMIXEDFLOATDOTPRODUCTFLOAT16ACCFLOAT32,
        SHADERMIXEDFLOATDOTPRODUCTFLOAT16ACCFLOAT16,
        SHADERMIXEDFLOATDOTPRODUCTBFLOAT16ACC,
        SHADERMIXEDFLOATDOTPRODUCTFLOAT8ACCFLOAT32;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERMIXEDFLOATDOTPRODUCTFLOAT16ACCFLOAT32 = layout.offsetof(2);
        SHADERMIXEDFLOATDOTPRODUCTFLOAT16ACCFLOAT16 = layout.offsetof(3);
        SHADERMIXEDFLOATDOTPRODUCTBFLOAT16ACC = layout.offsetof(4);
        SHADERMIXEDFLOATDOTPRODUCTFLOAT8ACCFLOAT32 = layout.offsetof(5);
    }

    protected VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE(ByteBuffer container) {
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
    /** @return the value of the {@code shaderMixedFloatDotProductFloat16AccFloat32} field. */
    @NativeType("VkBool32")
    public boolean shaderMixedFloatDotProductFloat16AccFloat32() { return nshaderMixedFloatDotProductFloat16AccFloat32(address()) != 0; }
    /** @return the value of the {@code shaderMixedFloatDotProductFloat16AccFloat16} field. */
    @NativeType("VkBool32")
    public boolean shaderMixedFloatDotProductFloat16AccFloat16() { return nshaderMixedFloatDotProductFloat16AccFloat16(address()) != 0; }
    /** @return the value of the {@code shaderMixedFloatDotProductBFloat16Acc} field. */
    @NativeType("VkBool32")
    public boolean shaderMixedFloatDotProductBFloat16Acc() { return nshaderMixedFloatDotProductBFloat16Acc(address()) != 0; }
    /** @return the value of the {@code shaderMixedFloatDotProductFloat8AccFloat32} field. */
    @NativeType("VkBool32")
    public boolean shaderMixedFloatDotProductFloat8AccFloat32() { return nshaderMixedFloatDotProductFloat8AccFloat32(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VALVEShaderMixedFloatDotProduct#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MIXED_FLOAT_DOT_PRODUCT_FEATURES_VALVE STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MIXED_FLOAT_DOT_PRODUCT_FEATURES_VALVE} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE sType$Default() { return sType(VALVEShaderMixedFloatDotProduct.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MIXED_FLOAT_DOT_PRODUCT_FEATURES_VALVE); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderMixedFloatDotProductFloat16AccFloat32} field. */
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE shaderMixedFloatDotProductFloat16AccFloat32(@NativeType("VkBool32") boolean value) { nshaderMixedFloatDotProductFloat16AccFloat32(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderMixedFloatDotProductFloat16AccFloat16} field. */
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE shaderMixedFloatDotProductFloat16AccFloat16(@NativeType("VkBool32") boolean value) { nshaderMixedFloatDotProductFloat16AccFloat16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderMixedFloatDotProductBFloat16Acc} field. */
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE shaderMixedFloatDotProductBFloat16Acc(@NativeType("VkBool32") boolean value) { nshaderMixedFloatDotProductBFloat16Acc(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderMixedFloatDotProductFloat8AccFloat32} field. */
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE shaderMixedFloatDotProductFloat8AccFloat32(@NativeType("VkBool32") boolean value) { nshaderMixedFloatDotProductFloat8AccFloat32(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE set(
        int sType,
        long pNext,
        boolean shaderMixedFloatDotProductFloat16AccFloat32,
        boolean shaderMixedFloatDotProductFloat16AccFloat16,
        boolean shaderMixedFloatDotProductBFloat16Acc,
        boolean shaderMixedFloatDotProductFloat8AccFloat32
    ) {
        sType(sType);
        pNext(pNext);
        shaderMixedFloatDotProductFloat16AccFloat32(shaderMixedFloatDotProductFloat16AccFloat32);
        shaderMixedFloatDotProductFloat16AccFloat16(shaderMixedFloatDotProductFloat16AccFloat16);
        shaderMixedFloatDotProductBFloat16Acc(shaderMixedFloatDotProductBFloat16Acc);
        shaderMixedFloatDotProductFloat8AccFloat32(shaderMixedFloatDotProductFloat8AccFloat32);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE set(VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE malloc() {
        return new VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE calloc() {
        return new VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE create(long address) {
        return new VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.PNEXT); }
    /** Unsafe version of {@link #shaderMixedFloatDotProductFloat16AccFloat32}. */
    public static int nshaderMixedFloatDotProductFloat16AccFloat32(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.SHADERMIXEDFLOATDOTPRODUCTFLOAT16ACCFLOAT32); }
    /** Unsafe version of {@link #shaderMixedFloatDotProductFloat16AccFloat16}. */
    public static int nshaderMixedFloatDotProductFloat16AccFloat16(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.SHADERMIXEDFLOATDOTPRODUCTFLOAT16ACCFLOAT16); }
    /** Unsafe version of {@link #shaderMixedFloatDotProductBFloat16Acc}. */
    public static int nshaderMixedFloatDotProductBFloat16Acc(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.SHADERMIXEDFLOATDOTPRODUCTBFLOAT16ACC); }
    /** Unsafe version of {@link #shaderMixedFloatDotProductFloat8AccFloat32}. */
    public static int nshaderMixedFloatDotProductFloat8AccFloat32(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.SHADERMIXEDFLOATDOTPRODUCTFLOAT8ACCFLOAT32); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.PNEXT, value); }
    /** Unsafe version of {@link #shaderMixedFloatDotProductFloat16AccFloat32(boolean) shaderMixedFloatDotProductFloat16AccFloat32}. */
    public static void nshaderMixedFloatDotProductFloat16AccFloat32(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.SHADERMIXEDFLOATDOTPRODUCTFLOAT16ACCFLOAT32, value); }
    /** Unsafe version of {@link #shaderMixedFloatDotProductFloat16AccFloat16(boolean) shaderMixedFloatDotProductFloat16AccFloat16}. */
    public static void nshaderMixedFloatDotProductFloat16AccFloat16(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.SHADERMIXEDFLOATDOTPRODUCTFLOAT16ACCFLOAT16, value); }
    /** Unsafe version of {@link #shaderMixedFloatDotProductBFloat16Acc(boolean) shaderMixedFloatDotProductBFloat16Acc}. */
    public static void nshaderMixedFloatDotProductBFloat16Acc(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.SHADERMIXEDFLOATDOTPRODUCTBFLOAT16ACC, value); }
    /** Unsafe version of {@link #shaderMixedFloatDotProductFloat8AccFloat32(boolean) shaderMixedFloatDotProductFloat8AccFloat32}. */
    public static void nshaderMixedFloatDotProductFloat8AccFloat32(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.SHADERMIXEDFLOATDOTPRODUCTFLOAT8ACCFLOAT32, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE ELEMENT_FACTORY = VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.npNext(address()); }
        /** @return the value of the {@code shaderMixedFloatDotProductFloat16AccFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderMixedFloatDotProductFloat16AccFloat32() { return VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.nshaderMixedFloatDotProductFloat16AccFloat32(address()) != 0; }
        /** @return the value of the {@code shaderMixedFloatDotProductFloat16AccFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderMixedFloatDotProductFloat16AccFloat16() { return VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.nshaderMixedFloatDotProductFloat16AccFloat16(address()) != 0; }
        /** @return the value of the {@code shaderMixedFloatDotProductBFloat16Acc} field. */
        @NativeType("VkBool32")
        public boolean shaderMixedFloatDotProductBFloat16Acc() { return VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.nshaderMixedFloatDotProductBFloat16Acc(address()) != 0; }
        /** @return the value of the {@code shaderMixedFloatDotProductFloat8AccFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderMixedFloatDotProductFloat8AccFloat32() { return VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.nshaderMixedFloatDotProductFloat8AccFloat32(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.nsType(address(), value); return this; }
        /** Sets the {@link VALVEShaderMixedFloatDotProduct#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MIXED_FLOAT_DOT_PRODUCT_FEATURES_VALVE STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MIXED_FLOAT_DOT_PRODUCT_FEATURES_VALVE} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer sType$Default() { return sType(VALVEShaderMixedFloatDotProduct.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MIXED_FLOAT_DOT_PRODUCT_FEATURES_VALVE); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderMixedFloatDotProductFloat16AccFloat32} field. */
        public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer shaderMixedFloatDotProductFloat16AccFloat32(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.nshaderMixedFloatDotProductFloat16AccFloat32(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderMixedFloatDotProductFloat16AccFloat16} field. */
        public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer shaderMixedFloatDotProductFloat16AccFloat16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.nshaderMixedFloatDotProductFloat16AccFloat16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderMixedFloatDotProductBFloat16Acc} field. */
        public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer shaderMixedFloatDotProductBFloat16Acc(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.nshaderMixedFloatDotProductBFloat16Acc(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderMixedFloatDotProductFloat8AccFloat32} field. */
        public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.Buffer shaderMixedFloatDotProductFloat8AccFloat32(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE.nshaderMixedFloatDotProductFloat8AccFloat32(address(), value ? 1 : 0); return this; }

    }

}