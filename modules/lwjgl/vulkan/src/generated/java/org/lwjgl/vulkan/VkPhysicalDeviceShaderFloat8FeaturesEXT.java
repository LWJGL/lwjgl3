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
 * struct VkPhysicalDeviceShaderFloat8FeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderFloat8;
 *     VkBool32 shaderFloat8CooperativeMatrix;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderFloat8FeaturesEXT extends Struct<VkPhysicalDeviceShaderFloat8FeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERFLOAT8,
        SHADERFLOAT8COOPERATIVEMATRIX;

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
        SHADERFLOAT8 = layout.offsetof(2);
        SHADERFLOAT8COOPERATIVEMATRIX = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderFloat8FeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderFloat8FeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderFloat8FeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderFloat8FeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderFloat8FeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code shaderFloat8} field. */
    @NativeType("VkBool32")
    public boolean shaderFloat8() { return nshaderFloat8(address()) != 0; }
    /** @return the value of the {@code shaderFloat8CooperativeMatrix} field. */
    @NativeType("VkBool32")
    public boolean shaderFloat8CooperativeMatrix() { return nshaderFloat8CooperativeMatrix(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderFloat8FeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderFloat8#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT8_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT8_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderFloat8FeaturesEXT sType$Default() { return sType(EXTShaderFloat8.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT8_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderFloat8FeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderFloat8} field. */
    public VkPhysicalDeviceShaderFloat8FeaturesEXT shaderFloat8(@NativeType("VkBool32") boolean value) { nshaderFloat8(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderFloat8CooperativeMatrix} field. */
    public VkPhysicalDeviceShaderFloat8FeaturesEXT shaderFloat8CooperativeMatrix(@NativeType("VkBool32") boolean value) { nshaderFloat8CooperativeMatrix(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderFloat8FeaturesEXT set(
        int sType,
        long pNext,
        boolean shaderFloat8,
        boolean shaderFloat8CooperativeMatrix
    ) {
        sType(sType);
        pNext(pNext);
        shaderFloat8(shaderFloat8);
        shaderFloat8CooperativeMatrix(shaderFloat8CooperativeMatrix);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderFloat8FeaturesEXT set(VkPhysicalDeviceShaderFloat8FeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderFloat8FeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderFloat8FeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderFloat8FeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderFloat8FeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderFloat8FeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderFloat8FeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderFloat8FeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderFloat8FeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderFloat8FeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderFloat8FeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderFloat8FeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFloat8FeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderFloat8FeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFloat8FeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderFloat8FeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderFloat8FeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #shaderFloat8}. */
    public static int nshaderFloat8(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderFloat8FeaturesEXT.SHADERFLOAT8); }
    /** Unsafe version of {@link #shaderFloat8CooperativeMatrix}. */
    public static int nshaderFloat8CooperativeMatrix(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderFloat8FeaturesEXT.SHADERFLOAT8COOPERATIVEMATRIX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderFloat8FeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderFloat8FeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #shaderFloat8(boolean) shaderFloat8}. */
    public static void nshaderFloat8(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderFloat8FeaturesEXT.SHADERFLOAT8, value); }
    /** Unsafe version of {@link #shaderFloat8CooperativeMatrix(boolean) shaderFloat8CooperativeMatrix}. */
    public static void nshaderFloat8CooperativeMatrix(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderFloat8FeaturesEXT.SHADERFLOAT8COOPERATIVEMATRIX, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderFloat8FeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderFloat8FeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderFloat8FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderFloat8FeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderFloat8FeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderFloat8FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderFloat8FeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderFloat8FeaturesEXT.npNext(address()); }
        /** @return the value of the {@code shaderFloat8} field. */
        @NativeType("VkBool32")
        public boolean shaderFloat8() { return VkPhysicalDeviceShaderFloat8FeaturesEXT.nshaderFloat8(address()) != 0; }
        /** @return the value of the {@code shaderFloat8CooperativeMatrix} field. */
        @NativeType("VkBool32")
        public boolean shaderFloat8CooperativeMatrix() { return VkPhysicalDeviceShaderFloat8FeaturesEXT.nshaderFloat8CooperativeMatrix(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderFloat8FeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderFloat8#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT8_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT8_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer sType$Default() { return sType(EXTShaderFloat8.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT8_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderFloat8FeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderFloat8} field. */
        public VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer shaderFloat8(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderFloat8FeaturesEXT.nshaderFloat8(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderFloat8CooperativeMatrix} field. */
        public VkPhysicalDeviceShaderFloat8FeaturesEXT.Buffer shaderFloat8CooperativeMatrix(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderFloat8FeaturesEXT.nshaderFloat8CooperativeMatrix(address(), value ? 1 : 0); return this; }

    }

}