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
 * struct VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderReplicatedComposites;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT extends Struct<VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERREPLICATEDCOMPOSITES;

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
        SHADERREPLICATEDCOMPOSITES = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code shaderReplicatedComposites} field. */
    @NativeType("VkBool32")
    public boolean shaderReplicatedComposites() { return nshaderReplicatedComposites(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderReplicatedComposites#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_REPLICATED_COMPOSITES_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_REPLICATED_COMPOSITES_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT sType$Default() { return sType(EXTShaderReplicatedComposites.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_REPLICATED_COMPOSITES_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderReplicatedComposites} field. */
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT shaderReplicatedComposites(@NativeType("VkBool32") boolean value) { nshaderReplicatedComposites(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT set(
        int sType,
        long pNext,
        boolean shaderReplicatedComposites
    ) {
        sType(sType);
        pNext(pNext);
        shaderReplicatedComposites(shaderReplicatedComposites);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT set(VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #shaderReplicatedComposites}. */
    public static int nshaderReplicatedComposites(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.SHADERREPLICATEDCOMPOSITES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #shaderReplicatedComposites(boolean) shaderReplicatedComposites}. */
    public static void nshaderReplicatedComposites(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.SHADERREPLICATEDCOMPOSITES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code shaderReplicatedComposites} field. */
        @NativeType("VkBool32")
        public boolean shaderReplicatedComposites() { return VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.nshaderReplicatedComposites(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderReplicatedComposites#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_REPLICATED_COMPOSITES_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_REPLICATED_COMPOSITES_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.Buffer sType$Default() { return sType(EXTShaderReplicatedComposites.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_REPLICATED_COMPOSITES_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderReplicatedComposites} field. */
        public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.Buffer shaderReplicatedComposites(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.nshaderReplicatedComposites(address(), value ? 1 : 0); return this; }

    }

}