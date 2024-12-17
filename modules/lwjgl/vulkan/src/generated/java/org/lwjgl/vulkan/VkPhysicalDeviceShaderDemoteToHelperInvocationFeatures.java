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
 * struct VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderDemoteToHelperInvocation;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures extends Struct<VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures> implements NativeResource {

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

    protected VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code shaderDemoteToHelperInvocation} field. */
    @NativeType("VkBool32")
    public boolean shaderDemoteToHelperInvocation() { return nshaderDemoteToHelperInvocation(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderDemoteToHelperInvocation} field. */
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
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures calloc() {
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures create(long address) {
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.PNEXT); }
    /** Unsafe version of {@link #shaderDemoteToHelperInvocation}. */
    public static int nshaderDemoteToHelperInvocation(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.SHADERDEMOTETOHELPERINVOCATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.PNEXT, value); }
    /** Unsafe version of {@link #shaderDemoteToHelperInvocation(boolean) shaderDemoteToHelperInvocation}. */
    public static void nshaderDemoteToHelperInvocation(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.SHADERDEMOTETOHELPERINVOCATION, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures ELEMENT_FACTORY = VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.npNext(address()); }
        /** @return the value of the {@code shaderDemoteToHelperInvocation} field. */
        @NativeType("VkBool32")
        public boolean shaderDemoteToHelperInvocation() { return VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.nshaderDemoteToHelperInvocation(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderDemoteToHelperInvocation} field. */
        public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.Buffer shaderDemoteToHelperInvocation(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures.nshaderDemoteToHelperInvocation(address(), value ? 1 : 0); return this; }

    }

}