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
 * struct VkPhysicalDeviceNestedCommandBufferFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 nestedCommandBuffer;
 *     VkBool32 nestedCommandBufferRendering;
 *     VkBool32 nestedCommandBufferSimultaneousUse;
 * }}</pre>
 */
public class VkPhysicalDeviceNestedCommandBufferFeaturesEXT extends Struct<VkPhysicalDeviceNestedCommandBufferFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NESTEDCOMMANDBUFFER,
        NESTEDCOMMANDBUFFERRENDERING,
        NESTEDCOMMANDBUFFERSIMULTANEOUSUSE;

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
        NESTEDCOMMANDBUFFER = layout.offsetof(2);
        NESTEDCOMMANDBUFFERRENDERING = layout.offsetof(3);
        NESTEDCOMMANDBUFFERSIMULTANEOUSUSE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceNestedCommandBufferFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceNestedCommandBufferFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceNestedCommandBufferFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code nestedCommandBuffer} field. */
    @NativeType("VkBool32")
    public boolean nestedCommandBuffer() { return nnestedCommandBuffer(address()) != 0; }
    /** @return the value of the {@code nestedCommandBufferRendering} field. */
    @NativeType("VkBool32")
    public boolean nestedCommandBufferRendering() { return nnestedCommandBufferRendering(address()) != 0; }
    /** @return the value of the {@code nestedCommandBufferSimultaneousUse} field. */
    @NativeType("VkBool32")
    public boolean nestedCommandBufferSimultaneousUse() { return nnestedCommandBufferSimultaneousUse(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTNestedCommandBuffer#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT sType$Default() { return sType(EXTNestedCommandBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code nestedCommandBuffer} field. */
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBuffer(@NativeType("VkBool32") boolean value) { nnestedCommandBuffer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code nestedCommandBufferRendering} field. */
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBufferRendering(@NativeType("VkBool32") boolean value) { nnestedCommandBufferRendering(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code nestedCommandBufferSimultaneousUse} field. */
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBufferSimultaneousUse(@NativeType("VkBool32") boolean value) { nnestedCommandBufferSimultaneousUse(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT set(
        int sType,
        long pNext,
        boolean nestedCommandBuffer,
        boolean nestedCommandBufferRendering,
        boolean nestedCommandBufferSimultaneousUse
    ) {
        sType(sType);
        pNext(pNext);
        nestedCommandBuffer(nestedCommandBuffer);
        nestedCommandBufferRendering(nestedCommandBufferRendering);
        nestedCommandBufferSimultaneousUse(nestedCommandBufferSimultaneousUse);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT set(VkPhysicalDeviceNestedCommandBufferFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceNestedCommandBufferFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT malloc() {
        return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceNestedCommandBufferFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT calloc() {
        return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceNestedCommandBufferFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceNestedCommandBufferFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT create(long address) {
        return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceNestedCommandBufferFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceNestedCommandBufferFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceNestedCommandBufferFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceNestedCommandBufferFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceNestedCommandBufferFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #nestedCommandBuffer}. */
    public static int nnestedCommandBuffer(long struct) { return memGetInt(struct + VkPhysicalDeviceNestedCommandBufferFeaturesEXT.NESTEDCOMMANDBUFFER); }
    /** Unsafe version of {@link #nestedCommandBufferRendering}. */
    public static int nnestedCommandBufferRendering(long struct) { return memGetInt(struct + VkPhysicalDeviceNestedCommandBufferFeaturesEXT.NESTEDCOMMANDBUFFERRENDERING); }
    /** Unsafe version of {@link #nestedCommandBufferSimultaneousUse}. */
    public static int nnestedCommandBufferSimultaneousUse(long struct) { return memGetInt(struct + VkPhysicalDeviceNestedCommandBufferFeaturesEXT.NESTEDCOMMANDBUFFERSIMULTANEOUSUSE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceNestedCommandBufferFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceNestedCommandBufferFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #nestedCommandBuffer(boolean) nestedCommandBuffer}. */
    public static void nnestedCommandBuffer(long struct, int value) { memPutInt(struct + VkPhysicalDeviceNestedCommandBufferFeaturesEXT.NESTEDCOMMANDBUFFER, value); }
    /** Unsafe version of {@link #nestedCommandBufferRendering(boolean) nestedCommandBufferRendering}. */
    public static void nnestedCommandBufferRendering(long struct, int value) { memPutInt(struct + VkPhysicalDeviceNestedCommandBufferFeaturesEXT.NESTEDCOMMANDBUFFERRENDERING, value); }
    /** Unsafe version of {@link #nestedCommandBufferSimultaneousUse(boolean) nestedCommandBufferSimultaneousUse}. */
    public static void nnestedCommandBufferSimultaneousUse(long struct, int value) { memPutInt(struct + VkPhysicalDeviceNestedCommandBufferFeaturesEXT.NESTEDCOMMANDBUFFERSIMULTANEOUSUSE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceNestedCommandBufferFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceNestedCommandBufferFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceNestedCommandBufferFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceNestedCommandBufferFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceNestedCommandBufferFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceNestedCommandBufferFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code nestedCommandBuffer} field. */
        @NativeType("VkBool32")
        public boolean nestedCommandBuffer() { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.nnestedCommandBuffer(address()) != 0; }
        /** @return the value of the {@code nestedCommandBufferRendering} field. */
        @NativeType("VkBool32")
        public boolean nestedCommandBufferRendering() { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.nnestedCommandBufferRendering(address()) != 0; }
        /** @return the value of the {@code nestedCommandBufferSimultaneousUse} field. */
        @NativeType("VkBool32")
        public boolean nestedCommandBufferSimultaneousUse() { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.nnestedCommandBufferSimultaneousUse(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTNestedCommandBuffer#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer sType$Default() { return sType(EXTNestedCommandBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code nestedCommandBuffer} field. */
        public VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer nestedCommandBuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.nnestedCommandBuffer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code nestedCommandBufferRendering} field. */
        public VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer nestedCommandBufferRendering(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.nnestedCommandBufferRendering(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code nestedCommandBufferSimultaneousUse} field. */
        public VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer nestedCommandBufferSimultaneousUse(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.nnestedCommandBufferSimultaneousUse(address(), value ? 1 : 0); return this; }

    }

}