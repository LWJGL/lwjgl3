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
 * struct VkPhysicalDeviceExtendedDynamicStateFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 extendedDynamicState;
 * }}</pre>
 */
public class VkPhysicalDeviceExtendedDynamicStateFeaturesEXT extends Struct<VkPhysicalDeviceExtendedDynamicStateFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXTENDEDDYNAMICSTATE;

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
        EXTENDEDDYNAMICSTATE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceExtendedDynamicStateFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code extendedDynamicState} field. */
    @NativeType("VkBool32")
    public boolean extendedDynamicState() { return nextendedDynamicState(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTExtendedDynamicState#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT sType$Default() { return sType(EXTExtendedDynamicState.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code extendedDynamicState} field. */
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT extendedDynamicState(@NativeType("VkBool32") boolean value) { nextendedDynamicState(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT set(
        int sType,
        long pNext,
        boolean extendedDynamicState
    ) {
        sType(sType);
        pNext(pNext);
        extendedDynamicState(extendedDynamicState);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT set(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT malloc() {
        return new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT calloc() {
        return new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT create(long address) {
        return new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceExtendedDynamicStateFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #extendedDynamicState}. */
    public static int nextendedDynamicState(long struct) { return memGetInt(struct + VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.EXTENDEDDYNAMICSTATE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #extendedDynamicState(boolean) extendedDynamicState}. */
    public static void nextendedDynamicState(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.EXTENDEDDYNAMICSTATE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExtendedDynamicStateFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceExtendedDynamicStateFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceExtendedDynamicStateFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code extendedDynamicState} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState() { return VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.nextendedDynamicState(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTExtendedDynamicState#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer sType$Default() { return sType(EXTExtendedDynamicState.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code extendedDynamicState} field. */
        public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.Buffer extendedDynamicState(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.nextendedDynamicState(address(), value ? 1 : 0); return this; }

    }

}