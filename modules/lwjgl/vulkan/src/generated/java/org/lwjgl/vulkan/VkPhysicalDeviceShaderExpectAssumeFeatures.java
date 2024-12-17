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
 * struct VkPhysicalDeviceShaderExpectAssumeFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderExpectAssume;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderExpectAssumeFeatures extends Struct<VkPhysicalDeviceShaderExpectAssumeFeatures> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADEREXPECTASSUME;

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
        SHADEREXPECTASSUME = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderExpectAssumeFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderExpectAssumeFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderExpectAssumeFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderExpectAssumeFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderExpectAssumeFeatures(ByteBuffer container) {
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
    /** @return the value of the {@code shaderExpectAssume} field. */
    @NativeType("VkBool32")
    public boolean shaderExpectAssume() { return nshaderExpectAssume(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderExpectAssumeFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderExpectAssumeFeatures sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderExpectAssumeFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderExpectAssume} field. */
    public VkPhysicalDeviceShaderExpectAssumeFeatures shaderExpectAssume(@NativeType("VkBool32") boolean value) { nshaderExpectAssume(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderExpectAssumeFeatures set(
        int sType,
        long pNext,
        boolean shaderExpectAssume
    ) {
        sType(sType);
        pNext(pNext);
        shaderExpectAssume(shaderExpectAssume);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderExpectAssumeFeatures set(VkPhysicalDeviceShaderExpectAssumeFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderExpectAssumeFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderExpectAssumeFeatures malloc() {
        return new VkPhysicalDeviceShaderExpectAssumeFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderExpectAssumeFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderExpectAssumeFeatures calloc() {
        return new VkPhysicalDeviceShaderExpectAssumeFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderExpectAssumeFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderExpectAssumeFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderExpectAssumeFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderExpectAssumeFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderExpectAssumeFeatures create(long address) {
        return new VkPhysicalDeviceShaderExpectAssumeFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderExpectAssumeFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderExpectAssumeFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderExpectAssumeFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderExpectAssumeFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderExpectAssumeFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderExpectAssumeFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderExpectAssumeFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderExpectAssumeFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderExpectAssumeFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderExpectAssumeFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderExpectAssumeFeatures.PNEXT); }
    /** Unsafe version of {@link #shaderExpectAssume}. */
    public static int nshaderExpectAssume(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderExpectAssumeFeatures.SHADEREXPECTASSUME); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderExpectAssumeFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderExpectAssumeFeatures.PNEXT, value); }
    /** Unsafe version of {@link #shaderExpectAssume(boolean) shaderExpectAssume}. */
    public static void nshaderExpectAssume(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderExpectAssumeFeatures.SHADEREXPECTASSUME, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderExpectAssumeFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderExpectAssumeFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderExpectAssumeFeatures ELEMENT_FACTORY = VkPhysicalDeviceShaderExpectAssumeFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderExpectAssumeFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderExpectAssumeFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderExpectAssumeFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderExpectAssumeFeatures.npNext(address()); }
        /** @return the value of the {@code shaderExpectAssume} field. */
        @NativeType("VkBool32")
        public boolean shaderExpectAssume() { return VkPhysicalDeviceShaderExpectAssumeFeatures.nshaderExpectAssume(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderExpectAssumeFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderExpectAssumeFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderExpectAssume} field. */
        public VkPhysicalDeviceShaderExpectAssumeFeatures.Buffer shaderExpectAssume(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderExpectAssumeFeatures.nshaderExpectAssume(address(), value ? 1 : 0); return this; }

    }

}