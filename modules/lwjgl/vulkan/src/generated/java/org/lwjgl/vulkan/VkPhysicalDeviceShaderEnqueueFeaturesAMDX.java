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
 * struct VkPhysicalDeviceShaderEnqueueFeaturesAMDX {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderEnqueue;
 *     VkBool32 shaderMeshEnqueue;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderEnqueueFeaturesAMDX extends Struct<VkPhysicalDeviceShaderEnqueueFeaturesAMDX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERENQUEUE,
        SHADERMESHENQUEUE;

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
        SHADERENQUEUE = layout.offsetof(2);
        SHADERMESHENQUEUE = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderEnqueueFeaturesAMDX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderEnqueueFeaturesAMDX create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderEnqueueFeaturesAMDX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX(ByteBuffer container) {
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
    /** @return the value of the {@code shaderEnqueue} field. */
    @NativeType("VkBool32")
    public boolean shaderEnqueue() { return nshaderEnqueue(address()) != 0; }
    /** @return the value of the {@code shaderMeshEnqueue} field. */
    @NativeType("VkBool32")
    public boolean shaderMeshEnqueue() { return nshaderMeshEnqueue(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX sType$Default() { return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderEnqueue} field. */
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX shaderEnqueue(@NativeType("VkBool32") boolean value) { nshaderEnqueue(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderMeshEnqueue} field. */
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX shaderMeshEnqueue(@NativeType("VkBool32") boolean value) { nshaderMeshEnqueue(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX set(
        int sType,
        long pNext,
        boolean shaderEnqueue,
        boolean shaderMeshEnqueue
    ) {
        sType(sType);
        pNext(pNext);
        shaderEnqueue(shaderEnqueue);
        shaderMeshEnqueue(shaderMeshEnqueue);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX set(VkPhysicalDeviceShaderEnqueueFeaturesAMDX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderEnqueueFeaturesAMDX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX malloc() {
        return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderEnqueueFeaturesAMDX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX calloc() {
        return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderEnqueueFeaturesAMDX} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderEnqueueFeaturesAMDX} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX create(long address) {
        return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderEnqueueFeaturesAMDX createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderEnqueueFeaturesAMDX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderEnqueueFeaturesAMDX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderEnqueueFeaturesAMDX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderEnqueueFeaturesAMDX.PNEXT); }
    /** Unsafe version of {@link #shaderEnqueue}. */
    public static int nshaderEnqueue(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderEnqueueFeaturesAMDX.SHADERENQUEUE); }
    /** Unsafe version of {@link #shaderMeshEnqueue}. */
    public static int nshaderMeshEnqueue(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderEnqueueFeaturesAMDX.SHADERMESHENQUEUE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderEnqueueFeaturesAMDX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderEnqueueFeaturesAMDX.PNEXT, value); }
    /** Unsafe version of {@link #shaderEnqueue(boolean) shaderEnqueue}. */
    public static void nshaderEnqueue(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderEnqueueFeaturesAMDX.SHADERENQUEUE, value); }
    /** Unsafe version of {@link #shaderMeshEnqueue(boolean) shaderMeshEnqueue}. */
    public static void nshaderMeshEnqueue(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderEnqueueFeaturesAMDX.SHADERMESHENQUEUE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderEnqueueFeaturesAMDX} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderEnqueueFeaturesAMDX, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderEnqueueFeaturesAMDX ELEMENT_FACTORY = VkPhysicalDeviceShaderEnqueueFeaturesAMDX.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderEnqueueFeaturesAMDX#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderEnqueueFeaturesAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderEnqueueFeaturesAMDX.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderEnqueueFeaturesAMDX.npNext(address()); }
        /** @return the value of the {@code shaderEnqueue} field. */
        @NativeType("VkBool32")
        public boolean shaderEnqueue() { return VkPhysicalDeviceShaderEnqueueFeaturesAMDX.nshaderEnqueue(address()) != 0; }
        /** @return the value of the {@code shaderMeshEnqueue} field. */
        @NativeType("VkBool32")
        public boolean shaderMeshEnqueue() { return VkPhysicalDeviceShaderEnqueueFeaturesAMDX.nshaderMeshEnqueue(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderEnqueueFeaturesAMDX.nsType(address(), value); return this; }
        /** Sets the {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer sType$Default() { return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderEnqueueFeaturesAMDX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderEnqueue} field. */
        public VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer shaderEnqueue(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderEnqueueFeaturesAMDX.nshaderEnqueue(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderMeshEnqueue} field. */
        public VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer shaderMeshEnqueue(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderEnqueueFeaturesAMDX.nshaderMeshEnqueue(address(), value ? 1 : 0); return this; }

    }

}