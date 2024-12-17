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
 * struct VkPhysicalDeviceCommandBufferInheritanceFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 commandBufferInheritance;
 * }}</pre>
 */
public class VkPhysicalDeviceCommandBufferInheritanceFeaturesNV extends Struct<VkPhysicalDeviceCommandBufferInheritanceFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMMANDBUFFERINHERITANCE;

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
        COMMANDBUFFERINHERITANCE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCommandBufferInheritanceFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCommandBufferInheritanceFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(ByteBuffer container) {
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
    /** @return the value of the {@code commandBufferInheritance} field. */
    @NativeType("VkBool32")
    public boolean commandBufferInheritance() { return ncommandBufferInheritance(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCommandBufferInheritance#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMMAND_BUFFER_INHERITANCE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COMMAND_BUFFER_INHERITANCE_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV sType$Default() { return sType(NVCommandBufferInheritance.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMMAND_BUFFER_INHERITANCE_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code commandBufferInheritance} field. */
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV commandBufferInheritance(@NativeType("VkBool32") boolean value) { ncommandBufferInheritance(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV set(
        int sType,
        long pNext,
        boolean commandBufferInheritance
    ) {
        sType(sType);
        pNext(pNext);
        commandBufferInheritance(commandBufferInheritance);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV set(VkPhysicalDeviceCommandBufferInheritanceFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCommandBufferInheritanceFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV malloc() {
        return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCommandBufferInheritanceFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV calloc() {
        return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCommandBufferInheritanceFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCommandBufferInheritanceFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV create(long address) {
        return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCommandBufferInheritanceFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCommandBufferInheritanceFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCommandBufferInheritanceFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #commandBufferInheritance}. */
    public static int ncommandBufferInheritance(long struct) { return memGetInt(struct + VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.COMMANDBUFFERINHERITANCE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #commandBufferInheritance(boolean) commandBufferInheritance}. */
    public static void ncommandBufferInheritance(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.COMMANDBUFFERINHERITANCE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCommandBufferInheritanceFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCommandBufferInheritanceFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCommandBufferInheritanceFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCommandBufferInheritanceFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCommandBufferInheritanceFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.npNext(address()); }
        /** @return the value of the {@code commandBufferInheritance} field. */
        @NativeType("VkBool32")
        public boolean commandBufferInheritance() { return VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.ncommandBufferInheritance(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCommandBufferInheritance#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMMAND_BUFFER_INHERITANCE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COMMAND_BUFFER_INHERITANCE_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.Buffer sType$Default() { return sType(NVCommandBufferInheritance.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMMAND_BUFFER_INHERITANCE_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code commandBufferInheritance} field. */
        public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.Buffer commandBufferInheritance(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.ncommandBufferInheritance(address(), value ? 1 : 0); return this; }

    }

}