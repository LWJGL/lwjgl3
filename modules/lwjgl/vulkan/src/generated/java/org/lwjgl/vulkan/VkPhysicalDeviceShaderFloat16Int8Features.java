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
 * struct VkPhysicalDeviceShaderFloat16Int8Features {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderFloat16;
 *     VkBool32 shaderInt8;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderFloat16Int8Features extends Struct<VkPhysicalDeviceShaderFloat16Int8Features> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERFLOAT16,
        SHADERINT8;

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
        SHADERFLOAT16 = layout.offsetof(2);
        SHADERINT8 = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderFloat16Int8Features(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderFloat16Int8Features create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderFloat16Int8Features(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderFloat16Int8Features} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderFloat16Int8Features(ByteBuffer container) {
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
    /** @return the value of the {@code shaderFloat16} field. */
    @NativeType("VkBool32")
    public boolean shaderFloat16() { return nshaderFloat16(address()) != 0; }
    /** @return the value of the {@code shaderInt8} field. */
    @NativeType("VkBool32")
    public boolean shaderInt8() { return nshaderInt8(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderFloat16Int8Features sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderFloat16Int8Features sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderFloat16Int8Features pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderFloat16} field. */
    public VkPhysicalDeviceShaderFloat16Int8Features shaderFloat16(@NativeType("VkBool32") boolean value) { nshaderFloat16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderInt8} field. */
    public VkPhysicalDeviceShaderFloat16Int8Features shaderInt8(@NativeType("VkBool32") boolean value) { nshaderInt8(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderFloat16Int8Features set(
        int sType,
        long pNext,
        boolean shaderFloat16,
        boolean shaderInt8
    ) {
        sType(sType);
        pNext(pNext);
        shaderFloat16(shaderFloat16);
        shaderInt8(shaderInt8);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderFloat16Int8Features set(VkPhysicalDeviceShaderFloat16Int8Features src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderFloat16Int8Features} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderFloat16Int8Features malloc() {
        return new VkPhysicalDeviceShaderFloat16Int8Features(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderFloat16Int8Features} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderFloat16Int8Features calloc() {
        return new VkPhysicalDeviceShaderFloat16Int8Features(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderFloat16Int8Features} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderFloat16Int8Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderFloat16Int8Features(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderFloat16Int8Features} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderFloat16Int8Features create(long address) {
        return new VkPhysicalDeviceShaderFloat16Int8Features(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderFloat16Int8Features createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderFloat16Int8Features(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloat16Int8Features.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat16Int8Features.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloat16Int8Features.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat16Int8Features.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloat16Int8Features.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat16Int8Features.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderFloat16Int8Features.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat16Int8Features.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderFloat16Int8Features.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderFloat16Int8Features} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderFloat16Int8Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFloat16Int8Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderFloat16Int8Features} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderFloat16Int8Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFloat16Int8Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloat16Int8Features.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat16Int8Features.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloat16Int8Features.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat16Int8Features.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderFloat16Int8Features.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderFloat16Int8Features.PNEXT); }
    /** Unsafe version of {@link #shaderFloat16}. */
    public static int nshaderFloat16(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderFloat16Int8Features.SHADERFLOAT16); }
    /** Unsafe version of {@link #shaderInt8}. */
    public static int nshaderInt8(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderFloat16Int8Features.SHADERINT8); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderFloat16Int8Features.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderFloat16Int8Features.PNEXT, value); }
    /** Unsafe version of {@link #shaderFloat16(boolean) shaderFloat16}. */
    public static void nshaderFloat16(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderFloat16Int8Features.SHADERFLOAT16, value); }
    /** Unsafe version of {@link #shaderInt8(boolean) shaderInt8}. */
    public static void nshaderInt8(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderFloat16Int8Features.SHADERINT8, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderFloat16Int8Features} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderFloat16Int8Features, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderFloat16Int8Features ELEMENT_FACTORY = VkPhysicalDeviceShaderFloat16Int8Features.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderFloat16Int8Features.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderFloat16Int8Features#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderFloat16Int8Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderFloat16Int8Features.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderFloat16Int8Features.npNext(address()); }
        /** @return the value of the {@code shaderFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderFloat16() { return VkPhysicalDeviceShaderFloat16Int8Features.nshaderFloat16(address()) != 0; }
        /** @return the value of the {@code shaderInt8} field. */
        @NativeType("VkBool32")
        public boolean shaderInt8() { return VkPhysicalDeviceShaderFloat16Int8Features.nshaderInt8(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderFloat16Int8Features.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderFloat16Int8Features.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderFloat16Int8Features.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderFloat16Int8Features.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderFloat16Int8Features.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderFloat16} field. */
        public VkPhysicalDeviceShaderFloat16Int8Features.Buffer shaderFloat16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderFloat16Int8Features.nshaderFloat16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderInt8} field. */
        public VkPhysicalDeviceShaderFloat16Int8Features.Buffer shaderInt8(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderFloat16Int8Features.nshaderInt8(address(), value ? 1 : 0); return this; }

    }

}