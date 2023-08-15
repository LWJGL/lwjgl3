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
 * Structure describing the device-generated compute features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDeviceGeneratedCommandsCompute#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #deviceGeneratedCompute};
 *     VkBool32 {@link #deviceGeneratedComputePipelines};
 *     VkBool32 {@link #deviceGeneratedComputeCaptureReplay};
 * }</code></pre>
 */
public class VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV extends Struct<VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEGENERATEDCOMPUTE,
        DEVICEGENERATEDCOMPUTEPIPELINES,
        DEVICEGENERATEDCOMPUTECAPTUREREPLAY;

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
        DEVICEGENERATEDCOMPUTE = layout.offsetof(2);
        DEVICEGENERATEDCOMPUTEPIPELINES = layout.offsetof(3);
        DEVICEGENERATEDCOMPUTECAPTUREREPLAY = layout.offsetof(4);
    }

    protected VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the implementation supports functionality to generate dispatch commands and push constants for the compute pipeline on the device. See <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#device-generated-commands">Device-Generated Commands</a>. */
    @NativeType("VkBool32")
    public boolean deviceGeneratedCompute() { return ndeviceGeneratedCompute(address()) != 0; }
    /** indicates whether the implementation supports functionality to generate commands to bind compute pipelines on the device. See <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#device-generated-commands">Device-Generated Commands</a>. */
    @NativeType("VkBool32")
    public boolean deviceGeneratedComputePipelines() { return ndeviceGeneratedComputePipelines(address()) != 0; }
    /** indicates whether the implementation supports functionality to capture compute pipeline address and reuse later for replay in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#device-generated-commands">Device-Generated Commands</a>. */
    @NativeType("VkBool32")
    public boolean deviceGeneratedComputeCaptureReplay() { return ndeviceGeneratedComputeCaptureReplay(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceGeneratedCommandsCompute#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV sType$Default() { return sType(NVDeviceGeneratedCommandsCompute.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #deviceGeneratedCompute} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedCompute(@NativeType("VkBool32") boolean value) { ndeviceGeneratedCompute(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #deviceGeneratedComputePipelines} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedComputePipelines(@NativeType("VkBool32") boolean value) { ndeviceGeneratedComputePipelines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #deviceGeneratedComputeCaptureReplay} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedComputeCaptureReplay(@NativeType("VkBool32") boolean value) { ndeviceGeneratedComputeCaptureReplay(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV set(
        int sType,
        long pNext,
        boolean deviceGeneratedCompute,
        boolean deviceGeneratedComputePipelines,
        boolean deviceGeneratedComputeCaptureReplay
    ) {
        sType(sType);
        pNext(pNext);
        deviceGeneratedCompute(deviceGeneratedCompute);
        deviceGeneratedComputePipelines(deviceGeneratedComputePipelines);
        deviceGeneratedComputeCaptureReplay(deviceGeneratedComputeCaptureReplay);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV set(VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV malloc() {
        return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV calloc() {
        return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV create(long address) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #deviceGeneratedCompute}. */
    public static int ndeviceGeneratedCompute(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.DEVICEGENERATEDCOMPUTE); }
    /** Unsafe version of {@link #deviceGeneratedComputePipelines}. */
    public static int ndeviceGeneratedComputePipelines(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.DEVICEGENERATEDCOMPUTEPIPELINES); }
    /** Unsafe version of {@link #deviceGeneratedComputeCaptureReplay}. */
    public static int ndeviceGeneratedComputeCaptureReplay(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.DEVICEGENERATEDCOMPUTECAPTUREREPLAY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #deviceGeneratedCompute(boolean) deviceGeneratedCompute}. */
    public static void ndeviceGeneratedCompute(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.DEVICEGENERATEDCOMPUTE, value); }
    /** Unsafe version of {@link #deviceGeneratedComputePipelines(boolean) deviceGeneratedComputePipelines}. */
    public static void ndeviceGeneratedComputePipelines(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.DEVICEGENERATEDCOMPUTEPIPELINES, value); }
    /** Unsafe version of {@link #deviceGeneratedComputeCaptureReplay(boolean) deviceGeneratedComputeCaptureReplay}. */
    public static void ndeviceGeneratedComputeCaptureReplay(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.DEVICEGENERATEDCOMPUTECAPTUREREPLAY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV#deviceGeneratedCompute} field. */
        @NativeType("VkBool32")
        public boolean deviceGeneratedCompute() { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.ndeviceGeneratedCompute(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV#deviceGeneratedComputePipelines} field. */
        @NativeType("VkBool32")
        public boolean deviceGeneratedComputePipelines() { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.ndeviceGeneratedComputePipelines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV#deviceGeneratedComputeCaptureReplay} field. */
        @NativeType("VkBool32")
        public boolean deviceGeneratedComputeCaptureReplay() { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.ndeviceGeneratedComputeCaptureReplay(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV#sType} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceGeneratedCommandsCompute#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV} value to the {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV#sType} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer sType$Default() { return sType(NVDeviceGeneratedCommandsCompute.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV#pNext} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV#deviceGeneratedCompute} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer deviceGeneratedCompute(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.ndeviceGeneratedCompute(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV#deviceGeneratedComputePipelines} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer deviceGeneratedComputePipelines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.ndeviceGeneratedComputePipelines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV#deviceGeneratedComputeCaptureReplay} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer deviceGeneratedComputeCaptureReplay(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.ndeviceGeneratedComputeCaptureReplay(address(), value ? 1 : 0); return this; }

    }

}