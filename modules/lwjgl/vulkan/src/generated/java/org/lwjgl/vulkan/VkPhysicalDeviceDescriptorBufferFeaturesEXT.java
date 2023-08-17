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
 * Structure describing the descriptor buffer features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDescriptorBufferFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #descriptorBuffer};
 *     VkBool32 {@link #descriptorBufferCaptureReplay};
 *     VkBool32 {@link #descriptorBufferImageLayoutIgnored};
 *     VkBool32 {@link #descriptorBufferPushDescriptors};
 * }</code></pre>
 */
public class VkPhysicalDeviceDescriptorBufferFeaturesEXT extends Struct<VkPhysicalDeviceDescriptorBufferFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DESCRIPTORBUFFER,
        DESCRIPTORBUFFERCAPTUREREPLAY,
        DESCRIPTORBUFFERIMAGELAYOUTIGNORED,
        DESCRIPTORBUFFERPUSHDESCRIPTORS;

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
        DESCRIPTORBUFFER = layout.offsetof(2);
        DESCRIPTORBUFFERCAPTUREREPLAY = layout.offsetof(3);
        DESCRIPTORBUFFERIMAGELAYOUTIGNORED = layout.offsetof(4);
        DESCRIPTORBUFFERPUSHDESCRIPTORS = layout.offsetof(5);
    }

    protected VkPhysicalDeviceDescriptorBufferFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDescriptorBufferFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDescriptorBufferFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT(ByteBuffer container) {
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
    /** indicates that the implementation supports putting shader-accessible descriptors directly in memory. */
    @NativeType("VkBool32")
    public boolean descriptorBuffer() { return ndescriptorBuffer(address()) != 0; }
    /** indicates that the implementation supports capture and replay when using descriptor buffers. If this is {@link VK10#VK_TRUE TRUE}, all resources created with {@link EXTDescriptorBuffer#VK_BUFFER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT BUFFER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT}, {@link EXTDescriptorBuffer#VK_IMAGE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT IMAGE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT}, {@link EXTDescriptorBuffer#VK_IMAGE_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT IMAGE_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT}, {@link EXTDescriptorBuffer#VK_SAMPLER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT SAMPLER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT}, or {@link EXTDescriptorBuffer#VK_ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT} <b>must</b> be created before resources of the same types without those flags. */
    @NativeType("VkBool32")
    public boolean descriptorBufferCaptureReplay() { return ndescriptorBufferCaptureReplay(address()) != 0; }
    /** indicates that the implementation will ignore {@code imageLayout} in {@link VkDescriptorImageInfo} when calling {@link EXTDescriptorBuffer#vkGetDescriptorEXT GetDescriptorEXT}. */
    @NativeType("VkBool32")
    public boolean descriptorBufferImageLayoutIgnored() { return ndescriptorBufferImageLayoutIgnored(address()) != 0; }
    /** indicates that the implementation supports using push descriptors with descriptor buffers. */
    @NativeType("VkBool32")
    public boolean descriptorBufferPushDescriptors() { return ndescriptorBufferPushDescriptors(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #descriptorBuffer} field. */
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBuffer(@NativeType("VkBool32") boolean value) { ndescriptorBuffer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBufferCaptureReplay} field. */
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferCaptureReplay(@NativeType("VkBool32") boolean value) { ndescriptorBufferCaptureReplay(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBufferImageLayoutIgnored} field. */
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferImageLayoutIgnored(@NativeType("VkBool32") boolean value) { ndescriptorBufferImageLayoutIgnored(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBufferPushDescriptors} field. */
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferPushDescriptors(@NativeType("VkBool32") boolean value) { ndescriptorBufferPushDescriptors(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT set(
        int sType,
        long pNext,
        boolean descriptorBuffer,
        boolean descriptorBufferCaptureReplay,
        boolean descriptorBufferImageLayoutIgnored,
        boolean descriptorBufferPushDescriptors
    ) {
        sType(sType);
        pNext(pNext);
        descriptorBuffer(descriptorBuffer);
        descriptorBufferCaptureReplay(descriptorBufferCaptureReplay);
        descriptorBufferImageLayoutIgnored(descriptorBufferImageLayoutIgnored);
        descriptorBufferPushDescriptors(descriptorBufferPushDescriptors);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT set(VkPhysicalDeviceDescriptorBufferFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDescriptorBufferFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT malloc() {
        return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorBufferFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT calloc() {
        return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorBufferFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorBufferFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT create(long address) {
        return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDescriptorBufferFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorBufferFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorBufferFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorBufferFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #descriptorBuffer}. */
    public static int ndescriptorBuffer(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorBufferFeaturesEXT.DESCRIPTORBUFFER); }
    /** Unsafe version of {@link #descriptorBufferCaptureReplay}. */
    public static int ndescriptorBufferCaptureReplay(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorBufferFeaturesEXT.DESCRIPTORBUFFERCAPTUREREPLAY); }
    /** Unsafe version of {@link #descriptorBufferImageLayoutIgnored}. */
    public static int ndescriptorBufferImageLayoutIgnored(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorBufferFeaturesEXT.DESCRIPTORBUFFERIMAGELAYOUTIGNORED); }
    /** Unsafe version of {@link #descriptorBufferPushDescriptors}. */
    public static int ndescriptorBufferPushDescriptors(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorBufferFeaturesEXT.DESCRIPTORBUFFERPUSHDESCRIPTORS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorBufferFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDescriptorBufferFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #descriptorBuffer(boolean) descriptorBuffer}. */
    public static void ndescriptorBuffer(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorBufferFeaturesEXT.DESCRIPTORBUFFER, value); }
    /** Unsafe version of {@link #descriptorBufferCaptureReplay(boolean) descriptorBufferCaptureReplay}. */
    public static void ndescriptorBufferCaptureReplay(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorBufferFeaturesEXT.DESCRIPTORBUFFERCAPTUREREPLAY, value); }
    /** Unsafe version of {@link #descriptorBufferImageLayoutIgnored(boolean) descriptorBufferImageLayoutIgnored}. */
    public static void ndescriptorBufferImageLayoutIgnored(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorBufferFeaturesEXT.DESCRIPTORBUFFERIMAGELAYOUTIGNORED, value); }
    /** Unsafe version of {@link #descriptorBufferPushDescriptors(boolean) descriptorBufferPushDescriptors}. */
    public static void ndescriptorBufferPushDescriptors(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorBufferFeaturesEXT.DESCRIPTORBUFFERPUSHDESCRIPTORS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorBufferFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDescriptorBufferFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDescriptorBufferFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDescriptorBufferFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT#descriptorBuffer} field. */
        @NativeType("VkBool32")
        public boolean descriptorBuffer() { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.ndescriptorBuffer(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT#descriptorBufferCaptureReplay} field. */
        @NativeType("VkBool32")
        public boolean descriptorBufferCaptureReplay() { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.ndescriptorBufferCaptureReplay(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT#descriptorBufferImageLayoutIgnored} field. */
        @NativeType("VkBool32")
        public boolean descriptorBufferImageLayoutIgnored() { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.ndescriptorBufferImageLayoutIgnored(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT#descriptorBufferPushDescriptors} field. */
        @NativeType("VkBool32")
        public boolean descriptorBufferPushDescriptors() { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.ndescriptorBufferPushDescriptors(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT#sType} field. */
        public VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT} value to the {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT#sType} field. */
        public VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT#descriptorBuffer} field. */
        public VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer descriptorBuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.ndescriptorBuffer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT#descriptorBufferCaptureReplay} field. */
        public VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer descriptorBufferCaptureReplay(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.ndescriptorBufferCaptureReplay(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT#descriptorBufferImageLayoutIgnored} field. */
        public VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer descriptorBufferImageLayoutIgnored(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.ndescriptorBufferImageLayoutIgnored(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT#descriptorBufferPushDescriptors} field. */
        public VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer descriptorBufferPushDescriptors(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.ndescriptorBufferPushDescriptors(address(), value ? 1 : 0); return this; }

    }

}