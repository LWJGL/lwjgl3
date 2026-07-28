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
 * struct VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderMultipleWaitQueues;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM extends Struct<VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERMULTIPLEWAITQUEUES;

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
        SHADERMULTIPLEWAITQUEUES = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code shaderMultipleWaitQueues} field. */
    @NativeType("VkBool32")
    public boolean shaderMultipleWaitQueues() { return nshaderMultipleWaitQueues(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMShaderMultipleWaitQueues#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MULTIPLE_WAIT_QUEUES_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MULTIPLE_WAIT_QUEUES_FEATURES_QCOM} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM sType$Default() { return sType(QCOMShaderMultipleWaitQueues.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MULTIPLE_WAIT_QUEUES_FEATURES_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderMultipleWaitQueues} field. */
    public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM shaderMultipleWaitQueues(@NativeType("VkBool32") boolean value) { nshaderMultipleWaitQueues(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM set(
        int sType,
        long pNext,
        boolean shaderMultipleWaitQueues
    ) {
        sType(sType);
        pNext(pNext);
        shaderMultipleWaitQueues(shaderMultipleWaitQueues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM set(VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM malloc() {
        return new VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM calloc() {
        return new VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.PNEXT); }
    /** Unsafe version of {@link #shaderMultipleWaitQueues}. */
    public static int nshaderMultipleWaitQueues(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.SHADERMULTIPLEWAITQUEUES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #shaderMultipleWaitQueues(boolean) shaderMultipleWaitQueues}. */
    public static void nshaderMultipleWaitQueues(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.SHADERMULTIPLEWAITQUEUES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.npNext(address()); }
        /** @return the value of the {@code shaderMultipleWaitQueues} field. */
        @NativeType("VkBool32")
        public boolean shaderMultipleWaitQueues() { return VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.nshaderMultipleWaitQueues(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMShaderMultipleWaitQueues#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MULTIPLE_WAIT_QUEUES_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MULTIPLE_WAIT_QUEUES_FEATURES_QCOM} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.Buffer sType$Default() { return sType(QCOMShaderMultipleWaitQueues.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MULTIPLE_WAIT_QUEUES_FEATURES_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderMultipleWaitQueues} field. */
        public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.Buffer shaderMultipleWaitQueues(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM.nshaderMultipleWaitQueues(address(), value ? 1 : 0); return this; }

    }

}