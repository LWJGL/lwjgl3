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
 * struct VkPhysicalDeviceRobustness2FeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 robustBufferAccess2;
 *     VkBool32 robustImageAccess2;
 *     VkBool32 nullDescriptor;
 * }}</pre>
 */
public class VkPhysicalDeviceRobustness2FeaturesKHR extends Struct<VkPhysicalDeviceRobustness2FeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ROBUSTBUFFERACCESS2,
        ROBUSTIMAGEACCESS2,
        NULLDESCRIPTOR;

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
        ROBUSTBUFFERACCESS2 = layout.offsetof(2);
        ROBUSTIMAGEACCESS2 = layout.offsetof(3);
        NULLDESCRIPTOR = layout.offsetof(4);
    }

    protected VkPhysicalDeviceRobustness2FeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRobustness2FeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRobustness2FeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRobustness2FeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRobustness2FeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code robustBufferAccess2} field. */
    @NativeType("VkBool32")
    public boolean robustBufferAccess2() { return nrobustBufferAccess2(address()) != 0; }
    /** @return the value of the {@code robustImageAccess2} field. */
    @NativeType("VkBool32")
    public boolean robustImageAccess2() { return nrobustImageAccess2(address()) != 0; }
    /** @return the value of the {@code nullDescriptor} field. */
    @NativeType("VkBool32")
    public boolean nullDescriptor() { return nnullDescriptor(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceRobustness2FeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRRobustness2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceRobustness2FeaturesKHR sType$Default() { return sType(KHRRobustness2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRobustness2FeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code robustBufferAccess2} field. */
    public VkPhysicalDeviceRobustness2FeaturesKHR robustBufferAccess2(@NativeType("VkBool32") boolean value) { nrobustBufferAccess2(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code robustImageAccess2} field. */
    public VkPhysicalDeviceRobustness2FeaturesKHR robustImageAccess2(@NativeType("VkBool32") boolean value) { nrobustImageAccess2(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code nullDescriptor} field. */
    public VkPhysicalDeviceRobustness2FeaturesKHR nullDescriptor(@NativeType("VkBool32") boolean value) { nnullDescriptor(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRobustness2FeaturesKHR set(
        int sType,
        long pNext,
        boolean robustBufferAccess2,
        boolean robustImageAccess2,
        boolean nullDescriptor
    ) {
        sType(sType);
        pNext(pNext);
        robustBufferAccess2(robustBufferAccess2);
        robustImageAccess2(robustImageAccess2);
        nullDescriptor(nullDescriptor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRobustness2FeaturesKHR set(VkPhysicalDeviceRobustness2FeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRobustness2FeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRobustness2FeaturesKHR malloc() {
        return new VkPhysicalDeviceRobustness2FeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRobustness2FeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRobustness2FeaturesKHR calloc() {
        return new VkPhysicalDeviceRobustness2FeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRobustness2FeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRobustness2FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRobustness2FeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRobustness2FeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceRobustness2FeaturesKHR create(long address) {
        return new VkPhysicalDeviceRobustness2FeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceRobustness2FeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRobustness2FeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2FeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2FeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2FeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2FeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRobustness2FeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2FeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceRobustness2FeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRobustness2FeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRobustness2FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRobustness2FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRobustness2FeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRobustness2FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRobustness2FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2FeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2FeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRobustness2FeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRobustness2FeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #robustBufferAccess2}. */
    public static int nrobustBufferAccess2(long struct) { return memGetInt(struct + VkPhysicalDeviceRobustness2FeaturesKHR.ROBUSTBUFFERACCESS2); }
    /** Unsafe version of {@link #robustImageAccess2}. */
    public static int nrobustImageAccess2(long struct) { return memGetInt(struct + VkPhysicalDeviceRobustness2FeaturesKHR.ROBUSTIMAGEACCESS2); }
    /** Unsafe version of {@link #nullDescriptor}. */
    public static int nnullDescriptor(long struct) { return memGetInt(struct + VkPhysicalDeviceRobustness2FeaturesKHR.NULLDESCRIPTOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRobustness2FeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRobustness2FeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #robustBufferAccess2(boolean) robustBufferAccess2}. */
    public static void nrobustBufferAccess2(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRobustness2FeaturesKHR.ROBUSTBUFFERACCESS2, value); }
    /** Unsafe version of {@link #robustImageAccess2(boolean) robustImageAccess2}. */
    public static void nrobustImageAccess2(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRobustness2FeaturesKHR.ROBUSTIMAGEACCESS2, value); }
    /** Unsafe version of {@link #nullDescriptor(boolean) nullDescriptor}. */
    public static void nnullDescriptor(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRobustness2FeaturesKHR.NULLDESCRIPTOR, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRobustness2FeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRobustness2FeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRobustness2FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceRobustness2FeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRobustness2FeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRobustness2FeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRobustness2FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRobustness2FeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRobustness2FeaturesKHR.npNext(address()); }
        /** @return the value of the {@code robustBufferAccess2} field. */
        @NativeType("VkBool32")
        public boolean robustBufferAccess2() { return VkPhysicalDeviceRobustness2FeaturesKHR.nrobustBufferAccess2(address()) != 0; }
        /** @return the value of the {@code robustImageAccess2} field. */
        @NativeType("VkBool32")
        public boolean robustImageAccess2() { return VkPhysicalDeviceRobustness2FeaturesKHR.nrobustImageAccess2(address()) != 0; }
        /** @return the value of the {@code nullDescriptor} field. */
        @NativeType("VkBool32")
        public boolean nullDescriptor() { return VkPhysicalDeviceRobustness2FeaturesKHR.nnullDescriptor(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRobustness2FeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRobustness2FeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRRobustness2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceRobustness2FeaturesKHR.Buffer sType$Default() { return sType(KHRRobustness2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRobustness2FeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRobustness2FeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code robustBufferAccess2} field. */
        public VkPhysicalDeviceRobustness2FeaturesKHR.Buffer robustBufferAccess2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRobustness2FeaturesKHR.nrobustBufferAccess2(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code robustImageAccess2} field. */
        public VkPhysicalDeviceRobustness2FeaturesKHR.Buffer robustImageAccess2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRobustness2FeaturesKHR.nrobustImageAccess2(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code nullDescriptor} field. */
        public VkPhysicalDeviceRobustness2FeaturesKHR.Buffer nullDescriptor(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRobustness2FeaturesKHR.nnullDescriptor(address(), value ? 1 : 0); return this; }

    }

}