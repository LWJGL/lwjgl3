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
 * struct VkPhysicalDeviceShaderFmaFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderFmaFloat16;
 *     VkBool32 shaderFmaFloat32;
 *     VkBool32 shaderFmaFloat64;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderFmaFeaturesKHR extends Struct<VkPhysicalDeviceShaderFmaFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERFMAFLOAT16,
        SHADERFMAFLOAT32,
        SHADERFMAFLOAT64;

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
        SHADERFMAFLOAT16 = layout.offsetof(2);
        SHADERFMAFLOAT32 = layout.offsetof(3);
        SHADERFMAFLOAT64 = layout.offsetof(4);
    }

    protected VkPhysicalDeviceShaderFmaFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderFmaFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderFmaFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderFmaFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderFmaFeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code shaderFmaFloat16} field. */
    @NativeType("VkBool32")
    public boolean shaderFmaFloat16() { return nshaderFmaFloat16(address()) != 0; }
    /** @return the value of the {@code shaderFmaFloat32} field. */
    @NativeType("VkBool32")
    public boolean shaderFmaFloat32() { return nshaderFmaFloat32(address()) != 0; }
    /** @return the value of the {@code shaderFmaFloat64} field. */
    @NativeType("VkBool32")
    public boolean shaderFmaFloat64() { return nshaderFmaFloat64(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderFmaFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRShaderFma#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FMA_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FMA_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderFmaFeaturesKHR sType$Default() { return sType(KHRShaderFma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FMA_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderFmaFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderFmaFloat16} field. */
    public VkPhysicalDeviceShaderFmaFeaturesKHR shaderFmaFloat16(@NativeType("VkBool32") boolean value) { nshaderFmaFloat16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderFmaFloat32} field. */
    public VkPhysicalDeviceShaderFmaFeaturesKHR shaderFmaFloat32(@NativeType("VkBool32") boolean value) { nshaderFmaFloat32(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderFmaFloat64} field. */
    public VkPhysicalDeviceShaderFmaFeaturesKHR shaderFmaFloat64(@NativeType("VkBool32") boolean value) { nshaderFmaFloat64(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderFmaFeaturesKHR set(
        int sType,
        long pNext,
        boolean shaderFmaFloat16,
        boolean shaderFmaFloat32,
        boolean shaderFmaFloat64
    ) {
        sType(sType);
        pNext(pNext);
        shaderFmaFloat16(shaderFmaFloat16);
        shaderFmaFloat32(shaderFmaFloat32);
        shaderFmaFloat64(shaderFmaFloat64);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderFmaFeaturesKHR set(VkPhysicalDeviceShaderFmaFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderFmaFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderFmaFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderFmaFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderFmaFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderFmaFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderFmaFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderFmaFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderFmaFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderFmaFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderFmaFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderFmaFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderFmaFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderFmaFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderFmaFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderFmaFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderFmaFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderFmaFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFmaFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderFmaFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderFmaFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFmaFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderFmaFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderFmaFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #shaderFmaFloat16}. */
    public static int nshaderFmaFloat16(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderFmaFeaturesKHR.SHADERFMAFLOAT16); }
    /** Unsafe version of {@link #shaderFmaFloat32}. */
    public static int nshaderFmaFloat32(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderFmaFeaturesKHR.SHADERFMAFLOAT32); }
    /** Unsafe version of {@link #shaderFmaFloat64}. */
    public static int nshaderFmaFloat64(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderFmaFeaturesKHR.SHADERFMAFLOAT64); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderFmaFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderFmaFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #shaderFmaFloat16(boolean) shaderFmaFloat16}. */
    public static void nshaderFmaFloat16(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderFmaFeaturesKHR.SHADERFMAFLOAT16, value); }
    /** Unsafe version of {@link #shaderFmaFloat32(boolean) shaderFmaFloat32}. */
    public static void nshaderFmaFloat32(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderFmaFeaturesKHR.SHADERFMAFLOAT32, value); }
    /** Unsafe version of {@link #shaderFmaFloat64(boolean) shaderFmaFloat64}. */
    public static void nshaderFmaFloat64(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderFmaFeaturesKHR.SHADERFMAFLOAT64, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderFmaFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderFmaFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderFmaFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderFmaFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderFmaFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderFmaFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderFmaFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderFmaFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code shaderFmaFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderFmaFloat16() { return VkPhysicalDeviceShaderFmaFeaturesKHR.nshaderFmaFloat16(address()) != 0; }
        /** @return the value of the {@code shaderFmaFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderFmaFloat32() { return VkPhysicalDeviceShaderFmaFeaturesKHR.nshaderFmaFloat32(address()) != 0; }
        /** @return the value of the {@code shaderFmaFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderFmaFloat64() { return VkPhysicalDeviceShaderFmaFeaturesKHR.nshaderFmaFloat64(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderFmaFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRShaderFma#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FMA_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FMA_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer sType$Default() { return sType(KHRShaderFma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FMA_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderFmaFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderFmaFloat16} field. */
        public VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer shaderFmaFloat16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderFmaFeaturesKHR.nshaderFmaFloat16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderFmaFloat32} field. */
        public VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer shaderFmaFloat32(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderFmaFeaturesKHR.nshaderFmaFloat32(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderFmaFloat64} field. */
        public VkPhysicalDeviceShaderFmaFeaturesKHR.Buffer shaderFmaFloat64(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderFmaFeaturesKHR.nshaderFmaFloat64(address(), value ? 1 : 0); return this; }

    }

}