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
 * struct VkPhysicalDeviceExtendedDynamicState2FeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 extendedDynamicState2;
 *     VkBool32 extendedDynamicState2LogicOp;
 *     VkBool32 extendedDynamicState2PatchControlPoints;
 * }}</pre>
 */
public class VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extends Struct<VkPhysicalDeviceExtendedDynamicState2FeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXTENDEDDYNAMICSTATE2,
        EXTENDEDDYNAMICSTATE2LOGICOP,
        EXTENDEDDYNAMICSTATE2PATCHCONTROLPOINTS;

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
        EXTENDEDDYNAMICSTATE2 = layout.offsetof(2);
        EXTENDEDDYNAMICSTATE2LOGICOP = layout.offsetof(3);
        EXTENDEDDYNAMICSTATE2PATCHCONTROLPOINTS = layout.offsetof(4);
    }

    protected VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceExtendedDynamicState2FeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code extendedDynamicState2} field. */
    @NativeType("VkBool32")
    public boolean extendedDynamicState2() { return nextendedDynamicState2(address()) != 0; }
    /** @return the value of the {@code extendedDynamicState2LogicOp} field. */
    @NativeType("VkBool32")
    public boolean extendedDynamicState2LogicOp() { return nextendedDynamicState2LogicOp(address()) != 0; }
    /** @return the value of the {@code extendedDynamicState2PatchControlPoints} field. */
    @NativeType("VkBool32")
    public boolean extendedDynamicState2PatchControlPoints() { return nextendedDynamicState2PatchControlPoints(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTExtendedDynamicState2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT sType$Default() { return sType(EXTExtendedDynamicState2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code extendedDynamicState2} field. */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2(@NativeType("VkBool32") boolean value) { nextendedDynamicState2(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code extendedDynamicState2LogicOp} field. */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2LogicOp(@NativeType("VkBool32") boolean value) { nextendedDynamicState2LogicOp(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code extendedDynamicState2PatchControlPoints} field. */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2PatchControlPoints(@NativeType("VkBool32") boolean value) { nextendedDynamicState2PatchControlPoints(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT set(
        int sType,
        long pNext,
        boolean extendedDynamicState2,
        boolean extendedDynamicState2LogicOp,
        boolean extendedDynamicState2PatchControlPoints
    ) {
        sType(sType);
        pNext(pNext);
        extendedDynamicState2(extendedDynamicState2);
        extendedDynamicState2LogicOp(extendedDynamicState2LogicOp);
        extendedDynamicState2PatchControlPoints(extendedDynamicState2PatchControlPoints);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT set(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT malloc() {
        return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT calloc() {
        return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT create(long address) {
        return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceExtendedDynamicState2FeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #extendedDynamicState2}. */
    public static int nextendedDynamicState2(long struct) { return memGetInt(struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.EXTENDEDDYNAMICSTATE2); }
    /** Unsafe version of {@link #extendedDynamicState2LogicOp}. */
    public static int nextendedDynamicState2LogicOp(long struct) { return memGetInt(struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.EXTENDEDDYNAMICSTATE2LOGICOP); }
    /** Unsafe version of {@link #extendedDynamicState2PatchControlPoints}. */
    public static int nextendedDynamicState2PatchControlPoints(long struct) { return memGetInt(struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.EXTENDEDDYNAMICSTATE2PATCHCONTROLPOINTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #extendedDynamicState2(boolean) extendedDynamicState2}. */
    public static void nextendedDynamicState2(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.EXTENDEDDYNAMICSTATE2, value); }
    /** Unsafe version of {@link #extendedDynamicState2LogicOp(boolean) extendedDynamicState2LogicOp}. */
    public static void nextendedDynamicState2LogicOp(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.EXTENDEDDYNAMICSTATE2LOGICOP, value); }
    /** Unsafe version of {@link #extendedDynamicState2PatchControlPoints(boolean) extendedDynamicState2PatchControlPoints}. */
    public static void nextendedDynamicState2PatchControlPoints(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.EXTENDEDDYNAMICSTATE2PATCHCONTROLPOINTS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExtendedDynamicState2FeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceExtendedDynamicState2FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceExtendedDynamicState2FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.npNext(address()); }
        /** @return the value of the {@code extendedDynamicState2} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState2() { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2(address()) != 0; }
        /** @return the value of the {@code extendedDynamicState2LogicOp} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState2LogicOp() { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2LogicOp(address()) != 0; }
        /** @return the value of the {@code extendedDynamicState2PatchControlPoints} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState2PatchControlPoints() { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2PatchControlPoints(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTExtendedDynamicState2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer sType$Default() { return sType(EXTExtendedDynamicState2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code extendedDynamicState2} field. */
        public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer extendedDynamicState2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code extendedDynamicState2LogicOp} field. */
        public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer extendedDynamicState2LogicOp(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2LogicOp(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code extendedDynamicState2PatchControlPoints} field. */
        public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer extendedDynamicState2PatchControlPoints(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2PatchControlPoints(address(), value ? 1 : 0); return this; }

    }

}