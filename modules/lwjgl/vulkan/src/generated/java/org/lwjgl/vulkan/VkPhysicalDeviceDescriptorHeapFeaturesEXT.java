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
 * struct VkPhysicalDeviceDescriptorHeapFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 descriptorHeap;
 *     VkBool32 descriptorHeapCaptureReplay;
 * }}</pre>
 */
public class VkPhysicalDeviceDescriptorHeapFeaturesEXT extends Struct<VkPhysicalDeviceDescriptorHeapFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DESCRIPTORHEAP,
        DESCRIPTORHEAPCAPTUREREPLAY;

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
        DESCRIPTORHEAP = layout.offsetof(2);
        DESCRIPTORHEAPCAPTUREREPLAY = layout.offsetof(3);
    }

    protected VkPhysicalDeviceDescriptorHeapFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDescriptorHeapFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorHeapFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDescriptorHeapFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDescriptorHeapFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code descriptorHeap} field. */
    @NativeType("VkBool32")
    public boolean descriptorHeap() { return ndescriptorHeap(address()) != 0; }
    /** @return the value of the {@code descriptorHeapCaptureReplay} field. */
    @NativeType("VkBool32")
    public boolean descriptorHeapCaptureReplay() { return ndescriptorHeapCaptureReplay(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDescriptorHeapFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceDescriptorHeapFeaturesEXT sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDescriptorHeapFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorHeap} field. */
    public VkPhysicalDeviceDescriptorHeapFeaturesEXT descriptorHeap(@NativeType("VkBool32") boolean value) { ndescriptorHeap(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorHeapCaptureReplay} field. */
    public VkPhysicalDeviceDescriptorHeapFeaturesEXT descriptorHeapCaptureReplay(@NativeType("VkBool32") boolean value) { ndescriptorHeapCaptureReplay(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDescriptorHeapFeaturesEXT set(
        int sType,
        long pNext,
        boolean descriptorHeap,
        boolean descriptorHeapCaptureReplay
    ) {
        sType(sType);
        pNext(pNext);
        descriptorHeap(descriptorHeap);
        descriptorHeapCaptureReplay(descriptorHeapCaptureReplay);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDescriptorHeapFeaturesEXT set(VkPhysicalDeviceDescriptorHeapFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDescriptorHeapFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT malloc() {
        return new VkPhysicalDeviceDescriptorHeapFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorHeapFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT calloc() {
        return new VkPhysicalDeviceDescriptorHeapFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorHeapFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorHeapFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorHeapFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT create(long address) {
        return new VkPhysicalDeviceDescriptorHeapFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDescriptorHeapFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDescriptorHeapFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorHeapFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorHeapFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorHeapFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorHeapFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorHeapFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorHeapFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #descriptorHeap}. */
    public static int ndescriptorHeap(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorHeapFeaturesEXT.DESCRIPTORHEAP); }
    /** Unsafe version of {@link #descriptorHeapCaptureReplay}. */
    public static int ndescriptorHeapCaptureReplay(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorHeapFeaturesEXT.DESCRIPTORHEAPCAPTUREREPLAY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorHeapFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDescriptorHeapFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #descriptorHeap(boolean) descriptorHeap}. */
    public static void ndescriptorHeap(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorHeapFeaturesEXT.DESCRIPTORHEAP, value); }
    /** Unsafe version of {@link #descriptorHeapCaptureReplay(boolean) descriptorHeapCaptureReplay}. */
    public static void ndescriptorHeapCaptureReplay(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorHeapFeaturesEXT.DESCRIPTORHEAPCAPTUREREPLAY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDescriptorHeapFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorHeapFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDescriptorHeapFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDescriptorHeapFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDescriptorHeapFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDescriptorHeapFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDescriptorHeapFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDescriptorHeapFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code descriptorHeap} field. */
        @NativeType("VkBool32")
        public boolean descriptorHeap() { return VkPhysicalDeviceDescriptorHeapFeaturesEXT.ndescriptorHeap(address()) != 0; }
        /** @return the value of the {@code descriptorHeapCaptureReplay} field. */
        @NativeType("VkBool32")
        public boolean descriptorHeapCaptureReplay() { return VkPhysicalDeviceDescriptorHeapFeaturesEXT.ndescriptorHeapCaptureReplay(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDescriptorHeapFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDescriptorHeapFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorHeap} field. */
        public VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer descriptorHeap(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorHeapFeaturesEXT.ndescriptorHeap(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorHeapCaptureReplay} field. */
        public VkPhysicalDeviceDescriptorHeapFeaturesEXT.Buffer descriptorHeapCaptureReplay(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorHeapFeaturesEXT.ndescriptorHeapCaptureReplay(address(), value ? 1 : 0); return this; }

    }

}