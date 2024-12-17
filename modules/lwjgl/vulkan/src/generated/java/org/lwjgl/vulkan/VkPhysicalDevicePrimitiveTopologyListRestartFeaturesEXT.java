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
 * struct VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 primitiveTopologyListRestart;
 *     VkBool32 primitiveTopologyPatchListRestart;
 * }}</pre>
 */
public class VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT extends Struct<VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRIMITIVETOPOLOGYLISTRESTART,
        PRIMITIVETOPOLOGYPATCHLISTRESTART;

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
        PRIMITIVETOPOLOGYLISTRESTART = layout.offsetof(2);
        PRIMITIVETOPOLOGYPATCHLISTRESTART = layout.offsetof(3);
    }

    protected VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code primitiveTopologyListRestart} field. */
    @NativeType("VkBool32")
    public boolean primitiveTopologyListRestart() { return nprimitiveTopologyListRestart(address()) != 0; }
    /** @return the value of the {@code primitiveTopologyPatchListRestart} field. */
    @NativeType("VkBool32")
    public boolean primitiveTopologyPatchListRestart() { return nprimitiveTopologyPatchListRestart(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPrimitiveTopologyListRestart#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVE_TOPOLOGY_LIST_RESTART_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVE_TOPOLOGY_LIST_RESTART_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT sType$Default() { return sType(EXTPrimitiveTopologyListRestart.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVE_TOPOLOGY_LIST_RESTART_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code primitiveTopologyListRestart} field. */
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT primitiveTopologyListRestart(@NativeType("VkBool32") boolean value) { nprimitiveTopologyListRestart(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code primitiveTopologyPatchListRestart} field. */
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT primitiveTopologyPatchListRestart(@NativeType("VkBool32") boolean value) { nprimitiveTopologyPatchListRestart(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT set(
        int sType,
        long pNext,
        boolean primitiveTopologyListRestart,
        boolean primitiveTopologyPatchListRestart
    ) {
        sType(sType);
        pNext(pNext);
        primitiveTopologyListRestart(primitiveTopologyListRestart);
        primitiveTopologyPatchListRestart(primitiveTopologyPatchListRestart);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT set(VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT malloc() {
        return new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT calloc() {
        return new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT create(long address) {
        return new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #primitiveTopologyListRestart}. */
    public static int nprimitiveTopologyListRestart(long struct) { return memGetInt(struct + VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.PRIMITIVETOPOLOGYLISTRESTART); }
    /** Unsafe version of {@link #primitiveTopologyPatchListRestart}. */
    public static int nprimitiveTopologyPatchListRestart(long struct) { return memGetInt(struct + VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.PRIMITIVETOPOLOGYPATCHLISTRESTART); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #primitiveTopologyListRestart(boolean) primitiveTopologyListRestart}. */
    public static void nprimitiveTopologyListRestart(long struct, int value) { memPutInt(struct + VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.PRIMITIVETOPOLOGYLISTRESTART, value); }
    /** Unsafe version of {@link #primitiveTopologyPatchListRestart(boolean) primitiveTopologyPatchListRestart}. */
    public static void nprimitiveTopologyPatchListRestart(long struct, int value) { memPutInt(struct + VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.PRIMITIVETOPOLOGYPATCHLISTRESTART, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code primitiveTopologyListRestart} field. */
        @NativeType("VkBool32")
        public boolean primitiveTopologyListRestart() { return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.nprimitiveTopologyListRestart(address()) != 0; }
        /** @return the value of the {@code primitiveTopologyPatchListRestart} field. */
        @NativeType("VkBool32")
        public boolean primitiveTopologyPatchListRestart() { return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.nprimitiveTopologyPatchListRestart(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPrimitiveTopologyListRestart#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVE_TOPOLOGY_LIST_RESTART_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVE_TOPOLOGY_LIST_RESTART_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer sType$Default() { return sType(EXTPrimitiveTopologyListRestart.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVE_TOPOLOGY_LIST_RESTART_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code primitiveTopologyListRestart} field. */
        public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer primitiveTopologyListRestart(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.nprimitiveTopologyListRestart(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code primitiveTopologyPatchListRestart} field. */
        public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.Buffer primitiveTopologyPatchListRestart(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.nprimitiveTopologyPatchListRestart(address(), value ? 1 : 0); return this; }

    }

}